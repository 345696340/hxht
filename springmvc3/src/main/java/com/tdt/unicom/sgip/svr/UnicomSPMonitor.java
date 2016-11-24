/*     */ package com.tdt.unicom.sgip.svr;
/*     */ 
/*     */ import com.core.sgip.jms.JmsSend;
/*     */ import com.core.sgip.jms.JmsSendReprot;
/*     */ import com.tdt.unicom.domains.Bind;
/*     */ import com.tdt.unicom.domains.BindResp;
/*     */ import com.tdt.unicom.domains.Deliver;
/*     */ import com.tdt.unicom.domains.DeliverResp;
/*     */ import com.tdt.unicom.domains.Report;
/*     */ import com.tdt.unicom.domains.ReportResp;
/*     */ import com.tdt.unicom.domains.SGIPCommand;
/*     */ import com.tdt.unicom.domains.SGIPCommandDefine;
/*     */ import com.tdt.unicom.domains.SGIPHeader;
/*     */ import com.tdt.unicom.domains.Submit;
/*     */ import com.tdt.unicom.domains.UnbindResp;
/*     */ import com.tdt.unicom.domains.UserRpt;
/*     */ import com.tdt.unicom.domains.UserRptResp;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.util.HashMap;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import java.util.concurrent.Executors;
/*     */ import javax.net.ServerSocketFactory;
/*     */ import org.apache.commons.logging.impl.Log4JLogger;
/*     */ 
/*     */ public class UnicomSPMonitor
/*     */ {
/*  28 */   private ServerSocket spsvrSocket = null;
/*  29 */   private static final Log4JLogger log = new Log4JLogger("A1");
/*     */   protected static int spListenPort;
/*     */   protected static String smgLoginUserName;
/*     */   protected static String smgLoginPassword;
/*     */   private Map<String, Submit> savedmap;
/*  36 */   private static final Map<String, SPProduction> TRANSMIT_MAP = new HashMap();
/*  37 */   private static final LinkedList<Thread> THREAD_LSIT = new LinkedList();
/*     */ 
/*  39 */   private ExecutorService exec = Executors.newSingleThreadExecutor();
/*     */ 
/*     */   public UnicomSPMonitor(Map<String, Submit> map) {
/*     */     try {
/*  43 */       this.savedmap = map;
/*  44 */       Class.forName("com.tdt.unicom.sgip.svr.SPProduction");
/*  45 */       this.spsvrSocket = ServerSocketFactory.getDefault().createServerSocket(spListenPort);
/*  46 */       log.info("短消息上行(MO))接收端启动,监听端口:" + spListenPort);
/*     */     } catch (IOException e) {
/*  48 */       log.error("launch local server error!", e);
/*  49 */       throw new ExceptionInInitializerError(e);
/*     */     } catch (ClassNotFoundException e) {
/*  51 */       throw new ExceptionInInitializerError(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void startSvr()
/*     */     throws IOException
/*     */   {
/*     */     while (true)
/*     */     {
/*  60 */       Socket unicomSocket = null;
/*  61 */       unicomSocket = this.spsvrSocket.accept();
/*  62 */       unicomSocket.setSoLinger(true, 0);
/*  63 */       unicomSocket.setTcpNoDelay(true);
/*  64 */       unicomSocket.setTrafficClass(20);
/*  65 */       this.exec.execute(new Handler(unicomSocket));
/*     */     }
/*     */   }
/*     */ 
/*     */   class Handler extends SGIPCommand implements Runnable
/*     */   {
/*  71 */     private Socket socket = null;
/*  72 */     private DataInputStream unicomIn = null;
/*  73 */     private DataOutputStream spout = null;
/*     */ 
/*     */     public Handler(Socket socket) {
/*  76 */       this.socket = socket;
/*  77 */       UnicomSPMonitor.log.info("New connection accepted from " + socket.getInetAddress() + ":" + socket.getPort());
/*     */     }
/*     */ 
/*     */     public void run() {
/*     */       try {
/*  82 */         executeMO();
/*     */       } catch (RuntimeException e) {
/*  84 */         UnicomSPMonitor.log.warn("SMG强制关闭通信链路");
/*     */       } catch (IOException e) {
/*  86 */         UnicomSPMonitor.log.error("IO流异常", e);
/*     */       } finally {
/*     */         try {
/*  89 */           if (this.socket != null) {
/*  90 */             this.spout.close();
/*  91 */             this.unicomIn.close();
/*  92 */             this.socket.close();
/*  93 */             UnicomSPMonitor.log.info("SMG与SP通信结束,链路关闭.\n");
/*     */           }
/*     */         } catch (IOException e) {
/*  96 */           UnicomSPMonitor.log.warn("释放Socket资源时异常", e);
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     private void executeMO()
/*     */       throws IOException
/*     */     {
/* 107 */       boolean isUnbind = false;
/* 108 */       this.unicomIn = new DataInputStream(this.socket.getInputStream());
/* 109 */       this.spout = new DataOutputStream(this.socket.getOutputStream());
/*     */ 
/* 111 */       while ((!isUnbind) && (!this.socket.isInputShutdown())) {
/* 112 */         SGIPCommand command = read(this.unicomIn);
/* 113 */         UnicomSPMonitor.log.info("【" + Thread.currentThread().getName() + "收到SMG " + SGIPCommandDefine.getCommandName(this.header.getCommandId()) + "命令】,{长度=" + command.header.getTotalmsglen() + "序列=" + command.header.getSequenceNumber() + "}");
/* 114 */         switch (Bytes4ToInt(command.header.getCommandId()))
/*     */         {
/*     */         case 1:
/* 117 */           UnicomSPMonitor.log.info("收到SMG ->Bind命令");
/* 118 */           Bind bind = (Bind)command;
/* 119 */           UnicomSPMonitor.log.info("LoginType:" + bind.getLoginType());
/* 120 */           UnicomSPMonitor.log.info("LoginName:" + bind.getLoginName());
/* 121 */           UnicomSPMonitor.log.info("LoginPassword:" + bind.getLoginPassword());
/* 122 */           if (bind.getLoginType() == 1) {
/* 123 */             BindResp bindresp = new BindResp(command.header.getUnicomSN());
/* 124 */             bindresp.setResult((byte)0);
/* 125 */             if ((bind.getLoginName().equals(UnicomSPMonitor.smgLoginUserName)) && (bind.getLoginPassword().equals(UnicomSPMonitor.smgLoginPassword))) {
/* 126 */               UnicomSPMonitor.log.info("SMG登陆SP,验证通过！");
/* 127 */               bindresp.setResult((byte)0);
/*     */             }
/*     */             try
/*     */             {
/* 131 */               bindresp.write(this.spout);
/*     */             } catch (Exception e) {
/* 133 */               UnicomSPMonitor.log.info(e.getMessage());
/*     */             }
/* 135 */             UnicomSPMonitor.log.info("Bind_Resp响应码：" + bindresp.getResult());
/* 136 */           }break;
/*     */         case 2:
/* 141 */           UnicomSPMonitor.log.info("收到SMG ->Unbind命令");
/* 142 */           UnbindResp resp = new UnbindResp(command.header.getUnicomSN());
/* 143 */           resp.write(this.spout);
/* 144 */           isUnbind = true;
/* 145 */           break;
/*     */         case 4:
/* 148 */           UnicomSPMonitor.log.info("收到SMG ->Deliver命令");
/* 149 */           Deliver deliver = (Deliver)command;
/* 150 */           UnicomSPMonitor.log.info("SPNumber:" + deliver.getSPNumber());
/* 151 */           UnicomSPMonitor.log.info("UserNumber:" + deliver.getUserNumber());
/* 152 */           UnicomSPMonitor.log.info("MessageContent:" + deliver.getMessageContent());
/* 153 */           UnicomSPMonitor.log.info("LinkID:" + deliver.getLinkID());
/*     */ 
/* 155 */           DeliverResp deliverresp = new DeliverResp(command.header.getUnicomSN());
/* 156 */           deliverresp.setResult((byte)0);
/* 157 */           deliverresp.write(this.spout);
/*     */ 
/* 159 */           new JmsSend(deliver);
/* 160 */           break;
/*     */         case 5:
/* 163 */           UnicomSPMonitor.log.info("收到SMG ->Report命令");
/* 164 */           Report report = (Report)command;
/* 165 */           UnicomSPMonitor.log.info("ReportType:" + report.getReportType());
/* 166 */           UnicomSPMonitor.log.info("UserNumber:" + report.getUserNumber());
/* 167 */           UnicomSPMonitor.log.info("State:" + report.getState());
/* 168 */           UnicomSPMonitor.log.info("ErrorCode:" + report.getErrorCode());
/*     */ 
/* 170 */           ReportResp reportResp = new ReportResp(command.header.getUnicomSN());
/* 171 */           reportResp.setResult((byte)0);
/* 172 */           reportResp.write(this.spout);
/* 173 */           if (report.getReportType() == 0)
/* 174 */             transmitDeliverMsg(report); break;
/*     */         case 17:
/* 179 */           UnicomSPMonitor.log.info("收到SMG ->UserRpt命令");
/* 180 */           UserRpt userRpt = (UserRpt)command;
/* 181 */           UnicomSPMonitor.log.info("SPNumber:" + userRpt.getSPNumber());
/* 182 */           UnicomSPMonitor.log.info("UserNumber:" + userRpt.getUserNumber());
/* 183 */           UnicomSPMonitor.log.info("UserCondition:" + userRpt.getUserCondition());
/*     */ 
/* 185 */           UserRptResp userRptresp = new UserRptResp(command.header.getUnicomSN());
/* 186 */           userRptresp.setResult((byte)0);
/* 187 */           break;
/*     */         default:
/* 189 */           UnicomSPMonitor.log.error("error!! -->default:" + Bytes4ToInt(command.header.getCommandId()));
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     public void transmitDeliverMsg(SGIPCommand command)
/*     */     {
/* 202 */       Report report = (Report)command;
/* 203 */       new JmsSendReprot(report);
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.sgip.svr.UnicomSPMonitor
 * JD-Core Version:    0.6.2
 */
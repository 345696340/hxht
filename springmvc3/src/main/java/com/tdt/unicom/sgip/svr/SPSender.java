/*     */ package com.tdt.unicom.sgip.svr;
/*     */ 
/*     */ import com.core.sgip.jms.JmsSendSubmit;
/*     */ import com.tdt.unicom.domains.Bind;
/*     */ import com.tdt.unicom.domains.BindResp;
/*     */ import com.tdt.unicom.domains.SGIPCommandDefine;
/*     */ import com.tdt.unicom.domains.SGIPException;
/*     */ import com.tdt.unicom.domains.SGIPHeader;
/*     */ import com.tdt.unicom.domains.Submit;
/*     */ import com.tdt.unicom.domains.SubmitResp;
/*     */ import com.tdt.unicom.domains.Unbind;
/*     */ import com.tdt.unicom.domains.UnbindResp;
/*     */ import com.tdt.unicom.spsvr.MTReq;
/*     */ import com.tdt.unicom.util.SGIPCodeHelper;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.Socket;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.BlockingQueue;
/*     */ import java.util.concurrent.Executors;
/*     */ import java.util.concurrent.LinkedBlockingQueue;
/*     */ import java.util.concurrent.ScheduledExecutorService;
/*     */ import java.util.concurrent.ThreadFactory;
/*     */ import java.util.concurrent.ThreadPoolExecutor;
/*     */ import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import javax.net.SocketFactory;
/*     */ import org.apache.log4j.Logger;
/*     */
/*     */ public final class SPSender
/*     */ {
/*     */   private Logger log;
/*     */   private BlockingQueue<Runnable> mtReqQueue;
/*     */   private volatile boolean isSendUnbind;
/*  30 */   private static SPSender instance = null;
/*     */   private Socket socket;
/*     */   private DataOutputStream out;
/*     */   private DataInputStream in;
/*     */   private long bindstartTime;
/*     */   private long currentTime;
/*     */   private static Map<String, Submit> mtSendedMap;
/*     */   protected static String unicomIp;
/*     */   protected static int unicomPort;
/*     */   protected static String spLoginName;
/*     */   protected static String spLogPassword;
/*     */   protected static String spCorpId;
/*     */   private final ThreadFactory threadFactory;
/*     */   int threadAmount;
/*     */   private ThreadPoolExecutor poolExecutor;
/*     */
/*     */   public SPSender()
/*     */   {
/*  25 */     this.log = Logger.getLogger(getClass());
/*     */ 
/*  27 */     this.mtReqQueue = new LinkedBlockingQueue(1000);
/*  28 */     this.isSendUnbind = true;
/*     */ 
/*  32 */     this.socket = null;
/*  33 */     this.out = null;
/*  34 */     this.in = null;
/*     */ 
/*  46 */     this.threadFactory = new ThreadFactory() {
/*  47 */       int threadNo = 0;
/*     */
/*     */       public Thread newThread(Runnable task)
/*     */       {
/*  51 */         this.threadNo += 1;
/*  52 */         Thread thread = new Thread(task, "MT-" + this.threadNo);
/*  53 */         thread.setUncaughtExceptionHandler(new UEHLogger());
/*     */ 
/*  55 */         return thread;
/*     */       }
/*     */     };
/*  62 */     this.threadAmount = 1;
/*  63 */     this.poolExecutor = new ThreadPoolExecutor(this.threadAmount, this.threadAmount, 30000L, TimeUnit.SECONDS, this.mtReqQueue, this.threadFactory, new CallerRunsPolicy());
/*     */   }
/*     */
/*     */   public static SPSender getInstance(Map<String, Submit> map)
/*     */   {
/*  72 */     if (instance == null) {
/*  73 */       synchronized (SPSender.class) {
/*  74 */         if (instance == null) {
/*  75 */           instance = new SPSender();
/*  76 */           if (map != null) {
/*  77 */             mtSendedMap = map;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  82 */     return instance;
/*     */   }
/*     */
/*     */   public void addTask(final MTReq mtreq)
/*     */   {
/*  91 */     Runnable sendTask = new Runnable() {
/*     */       public void run() {
/*     */         try {
/*  94 */           SPSender.this.sendMTReq(mtreq);
/*     */         }
/*     */         catch (IOException e) {
/*  97 */           SPSender.this.log.warn("短信下发时发生IO流异常:" + e.getMessage() + ".　短信下发实例重新放回发送队列！");
/*     */ 
/*  99 */           SPSender.this.mtReqQueue.add(this);
/*     */         }
/*     */       }
/*     */     };
/* 103 */     this.poolExecutor.execute(sendTask);
/*     */   }
/*     */
/*     */   public void bindToSMG()
/*     */     throws IOException
/*     */   {
/* 113 */     this.socket = SocketFactory.getDefault().createSocket(unicomIp, unicomPort);
/* 114 */     this.socket.setTcpNoDelay(true);
/* 115 */     this.socket.setTrafficClass(20);
/* 116 */     this.bindstartTime = System.currentTimeMillis();
/* 117 */     this.out = new DataOutputStream(this.socket.getOutputStream());
/* 118 */     this.in = new DataInputStream(this.socket.getInputStream());
/* 119 */     this.log.info(Thread.currentThread().getName() + "已与SMG建立Socket连接");
/*     */ 
/* 121 */     Bind bind = new Bind();
/*     */ 
/* 125 */     bind.setLoginType((byte)1);
/* 126 */     bind.setLoginName(spLoginName);
/* 127 */     bind.setLoginPassword(spLogPassword);
/* 128 */     bind.write(this.out);
/* 129 */     this.log.info(Thread.currentThread().getName() + "向SMG发送bind请求");
/*     */ 
/* 131 */     this.isSendUnbind = false;
/* 132 */     BindResp res = (BindResp)bind.read(this.in);
/* 133 */     if (res.getResult() != 0) {
/* 134 */       this.log.fatal("SMG拒绝连接。错误码：" + res.getResult() + "原因：" + SGIPCodeHelper.getDescription(res.getResult()));
/* 135 */       throw new SGIPException(res.getResult());
/*     */     }
/* 137 */     this.log.info(Thread.currentThread().getName() + "已成功与SMG建立短消息下发通道。");
/* 138 */     launchTimer();
/*     */   }
/*     */
/*     */   public void sendMTReq(MTReq mtreq)
/*     */     throws IOException
/*     */   {
/* 146 */     if (this.isSendUnbind) {
/* 147 */       synchronized (this) {
/* 148 */         if (this.isSendUnbind) {
/* 149 */           bindToSMG();
/*     */         }
/*     */       }
/*     */     }
/* 153 */     this.log.info("手机号码数量　: " + mtreq.getPhoneList().size());
/*     */     try
/*     */     {
/* 156 */       for (int i = 0; i < mtreq.getPhoneList().size(); i++) {
/* 157 */         Submit submit = new Submit();
/* 158 */         submit.setSPNumber(mtreq.getSpNumber());
/* 159 */         submit.setChargeNumber(new String((String)mtreq.getPhoneList().get(i)));
/* 160 */         submit.setUserNumber(mtreq.getCharNum());
/* 161 */         submit.setCorpId(spCorpId);
/* 162 */         submit.setFeeType((byte)mtreq.getFeeType());
/* 163 */         submit.setFeeValue(mtreq.getFeeValue());
/* 164 */         submit.setGivenValue("0");
/* 165 */         submit.setAgentFlag((byte)0);
/* 166 */         submit.setMorelatetoMTFlag((byte)2);
/*     */ 
/* 170 */         submit.setPriority((byte)0);
/* 171 */         submit.setExpireTime("");
/* 172 */         submit.setScheduleTime("");
/* 173 */         submit.setReportFlag(Byte.valueOf(mtreq.getReportFlag()).byteValue());
/* 174 */         submit.setTP_pid((byte)0);
/* 175 */         submit.setTP_udhi((byte)0);
/* 176 */         submit.setMessageCoding((byte)15);
/* 177 */         submit.setMessageType((byte)0);
/* 178 */         submit.setMessageContent(mtreq.getMessageContent());
/* 179 */         submit.setUserCoun((byte)1);
/* 180 */         submit.setServiceType(mtreq.getServiceType());
/* 181 */         submit.setLinkID(mtreq.getLinkId());
/* 182 */         submit.write(this.out);
/* 183 */         SubmitResp submitres = (SubmitResp)submit.read(this.in);
/* 184 */         if (submitres.getResult() == 0) {
/* 185 */           this.log.info("【" + Thread.currentThread().getName() + " 发送的MT请求成功递交到SMG 】");
/*     */ 
/* 189 */           new JmsSendSubmit(submit);
/*     */         }
/*     */         else {
/* 192 */           this.log.warn("【" + Thread.currentThread().getName() + " 发送的MT请求递交到SMG失败!,错误码 " + submitres.getResult() + "】");
/*     */         }
/*     */       }
/*     */     } catch (Exception e) { this.log.info("通道断开连接,将手动重新连接!");
/* 196 */       this.isSendUnbind = true;
/* 197 */       this.log.info("将异常的包重新加入队列!");
/* 198 */       addTask(mtreq);
/* 199 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */
/*     */   public void launchTimer()
/*     */   {
/* 214 */     final ScheduledExecutorService scheduExec = Executors.newScheduledThreadPool(1);
/*     */ 
/* 216 */     Runnable task = new Runnable() {
/*     */       public void run() {
/* 218 */         if (SPSender.this.mtReqQueue.isEmpty()) {
/* 219 */           SPSender.this.currentTime = System.currentTimeMillis();
/* 220 */           int passedTime = (int)((SPSender.this.currentTime - SPSender.this.bindstartTime) / 1000L);
/* 221 */           if (passedTime > 30)
/* 222 */             synchronized (this)
/*     */             {
/* 225 */               Unbind unbind = new Unbind();
/* 226 */               UnbindResp resp = null;
/*     */               try {
/* 228 */                 unbind.write(SPSender.this.out);
/* 229 */                 SPSender.this.log.info(Thread.currentThread().getName() + " 向SMG发送unbind命令");
/* 230 */                 resp = (UnbindResp)unbind.read(SPSender.this.in);
/*     */               } catch (IOException ex) {
/* 232 */                 SPSender.this.log.error("向SMG发送unbind命令时IO异常", ex);
/*     */               }
/*     */ 
/* 235 */               if (Arrays.equals(resp.header.getCommandId(), SGIPCommandDefine.SGIP_UNBIND_RESP)) {
/* 236 */                 SPSender.this.isSendUnbind = true;
/* 237 */                 SPSender.this.log.info("SMG收到unbind命令，SP关闭连接");
/* 238 */                 scheduExec.shutdown();
/*     */                 try
/*     */                 {
/* 241 */                   if (SPSender.this.in != null) SPSender.this.in.close();
/* 242 */                   if (SPSender.this.out != null) SPSender.this.out.close();
/* 243 */                   if (SPSender.this.socket != null) SPSender.this.socket.close();
/*     */                 }
/* 245 */                 catch (IOException e) { SPSender.this.log.warn("释放socket资源发生异常"); }
/*     */ 
/*     */               }
/*     */             }
/*     */         }
/*     */       }
/*     */     };
/* 253 */     scheduExec.scheduleWithFixedDelay(task, 0L, 1L, TimeUnit.SECONDS);
/*     */   }
/*     */
/*     */   class UEHLogger implements Thread.UncaughtExceptionHandler
/*     */   {
/*     */     UEHLogger() {
/*     */     }
/*     */
/*     */     public void uncaughtException(Thread t, Throwable e) {
/* 262 */       SPSender.this.log.warn("线程 " + t.getName() + " 因" + e.getCause().getMessage() + "原因而终止!");
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.sgip.svr.SPSender
 * JD-Core Version:    0.6.2
 */
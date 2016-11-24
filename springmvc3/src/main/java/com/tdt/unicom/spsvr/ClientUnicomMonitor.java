/*     */ package com.tdt.unicom.spsvr;
/*     */ 
/*     */ import com.tdt.unicom.domains.Submit;

/*     */ import com.tdt.unicom.sgip.svr.SPSender;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.OutputStream;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Map;
/*     */ import javax.net.ServerSocketFactory;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.jdom.Document;
/*     */ import org.jdom.JDOMException;
/*     */ import org.jdom.input.SAXBuilder;
/*     */ 
/*     */ public class ClientUnicomMonitor
/*     */ {
/*     */   private static final int LISTEN_PORT = 8805;
/*  32 */   private ServerSocket reqsvrSocket = null;
/*  33 */   private Logger log = Logger.getLogger(getClass());
/*     */   private SPSender sender;
/*     */ 
/*     */   public ClientUnicomMonitor(Map<String, Submit> savedMap)
/*     */   {
/*     */     try
/*     */     {
/*  38 */       this.reqsvrSocket = ServerSocketFactory.getDefault().createServerSocket(8805);
/*     */ 
/*  40 */       this.sender = SPSender.getInstance(savedMap);
/*  41 */       this.log.info("短消息下行(MT)接收端启动，监听端口:8805");
/*     */     } catch (IOException e) {
/*  43 */       this.log.error("launch local server error!", e);
/*  44 */       throw new ExceptionInInitializerError(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void recsvr() {
/*     */     while (true) {
/*  50 */       Socket reqSocket = null;
/*     */       try {
/*  52 */         reqSocket = this.reqsvrSocket.accept();
/*  53 */         this.log.info("New connection accepted" + reqSocket.getInetAddress() + ":" + reqSocket.getPort());
/*     */ 
/*  55 */         Thread workThread = new Thread(new Handler(reqSocket));
/*  56 */         workThread.start();
/*     */       } catch (IOException e) {
/*  58 */         this.log.error("等待客户端连接时错误", e);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   class Handler implements Runnable {
/*     */     private Socket socket;
/*     */     private InputStream socketIn;
/*     */     private OutputStream socketout;
/*     */ 
/*  70 */     public Handler(Socket socket) { this.socket = socket; }
/*     */ 
/*     */     public void run()
/*     */     {
/*     */       try {
/*  75 */         this.socketIn = this.socket.getInputStream();
/*  76 */         this.socketout = this.socket.getOutputStream();
/*  77 */         BufferedReader reader = new BufferedReader(new InputStreamReader(this.socketIn));
/*     */ 
/*  79 */         int character = 0;
/*  80 */         StringBuffer xmlBuffer = new StringBuffer();
/*  81 */         ArrayList mtreqList = new ArrayList();
/*  82 */         boolean startFlag = false;
/*  83 */         boolean endFlag = false;
/*     */ 
/*  85 */         while ((this.socket.isConnected()) && (!this.socket.isClosed())) {
/*  86 */           while ((reader.ready()) && ((character = reader.read()) != -1)) {
/*  87 */             char c = (char)character;
/*  88 */             if (c == '{') {
/*  89 */               startFlag = true;
/*     */             }
/*     */             else {
/*  92 */               if (c == '}') {
/*  93 */                 endFlag = true;
/*  94 */                 mtreqList.add(xmlBuffer.toString());
/*  95 */                 startFlag = false;
/*  96 */                 endFlag = false;
/*     */ 
/*  98 */                 xmlBuffer.setLength(0);
/*     */               }
/* 100 */               if ((startFlag == true) && (!endFlag))
/* 101 */                 xmlBuffer.append(c);
/*     */             }
/*     */           }
/* 104 */           if (mtreqList.size() > 0)
/*     */           {
/* 106 */             SAXBuilder builder = new SAXBuilder();
/* 107 */             Document doc = null;
/* 108 */             for (int i = 0; i < mtreqList.size(); i++) {
/* 109 */               String xmldoc = (String)mtreqList.get(i);
/* 110 */               ClientUnicomMonitor.this.log.debug("MT请求包:\n" + xmldoc);
/* 111 */               doc = builder.build(new ByteArrayInputStream(xmldoc.getBytes()));
/* 112 */               MTReq mtreq = new MTReq(doc);
/*     */ 
/* 114 */               ClientUnicomMonitor.this.sender.addTask(mtreq);
/*     */             }
/*     */ 
/* 117 */             mtreqList.clear();
/*     */           }
/*     */         }
/*     */       } catch (IOException e) {
/* 121 */         ClientUnicomMonitor.this.log.error("接收客户MT请求时IO流异常", e);
/*     */       } catch (JDOMException e) {
/* 123 */         sendDocerr(e.getMessage());
/*     */       }
/*     */     }
/*     */ 
/*     */     public void sendDocerr(String errorInfo)
/*     */     {
/*     */       try
/*     */       {
/* 132 */         this.socketout.write(errorInfo.getBytes());
/* 133 */         this.socketout.flush();
/*     */       } catch (IOException e) {
/* 135 */         ClientUnicomMonitor.this.log.error("发送xml文档格式错误出错", e);
/*     */       }
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.spsvr.ClientUnicomMonitor
 * JD-Core Version:    0.6.2
 */
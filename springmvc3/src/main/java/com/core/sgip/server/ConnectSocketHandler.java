/*    */ package com.core.sgip.server;
/*    */ 
/*    */ import com.core.sgip.SGIPMsg;
/*    */ import com.core.sgip.body.command.Deliver;
/*    */ import com.core.sgip.body.command.Report;
/*    */ import com.core.sgip.client.SGIPClient;
/*    */ import com.core.sgip.constant.ClientConstant;
/*    */ import com.core.sgip.constant.SGIPConstant;
/*    */ import com.core.sgip.factory.SGIPFactory;
/*    */ import com.core.sgip.head.SGIPMsgHead;
/*    */ import com.core.sgip.interf.MessageHandler;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class ConnectSocketHandler
/*    */   implements Runnable
/*    */ {
/* 41 */   private static Logger logger = Logger.getLogger(ConnectSocketHandler.class);
/*    */   private Socket socket;
/*    */   private MessageHandler messageHandler;
/*    */ 
/*    */   public ConnectSocketHandler(Socket socket, MessageHandler messageHandler)
/*    */   {
/* 48 */     this.socket = socket;
/* 49 */     this.messageHandler = messageHandler;
/*    */   }
/*    */ 
/*    */   public void run()
/*    */   {
/* 54 */     long commandIdTemp = 0L;
/* 55 */     Deliver deliver = null;
/* 56 */     InetAddress remoteAddress = this.socket.getInetAddress();
/* 57 */     String remoteIp = remoteAddress.getHostAddress();
/* 58 */     logger.debug("remote ip :" + remoteIp);
/*    */ 
/* 60 */     if (!ClientConstant.PERMIT_IP.equalsIgnoreCase(remoteIp));
/* 64 */     InputStream is = null;
/* 65 */     OutputStream os = null;
/*    */     try {
/* 67 */       is = this.socket.getInputStream();
/* 68 */       os = this.socket.getOutputStream();
/*    */ 
/* 70 */       logger.debug("start receive command  -- bind");
/* 71 */       SGIPMsg sgipMsg = SGIPFactory.constructSGIPMsg(SGIPClient.getAvailableBytes(is));
/* 72 */       SGIPMsgHead head = sgipMsg.getHead();
/* 73 */       byte[] dataByte = null;
/* 74 */       logger.debug("start receive command head =" + head);
/* 75 */       if (null != head)
/*    */       {
/* 77 */         long commandId = head.getCommandId().longValue();
/* 78 */         commandIdTemp = commandId;
/* 79 */         if (SGIPConstant.SGIP_BIND == commandId)
/*    */         {
/* 82 */           sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_BIND_RESP);
/* 83 */           dataByte = sgipMsg.getByteData();
/* 84 */           os.write(dataByte);
/* 85 */           os.flush();
/*    */ 
/* 87 */           boolean notUnbind = true;
/* 88 */           while (notUnbind) {
/* 89 */             logger.debug("start receive deliver or report");
/* 90 */             sgipMsg = SGIPFactory.constructSGIPMsg(SGIPClient.getAvailableBytes(is));
/* 91 */             head = sgipMsg.getHead();
/* 92 */             logger.debug("end receive deliver or report head =" + head);
/* 93 */             if (null != head) {
/* 94 */               commandId = head.getCommandId().longValue();
/* 95 */               if (SGIPConstant.SGIP_DELIVER == commandId) {
/* 96 */                 logger.debug("******************* receive deliver *******************");
/*    */ 
/* 98 */                 this.messageHandler.handleDeliverMessage(head, (Deliver)sgipMsg.getCommand());
/* 99 */                 deliver = (Deliver)sgipMsg.getCommand();
/* 100 */                 logger.debug("deliver 鎺ユ敹鍒扮殑涓婅鐭俊 deliver=" + deliver.toString());
/*    */ 
/* 102 */                 sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_DELIVER_RESP);
/* 103 */                 os.write(sgipMsg.getByteData());
/* 104 */                 os.flush();
/* 105 */                 logger.debug("os.flush() 鍒锋柊缂撳瓨瀹屾垚......");
/*    */               }
/* 107 */               else if (SGIPConstant.SGIP_REPORT == commandId) {
/* 108 */                 logger.debug("******************* receive report *******************");
/*    */ 
/* 110 */                 this.messageHandler.handleReportMessage(head, (Report)sgipMsg.getCommand());
/*    */ 
/* 113 */                 sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_REPORT_RESP);
/* 114 */                 os.write(sgipMsg.getByteData());
/* 115 */                 os.flush();
/* 116 */               } else if (SGIPConstant.SGIP_UNBIND == commandId) {
/* 117 */                 notUnbind = false;
/* 118 */                 logger.debug("******************* receive unbind *******************");
/*    */ 
/* 120 */                 sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_UNBIND_RESP);
/* 121 */                 os.write(sgipMsg.getByteData());
/* 122 */                 os.flush();
/*    */               }
/*    */             }
/*    */           }
/*    */ 
/*    */         }
/*    */ 
/*    */       }
/*    */ 
/* 131 */       if (os != null) {
/*    */         try {
/* 133 */           os.close();
/*    */         } catch (IOException e) {
/* 135 */           e.printStackTrace();
/*    */         }
/*    */       }
/* 138 */       if (is != null) {
/*    */         try {
/* 140 */           is.close();
/*    */         } catch (IOException e) {
/* 142 */           e.printStackTrace();
/*    */         }
/*    */       }
/* 145 */       if (null != this.socket) {
/* 146 */         logger.debug("*********release connect socket");
/*    */         try {
/* 148 */           this.socket.close();
/*    */         } catch (IOException e) {
/* 150 */           e.printStackTrace();
/*    */         }
/*    */       }
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 129 */       e.printStackTrace();
/*    */ 
/* 131 */       if (os != null) {
/*    */         try {
/* 133 */           os.close();
/*    */         } catch (IOException e1) {
/* 135 */           e1.printStackTrace();
/*    */         }
/*    */       }
/* 138 */       if (is != null) {
/*    */         try {
/* 140 */           is.close();
/*    */         } catch (IOException e1) {
/* 142 */           e1.printStackTrace();
/*    */         }
/*    */       }
/* 145 */       if (null != this.socket) {
/* 146 */         logger.debug("*********release connect socket");
/*    */         try {
/* 148 */           this.socket.close();
/*    */         } catch (IOException e1) {
/* 150 */           e1.printStackTrace();
/*    */         }
/*    */       }
/*    */     }
/*    */     finally
/*    */     {
/* 131 */       if (os != null) {
/*    */         try {
/* 133 */           os.close();
/*    */         } catch (IOException e) {
/* 135 */           e.printStackTrace();
/*    */         }
/*    */       }
/* 138 */       if (is != null) {
/*    */         try {
/* 140 */           is.close();
/*    */         } catch (IOException e) {
/* 142 */           e.printStackTrace();
/*    */         }
/*    */       }
/* 145 */       if (null != this.socket) {
/* 146 */         logger.debug("*********release connect socket");
/*    */         try {
/* 148 */           this.socket.close();
/*    */         } catch (IOException e) {
/* 150 */           e.printStackTrace();
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.server.ConnectSocketHandler
 * JD-Core Version:    0.6.2
 */
/*     */ package com.core.sgip.server;
/*     */ 
/*     */ import com.core.sgip.SGIPMsg;
/*     */ import com.core.sgip.body.command.Deliver;
/*     */ import com.core.sgip.body.command.Report;
/*     */ import com.core.sgip.constant.ClientConstant;
/*     */ import com.core.sgip.constant.SGIPConstant;
/*     */ import com.core.sgip.factory.SGIPFactory;
/*     */ import com.core.sgip.head.SGIPMsgHead;
/*     */ import com.core.sgip.interf.MessageHandler;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.ServerSocket;
/*     */ import java.net.Socket;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.channels.SelectionKey;
/*     */ import java.nio.channels.Selector;
/*     */ import java.nio.channels.ServerSocketChannel;
/*     */ import java.nio.channels.SocketChannel;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class SGIPServer
/*     */ {
/*  44 */   private static Logger logger = Logger.getLogger(SGIPServer.class);
/*     */ 
/*  46 */   private MessageHandler messageHandler = ClientConstant.SGIP_MSG_HANDLER;
/*     */ 
/*  48 */   private static SGIPServer instance = new SGIPServer();
/*     */ 
/*     */   public static SGIPServer getInstance() {
/*  51 */     return instance;
/*     */   }
/*     */ 
/*     */   public void startSGIPService() {
/*     */     try {
/*  56 */       logger.debug("*********startSGIPService port : " + ClientConstant.LOCALHOST_SGIP_PORT);
/*  57 */       ServerSocket server = new ServerSocket(ClientConstant.LOCALHOST_SGIP_PORT);
/*     */       while (true)
/*     */       {
/*  60 */         Socket socket = server.accept();
/*  61 */         new Thread(new ConnectSocketHandler(socket, this.messageHandler)).start();
/*     */       }
/*     */     }
/*     */     catch (IOException e) {
/*  65 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void startNIOSGIPService() {
/*  70 */     Selector selector = null;
/*  71 */     ServerSocketChannel serverSocketChannel = null;
/*     */     try {
/*  73 */       logger.debug("*********startNIOSGIPService ");
/*  74 */       selector = Selector.open();
/*  75 */       serverSocketChannel = ServerSocketChannel.open();
/*  76 */       serverSocketChannel.configureBlocking(false);
/*  77 */       serverSocketChannel.socket().setReuseAddress(true);
/*  78 */       serverSocketChannel.socket().bind(new InetSocketAddress(ClientConstant.LOCALHOST_SGIP_PORT));
/*     */ 
/*  81 */       serverSocketChannel.register(selector, 16);
/*     */       while (true)
/*  83 */         if (selector.select() != 0)
/*     */         {
/*  86 */           Iterator iter = selector.selectedKeys().iterator();
/*  87 */           while (iter.hasNext()) {
/*  88 */             SelectionKey key = (SelectionKey)iter.next();
/*  89 */             iter.remove();
/*  90 */             handleKey(key);
/*     */           }
/*     */         }
/*     */     } catch (IOException e) {
/*  94 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   private void handleKey(SelectionKey key) throws IOException {
/*  99 */     if (key.isAcceptable())
/*     */     {
/* 101 */       SocketChannel channel = ((ServerSocketChannel)key.channel()).accept();
/*     */ 
/* 103 */       channel.configureBlocking(false);
/* 104 */       channel.register(key.selector(), 1);
/*     */     }
/* 106 */     if (key.isReadable()) {
/* 107 */       ByteArrayOutputStream baos = new ByteArrayOutputStream();
/* 108 */       SocketChannel socketChannel = (SocketChannel)key.channel();
/* 109 */       socketChannel.configureBlocking(false);
/* 110 */       ByteBuffer buffer = ByteBuffer.allocate(1024);
/*     */       try
/*     */       {
/* 113 */         int size = 0;
/* 114 */         while ((size = socketChannel.read(buffer)) >= 0) {
/* 115 */           buffer.flip();
/* 116 */           byte[] bytes = new byte[size];
/* 117 */           buffer.get(bytes);
/* 118 */           baos.write(bytes);
/* 119 */           buffer.clear();
/*     */         }
/* 121 */         byte[] bytes = baos.toByteArray();
/*     */ 
/* 123 */         SGIPMsg sgipMsg = SGIPFactory.constructSGIPMsg(bytes);
/* 124 */         logger.debug("receive sgipMsg:" + sgipMsg);
/* 125 */         SGIPMsgHead head = sgipMsg.getHead();
/* 126 */         if (null != head) {
/* 127 */           long commandId = head.getCommandId().longValue();
/* 128 */           if (SGIPConstant.SGIP_BIND == commandId) {
/* 129 */             logger.debug("******************* receive bind *******************");
/* 130 */             key.attach(Long.valueOf(SGIPConstant.SGIP_BIND_RESP));
/* 131 */           } else if (SGIPConstant.SGIP_DELIVER == commandId) {
/* 132 */             logger.debug("******************* receive deliver *******************");
/* 133 */             this.messageHandler.handleDeliverMessage(head, (Deliver)sgipMsg.getCommand());
/* 134 */             key.attach(Long.valueOf(SGIPConstant.SGIP_DELIVER_RESP));
/* 135 */           } else if (SGIPConstant.SGIP_REPORT == commandId) {
/* 136 */             logger.debug("******************* receive report *******************");
/* 137 */             this.messageHandler.handleReportMessage(head, (Report)sgipMsg.getCommand());
/* 138 */             key.attach(Long.valueOf(SGIPConstant.SGIP_REPORT_RESP));
/* 139 */           } else if (SGIPConstant.SGIP_UNBIND == commandId) {
/* 140 */             logger.debug("******************* receive unbind *******************");
/* 141 */             key.attach(Long.valueOf(SGIPConstant.SGIP_UNBIND_RESP));
/*     */           }
/*     */         }
/*     */       } catch (Exception e) {
/* 145 */         e.printStackTrace();
/*     */       } finally {
/* 147 */         baos.close();
/* 148 */         if (buffer != null) {
/* 149 */           buffer = null;
/*     */         }
/*     */       }
/* 152 */       key.interestOps(4);
/*     */     }
/* 154 */     if (key.isWritable()) {
/* 155 */       boolean isClose = false;
/* 156 */       SocketChannel channel = (SocketChannel)key.channel();
/* 157 */       channel.configureBlocking(false);
/* 158 */       SGIPMsg sgipMsg = null;
/*     */       try {
/* 160 */         long sendCommandId = ((Long)key.attachment()).longValue();
/* 161 */         if (SGIPConstant.SGIP_BIND_RESP == sendCommandId) {
/* 162 */           sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_BIND_RESP);
/* 163 */           logger.debug("******************* send bind resp *******************sgipMsg=" + sgipMsg);
/* 164 */           ByteBuffer block = ByteBuffer.wrap(sgipMsg.getByteData());
/* 165 */           channel.write(block);
/* 166 */         } else if (SGIPConstant.SGIP_DELIVER_RESP == sendCommandId) {
/* 167 */           sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_DELIVER_RESP);
/* 168 */           logger.debug("******************* send deliver resp *******************sgipMsg=" + sgipMsg);
/* 169 */           ByteBuffer block = ByteBuffer.wrap(sgipMsg.getByteData());
/* 170 */           channel.write(block);
/* 171 */         } else if (SGIPConstant.SGIP_REPORT_RESP == sendCommandId) {
/* 172 */           sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_REPORT_RESP);
/* 173 */           logger.debug("******************* send report resp *******************sgipMsg=" + sgipMsg);
/* 174 */           ByteBuffer block = ByteBuffer.wrap(sgipMsg.getByteData());
/* 175 */           channel.write(block);
/* 176 */         } else if (SGIPConstant.SGIP_UNBIND_RESP == sendCommandId) {
/* 177 */           sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_UNBIND_RESP);
/* 178 */           logger.debug("******************* send unbind resp *******************sgipMsg=" + sgipMsg);
/* 179 */           ByteBuffer block = ByteBuffer.wrap(sgipMsg.getByteData());
/* 180 */           channel.write(block);
/* 181 */           isClose = true;
/*     */         }
/*     */       } catch (Exception e) {
/* 184 */         e.printStackTrace();
/*     */       }
/* 186 */       if (isClose) {
/* 187 */         channel.close();
/* 188 */         return;
/*     */       }
/* 190 */       key.interestOps(1);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/* 197 */     getInstance().startSGIPService();
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.server.SGIPServer
 * JD-Core Version:    0.6.2
 */
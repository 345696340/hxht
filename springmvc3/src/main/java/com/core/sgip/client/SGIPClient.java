/*     */ package com.core.sgip.client;
/*     */ 
/*     */ import com.core.sgip.SGIPMsg;
/*     */ import com.core.sgip.body.command.BindResp;
/*     */ import com.core.sgip.body.command.Submit;
/*     */ import com.core.sgip.body.command.SubmitResp;
/*     */ import com.core.sgip.constant.ClientConstant;
/*     */ import com.core.sgip.constant.SGIPConstant;
/*     */ import com.core.sgip.factory.SGIPFactory;
/*     */ import com.core.sgip.head.SGIPMsgHead;
/*     */ import com.core.sgip.interf.MessageHandler;
/*     */ import com.core.sgip.util.SGIPUtils;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.Socket;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.channels.SelectionKey;
/*     */ import java.nio.channels.Selector;
/*     */ import java.nio.channels.SocketChannel;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class SGIPClient
/*     */ {
/*  48 */   private static Logger logger = Logger.getLogger(SGIPClient.class);
/*     */ 
/*  50 */   private static MessageHandler messageHandler = ClientConstant.SGIP_MSG_HANDLER;
/*     */ 
/*     */   public static void sendMsg(List<String> listUserNumber, String content) throws Exception
/*     */   {
/*  54 */     if (ClientConstant.IS_NIO.equalsIgnoreCase("y"))
/*  55 */       sendMsg(listUserNumber, content, true);
/*     */     else
/*  57 */       sendMsg(listUserNumber, content, false);
/*     */   }
/*     */ 
/*     */   public static void sendMsg(List<String> listUserNumber, String content, boolean isNIO)
/*     */     throws Exception
/*     */   {
/*  69 */     if ((null == listUserNumber) || (0 == listUserNumber.size()) || (null == content) || (0 == content.length()))
/*     */     {
/*  71 */       return;
/*     */     }
/*     */ 
/*  74 */     for (int i = 0; i < listUserNumber.size(); i++) {
/*  75 */       String un = (String)listUserNumber.get(i);
/*  76 */       if (!un.startsWith("86")) {
/*  77 */         listUserNumber.set(i, "86" + un);
/*     */       }
/*     */     }
/*  80 */     if (isNIO)
/*  81 */       startNioCommu(listUserNumber, content);
/*     */     else
/*  83 */       startCommunication(listUserNumber, content);
/*     */   }
/*     */ 
/*     */   private static void startNioCommu(List<String> listUserNumber, String content)
/*     */     throws Exception
/*     */   {
/*  89 */     int size = listUserNumber.size();
/*  90 */     int multi = 1;
/*  91 */     int fromIndex = 0;
/*  92 */     int toIndex = size;
/*  93 */     if (size > ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER) {
/*  94 */       multi = size / ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER + (size % ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER > 0 ? 1 : 0);
/*     */     }
/*  96 */     for (int i = 0; i < multi; i++) {
/*  97 */       toIndex = fromIndex + ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER;
/*  98 */       toIndex = toIndex > size ? size : toIndex;
/*  99 */       List tempUserNumbers = listUserNumber.subList(fromIndex, toIndex);
/* 100 */       fromIndex = (i + 1) * ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER;
/* 101 */       startNIOCommunication(tempUserNumbers, content);
/* 102 */       logger.debug("------------------------------");
/*     */     }
/*     */   }
/*     */ 
/*     */   private static boolean headKey(SelectionKey key, List<String> listUserNumber, String content) throws Exception {
/* 107 */     boolean quit = false;
/*     */     try {
/* 109 */       if (key.isConnectable()) {
/* 110 */         SocketChannel socketChannel = (SocketChannel)key.channel();
/*     */ 
/* 113 */         if (socketChannel.finishConnect())
/*     */         {
/* 115 */           logger.debug("********* nio socket connect success **********");
/*     */ 
/* 117 */           key.interestOps(4);
/* 118 */           key.attach(Long.valueOf(SGIPConstant.SGIP_BIND));
/*     */         }
/*     */       }
/* 121 */       if (key.isReadable()) {
/* 122 */         logger.debug("****************nio socket into readable ********");
/* 123 */         ByteArrayOutputStream baos = new ByteArrayOutputStream();
/* 124 */         SocketChannel socketChannel = (SocketChannel)key.channel();
/* 125 */         socketChannel.configureBlocking(false);
/* 126 */         ByteBuffer buffer = ByteBuffer.allocate(1024);
/*     */         try
/*     */         {
/* 129 */           int size = socketChannel.read(buffer);
/* 130 */           if (size >= 0) {
/* 131 */             buffer.flip();
/* 132 */             byte[] bytes = new byte[size];
/* 133 */             buffer.get(bytes);
/* 134 */             baos.write(bytes);
/* 135 */             buffer.clear();
/*     */           }
/* 137 */           byte[] bytes = baos.toByteArray();
/*     */ 
/* 139 */           int result = 0;
/*     */ 
/* 141 */           long receiveCommandId = ((Long)key.attachment()).longValue();
/* 142 */           if (receiveCommandId == SGIPConstant.SGIP_BIND_RESP) {
/* 143 */             SGIPMsg returnMsg = SGIPFactory.constructSGIPMsg(bytes);
/* 144 */             logger.debug("*********end receive bindResp*********returnMsg=" + returnMsg);
/*     */ 
/* 146 */             if ((null != returnMsg.getCommand()) && (((BindResp)returnMsg.getCommand()).getResult() == 0))
/*     */             {
/* 149 */               key.attach(Long.valueOf(SGIPConstant.SGIP_SUBMIT));
/*     */             } else {
/* 151 */               BindResp br = (BindResp)returnMsg.getCommand();
/* 152 */               result = br.getResult();
/* 153 */               logger.debug("****************** bindResp's result:\t" + result);
/*     */ 
/* 155 */               String errorMsg = (String)SGIPConstant.ERROR_CODE.get(result + "");
/*     */ 
/* 157 */               logger.error("閿欒娑堟伅:" + errorMsg);
/* 158 */               quit = true;
/* 159 */               throw new Exception(errorMsg);
/*     */             }
/* 161 */           } else if (receiveCommandId == SGIPConstant.SGIP_SUBMIT_RESP) {
/* 162 */             SGIPMsg returnMsg = SGIPFactory.constructSGIPMsg(bytes);
/* 163 */             logger.debug("*********end receive submitResp*********returnMsg=" + returnMsg);
/*     */ 
/* 165 */             if ((null != returnMsg.getCommand()) && (((SubmitResp)returnMsg.getCommand()).getResult() == 0))
/*     */             {
/* 168 */               key.attach(Long.valueOf(SGIPConstant.SGIP_UNBIND));
/*     */             } else {
/* 170 */               SubmitResp br = (SubmitResp)returnMsg.getCommand();
/* 171 */               result = br.getResult();
/* 172 */               logger.debug("****************** SubmitResp's result:\t" + result);
/*     */ 
/* 174 */               String errorMsg = (String)SGIPConstant.ERROR_CODE.get(result + "");
/*     */ 
/* 176 */               logger.error("閿欒娑堟伅:" + errorMsg);
/* 177 */               quit = true;
/* 178 */               throw new Exception(errorMsg);
/*     */             }
/* 180 */           } else if (receiveCommandId == SGIPConstant.SGIP_UNBIND_RESP) {
/* 181 */             SGIPMsg returnMsg = SGIPFactory.constructSGIPMsg(bytes);
/* 182 */             logger.debug("*********end receive unbindResp*********returnMsg=" + returnMsg);
/*     */           }
/*     */ 
/* 185 */           if (receiveCommandId != SGIPConstant.SGIP_UNBIND_RESP) {
/* 186 */             key.interestOps(4);
/*     */           } else {
/* 188 */             quit = true;
/* 189 */             socketChannel.close();
/*     */           }
/* 191 */           logger.debug("********* quit=" + quit);
/*     */         } catch (Exception e) {
/* 193 */           quit = true;
/* 194 */           logger.error("Error", e);
/* 195 */           throw e;
/*     */         } finally {
/* 197 */           baos.close();
/* 198 */           if (buffer != null) {
/* 199 */             buffer = null;
/*     */           }
/*     */         }
/*     */       }
/* 203 */       if (quit) {
/* 204 */         return quit;
/*     */       }
/* 206 */       if (key.isWritable()) {
/* 207 */         logger.debug("****************nio socket into writable ********");
/* 208 */         SocketChannel socketChannel = (SocketChannel)key.channel();
/* 209 */         socketChannel.configureBlocking(false);
/*     */ 
/* 211 */         long sendCommandId = ((Long)key.attachment()).longValue();
/* 212 */         if (sendCommandId == SGIPConstant.SGIP_BIND) {
/* 213 */           SGIPMsg sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_BIND);
/*     */ 
/* 215 */           ByteBuffer block = ByteBuffer.wrap(sgipMsg.getByteData());
/* 216 */           logger.debug("*********send bind *********sgipMsg=" + sgipMsg);
/*     */ 
/* 218 */           socketChannel.write(block);
/* 219 */           key.attach(Long.valueOf(SGIPConstant.SGIP_BIND_RESP));
/* 220 */         } else if (sendCommandId == SGIPConstant.SGIP_SUBMIT) {
/* 221 */           SGIPMsg sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_SUBMIT);
/*     */ 
/* 223 */           sgipMsg.setUserNumbers(listUserNumber, content);
/* 224 */           ByteBuffer block = ByteBuffer.wrap(sgipMsg.getByteData());
/* 225 */           logger.debug("*********send submit *********sgipMsg=" + sgipMsg);
/*     */ 
/* 227 */           socketChannel.write(block);
/* 228 */           key.attach(Long.valueOf(SGIPConstant.SGIP_SUBMIT_RESP));
/* 229 */           messageHandler.handleSubmitMessage(sgipMsg.getHead(), (Submit)sgipMsg.getCommand());
/*     */         }
/* 231 */         else if (sendCommandId == SGIPConstant.SGIP_UNBIND) {
/* 232 */           SGIPMsg sgipMsg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_UNBIND);
/*     */ 
/* 234 */           ByteBuffer block = ByteBuffer.wrap(sgipMsg.getByteData());
/* 235 */           logger.debug("*********send unbind *********sgipMsg=" + sgipMsg);
/*     */ 
/* 237 */           socketChannel.write(block);
/* 238 */           key.attach(Long.valueOf(SGIPConstant.SGIP_UNBIND_RESP));
/*     */         }
/* 240 */         key.interestOps(1);
/*     */       }
/*     */     } catch (Exception e) {
/* 243 */       logger.error("Error", e);
/* 244 */       quit = true;
/* 245 */       throw e;
/*     */     }
/* 247 */     return quit;
/*     */   }
/*     */ 
/*     */   private static void startNIOCommunication(List<String> listUserNumber, String content) throws Exception {
/* 251 */     Selector selector = Selector.open();
/*     */ 
/* 253 */     SocketChannel channel = SocketChannel.open();
/*     */ 
/* 255 */     channel.configureBlocking(false);
/*     */ 
/* 257 */     channel.connect(new InetSocketAddress(ClientConstant.SERVER_IP, Integer.valueOf(ClientConstant.SERVER_PORT).intValue()));
/*     */ 
/* 259 */     channel.register(selector, 8);
/* 260 */     boolean quit = false;
/*     */     try {
/* 262 */       while (!quit) {
/* 263 */         selector.select();
/* 264 */         Iterator iter = selector.selectedKeys().iterator();
/* 265 */         while (iter.hasNext()) {
/* 266 */           SelectionKey key = (SelectionKey)iter.next();
/* 267 */           iter.remove();
/* 268 */           quit = headKey(key, listUserNumber, content);
/*     */         }
/*     */       }
/*     */     } catch (Exception e) {
/* 272 */       logger.error("Error", e);
/* 273 */       throw e;
/*     */     } finally {
/* 275 */       channel.close();
/*     */     }
/*     */   }
/*     */ 
/*     */   private static void startCommunication(List<String> listUserNumber, String content)
/*     */     throws Exception
/*     */   {
/* 282 */     Socket socket = null;
/* 283 */     InputStream is = null;
/* 284 */     OutputStream os = null;
/*     */     try {
/* 286 */       logger.debug("*********start build socket=" + ClientConstant.SERVER_IP + ":" + ClientConstant.SERVER_PORT);
/* 287 */       socket = new Socket(ClientConstant.SERVER_IP, Integer.valueOf(ClientConstant.SERVER_PORT).intValue());
/*     */ 
/* 289 */       logger.debug("********* builded socket=" + socket);
/* 290 */       socket.setKeepAlive(true);
/* 291 */       os = socket.getOutputStream();
/* 292 */       is = socket.getInputStream();
/*     */ 
/* 294 */       logger.debug("*********send bind start*********");
/* 295 */       SGIPMsg msg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_BIND);
/* 296 */       byte[] dataByte = msg.getByteData();
/* 297 */       os.write(dataByte);
/* 298 */       os.flush();
/*     */ 
/* 300 */       logger.debug("*********send bind end and start receive bindResp*********");
/*     */ 
/* 302 */       SGIPMsg returnMsg = SGIPFactory.constructSGIPMsg(getAvailableBytes(is));
/* 303 */       logger.debug("*********end receive bindResp*********returnMsg=" + returnMsg);
/* 304 */       if ((returnMsg != null) && (returnMsg.getHead() != null) && (returnMsg.getHead().getCommandId().longValue() == SGIPConstant.SGIP_BIND_RESP));
/* 307 */       BindResp br = (BindResp)returnMsg.getCommand();
/* 308 */       if (null != br) {
/* 309 */         int result = br.getResult();
/* 310 */         logger.debug("****************** bindResp's result:\t" + result);
/* 311 */         if (0 != result) {
/* 312 */           String errorMsg = (String)SGIPConstant.ERROR_CODE.get(result + "");
/* 313 */           logger.error("閿欒娑堟伅:" + errorMsg);
/* 314 */           throw new Exception(errorMsg);
/*     */         }
/* 316 */         int size = listUserNumber.size();
/* 317 */         int multi = 1;
/* 318 */         int fromIndex = 0;
/* 319 */         int toIndex = size;
/* 320 */         if (size > ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER) {
/* 321 */           multi = size / ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER + (size % ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER > 0 ? 1 : 0);
/*     */         }
/* 323 */         boolean sendSubmitOver = false;
/* 324 */         for (int i = 0; i < multi; i++) {
/* 325 */           toIndex = fromIndex + ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER;
/* 326 */           toIndex = toIndex > size ? size : toIndex;
/* 327 */           List tempUserNumbers = listUserNumber.subList(fromIndex, toIndex);
/* 328 */           fromIndex = (i + 1) * ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER;
/*     */ 
/* 330 */           logger.debug("*********bind success start send submit*******listNumberSize:" + tempUserNumbers.size());
/* 331 */           msg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_SUBMIT);
/* 332 */           msg.setUserNumbers(tempUserNumbers, content);
/* 333 */           dataByte = msg.getByteData();
/* 334 */           logger.debug("send Submitmsg" + msg);
/*     */ 
/* 336 */           messageHandler.handleSubmitMessage(msg.getHead(), (Submit)msg.getCommand());
/*     */ 
/* 338 */           os.write(dataByte);
/* 339 */           os.flush();
/* 340 */           logger.debug("*********end send submit start receive submitResp*********");
/* 341 */           returnMsg = SGIPFactory.constructSGIPMsg(getAvailableBytes(is));
/*     */ 
/* 343 */           logger.debug("************returnMsg=" + returnMsg);
/* 344 */           if ((returnMsg != null) && (returnMsg.getHead() != null) && (returnMsg.getHead().getCommandId().longValue() == SGIPConstant.SGIP_SUBMIT_RESP)) {
/* 345 */             SubmitResp sr = (SubmitResp)returnMsg.getCommand();
/* 346 */             if (null != sr) {
/* 347 */               result = sr.getResult();
/* 348 */               logger.debug("****************** submitResp's result:\t" + result);
/*     */ 
/* 350 */               if (0 != result) {
/* 351 */                 String errorMsg = (String)SGIPConstant.ERROR_CODE.get(result + "");
/* 352 */                 logger.error("閿欒娑堟伅:" + errorMsg);
/* 353 */                 throw new Exception(errorMsg);
/*     */               }
/* 355 */               logger.debug("*********submit success *********");
/*     */             }
/*     */           }
/*     */ 
/* 359 */           if (i + 1 == multi) {
/* 360 */             sendSubmitOver = true;
/*     */           }
/*     */         }
/* 363 */         if (sendSubmitOver)
/*     */         {
/* 365 */           logger.debug("*********submit all send success start send Unbind *********");
/*     */ 
/* 367 */           msg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_UNBIND);
/* 368 */           dataByte = msg.getByteData();
/* 369 */           os.write(dataByte);
/* 370 */           os.flush();
/* 371 */           logger.debug("*********end send Unbind start receive UnbindResp*********");
/* 372 */           returnMsg = SGIPFactory.constructSGIPMsg(getAvailableBytes(is));
/*     */ 
/* 374 */           logger.debug("************returnMsg=" + returnMsg);
/* 375 */           if ((returnMsg != null) && (returnMsg.getHead() != null) && (returnMsg.getHead().getCommandId().longValue() == SGIPConstant.SGIP_UNBIND_RESP))
/*     */           {
/* 377 */             logger.debug("*********Unbind success *********");
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 388 */       if (os != null) {
/*     */         try {
/* 390 */           os.close();
/*     */         } catch (IOException e) {
/* 392 */           logger.error("Error", e);
/*     */         }
/*     */       }
/* 395 */       if (is != null) {
/*     */         try {
/* 397 */           is.close();
/*     */         } catch (IOException e) {
/* 399 */           logger.error("Error", e);
/*     */         }
/*     */       }
/* 402 */       if (null != socket) {
/* 403 */         logger.debug("*********release socket=" + ClientConstant.SERVER_IP + ":" + ClientConstant.SERVER_PORT);
/*     */         try {
/* 405 */           socket.close();
/*     */         } catch (IOException e) {
/* 407 */           logger.error("Error", e);
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 385 */       logger.error(e.getMessage());
/* 386 */       throw new Exception(e.getMessage());
/*     */     } finally {
/* 388 */       if (os != null) {
/*     */         try {
/* 390 */           os.close();
/*     */         } catch (IOException e) {
/* 392 */           logger.error("Error", e);
/*     */         }
/*     */       }
/* 395 */       if (is != null) {
/*     */         try {
/* 397 */           is.close();
/*     */         } catch (IOException e) {
/* 399 */           logger.error("Error", e);
/*     */         }
/*     */       }
/* 402 */       if (null != socket) {
/* 403 */         logger.debug("*********release socket=" + ClientConstant.SERVER_IP + ":" + ClientConstant.SERVER_PORT);
/*     */         try {
/* 405 */           socket.close();
/*     */         } catch (IOException e) {
/* 407 */           logger.error("Error", e);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void startCommunicationSms(List<String> listUserNumber, String content, String serviceType, String linkId)
/*     */     throws Exception
/*     */   {
/* 416 */     Socket socket = null;
/* 417 */     InputStream is = null;
/* 418 */     OutputStream os = null;
/*     */     try {
/* 420 */       logger.debug("*********start build socket=" + ClientConstant.SERVER_IP + ":" + ClientConstant.SERVER_PORT);
/* 421 */       socket = new Socket(ClientConstant.SERVER_IP, Integer.valueOf(ClientConstant.SERVER_PORT).intValue());
/*     */ 
/* 423 */       logger.debug("********* builded socket=" + socket);
/* 424 */       socket.setKeepAlive(true);
/* 425 */       os = socket.getOutputStream();
/* 426 */       is = socket.getInputStream();
/*     */ 
/* 428 */       logger.debug("*********send bind start*********");
/* 429 */       SGIPMsg msg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_BIND);
/* 430 */       byte[] dataByte = msg.getByteData();
/* 431 */       os.write(dataByte);
/* 432 */       os.flush();
/*     */ 
/* 434 */       logger.debug("*********send bind end and start receive bindResp*********");
/*     */ 
/* 436 */       SGIPMsg returnMsg = SGIPFactory.constructSGIPMsg(getAvailableBytes(is));
/* 437 */       logger.debug("*********end receive bindResp*********returnMsg=" + returnMsg);
/* 438 */       if ((returnMsg != null) && (returnMsg.getHead() != null) && (returnMsg.getHead().getCommandId().longValue() == SGIPConstant.SGIP_BIND_RESP));
/* 441 */       BindResp br = (BindResp)returnMsg.getCommand();
/* 442 */       if (null != br) {
/* 443 */         int result = br.getResult();
/* 444 */         logger.debug("****************** bindResp's result:\t" + result);
/* 445 */         if (0 != result) {
/* 446 */           String errorMsg = (String)SGIPConstant.ERROR_CODE.get(result + "");
/* 447 */           logger.error("閿欒娑堟伅:" + errorMsg);
/* 448 */           throw new Exception(errorMsg);
/*     */         }
/* 450 */         int size = listUserNumber.size();
/* 451 */         int multi = 1;
/* 452 */         int fromIndex = 0;
/* 453 */         int toIndex = size;
/* 454 */         if (size > ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER) {
/* 455 */           multi = size / ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER + (size % ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER > 0 ? 1 : 0);
/*     */         }
/* 457 */         boolean sendSubmitOver = false;
/* 458 */         for (int i = 0; i < multi; i++) {
/* 459 */           toIndex = fromIndex + ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER;
/* 460 */           toIndex = toIndex > size ? size : toIndex;
/* 461 */           List tempUserNumbers = listUserNumber.subList(fromIndex, toIndex);
/* 462 */           fromIndex = (i + 1) * ClientConstant.SGIP_SUBMIT_MAX_USER_NUMBER;
/*     */ 
/* 464 */           logger.debug("*********bind success start send submit*******listNumberSize:" + tempUserNumbers.size());
/* 465 */           msg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_SUBMIT);
/* 466 */           Submit sub = (Submit)msg.getCommand();
/* 467 */           sub.setServiceType(serviceType);
/* 468 */           sub.setAgentFlag(0);
/* 469 */           byte[] linkIdByte = SGIPUtils.convertString2Bytes(linkId, 8);
/* 470 */           sub.setReserve(linkIdByte);
/* 471 */           sub.setChargeNumber((String)tempUserNumbers.get(0));
/* 472 */           sub.setFeeType(2);
/* 473 */           sub.setFeeValue("000100");
/* 474 */           sub.setGivenValue("0");
/* 475 */           sub.setMessageType(0);
/* 476 */           msg.setUserNumbers(tempUserNumbers, content);
/* 477 */           dataByte = msg.getByteData();
/* 478 */           logger.debug("send Submitmsg" + msg);
/*     */ 
/* 480 */           messageHandler.handleSubmitMessage(msg.getHead(), (Submit)msg.getCommand());
/*     */ 
/* 482 */           os.write(dataByte);
/* 483 */           os.flush();
/* 484 */           logger.debug("*********end send submit start receive submitResp*********");
/* 485 */           returnMsg = SGIPFactory.constructSGIPMsg(getAvailableBytes(is));
/*     */ 
/* 487 */           logger.debug("************returnMsg=" + returnMsg);
/* 488 */           if ((returnMsg != null) && (returnMsg.getHead() != null) && (returnMsg.getHead().getCommandId().longValue() == SGIPConstant.SGIP_SUBMIT_RESP)) {
/* 489 */             SubmitResp sr = (SubmitResp)returnMsg.getCommand();
/* 490 */             if (null != sr) {
/* 491 */               result = sr.getResult();
/* 492 */               logger.debug("****************** submitResp's result:\t" + result);
/*     */ 
/* 494 */               if (0 != result) {
/* 495 */                 String errorMsg = (String)SGIPConstant.ERROR_CODE.get(result + "");
/* 496 */                 logger.error("閿欒娑堟伅:" + errorMsg);
/* 497 */                 throw new Exception(errorMsg);
/*     */               }
/* 499 */               logger.debug("*********submit success *********");
/*     */             }
/*     */           }
/*     */ 
/* 503 */           if (i + 1 == multi) {
/* 504 */             sendSubmitOver = true;
/*     */           }
/*     */         }
/* 507 */         if (sendSubmitOver)
/*     */         {
/* 509 */           logger.debug("*********submit all send success start send Unbind *********");
/*     */ 
/* 511 */           msg = SGIPFactory.getSGIPMsg(SGIPConstant.SGIP_UNBIND);
/* 512 */           dataByte = msg.getByteData();
/* 513 */           os.write(dataByte);
/* 514 */           os.flush();
/* 515 */           logger.debug("*********end send Unbind start receive UnbindResp*********");
/* 516 */           returnMsg = SGIPFactory.constructSGIPMsg(getAvailableBytes(is));
/*     */ 
/* 518 */           logger.debug("************returnMsg=" + returnMsg);
/* 519 */           if ((returnMsg != null) && (returnMsg.getHead() != null) && (returnMsg.getHead().getCommandId().longValue() == SGIPConstant.SGIP_UNBIND_RESP))
/*     */           {
/* 521 */             logger.debug("*********Unbind success *********");
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 533 */       if (os != null) {
/*     */         try {
/* 535 */           os.close();
/*     */         } catch (IOException e) {
/* 537 */           logger.error("Error", e);
/*     */         }
/*     */       }
/* 540 */       if (is != null) {
/*     */         try {
/* 542 */           is.close();
/*     */         } catch (IOException e) {
/* 544 */           logger.error("Error", e);
/*     */         }
/*     */       }
/* 547 */       if (null != socket) {
/* 548 */         logger.debug("*********release socket=" + ClientConstant.SERVER_IP + ":" + ClientConstant.SERVER_PORT);
/*     */         try {
/* 550 */           socket.close();
/*     */         } catch (IOException e) {
/* 552 */           logger.error("Error", e);
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 529 */       e.printStackTrace();
/* 530 */       logger.error(e.getMessage());
/* 531 */       throw new Exception(e.getMessage());
/*     */     } finally {
/* 533 */       if (os != null) {
/*     */         try {
/* 535 */           os.close();
/*     */         } catch (IOException e) {
/* 537 */           logger.error("Error", e);
/*     */         }
/*     */       }
/* 540 */       if (is != null) {
/*     */         try {
/* 542 */           is.close();
/*     */         } catch (IOException e) {
/* 544 */           logger.error("Error", e);
/*     */         }
/*     */       }
/* 547 */       if (null != socket) {
/* 548 */         logger.debug("*********release socket=" + ClientConstant.SERVER_IP + ":" + ClientConstant.SERVER_PORT);
/*     */         try {
/* 550 */           socket.close();
/*     */         } catch (IOException e) {
/* 552 */           logger.error("Error", e);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static byte[] getAvailableBytes(InputStream inputStream) throws Exception
/*     */   {
/* 560 */     Calendar cal = Calendar.getInstance();
/* 561 */     long startMillis = cal.getTimeInMillis();
/* 562 */     long endMillis = startMillis;
/* 563 */     int timeout = ClientConstant.RESPONSE_TIMEOUT;
/*     */ 
/* 565 */     int count = 0;
/* 566 */     while ((count == 0) && (endMillis - startMillis <= timeout * 1000)) {
/* 567 */       endMillis = Calendar.getInstance().getTimeInMillis();
/* 568 */       count = inputStream.available();
/*     */     }
/*     */ 
/* 574 */     byte[] bytes = new byte[count];
/* 575 */     int readCount = 0;
/* 576 */     while (readCount < count) {
/* 577 */       readCount += inputStream.read(bytes, readCount, count - readCount);
/*     */     }
/* 579 */     return bytes;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) throws Exception {
/* 583 */     List listUserNumber = new ArrayList();
/* 584 */     listUserNumber.add("18515325915");
/*     */ 
/* 586 */     sendMsg(listUserNumber, "just test test鑽氦缃慼ttp://yj.3kw.com鐭俊鍙戦�娴嬭瘯-NIO鏂瑰紡 ", true);
/* 587 */     sendMsg(listUserNumber, "just test test鑽氦缃慼ttp://yj.3kw.com鐭俊鍙戦�娴嬭瘯-SOCKET鏂瑰紡 ", false);
/*     */   }
/*     */ 
/*     */   public static void sendTestMsg() throws Exception {
/* 591 */     List listUserNumber = new ArrayList();
/* 592 */     listUserNumber.add("18508429828");
/* 593 */     sendMsg(listUserNumber, "just test test鑽氦缃慼ttp://yj.3kw.com鐭俊娴嬭瘯");
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.client.SGIPClient
 * JD-Core Version:    0.6.2
 */
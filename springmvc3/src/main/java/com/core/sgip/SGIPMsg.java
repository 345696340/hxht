/*     */ package com.core.sgip;
/*     */ 
/*     */ import com.core.sgip.body.SGIPCommand;
/*     */ import com.core.sgip.body.command.Submit;
/*     */ import com.core.sgip.constant.SGIPConstant;
/*     */ import com.core.sgip.factory.SGIPFactory;
/*     */ import com.core.sgip.head.SGIPMsgHead;
/*     */ import com.core.sgip.interf.SGIPByteData;
/*     */ import com.core.sgip.util.SGIPUtils;
/*     */ import java.util.List;
/*     */ 
/*     */ public class SGIPMsg
/*     */   implements SGIPByteData
/*     */ {
/*     */   private SGIPMsgHead head;
/*     */   private SGIPCommand command;
/*     */ 
/*     */   public SGIPMsgHead getHead()
/*     */   {
/*  37 */     return this.head;
/*     */   }
/*     */ 
/*     */   public void setHead(SGIPMsgHead head)
/*     */   {
/*  42 */     this.head = head;
/*     */   }
/*     */ 
/*     */   public SGIPCommand getCommand()
/*     */   {
/*  47 */     return this.command;
/*     */   }
/*     */ 
/*     */   public void setCommand(SGIPCommand command)
/*     */   {
/*  52 */     this.command = command;
/*     */   }
/*     */ 
/*     */   private void calcute()
/*     */   {
/*  57 */     long messageLength = this.command.getCommandLength() + 20;
/*  58 */     this.head.setMessageLength(Long.valueOf(messageLength));
/*     */   }
/*     */ 
/*     */   public byte[] getByteData()
/*     */   {
/*  64 */     byte[] commandBytes = this.command.getByteData();
/*  65 */     calcute();
/*  66 */     return SGIPUtils.mergeBytes(new byte[][] { this.head.getByteData(), commandBytes });
/*     */   }
/*     */ 
/*     */   public void setUserNumbers(List<String> listUserNumber, String messageContent)
/*     */   {
/*  71 */     if ((this.head == null) || (this.command == null) || (this.head.getCommandId().longValue() != SGIPConstant.SGIP_SUBMIT))
/*     */     {
/*  73 */       return;
/*     */     }
/*  75 */     Submit sub = (Submit)this.command;
/*  76 */     sub.setListUserNumber(listUserNumber);
/*  77 */     sub.setMessageContent(messageContent);
/*     */   }
/*     */ 
/*     */   private void initHead(byte[] source)
/*     */   {
/*  82 */     this.head = new SGIPMsgHead();
/*  83 */     byte[] headByte = new byte[20];
/*  84 */     SGIPUtils.copyBytes(source, headByte, 1, 20, 1);
/*  85 */     this.head.initPropertiesByBytes(headByte);
/*     */   }
/*     */ 
/*     */   private void initCommand(byte[] source) throws Exception
/*     */   {
/*  90 */     if ((this.head == null) || (this.head.getCommandId() == null))
/*     */     {
/*  92 */       return;
/*     */     }
/*  94 */     long commandId = this.head.getCommandId().longValue();
/*  95 */     this.command = SGIPFactory.getCommandByCommandId(commandId);
/*     */ 
/*  97 */     byte[] commandByte = new byte[source.length - 20];
/*  98 */     SGIPUtils.copyBytes(source, commandByte, 21, commandByte.length, 1);
/*  99 */     this.command.initPropertiesByBytes(commandByte);
/*     */   }
/*     */ 
/*     */   public void initPropertiesByBytes(byte[] source)
/*     */   {
/* 105 */     initHead(source);
/*     */     try
/*     */     {
/* 108 */       initCommand(source);
/*     */     }
/*     */     catch (Exception e) {
/* 111 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 118 */     return "SGIPMsg [head=" + this.head + ", command=" + this.command + "]";
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.SGIPMsg
 * JD-Core Version:    0.6.2
 */
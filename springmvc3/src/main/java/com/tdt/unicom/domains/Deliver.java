/*     */ package com.tdt.unicom.domains;
/*     */ 
/*     */ import java.nio.charset.Charset;
/*     */ 
/*     */ public class Deliver extends SGIPCommand
/*     */ {
/*     */   private String userNumber;
/*     */   private String SPNumber;
/*     */   private byte TP_pid;
/*     */   private byte TP_udhi;
/*     */   private byte messageCoding;
/*     */   private int messageLength;
/*     */   private String messageContent;
/*  25 */   private String linkID = "";
/*     */ 
/*     */   public Deliver(SGIPCommand command) {
/*  28 */     this.header = command.header;
/*  29 */     this.bodybytes = command.bodybytes;
/*     */ 
/*  31 */     this.userNumber = new String(this.bodybytes, 0, 21).trim();
/*     */ 
/*  33 */     this.SPNumber = new String(this.bodybytes, 21, 21).trim();
/*     */ 
/*  35 */     this.TP_pid = command.bodybytes[42];
/*     */ 
/*  37 */     this.TP_udhi = command.bodybytes[43];
/*     */ 
/*  39 */     this.messageCoding = command.bodybytes[44];
/*     */ 
/*  41 */     byte[] messageLengthBytes = new byte[4];
/*  42 */     System.arraycopy(command.bodybytes, 45, messageLengthBytes, 0, 4);
/*  43 */     this.messageLength = Bytes4ToInt(messageLengthBytes);
/*  44 */     if (this.messageLength > 160) {
/*  45 */       this.messageLength = 160;
/*     */     }
/*     */ 
/*  48 */     byte[] messageContentBytes = new byte[this.messageLength];
/*  49 */     System.arraycopy(command.bodybytes, 49, messageContentBytes, 0, this.messageLength);
/*  50 */     if (this.messageCoding == 8)
/*  51 */       this.messageContent = new String(messageContentBytes, Charset.forName("UnicodeBigUnmarked"));
/*  52 */     else if (this.messageCoding == 15)
/*  53 */       this.messageContent = new String(messageContentBytes, Charset.forName("gbk"));
/*     */     else {
/*  55 */       this.messageContent = new String(messageContentBytes);
/*     */     }
/*     */ 
/*  58 */     byte[] linkIDBytes = new byte[8];
/*  59 */     System.arraycopy(command.bodybytes, 49 + this.messageLength, linkIDBytes, 0, 8);
/*  60 */     this.linkID = new String(linkIDBytes);
/*     */   }
/*     */   public String getUserNumber() {
/*  63 */     return this.userNumber;
/*     */   }
/*     */ 
/*     */   public void setUserNumber(String userNumber) {
/*  67 */     this.userNumber = userNumber;
/*     */   }
/*     */ 
/*     */   public String getSPNumber() {
/*  71 */     return this.SPNumber;
/*     */   }
/*     */ 
/*     */   public void setSPNumber(String sPNumber) {
/*  75 */     this.SPNumber = sPNumber;
/*     */   }
/*     */ 
/*     */   public byte getTP_pid() {
/*  79 */     return this.TP_pid;
/*     */   }
/*     */ 
/*     */   public void setTP_pid(byte tPPid) {
/*  83 */     this.TP_pid = tPPid;
/*     */   }
/*     */ 
/*     */   public byte getTP_udhi()
/*     */   {
/*  88 */     return this.TP_udhi;
/*     */   }
/*     */ 
/*     */   public void setTP_udhi(byte tPUdhi) {
/*  92 */     this.TP_udhi = tPUdhi;
/*     */   }
/*     */ 
/*     */   public byte getMessageCoding() {
/*  96 */     return this.messageCoding;
/*     */   }
/*     */ 
/*     */   public void setMessageCoding(byte messageCoding) {
/* 100 */     this.messageCoding = messageCoding;
/*     */   }
/*     */ 
/*     */   public int getMessageLength() {
/* 104 */     return this.messageLength;
/*     */   }
/*     */ 
/*     */   public void setMessageLength(int messageLength) {
/* 108 */     this.messageLength = messageLength;
/*     */   }
/*     */ 
/*     */   public String getMessageContent() {
/* 112 */     return this.messageContent;
/*     */   }
/*     */ 
/*     */   public void setMessageContent(String messageContent) {
/* 116 */     this.messageContent = messageContent;
/*     */   }
/*     */ 
/*     */   public String getLinkID() {
/* 120 */     return this.linkID;
/*     */   }
/*     */ 
/*     */   public void setLinkID(String linkID) {
/* 124 */     this.linkID = linkID;
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.Deliver
 * JD-Core Version:    0.6.2
 */
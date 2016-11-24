/*     */ package com.core.sgip.body.command;
/*     */ 
/*     */ import com.core.sgip.body.SGIPCommand;
/*     */ import com.core.sgip.util.SGIPUtils;
/*     */ import java.io.Serializable;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class Deliver extends SGIPCommand
/*     */   implements Serializable
/*     */ {
/*  28 */   private static Logger logger = Logger.getLogger(Deliver.class);
/*     */   private static final int COMMAND_FIX_LENGTH = 57;
/*     */   private String userNumber;
/*     */   private String spNumber;
/*     */   private int tpPid;
/*     */   private int tpUdhi;
/*     */   private int messageCoding;
/*     */   private long messageLength;
/*     */   private String messageContent;
/*     */   private String linkid;
/*  48 */   private byte[] reserve = new byte[8];
/*     */ 
/*  50 */   private byte[] userNumberByte = new byte[21];
/*     */ 
/*  52 */   private byte[] spNumberByte = new byte[21];
/*     */ 
/*  54 */   private byte[] tpPidByte = new byte[1];
/*     */ 
/*  56 */   private byte[] tpUdhiByte = new byte[1];
/*     */ 
/*  58 */   private byte[] messageCodingByte = { 15 };
/*     */ 
/*  60 */   private byte[] messageLengthByte = new byte[4];
/*     */   private byte[] messageContentByte;
/*  64 */   private byte[] linkIdByte = new byte[8];
/*     */ 
/*     */   public String getUserNumber() {
/*  67 */     return this.userNumber;
/*     */   }
/*     */ 
/*     */   public void setUserNumber(String userNumber) {
/*  71 */     this.userNumber = userNumber;
/*     */   }
/*     */ 
/*     */   public String getSpNumber() {
/*  75 */     return this.spNumber;
/*     */   }
/*     */ 
/*     */   public void setSpNumber(String spNumber) {
/*  79 */     this.spNumber = spNumber;
/*     */   }
/*     */ 
/*     */   public int getTpPid() {
/*  83 */     return this.tpPid;
/*     */   }
/*     */ 
/*     */   public void setTpPid(int tpPid) {
/*  87 */     this.tpPid = tpPid;
/*     */   }
/*     */ 
/*     */   public int getTpUdhi() {
/*  91 */     return this.tpUdhi;
/*     */   }
/*     */ 
/*     */   public void setTpUdhi(int tpUdhi) {
/*  95 */     this.tpUdhi = tpUdhi;
/*     */   }
/*     */ 
/*     */   public int getMessageCoding() {
/*  99 */     return this.messageCoding;
/*     */   }
/*     */ 
/*     */   public void setMessageCoding(int messageCoding) {
/* 103 */     this.messageCoding = messageCoding;
/*     */   }
/*     */ 
/*     */   public long getMessageLength() {
/* 107 */     return this.messageLength;
/*     */   }
/*     */ 
/*     */   public void setMessageLength(long messageLength) {
/* 111 */     this.messageLength = messageLength;
/*     */   }
/*     */ 
/*     */   public String getMessageContent() {
/* 115 */     return this.messageContent;
/*     */   }
/*     */ 
/*     */   public void setMessageContent(String messageContent) {
/* 119 */     this.messageContent = messageContent;
/*     */   }
/*     */ 
/*     */   public byte[] getLinkIdByte()
/*     */   {
/* 127 */     return this.linkIdByte;
/*     */   }
/*     */ 
/*     */   public void setLinkIdByte(byte[] linkIdByte) {
/* 131 */     this.linkIdByte = linkIdByte;
/*     */   }
/*     */ 
/*     */   public String getLinkid() {
/* 135 */     return this.linkid;
/*     */   }
/*     */ 
/*     */   public void setLinkid(String linkid) {
/* 139 */     this.linkid = linkid;
/*     */   }
/*     */ 
/*     */   private void calcute()
/*     */   {
/*     */   }
/*     */ 
/*     */   public byte[] getByteData()
/*     */   {
/* 148 */     calcute();
/*     */ 
/* 150 */     return super.getByteData();
/*     */   }
/*     */ 
/*     */   public void initPropertiesByBytes(byte[] source)
/*     */   {
/* 156 */     if ((source != null) && (source.length >= 57)) {
/* 157 */       int length = source.length;
/* 158 */       int contentLength = length - 57;
/* 159 */       SGIPUtils.copyBytes(source, this.userNumberByte, 1, 21, 1);
/* 160 */       SGIPUtils.copyBytes(source, this.spNumberByte, 22, 21, 1);
/* 161 */       SGIPUtils.copyBytes(source, this.tpPidByte, 43, 1, 1);
/* 162 */       SGIPUtils.copyBytes(source, this.tpUdhiByte, 44, 1, 1);
/* 163 */       SGIPUtils.copyBytes(source, this.messageCodingByte, 45, 1, 1);
/* 164 */       SGIPUtils.copyBytes(source, this.messageLengthByte, 46, 4, 1);
/* 165 */       this.messageContentByte = new byte[contentLength];
/* 166 */       SGIPUtils.copyBytes(source, this.messageContentByte, 50, contentLength, 1);
/*     */ 
/* 168 */       this.userNumber = new String(this.userNumberByte);
/* 169 */       this.spNumber = new String(this.spNumberByte);
/* 170 */       this.tpPid = SGIPUtils.convertUnsignByte2Int(this.tpPidByte[0]);
/* 171 */       this.tpUdhi = SGIPUtils.convertUnsignByte2Int(this.tpUdhiByte[0]);
/* 172 */       this.messageCoding = SGIPUtils.convertUnsignByte2Int(this.messageCodingByte[0]);
/* 173 */       this.linkid = new String(this.linkIdByte);
/* 174 */       this.messageLength = SGIPUtils.byte4ToLong(this.messageLengthByte);
/*     */ 
/* 176 */       SGIPUtils.copyBytes(source, this.linkIdByte, 50 + new Long(this.messageLength).intValue(), 8, 1);
/* 177 */       this.linkid = new String(this.linkIdByte).trim();
/*     */ 
/* 180 */       if (this.messageCoding == 8)
/*     */         try {
/* 182 */           this.messageContent = new String(this.messageContentByte, "UTF-16");
/*     */         } catch (UnsupportedEncodingException e) {
/* 184 */           e.printStackTrace();
/*     */         }
/*     */       else
/* 187 */         this.messageContent = new String(this.messageContentByte);
/*     */     }
/*     */     else {
/* 190 */       logger.error("init Deliver properties from bytes error: the bytes not enough");
/*     */     }
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 196 */     return "Deliver [userNumber=" + this.userNumber + ", spNumber=" + this.spNumber + ", tpPid=" + this.tpPid + ", tpUdhi=" + this.tpUdhi + ", messageCoding=" + this.messageCoding + ", messageLength=" + this.messageLength + ", messageContent=" + this.messageContent + ", linkId=" + this.linkid + "]";
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.Deliver
 * JD-Core Version:    0.6.2
 */
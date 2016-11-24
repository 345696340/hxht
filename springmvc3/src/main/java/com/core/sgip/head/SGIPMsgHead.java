/*     */ package com.core.sgip.head;
/*     */ 
/*     */ import com.core.sgip.constant.ClientConstant;
/*     */ import com.core.sgip.interf.SGIPByteData;
/*     */ import com.core.sgip.util.SGIPSeq;
/*     */ import com.core.sgip.util.SGIPUtils;
/*     */ 
/*     */ public class SGIPMsgHead
/*     */   implements SGIPByteData
/*     */ {
/*     */   public static final int HEAD_LENGTH = 20;
/*     */   private Long messageLength;
/*     */   private Long commandId;
/*  52 */   private byte[] sequenceNumber = new byte[12];
/*     */ 
/*  57 */   private Long sourceNodeNumber = Long.valueOf("3" + ClientConstant.AREA_CODE + ClientConstant.COMPANY_CODE);
/*     */   private Long commandGenerateDate;
/*     */   private Long commandNumber;
/*     */   private String sequenceNumberStr;
/*     */ 
/*     */   public SGIPMsgHead()
/*     */   {
/*     */   }
/*     */ 
/*     */   public SGIPMsgHead(Long commandId)
/*     */   {
/*  40 */     this.commandId = commandId;
/*     */   }
/*     */ 
/*     */   public String getSequenceNumberStr()
/*     */   {
/*  73 */     return String.valueOf(this.sourceNodeNumber) + String.valueOf(this.commandGenerateDate) + String.valueOf(this.commandNumber);
/*     */   }
/*     */ 
/*     */   private Long getSourceNodeNumber()
/*     */   {
/*  78 */     return this.sourceNodeNumber;
/*     */   }
/*     */ 
/*     */   private void setSourceNodeNumber(Long sourceNodeNumber) {
/*  82 */     this.sourceNodeNumber = sourceNodeNumber;
/*     */   }
/*     */ 
/*     */   private Long getCommandGenerateDate() {
/*  86 */     return this.commandGenerateDate;
/*     */   }
/*     */ 
/*     */   private void setCommandGenerateDate(Long commandGenerateDate) {
/*  90 */     this.commandGenerateDate = commandGenerateDate;
/*     */   }
/*     */ 
/*     */   public Long getCommandNumber() {
/*  94 */     return this.commandNumber;
/*     */   }
/*     */ 
/*     */   private void setCommandNumber(Long commandNumber) {
/*  98 */     this.commandNumber = commandNumber;
/*     */   }
/*     */ 
/*     */   public Long getMessageLength() {
/* 102 */     return this.messageLength;
/*     */   }
/*     */ 
/*     */   public void setMessageLength(Long messageLength) {
/* 106 */     this.messageLength = messageLength;
/*     */   }
/*     */ 
/*     */   public Long getCommandId() {
/* 110 */     return this.commandId;
/*     */   }
/*     */ 
/*     */   public void setCommandId(Long commandId) {
/* 114 */     this.commandId = commandId;
/*     */   }
/*     */ 
/*     */   private byte[] getSequenceNumber()
/*     */   {
/* 119 */     return this.sequenceNumber;
/*     */   }
/*     */ 
/*     */   private void setSequenceNumber(byte[] sequenceNumber) {
/* 123 */     this.sequenceNumber = sequenceNumber;
/*     */   }
/*     */ 
/*     */   private void generateSequenceNumber()
/*     */   {
/* 131 */     generateDate();
/* 132 */     generateSeq();
/* 133 */     byte[] sourceNodeNumber = SGIPUtils.convertLong2FourBytes(this.sourceNodeNumber.longValue());
/* 134 */     byte[] commandDate = SGIPUtils.convertLong2FourBytes(this.commandGenerateDate.longValue());
/* 135 */     byte[] commandNum = SGIPUtils.convertLong2FourBytes(this.commandNumber.longValue());
/* 136 */     this.sequenceNumber = SGIPUtils.mergeBytes(new byte[][] { sourceNodeNumber, commandDate, commandNum });
/*     */   }
/*     */ 
/*     */   private void generateDate()
/*     */   {
/* 141 */     this.commandGenerateDate = SGIPUtils.getCurrentDate();
/*     */   }
/*     */ 
/*     */   private void generateSeq() {
/* 145 */     this.commandNumber = Long.valueOf(SGIPSeq.getSeq());
/*     */   }
/*     */ 
/*     */   public byte[] getByteData()
/*     */   {
/* 151 */     generateSequenceNumber();
/* 152 */     byte[] commandIdByte = SGIPUtils.convertLong2FourBytes(this.commandId.longValue());
/* 153 */     byte[] msgLengthByte = SGIPUtils.convertLong2FourBytes(this.messageLength.longValue());
/* 154 */     return SGIPUtils.mergeBytes(new byte[][] { msgLengthByte, commandIdByte, this.sequenceNumber });
/*     */   }
/*     */ 
/*     */   public void initPropertiesByBytes(byte[] source)
/*     */   {
/* 160 */     byte[] messageLengthByte = new byte[4];
/* 161 */     byte[] commandIdByte = new byte[4];
/* 162 */     SGIPUtils.copyBytes(source, messageLengthByte, 1, 4, 1);
/* 163 */     SGIPUtils.copyBytes(source, commandIdByte, 5, 4, 1);
/* 164 */     this.messageLength = Long.valueOf(SGIPUtils.byte4ToLong(messageLengthByte));
/* 165 */     this.commandId = Long.valueOf(SGIPUtils.byte4ToLong(commandIdByte));
/* 166 */     SGIPUtils.copyBytes(source, this.sequenceNumber, 9, 12, 1);
/* 167 */     byte[] sourceNodeNumberByte = new byte[4];
/* 168 */     byte[] generateDateByte = new byte[4];
/* 169 */     byte[] numberByte = new byte[4];
/* 170 */     SGIPUtils.copyBytes(this.sequenceNumber, sourceNodeNumberByte, 1, 4, 1);
/* 171 */     SGIPUtils.copyBytes(this.sequenceNumber, generateDateByte, 5, 4, 1);
/* 172 */     SGIPUtils.copyBytes(this.sequenceNumber, numberByte, 9, 4, 1);
/* 173 */     this.sourceNodeNumber = Long.valueOf(SGIPUtils.byte4ToLong(sourceNodeNumberByte));
/* 174 */     this.commandGenerateDate = Long.valueOf(SGIPUtils.byte4ToLong(generateDateByte));
/* 175 */     this.commandNumber = Long.valueOf(SGIPUtils.byte4ToLong(numberByte));
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 181 */     return "SGIPMsgHead [messageLength=" + this.messageLength + ", commandId=" + this.commandId + ", sourceNodeNumber=" + this.sourceNodeNumber + ", commandGenerateDate=" + this.commandGenerateDate + ", commandNumber=" + this.commandNumber + "]";
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.head.SGIPMsgHead
 * JD-Core Version:    0.6.2
 */
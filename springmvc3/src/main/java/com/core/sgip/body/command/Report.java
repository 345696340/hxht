/*     */ package com.core.sgip.body.command;
/*     */ 
/*     */ import com.core.sgip.body.SGIPCommand;
/*     */ import com.core.sgip.util.SGIPUtils;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class Report extends SGIPCommand
/*     */ {
/*  26 */   private static Logger logger = Logger.getLogger(Report.class);
/*     */   private static final int COMMAND_LENGTH = 44;
/*  30 */   private byte[] submitSequenceNumber = new byte[12];
/*     */ 
/*  32 */   private String submitSequenceNumberStr = "";
/*     */   private int reportType;
/*     */   private String userNumber;
/*     */   private int state;
/*     */   private int errorCode;
/*     */   private String linkId;
/*  58 */   private byte[] reserve = new byte[8];
/*     */ 
/*  60 */   private byte[] reportTypeByte = new byte[1];
/*     */ 
/*  62 */   private byte[] stateByte = new byte[1];
/*     */ 
/*  64 */   private byte[] errorCodeByte = new byte[1];
/*     */ 
/*  66 */   private byte[] userNumberByte = new byte[21];
/*     */ 
/*     */   public String getSubmitSequenceNumberStr()
/*     */   {
/*  35 */     byte[] a = new byte[4];
/*  36 */     byte[] b = new byte[4];
/*  37 */     byte[] c = new byte[4];
/*     */ 
/*  39 */     SGIPUtils.copyBytes(this.submitSequenceNumber, a, 1, 4, 1);
/*  40 */     SGIPUtils.copyBytes(this.submitSequenceNumber, b, 5, 4, 1);
/*  41 */     SGIPUtils.copyBytes(this.submitSequenceNumber, c, 9, 4, 1);
/*     */ 
/*  43 */     return String.valueOf(SGIPUtils.byte4ToLong(a)) + String.valueOf(SGIPUtils.byte4ToLong(b)) + String.valueOf(SGIPUtils.byte4ToLong(c));
/*     */   }
/*     */ 
/*     */   private byte[] getSubmitSequenceNumber()
/*     */   {
/*  70 */     return this.submitSequenceNumber;
/*     */   }
/*     */ 
/*     */   private void setSubmitSequenceNumber(byte[] submitSequenceNumber) {
/*  74 */     this.submitSequenceNumber = submitSequenceNumber;
/*     */   }
/*     */ 
/*     */   public int getReportType() {
/*  78 */     return this.reportType;
/*     */   }
/*     */ 
/*     */   public void setReportType(int reportType) {
/*  82 */     this.reportType = reportType;
/*     */   }
/*     */ 
/*     */   public String getUserNumber() {
/*  86 */     return this.userNumber;
/*     */   }
/*     */ 
/*     */   public void setUserNumber(String userNumber) {
/*  90 */     this.userNumber = userNumber;
/*     */   }
/*     */ 
/*     */   public int getState() {
/*  94 */     return this.state;
/*     */   }
/*     */ 
/*     */   public void setState(int state) {
/*  98 */     this.state = state;
/*     */   }
/*     */ 
/*     */   public int getErrorCode() {
/* 102 */     return this.errorCode;
/*     */   }
/*     */ 
/*     */   public void setErrorCode(int errorCode) {
/* 106 */     this.errorCode = errorCode;
/*     */   }
/*     */ 
/*     */   public Report()
/*     */   {
/* 111 */     this.commandLength = 44;
/*     */   }
/*     */ 
/*     */   public String getLinkId() {
/* 115 */     return this.linkId;
/*     */   }
/*     */ 
/*     */   public void setLinkId(String linkId) {
/* 119 */     this.linkId = linkId;
/*     */   }
/*     */ 
/*     */   private void calcute()
/*     */   {
/*     */   }
/*     */ 
/*     */   public byte[] getByteData()
/*     */   {
/* 128 */     calcute();
/*     */ 
/* 130 */     return super.getByteData();
/*     */   }
/*     */ 
/*     */   public void initPropertiesByBytes(byte[] source)
/*     */   {
/* 135 */     if ((source != null) && (source.length >= 44)) {
/* 136 */       SGIPUtils.copyBytes(source, this.submitSequenceNumber, 1, 12, 1);
/* 137 */       SGIPUtils.copyBytes(source, this.reportTypeByte, 13, 1, 1);
/* 138 */       SGIPUtils.copyBytes(source, this.userNumberByte, 14, 21, 1);
/* 139 */       SGIPUtils.copyBytes(source, this.stateByte, 35, 1, 1);
/* 140 */       SGIPUtils.copyBytes(source, this.errorCodeByte, 36, 1, 1);
/* 141 */       SGIPUtils.copyBytes(source, this.reserve, 37, 8, 1);
/* 142 */       this.reportType = SGIPUtils.convertUnsignByte2Int(this.reportTypeByte[0]);
/*     */ 
/* 144 */       this.userNumber = new String(this.userNumberByte);
/* 145 */       this.state = SGIPUtils.convertUnsignByte2Int(this.stateByte[0]);
/* 146 */       this.errorCode = SGIPUtils.convertUnsignByte2Int(this.errorCodeByte[0]);
/* 147 */       this.linkId = new String(this.reserve).trim();
/*     */     } else {
/* 149 */       logger.error("init Report properties from bytes error: the bytes not enough");
/*     */     }
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 155 */     return "Report [submitSequenceNumberStr=" + getSubmitSequenceNumberStr() + ", reportType=" + this.reportType + ", userNumber=" + this.userNumber + ", state=" + this.state + ", errorCode=" + this.errorCode + ", linkId=" + this.linkId + "]";
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.body.command.Report
 * JD-Core Version:    0.6.2
 */
/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ 
/*    */ public class Report extends SGIPCommand
/*    */ {
/*    */   private String submitSequenceNumber;
/*    */   private byte reportType;
/*    */   private String userNumber;
/*    */   private byte state;
/*    */   private byte errorCode;
/*    */   private String reverse;
/*    */ 
/*    */   public Report(SGIPCommand command)
/*    */   {
/* 21 */     this.header = command.header;
/* 22 */     this.bodybytes = command.bodybytes;
/*    */ 
/* 24 */     int curr_index = 0;
/*    */ 
/* 26 */     byte[] tmpBytes = null;
/*    */ 
/* 28 */     tmpBytes = new byte[5];
/* 29 */     System.arraycopy(this.bodybytes, curr_index, tmpBytes, 1, 4);
/* 30 */     this.submitSequenceNumber = new BigInteger(tmpBytes).toString();
/* 31 */     curr_index += 4;
/*    */ 
/* 33 */     tmpBytes = new byte[4];
/* 34 */     System.arraycopy(this.bodybytes, curr_index, tmpBytes, 0, 4);
/* 35 */     this.submitSequenceNumber += SGIPCommand.Bytes4ToInt(tmpBytes);
/* 36 */     curr_index += 4;
/*    */ 
/* 38 */     tmpBytes = new byte[4];
/* 39 */     System.arraycopy(this.bodybytes, curr_index, tmpBytes, 0, 4);
/* 40 */     this.submitSequenceNumber += SGIPCommand.Bytes4ToInt(tmpBytes);
/* 41 */     curr_index += 4;
/*    */ 
/* 43 */     this.reportType = this.bodybytes[curr_index];
/* 44 */     curr_index++;
/*    */ 
/* 46 */     byte[] userNumberBytes = new byte[21];
/* 47 */     System.arraycopy(this.bodybytes, curr_index, userNumberBytes, 0, 21);
/* 48 */     this.userNumber = new String(userNumberBytes).trim();
/* 49 */     curr_index += 21;
/*    */ 
/* 51 */     this.state = this.bodybytes[curr_index];
/* 52 */     curr_index++;
/*    */ 
/* 54 */     this.errorCode = this.bodybytes[curr_index];
/* 55 */     curr_index++;
/*    */ 
/* 57 */     byte[] reverseBytes = new byte[8];
/* 58 */     System.arraycopy(this.bodybytes, curr_index, reverseBytes, 0, 8);
/* 59 */     this.reverse = new String(reverseBytes).trim();
/*    */   }
/*    */   public String getSubmitSequenceNumber() {
/* 62 */     return this.submitSequenceNumber;
/*    */   }
/*    */   public byte getReportType() {
/* 65 */     return this.reportType;
/*    */   }
/*    */   public String getUserNumber() {
/* 68 */     return this.userNumber;
/*    */   }
/*    */   public byte getState() {
/* 71 */     return this.state;
/*    */   }
/*    */   public byte getErrorCode() {
/* 74 */     return this.errorCode;
/*    */   }
/*    */   public String getReverse() {
/* 77 */     return this.reverse;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.Report
 * JD-Core Version:    0.6.2
 */
/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class ReportResp extends SGIPCommand
/*    */ {
/*    */   private byte result;
/*    */ 
/*    */   public ReportResp(byte[] unicomSN)
/*    */   {
/* 13 */     this.header = new SGIPHeader(SGIPCommandDefine.SGIP_REPORT_RESP);
/* 14 */     this.header.setUnicomSN(unicomSN);
/* 15 */     this.bodybytes = new byte[9];
/*    */   }
/*    */ 
/*    */   public void setResult(byte result) {
/* 19 */     this.result = result;
/* 20 */     this.bodybytes[0] = result;
/*    */   }
/*    */ 
/*    */   public byte getResult() {
/* 24 */     return this.result;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.ReportResp
 * JD-Core Version:    0.6.2
 */
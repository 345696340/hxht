/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class UserRptResp extends SGIPCommand
/*    */ {
/*    */   private byte result;
/*    */   private String reserve;
/*    */ 
/*    */   public UserRptResp(byte[] unicomSN)
/*    */   {
/* 14 */     this.header = new SGIPHeader(SGIPCommandDefine.SGIP_USERRPT_RESP);
/* 15 */     this.header.setUnicomSN(unicomSN);
/* 16 */     this.bodybytes = new byte[9];
/*    */   }
/*    */ 
/*    */   public byte getResult() {
/* 20 */     return this.result;
/*    */   }
/*    */ 
/*    */   public void setResult(byte result)
/*    */   {
/* 25 */     this.result = result;
/* 26 */     this.bodybytes[0] = result;
/*    */ 
/* 28 */     byte[] reserveByte = new byte[8];
/* 29 */     System.arraycopy(this.reserve.getBytes(), 0, reserveByte, 0, this.reserve.length());
/* 30 */     System.arraycopy(reserveByte, 0, this.bodybytes, 1, 8);
/*    */   }
/*    */ 
/*    */   public String getReserve() {
/* 34 */     return this.reserve;
/*    */   }
/*    */ 
/*    */   public void setReserve(String reserve) {
/* 38 */     this.reserve = reserve;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.UserRptResp
 * JD-Core Version:    0.6.2
 */
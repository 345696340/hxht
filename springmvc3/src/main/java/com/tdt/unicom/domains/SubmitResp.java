/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class SubmitResp extends SGIPCommand
/*    */ {
/*    */   private byte result;
/*    */   private String reserve;
/*    */ 
/*    */   public SubmitResp(SGIPCommand command)
/*    */   {
/* 14 */     this.header = command.header;
/* 15 */     this.result = command.bodybytes[0];
/*    */   }
/*    */   public byte getResult() {
/* 18 */     return this.result;
/*    */   }
/*    */   public void setResult(byte result) {
/* 21 */     this.result = result;
/*    */   }
/*    */   public String getReserve() {
/* 24 */     return this.reserve;
/*    */   }
/*    */   public void setReserve(String reserve) {
/* 27 */     this.reserve = reserve;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.SubmitResp
 * JD-Core Version:    0.6.2
 */
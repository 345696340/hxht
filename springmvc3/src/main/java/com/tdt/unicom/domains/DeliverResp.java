/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class DeliverResp extends SGIPCommand
/*    */ {
/*    */   private byte result;
/* 12 */   private String reserve = "";
/*    */ 
/*    */   public DeliverResp(byte[] unicomSN) {
/* 15 */     this.header = new SGIPHeader(SGIPCommandDefine.SGIP_DELIVER_RESP);
/* 16 */     this.header.setUnicomSN(unicomSN);
/* 17 */     this.bodybytes = new byte[9];
/*    */ 
/* 19 */     byte[] reserveByte = new byte[8];
/* 20 */     System.arraycopy(this.reserve.getBytes(), 0, reserveByte, 0, this.reserve.length());
/* 21 */     System.arraycopy(reserveByte, 0, this.bodybytes, 1, 8);
/*    */   }
/*    */ 
/*    */   public DeliverResp(SGIPCommand command) {
/* 25 */     this.result = command.bodybytes[0];
/*    */ 
/* 27 */     byte[] reserveBytes = new byte[8];
/* 28 */     System.arraycopy(command.bodybytes, 1, reserveBytes, 0, 8);
/* 29 */     this.reserve = new String(reserveBytes);
/*    */   }
/*    */ 
/*    */   public byte getResult()
/*    */   {
/* 34 */     return this.result;
/*    */   }
/*    */ 
/*    */   public void setResult(byte result) {
/* 38 */     this.result = result;
/* 39 */     this.bodybytes[0] = result;
/*    */   }
/*    */ 
/*    */   public String getReserve() {
/* 43 */     return this.reserve;
/*    */   }
/*    */ 
/*    */   public void setReserve(String reserve) {
/* 47 */     this.reserve = reserve;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.DeliverResp
 * JD-Core Version:    0.6.2
 */
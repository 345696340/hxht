/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class BindResp extends SGIPCommand
/*    */ {
/*    */   private byte result;
/* 11 */   private String reserve = "";
/*    */ 
/*    */   public BindResp(byte[] unicomSN) {
/* 14 */     this.header = new SGIPHeader(SGIPCommandDefine.SGIP_BIND_RESP);
/* 15 */     this.header.setUnicomSN(unicomSN);
/* 16 */     this.bodybytes = new byte[9];
/*    */ 
/* 18 */     byte[] reserveByte = new byte[8];
/* 19 */     System.arraycopy(this.reserve.getBytes(), 0, reserveByte, 0, this.reserve.length());
/* 20 */     System.arraycopy(reserveByte, 0, this.bodybytes, 1, 8);
/*    */   }
/*    */   public BindResp(SGIPCommand command) {
/* 23 */     this.header = command.header;
/* 24 */     this.bodybytes = command.bodybytes;
/*    */ 
/* 26 */     this.result = command.bodybytes[0];
/*    */ 
/* 28 */     byte[] reserveBytes = new byte[8];
/* 29 */     System.arraycopy(command.bodybytes, 1, reserveBytes, 0, 8);
/* 30 */     this.reserve = new String(reserveBytes);
/*    */   }
/*    */ 
/*    */   public int getResult() {
/* 34 */     return this.result;
/*    */   }
/*    */   public String getReserve() {
/* 37 */     return this.reserve;
/*    */   }
/*    */   public void setResult(byte result) {
/* 40 */     this.result = result;
/* 41 */     this.bodybytes[0] = result;
/*    */   }
/*    */   public void setReserve(String reserve) {
/* 44 */     this.reserve = reserve;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.BindResp
 * JD-Core Version:    0.6.2
 */
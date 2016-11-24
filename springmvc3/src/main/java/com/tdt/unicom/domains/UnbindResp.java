/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class UnbindResp extends SGIPCommand
/*    */ {
/*    */   public UnbindResp(byte[] unicomSN)
/*    */   {
/* 11 */     this.header = new SGIPHeader(SGIPCommandDefine.SGIP_UNBIND_RESP);
/* 12 */     this.header.setUnicomSN(unicomSN);
/*    */   }
/*    */   public UnbindResp(SGIPCommand command) {
/* 15 */     this.header = command.header;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.UnbindResp
 * JD-Core Version:    0.6.2
 */
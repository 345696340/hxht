/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class Unbind extends SGIPCommand
/*    */ {
/*    */   public Unbind()
/*    */   {
/* 12 */     this.header = new SGIPHeader(SGIPCommandDefine.SGIP_UNBIND);
/*    */   }
/*    */ 
/*    */   public Unbind(SGIPCommand command) {
/* 16 */     this.header = command.header;
/* 17 */     this.bodybytes = command.bodybytes;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.Unbind
 * JD-Core Version:    0.6.2
 */
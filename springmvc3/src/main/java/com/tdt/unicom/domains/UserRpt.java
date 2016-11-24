/*    */ package com.tdt.unicom.domains;
/*    */ 
/*    */ public class UserRpt extends SGIPCommand
/*    */ {
/*    */   private String SPNumber;
/*    */   private String userNumber;
/*    */   private byte userCondition;
/*    */   private String reserve;
/*    */ 
/*    */   public UserRpt(SGIPCommand command)
/*    */   {
/* 16 */     this.header = command.header;
/* 17 */     this.bodybytes = command.bodybytes;
/*    */ 
/* 19 */     this.SPNumber = new String(this.bodybytes, 0, 21).trim();
/* 20 */     this.userNumber = new String(this.bodybytes, 21, 21).trim();
/* 21 */     this.userCondition = this.bodybytes[42];
/* 22 */     this.reserve = new String(this.bodybytes, 43, 8);
/*    */   }
/*    */ 
/*    */   public String getSPNumber() {
/* 26 */     return this.SPNumber;
/*    */   }
/*    */ 
/*    */   public String getUserNumber() {
/* 30 */     return this.userNumber;
/*    */   }
/*    */ 
/*    */   public byte getUserCondition() {
/* 34 */     return this.userCondition;
/*    */   }
/*    */ 
/*    */   public String getReserve() {
/* 38 */     return this.reserve;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.domains.UserRpt
 * JD-Core Version:    0.6.2
 */
/*    */ package com.game.server.model.dto;
/*    */ 
/*    */ public class PayOrderBack
/*    */ {
/*    */   private Long uid;
/*    */   private String mobile;
/*    */   private Long isBack;
/*    */ 
/*    */   public Long getUid()
/*    */   {
/* 37 */     return this.uid;
/*    */   }
/*    */ 
/*    */   public void setUid(Long uid)
/*    */   {
/* 49 */     this.uid = uid;
/*    */   }
/*    */ 
/*    */   public String getMobile()
/*    */   {
/* 61 */     return this.mobile;
/*    */   }
/*    */ 
/*    */   public void setMobile(String mobile)
/*    */   {
/* 73 */     this.mobile = (mobile == null ? null : mobile.trim());
/*    */   }
/*    */ 
/*    */   public Long getIsBack()
/*    */   {
/* 85 */     return this.isBack;
/*    */   }
/*    */ 
/*    */   public void setIsBack(Long isBack)
/*    */   {
/* 97 */     this.isBack = isBack;
/*    */   }
/*    */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderBack
 * JD-Core Version:    0.6.2
 */
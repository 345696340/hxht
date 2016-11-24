/*    */ package com.game.server.model.dto;
/*    */ 
/*    */ public class GameUserKey
/*    */ {
/*    */   private Long uid;
/*    */   private String userId;
/*    */ 
/*    */   public Long getUid()
/*    */   {
/* 29 */     return this.uid;
/*    */   }
/*    */ 
/*    */   public void setUid(Long uid)
/*    */   {
/* 41 */     this.uid = uid;
/*    */   }
/*    */ 
/*    */   public String getUserId()
/*    */   {
/* 53 */     return this.userId;
/*    */   }
/*    */ 
/*    */   public void setUserId(String userId)
/*    */   {
/* 65 */     this.userId = (userId == null ? null : userId.trim());
/*    */   }
/*    */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GameUserKey
 * JD-Core Version:    0.6.2
 */
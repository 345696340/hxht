/*    */ package com.game.server.domain;
/*    */ 
/*    */ public enum DaoEnum
/*    */ {
/*  8 */   myDistributeLogMapperDAO("myUserWagerMapperDAO"), 
/*  9 */   myEverydayCoinpoolMapperDAO("myEverydayCoinpoolMapperDAO"), 
/* 10 */   myUserFriendMapperDAO("myUserFriendMapperDAO"), 
/* 11 */   myUserInfoMapperDAO("myUserInfoMapperDAO"), 
/* 12 */   myUserMatchMapperDAO("myUserMatchMapperDAO"), 
/* 13 */   myUserTransactionMapperDAO("myUserTransactionMapperDAO"), 
/* 14 */   myUserWagerMapperDAO("myUserWagerMapperDAO");
/*    */ 
/* 16 */   private String value = null;
/*    */ 
/* 18 */   private DaoEnum(String value) { this.value = value; }
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 22 */     return this.value;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.domain.DaoEnum
 * JD-Core Version:    0.6.2
 */
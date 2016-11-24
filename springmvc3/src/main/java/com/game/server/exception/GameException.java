/*    */ package com.game.server.exception;
/*    */ 
/*    */ import com.google.gson.annotations.Expose;
/*    */ 
/*    */ public class GameException extends Exception
/*    */ {
/*    */ 
/*    */   @Expose
/*    */   private String code;
/*    */ 
/*    */   @Expose
/*    */   private String info;
/*    */ 
/*    */   public String getInfo()
/*    */   {
/* 13 */     return this.info;
/*    */   }
/*    */ 
/*    */   public void setInfo(String info) {
/* 17 */     this.info = info;
/*    */   }
/*    */ 
/*    */   public String getCode() {
/* 21 */     return this.code;
/*    */   }
/*    */ 
/*    */   public void setCode(String code) {
/* 25 */     this.code = code;
/*    */   }
/*    */ 
/*    */   public GameException(String code, String info) {
/* 29 */     this.code = code;
/* 30 */     this.info = info;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.exception.GameException
 * JD-Core Version:    0.6.2
 */
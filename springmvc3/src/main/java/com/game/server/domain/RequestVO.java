/*    */ package com.game.server.domain;
/*    */ 
/*    */ import com.google.gson.annotations.Expose;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class RequestVO
/*    */ {
/*    */ 
/*    */   @Expose
/*    */   private String token;
/*    */ 
/*    */   @Expose
/* 14 */   private HashMap body = new HashMap();
/*    */ 
/*    */   public HashMap getBody()
/*    */   {
/* 18 */     return this.body;
/*    */   }
/*    */ 
/*    */   public void setBody(HashMap body) {
/* 22 */     this.body = body;
/*    */   }
/*    */ 
/*    */   public String getToken() {
/* 26 */     return this.token;
/*    */   }
/*    */ 
/*    */   public void setToken(String token) {
/* 30 */     this.token = token;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.domain.RequestVO
 * JD-Core Version:    0.6.2
 */
/*    */ package com.game.server.domain;
/*    */ 
/*    */ import com.google.gson.annotations.Expose;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Result extends Throwable
/*    */ {
/*    */ 
/*    */   @Expose
/*    */   public String code;
/*    */ 
/*    */   @Expose
/*    */   public String info;
/*    */ 
/*    */   @Expose
/*    */   public List result;
/*    */ 
/*    */   @Expose
/* 19 */   public HashMap map = new HashMap();
/*    */ 
/*    */   public Result(String code, String info)
/*    */   {
/* 23 */     this.code = code;
/* 24 */     this.info = info;
/*    */   }
/*    */ 
/*    */   public Object getMap(String key) {
/* 28 */     return this.map.get(key);
/*    */   }
/*    */ 
/*    */   public void addMap(String key, Object value) {
/* 32 */     this.map.put(key, value);
/*    */   }
/*    */ 
/*    */   public String getCode() {
/* 36 */     return this.code;
/*    */   }
/*    */ 
/*    */   public void setCode(String code) {
/* 40 */     this.code = code;
/*    */   }
/*    */ 
/*    */   public String getInfo() {
/* 44 */     return this.info;
/*    */   }
/*    */ 
/*    */   public void setInfo(String info) {
/* 48 */     this.info = info;
/*    */   }
/*    */ 
/*    */   public List<Object> getResult() {
/* 52 */     return this.result;
/*    */   }
/*    */ 
/*    */   public void setResult(List result) {
/* 56 */     this.result = result;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.domain.Result
 * JD-Core Version:    0.6.2
 */
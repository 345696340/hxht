/*    */ package com.game.server.vo;
/*    */ 
/*    */ import com.google.gson.annotations.Expose;
/*    */ 
/*    */ public class Result
/*    */ {
/*    */ 
/*    */   @Expose
/*    */   private String cpid;
/*    */ 
/*    */   @Expose
/*    */   private String cp_order_no;
/*    */ 
/*    */   @Expose
/*    */   private String ret_result;
/*    */ 
/*    */   @Expose
/*    */   private String appkey;
/*    */ 
/*    */   @Expose
/*    */   private String platformID;
/*    */ 
/*    */   public String getCpid()
/*    */   {
/* 21 */     return this.cpid;
/*    */   }
/*    */ 
/*    */   public void setCpid(String cpid) {
/* 25 */     this.cpid = cpid;
/*    */   }
/*    */ 
/*    */   public String getCp_order_no() {
/* 29 */     return this.cp_order_no;
/*    */   }
/*    */ 
/*    */   public void setCp_order_no(String cp_order_no) {
/* 33 */     this.cp_order_no = cp_order_no;
/*    */   }
/*    */ 
/*    */   public String getRet_result() {
/* 37 */     return this.ret_result;
/*    */   }
/*    */ 
/*    */   public void setRet_result(String ret_result) {
/* 41 */     this.ret_result = ret_result;
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 45 */     StringBuffer s = new StringBuffer();
/* 46 */     s.append("result=").append(this.ret_result);
/* 47 */     return s.toString();
/*    */   }
/*    */ 
/*    */   public String getAppkey() {
/* 51 */     return this.appkey;
/*    */   }
/*    */ 
/*    */   public void setAppkey(String appkey) {
/* 55 */     this.appkey = appkey;
/*    */   }
/*    */ 
/*    */   public String getPlatformID() {
/* 59 */     return this.platformID;
/*    */   }
/*    */ 
/*    */   public void setPlatformID(String platformID) {
/* 63 */     this.platformID = platformID;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.Result
 * JD-Core Version:    0.6.2
 */
/*    */ package com.game.server.vo.request;
/*    */ 
/*    */ import com.game.server.vo.PayOrderAiPayTradeCommonInfo;
/*    */ import com.thoughtworks.xstream.annotations.XStreamAlias;
/*    */ 
/*    */ @XStreamAlias("AIPAYTRADE")
/*    */ public class PayOrderAiPayTradeRequest
/*    */ {
/*    */ 
/*    */   @XStreamAlias("INFO")
/*    */   private PayOrderAiPayTradeCommonInfo Info;
/*    */ 
/*    */   @XStreamAlias("BODY")
/*    */   private PayOrderAiPayTradeBodyRequest body;
/*    */ 
/*    */   public PayOrderAiPayTradeCommonInfo getInfo()
/*    */   {
/* 18 */     return this.Info;
/*    */   }
/*    */ 
/*    */   public void setInfo(PayOrderAiPayTradeCommonInfo info) {
/* 22 */     this.Info = info;
/*    */   }
/*    */ 
/*    */   public void setBody(PayOrderAiPayTradeBodyRequest body) {
/* 26 */     this.body = body;
/*    */   }
/*    */ 
/*    */   public PayOrderAiPayTradeBodyRequest getBody() {
/* 30 */     return this.body;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.request.PayOrderAiPayTradeRequest
 * JD-Core Version:    0.6.2
 */
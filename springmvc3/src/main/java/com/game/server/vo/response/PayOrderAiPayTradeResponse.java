/*    */ package com.game.server.vo.response;
/*    */ 
/*    */ import com.thoughtworks.xstream.annotations.XStreamAlias;
/*    */ 
/*    */ @XStreamAlias("AIPAYTRADE")
/*    */ public class PayOrderAiPayTradeResponse
/*    */ {
/*    */ 
/*    */   @XStreamAlias("INFO")
/*    */   private PayOrderAiPayTradeInfoResponse Info;
/*    */ 
/*    */   @XStreamAlias("BODY")
/*    */   private PayOrderAiPayTradeBodyResponse body;
/*    */ 
/*    */   public PayOrderAiPayTradeInfoResponse getInfo()
/*    */   {
/* 17 */     return this.Info;
/*    */   }
/*    */ 
/*    */   public void setInfo(PayOrderAiPayTradeInfoResponse info) {
/* 21 */     this.Info = info;
/*    */   }
/*    */ 
/*    */   public void setBody(PayOrderAiPayTradeBodyResponse body) {
/* 25 */     this.body = body;
/*    */   }
/*    */ 
/*    */   public PayOrderAiPayTradeBodyResponse getBody() {
/* 29 */     return this.body;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.response.PayOrderAiPayTradeResponse
 * JD-Core Version:    0.6.2
 */
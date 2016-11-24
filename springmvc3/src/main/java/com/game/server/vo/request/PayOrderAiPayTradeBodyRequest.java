/*    */ package com.game.server.vo.request;
/*    */ 
/*    */ import com.thoughtworks.xstream.annotations.XStreamAlias;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class PayOrderAiPayTradeBodyRequest
/*    */ {
/*    */ 
/*    */   @XStreamAlias("TRANS_SUM")
/*    */   private HashMap transSum;
/*    */ 
/*    */   @XStreamAlias("TRADE_DETAILS")
/* 14 */   private PayOrderAiPayTradeDetailsRequest tradeDetails = new PayOrderAiPayTradeDetailsRequest();
/*    */ 
/*    */   public HashMap getTransSum()
/*    */   {
/* 18 */     return this.transSum;
/*    */   }
/*    */ 
/*    */   public void setTransSum(HashMap transSum) {
/* 22 */     this.transSum = transSum;
/*    */   }
/*    */ 
/*    */   public PayOrderAiPayTradeDetailsRequest getTradeDetails() {
/* 26 */     return this.tradeDetails;
/*    */   }
/*    */ 
/*    */   public void setTradeDetails(PayOrderAiPayTradeDetailsRequest tradeDetails) {
/* 30 */     this.tradeDetails = tradeDetails;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.request.PayOrderAiPayTradeBodyRequest
 * JD-Core Version:    0.6.2
 */
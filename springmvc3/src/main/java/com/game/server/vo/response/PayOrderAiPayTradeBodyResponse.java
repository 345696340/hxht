/*    */ package com.game.server.vo.response;
/*    */ 
/*    */ import com.thoughtworks.xstream.annotations.XStreamAlias;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class PayOrderAiPayTradeBodyResponse
/*    */ {
/*    */ 
/*    */   @XStreamAlias("TRANS_SUM")
/*    */   private HashMap transSum;
/*    */ 
/*    */   @XStreamAlias("TRADE_DETAILS")
/* 14 */   private PayOrderAiPayTradeDetailsResponse tradeDetails = new PayOrderAiPayTradeDetailsResponse();
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
/*    */   public PayOrderAiPayTradeDetailsResponse getTradeDetails() {
/* 26 */     return this.tradeDetails;
/*    */   }
/*    */ 
/*    */   public void setTradeDetails(PayOrderAiPayTradeDetailsResponse tradeDetails) {
/* 30 */     this.tradeDetails = tradeDetails;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.response.PayOrderAiPayTradeBodyResponse
 * JD-Core Version:    0.6.2
 */
/*    */ package com.game.server.vo.response;
/*    */ 
/*    */ import com.game.server.vo.TradeDetail;
/*    */ import com.thoughtworks.xstream.annotations.XStreamImplicit;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class PayOrderAiPayTradeDetailsResponse
/*    */ {
/*    */ 
/*    */   @XStreamImplicit(itemFieldName="TRANS_DETAIL")
/* 14 */   private List<TradeDetail> tradeDetails = new ArrayList();
/*    */ 
/*    */   public List<TradeDetail> getTradeDetails()
/*    */   {
/* 18 */     return this.tradeDetails;
/*    */   }
/*    */ 
/*    */   public void addTradeDetail(TradeDetail tradeDetail) {
/* 22 */     this.tradeDetails.add(tradeDetail);
/*    */   }
/*    */ 
/*    */   public void setTradeDetails(List<TradeDetail> tradeDetails) {
/* 26 */     this.tradeDetails = tradeDetails;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.response.PayOrderAiPayTradeDetailsResponse
 * JD-Core Version:    0.6.2
 */
/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ public class PayOrderConfig3
/*     */   implements Serializable
/*     */ {
/*     */   private Long uid;
/*     */   private String channelId;
/*     */   private Long totalAmount;
/*     */   private String partnerVerifyCode;
/*     */   private String partnerId;
/*     */   private String tradeReservedField1;
/*     */   private String tradeReservedField2;
/*     */   private String tradeReservedField3;
/*     */   private String tradeReservedField4;
/*     */   private String payPlaceOrderPath;
/*     */   private String payRefudOrderPath;
/*     */   private String payQueryOrderPath;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/* 108 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/* 119 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getChannelId()
/*     */   {
/* 130 */     return this.channelId;
/*     */   }
/*     */ 
/*     */   public void setChannelId(String channelId)
/*     */   {
/* 141 */     this.channelId = (channelId == null ? null : channelId.trim());
/*     */   }
/*     */ 
/*     */   public Long getTotalAmount()
/*     */   {
/* 152 */     return this.totalAmount;
/*     */   }
/*     */ 
/*     */   public void setTotalAmount(Long totalAmount)
/*     */   {
/* 163 */     this.totalAmount = totalAmount;
/*     */   }
/*     */ 
/*     */   public String getPartnerVerifyCode()
/*     */   {
/* 174 */     return this.partnerVerifyCode;
/*     */   }
/*     */ 
/*     */   public void setPartnerVerifyCode(String partnerVerifyCode)
/*     */   {
/* 185 */     this.partnerVerifyCode = (partnerVerifyCode == null ? null : partnerVerifyCode.trim());
/*     */   }
/*     */ 
/*     */   public String getPartnerId()
/*     */   {
/* 196 */     return this.partnerId;
/*     */   }
/*     */ 
/*     */   public void setPartnerId(String partnerId)
/*     */   {
/* 207 */     this.partnerId = (partnerId == null ? null : partnerId.trim());
/*     */   }
/*     */ 
/*     */   public String getTradeReservedField1()
/*     */   {
/* 218 */     return this.tradeReservedField1;
/*     */   }
/*     */ 
/*     */   public void setTradeReservedField1(String tradeReservedField1)
/*     */   {
/* 229 */     this.tradeReservedField1 = (tradeReservedField1 == null ? null : tradeReservedField1.trim());
/*     */   }
/*     */ 
/*     */   public String getTradeReservedField2()
/*     */   {
/* 240 */     return this.tradeReservedField2;
/*     */   }
/*     */ 
/*     */   public void setTradeReservedField2(String tradeReservedField2)
/*     */   {
/* 251 */     this.tradeReservedField2 = (tradeReservedField2 == null ? null : tradeReservedField2.trim());
/*     */   }
/*     */ 
/*     */   public String getTradeReservedField3()
/*     */   {
/* 262 */     return this.tradeReservedField3;
/*     */   }
/*     */ 
/*     */   public void setTradeReservedField3(String tradeReservedField3)
/*     */   {
/* 273 */     this.tradeReservedField3 = (tradeReservedField3 == null ? null : tradeReservedField3.trim());
/*     */   }
/*     */ 
/*     */   public String getTradeReservedField4()
/*     */   {
/* 284 */     return this.tradeReservedField4;
/*     */   }
/*     */ 
/*     */   public void setTradeReservedField4(String tradeReservedField4)
/*     */   {
/* 295 */     this.tradeReservedField4 = (tradeReservedField4 == null ? null : tradeReservedField4.trim());
/*     */   }
/*     */ 
/*     */   public String getPayPlaceOrderPath()
/*     */   {
/* 306 */     return this.payPlaceOrderPath;
/*     */   }
/*     */ 
/*     */   public void setPayPlaceOrderPath(String payPlaceOrderPath)
/*     */   {
/* 317 */     this.payPlaceOrderPath = (payPlaceOrderPath == null ? null : payPlaceOrderPath.trim());
/*     */   }
/*     */ 
/*     */   public String getPayRefudOrderPath()
/*     */   {
/* 328 */     return this.payRefudOrderPath;
/*     */   }
/*     */ 
/*     */   public void setPayRefudOrderPath(String payRefudOrderPath)
/*     */   {
/* 339 */     this.payRefudOrderPath = (payRefudOrderPath == null ? null : payRefudOrderPath.trim());
/*     */   }
/*     */ 
/*     */   public String getPayQueryOrderPath()
/*     */   {
/* 350 */     return this.payQueryOrderPath;
/*     */   }
/*     */ 
/*     */   public void setPayQueryOrderPath(String payQueryOrderPath)
/*     */   {
/* 361 */     this.payQueryOrderPath = (payQueryOrderPath == null ? null : payQueryOrderPath.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderConfig3
 * JD-Core Version:    0.6.2
 */
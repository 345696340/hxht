/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class GamePay
/*     */ {
/*     */   private Long uid;
/*     */   private Long userId;
/*     */   private Date createDate;
/*     */   private String resCode;
/*     */   private String resDesc;
/*     */   private String orderId;
/*     */   private String price;
/*     */   private String businessName;
/*     */   private String companyName;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/*  87 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/*  99 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public Long getUserId()
/*     */   {
/* 111 */     return this.userId;
/*     */   }
/*     */ 
/*     */   public void setUserId(Long userId)
/*     */   {
/* 123 */     this.userId = userId;
/*     */   }
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 135 */     return this.createDate;
/*     */   }
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 147 */     this.createDate = createDate;
/*     */   }
/*     */ 
/*     */   public String getResCode()
/*     */   {
/* 159 */     return this.resCode;
/*     */   }
/*     */ 
/*     */   public void setResCode(String resCode)
/*     */   {
/* 171 */     this.resCode = (resCode == null ? null : resCode.trim());
/*     */   }
/*     */ 
/*     */   public String getResDesc()
/*     */   {
/* 183 */     return this.resDesc;
/*     */   }
/*     */ 
/*     */   public void setResDesc(String resDesc)
/*     */   {
/* 195 */     this.resDesc = (resDesc == null ? null : resDesc.trim());
/*     */   }
/*     */ 
/*     */   public String getOrderId()
/*     */   {
/* 207 */     return this.orderId;
/*     */   }
/*     */ 
/*     */   public void setOrderId(String orderId)
/*     */   {
/* 219 */     this.orderId = (orderId == null ? null : orderId.trim());
/*     */   }
/*     */ 
/*     */   public String getPrice()
/*     */   {
/* 231 */     return this.price;
/*     */   }
/*     */ 
/*     */   public void setPrice(String price)
/*     */   {
/* 243 */     this.price = (price == null ? null : price.trim());
/*     */   }
/*     */ 
/*     */   public String getBusinessName()
/*     */   {
/* 255 */     return this.businessName;
/*     */   }
/*     */ 
/*     */   public void setBusinessName(String businessName)
/*     */   {
/* 267 */     this.businessName = (businessName == null ? null : businessName.trim());
/*     */   }
/*     */ 
/*     */   public String getCompanyName()
/*     */   {
/* 279 */     return this.companyName;
/*     */   }
/*     */ 
/*     */   public void setCompanyName(String companyName)
/*     */   {
/* 291 */     this.companyName = (companyName == null ? null : companyName.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GamePay
 * JD-Core Version:    0.6.2
 */
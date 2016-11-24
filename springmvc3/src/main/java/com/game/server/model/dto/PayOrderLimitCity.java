/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class PayOrderLimitCity
/*     */ {
/*     */   private Long uid;
/*     */   private Long limitId;
/*     */   private Long cityId;
/*     */   private String cityName;
/*     */   private Date created;
/*     */   private Long provinceId;
/*     */   private String rrovinceName;
/*     */   private Long dateLimitAmont;
/*     */   private Long monthLimitAmont;
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
/*     */   public Long getLimitId()
/*     */   {
/* 111 */     return this.limitId;
/*     */   }
/*     */ 
/*     */   public void setLimitId(Long limitId)
/*     */   {
/* 123 */     this.limitId = limitId;
/*     */   }
/*     */ 
/*     */   public Long getCityId()
/*     */   {
/* 135 */     return this.cityId;
/*     */   }
/*     */ 
/*     */   public void setCityId(Long cityId)
/*     */   {
/* 147 */     this.cityId = cityId;
/*     */   }
/*     */ 
/*     */   public String getCityName()
/*     */   {
/* 159 */     return this.cityName;
/*     */   }
/*     */ 
/*     */   public void setCityName(String cityName)
/*     */   {
/* 171 */     this.cityName = (cityName == null ? null : cityName.trim());
/*     */   }
/*     */ 
/*     */   public Date getCreated()
/*     */   {
/* 183 */     return this.created;
/*     */   }
/*     */ 
/*     */   public void setCreated(Date created)
/*     */   {
/* 195 */     this.created = created;
/*     */   }
/*     */ 
/*     */   public Long getProvinceId()
/*     */   {
/* 207 */     return this.provinceId;
/*     */   }
/*     */ 
/*     */   public void setProvinceId(Long provinceId)
/*     */   {
/* 219 */     this.provinceId = provinceId;
/*     */   }
/*     */ 
/*     */   public String getRrovinceName()
/*     */   {
/* 231 */     return this.rrovinceName;
/*     */   }
/*     */ 
/*     */   public void setRrovinceName(String rrovinceName)
/*     */   {
/* 243 */     this.rrovinceName = (rrovinceName == null ? null : rrovinceName.trim());
/*     */   }
/*     */ 
/*     */   public Long getDateLimitAmont()
/*     */   {
/* 255 */     return this.dateLimitAmont;
/*     */   }
/*     */ 
/*     */   public void setDateLimitAmont(Long dateLimitAmont)
/*     */   {
/* 267 */     this.dateLimitAmont = dateLimitAmont;
/*     */   }
/*     */ 
/*     */   public Long getMonthLimitAmont()
/*     */   {
/* 279 */     return this.monthLimitAmont;
/*     */   }
/*     */ 
/*     */   public void setMonthLimitAmont(Long monthLimitAmont)
/*     */   {
/* 291 */     this.monthLimitAmont = monthLimitAmont;
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderLimitCity
 * JD-Core Version:    0.6.2
 */
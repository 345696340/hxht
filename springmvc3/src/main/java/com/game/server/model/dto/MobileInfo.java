/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ public class MobileInfo
/*     */ {
/*     */   private Long uid;
/*     */   private Long mobile;
/*     */   private Long cityId;
/*     */   private String cityName;
/*     */   private Long provinceId;
/*     */   private String provinceName;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/*  61 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/*  73 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public Long getMobile()
/*     */   {
/*  85 */     return this.mobile;
/*     */   }
/*     */ 
/*     */   public void setMobile(Long mobile)
/*     */   {
/*  97 */     this.mobile = mobile;
/*     */   }
/*     */ 
/*     */   public Long getCityId()
/*     */   {
/* 109 */     return this.cityId;
/*     */   }
/*     */ 
/*     */   public void setCityId(Long cityId)
/*     */   {
/* 121 */     this.cityId = cityId;
/*     */   }
/*     */ 
/*     */   public String getCityName()
/*     */   {
/* 133 */     return this.cityName;
/*     */   }
/*     */ 
/*     */   public void setCityName(String cityName)
/*     */   {
/* 145 */     this.cityName = (cityName == null ? null : cityName.trim());
/*     */   }
/*     */ 
/*     */   public Long getProvinceId()
/*     */   {
/* 157 */     return this.provinceId;
/*     */   }
/*     */ 
/*     */   public void setProvinceId(Long provinceId)
/*     */   {
/* 169 */     this.provinceId = provinceId;
/*     */   }
/*     */ 
/*     */   public String getProvinceName()
/*     */   {
/* 181 */     return this.provinceName;
/*     */   }
/*     */ 
/*     */   public void setProvinceName(String provinceName)
/*     */   {
/* 193 */     this.provinceName = (provinceName == null ? null : provinceName.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.MobileInfo
 * JD-Core Version:    0.6.2
 */
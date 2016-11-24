/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class SmsPayOrder
/*     */ {
/*     */   private Long uid;
/*     */   private String content;
/*     */   private Integer feeType;
/*     */   private String feeValue;
/*     */   private String linkId;
/*     */   private Date submitDate;
/*     */   private Integer reprotStatus;
/*     */   private Date reprotDate;
/*     */   private String userNumber;
/*     */   private Long errorCode;
/*     */   private String seqNumber;
/*     */   private String cpContent;
/*     */   private String limitId;
/*     */   private Long isTd;
/*     */   private Date tdDate;
/*     */   private Long provinceId;
/*     */   private String provinceName;
/*     */   private Long cityCode;
/*     */   private String cityName;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/* 167 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/* 179 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getContent()
/*     */   {
/* 191 */     return this.content;
/*     */   }
/*     */ 
/*     */   public void setContent(String content)
/*     */   {
/* 203 */     this.content = (content == null ? null : content.trim());
/*     */   }
/*     */ 
/*     */   public Integer getFeeType()
/*     */   {
/* 215 */     return this.feeType;
/*     */   }
/*     */ 
/*     */   public void setFeeType(Integer feeType)
/*     */   {
/* 227 */     this.feeType = feeType;
/*     */   }
/*     */ 
/*     */   public String getFeeValue()
/*     */   {
/* 239 */     return this.feeValue;
/*     */   }
/*     */ 
/*     */   public void setFeeValue(String feeValue)
/*     */   {
/* 251 */     this.feeValue = (feeValue == null ? null : feeValue.trim());
/*     */   }
/*     */ 
/*     */   public String getLinkId()
/*     */   {
/* 263 */     return this.linkId;
/*     */   }
/*     */ 
/*     */   public void setLinkId(String linkId)
/*     */   {
/* 275 */     this.linkId = (linkId == null ? null : linkId.trim());
/*     */   }
/*     */ 
/*     */   public Date getSubmitDate()
/*     */   {
/* 287 */     return this.submitDate;
/*     */   }
/*     */ 
/*     */   public void setSubmitDate(Date submitDate)
/*     */   {
/* 299 */     this.submitDate = submitDate;
/*     */   }
/*     */ 
/*     */   public Integer getReprotStatus()
/*     */   {
/* 311 */     return this.reprotStatus;
/*     */   }
/*     */ 
/*     */   public void setReprotStatus(Integer reprotStatus)
/*     */   {
/* 323 */     this.reprotStatus = reprotStatus;
/*     */   }
/*     */ 
/*     */   public Date getReprotDate()
/*     */   {
/* 335 */     return this.reprotDate;
/*     */   }
/*     */ 
/*     */   public void setReprotDate(Date reprotDate)
/*     */   {
/* 347 */     this.reprotDate = reprotDate;
/*     */   }
/*     */ 
/*     */   public String getUserNumber()
/*     */   {
/* 359 */     return this.userNumber;
/*     */   }
/*     */ 
/*     */   public void setUserNumber(String userNumber)
/*     */   {
/* 371 */     this.userNumber = (userNumber == null ? null : userNumber.trim());
/*     */   }
/*     */ 
/*     */   public Long getErrorCode()
/*     */   {
/* 383 */     return this.errorCode;
/*     */   }
/*     */ 
/*     */   public void setErrorCode(Long errorCode)
/*     */   {
/* 395 */     this.errorCode = errorCode;
/*     */   }
/*     */ 
/*     */   public String getSeqNumber()
/*     */   {
/* 407 */     return this.seqNumber;
/*     */   }
/*     */ 
/*     */   public void setSeqNumber(String seqNumber)
/*     */   {
/* 419 */     this.seqNumber = (seqNumber == null ? null : seqNumber.trim());
/*     */   }
/*     */ 
/*     */   public String getCpContent()
/*     */   {
/* 431 */     return this.cpContent;
/*     */   }
/*     */ 
/*     */   public void setCpContent(String cpContent)
/*     */   {
/* 443 */     this.cpContent = (cpContent == null ? null : cpContent.trim());
/*     */   }
/*     */ 
/*     */   public String getLimitId()
/*     */   {
/* 455 */     return this.limitId;
/*     */   }
/*     */ 
/*     */   public void setLimitId(String limitId)
/*     */   {
/* 467 */     this.limitId = (limitId == null ? null : limitId.trim());
/*     */   }
/*     */ 
/*     */   public Long getIsTd()
/*     */   {
/* 479 */     return this.isTd;
/*     */   }
/*     */ 
/*     */   public void setIsTd(Long isTd)
/*     */   {
/* 491 */     this.isTd = isTd;
/*     */   }
/*     */ 
/*     */   public Date getTdDate()
/*     */   {
/* 503 */     return this.tdDate;
/*     */   }
/*     */ 
/*     */   public void setTdDate(Date tdDate)
/*     */   {
/* 515 */     this.tdDate = tdDate;
/*     */   }
/*     */ 
/*     */   public Long getProvinceId()
/*     */   {
/* 527 */     return this.provinceId;
/*     */   }
/*     */ 
/*     */   public void setProvinceId(Long provinceId)
/*     */   {
/* 539 */     this.provinceId = provinceId;
/*     */   }
/*     */ 
/*     */   public String getProvinceName()
/*     */   {
/* 551 */     return this.provinceName;
/*     */   }
/*     */ 
/*     */   public void setProvinceName(String provinceName)
/*     */   {
/* 563 */     this.provinceName = (provinceName == null ? null : provinceName.trim());
/*     */   }
/*     */ 
/*     */   public Long getCityCode()
/*     */   {
/* 575 */     return this.cityCode;
/*     */   }
/*     */ 
/*     */   public void setCityCode(Long cityCode)
/*     */   {
/* 587 */     this.cityCode = cityCode;
/*     */   }
/*     */ 
/*     */   public String getCityName()
/*     */   {
/* 599 */     return this.cityName;
/*     */   }
/*     */ 
/*     */   public void setCityName(String cityName)
/*     */   {
/* 611 */     this.cityName = (cityName == null ? null : cityName.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.SmsPayOrder
 * JD-Core Version:    0.6.2
 */
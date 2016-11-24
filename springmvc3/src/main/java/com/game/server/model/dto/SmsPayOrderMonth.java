/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class SmsPayOrderMonth
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
/*     */   private String tableName;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/* 168 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/* 179 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getContent()
/*     */   {
/* 190 */     return this.content;
/*     */   }
/*     */ 
/*     */   public void setContent(String content)
/*     */   {
/* 201 */     this.content = (content == null ? null : content.trim());
/*     */   }
/*     */ 
/*     */   public Integer getFeeType()
/*     */   {
/* 212 */     return this.feeType;
/*     */   }
/*     */ 
/*     */   public void setFeeType(Integer feeType)
/*     */   {
/* 223 */     this.feeType = feeType;
/*     */   }
/*     */ 
/*     */   public String getFeeValue()
/*     */   {
/* 234 */     return this.feeValue;
/*     */   }
/*     */ 
/*     */   public void setFeeValue(String feeValue)
/*     */   {
/* 245 */     this.feeValue = (feeValue == null ? null : feeValue.trim());
/*     */   }
/*     */ 
/*     */   public String getLinkId()
/*     */   {
/* 256 */     return this.linkId;
/*     */   }
/*     */ 
/*     */   public void setLinkId(String linkId)
/*     */   {
/* 267 */     this.linkId = (linkId == null ? null : linkId.trim());
/*     */   }
/*     */ 
/*     */   public Date getSubmitDate()
/*     */   {
/* 278 */     return this.submitDate;
/*     */   }
/*     */ 
/*     */   public void setSubmitDate(Date submitDate)
/*     */   {
/* 289 */     this.submitDate = submitDate;
/*     */   }
/*     */ 
/*     */   public Integer getReprotStatus()
/*     */   {
/* 300 */     return this.reprotStatus;
/*     */   }
/*     */ 
/*     */   public void setReprotStatus(Integer reprotStatus)
/*     */   {
/* 311 */     this.reprotStatus = reprotStatus;
/*     */   }
/*     */ 
/*     */   public Date getReprotDate()
/*     */   {
/* 322 */     return this.reprotDate;
/*     */   }
/*     */ 
/*     */   public void setReprotDate(Date reprotDate)
/*     */   {
/* 333 */     this.reprotDate = reprotDate;
/*     */   }
/*     */ 
/*     */   public String getUserNumber()
/*     */   {
/* 344 */     return this.userNumber;
/*     */   }
/*     */ 
/*     */   public void setUserNumber(String userNumber)
/*     */   {
/* 355 */     this.userNumber = (userNumber == null ? null : userNumber.trim());
/*     */   }
/*     */ 
/*     */   public Long getErrorCode()
/*     */   {
/* 366 */     return this.errorCode;
/*     */   }
/*     */ 
/*     */   public void setErrorCode(Long errorCode)
/*     */   {
/* 377 */     this.errorCode = errorCode;
/*     */   }
/*     */ 
/*     */   public String getSeqNumber()
/*     */   {
/* 388 */     return this.seqNumber;
/*     */   }
/*     */ 
/*     */   public void setSeqNumber(String seqNumber)
/*     */   {
/* 399 */     this.seqNumber = (seqNumber == null ? null : seqNumber.trim());
/*     */   }
/*     */ 
/*     */   public String getCpContent()
/*     */   {
/* 410 */     return this.cpContent;
/*     */   }
/*     */ 
/*     */   public void setCpContent(String cpContent)
/*     */   {
/* 421 */     this.cpContent = (cpContent == null ? null : cpContent.trim());
/*     */   }
/*     */ 
/*     */   public String getLimitId()
/*     */   {
/* 432 */     return this.limitId;
/*     */   }
/*     */ 
/*     */   public void setLimitId(String limitId)
/*     */   {
/* 443 */     this.limitId = (limitId == null ? null : limitId.trim());
/*     */   }
/*     */ 
/*     */   public Long getIsTd()
/*     */   {
/* 454 */     return this.isTd;
/*     */   }
/*     */ 
/*     */   public void setIsTd(Long isTd)
/*     */   {
/* 465 */     this.isTd = isTd;
/*     */   }
/*     */ 
/*     */   public Date getTdDate()
/*     */   {
/* 476 */     return this.tdDate;
/*     */   }
/*     */ 
/*     */   public void setTdDate(Date tdDate)
/*     */   {
/* 487 */     this.tdDate = tdDate;
/*     */   }
/*     */ 
/*     */   public Long getProvinceId()
/*     */   {
/* 498 */     return this.provinceId;
/*     */   }
/*     */ 
/*     */   public void setProvinceId(Long provinceId)
/*     */   {
/* 509 */     this.provinceId = provinceId;
/*     */   }
/*     */ 
/*     */   public String getProvinceName()
/*     */   {
/* 520 */     return this.provinceName;
/*     */   }
/*     */ 
/*     */   public void setProvinceName(String provinceName)
/*     */   {
/* 531 */     this.provinceName = (provinceName == null ? null : provinceName.trim());
/*     */   }
/*     */ 
/*     */   public Long getCityCode()
/*     */   {
/* 542 */     return this.cityCode;
/*     */   }
/*     */ 
/*     */   public void setCityCode(Long cityCode)
/*     */   {
/* 553 */     this.cityCode = cityCode;
/*     */   }
/*     */ 
/*     */   public String getCityName()
/*     */   {
/* 564 */     return this.cityName;
/*     */   }
/*     */ 
/*     */   public void setCityName(String cityName)
/*     */   {
/* 575 */     this.cityName = (cityName == null ? null : cityName.trim());
/*     */   }
/*     */ 
/*     */   public String getTableName() {
/* 579 */     return this.tableName;
/*     */   }
/*     */ 
/*     */   public void setTableName(String tableName) {
/* 583 */     this.tableName = tableName;
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.SmsPayOrderMonth
 * JD-Core Version:    0.6.2
 */
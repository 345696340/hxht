/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class PayOrderGameConfig
/*     */ {
/*     */   private Long uid;
/*     */   private Long spnumber;
/*     */   private String moUrl;
/*     */   private String mrUrl;
/*     */   private Integer off;
/*     */   private Date created;
/*     */   private Long cpid;
/*     */   private String content;
/*     */   private String contentName;
/*     */   private Integer type;
/*     */   private String smsReturnContent;
/*     */   private String limitId;
/*     */   private String serviceType;
/*     */   private String cpContent;
/*     */   private String spContent;
/*     */   private String amont;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/* 143 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/* 155 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public Long getSpnumber()
/*     */   {
/* 167 */     return this.spnumber;
/*     */   }
/*     */ 
/*     */   public void setSpnumber(Long spnumber)
/*     */   {
/* 179 */     this.spnumber = spnumber;
/*     */   }
/*     */ 
/*     */   public String getMoUrl()
/*     */   {
/* 191 */     return this.moUrl;
/*     */   }
/*     */ 
/*     */   public void setMoUrl(String moUrl)
/*     */   {
/* 203 */     this.moUrl = (moUrl == null ? null : moUrl.trim());
/*     */   }
/*     */ 
/*     */   public String getMrUrl()
/*     */   {
/* 215 */     return this.mrUrl;
/*     */   }
/*     */ 
/*     */   public void setMrUrl(String mrUrl)
/*     */   {
/* 227 */     this.mrUrl = (mrUrl == null ? null : mrUrl.trim());
/*     */   }
/*     */ 
/*     */   public Integer getOff()
/*     */   {
/* 239 */     return this.off;
/*     */   }
/*     */ 
/*     */   public void setOff(Integer off)
/*     */   {
/* 251 */     this.off = off;
/*     */   }
/*     */ 
/*     */   public Date getCreated()
/*     */   {
/* 263 */     return this.created;
/*     */   }
/*     */ 
/*     */   public void setCreated(Date created)
/*     */   {
/* 275 */     this.created = created;
/*     */   }
/*     */ 
/*     */   public Long getCpid()
/*     */   {
/* 287 */     return this.cpid;
/*     */   }
/*     */ 
/*     */   public void setCpid(Long cpid)
/*     */   {
/* 299 */     this.cpid = cpid;
/*     */   }
/*     */ 
/*     */   public String getContent()
/*     */   {
/* 311 */     return this.content;
/*     */   }
/*     */ 
/*     */   public void setContent(String content)
/*     */   {
/* 323 */     this.content = (content == null ? null : content.trim());
/*     */   }
/*     */ 
/*     */   public String getContentName()
/*     */   {
/* 335 */     return this.contentName;
/*     */   }
/*     */ 
/*     */   public void setContentName(String contentName)
/*     */   {
/* 347 */     this.contentName = (contentName == null ? null : contentName.trim());
/*     */   }
/*     */ 
/*     */   public Integer getType()
/*     */   {
/* 359 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(Integer type)
/*     */   {
/* 371 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public String getSmsReturnContent()
/*     */   {
/* 383 */     return this.smsReturnContent;
/*     */   }
/*     */ 
/*     */   public void setSmsReturnContent(String smsReturnContent)
/*     */   {
/* 395 */     this.smsReturnContent = (smsReturnContent == null ? null : smsReturnContent.trim());
/*     */   }
/*     */ 
/*     */   public String getLimitId()
/*     */   {
/* 407 */     return this.limitId;
/*     */   }
/*     */ 
/*     */   public void setLimitId(String limitId)
/*     */   {
/* 419 */     this.limitId = (limitId == null ? null : limitId.trim());
/*     */   }
/*     */ 
/*     */   public String getServiceType()
/*     */   {
/* 431 */     return this.serviceType;
/*     */   }
/*     */ 
/*     */   public void setServiceType(String serviceType)
/*     */   {
/* 443 */     this.serviceType = (serviceType == null ? null : serviceType.trim());
/*     */   }
/*     */ 
/*     */   public String getCpContent()
/*     */   {
/* 455 */     return this.cpContent;
/*     */   }
/*     */ 
/*     */   public void setCpContent(String cpContent)
/*     */   {
/* 467 */     this.cpContent = (cpContent == null ? null : cpContent.trim());
/*     */   }
/*     */ 
/*     */   public String getSpContent()
/*     */   {
/* 479 */     return this.spContent;
/*     */   }
/*     */ 
/*     */   public void setSpContent(String spContent)
/*     */   {
/* 491 */     this.spContent = (spContent == null ? null : spContent.trim());
/*     */   }
/*     */ 
/*     */   public String getAmont()
/*     */   {
/* 503 */     return this.amont;
/*     */   }
/*     */ 
/*     */   public void setAmont(String amont)
/*     */   {
/* 515 */     this.amont = (amont == null ? null : amont.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderGameConfig
 * JD-Core Version:    0.6.2
 */
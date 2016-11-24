/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class PayOrderInfo
/*     */   implements Serializable
/*     */ {
/*     */   private Long uid;
/*     */   private Long cpid;
/*     */   private String tradeType;
/*     */   private String operator;
/*     */   private String chargeTime;
/*     */   private Long mobileNum;
/*     */   private String ztOrderNo;
/*     */   private String cpOrderNo;
/*     */   private Integer amount;
/*     */   private String status;
/*     */   private String sign;
/*     */   private Long gate;
/*     */   private String content;
/*     */   private String motime;
/*     */   private String linkid;
/*     */   private Long isReportMo;
/*     */   private Long isReportMr;
/*     */   private Date created;
/*     */   private String contentName;
/*     */   private Long provinceId;
/*     */   private String provinceName;
/*     */   private Long cityCode;
/*     */   private String cityName;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/* 198 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/* 209 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public Long getCpid()
/*     */   {
/* 220 */     return this.cpid;
/*     */   }
/*     */ 
/*     */   public void setCpid(Long cpid)
/*     */   {
/* 231 */     this.cpid = cpid;
/*     */   }
/*     */ 
/*     */   public String getTradeType()
/*     */   {
/* 242 */     return this.tradeType;
/*     */   }
/*     */ 
/*     */   public void setTradeType(String tradeType)
/*     */   {
/* 253 */     this.tradeType = (tradeType == null ? null : tradeType.trim());
/*     */   }
/*     */ 
/*     */   public String getOperator()
/*     */   {
/* 264 */     return this.operator;
/*     */   }
/*     */ 
/*     */   public void setOperator(String operator)
/*     */   {
/* 275 */     this.operator = (operator == null ? null : operator.trim());
/*     */   }
/*     */ 
/*     */   public String getChargeTime()
/*     */   {
/* 286 */     return this.chargeTime;
/*     */   }
/*     */ 
/*     */   public void setChargeTime(String chargeTime)
/*     */   {
/* 297 */     this.chargeTime = (chargeTime == null ? null : chargeTime.trim());
/*     */   }
/*     */ 
/*     */   public Long getMobileNum()
/*     */   {
/* 308 */     return this.mobileNum;
/*     */   }
/*     */ 
/*     */   public void setMobileNum(Long mobileNum)
/*     */   {
/* 319 */     this.mobileNum = mobileNum;
/*     */   }
/*     */ 
/*     */   public String getZtOrderNo()
/*     */   {
/* 330 */     return this.ztOrderNo;
/*     */   }
/*     */ 
/*     */   public void setZtOrderNo(String ztOrderNo)
/*     */   {
/* 341 */     this.ztOrderNo = (ztOrderNo == null ? null : ztOrderNo.trim());
/*     */   }
/*     */ 
/*     */   public String getCpOrderNo()
/*     */   {
/* 352 */     return this.cpOrderNo;
/*     */   }
/*     */ 
/*     */   public void setCpOrderNo(String cpOrderNo)
/*     */   {
/* 363 */     this.cpOrderNo = (cpOrderNo == null ? null : cpOrderNo.trim());
/*     */   }
/*     */ 
/*     */   public Integer getAmount()
/*     */   {
/* 374 */     return this.amount;
/*     */   }
/*     */ 
/*     */   public void setAmount(Integer amount)
/*     */   {
/* 385 */     this.amount = amount;
/*     */   }
/*     */ 
/*     */   public String getStatus()
/*     */   {
/* 396 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status)
/*     */   {
/* 407 */     this.status = (status == null ? null : status.trim());
/*     */   }
/*     */ 
/*     */   public String getSign()
/*     */   {
/* 418 */     return this.sign;
/*     */   }
/*     */ 
/*     */   public void setSign(String sign)
/*     */   {
/* 429 */     this.sign = (sign == null ? null : sign.trim());
/*     */   }
/*     */ 
/*     */   public Long getGate()
/*     */   {
/* 440 */     return this.gate;
/*     */   }
/*     */ 
/*     */   public void setGate(Long gate)
/*     */   {
/* 451 */     this.gate = gate;
/*     */   }
/*     */ 
/*     */   public String getContent()
/*     */   {
/* 462 */     return this.content;
/*     */   }
/*     */ 
/*     */   public void setContent(String content)
/*     */   {
/* 473 */     this.content = (content == null ? null : content.trim());
/*     */   }
/*     */ 
/*     */   public String getMotime()
/*     */   {
/* 484 */     return this.motime;
/*     */   }
/*     */ 
/*     */   public void setMotime(String motime)
/*     */   {
/* 495 */     this.motime = (motime == null ? null : motime.trim());
/*     */   }
/*     */ 
/*     */   public String getLinkid()
/*     */   {
/* 506 */     return this.linkid;
/*     */   }
/*     */ 
/*     */   public void setLinkid(String linkid)
/*     */   {
/* 517 */     this.linkid = (linkid == null ? null : linkid.trim());
/*     */   }
/*     */ 
/*     */   public Long getIsReportMo()
/*     */   {
/* 528 */     return this.isReportMo;
/*     */   }
/*     */ 
/*     */   public void setIsReportMo(Long isReportMo)
/*     */   {
/* 539 */     this.isReportMo = isReportMo;
/*     */   }
/*     */ 
/*     */   public Long getIsReportMr()
/*     */   {
/* 550 */     return this.isReportMr;
/*     */   }
/*     */ 
/*     */   public void setIsReportMr(Long isReportMr)
/*     */   {
/* 561 */     this.isReportMr = isReportMr;
/*     */   }
/*     */ 
/*     */   public Date getCreated()
/*     */   {
/* 572 */     return this.created;
/*     */   }
/*     */ 
/*     */   public void setCreated(Date created)
/*     */   {
/* 583 */     this.created = created;
/*     */   }
/*     */ 
/*     */   public String getContentName()
/*     */   {
/* 594 */     return this.contentName;
/*     */   }
/*     */ 
/*     */   public void setContentName(String contentName)
/*     */   {
/* 605 */     this.contentName = (contentName == null ? null : contentName.trim());
/*     */   }
/*     */ 
/*     */   public Long getProvinceId()
/*     */   {
/* 616 */     return this.provinceId;
/*     */   }
/*     */ 
/*     */   public void setProvinceId(Long provinceId)
/*     */   {
/* 627 */     this.provinceId = provinceId;
/*     */   }
/*     */ 
/*     */   public String getProvinceName()
/*     */   {
/* 638 */     return this.provinceName;
/*     */   }
/*     */ 
/*     */   public void setProvinceName(String provinceName)
/*     */   {
/* 649 */     this.provinceName = (provinceName == null ? null : provinceName.trim());
/*     */   }
/*     */ 
/*     */   public Long getCityCode()
/*     */   {
/* 660 */     return this.cityCode;
/*     */   }
/*     */ 
/*     */   public void setCityCode(Long cityCode)
/*     */   {
/* 671 */     this.cityCode = cityCode;
/*     */   }
/*     */ 
/*     */   public String getCityName()
/*     */   {
/* 682 */     return this.cityName;
/*     */   }
/*     */ 
/*     */   public void setCityName(String cityName)
/*     */   {
/* 693 */     this.cityName = (cityName == null ? null : cityName.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderInfo
 * JD-Core Version:    0.6.2
 */
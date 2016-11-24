/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class SkPayOrderInfo
/*     */   implements Serializable
/*     */ {
/*     */   private Long uid;
/*     */   private String cpid;
/*     */   private String gate;
/*     */   private String woSms;
/*     */   private String appkey;
/*     */   private String tradeType;
/*     */   private String operator;
/*     */   private String mobileNum;
/*     */   private String content;
/*     */   private String motime;
/*     */   private String amount;
/*     */   private String cpOrderId;
/*     */   private String sign;
/*     */   private String limitId;
/*     */   private String isVailResult;
/*     */   private String isUpMo;
/*     */   private Date upMoDate;
/*     */   private String isUpMr;
/*     */   private Date upMrDate;
/*     */   private String id;
/*     */   private String status;
/*     */   private Date created;
/*     */   private String chargetime;
/*     */   private String ztOrderNo;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/* 206 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/* 217 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getCpid()
/*     */   {
/* 228 */     return this.cpid;
/*     */   }
/*     */ 
/*     */   public void setCpid(String cpid)
/*     */   {
/* 239 */     this.cpid = (cpid == null ? null : cpid.trim());
/*     */   }
/*     */ 
/*     */   public String getGate()
/*     */   {
/* 250 */     return this.gate;
/*     */   }
/*     */ 
/*     */   public void setGate(String gate)
/*     */   {
/* 261 */     this.gate = (gate == null ? null : gate.trim());
/*     */   }
/*     */ 
/*     */   public String getWoSms()
/*     */   {
/* 272 */     return this.woSms;
/*     */   }
/*     */ 
/*     */   public void setWoSms(String woSms)
/*     */   {
/* 283 */     this.woSms = (woSms == null ? null : woSms.trim());
/*     */   }
/*     */ 
/*     */   public String getAppkey()
/*     */   {
/* 294 */     return this.appkey;
/*     */   }
/*     */ 
/*     */   public void setAppkey(String appkey)
/*     */   {
/* 305 */     this.appkey = (appkey == null ? null : appkey.trim());
/*     */   }
/*     */ 
/*     */   public String getTradeType()
/*     */   {
/* 316 */     return this.tradeType;
/*     */   }
/*     */ 
/*     */   public void setTradeType(String tradeType)
/*     */   {
/* 327 */     this.tradeType = (tradeType == null ? null : tradeType.trim());
/*     */   }
/*     */ 
/*     */   public String getOperator()
/*     */   {
/* 338 */     return this.operator;
/*     */   }
/*     */ 
/*     */   public void setOperator(String operator)
/*     */   {
/* 349 */     this.operator = (operator == null ? null : operator.trim());
/*     */   }
/*     */ 
/*     */   public String getMobileNum()
/*     */   {
/* 360 */     return this.mobileNum;
/*     */   }
/*     */ 
/*     */   public void setMobileNum(String mobileNum)
/*     */   {
/* 371 */     this.mobileNum = (mobileNum == null ? null : mobileNum.trim());
/*     */   }
/*     */ 
/*     */   public String getContent()
/*     */   {
/* 382 */     return this.content;
/*     */   }
/*     */ 
/*     */   public void setContent(String content)
/*     */   {
/* 393 */     this.content = (content == null ? null : content.trim());
/*     */   }
/*     */ 
/*     */   public String getMotime()
/*     */   {
/* 404 */     return this.motime;
/*     */   }
/*     */ 
/*     */   public void setMotime(String motime)
/*     */   {
/* 415 */     this.motime = (motime == null ? null : motime.trim());
/*     */   }
/*     */ 
/*     */   public String getAmount()
/*     */   {
/* 426 */     return this.amount;
/*     */   }
/*     */ 
/*     */   public void setAmount(String amount)
/*     */   {
/* 437 */     this.amount = (amount == null ? null : amount.trim());
/*     */   }
/*     */ 
/*     */   public String getCpOrderId()
/*     */   {
/* 448 */     return this.cpOrderId;
/*     */   }
/*     */ 
/*     */   public void setCpOrderId(String cpOrderId)
/*     */   {
/* 459 */     this.cpOrderId = (cpOrderId == null ? null : cpOrderId.trim());
/*     */   }
/*     */ 
/*     */   public String getSign()
/*     */   {
/* 470 */     return this.sign;
/*     */   }
/*     */ 
/*     */   public void setSign(String sign)
/*     */   {
/* 481 */     this.sign = (sign == null ? null : sign.trim());
/*     */   }
/*     */ 
/*     */   public String getLimitId()
/*     */   {
/* 492 */     return this.limitId;
/*     */   }
/*     */ 
/*     */   public void setLimitId(String limitId)
/*     */   {
/* 503 */     this.limitId = (limitId == null ? null : limitId.trim());
/*     */   }
/*     */ 
/*     */   public String getIsVailResult()
/*     */   {
/* 514 */     return this.isVailResult;
/*     */   }
/*     */ 
/*     */   public void setIsVailResult(String isVailResult)
/*     */   {
/* 525 */     this.isVailResult = (isVailResult == null ? null : isVailResult.trim());
/*     */   }
/*     */ 
/*     */   public String getIsUpMo()
/*     */   {
/* 536 */     return this.isUpMo;
/*     */   }
/*     */ 
/*     */   public void setIsUpMo(String isUpMo)
/*     */   {
/* 547 */     this.isUpMo = (isUpMo == null ? null : isUpMo.trim());
/*     */   }
/*     */ 
/*     */   public Date getUpMoDate()
/*     */   {
/* 558 */     return this.upMoDate;
/*     */   }
/*     */ 
/*     */   public void setUpMoDate(Date upMoDate)
/*     */   {
/* 569 */     this.upMoDate = upMoDate;
/*     */   }
/*     */ 
/*     */   public String getIsUpMr()
/*     */   {
/* 580 */     return this.isUpMr;
/*     */   }
/*     */ 
/*     */   public void setIsUpMr(String isUpMr)
/*     */   {
/* 591 */     this.isUpMr = (isUpMr == null ? null : isUpMr.trim());
/*     */   }
/*     */ 
/*     */   public Date getUpMrDate()
/*     */   {
/* 602 */     return this.upMrDate;
/*     */   }
/*     */ 
/*     */   public void setUpMrDate(Date upMrDate)
/*     */   {
/* 613 */     this.upMrDate = upMrDate;
/*     */   }
/*     */ 
/*     */   public String getId()
/*     */   {
/* 624 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(String id)
/*     */   {
/* 635 */     this.id = (id == null ? null : id.trim());
/*     */   }
/*     */ 
/*     */   public String getStatus()
/*     */   {
/* 646 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status)
/*     */   {
/* 657 */     this.status = (status == null ? null : status.trim());
/*     */   }
/*     */ 
/*     */   public Date getCreated()
/*     */   {
/* 668 */     return this.created;
/*     */   }
/*     */ 
/*     */   public void setCreated(Date created)
/*     */   {
/* 679 */     this.created = created;
/*     */   }
/*     */ 
/*     */   public String getChargetime()
/*     */   {
/* 690 */     return this.chargetime;
/*     */   }
/*     */ 
/*     */   public void setChargetime(String chargetime)
/*     */   {
/* 701 */     this.chargetime = (chargetime == null ? null : chargetime.trim());
/*     */   }
/*     */ 
/*     */   public String getZtOrderNo()
/*     */   {
/* 712 */     return this.ztOrderNo;
/*     */   }
/*     */ 
/*     */   public void setZtOrderNo(String ztOrderNo)
/*     */   {
/* 723 */     this.ztOrderNo = (ztOrderNo == null ? null : ztOrderNo.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.SkPayOrderInfo
 * JD-Core Version:    0.6.2
 */
/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class PaymengtTraceInfo
/*     */ {
/*     */   private String id;
/*     */   private String transactionId;
/*     */   private String province;
/*     */   private String city;
/*     */   private String fee;
/*     */   private Date createTime;
/*     */   private String subject;
/*     */   private String appkey;
/*     */   private String appname;
/*     */   private String outTradeNo;
/*     */   private String profileId;
/*     */   private String payMentType;
/*     */   private String time;
/*     */   private String action;
/*     */   private String smsFromTo;
/*     */   private String smsContent;
/*     */   private String woPayReturn;
/*     */   private Long payStatus;
/*     */   private Date payDate;
/*     */   private String woPayReturnDesc;
/*     */   private Long gameId;
/*     */   private String ext;
/*     */   private String mobile;
/*     */   private int start;
/*     */   private int limit;
/*     */ 
/*     */   public String getId()
/*     */   {
/* 202 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(String id)
/*     */   {
/* 213 */     this.id = (id == null ? null : id.trim());
/*     */   }
/*     */ 
/*     */   public String getTransactionId()
/*     */   {
/* 224 */     return this.transactionId;
/*     */   }
/*     */ 
/*     */   public void setTransactionId(String transactionId)
/*     */   {
/* 235 */     this.transactionId = (transactionId == null ? null : transactionId.trim());
/*     */   }
/*     */ 
/*     */   public String getProvince()
/*     */   {
/* 246 */     return this.province;
/*     */   }
/*     */ 
/*     */   public void setProvince(String province)
/*     */   {
/* 257 */     this.province = (province == null ? null : province.trim());
/*     */   }
/*     */ 
/*     */   public String getCity()
/*     */   {
/* 268 */     return this.city;
/*     */   }
/*     */ 
/*     */   public void setCity(String city)
/*     */   {
/* 279 */     this.city = (city == null ? null : city.trim());
/*     */   }
/*     */ 
/*     */   public String getFee()
/*     */   {
/* 290 */     return this.fee;
/*     */   }
/*     */ 
/*     */   public void setFee(String fee)
/*     */   {
/* 301 */     this.fee = (fee == null ? null : fee.trim());
/*     */   }
/*     */ 
/*     */   public Date getCreateTime()
/*     */   {
/* 312 */     return this.createTime;
/*     */   }
/*     */ 
/*     */   public void setCreateTime(Date createTime)
/*     */   {
/* 323 */     this.createTime = createTime;
/*     */   }
/*     */ 
/*     */   public String getSubject()
/*     */   {
/* 334 */     return this.subject;
/*     */   }
/*     */ 
/*     */   public void setSubject(String subject)
/*     */   {
/* 345 */     this.subject = (subject == null ? null : subject.trim());
/*     */   }
/*     */ 
/*     */   public String getAppkey()
/*     */   {
/* 356 */     return this.appkey;
/*     */   }
/*     */ 
/*     */   public void setAppkey(String appkey)
/*     */   {
/* 367 */     this.appkey = (appkey == null ? null : appkey.trim());
/*     */   }
/*     */ 
/*     */   public String getAppname()
/*     */   {
/* 378 */     return this.appname;
/*     */   }
/*     */ 
/*     */   public void setAppname(String appname)
/*     */   {
/* 389 */     this.appname = (appname == null ? null : appname.trim());
/*     */   }
/*     */ 
/*     */   public String getOutTradeNo()
/*     */   {
/* 400 */     return this.outTradeNo;
/*     */   }
/*     */ 
/*     */   public void setOutTradeNo(String outTradeNo)
/*     */   {
/* 411 */     this.outTradeNo = (outTradeNo == null ? null : outTradeNo.trim());
/*     */   }
/*     */ 
/*     */   public String getProfileId()
/*     */   {
/* 422 */     return this.profileId;
/*     */   }
/*     */ 
/*     */   public void setProfileId(String profileId)
/*     */   {
/* 433 */     this.profileId = (profileId == null ? null : profileId.trim());
/*     */   }
/*     */ 
/*     */   public String getPayMentType()
/*     */   {
/* 444 */     return this.payMentType;
/*     */   }
/*     */ 
/*     */   public void setPayMentType(String payMentType)
/*     */   {
/* 455 */     this.payMentType = (payMentType == null ? null : payMentType.trim());
/*     */   }
/*     */ 
/*     */   public String getTime()
/*     */   {
/* 466 */     return this.time;
/*     */   }
/*     */ 
/*     */   public void setTime(String time)
/*     */   {
/* 477 */     this.time = (time == null ? null : time.trim());
/*     */   }
/*     */ 
/*     */   public String getAction()
/*     */   {
/* 488 */     return this.action;
/*     */   }
/*     */ 
/*     */   public void setAction(String action)
/*     */   {
/* 499 */     this.action = (action == null ? null : action.trim());
/*     */   }
/*     */ 
/*     */   public String getSmsFromTo()
/*     */   {
/* 510 */     return this.smsFromTo;
/*     */   }
/*     */ 
/*     */   public void setSmsFromTo(String smsFromTo)
/*     */   {
/* 521 */     this.smsFromTo = (smsFromTo == null ? null : smsFromTo.trim());
/*     */   }
/*     */ 
/*     */   public String getSmsContent()
/*     */   {
/* 532 */     return this.smsContent;
/*     */   }
/*     */ 
/*     */   public void setSmsContent(String smsContent)
/*     */   {
/* 543 */     this.smsContent = (smsContent == null ? null : smsContent.trim());
/*     */   }
/*     */ 
/*     */   public String getWoPayReturn()
/*     */   {
/* 554 */     return this.woPayReturn;
/*     */   }
/*     */ 
/*     */   public void setWoPayReturn(String woPayReturn)
/*     */   {
/* 565 */     this.woPayReturn = (woPayReturn == null ? null : woPayReturn.trim());
/*     */   }
/*     */ 
/*     */   public Long getPayStatus()
/*     */   {
/* 576 */     return this.payStatus;
/*     */   }
/*     */ 
/*     */   public void setPayStatus(Long payStatus)
/*     */   {
/* 587 */     this.payStatus = payStatus;
/*     */   }
/*     */ 
/*     */   public Date getPayDate()
/*     */   {
/* 598 */     return this.payDate;
/*     */   }
/*     */ 
/*     */   public void setPayDate(Date payDate)
/*     */   {
/* 609 */     this.payDate = payDate;
/*     */   }
/*     */ 
/*     */   public String getWoPayReturnDesc()
/*     */   {
/* 620 */     return this.woPayReturnDesc;
/*     */   }
/*     */ 
/*     */   public void setWoPayReturnDesc(String woPayReturnDesc)
/*     */   {
/* 631 */     this.woPayReturnDesc = (woPayReturnDesc == null ? null : woPayReturnDesc.trim());
/*     */   }
/*     */ 
/*     */   public Long getGameId()
/*     */   {
/* 642 */     return this.gameId;
/*     */   }
/*     */ 
/*     */   public void setGameId(Long gameId)
/*     */   {
/* 653 */     this.gameId = gameId;
/*     */   }
/*     */ 
/*     */   public String getExt()
/*     */   {
/* 664 */     return this.ext;
/*     */   }
/*     */ 
/*     */   public void setExt(String ext)
/*     */   {
/* 675 */     this.ext = (ext == null ? null : ext.trim());
/*     */   }
/*     */ 
/*     */   public String getMobile()
/*     */   {
/* 686 */     return this.mobile;
/*     */   }
/*     */ 
/*     */   public void setMobile(String mobile)
/*     */   {
/* 697 */     this.mobile = (mobile == null ? null : mobile.trim());
/*     */   }
/*     */ 
/*     */   public int getStart() {
/* 701 */     return this.start;
/*     */   }
/*     */ 
/*     */   public void setStart(int start) {
/* 705 */     this.start = start;
/*     */   }
/*     */ 
/*     */   public int getLimit() {
/* 709 */     return this.limit;
/*     */   }
/*     */ 
/*     */   public void setLimit(int limit) {
/* 713 */     this.limit = limit;
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PaymengtTraceInfo
 * JD-Core Version:    0.6.2
 */
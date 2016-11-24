/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class SkSmsPayOrderInfo
/*     */ {
/*     */   private Long uid;
/*     */   private String mobileNum;
/*     */   private String orderNo;
/*     */   private String moMsg;
/*     */   private String prodCode;
/*     */   private String result;
/*     */   private String errorinfo;
/*     */   private String expiryTime;
/*     */   private String macAddress;
/*     */   private String imsi;
/*     */   private Date creade;
/*     */   private String limitId;
/*     */   private String linkid;
/*     */   private String status;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/* 127 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/* 139 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getMobileNum()
/*     */   {
/* 151 */     return this.mobileNum;
/*     */   }
/*     */ 
/*     */   public void setMobileNum(String mobileNum)
/*     */   {
/* 163 */     this.mobileNum = (mobileNum == null ? null : mobileNum.trim());
/*     */   }
/*     */ 
/*     */   public String getOrderNo()
/*     */   {
/* 175 */     return this.orderNo;
/*     */   }
/*     */ 
/*     */   public void setOrderNo(String orderNo)
/*     */   {
/* 187 */     this.orderNo = (orderNo == null ? null : orderNo.trim());
/*     */   }
/*     */ 
/*     */   public String getMoMsg()
/*     */   {
/* 199 */     return this.moMsg;
/*     */   }
/*     */ 
/*     */   public void setMoMsg(String moMsg)
/*     */   {
/* 211 */     this.moMsg = (moMsg == null ? null : moMsg.trim());
/*     */   }
/*     */ 
/*     */   public String getProdCode()
/*     */   {
/* 223 */     return this.prodCode;
/*     */   }
/*     */ 
/*     */   public void setProdCode(String prodCode)
/*     */   {
/* 235 */     this.prodCode = (prodCode == null ? null : prodCode.trim());
/*     */   }
/*     */ 
/*     */   public String getResult()
/*     */   {
/* 247 */     return this.result;
/*     */   }
/*     */ 
/*     */   public void setResult(String result)
/*     */   {
/* 259 */     this.result = (result == null ? null : result.trim());
/*     */   }
/*     */ 
/*     */   public String getErrorinfo()
/*     */   {
/* 271 */     return this.errorinfo;
/*     */   }
/*     */ 
/*     */   public void setErrorinfo(String errorinfo)
/*     */   {
/* 283 */     this.errorinfo = (errorinfo == null ? null : errorinfo.trim());
/*     */   }
/*     */ 
/*     */   public String getExpiryTime()
/*     */   {
/* 295 */     return this.expiryTime;
/*     */   }
/*     */ 
/*     */   public void setExpiryTime(String expiryTime)
/*     */   {
/* 307 */     this.expiryTime = (expiryTime == null ? null : expiryTime.trim());
/*     */   }
/*     */ 
/*     */   public String getMacAddress()
/*     */   {
/* 319 */     return this.macAddress;
/*     */   }
/*     */ 
/*     */   public void setMacAddress(String macAddress)
/*     */   {
/* 331 */     this.macAddress = (macAddress == null ? null : macAddress.trim());
/*     */   }
/*     */ 
/*     */   public String getImsi()
/*     */   {
/* 343 */     return this.imsi;
/*     */   }
/*     */ 
/*     */   public void setImsi(String imsi)
/*     */   {
/* 355 */     this.imsi = (imsi == null ? null : imsi.trim());
/*     */   }
/*     */ 
/*     */   public Date getCreade()
/*     */   {
/* 367 */     return this.creade;
/*     */   }
/*     */ 
/*     */   public void setCreade(Date creade)
/*     */   {
/* 379 */     this.creade = creade;
/*     */   }
/*     */ 
/*     */   public String getLimitId()
/*     */   {
/* 391 */     return this.limitId;
/*     */   }
/*     */ 
/*     */   public void setLimitId(String limitId)
/*     */   {
/* 403 */     this.limitId = (limitId == null ? null : limitId.trim());
/*     */   }
/*     */ 
/*     */   public String getLinkid()
/*     */   {
/* 415 */     return this.linkid;
/*     */   }
/*     */ 
/*     */   public void setLinkid(String linkid)
/*     */   {
/* 427 */     this.linkid = (linkid == null ? null : linkid.trim());
/*     */   }
/*     */ 
/*     */   public String getStatus()
/*     */   {
/* 439 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(String status)
/*     */   {
/* 451 */     this.status = (status == null ? null : status.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.SkSmsPayOrderInfo
 * JD-Core Version:    0.6.2
 */
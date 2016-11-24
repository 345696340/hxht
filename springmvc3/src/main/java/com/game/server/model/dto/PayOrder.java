/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class PayOrder
/*     */ {
/*     */   private Long uid;
/*     */   private Long gameId;
/*     */   private Long userId;
/*     */   private Long userMobile;
/*     */   private Long channelId;
/*     */   private Double coin;
/*     */   private String woPayResult;
/*     */   private String gamePayExt;
/*     */   private String gamePayResult;
/*     */   private Date created;
/*     */   private Long resCode;
/*     */   private String resDesc;
/*     */   private String woOrderId;
/*     */   private Long price;
/*     */   private String busName;
/*     */   private String companyName;
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
/*     */   public Long getGameId()
/*     */   {
/* 167 */     return this.gameId;
/*     */   }
/*     */ 
/*     */   public void setGameId(Long gameId)
/*     */   {
/* 179 */     this.gameId = gameId;
/*     */   }
/*     */ 
/*     */   public Long getUserId()
/*     */   {
/* 191 */     return this.userId;
/*     */   }
/*     */ 
/*     */   public void setUserId(Long userId)
/*     */   {
/* 203 */     this.userId = userId;
/*     */   }
/*     */ 
/*     */   public Long getUserMobile()
/*     */   {
/* 215 */     return this.userMobile;
/*     */   }
/*     */ 
/*     */   public void setUserMobile(Long userMobile)
/*     */   {
/* 227 */     this.userMobile = userMobile;
/*     */   }
/*     */ 
/*     */   public Long getChannelId()
/*     */   {
/* 239 */     return this.channelId;
/*     */   }
/*     */ 
/*     */   public void setChannelId(Long channelId)
/*     */   {
/* 251 */     this.channelId = channelId;
/*     */   }
/*     */ 
/*     */   public Double getCoin()
/*     */   {
/* 263 */     return this.coin;
/*     */   }
/*     */ 
/*     */   public void setCoin(Double coin)
/*     */   {
/* 275 */     this.coin = coin;
/*     */   }
/*     */ 
/*     */   public String getWoPayResult()
/*     */   {
/* 287 */     return this.woPayResult;
/*     */   }
/*     */ 
/*     */   public void setWoPayResult(String woPayResult)
/*     */   {
/* 299 */     this.woPayResult = (woPayResult == null ? null : woPayResult.trim());
/*     */   }
/*     */ 
/*     */   public String getGamePayExt()
/*     */   {
/* 311 */     return this.gamePayExt;
/*     */   }
/*     */ 
/*     */   public void setGamePayExt(String gamePayExt)
/*     */   {
/* 323 */     this.gamePayExt = (gamePayExt == null ? null : gamePayExt.trim());
/*     */   }
/*     */ 
/*     */   public String getGamePayResult()
/*     */   {
/* 335 */     return this.gamePayResult;
/*     */   }
/*     */ 
/*     */   public void setGamePayResult(String gamePayResult)
/*     */   {
/* 347 */     this.gamePayResult = (gamePayResult == null ? null : gamePayResult.trim());
/*     */   }
/*     */ 
/*     */   public Date getCreated()
/*     */   {
/* 359 */     return this.created;
/*     */   }
/*     */ 
/*     */   public void setCreated(Date created)
/*     */   {
/* 371 */     this.created = created;
/*     */   }
/*     */ 
/*     */   public Long getResCode()
/*     */   {
/* 383 */     return this.resCode;
/*     */   }
/*     */ 
/*     */   public void setResCode(Long resCode)
/*     */   {
/* 395 */     this.resCode = resCode;
/*     */   }
/*     */ 
/*     */   public String getResDesc()
/*     */   {
/* 407 */     return this.resDesc;
/*     */   }
/*     */ 
/*     */   public void setResDesc(String resDesc)
/*     */   {
/* 419 */     this.resDesc = (resDesc == null ? null : resDesc.trim());
/*     */   }
/*     */ 
/*     */   public String getWoOrderId()
/*     */   {
/* 431 */     return this.woOrderId;
/*     */   }
/*     */ 
/*     */   public void setWoOrderId(String woOrderId)
/*     */   {
/* 443 */     this.woOrderId = (woOrderId == null ? null : woOrderId.trim());
/*     */   }
/*     */ 
/*     */   public Long getPrice()
/*     */   {
/* 455 */     return this.price;
/*     */   }
/*     */ 
/*     */   public void setPrice(Long price)
/*     */   {
/* 467 */     this.price = price;
/*     */   }
/*     */ 
/*     */   public String getBusName()
/*     */   {
/* 479 */     return this.busName;
/*     */   }
/*     */ 
/*     */   public void setBusName(String busName)
/*     */   {
/* 491 */     this.busName = (busName == null ? null : busName.trim());
/*     */   }
/*     */ 
/*     */   public String getCompanyName()
/*     */   {
/* 503 */     return this.companyName;
/*     */   }
/*     */ 
/*     */   public void setCompanyName(String companyName)
/*     */   {
/* 515 */     this.companyName = (companyName == null ? null : companyName.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrder
 * JD-Core Version:    0.6.2
 */
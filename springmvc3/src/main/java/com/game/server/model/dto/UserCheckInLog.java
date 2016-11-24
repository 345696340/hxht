/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class UserCheckInLog
/*     */ {
/*     */   private String id;
/*     */   private Date checkInDate;
/*     */   private String userId;
/*     */   private Integer isTimeout;
/*     */   private String reason;
/*     */   private Long isAuto;
/*     */ 
/*     */   public String getId()
/*     */   {
/*  63 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(String id)
/*     */   {
/*  75 */     this.id = (id == null ? null : id.trim());
/*     */   }
/*     */ 
/*     */   public Date getCheckInDate()
/*     */   {
/*  87 */     return this.checkInDate;
/*     */   }
/*     */ 
/*     */   public void setCheckInDate(Date checkInDate)
/*     */   {
/*  99 */     this.checkInDate = checkInDate;
/*     */   }
/*     */ 
/*     */   public String getUserId()
/*     */   {
/* 111 */     return this.userId;
/*     */   }
/*     */ 
/*     */   public void setUserId(String userId)
/*     */   {
/* 123 */     this.userId = (userId == null ? null : userId.trim());
/*     */   }
/*     */ 
/*     */   public Integer getIsTimeout()
/*     */   {
/* 135 */     return this.isTimeout;
/*     */   }
/*     */ 
/*     */   public void setIsTimeout(Integer isTimeout)
/*     */   {
/* 147 */     this.isTimeout = isTimeout;
/*     */   }
/*     */ 
/*     */   public String getReason()
/*     */   {
/* 159 */     return this.reason;
/*     */   }
/*     */ 
/*     */   public void setReason(String reason)
/*     */   {
/* 171 */     this.reason = (reason == null ? null : reason.trim());
/*     */   }
/*     */ 
/*     */   public Long getIsAuto()
/*     */   {
/* 183 */     return this.isAuto;
/*     */   }
/*     */ 
/*     */   public void setIsAuto(Long isAuto)
/*     */   {
/* 195 */     this.isAuto = isAuto;
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.UserCheckInLog
 * JD-Core Version:    0.6.2
 */
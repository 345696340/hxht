/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class PaymengtTraceSmsInfo
/*     */ {
/*     */   private Long uid;
/*     */   private String transactionId;
/*     */   private Date createDate;
/*     */   private String action;
/*     */   private String smsFromTo;
/*     */   private String smsContent;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/*  63 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/*  75 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getTransactionId()
/*     */   {
/*  87 */     return this.transactionId;
/*     */   }
/*     */ 
/*     */   public void setTransactionId(String transactionId)
/*     */   {
/*  99 */     this.transactionId = (transactionId == null ? null : transactionId.trim());
/*     */   }
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 111 */     return this.createDate;
/*     */   }
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 123 */     this.createDate = createDate;
/*     */   }
/*     */ 
/*     */   public String getAction()
/*     */   {
/* 135 */     return this.action;
/*     */   }
/*     */ 
/*     */   public void setAction(String action)
/*     */   {
/* 147 */     this.action = (action == null ? null : action.trim());
/*     */   }
/*     */ 
/*     */   public String getSmsFromTo()
/*     */   {
/* 159 */     return this.smsFromTo;
/*     */   }
/*     */ 
/*     */   public void setSmsFromTo(String smsFromTo)
/*     */   {
/* 171 */     this.smsFromTo = (smsFromTo == null ? null : smsFromTo.trim());
/*     */   }
/*     */ 
/*     */   public String getSmsContent()
/*     */   {
/* 183 */     return this.smsContent;
/*     */   }
/*     */ 
/*     */   public void setSmsContent(String smsContent)
/*     */   {
/* 195 */     this.smsContent = (smsContent == null ? null : smsContent.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PaymengtTraceSmsInfo
 * JD-Core Version:    0.6.2
 */
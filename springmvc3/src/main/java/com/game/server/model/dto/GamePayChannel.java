/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class GamePayChannel
/*     */ {
/*     */   private Long uid;
/*     */   private String channelId;
/*     */   private Double coin;
/*     */   private Date createDate;
/*     */   private String creator;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/*  55 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/*  67 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getChannelId()
/*     */   {
/*  79 */     return this.channelId;
/*     */   }
/*     */ 
/*     */   public void setChannelId(String channelId)
/*     */   {
/*  91 */     this.channelId = (channelId == null ? null : channelId.trim());
/*     */   }
/*     */ 
/*     */   public Double getCoin()
/*     */   {
/* 103 */     return this.coin;
/*     */   }
/*     */ 
/*     */   public void setCoin(Double coin)
/*     */   {
/* 115 */     this.coin = coin;
/*     */   }
/*     */ 
/*     */   public Date getCreateDate()
/*     */   {
/* 127 */     return this.createDate;
/*     */   }
/*     */ 
/*     */   public void setCreateDate(Date createDate)
/*     */   {
/* 139 */     this.createDate = createDate;
/*     */   }
/*     */ 
/*     */   public String getCreator()
/*     */   {
/* 151 */     return this.creator;
/*     */   }
/*     */ 
/*     */   public void setCreator(String creator)
/*     */   {
/* 163 */     this.creator = (creator == null ? null : creator.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GamePayChannel
 * JD-Core Version:    0.6.2
 */
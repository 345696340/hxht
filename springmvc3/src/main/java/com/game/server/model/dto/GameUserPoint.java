/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class GameUserPoint
/*     */ {
/*     */   private Long uid;
/*     */   private Date creatd;
/*     */   private Date modifi;
/*     */   private String userId;
/*     */   private Long point;
/*     */   private Long gameType;
/*     */   private String gameId;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/*  71 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/*  83 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public Date getCreatd()
/*     */   {
/*  95 */     return this.creatd;
/*     */   }
/*     */ 
/*     */   public void setCreatd(Date creatd)
/*     */   {
/* 107 */     this.creatd = creatd;
/*     */   }
/*     */ 
/*     */   public Date getModifi()
/*     */   {
/* 119 */     return this.modifi;
/*     */   }
/*     */ 
/*     */   public void setModifi(Date modifi)
/*     */   {
/* 131 */     this.modifi = modifi;
/*     */   }
/*     */ 
/*     */   public String getUserId()
/*     */   {
/* 143 */     return this.userId;
/*     */   }
/*     */ 
/*     */   public void setUserId(String userId)
/*     */   {
/* 155 */     this.userId = (userId == null ? null : userId.trim());
/*     */   }
/*     */ 
/*     */   public Long getPoint()
/*     */   {
/* 167 */     return this.point;
/*     */   }
/*     */ 
/*     */   public void setPoint(Long point)
/*     */   {
/* 179 */     this.point = point;
/*     */   }
/*     */ 
/*     */   public Long getGameType()
/*     */   {
/* 191 */     return this.gameType;
/*     */   }
/*     */ 
/*     */   public void setGameType(Long gameType)
/*     */   {
/* 203 */     this.gameType = gameType;
/*     */   }
/*     */ 
/*     */   public String getGameId()
/*     */   {
/* 215 */     return this.gameId;
/*     */   }
/*     */ 
/*     */   public void setGameId(String gameId)
/*     */   {
/* 227 */     this.gameId = (gameId == null ? null : gameId.trim());
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GameUserPoint
 * JD-Core Version:    0.6.2
 */
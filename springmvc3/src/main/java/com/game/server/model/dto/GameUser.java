/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class GameUser
/*     */ {
/*     */   private Long uid;
/*     */   private String userId;
/*     */   private Long gameType;
/*     */   private Long userMaxPoint;
/*     */   private Date lastdate;
/*     */   private String rank;
/*     */   private String imgx;
/*     */   private String url;
/*     */   private Date creatd;
/*     */   private String gameId;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/*  76 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/*  87 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getUserId()
/*     */   {
/*  98 */     return this.userId;
/*     */   }
/*     */ 
/*     */   public void setUserId(String userId)
/*     */   {
/* 109 */     this.userId = (userId == null ? null : userId.trim());
/*     */   }
/*     */ 
/*     */   public Long getGameType()
/*     */   {
/* 120 */     return this.gameType;
/*     */   }
/*     */ 
/*     */   public String getRank() {
/* 124 */     return this.rank;
/*     */   }
/*     */ 
/*     */   public void setRank(String rank) {
/* 128 */     this.rank = rank;
/*     */   }
/*     */ 
/*     */   public void setGameType(Long gameType)
/*     */   {
/* 139 */     this.gameType = gameType;
/*     */   }
/*     */ 
/*     */   public Long getUserMaxPoint()
/*     */   {
/* 150 */     return this.userMaxPoint;
/*     */   }
/*     */ 
/*     */   public void setUserMaxPoint(Long userMaxPoint)
/*     */   {
/* 161 */     this.userMaxPoint = userMaxPoint;
/*     */   }
/*     */ 
/*     */   public Date getLastdate()
/*     */   {
/* 172 */     return this.lastdate;
/*     */   }
/*     */ 
/*     */   public void setLastdate(Date lastdate)
/*     */   {
/* 183 */     this.lastdate = lastdate;
/*     */   }
/*     */ 
/*     */   public Date getCreatd()
/*     */   {
/* 194 */     return this.creatd;
/*     */   }
/*     */ 
/*     */   public void setCreatd(Date creatd)
/*     */   {
/* 205 */     this.creatd = creatd;
/*     */   }
/*     */ 
/*     */   public String getGameId()
/*     */   {
/* 216 */     return this.gameId;
/*     */   }
/*     */ 
/*     */   public void setGameId(String gameId)
/*     */   {
/* 227 */     this.gameId = (gameId == null ? null : gameId.trim());
/*     */   }
/*     */ 
/*     */   public String getImgx() {
/* 231 */     return this.imgx;
/*     */   }
/*     */ 
/*     */   public void setImgx(String imgx) {
/* 235 */     this.imgx = imgx;
/*     */   }
/*     */ 
/*     */   public void setUrl(String url) {
/* 239 */     this.url = url;
/*     */   }
/*     */ 
/*     */   public String getUrl() {
/* 243 */     return this.url;
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GameUser
 * JD-Core Version:    0.6.2
 */
/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class GameInfoType
/*     */ {
/*     */   private Long uid;
/*     */   private String gameTypeName;
/*     */   private String gameId;
/*     */   private Date creadDate;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/*  47 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/*  59 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getGameTypeName()
/*     */   {
/*  71 */     return this.gameTypeName;
/*     */   }
/*     */ 
/*     */   public void setGameTypeName(String gameTypeName)
/*     */   {
/*  83 */     this.gameTypeName = (gameTypeName == null ? null : gameTypeName.trim());
/*     */   }
/*     */ 
/*     */   public String getGameId()
/*     */   {
/*  95 */     return this.gameId;
/*     */   }
/*     */ 
/*     */   public void setGameId(String gameId)
/*     */   {
/* 107 */     this.gameId = (gameId == null ? null : gameId.trim());
/*     */   }
/*     */ 
/*     */   public Date getCreadDate()
/*     */   {
/* 119 */     return this.creadDate;
/*     */   }
/*     */ 
/*     */   public void setCreadDate(Date creadDate)
/*     */   {
/* 131 */     this.creadDate = creadDate;
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GameInfoType
 * JD-Core Version:    0.6.2
 */
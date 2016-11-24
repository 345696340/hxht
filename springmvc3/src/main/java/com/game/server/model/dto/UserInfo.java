/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class UserInfo
/*     */ {
/*     */   private Long uid;
/*     */   private String userId;
/*     */   private Date createDate;
/*     */   private Date lastLoginDate;
/*     */   private String portrait;
/*     */   private Long sex;
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
/*     */   public String getUserId()
/*     */   {
/*  87 */     return this.userId;
/*     */   }
/*     */ 
/*     */   public void setUserId(String userId)
/*     */   {
/*  99 */     this.userId = (userId == null ? null : userId.trim());
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
/*     */   public Date getLastLoginDate()
/*     */   {
/* 135 */     return this.lastLoginDate;
/*     */   }
/*     */ 
/*     */   public void setLastLoginDate(Date lastLoginDate)
/*     */   {
/* 147 */     this.lastLoginDate = lastLoginDate;
/*     */   }
/*     */ 
/*     */   public String getPortrait()
/*     */   {
/* 159 */     return this.portrait;
/*     */   }
/*     */ 
/*     */   public void setPortrait(String portrait)
/*     */   {
/* 171 */     this.portrait = (portrait == null ? null : portrait.trim());
/*     */   }
/*     */ 
/*     */   public Long getSex()
/*     */   {
/* 183 */     return this.sex;
/*     */   }
/*     */ 
/*     */   public void setSex(Long sex)
/*     */   {
/* 195 */     this.sex = sex;
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.UserInfo
 * JD-Core Version:    0.6.2
 */
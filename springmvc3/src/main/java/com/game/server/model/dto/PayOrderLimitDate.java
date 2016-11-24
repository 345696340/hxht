/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ public class PayOrderLimitDate
/*     */ {
/*     */   private Long uid;
/*     */   private String id;
/*     */   private Integer type;
/*     */   private Long dateLimit;
/*     */   private Long monthLimit;
/*     */   private Integer dateCountLimit;
/*     */   private Integer monthCountLimit;
/*     */   private Date created;
/*     */   private Integer off;
/*     */   private Integer offCity;
/*     */ 
/*     */   public Long getUid()
/*     */   {
/*  95 */     return this.uid;
/*     */   }
/*     */ 
/*     */   public void setUid(Long uid)
/*     */   {
/* 107 */     this.uid = uid;
/*     */   }
/*     */ 
/*     */   public String getId()
/*     */   {
/* 119 */     return this.id;
/*     */   }
/*     */ 
/*     */   public void setId(String id)
/*     */   {
/* 131 */     this.id = (id == null ? null : id.trim());
/*     */   }
/*     */ 
/*     */   public Integer getType()
/*     */   {
/* 143 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(Integer type)
/*     */   {
/* 155 */     this.type = type;
/*     */   }
/*     */ 
/*     */   public Long getDateLimit()
/*     */   {
/* 167 */     return this.dateLimit;
/*     */   }
/*     */ 
/*     */   public void setDateLimit(Long dateLimit)
/*     */   {
/* 179 */     this.dateLimit = dateLimit;
/*     */   }
/*     */ 
/*     */   public Long getMonthLimit()
/*     */   {
/* 191 */     return this.monthLimit;
/*     */   }
/*     */ 
/*     */   public void setMonthLimit(Long monthLimit)
/*     */   {
/* 203 */     this.monthLimit = monthLimit;
/*     */   }
/*     */ 
/*     */   public Integer getDateCountLimit()
/*     */   {
/* 215 */     return this.dateCountLimit;
/*     */   }
/*     */ 
/*     */   public void setDateCountLimit(Integer dateCountLimit)
/*     */   {
/* 227 */     this.dateCountLimit = dateCountLimit;
/*     */   }
/*     */ 
/*     */   public Integer getMonthCountLimit()
/*     */   {
/* 239 */     return this.monthCountLimit;
/*     */   }
/*     */ 
/*     */   public void setMonthCountLimit(Integer monthCountLimit)
/*     */   {
/* 251 */     this.monthCountLimit = monthCountLimit;
/*     */   }
/*     */ 
/*     */   public Date getCreated()
/*     */   {
/* 263 */     return this.created;
/*     */   }
/*     */ 
/*     */   public void setCreated(Date created)
/*     */   {
/* 275 */     this.created = created;
/*     */   }
/*     */ 
/*     */   public Integer getOff()
/*     */   {
/* 287 */     return this.off;
/*     */   }
/*     */ 
/*     */   public void setOff(Integer off)
/*     */   {
/* 299 */     this.off = off;
/*     */   }
/*     */ 
/*     */   public Integer getOffCity()
/*     */   {
/* 311 */     return this.offCity;
/*     */   }
/*     */ 
/*     */   public void setOffCity(Integer offCity)
/*     */   {
/* 323 */     this.offCity = offCity;
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderLimitDate
 * JD-Core Version:    0.6.2
 */
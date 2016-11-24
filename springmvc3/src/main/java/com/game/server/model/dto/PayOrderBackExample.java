/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class PayOrderBackExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public PayOrderBackExample()
/*     */   {
/*  38 */     this.oredCriteria = new ArrayList();
/*     */   }
/*     */ 
/*     */   public void setOrderByClause(String orderByClause)
/*     */   {
/*  48 */     this.orderByClause = orderByClause;
/*     */   }
/*     */ 
/*     */   public String getOrderByClause()
/*     */   {
/*  58 */     return this.orderByClause;
/*     */   }
/*     */ 
/*     */   public void setDistinct(boolean distinct)
/*     */   {
/*  68 */     this.distinct = distinct;
/*     */   }
/*     */ 
/*     */   public boolean isDistinct()
/*     */   {
/*  78 */     return this.distinct;
/*     */   }
/*     */ 
/*     */   public List<Criteria> getOredCriteria()
/*     */   {
/*  88 */     return this.oredCriteria;
/*     */   }
/*     */ 
/*     */   public void or(Criteria criteria)
/*     */   {
/*  98 */     this.oredCriteria.add(criteria);
/*     */   }
/*     */ 
/*     */   public Criteria or()
/*     */   {
/* 108 */     Criteria criteria = createCriteriaInternal();
/* 109 */     this.oredCriteria.add(criteria);
/* 110 */     return criteria;
/*     */   }
/*     */ 
/*     */   public Criteria createCriteria()
/*     */   {
/* 120 */     Criteria criteria = createCriteriaInternal();
/* 121 */     if (this.oredCriteria.size() == 0) {
/* 122 */       this.oredCriteria.add(criteria);
/*     */     }
/* 124 */     return criteria;
/*     */   }
/*     */ 
/*     */   protected Criteria createCriteriaInternal()
/*     */   {
/* 134 */     Criteria criteria = new Criteria();
/* 135 */     return criteria;
/*     */   }
/*     */ 
/*     */   public void clear()
/*     */   {
/* 145 */     this.oredCriteria.clear();
/* 146 */     this.orderByClause = null;
/* 147 */     this.distinct = false;
/*     */   }
/*     */ 
/*     */   public static class Criterion
/*     */   {
/*     */     private String condition;
/*     */     private Object value;
/*     */     private Object secondValue;
/*     */     private boolean noValue;
/*     */     private boolean singleValue;
/*     */     private boolean betweenValue;
/*     */     private boolean listValue;
/*     */     private String typeHandler;
/*     */ 
/*     */     public String getCondition()
/*     */     {
/* 425 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 429 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 433 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 437 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 441 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 445 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 449 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 453 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 458 */       this.condition = condition;
/* 459 */       this.typeHandler = null;
/* 460 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 465 */       this.condition = condition;
/* 466 */       this.value = value;
/* 467 */       this.typeHandler = typeHandler;
/* 468 */       if ((value instanceof List))
/* 469 */         this.listValue = true;
/*     */       else
/* 471 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 476 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 481 */       this.condition = condition;
/* 482 */       this.value = value;
/* 483 */       this.secondValue = secondValue;
/* 484 */       this.typeHandler = typeHandler;
/* 485 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 489 */       this(condition, value, secondValue, null);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class Criteria extends GeneratedCriteria
/*     */   {
/*     */   }
/*     */ 
/*     */   protected static abstract class GeneratedCriteria
/*     */   {
/*     */     protected List<Criterion> criteria;
/*     */ 
/*     */     protected GeneratedCriteria()
/*     */     {
/* 161 */       this.criteria = new ArrayList();
/*     */     }
/*     */ 
/*     */     public boolean isValid() {
/* 165 */       return this.criteria.size() > 0;
/*     */     }
/*     */ 
/*     */     public List<Criterion> getAllCriteria() {
/* 169 */       return this.criteria;
/*     */     }
/*     */ 
/*     */     public List<Criterion> getCriteria() {
/* 173 */       return this.criteria;
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition) {
/* 177 */       if (condition == null) {
/* 178 */         throw new RuntimeException("Value for condition cannot be null");
/*     */       }
/* 180 */       this.criteria.add(new Criterion(condition));
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition, Object value, String property) {
/* 184 */       if (value == null) {
/* 185 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*     */       }
/* 187 */       this.criteria.add(new Criterion(condition, value));
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/* 191 */       if ((value1 == null) || (value2 == null)) {
/* 192 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*     */       }
/* 194 */       this.criteria.add(new Criterion(condition, value1, value2));
/*     */     }
/*     */ 
/*     */     public Criteria andUidIsNull() {
/* 198 */       addCriterion("UID is null");
/* 199 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidIsNotNull() {
/* 203 */       addCriterion("UID is not null");
/* 204 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidEqualTo(Long value) {
/* 208 */       addCriterion("UID =", value, "uid");
/* 209 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotEqualTo(Long value) {
/* 213 */       addCriterion("UID <>", value, "uid");
/* 214 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidGreaterThan(Long value) {
/* 218 */       addCriterion("UID >", value, "uid");
/* 219 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidGreaterThanOrEqualTo(Long value) {
/* 223 */       addCriterion("UID >=", value, "uid");
/* 224 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidLessThan(Long value) {
/* 228 */       addCriterion("UID <", value, "uid");
/* 229 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidLessThanOrEqualTo(Long value) {
/* 233 */       addCriterion("UID <=", value, "uid");
/* 234 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidIn(List<Long> values) {
/* 238 */       addCriterion("UID in", values, "uid");
/* 239 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotIn(List<Long> values) {
/* 243 */       addCriterion("UID not in", values, "uid");
/* 244 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidBetween(Long value1, Long value2) {
/* 248 */       addCriterion("UID between", value1, value2, "uid");
/* 249 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotBetween(Long value1, Long value2) {
/* 253 */       addCriterion("UID not between", value1, value2, "uid");
/* 254 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileIsNull() {
/* 258 */       addCriterion("MOBILE is null");
/* 259 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileIsNotNull() {
/* 263 */       addCriterion("MOBILE is not null");
/* 264 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileEqualTo(String value) {
/* 268 */       addCriterion("MOBILE =", value, "mobile");
/* 269 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileNotEqualTo(String value) {
/* 273 */       addCriterion("MOBILE <>", value, "mobile");
/* 274 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileGreaterThan(String value) {
/* 278 */       addCriterion("MOBILE >", value, "mobile");
/* 279 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileGreaterThanOrEqualTo(String value) {
/* 283 */       addCriterion("MOBILE >=", value, "mobile");
/* 284 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileLessThan(String value) {
/* 288 */       addCriterion("MOBILE <", value, "mobile");
/* 289 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileLessThanOrEqualTo(String value) {
/* 293 */       addCriterion("MOBILE <=", value, "mobile");
/* 294 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileLike(String value) {
/* 298 */       addCriterion("MOBILE like", value, "mobile");
/* 299 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileNotLike(String value) {
/* 303 */       addCriterion("MOBILE not like", value, "mobile");
/* 304 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileIn(List<String> values) {
/* 308 */       addCriterion("MOBILE in", values, "mobile");
/* 309 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileNotIn(List<String> values) {
/* 313 */       addCriterion("MOBILE not in", values, "mobile");
/* 314 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileBetween(String value1, String value2) {
/* 318 */       addCriterion("MOBILE between", value1, value2, "mobile");
/* 319 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileNotBetween(String value1, String value2) {
/* 323 */       addCriterion("MOBILE not between", value1, value2, "mobile");
/* 324 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackIsNull() {
/* 328 */       addCriterion("IS_BACK is null");
/* 329 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackIsNotNull() {
/* 333 */       addCriterion("IS_BACK is not null");
/* 334 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackEqualTo(Long value) {
/* 338 */       addCriterion("IS_BACK =", value, "isBack");
/* 339 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackNotEqualTo(Long value) {
/* 343 */       addCriterion("IS_BACK <>", value, "isBack");
/* 344 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackGreaterThan(Long value) {
/* 348 */       addCriterion("IS_BACK >", value, "isBack");
/* 349 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackGreaterThanOrEqualTo(Long value) {
/* 353 */       addCriterion("IS_BACK >=", value, "isBack");
/* 354 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackLessThan(Long value) {
/* 358 */       addCriterion("IS_BACK <", value, "isBack");
/* 359 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackLessThanOrEqualTo(Long value) {
/* 363 */       addCriterion("IS_BACK <=", value, "isBack");
/* 364 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackIn(List<Long> values) {
/* 368 */       addCriterion("IS_BACK in", values, "isBack");
/* 369 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackNotIn(List<Long> values) {
/* 373 */       addCriterion("IS_BACK not in", values, "isBack");
/* 374 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackBetween(Long value1, Long value2) {
/* 378 */       addCriterion("IS_BACK between", value1, value2, "isBack");
/* 379 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsBackNotBetween(Long value1, Long value2) {
/* 383 */       addCriterion("IS_BACK not between", value1, value2, "isBack");
/* 384 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderBackExample
 * JD-Core Version:    0.6.2
 */
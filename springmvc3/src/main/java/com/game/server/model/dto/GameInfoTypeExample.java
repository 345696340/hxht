/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class GameInfoTypeExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public GameInfoTypeExample()
/*     */   {
/*  39 */     this.oredCriteria = new ArrayList();
/*     */   }
/*     */ 
/*     */   public void setOrderByClause(String orderByClause)
/*     */   {
/*  49 */     this.orderByClause = orderByClause;
/*     */   }
/*     */ 
/*     */   public String getOrderByClause()
/*     */   {
/*  59 */     return this.orderByClause;
/*     */   }
/*     */ 
/*     */   public void setDistinct(boolean distinct)
/*     */   {
/*  69 */     this.distinct = distinct;
/*     */   }
/*     */ 
/*     */   public boolean isDistinct()
/*     */   {
/*  79 */     return this.distinct;
/*     */   }
/*     */ 
/*     */   public List<Criteria> getOredCriteria()
/*     */   {
/*  89 */     return this.oredCriteria;
/*     */   }
/*     */ 
/*     */   public void or(Criteria criteria)
/*     */   {
/*  99 */     this.oredCriteria.add(criteria);
/*     */   }
/*     */ 
/*     */   public Criteria or()
/*     */   {
/* 109 */     Criteria criteria = createCriteriaInternal();
/* 110 */     this.oredCriteria.add(criteria);
/* 111 */     return criteria;
/*     */   }
/*     */ 
/*     */   public Criteria createCriteria()
/*     */   {
/* 121 */     Criteria criteria = createCriteriaInternal();
/* 122 */     if (this.oredCriteria.size() == 0) {
/* 123 */       this.oredCriteria.add(criteria);
/*     */     }
/* 125 */     return criteria;
/*     */   }
/*     */ 
/*     */   protected Criteria createCriteriaInternal()
/*     */   {
/* 135 */     Criteria criteria = new Criteria();
/* 136 */     return criteria;
/*     */   }
/*     */ 
/*     */   public void clear()
/*     */   {
/* 146 */     this.oredCriteria.clear();
/* 147 */     this.orderByClause = null;
/* 148 */     this.distinct = false;
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
/* 496 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 500 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 504 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 508 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 512 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 516 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 520 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 524 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 529 */       this.condition = condition;
/* 530 */       this.typeHandler = null;
/* 531 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 536 */       this.condition = condition;
/* 537 */       this.value = value;
/* 538 */       this.typeHandler = typeHandler;
/* 539 */       if ((value instanceof List))
/* 540 */         this.listValue = true;
/*     */       else
/* 542 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 547 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 552 */       this.condition = condition;
/* 553 */       this.value = value;
/* 554 */       this.secondValue = secondValue;
/* 555 */       this.typeHandler = typeHandler;
/* 556 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 560 */       this(condition, value, secondValue, null);
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
/* 162 */       this.criteria = new ArrayList();
/*     */     }
/*     */ 
/*     */     public boolean isValid() {
/* 166 */       return this.criteria.size() > 0;
/*     */     }
/*     */ 
/*     */     public List<Criterion> getAllCriteria() {
/* 170 */       return this.criteria;
/*     */     }
/*     */ 
/*     */     public List<Criterion> getCriteria() {
/* 174 */       return this.criteria;
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition) {
/* 178 */       if (condition == null) {
/* 179 */         throw new RuntimeException("Value for condition cannot be null");
/*     */       }
/* 181 */       this.criteria.add(new Criterion(condition));
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition, Object value, String property) {
/* 185 */       if (value == null) {
/* 186 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*     */       }
/* 188 */       this.criteria.add(new Criterion(condition, value));
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/* 192 */       if ((value1 == null) || (value2 == null)) {
/* 193 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*     */       }
/* 195 */       this.criteria.add(new Criterion(condition, value1, value2));
/*     */     }
/*     */ 
/*     */     public Criteria andUidIsNull() {
/* 199 */       addCriterion("UID is null");
/* 200 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidIsNotNull() {
/* 204 */       addCriterion("UID is not null");
/* 205 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidEqualTo(Long value) {
/* 209 */       addCriterion("UID =", value, "uid");
/* 210 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotEqualTo(Long value) {
/* 214 */       addCriterion("UID <>", value, "uid");
/* 215 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidGreaterThan(Long value) {
/* 219 */       addCriterion("UID >", value, "uid");
/* 220 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidGreaterThanOrEqualTo(Long value) {
/* 224 */       addCriterion("UID >=", value, "uid");
/* 225 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidLessThan(Long value) {
/* 229 */       addCriterion("UID <", value, "uid");
/* 230 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidLessThanOrEqualTo(Long value) {
/* 234 */       addCriterion("UID <=", value, "uid");
/* 235 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidIn(List<Long> values) {
/* 239 */       addCriterion("UID in", values, "uid");
/* 240 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotIn(List<Long> values) {
/* 244 */       addCriterion("UID not in", values, "uid");
/* 245 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidBetween(Long value1, Long value2) {
/* 249 */       addCriterion("UID between", value1, value2, "uid");
/* 250 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotBetween(Long value1, Long value2) {
/* 254 */       addCriterion("UID not between", value1, value2, "uid");
/* 255 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameIsNull() {
/* 259 */       addCriterion("GAME_TYPE_NAME is null");
/* 260 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameIsNotNull() {
/* 264 */       addCriterion("GAME_TYPE_NAME is not null");
/* 265 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameEqualTo(String value) {
/* 269 */       addCriterion("GAME_TYPE_NAME =", value, "gameTypeName");
/* 270 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameNotEqualTo(String value) {
/* 274 */       addCriterion("GAME_TYPE_NAME <>", value, "gameTypeName");
/* 275 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameGreaterThan(String value) {
/* 279 */       addCriterion("GAME_TYPE_NAME >", value, "gameTypeName");
/* 280 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameGreaterThanOrEqualTo(String value) {
/* 284 */       addCriterion("GAME_TYPE_NAME >=", value, "gameTypeName");
/* 285 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameLessThan(String value) {
/* 289 */       addCriterion("GAME_TYPE_NAME <", value, "gameTypeName");
/* 290 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameLessThanOrEqualTo(String value) {
/* 294 */       addCriterion("GAME_TYPE_NAME <=", value, "gameTypeName");
/* 295 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameLike(String value) {
/* 299 */       addCriterion("GAME_TYPE_NAME like", value, "gameTypeName");
/* 300 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameNotLike(String value) {
/* 304 */       addCriterion("GAME_TYPE_NAME not like", value, "gameTypeName");
/* 305 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameIn(List<String> values) {
/* 309 */       addCriterion("GAME_TYPE_NAME in", values, "gameTypeName");
/* 310 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameNotIn(List<String> values) {
/* 314 */       addCriterion("GAME_TYPE_NAME not in", values, "gameTypeName");
/* 315 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameBetween(String value1, String value2) {
/* 319 */       addCriterion("GAME_TYPE_NAME between", value1, value2, "gameTypeName");
/* 320 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNameNotBetween(String value1, String value2) {
/* 324 */       addCriterion("GAME_TYPE_NAME not between", value1, value2, "gameTypeName");
/* 325 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdIsNull() {
/* 329 */       addCriterion("GAME_ID is null");
/* 330 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdIsNotNull() {
/* 334 */       addCriterion("GAME_ID is not null");
/* 335 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdEqualTo(String value) {
/* 339 */       addCriterion("GAME_ID =", value, "gameId");
/* 340 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdNotEqualTo(String value) {
/* 344 */       addCriterion("GAME_ID <>", value, "gameId");
/* 345 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdGreaterThan(String value) {
/* 349 */       addCriterion("GAME_ID >", value, "gameId");
/* 350 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdGreaterThanOrEqualTo(String value) {
/* 354 */       addCriterion("GAME_ID >=", value, "gameId");
/* 355 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdLessThan(String value) {
/* 359 */       addCriterion("GAME_ID <", value, "gameId");
/* 360 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdLessThanOrEqualTo(String value) {
/* 364 */       addCriterion("GAME_ID <=", value, "gameId");
/* 365 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdLike(String value) {
/* 369 */       addCriterion("GAME_ID like", value, "gameId");
/* 370 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdNotLike(String value) {
/* 374 */       addCriterion("GAME_ID not like", value, "gameId");
/* 375 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdIn(List<String> values) {
/* 379 */       addCriterion("GAME_ID in", values, "gameId");
/* 380 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdNotIn(List<String> values) {
/* 384 */       addCriterion("GAME_ID not in", values, "gameId");
/* 385 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdBetween(String value1, String value2) {
/* 389 */       addCriterion("GAME_ID between", value1, value2, "gameId");
/* 390 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdNotBetween(String value1, String value2) {
/* 394 */       addCriterion("GAME_ID not between", value1, value2, "gameId");
/* 395 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateIsNull() {
/* 399 */       addCriterion("CREAD_DATE is null");
/* 400 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateIsNotNull() {
/* 404 */       addCriterion("CREAD_DATE is not null");
/* 405 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateEqualTo(Date value) {
/* 409 */       addCriterion("CREAD_DATE =", value, "creadDate");
/* 410 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateNotEqualTo(Date value) {
/* 414 */       addCriterion("CREAD_DATE <>", value, "creadDate");
/* 415 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateGreaterThan(Date value) {
/* 419 */       addCriterion("CREAD_DATE >", value, "creadDate");
/* 420 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateGreaterThanOrEqualTo(Date value) {
/* 424 */       addCriterion("CREAD_DATE >=", value, "creadDate");
/* 425 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateLessThan(Date value) {
/* 429 */       addCriterion("CREAD_DATE <", value, "creadDate");
/* 430 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateLessThanOrEqualTo(Date value) {
/* 434 */       addCriterion("CREAD_DATE <=", value, "creadDate");
/* 435 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateIn(List<Date> values) {
/* 439 */       addCriterion("CREAD_DATE in", values, "creadDate");
/* 440 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateNotIn(List<Date> values) {
/* 444 */       addCriterion("CREAD_DATE not in", values, "creadDate");
/* 445 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateBetween(Date value1, Date value2) {
/* 449 */       addCriterion("CREAD_DATE between", value1, value2, "creadDate");
/* 450 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreadDateNotBetween(Date value1, Date value2) {
/* 454 */       addCriterion("CREAD_DATE not between", value1, value2, "creadDate");
/* 455 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GameInfoTypeExample
 * JD-Core Version:    0.6.2
 */
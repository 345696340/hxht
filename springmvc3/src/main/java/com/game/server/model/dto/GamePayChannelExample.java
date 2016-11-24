/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class GamePayChannelExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public GamePayChannelExample()
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
/* 556 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 560 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 564 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 568 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 572 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 576 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 580 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 584 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 589 */       this.condition = condition;
/* 590 */       this.typeHandler = null;
/* 591 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 596 */       this.condition = condition;
/* 597 */       this.value = value;
/* 598 */       this.typeHandler = typeHandler;
/* 599 */       if ((value instanceof List))
/* 600 */         this.listValue = true;
/*     */       else
/* 602 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 607 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 612 */       this.condition = condition;
/* 613 */       this.value = value;
/* 614 */       this.secondValue = secondValue;
/* 615 */       this.typeHandler = typeHandler;
/* 616 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 620 */       this(condition, value, secondValue, null);
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
/*     */     public Criteria andChannelIdIsNull() {
/* 259 */       addCriterion("CHANNEL_ID is null");
/* 260 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdIsNotNull() {
/* 264 */       addCriterion("CHANNEL_ID is not null");
/* 265 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdEqualTo(String value) {
/* 269 */       addCriterion("CHANNEL_ID =", value, "channelId");
/* 270 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdNotEqualTo(String value) {
/* 274 */       addCriterion("CHANNEL_ID <>", value, "channelId");
/* 275 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdGreaterThan(String value) {
/* 279 */       addCriterion("CHANNEL_ID >", value, "channelId");
/* 280 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
/* 284 */       addCriterion("CHANNEL_ID >=", value, "channelId");
/* 285 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdLessThan(String value) {
/* 289 */       addCriterion("CHANNEL_ID <", value, "channelId");
/* 290 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdLessThanOrEqualTo(String value) {
/* 294 */       addCriterion("CHANNEL_ID <=", value, "channelId");
/* 295 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdLike(String value) {
/* 299 */       addCriterion("CHANNEL_ID like", value, "channelId");
/* 300 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdNotLike(String value) {
/* 304 */       addCriterion("CHANNEL_ID not like", value, "channelId");
/* 305 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdIn(List<String> values) {
/* 309 */       addCriterion("CHANNEL_ID in", values, "channelId");
/* 310 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdNotIn(List<String> values) {
/* 314 */       addCriterion("CHANNEL_ID not in", values, "channelId");
/* 315 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdBetween(String value1, String value2) {
/* 319 */       addCriterion("CHANNEL_ID between", value1, value2, "channelId");
/* 320 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andChannelIdNotBetween(String value1, String value2) {
/* 324 */       addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
/* 325 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinIsNull() {
/* 329 */       addCriterion("COIN is null");
/* 330 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinIsNotNull() {
/* 334 */       addCriterion("COIN is not null");
/* 335 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinEqualTo(Double value) {
/* 339 */       addCriterion("COIN =", value, "coin");
/* 340 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinNotEqualTo(Double value) {
/* 344 */       addCriterion("COIN <>", value, "coin");
/* 345 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinGreaterThan(Double value) {
/* 349 */       addCriterion("COIN >", value, "coin");
/* 350 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinGreaterThanOrEqualTo(Double value) {
/* 354 */       addCriterion("COIN >=", value, "coin");
/* 355 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinLessThan(Double value) {
/* 359 */       addCriterion("COIN <", value, "coin");
/* 360 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinLessThanOrEqualTo(Double value) {
/* 364 */       addCriterion("COIN <=", value, "coin");
/* 365 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinIn(List<Double> values) {
/* 369 */       addCriterion("COIN in", values, "coin");
/* 370 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinNotIn(List<Double> values) {
/* 374 */       addCriterion("COIN not in", values, "coin");
/* 375 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinBetween(Double value1, Double value2) {
/* 379 */       addCriterion("COIN between", value1, value2, "coin");
/* 380 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCoinNotBetween(Double value1, Double value2) {
/* 384 */       addCriterion("COIN not between", value1, value2, "coin");
/* 385 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateIsNull() {
/* 389 */       addCriterion("CREATE_DATE is null");
/* 390 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateIsNotNull() {
/* 394 */       addCriterion("CREATE_DATE is not null");
/* 395 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateEqualTo(Date value) {
/* 399 */       addCriterion("CREATE_DATE =", value, "createDate");
/* 400 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotEqualTo(Date value) {
/* 404 */       addCriterion("CREATE_DATE <>", value, "createDate");
/* 405 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateGreaterThan(Date value) {
/* 409 */       addCriterion("CREATE_DATE >", value, "createDate");
/* 410 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
/* 414 */       addCriterion("CREATE_DATE >=", value, "createDate");
/* 415 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateLessThan(Date value) {
/* 419 */       addCriterion("CREATE_DATE <", value, "createDate");
/* 420 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateLessThanOrEqualTo(Date value) {
/* 424 */       addCriterion("CREATE_DATE <=", value, "createDate");
/* 425 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateIn(List<Date> values) {
/* 429 */       addCriterion("CREATE_DATE in", values, "createDate");
/* 430 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotIn(List<Date> values) {
/* 434 */       addCriterion("CREATE_DATE not in", values, "createDate");
/* 435 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateBetween(Date value1, Date value2) {
/* 439 */       addCriterion("CREATE_DATE between", value1, value2, "createDate");
/* 440 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotBetween(Date value1, Date value2) {
/* 444 */       addCriterion("CREATE_DATE not between", value1, value2, "createDate");
/* 445 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorIsNull() {
/* 449 */       addCriterion("CREATOR is null");
/* 450 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorIsNotNull() {
/* 454 */       addCriterion("CREATOR is not null");
/* 455 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorEqualTo(String value) {
/* 459 */       addCriterion("CREATOR =", value, "creator");
/* 460 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorNotEqualTo(String value) {
/* 464 */       addCriterion("CREATOR <>", value, "creator");
/* 465 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorGreaterThan(String value) {
/* 469 */       addCriterion("CREATOR >", value, "creator");
/* 470 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorGreaterThanOrEqualTo(String value) {
/* 474 */       addCriterion("CREATOR >=", value, "creator");
/* 475 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorLessThan(String value) {
/* 479 */       addCriterion("CREATOR <", value, "creator");
/* 480 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorLessThanOrEqualTo(String value) {
/* 484 */       addCriterion("CREATOR <=", value, "creator");
/* 485 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorLike(String value) {
/* 489 */       addCriterion("CREATOR like", value, "creator");
/* 490 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorNotLike(String value) {
/* 494 */       addCriterion("CREATOR not like", value, "creator");
/* 495 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorIn(List<String> values) {
/* 499 */       addCriterion("CREATOR in", values, "creator");
/* 500 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorNotIn(List<String> values) {
/* 504 */       addCriterion("CREATOR not in", values, "creator");
/* 505 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorBetween(String value1, String value2) {
/* 509 */       addCriterion("CREATOR between", value1, value2, "creator");
/* 510 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatorNotBetween(String value1, String value2) {
/* 514 */       addCriterion("CREATOR not between", value1, value2, "creator");
/* 515 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GamePayChannelExample
 * JD-Core Version:    0.6.2
 */
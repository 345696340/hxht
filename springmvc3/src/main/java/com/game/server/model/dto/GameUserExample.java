/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class GameUserExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public GameUserExample()
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
/* 676 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 680 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 684 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 688 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 692 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 696 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 700 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 704 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 709 */       this.condition = condition;
/* 710 */       this.typeHandler = null;
/* 711 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 716 */       this.condition = condition;
/* 717 */       this.value = value;
/* 718 */       this.typeHandler = typeHandler;
/* 719 */       if ((value instanceof List))
/* 720 */         this.listValue = true;
/*     */       else
/* 722 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 727 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 732 */       this.condition = condition;
/* 733 */       this.value = value;
/* 734 */       this.secondValue = secondValue;
/* 735 */       this.typeHandler = typeHandler;
/* 736 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 740 */       this(condition, value, secondValue, null);
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
/*     */     public Criteria andUserIdIsNull() {
/* 259 */       addCriterion("USER_ID is null");
/* 260 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdIsNotNull() {
/* 264 */       addCriterion("USER_ID is not null");
/* 265 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdEqualTo(String value) {
/* 269 */       addCriterion("USER_ID =", value, "userId");
/* 270 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotEqualTo(String value) {
/* 274 */       addCriterion("USER_ID <>", value, "userId");
/* 275 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdGreaterThan(String value) {
/* 279 */       addCriterion("USER_ID >", value, "userId");
/* 280 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdGreaterThanOrEqualTo(String value) {
/* 284 */       addCriterion("USER_ID >=", value, "userId");
/* 285 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdLessThan(String value) {
/* 289 */       addCriterion("USER_ID <", value, "userId");
/* 290 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdLessThanOrEqualTo(String value) {
/* 294 */       addCriterion("USER_ID <=", value, "userId");
/* 295 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdLike(String value) {
/* 299 */       addCriterion("USER_ID like", value, "userId");
/* 300 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotLike(String value) {
/* 304 */       addCriterion("USER_ID not like", value, "userId");
/* 305 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdIn(List<String> values) {
/* 309 */       addCriterion("USER_ID in", values, "userId");
/* 310 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotIn(List<String> values) {
/* 314 */       addCriterion("USER_ID not in", values, "userId");
/* 315 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdBetween(String value1, String value2) {
/* 319 */       addCriterion("USER_ID between", value1, value2, "userId");
/* 320 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotBetween(String value1, String value2) {
/* 324 */       addCriterion("USER_ID not between", value1, value2, "userId");
/* 325 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeIsNull() {
/* 329 */       addCriterion("GAME_TYPE is null");
/* 330 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeIsNotNull() {
/* 334 */       addCriterion("GAME_TYPE is not null");
/* 335 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeEqualTo(Long value) {
/* 339 */       addCriterion("GAME_TYPE =", value, "gameType");
/* 340 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNotEqualTo(Long value) {
/* 344 */       addCriterion("GAME_TYPE <>", value, "gameType");
/* 345 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeGreaterThan(Long value) {
/* 349 */       addCriterion("GAME_TYPE >", value, "gameType");
/* 350 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeGreaterThanOrEqualTo(Long value) {
/* 354 */       addCriterion("GAME_TYPE >=", value, "gameType");
/* 355 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeLessThan(Long value) {
/* 359 */       addCriterion("GAME_TYPE <", value, "gameType");
/* 360 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeLessThanOrEqualTo(Long value) {
/* 364 */       addCriterion("GAME_TYPE <=", value, "gameType");
/* 365 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeIn(List<Long> values) {
/* 369 */       addCriterion("GAME_TYPE in", values, "gameType");
/* 370 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNotIn(List<Long> values) {
/* 374 */       addCriterion("GAME_TYPE not in", values, "gameType");
/* 375 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeBetween(Long value1, Long value2) {
/* 379 */       addCriterion("GAME_TYPE between", value1, value2, "gameType");
/* 380 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameTypeNotBetween(Long value1, Long value2) {
/* 384 */       addCriterion("GAME_TYPE not between", value1, value2, "gameType");
/* 385 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointIsNull() {
/* 389 */       addCriterion("USER_MAX_POINT is null");
/* 390 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointIsNotNull() {
/* 394 */       addCriterion("USER_MAX_POINT is not null");
/* 395 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointEqualTo(Long value) {
/* 399 */       addCriterion("USER_MAX_POINT =", value, "userMaxPoint");
/* 400 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointNotEqualTo(Long value) {
/* 404 */       addCriterion("USER_MAX_POINT <>", value, "userMaxPoint");
/* 405 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointGreaterThan(Long value) {
/* 409 */       addCriterion("USER_MAX_POINT >", value, "userMaxPoint");
/* 410 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointGreaterThanOrEqualTo(Long value) {
/* 414 */       addCriterion("USER_MAX_POINT >=", value, "userMaxPoint");
/* 415 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointLessThan(Long value) {
/* 419 */       addCriterion("USER_MAX_POINT <", value, "userMaxPoint");
/* 420 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointLessThanOrEqualTo(Long value) {
/* 424 */       addCriterion("USER_MAX_POINT <=", value, "userMaxPoint");
/* 425 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointIn(List<Long> values) {
/* 429 */       addCriterion("USER_MAX_POINT in", values, "userMaxPoint");
/* 430 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointNotIn(List<Long> values) {
/* 434 */       addCriterion("USER_MAX_POINT not in", values, "userMaxPoint");
/* 435 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointBetween(Long value1, Long value2) {
/* 439 */       addCriterion("USER_MAX_POINT between", value1, value2, "userMaxPoint");
/* 440 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserMaxPointNotBetween(Long value1, Long value2) {
/* 444 */       addCriterion("USER_MAX_POINT not between", value1, value2, "userMaxPoint");
/* 445 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateIsNull() {
/* 449 */       addCriterion("LASTDATE is null");
/* 450 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateIsNotNull() {
/* 454 */       addCriterion("LASTDATE is not null");
/* 455 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateEqualTo(Date value) {
/* 459 */       addCriterion("LASTDATE =", value, "lastdate");
/* 460 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateNotEqualTo(Date value) {
/* 464 */       addCriterion("LASTDATE <>", value, "lastdate");
/* 465 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateGreaterThan(Date value) {
/* 469 */       addCriterion("LASTDATE >", value, "lastdate");
/* 470 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateGreaterThanOrEqualTo(Date value) {
/* 474 */       addCriterion("LASTDATE >=", value, "lastdate");
/* 475 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateLessThan(Date value) {
/* 479 */       addCriterion("LASTDATE <", value, "lastdate");
/* 480 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateLessThanOrEqualTo(Date value) {
/* 484 */       addCriterion("LASTDATE <=", value, "lastdate");
/* 485 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateIn(List<Date> values) {
/* 489 */       addCriterion("LASTDATE in", values, "lastdate");
/* 490 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateNotIn(List<Date> values) {
/* 494 */       addCriterion("LASTDATE not in", values, "lastdate");
/* 495 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateBetween(Date value1, Date value2) {
/* 499 */       addCriterion("LASTDATE between", value1, value2, "lastdate");
/* 500 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastdateNotBetween(Date value1, Date value2) {
/* 504 */       addCriterion("LASTDATE not between", value1, value2, "lastdate");
/* 505 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdIsNull() {
/* 509 */       addCriterion("CREATD is null");
/* 510 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdIsNotNull() {
/* 514 */       addCriterion("CREATD is not null");
/* 515 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdEqualTo(Date value) {
/* 519 */       addCriterion("CREATD =", value, "creatd");
/* 520 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdNotEqualTo(Date value) {
/* 524 */       addCriterion("CREATD <>", value, "creatd");
/* 525 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdGreaterThan(Date value) {
/* 529 */       addCriterion("CREATD >", value, "creatd");
/* 530 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdGreaterThanOrEqualTo(Date value) {
/* 534 */       addCriterion("CREATD >=", value, "creatd");
/* 535 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdLessThan(Date value) {
/* 539 */       addCriterion("CREATD <", value, "creatd");
/* 540 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdLessThanOrEqualTo(Date value) {
/* 544 */       addCriterion("CREATD <=", value, "creatd");
/* 545 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdIn(List<Date> values) {
/* 549 */       addCriterion("CREATD in", values, "creatd");
/* 550 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdNotIn(List<Date> values) {
/* 554 */       addCriterion("CREATD not in", values, "creatd");
/* 555 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdBetween(Date value1, Date value2) {
/* 559 */       addCriterion("CREATD between", value1, value2, "creatd");
/* 560 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatdNotBetween(Date value1, Date value2) {
/* 564 */       addCriterion("CREATD not between", value1, value2, "creatd");
/* 565 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdIsNull() {
/* 569 */       addCriterion("GAME_ID is null");
/* 570 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdIsNotNull() {
/* 574 */       addCriterion("GAME_ID is not null");
/* 575 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdEqualTo(String value) {
/* 579 */       addCriterion("GAME_ID =", value, "gameId");
/* 580 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdNotEqualTo(String value) {
/* 584 */       addCriterion("GAME_ID <>", value, "gameId");
/* 585 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdGreaterThan(String value) {
/* 589 */       addCriterion("GAME_ID >", value, "gameId");
/* 590 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdGreaterThanOrEqualTo(String value) {
/* 594 */       addCriterion("GAME_ID >=", value, "gameId");
/* 595 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdLessThan(String value) {
/* 599 */       addCriterion("GAME_ID <", value, "gameId");
/* 600 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdLessThanOrEqualTo(String value) {
/* 604 */       addCriterion("GAME_ID <=", value, "gameId");
/* 605 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdLike(String value) {
/* 609 */       addCriterion("GAME_ID like", value, "gameId");
/* 610 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdNotLike(String value) {
/* 614 */       addCriterion("GAME_ID not like", value, "gameId");
/* 615 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdIn(List<String> values) {
/* 619 */       addCriterion("GAME_ID in", values, "gameId");
/* 620 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdNotIn(List<String> values) {
/* 624 */       addCriterion("GAME_ID not in", values, "gameId");
/* 625 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdBetween(String value1, String value2) {
/* 629 */       addCriterion("GAME_ID between", value1, value2, "gameId");
/* 630 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andGameIdNotBetween(String value1, String value2) {
/* 634 */       addCriterion("GAME_ID not between", value1, value2, "gameId");
/* 635 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GameUserExample
 * JD-Core Version:    0.6.2
 */
/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class UserInfoExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public UserInfoExample()
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
/* 616 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 620 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 624 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 628 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 632 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 636 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 640 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 644 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 649 */       this.condition = condition;
/* 650 */       this.typeHandler = null;
/* 651 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 656 */       this.condition = condition;
/* 657 */       this.value = value;
/* 658 */       this.typeHandler = typeHandler;
/* 659 */       if ((value instanceof List))
/* 660 */         this.listValue = true;
/*     */       else
/* 662 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 667 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 672 */       this.condition = condition;
/* 673 */       this.value = value;
/* 674 */       this.secondValue = secondValue;
/* 675 */       this.typeHandler = typeHandler;
/* 676 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 680 */       this(condition, value, secondValue, null);
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
/*     */     public Criteria andCreateDateIsNull() {
/* 329 */       addCriterion("CREATE_DATE is null");
/* 330 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateIsNotNull() {
/* 334 */       addCriterion("CREATE_DATE is not null");
/* 335 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateEqualTo(Date value) {
/* 339 */       addCriterion("CREATE_DATE =", value, "createDate");
/* 340 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotEqualTo(Date value) {
/* 344 */       addCriterion("CREATE_DATE <>", value, "createDate");
/* 345 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateGreaterThan(Date value) {
/* 349 */       addCriterion("CREATE_DATE >", value, "createDate");
/* 350 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
/* 354 */       addCriterion("CREATE_DATE >=", value, "createDate");
/* 355 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateLessThan(Date value) {
/* 359 */       addCriterion("CREATE_DATE <", value, "createDate");
/* 360 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateLessThanOrEqualTo(Date value) {
/* 364 */       addCriterion("CREATE_DATE <=", value, "createDate");
/* 365 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateIn(List<Date> values) {
/* 369 */       addCriterion("CREATE_DATE in", values, "createDate");
/* 370 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotIn(List<Date> values) {
/* 374 */       addCriterion("CREATE_DATE not in", values, "createDate");
/* 375 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateBetween(Date value1, Date value2) {
/* 379 */       addCriterion("CREATE_DATE between", value1, value2, "createDate");
/* 380 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotBetween(Date value1, Date value2) {
/* 384 */       addCriterion("CREATE_DATE not between", value1, value2, "createDate");
/* 385 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateIsNull() {
/* 389 */       addCriterion("LAST_LOGIN_DATE is null");
/* 390 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateIsNotNull() {
/* 394 */       addCriterion("LAST_LOGIN_DATE is not null");
/* 395 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateEqualTo(Date value) {
/* 399 */       addCriterion("LAST_LOGIN_DATE =", value, "lastLoginDate");
/* 400 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateNotEqualTo(Date value) {
/* 404 */       addCriterion("LAST_LOGIN_DATE <>", value, "lastLoginDate");
/* 405 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateGreaterThan(Date value) {
/* 409 */       addCriterion("LAST_LOGIN_DATE >", value, "lastLoginDate");
/* 410 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
/* 414 */       addCriterion("LAST_LOGIN_DATE >=", value, "lastLoginDate");
/* 415 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateLessThan(Date value) {
/* 419 */       addCriterion("LAST_LOGIN_DATE <", value, "lastLoginDate");
/* 420 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
/* 424 */       addCriterion("LAST_LOGIN_DATE <=", value, "lastLoginDate");
/* 425 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateIn(List<Date> values) {
/* 429 */       addCriterion("LAST_LOGIN_DATE in", values, "lastLoginDate");
/* 430 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateNotIn(List<Date> values) {
/* 434 */       addCriterion("LAST_LOGIN_DATE not in", values, "lastLoginDate");
/* 435 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateBetween(Date value1, Date value2) {
/* 439 */       addCriterion("LAST_LOGIN_DATE between", value1, value2, "lastLoginDate");
/* 440 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
/* 444 */       addCriterion("LAST_LOGIN_DATE not between", value1, value2, "lastLoginDate");
/* 445 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitIsNull() {
/* 449 */       addCriterion("PORTRAIT is null");
/* 450 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitIsNotNull() {
/* 454 */       addCriterion("PORTRAIT is not null");
/* 455 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitEqualTo(String value) {
/* 459 */       addCriterion("PORTRAIT =", value, "portrait");
/* 460 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitNotEqualTo(String value) {
/* 464 */       addCriterion("PORTRAIT <>", value, "portrait");
/* 465 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitGreaterThan(String value) {
/* 469 */       addCriterion("PORTRAIT >", value, "portrait");
/* 470 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitGreaterThanOrEqualTo(String value) {
/* 474 */       addCriterion("PORTRAIT >=", value, "portrait");
/* 475 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitLessThan(String value) {
/* 479 */       addCriterion("PORTRAIT <", value, "portrait");
/* 480 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitLessThanOrEqualTo(String value) {
/* 484 */       addCriterion("PORTRAIT <=", value, "portrait");
/* 485 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitLike(String value) {
/* 489 */       addCriterion("PORTRAIT like", value, "portrait");
/* 490 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitNotLike(String value) {
/* 494 */       addCriterion("PORTRAIT not like", value, "portrait");
/* 495 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitIn(List<String> values) {
/* 499 */       addCriterion("PORTRAIT in", values, "portrait");
/* 500 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitNotIn(List<String> values) {
/* 504 */       addCriterion("PORTRAIT not in", values, "portrait");
/* 505 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitBetween(String value1, String value2) {
/* 509 */       addCriterion("PORTRAIT between", value1, value2, "portrait");
/* 510 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPortraitNotBetween(String value1, String value2) {
/* 514 */       addCriterion("PORTRAIT not between", value1, value2, "portrait");
/* 515 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexIsNull() {
/* 519 */       addCriterion("SEX is null");
/* 520 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexIsNotNull() {
/* 524 */       addCriterion("SEX is not null");
/* 525 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexEqualTo(Long value) {
/* 529 */       addCriterion("SEX =", value, "sex");
/* 530 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexNotEqualTo(Long value) {
/* 534 */       addCriterion("SEX <>", value, "sex");
/* 535 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexGreaterThan(Long value) {
/* 539 */       addCriterion("SEX >", value, "sex");
/* 540 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexGreaterThanOrEqualTo(Long value) {
/* 544 */       addCriterion("SEX >=", value, "sex");
/* 545 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexLessThan(Long value) {
/* 549 */       addCriterion("SEX <", value, "sex");
/* 550 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexLessThanOrEqualTo(Long value) {
/* 554 */       addCriterion("SEX <=", value, "sex");
/* 555 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexIn(List<Long> values) {
/* 559 */       addCriterion("SEX in", values, "sex");
/* 560 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexNotIn(List<Long> values) {
/* 564 */       addCriterion("SEX not in", values, "sex");
/* 565 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexBetween(Long value1, Long value2) {
/* 569 */       addCriterion("SEX between", value1, value2, "sex");
/* 570 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSexNotBetween(Long value1, Long value2) {
/* 574 */       addCriterion("SEX not between", value1, value2, "sex");
/* 575 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.UserInfoExample
 * JD-Core Version:    0.6.2
 */
/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class UserCheckInLogExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public UserCheckInLogExample()
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
/* 626 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 630 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 634 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 638 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 642 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 646 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 650 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 654 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 659 */       this.condition = condition;
/* 660 */       this.typeHandler = null;
/* 661 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 666 */       this.condition = condition;
/* 667 */       this.value = value;
/* 668 */       this.typeHandler = typeHandler;
/* 669 */       if ((value instanceof List))
/* 670 */         this.listValue = true;
/*     */       else
/* 672 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 677 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 682 */       this.condition = condition;
/* 683 */       this.value = value;
/* 684 */       this.secondValue = secondValue;
/* 685 */       this.typeHandler = typeHandler;
/* 686 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 690 */       this(condition, value, secondValue, null);
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
/*     */     public Criteria andIdIsNull() {
/* 199 */       addCriterion("ID is null");
/* 200 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdIsNotNull() {
/* 204 */       addCriterion("ID is not null");
/* 205 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdEqualTo(String value) {
/* 209 */       addCriterion("ID =", value, "id");
/* 210 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdNotEqualTo(String value) {
/* 214 */       addCriterion("ID <>", value, "id");
/* 215 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdGreaterThan(String value) {
/* 219 */       addCriterion("ID >", value, "id");
/* 220 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdGreaterThanOrEqualTo(String value) {
/* 224 */       addCriterion("ID >=", value, "id");
/* 225 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdLessThan(String value) {
/* 229 */       addCriterion("ID <", value, "id");
/* 230 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdLessThanOrEqualTo(String value) {
/* 234 */       addCriterion("ID <=", value, "id");
/* 235 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdLike(String value) {
/* 239 */       addCriterion("ID like", value, "id");
/* 240 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdNotLike(String value) {
/* 244 */       addCriterion("ID not like", value, "id");
/* 245 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdIn(List<String> values) {
/* 249 */       addCriterion("ID in", values, "id");
/* 250 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdNotIn(List<String> values) {
/* 254 */       addCriterion("ID not in", values, "id");
/* 255 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdBetween(String value1, String value2) {
/* 259 */       addCriterion("ID between", value1, value2, "id");
/* 260 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdNotBetween(String value1, String value2) {
/* 264 */       addCriterion("ID not between", value1, value2, "id");
/* 265 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateIsNull() {
/* 269 */       addCriterion("CHECK_IN_DATE is null");
/* 270 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateIsNotNull() {
/* 274 */       addCriterion("CHECK_IN_DATE is not null");
/* 275 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateEqualTo(Date value) {
/* 279 */       addCriterion("CHECK_IN_DATE =", value, "checkInDate");
/* 280 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateNotEqualTo(Date value) {
/* 284 */       addCriterion("CHECK_IN_DATE <>", value, "checkInDate");
/* 285 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateGreaterThan(Date value) {
/* 289 */       addCriterion("CHECK_IN_DATE >", value, "checkInDate");
/* 290 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateGreaterThanOrEqualTo(Date value) {
/* 294 */       addCriterion("CHECK_IN_DATE >=", value, "checkInDate");
/* 295 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateLessThan(Date value) {
/* 299 */       addCriterion("CHECK_IN_DATE <", value, "checkInDate");
/* 300 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateLessThanOrEqualTo(Date value) {
/* 304 */       addCriterion("CHECK_IN_DATE <=", value, "checkInDate");
/* 305 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateIn(List<Date> values) {
/* 309 */       addCriterion("CHECK_IN_DATE in", values, "checkInDate");
/* 310 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateNotIn(List<Date> values) {
/* 314 */       addCriterion("CHECK_IN_DATE not in", values, "checkInDate");
/* 315 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateBetween(Date value1, Date value2) {
/* 319 */       addCriterion("CHECK_IN_DATE between", value1, value2, "checkInDate");
/* 320 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCheckInDateNotBetween(Date value1, Date value2) {
/* 324 */       addCriterion("CHECK_IN_DATE not between", value1, value2, "checkInDate");
/* 325 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdIsNull() {
/* 329 */       addCriterion("USER_ID is null");
/* 330 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdIsNotNull() {
/* 334 */       addCriterion("USER_ID is not null");
/* 335 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdEqualTo(String value) {
/* 339 */       addCriterion("USER_ID =", value, "userId");
/* 340 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotEqualTo(String value) {
/* 344 */       addCriterion("USER_ID <>", value, "userId");
/* 345 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdGreaterThan(String value) {
/* 349 */       addCriterion("USER_ID >", value, "userId");
/* 350 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdGreaterThanOrEqualTo(String value) {
/* 354 */       addCriterion("USER_ID >=", value, "userId");
/* 355 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdLessThan(String value) {
/* 359 */       addCriterion("USER_ID <", value, "userId");
/* 360 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdLessThanOrEqualTo(String value) {
/* 364 */       addCriterion("USER_ID <=", value, "userId");
/* 365 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdLike(String value) {
/* 369 */       addCriterion("USER_ID like", value, "userId");
/* 370 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotLike(String value) {
/* 374 */       addCriterion("USER_ID not like", value, "userId");
/* 375 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdIn(List<String> values) {
/* 379 */       addCriterion("USER_ID in", values, "userId");
/* 380 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotIn(List<String> values) {
/* 384 */       addCriterion("USER_ID not in", values, "userId");
/* 385 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdBetween(String value1, String value2) {
/* 389 */       addCriterion("USER_ID between", value1, value2, "userId");
/* 390 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotBetween(String value1, String value2) {
/* 394 */       addCriterion("USER_ID not between", value1, value2, "userId");
/* 395 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutIsNull() {
/* 399 */       addCriterion("IS_TIMEOUT is null");
/* 400 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutIsNotNull() {
/* 404 */       addCriterion("IS_TIMEOUT is not null");
/* 405 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutEqualTo(Integer value) {
/* 409 */       addCriterion("IS_TIMEOUT =", value, "isTimeout");
/* 410 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutNotEqualTo(Integer value) {
/* 414 */       addCriterion("IS_TIMEOUT <>", value, "isTimeout");
/* 415 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutGreaterThan(Integer value) {
/* 419 */       addCriterion("IS_TIMEOUT >", value, "isTimeout");
/* 420 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutGreaterThanOrEqualTo(Integer value) {
/* 424 */       addCriterion("IS_TIMEOUT >=", value, "isTimeout");
/* 425 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutLessThan(Integer value) {
/* 429 */       addCriterion("IS_TIMEOUT <", value, "isTimeout");
/* 430 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutLessThanOrEqualTo(Integer value) {
/* 434 */       addCriterion("IS_TIMEOUT <=", value, "isTimeout");
/* 435 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutIn(List<Integer> values) {
/* 439 */       addCriterion("IS_TIMEOUT in", values, "isTimeout");
/* 440 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutNotIn(List<Integer> values) {
/* 444 */       addCriterion("IS_TIMEOUT not in", values, "isTimeout");
/* 445 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutBetween(Integer value1, Integer value2) {
/* 449 */       addCriterion("IS_TIMEOUT between", value1, value2, "isTimeout");
/* 450 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsTimeoutNotBetween(Integer value1, Integer value2) {
/* 454 */       addCriterion("IS_TIMEOUT not between", value1, value2, "isTimeout");
/* 455 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonIsNull() {
/* 459 */       addCriterion("REASON is null");
/* 460 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonIsNotNull() {
/* 464 */       addCriterion("REASON is not null");
/* 465 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonEqualTo(String value) {
/* 469 */       addCriterion("REASON =", value, "reason");
/* 470 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonNotEqualTo(String value) {
/* 474 */       addCriterion("REASON <>", value, "reason");
/* 475 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonGreaterThan(String value) {
/* 479 */       addCriterion("REASON >", value, "reason");
/* 480 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonGreaterThanOrEqualTo(String value) {
/* 484 */       addCriterion("REASON >=", value, "reason");
/* 485 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonLessThan(String value) {
/* 489 */       addCriterion("REASON <", value, "reason");
/* 490 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonLessThanOrEqualTo(String value) {
/* 494 */       addCriterion("REASON <=", value, "reason");
/* 495 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonLike(String value) {
/* 499 */       addCriterion("REASON like", value, "reason");
/* 500 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonNotLike(String value) {
/* 504 */       addCriterion("REASON not like", value, "reason");
/* 505 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonIn(List<String> values) {
/* 509 */       addCriterion("REASON in", values, "reason");
/* 510 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonNotIn(List<String> values) {
/* 514 */       addCriterion("REASON not in", values, "reason");
/* 515 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonBetween(String value1, String value2) {
/* 519 */       addCriterion("REASON between", value1, value2, "reason");
/* 520 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andReasonNotBetween(String value1, String value2) {
/* 524 */       addCriterion("REASON not between", value1, value2, "reason");
/* 525 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoIsNull() {
/* 529 */       addCriterion("IS_AUTO is null");
/* 530 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoIsNotNull() {
/* 534 */       addCriterion("IS_AUTO is not null");
/* 535 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoEqualTo(Long value) {
/* 539 */       addCriterion("IS_AUTO =", value, "isAuto");
/* 540 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoNotEqualTo(Long value) {
/* 544 */       addCriterion("IS_AUTO <>", value, "isAuto");
/* 545 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoGreaterThan(Long value) {
/* 549 */       addCriterion("IS_AUTO >", value, "isAuto");
/* 550 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoGreaterThanOrEqualTo(Long value) {
/* 554 */       addCriterion("IS_AUTO >=", value, "isAuto");
/* 555 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoLessThan(Long value) {
/* 559 */       addCriterion("IS_AUTO <", value, "isAuto");
/* 560 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoLessThanOrEqualTo(Long value) {
/* 564 */       addCriterion("IS_AUTO <=", value, "isAuto");
/* 565 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoIn(List<Long> values) {
/* 569 */       addCriterion("IS_AUTO in", values, "isAuto");
/* 570 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoNotIn(List<Long> values) {
/* 574 */       addCriterion("IS_AUTO not in", values, "isAuto");
/* 575 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoBetween(Long value1, Long value2) {
/* 579 */       addCriterion("IS_AUTO between", value1, value2, "isAuto");
/* 580 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIsAutoNotBetween(Long value1, Long value2) {
/* 584 */       addCriterion("IS_AUTO not between", value1, value2, "isAuto");
/* 585 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.UserCheckInLogExample
 * JD-Core Version:    0.6.2
 */
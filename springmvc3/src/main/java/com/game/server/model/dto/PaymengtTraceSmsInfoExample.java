/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class PaymengtTraceSmsInfoExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public PaymengtTraceSmsInfoExample()
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
/* 636 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 640 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 644 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 648 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 652 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 656 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 660 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 664 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 669 */       this.condition = condition;
/* 670 */       this.typeHandler = null;
/* 671 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 676 */       this.condition = condition;
/* 677 */       this.value = value;
/* 678 */       this.typeHandler = typeHandler;
/* 679 */       if ((value instanceof List))
/* 680 */         this.listValue = true;
/*     */       else
/* 682 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 687 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 692 */       this.condition = condition;
/* 693 */       this.value = value;
/* 694 */       this.secondValue = secondValue;
/* 695 */       this.typeHandler = typeHandler;
/* 696 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 700 */       this(condition, value, secondValue, null);
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
/*     */     public Criteria andTransactionIdIsNull() {
/* 259 */       addCriterion("TRANSACTION_ID is null");
/* 260 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdIsNotNull() {
/* 264 */       addCriterion("TRANSACTION_ID is not null");
/* 265 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdEqualTo(String value) {
/* 269 */       addCriterion("TRANSACTION_ID =", value, "transactionId");
/* 270 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdNotEqualTo(String value) {
/* 274 */       addCriterion("TRANSACTION_ID <>", value, "transactionId");
/* 275 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdGreaterThan(String value) {
/* 279 */       addCriterion("TRANSACTION_ID >", value, "transactionId");
/* 280 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
/* 284 */       addCriterion("TRANSACTION_ID >=", value, "transactionId");
/* 285 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdLessThan(String value) {
/* 289 */       addCriterion("TRANSACTION_ID <", value, "transactionId");
/* 290 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdLessThanOrEqualTo(String value) {
/* 294 */       addCriterion("TRANSACTION_ID <=", value, "transactionId");
/* 295 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdLike(String value) {
/* 299 */       addCriterion("TRANSACTION_ID like", value, "transactionId");
/* 300 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdNotLike(String value) {
/* 304 */       addCriterion("TRANSACTION_ID not like", value, "transactionId");
/* 305 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdIn(List<String> values) {
/* 309 */       addCriterion("TRANSACTION_ID in", values, "transactionId");
/* 310 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdNotIn(List<String> values) {
/* 314 */       addCriterion("TRANSACTION_ID not in", values, "transactionId");
/* 315 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdBetween(String value1, String value2) {
/* 319 */       addCriterion("TRANSACTION_ID between", value1, value2, "transactionId");
/* 320 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTransactionIdNotBetween(String value1, String value2) {
/* 324 */       addCriterion("TRANSACTION_ID not between", value1, value2, "transactionId");
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
/*     */     public Criteria andActionIsNull() {
/* 389 */       addCriterion("ACTION is null");
/* 390 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionIsNotNull() {
/* 394 */       addCriterion("ACTION is not null");
/* 395 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionEqualTo(String value) {
/* 399 */       addCriterion("ACTION =", value, "action");
/* 400 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionNotEqualTo(String value) {
/* 404 */       addCriterion("ACTION <>", value, "action");
/* 405 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionGreaterThan(String value) {
/* 409 */       addCriterion("ACTION >", value, "action");
/* 410 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionGreaterThanOrEqualTo(String value) {
/* 414 */       addCriterion("ACTION >=", value, "action");
/* 415 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionLessThan(String value) {
/* 419 */       addCriterion("ACTION <", value, "action");
/* 420 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionLessThanOrEqualTo(String value) {
/* 424 */       addCriterion("ACTION <=", value, "action");
/* 425 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionLike(String value) {
/* 429 */       addCriterion("ACTION like", value, "action");
/* 430 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionNotLike(String value) {
/* 434 */       addCriterion("ACTION not like", value, "action");
/* 435 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionIn(List<String> values) {
/* 439 */       addCriterion("ACTION in", values, "action");
/* 440 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionNotIn(List<String> values) {
/* 444 */       addCriterion("ACTION not in", values, "action");
/* 445 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionBetween(String value1, String value2) {
/* 449 */       addCriterion("ACTION between", value1, value2, "action");
/* 450 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andActionNotBetween(String value1, String value2) {
/* 454 */       addCriterion("ACTION not between", value1, value2, "action");
/* 455 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToIsNull() {
/* 459 */       addCriterion("SMS_FROM_TO is null");
/* 460 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToIsNotNull() {
/* 464 */       addCriterion("SMS_FROM_TO is not null");
/* 465 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToEqualTo(String value) {
/* 469 */       addCriterion("SMS_FROM_TO =", value, "smsFromTo");
/* 470 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToNotEqualTo(String value) {
/* 474 */       addCriterion("SMS_FROM_TO <>", value, "smsFromTo");
/* 475 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToGreaterThan(String value) {
/* 479 */       addCriterion("SMS_FROM_TO >", value, "smsFromTo");
/* 480 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToGreaterThanOrEqualTo(String value) {
/* 484 */       addCriterion("SMS_FROM_TO >=", value, "smsFromTo");
/* 485 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToLessThan(String value) {
/* 489 */       addCriterion("SMS_FROM_TO <", value, "smsFromTo");
/* 490 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToLessThanOrEqualTo(String value) {
/* 494 */       addCriterion("SMS_FROM_TO <=", value, "smsFromTo");
/* 495 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToLike(String value) {
/* 499 */       addCriterion("SMS_FROM_TO like", value, "smsFromTo");
/* 500 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToNotLike(String value) {
/* 504 */       addCriterion("SMS_FROM_TO not like", value, "smsFromTo");
/* 505 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToIn(List<String> values) {
/* 509 */       addCriterion("SMS_FROM_TO in", values, "smsFromTo");
/* 510 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToNotIn(List<String> values) {
/* 514 */       addCriterion("SMS_FROM_TO not in", values, "smsFromTo");
/* 515 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToBetween(String value1, String value2) {
/* 519 */       addCriterion("SMS_FROM_TO between", value1, value2, "smsFromTo");
/* 520 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsFromToNotBetween(String value1, String value2) {
/* 524 */       addCriterion("SMS_FROM_TO not between", value1, value2, "smsFromTo");
/* 525 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentIsNull() {
/* 529 */       addCriterion("SMS_CONTENT is null");
/* 530 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentIsNotNull() {
/* 534 */       addCriterion("SMS_CONTENT is not null");
/* 535 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentEqualTo(String value) {
/* 539 */       addCriterion("SMS_CONTENT =", value, "smsContent");
/* 540 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentNotEqualTo(String value) {
/* 544 */       addCriterion("SMS_CONTENT <>", value, "smsContent");
/* 545 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentGreaterThan(String value) {
/* 549 */       addCriterion("SMS_CONTENT >", value, "smsContent");
/* 550 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentGreaterThanOrEqualTo(String value) {
/* 554 */       addCriterion("SMS_CONTENT >=", value, "smsContent");
/* 555 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentLessThan(String value) {
/* 559 */       addCriterion("SMS_CONTENT <", value, "smsContent");
/* 560 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentLessThanOrEqualTo(String value) {
/* 564 */       addCriterion("SMS_CONTENT <=", value, "smsContent");
/* 565 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentLike(String value) {
/* 569 */       addCriterion("SMS_CONTENT like", value, "smsContent");
/* 570 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentNotLike(String value) {
/* 574 */       addCriterion("SMS_CONTENT not like", value, "smsContent");
/* 575 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentIn(List<String> values) {
/* 579 */       addCriterion("SMS_CONTENT in", values, "smsContent");
/* 580 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentNotIn(List<String> values) {
/* 584 */       addCriterion("SMS_CONTENT not in", values, "smsContent");
/* 585 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentBetween(String value1, String value2) {
/* 589 */       addCriterion("SMS_CONTENT between", value1, value2, "smsContent");
/* 590 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andSmsContentNotBetween(String value1, String value2) {
/* 594 */       addCriterion("SMS_CONTENT not between", value1, value2, "smsContent");
/* 595 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PaymengtTraceSmsInfoExample
 * JD-Core Version:    0.6.2
 */
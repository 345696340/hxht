/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class GamePayExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public GamePayExample()
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
/* 836 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 840 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 844 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 848 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 852 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 856 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 860 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 864 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 869 */       this.condition = condition;
/* 870 */       this.typeHandler = null;
/* 871 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 876 */       this.condition = condition;
/* 877 */       this.value = value;
/* 878 */       this.typeHandler = typeHandler;
/* 879 */       if ((value instanceof List))
/* 880 */         this.listValue = true;
/*     */       else
/* 882 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 887 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 892 */       this.condition = condition;
/* 893 */       this.value = value;
/* 894 */       this.secondValue = secondValue;
/* 895 */       this.typeHandler = typeHandler;
/* 896 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 900 */       this(condition, value, secondValue, null);
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
/*     */     public Criteria andUserIdEqualTo(Long value) {
/* 269 */       addCriterion("USER_ID =", value, "userId");
/* 270 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotEqualTo(Long value) {
/* 274 */       addCriterion("USER_ID <>", value, "userId");
/* 275 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdGreaterThan(Long value) {
/* 279 */       addCriterion("USER_ID >", value, "userId");
/* 280 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
/* 284 */       addCriterion("USER_ID >=", value, "userId");
/* 285 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdLessThan(Long value) {
/* 289 */       addCriterion("USER_ID <", value, "userId");
/* 290 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdLessThanOrEqualTo(Long value) {
/* 294 */       addCriterion("USER_ID <=", value, "userId");
/* 295 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdIn(List<Long> values) {
/* 299 */       addCriterion("USER_ID in", values, "userId");
/* 300 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotIn(List<Long> values) {
/* 304 */       addCriterion("USER_ID not in", values, "userId");
/* 305 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdBetween(Long value1, Long value2) {
/* 309 */       addCriterion("USER_ID between", value1, value2, "userId");
/* 310 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUserIdNotBetween(Long value1, Long value2) {
/* 314 */       addCriterion("USER_ID not between", value1, value2, "userId");
/* 315 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateIsNull() {
/* 319 */       addCriterion("CREATE_DATE is null");
/* 320 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateIsNotNull() {
/* 324 */       addCriterion("CREATE_DATE is not null");
/* 325 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateEqualTo(Date value) {
/* 329 */       addCriterion("CREATE_DATE =", value, "createDate");
/* 330 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotEqualTo(Date value) {
/* 334 */       addCriterion("CREATE_DATE <>", value, "createDate");
/* 335 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateGreaterThan(Date value) {
/* 339 */       addCriterion("CREATE_DATE >", value, "createDate");
/* 340 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
/* 344 */       addCriterion("CREATE_DATE >=", value, "createDate");
/* 345 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateLessThan(Date value) {
/* 349 */       addCriterion("CREATE_DATE <", value, "createDate");
/* 350 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateLessThanOrEqualTo(Date value) {
/* 354 */       addCriterion("CREATE_DATE <=", value, "createDate");
/* 355 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateIn(List<Date> values) {
/* 359 */       addCriterion("CREATE_DATE in", values, "createDate");
/* 360 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotIn(List<Date> values) {
/* 364 */       addCriterion("CREATE_DATE not in", values, "createDate");
/* 365 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateBetween(Date value1, Date value2) {
/* 369 */       addCriterion("CREATE_DATE between", value1, value2, "createDate");
/* 370 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreateDateNotBetween(Date value1, Date value2) {
/* 374 */       addCriterion("CREATE_DATE not between", value1, value2, "createDate");
/* 375 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeIsNull() {
/* 379 */       addCriterion("RES_CODE is null");
/* 380 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeIsNotNull() {
/* 384 */       addCriterion("RES_CODE is not null");
/* 385 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeEqualTo(String value) {
/* 389 */       addCriterion("RES_CODE =", value, "resCode");
/* 390 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeNotEqualTo(String value) {
/* 394 */       addCriterion("RES_CODE <>", value, "resCode");
/* 395 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeGreaterThan(String value) {
/* 399 */       addCriterion("RES_CODE >", value, "resCode");
/* 400 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeGreaterThanOrEqualTo(String value) {
/* 404 */       addCriterion("RES_CODE >=", value, "resCode");
/* 405 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeLessThan(String value) {
/* 409 */       addCriterion("RES_CODE <", value, "resCode");
/* 410 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeLessThanOrEqualTo(String value) {
/* 414 */       addCriterion("RES_CODE <=", value, "resCode");
/* 415 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeLike(String value) {
/* 419 */       addCriterion("RES_CODE like", value, "resCode");
/* 420 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeNotLike(String value) {
/* 424 */       addCriterion("RES_CODE not like", value, "resCode");
/* 425 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeIn(List<String> values) {
/* 429 */       addCriterion("RES_CODE in", values, "resCode");
/* 430 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeNotIn(List<String> values) {
/* 434 */       addCriterion("RES_CODE not in", values, "resCode");
/* 435 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeBetween(String value1, String value2) {
/* 439 */       addCriterion("RES_CODE between", value1, value2, "resCode");
/* 440 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResCodeNotBetween(String value1, String value2) {
/* 444 */       addCriterion("RES_CODE not between", value1, value2, "resCode");
/* 445 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescIsNull() {
/* 449 */       addCriterion("RES_DESC is null");
/* 450 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescIsNotNull() {
/* 454 */       addCriterion("RES_DESC is not null");
/* 455 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescEqualTo(String value) {
/* 459 */       addCriterion("RES_DESC =", value, "resDesc");
/* 460 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescNotEqualTo(String value) {
/* 464 */       addCriterion("RES_DESC <>", value, "resDesc");
/* 465 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescGreaterThan(String value) {
/* 469 */       addCriterion("RES_DESC >", value, "resDesc");
/* 470 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescGreaterThanOrEqualTo(String value) {
/* 474 */       addCriterion("RES_DESC >=", value, "resDesc");
/* 475 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescLessThan(String value) {
/* 479 */       addCriterion("RES_DESC <", value, "resDesc");
/* 480 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescLessThanOrEqualTo(String value) {
/* 484 */       addCriterion("RES_DESC <=", value, "resDesc");
/* 485 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescLike(String value) {
/* 489 */       addCriterion("RES_DESC like", value, "resDesc");
/* 490 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescNotLike(String value) {
/* 494 */       addCriterion("RES_DESC not like", value, "resDesc");
/* 495 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescIn(List<String> values) {
/* 499 */       addCriterion("RES_DESC in", values, "resDesc");
/* 500 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescNotIn(List<String> values) {
/* 504 */       addCriterion("RES_DESC not in", values, "resDesc");
/* 505 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescBetween(String value1, String value2) {
/* 509 */       addCriterion("RES_DESC between", value1, value2, "resDesc");
/* 510 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andResDescNotBetween(String value1, String value2) {
/* 514 */       addCriterion("RES_DESC not between", value1, value2, "resDesc");
/* 515 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdIsNull() {
/* 519 */       addCriterion("ORDER_ID is null");
/* 520 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdIsNotNull() {
/* 524 */       addCriterion("ORDER_ID is not null");
/* 525 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdEqualTo(String value) {
/* 529 */       addCriterion("ORDER_ID =", value, "orderId");
/* 530 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdNotEqualTo(String value) {
/* 534 */       addCriterion("ORDER_ID <>", value, "orderId");
/* 535 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdGreaterThan(String value) {
/* 539 */       addCriterion("ORDER_ID >", value, "orderId");
/* 540 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
/* 544 */       addCriterion("ORDER_ID >=", value, "orderId");
/* 545 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdLessThan(String value) {
/* 549 */       addCriterion("ORDER_ID <", value, "orderId");
/* 550 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdLessThanOrEqualTo(String value) {
/* 554 */       addCriterion("ORDER_ID <=", value, "orderId");
/* 555 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdLike(String value) {
/* 559 */       addCriterion("ORDER_ID like", value, "orderId");
/* 560 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdNotLike(String value) {
/* 564 */       addCriterion("ORDER_ID not like", value, "orderId");
/* 565 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdIn(List<String> values) {
/* 569 */       addCriterion("ORDER_ID in", values, "orderId");
/* 570 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdNotIn(List<String> values) {
/* 574 */       addCriterion("ORDER_ID not in", values, "orderId");
/* 575 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdBetween(String value1, String value2) {
/* 579 */       addCriterion("ORDER_ID between", value1, value2, "orderId");
/* 580 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOrderIdNotBetween(String value1, String value2) {
/* 584 */       addCriterion("ORDER_ID not between", value1, value2, "orderId");
/* 585 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceIsNull() {
/* 589 */       addCriterion("PRICE is null");
/* 590 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceIsNotNull() {
/* 594 */       addCriterion("PRICE is not null");
/* 595 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceEqualTo(String value) {
/* 599 */       addCriterion("PRICE =", value, "price");
/* 600 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceNotEqualTo(String value) {
/* 604 */       addCriterion("PRICE <>", value, "price");
/* 605 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceGreaterThan(String value) {
/* 609 */       addCriterion("PRICE >", value, "price");
/* 610 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceGreaterThanOrEqualTo(String value) {
/* 614 */       addCriterion("PRICE >=", value, "price");
/* 615 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceLessThan(String value) {
/* 619 */       addCriterion("PRICE <", value, "price");
/* 620 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceLessThanOrEqualTo(String value) {
/* 624 */       addCriterion("PRICE <=", value, "price");
/* 625 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceLike(String value) {
/* 629 */       addCriterion("PRICE like", value, "price");
/* 630 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceNotLike(String value) {
/* 634 */       addCriterion("PRICE not like", value, "price");
/* 635 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceIn(List<String> values) {
/* 639 */       addCriterion("PRICE in", values, "price");
/* 640 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceNotIn(List<String> values) {
/* 644 */       addCriterion("PRICE not in", values, "price");
/* 645 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceBetween(String value1, String value2) {
/* 649 */       addCriterion("PRICE between", value1, value2, "price");
/* 650 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andPriceNotBetween(String value1, String value2) {
/* 654 */       addCriterion("PRICE not between", value1, value2, "price");
/* 655 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameIsNull() {
/* 659 */       addCriterion("BUSINESS_NAME is null");
/* 660 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameIsNotNull() {
/* 664 */       addCriterion("BUSINESS_NAME is not null");
/* 665 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameEqualTo(String value) {
/* 669 */       addCriterion("BUSINESS_NAME =", value, "businessName");
/* 670 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameNotEqualTo(String value) {
/* 674 */       addCriterion("BUSINESS_NAME <>", value, "businessName");
/* 675 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameGreaterThan(String value) {
/* 679 */       addCriterion("BUSINESS_NAME >", value, "businessName");
/* 680 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
/* 684 */       addCriterion("BUSINESS_NAME >=", value, "businessName");
/* 685 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameLessThan(String value) {
/* 689 */       addCriterion("BUSINESS_NAME <", value, "businessName");
/* 690 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameLessThanOrEqualTo(String value) {
/* 694 */       addCriterion("BUSINESS_NAME <=", value, "businessName");
/* 695 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameLike(String value) {
/* 699 */       addCriterion("BUSINESS_NAME like", value, "businessName");
/* 700 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameNotLike(String value) {
/* 704 */       addCriterion("BUSINESS_NAME not like", value, "businessName");
/* 705 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameIn(List<String> values) {
/* 709 */       addCriterion("BUSINESS_NAME in", values, "businessName");
/* 710 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameNotIn(List<String> values) {
/* 714 */       addCriterion("BUSINESS_NAME not in", values, "businessName");
/* 715 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameBetween(String value1, String value2) {
/* 719 */       addCriterion("BUSINESS_NAME between", value1, value2, "businessName");
/* 720 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andBusinessNameNotBetween(String value1, String value2) {
/* 724 */       addCriterion("BUSINESS_NAME not between", value1, value2, "businessName");
/* 725 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameIsNull() {
/* 729 */       addCriterion("COMPANY_NAME is null");
/* 730 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameIsNotNull() {
/* 734 */       addCriterion("COMPANY_NAME is not null");
/* 735 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameEqualTo(String value) {
/* 739 */       addCriterion("COMPANY_NAME =", value, "companyName");
/* 740 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameNotEqualTo(String value) {
/* 744 */       addCriterion("COMPANY_NAME <>", value, "companyName");
/* 745 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameGreaterThan(String value) {
/* 749 */       addCriterion("COMPANY_NAME >", value, "companyName");
/* 750 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
/* 754 */       addCriterion("COMPANY_NAME >=", value, "companyName");
/* 755 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameLessThan(String value) {
/* 759 */       addCriterion("COMPANY_NAME <", value, "companyName");
/* 760 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameLessThanOrEqualTo(String value) {
/* 764 */       addCriterion("COMPANY_NAME <=", value, "companyName");
/* 765 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameLike(String value) {
/* 769 */       addCriterion("COMPANY_NAME like", value, "companyName");
/* 770 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameNotLike(String value) {
/* 774 */       addCriterion("COMPANY_NAME not like", value, "companyName");
/* 775 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameIn(List<String> values) {
/* 779 */       addCriterion("COMPANY_NAME in", values, "companyName");
/* 780 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameNotIn(List<String> values) {
/* 784 */       addCriterion("COMPANY_NAME not in", values, "companyName");
/* 785 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameBetween(String value1, String value2) {
/* 789 */       addCriterion("COMPANY_NAME between", value1, value2, "companyName");
/* 790 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCompanyNameNotBetween(String value1, String value2) {
/* 794 */       addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
/* 795 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GamePayExample
 * JD-Core Version:    0.6.2
 */
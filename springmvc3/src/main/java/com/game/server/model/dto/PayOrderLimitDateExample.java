/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ public class PayOrderLimitDateExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public PayOrderLimitDateExample()
/*     */   {
/*  40 */     this.oredCriteria = new ArrayList();
/*     */   }
/*     */ 
/*     */   public void setOrderByClause(String orderByClause)
/*     */   {
/*  50 */     this.orderByClause = orderByClause;
/*     */   }
/*     */ 
/*     */   public String getOrderByClause()
/*     */   {
/*  60 */     return this.orderByClause;
/*     */   }
/*     */ 
/*     */   public void setDistinct(boolean distinct)
/*     */   {
/*  70 */     this.distinct = distinct;
/*     */   }
/*     */ 
/*     */   public boolean isDistinct()
/*     */   {
/*  80 */     return this.distinct;
/*     */   }
/*     */ 
/*     */   public List<Criteria> getOredCriteria()
/*     */   {
/*  90 */     return this.oredCriteria;
/*     */   }
/*     */ 
/*     */   public void or(Criteria criteria)
/*     */   {
/* 100 */     this.oredCriteria.add(criteria);
/*     */   }
/*     */ 
/*     */   public Criteria or()
/*     */   {
/* 110 */     Criteria criteria = createCriteriaInternal();
/* 111 */     this.oredCriteria.add(criteria);
/* 112 */     return criteria;
/*     */   }
/*     */ 
/*     */   public Criteria createCriteria()
/*     */   {
/* 122 */     Criteria criteria = createCriteriaInternal();
/* 123 */     if (this.oredCriteria.size() == 0) {
/* 124 */       this.oredCriteria.add(criteria);
/*     */     }
/* 126 */     return criteria;
/*     */   }
/*     */ 
/*     */   protected Criteria createCriteriaInternal()
/*     */   {
/* 136 */     Criteria criteria = new Criteria();
/* 137 */     return criteria;
/*     */   }
/*     */ 
/*     */   public void clear()
/*     */   {
/* 147 */     this.oredCriteria.clear();
/* 148 */     this.orderByClause = null;
/* 149 */     this.distinct = false;
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
/* 873 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 877 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 881 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 885 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 889 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 893 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 897 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 901 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 906 */       this.condition = condition;
/* 907 */       this.typeHandler = null;
/* 908 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 913 */       this.condition = condition;
/* 914 */       this.value = value;
/* 915 */       this.typeHandler = typeHandler;
/* 916 */       if ((value instanceof List))
/* 917 */         this.listValue = true;
/*     */       else
/* 919 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 924 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 929 */       this.condition = condition;
/* 930 */       this.value = value;
/* 931 */       this.secondValue = secondValue;
/* 932 */       this.typeHandler = typeHandler;
/* 933 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 937 */       this(condition, value, secondValue, null);
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
/* 163 */       this.criteria = new ArrayList();
/*     */     }
/*     */ 
/*     */     public boolean isValid() {
/* 167 */       return this.criteria.size() > 0;
/*     */     }
/*     */ 
/*     */     public List<Criterion> getAllCriteria() {
/* 171 */       return this.criteria;
/*     */     }
/*     */ 
/*     */     public List<Criterion> getCriteria() {
/* 175 */       return this.criteria;
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition) {
/* 179 */       if (condition == null) {
/* 180 */         throw new RuntimeException("Value for condition cannot be null");
/*     */       }
/* 182 */       this.criteria.add(new Criterion(condition));
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition, Object value, String property) {
/* 186 */       if (value == null) {
/* 187 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*     */       }
/* 189 */       this.criteria.add(new Criterion(condition, value));
/*     */     }
/*     */ 
/*     */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/* 193 */       if ((value1 == null) || (value2 == null)) {
/* 194 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*     */       }
/* 196 */       this.criteria.add(new Criterion(condition, value1, value2));
/*     */     }
/*     */ 
/*     */     protected void addCriterionForJDBCDate(String condition, java.util.Date value, String property) {
/* 200 */       if (value == null) {
/* 201 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*     */       }
/* 203 */       addCriterion(condition, new java.sql.Date(value.getTime()), property);
/*     */     }
/*     */ 
/*     */     protected void addCriterionForJDBCDate(String condition, List<java.util.Date> values, String property) {
/* 207 */       if ((values == null) || (values.size() == 0)) {
/* 208 */         throw new RuntimeException("Value list for " + property + " cannot be null or empty");
/*     */       }
/* 210 */       List dateList = new ArrayList();
/* 211 */       Iterator iter = values.iterator();
/* 212 */       while (iter.hasNext()) {
/* 213 */         dateList.add(new java.sql.Date(((java.util.Date)iter.next()).getTime()));
/*     */       }
/* 215 */       addCriterion(condition, dateList, property);
/*     */     }
/*     */ 
/*     */     protected void addCriterionForJDBCDate(String condition, java.util.Date value1, java.util.Date value2, String property) {
/* 219 */       if ((value1 == null) || (value2 == null)) {
/* 220 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*     */       }
/* 222 */       addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
/*     */     }
/*     */ 
/*     */     public Criteria andUidIsNull() {
/* 226 */       addCriterion("UID is null");
/* 227 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidIsNotNull() {
/* 231 */       addCriterion("UID is not null");
/* 232 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidEqualTo(Long value) {
/* 236 */       addCriterion("UID =", value, "uid");
/* 237 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotEqualTo(Long value) {
/* 241 */       addCriterion("UID <>", value, "uid");
/* 242 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidGreaterThan(Long value) {
/* 246 */       addCriterion("UID >", value, "uid");
/* 247 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidGreaterThanOrEqualTo(Long value) {
/* 251 */       addCriterion("UID >=", value, "uid");
/* 252 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidLessThan(Long value) {
/* 256 */       addCriterion("UID <", value, "uid");
/* 257 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidLessThanOrEqualTo(Long value) {
/* 261 */       addCriterion("UID <=", value, "uid");
/* 262 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidIn(List<Long> values) {
/* 266 */       addCriterion("UID in", values, "uid");
/* 267 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotIn(List<Long> values) {
/* 271 */       addCriterion("UID not in", values, "uid");
/* 272 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidBetween(Long value1, Long value2) {
/* 276 */       addCriterion("UID between", value1, value2, "uid");
/* 277 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andUidNotBetween(Long value1, Long value2) {
/* 281 */       addCriterion("UID not between", value1, value2, "uid");
/* 282 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdIsNull() {
/* 286 */       addCriterion("ID is null");
/* 287 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdIsNotNull() {
/* 291 */       addCriterion("ID is not null");
/* 292 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdEqualTo(String value) {
/* 296 */       addCriterion("ID =", value, "id");
/* 297 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdNotEqualTo(String value) {
/* 301 */       addCriterion("ID <>", value, "id");
/* 302 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdGreaterThan(String value) {
/* 306 */       addCriterion("ID >", value, "id");
/* 307 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdGreaterThanOrEqualTo(String value) {
/* 311 */       addCriterion("ID >=", value, "id");
/* 312 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdLessThan(String value) {
/* 316 */       addCriterion("ID <", value, "id");
/* 317 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdLessThanOrEqualTo(String value) {
/* 321 */       addCriterion("ID <=", value, "id");
/* 322 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdLike(String value) {
/* 326 */       addCriterion("ID like", value, "id");
/* 327 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdNotLike(String value) {
/* 331 */       addCriterion("ID not like", value, "id");
/* 332 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdIn(List<String> values) {
/* 336 */       addCriterion("ID in", values, "id");
/* 337 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdNotIn(List<String> values) {
/* 341 */       addCriterion("ID not in", values, "id");
/* 342 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdBetween(String value1, String value2) {
/* 346 */       addCriterion("ID between", value1, value2, "id");
/* 347 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andIdNotBetween(String value1, String value2) {
/* 351 */       addCriterion("ID not between", value1, value2, "id");
/* 352 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeIsNull() {
/* 356 */       addCriterion("TYPE is null");
/* 357 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeIsNotNull() {
/* 361 */       addCriterion("TYPE is not null");
/* 362 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeEqualTo(Integer value) {
/* 366 */       addCriterion("TYPE =", value, "type");
/* 367 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeNotEqualTo(Integer value) {
/* 371 */       addCriterion("TYPE <>", value, "type");
/* 372 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeGreaterThan(Integer value) {
/* 376 */       addCriterion("TYPE >", value, "type");
/* 377 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
/* 381 */       addCriterion("TYPE >=", value, "type");
/* 382 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeLessThan(Integer value) {
/* 386 */       addCriterion("TYPE <", value, "type");
/* 387 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeLessThanOrEqualTo(Integer value) {
/* 391 */       addCriterion("TYPE <=", value, "type");
/* 392 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeIn(List<Integer> values) {
/* 396 */       addCriterion("TYPE in", values, "type");
/* 397 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeNotIn(List<Integer> values) {
/* 401 */       addCriterion("TYPE not in", values, "type");
/* 402 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeBetween(Integer value1, Integer value2) {
/* 406 */       addCriterion("TYPE between", value1, value2, "type");
/* 407 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andTypeNotBetween(Integer value1, Integer value2) {
/* 411 */       addCriterion("TYPE not between", value1, value2, "type");
/* 412 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitIsNull() {
/* 416 */       addCriterion("DATE_LIMIT is null");
/* 417 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitIsNotNull() {
/* 421 */       addCriterion("DATE_LIMIT is not null");
/* 422 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitEqualTo(Long value) {
/* 426 */       addCriterion("DATE_LIMIT =", value, "dateLimit");
/* 427 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitNotEqualTo(Long value) {
/* 431 */       addCriterion("DATE_LIMIT <>", value, "dateLimit");
/* 432 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitGreaterThan(Long value) {
/* 436 */       addCriterion("DATE_LIMIT >", value, "dateLimit");
/* 437 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitGreaterThanOrEqualTo(Long value) {
/* 441 */       addCriterion("DATE_LIMIT >=", value, "dateLimit");
/* 442 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitLessThan(Long value) {
/* 446 */       addCriterion("DATE_LIMIT <", value, "dateLimit");
/* 447 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitLessThanOrEqualTo(Long value) {
/* 451 */       addCriterion("DATE_LIMIT <=", value, "dateLimit");
/* 452 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitIn(List<Long> values) {
/* 456 */       addCriterion("DATE_LIMIT in", values, "dateLimit");
/* 457 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitNotIn(List<Long> values) {
/* 461 */       addCriterion("DATE_LIMIT not in", values, "dateLimit");
/* 462 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitBetween(Long value1, Long value2) {
/* 466 */       addCriterion("DATE_LIMIT between", value1, value2, "dateLimit");
/* 467 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitNotBetween(Long value1, Long value2) {
/* 471 */       addCriterion("DATE_LIMIT not between", value1, value2, "dateLimit");
/* 472 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitIsNull() {
/* 476 */       addCriterion("MONTH_LIMIT is null");
/* 477 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitIsNotNull() {
/* 481 */       addCriterion("MONTH_LIMIT is not null");
/* 482 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitEqualTo(Long value) {
/* 486 */       addCriterion("MONTH_LIMIT =", value, "monthLimit");
/* 487 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitNotEqualTo(Long value) {
/* 491 */       addCriterion("MONTH_LIMIT <>", value, "monthLimit");
/* 492 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitGreaterThan(Long value) {
/* 496 */       addCriterion("MONTH_LIMIT >", value, "monthLimit");
/* 497 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitGreaterThanOrEqualTo(Long value) {
/* 501 */       addCriterion("MONTH_LIMIT >=", value, "monthLimit");
/* 502 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitLessThan(Long value) {
/* 506 */       addCriterion("MONTH_LIMIT <", value, "monthLimit");
/* 507 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitLessThanOrEqualTo(Long value) {
/* 511 */       addCriterion("MONTH_LIMIT <=", value, "monthLimit");
/* 512 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitIn(List<Long> values) {
/* 516 */       addCriterion("MONTH_LIMIT in", values, "monthLimit");
/* 517 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitNotIn(List<Long> values) {
/* 521 */       addCriterion("MONTH_LIMIT not in", values, "monthLimit");
/* 522 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitBetween(Long value1, Long value2) {
/* 526 */       addCriterion("MONTH_LIMIT between", value1, value2, "monthLimit");
/* 527 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitNotBetween(Long value1, Long value2) {
/* 531 */       addCriterion("MONTH_LIMIT not between", value1, value2, "monthLimit");
/* 532 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitIsNull() {
/* 536 */       addCriterion("DATE_COUNT_LIMIT is null");
/* 537 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitIsNotNull() {
/* 541 */       addCriterion("DATE_COUNT_LIMIT is not null");
/* 542 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitEqualTo(Integer value) {
/* 546 */       addCriterion("DATE_COUNT_LIMIT =", value, "dateCountLimit");
/* 547 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitNotEqualTo(Integer value) {
/* 551 */       addCriterion("DATE_COUNT_LIMIT <>", value, "dateCountLimit");
/* 552 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitGreaterThan(Integer value) {
/* 556 */       addCriterion("DATE_COUNT_LIMIT >", value, "dateCountLimit");
/* 557 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitGreaterThanOrEqualTo(Integer value) {
/* 561 */       addCriterion("DATE_COUNT_LIMIT >=", value, "dateCountLimit");
/* 562 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitLessThan(Integer value) {
/* 566 */       addCriterion("DATE_COUNT_LIMIT <", value, "dateCountLimit");
/* 567 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitLessThanOrEqualTo(Integer value) {
/* 571 */       addCriterion("DATE_COUNT_LIMIT <=", value, "dateCountLimit");
/* 572 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitIn(List<Integer> values) {
/* 576 */       addCriterion("DATE_COUNT_LIMIT in", values, "dateCountLimit");
/* 577 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitNotIn(List<Integer> values) {
/* 581 */       addCriterion("DATE_COUNT_LIMIT not in", values, "dateCountLimit");
/* 582 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitBetween(Integer value1, Integer value2) {
/* 586 */       addCriterion("DATE_COUNT_LIMIT between", value1, value2, "dateCountLimit");
/* 587 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateCountLimitNotBetween(Integer value1, Integer value2) {
/* 591 */       addCriterion("DATE_COUNT_LIMIT not between", value1, value2, "dateCountLimit");
/* 592 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitIsNull() {
/* 596 */       addCriterion("MONTH_COUNT_LIMIT is null");
/* 597 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitIsNotNull() {
/* 601 */       addCriterion("MONTH_COUNT_LIMIT is not null");
/* 602 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitEqualTo(Integer value) {
/* 606 */       addCriterion("MONTH_COUNT_LIMIT =", value, "monthCountLimit");
/* 607 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitNotEqualTo(Integer value) {
/* 611 */       addCriterion("MONTH_COUNT_LIMIT <>", value, "monthCountLimit");
/* 612 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitGreaterThan(Integer value) {
/* 616 */       addCriterion("MONTH_COUNT_LIMIT >", value, "monthCountLimit");
/* 617 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitGreaterThanOrEqualTo(Integer value) {
/* 621 */       addCriterion("MONTH_COUNT_LIMIT >=", value, "monthCountLimit");
/* 622 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitLessThan(Integer value) {
/* 626 */       addCriterion("MONTH_COUNT_LIMIT <", value, "monthCountLimit");
/* 627 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitLessThanOrEqualTo(Integer value) {
/* 631 */       addCriterion("MONTH_COUNT_LIMIT <=", value, "monthCountLimit");
/* 632 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitIn(List<Integer> values) {
/* 636 */       addCriterion("MONTH_COUNT_LIMIT in", values, "monthCountLimit");
/* 637 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitNotIn(List<Integer> values) {
/* 641 */       addCriterion("MONTH_COUNT_LIMIT not in", values, "monthCountLimit");
/* 642 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitBetween(Integer value1, Integer value2) {
/* 646 */       addCriterion("MONTH_COUNT_LIMIT between", value1, value2, "monthCountLimit");
/* 647 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthCountLimitNotBetween(Integer value1, Integer value2) {
/* 651 */       addCriterion("MONTH_COUNT_LIMIT not between", value1, value2, "monthCountLimit");
/* 652 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedIsNull() {
/* 656 */       addCriterion("CREATED is null");
/* 657 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedIsNotNull() {
/* 661 */       addCriterion("CREATED is not null");
/* 662 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedEqualTo(java.util.Date value) {
/* 666 */       addCriterionForJDBCDate("CREATED =", value, "created");
/* 667 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedNotEqualTo(java.util.Date value) {
/* 671 */       addCriterionForJDBCDate("CREATED <>", value, "created");
/* 672 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedGreaterThan(java.util.Date value) {
/* 676 */       addCriterionForJDBCDate("CREATED >", value, "created");
/* 677 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
/* 681 */       addCriterionForJDBCDate("CREATED >=", value, "created");
/* 682 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedLessThan(java.util.Date value) {
/* 686 */       addCriterionForJDBCDate("CREATED <", value, "created");
/* 687 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
/* 691 */       addCriterionForJDBCDate("CREATED <=", value, "created");
/* 692 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedIn(List<java.util.Date> values) {
/* 696 */       addCriterionForJDBCDate("CREATED in", values, "created");
/* 697 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedNotIn(List<java.util.Date> values) {
/* 701 */       addCriterionForJDBCDate("CREATED not in", values, "created");
/* 702 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
/* 706 */       addCriterionForJDBCDate("CREATED between", value1, value2, "created");
/* 707 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
/* 711 */       addCriterionForJDBCDate("CREATED not between", value1, value2, "created");
/* 712 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffIsNull() {
/* 716 */       addCriterion("OFF is null");
/* 717 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffIsNotNull() {
/* 721 */       addCriterion("OFF is not null");
/* 722 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffEqualTo(Integer value) {
/* 726 */       addCriterion("OFF =", value, "off");
/* 727 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffNotEqualTo(Integer value) {
/* 731 */       addCriterion("OFF <>", value, "off");
/* 732 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffGreaterThan(Integer value) {
/* 736 */       addCriterion("OFF >", value, "off");
/* 737 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffGreaterThanOrEqualTo(Integer value) {
/* 741 */       addCriterion("OFF >=", value, "off");
/* 742 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffLessThan(Integer value) {
/* 746 */       addCriterion("OFF <", value, "off");
/* 747 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffLessThanOrEqualTo(Integer value) {
/* 751 */       addCriterion("OFF <=", value, "off");
/* 752 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffIn(List<Integer> values) {
/* 756 */       addCriterion("OFF in", values, "off");
/* 757 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffNotIn(List<Integer> values) {
/* 761 */       addCriterion("OFF not in", values, "off");
/* 762 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffBetween(Integer value1, Integer value2) {
/* 766 */       addCriterion("OFF between", value1, value2, "off");
/* 767 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffNotBetween(Integer value1, Integer value2) {
/* 771 */       addCriterion("OFF not between", value1, value2, "off");
/* 772 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityIsNull() {
/* 776 */       addCriterion("OFF_CITY is null");
/* 777 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityIsNotNull() {
/* 781 */       addCriterion("OFF_CITY is not null");
/* 782 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityEqualTo(Integer value) {
/* 786 */       addCriterion("OFF_CITY =", value, "offCity");
/* 787 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityNotEqualTo(Integer value) {
/* 791 */       addCriterion("OFF_CITY <>", value, "offCity");
/* 792 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityGreaterThan(Integer value) {
/* 796 */       addCriterion("OFF_CITY >", value, "offCity");
/* 797 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityGreaterThanOrEqualTo(Integer value) {
/* 801 */       addCriterion("OFF_CITY >=", value, "offCity");
/* 802 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityLessThan(Integer value) {
/* 806 */       addCriterion("OFF_CITY <", value, "offCity");
/* 807 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityLessThanOrEqualTo(Integer value) {
/* 811 */       addCriterion("OFF_CITY <=", value, "offCity");
/* 812 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityIn(List<Integer> values) {
/* 816 */       addCriterion("OFF_CITY in", values, "offCity");
/* 817 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityNotIn(List<Integer> values) {
/* 821 */       addCriterion("OFF_CITY not in", values, "offCity");
/* 822 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityBetween(Integer value1, Integer value2) {
/* 826 */       addCriterion("OFF_CITY between", value1, value2, "offCity");
/* 827 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andOffCityNotBetween(Integer value1, Integer value2) {
/* 831 */       addCriterion("OFF_CITY not between", value1, value2, "offCity");
/* 832 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderLimitDateExample
 * JD-Core Version:    0.6.2
 */
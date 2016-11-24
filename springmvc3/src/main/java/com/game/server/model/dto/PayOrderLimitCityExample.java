/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ public class PayOrderLimitCityExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public PayOrderLimitCityExample()
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
/* 823 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 827 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 831 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 835 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 839 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 843 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 847 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 851 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 856 */       this.condition = condition;
/* 857 */       this.typeHandler = null;
/* 858 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 863 */       this.condition = condition;
/* 864 */       this.value = value;
/* 865 */       this.typeHandler = typeHandler;
/* 866 */       if ((value instanceof List))
/* 867 */         this.listValue = true;
/*     */       else
/* 869 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 874 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 879 */       this.condition = condition;
/* 880 */       this.value = value;
/* 881 */       this.secondValue = secondValue;
/* 882 */       this.typeHandler = typeHandler;
/* 883 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 887 */       this(condition, value, secondValue, null);
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
/*     */     public Criteria andLimitIdIsNull() {
/* 286 */       addCriterion("LIMIT_ID is null");
/* 287 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdIsNotNull() {
/* 291 */       addCriterion("LIMIT_ID is not null");
/* 292 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdEqualTo(Long value) {
/* 296 */       addCriterion("LIMIT_ID =", value, "limitId");
/* 297 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdNotEqualTo(Long value) {
/* 301 */       addCriterion("LIMIT_ID <>", value, "limitId");
/* 302 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdGreaterThan(Long value) {
/* 306 */       addCriterion("LIMIT_ID >", value, "limitId");
/* 307 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdGreaterThanOrEqualTo(Long value) {
/* 311 */       addCriterion("LIMIT_ID >=", value, "limitId");
/* 312 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdLessThan(Long value) {
/* 316 */       addCriterion("LIMIT_ID <", value, "limitId");
/* 317 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdLessThanOrEqualTo(Long value) {
/* 321 */       addCriterion("LIMIT_ID <=", value, "limitId");
/* 322 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdIn(List<Long> values) {
/* 326 */       addCriterion("LIMIT_ID in", values, "limitId");
/* 327 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdNotIn(List<Long> values) {
/* 331 */       addCriterion("LIMIT_ID not in", values, "limitId");
/* 332 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdBetween(Long value1, Long value2) {
/* 336 */       addCriterion("LIMIT_ID between", value1, value2, "limitId");
/* 337 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andLimitIdNotBetween(Long value1, Long value2) {
/* 341 */       addCriterion("LIMIT_ID not between", value1, value2, "limitId");
/* 342 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdIsNull() {
/* 346 */       addCriterion("CITY_ID is null");
/* 347 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdIsNotNull() {
/* 351 */       addCriterion("CITY_ID is not null");
/* 352 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdEqualTo(Long value) {
/* 356 */       addCriterion("CITY_ID =", value, "cityId");
/* 357 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdNotEqualTo(Long value) {
/* 361 */       addCriterion("CITY_ID <>", value, "cityId");
/* 362 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdGreaterThan(Long value) {
/* 366 */       addCriterion("CITY_ID >", value, "cityId");
/* 367 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
/* 371 */       addCriterion("CITY_ID >=", value, "cityId");
/* 372 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdLessThan(Long value) {
/* 376 */       addCriterion("CITY_ID <", value, "cityId");
/* 377 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdLessThanOrEqualTo(Long value) {
/* 381 */       addCriterion("CITY_ID <=", value, "cityId");
/* 382 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdIn(List<Long> values) {
/* 386 */       addCriterion("CITY_ID in", values, "cityId");
/* 387 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdNotIn(List<Long> values) {
/* 391 */       addCriterion("CITY_ID not in", values, "cityId");
/* 392 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdBetween(Long value1, Long value2) {
/* 396 */       addCriterion("CITY_ID between", value1, value2, "cityId");
/* 397 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdNotBetween(Long value1, Long value2) {
/* 401 */       addCriterion("CITY_ID not between", value1, value2, "cityId");
/* 402 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameIsNull() {
/* 406 */       addCriterion("CITY_NAME is null");
/* 407 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameIsNotNull() {
/* 411 */       addCriterion("CITY_NAME is not null");
/* 412 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameEqualTo(String value) {
/* 416 */       addCriterion("CITY_NAME =", value, "cityName");
/* 417 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameNotEqualTo(String value) {
/* 421 */       addCriterion("CITY_NAME <>", value, "cityName");
/* 422 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameGreaterThan(String value) {
/* 426 */       addCriterion("CITY_NAME >", value, "cityName");
/* 427 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameGreaterThanOrEqualTo(String value) {
/* 431 */       addCriterion("CITY_NAME >=", value, "cityName");
/* 432 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameLessThan(String value) {
/* 436 */       addCriterion("CITY_NAME <", value, "cityName");
/* 437 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameLessThanOrEqualTo(String value) {
/* 441 */       addCriterion("CITY_NAME <=", value, "cityName");
/* 442 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameLike(String value) {
/* 446 */       addCriterion("CITY_NAME like", value, "cityName");
/* 447 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameNotLike(String value) {
/* 451 */       addCriterion("CITY_NAME not like", value, "cityName");
/* 452 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameIn(List<String> values) {
/* 456 */       addCriterion("CITY_NAME in", values, "cityName");
/* 457 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameNotIn(List<String> values) {
/* 461 */       addCriterion("CITY_NAME not in", values, "cityName");
/* 462 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameBetween(String value1, String value2) {
/* 466 */       addCriterion("CITY_NAME between", value1, value2, "cityName");
/* 467 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameNotBetween(String value1, String value2) {
/* 471 */       addCriterion("CITY_NAME not between", value1, value2, "cityName");
/* 472 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedIsNull() {
/* 476 */       addCriterion("CREATED is null");
/* 477 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedIsNotNull() {
/* 481 */       addCriterion("CREATED is not null");
/* 482 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedEqualTo(java.util.Date value) {
/* 486 */       addCriterionForJDBCDate("CREATED =", value, "created");
/* 487 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedNotEqualTo(java.util.Date value) {
/* 491 */       addCriterionForJDBCDate("CREATED <>", value, "created");
/* 492 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedGreaterThan(java.util.Date value) {
/* 496 */       addCriterionForJDBCDate("CREATED >", value, "created");
/* 497 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedGreaterThanOrEqualTo(java.util.Date value) {
/* 501 */       addCriterionForJDBCDate("CREATED >=", value, "created");
/* 502 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedLessThan(java.util.Date value) {
/* 506 */       addCriterionForJDBCDate("CREATED <", value, "created");
/* 507 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedLessThanOrEqualTo(java.util.Date value) {
/* 511 */       addCriterionForJDBCDate("CREATED <=", value, "created");
/* 512 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedIn(List<java.util.Date> values) {
/* 516 */       addCriterionForJDBCDate("CREATED in", values, "created");
/* 517 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedNotIn(List<java.util.Date> values) {
/* 521 */       addCriterionForJDBCDate("CREATED not in", values, "created");
/* 522 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedBetween(java.util.Date value1, java.util.Date value2) {
/* 526 */       addCriterionForJDBCDate("CREATED between", value1, value2, "created");
/* 527 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCreatedNotBetween(java.util.Date value1, java.util.Date value2) {
/* 531 */       addCriterionForJDBCDate("CREATED not between", value1, value2, "created");
/* 532 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdIsNull() {
/* 536 */       addCriterion("PROVINCE_ID is null");
/* 537 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdIsNotNull() {
/* 541 */       addCriterion("PROVINCE_ID is not null");
/* 542 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdEqualTo(Long value) {
/* 546 */       addCriterion("PROVINCE_ID =", value, "provinceId");
/* 547 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdNotEqualTo(Long value) {
/* 551 */       addCriterion("PROVINCE_ID <>", value, "provinceId");
/* 552 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdGreaterThan(Long value) {
/* 556 */       addCriterion("PROVINCE_ID >", value, "provinceId");
/* 557 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
/* 561 */       addCriterion("PROVINCE_ID >=", value, "provinceId");
/* 562 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdLessThan(Long value) {
/* 566 */       addCriterion("PROVINCE_ID <", value, "provinceId");
/* 567 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
/* 571 */       addCriterion("PROVINCE_ID <=", value, "provinceId");
/* 572 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdIn(List<Long> values) {
/* 576 */       addCriterion("PROVINCE_ID in", values, "provinceId");
/* 577 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdNotIn(List<Long> values) {
/* 581 */       addCriterion("PROVINCE_ID not in", values, "provinceId");
/* 582 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdBetween(Long value1, Long value2) {
/* 586 */       addCriterion("PROVINCE_ID between", value1, value2, "provinceId");
/* 587 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
/* 591 */       addCriterion("PROVINCE_ID not between", value1, value2, "provinceId");
/* 592 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameIsNull() {
/* 596 */       addCriterion("RROVINCE_NAME is null");
/* 597 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameIsNotNull() {
/* 601 */       addCriterion("RROVINCE_NAME is not null");
/* 602 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameEqualTo(String value) {
/* 606 */       addCriterion("RROVINCE_NAME =", value, "rrovinceName");
/* 607 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameNotEqualTo(String value) {
/* 611 */       addCriterion("RROVINCE_NAME <>", value, "rrovinceName");
/* 612 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameGreaterThan(String value) {
/* 616 */       addCriterion("RROVINCE_NAME >", value, "rrovinceName");
/* 617 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameGreaterThanOrEqualTo(String value) {
/* 621 */       addCriterion("RROVINCE_NAME >=", value, "rrovinceName");
/* 622 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameLessThan(String value) {
/* 626 */       addCriterion("RROVINCE_NAME <", value, "rrovinceName");
/* 627 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameLessThanOrEqualTo(String value) {
/* 631 */       addCriterion("RROVINCE_NAME <=", value, "rrovinceName");
/* 632 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameLike(String value) {
/* 636 */       addCriterion("RROVINCE_NAME like", value, "rrovinceName");
/* 637 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameNotLike(String value) {
/* 641 */       addCriterion("RROVINCE_NAME not like", value, "rrovinceName");
/* 642 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameIn(List<String> values) {
/* 646 */       addCriterion("RROVINCE_NAME in", values, "rrovinceName");
/* 647 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameNotIn(List<String> values) {
/* 651 */       addCriterion("RROVINCE_NAME not in", values, "rrovinceName");
/* 652 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameBetween(String value1, String value2) {
/* 656 */       addCriterion("RROVINCE_NAME between", value1, value2, "rrovinceName");
/* 657 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andRrovinceNameNotBetween(String value1, String value2) {
/* 661 */       addCriterion("RROVINCE_NAME not between", value1, value2, "rrovinceName");
/* 662 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontIsNull() {
/* 666 */       addCriterion("DATE_LIMIT_AMONT is null");
/* 667 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontIsNotNull() {
/* 671 */       addCriterion("DATE_LIMIT_AMONT is not null");
/* 672 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontEqualTo(Long value) {
/* 676 */       addCriterion("DATE_LIMIT_AMONT =", value, "dateLimitAmont");
/* 677 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontNotEqualTo(Long value) {
/* 681 */       addCriterion("DATE_LIMIT_AMONT <>", value, "dateLimitAmont");
/* 682 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontGreaterThan(Long value) {
/* 686 */       addCriterion("DATE_LIMIT_AMONT >", value, "dateLimitAmont");
/* 687 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontGreaterThanOrEqualTo(Long value) {
/* 691 */       addCriterion("DATE_LIMIT_AMONT >=", value, "dateLimitAmont");
/* 692 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontLessThan(Long value) {
/* 696 */       addCriterion("DATE_LIMIT_AMONT <", value, "dateLimitAmont");
/* 697 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontLessThanOrEqualTo(Long value) {
/* 701 */       addCriterion("DATE_LIMIT_AMONT <=", value, "dateLimitAmont");
/* 702 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontIn(List<Long> values) {
/* 706 */       addCriterion("DATE_LIMIT_AMONT in", values, "dateLimitAmont");
/* 707 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontNotIn(List<Long> values) {
/* 711 */       addCriterion("DATE_LIMIT_AMONT not in", values, "dateLimitAmont");
/* 712 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontBetween(Long value1, Long value2) {
/* 716 */       addCriterion("DATE_LIMIT_AMONT between", value1, value2, "dateLimitAmont");
/* 717 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andDateLimitAmontNotBetween(Long value1, Long value2) {
/* 721 */       addCriterion("DATE_LIMIT_AMONT not between", value1, value2, "dateLimitAmont");
/* 722 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontIsNull() {
/* 726 */       addCriterion("MONTH_LIMIT_AMONT is null");
/* 727 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontIsNotNull() {
/* 731 */       addCriterion("MONTH_LIMIT_AMONT is not null");
/* 732 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontEqualTo(Long value) {
/* 736 */       addCriterion("MONTH_LIMIT_AMONT =", value, "monthLimitAmont");
/* 737 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontNotEqualTo(Long value) {
/* 741 */       addCriterion("MONTH_LIMIT_AMONT <>", value, "monthLimitAmont");
/* 742 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontGreaterThan(Long value) {
/* 746 */       addCriterion("MONTH_LIMIT_AMONT >", value, "monthLimitAmont");
/* 747 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontGreaterThanOrEqualTo(Long value) {
/* 751 */       addCriterion("MONTH_LIMIT_AMONT >=", value, "monthLimitAmont");
/* 752 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontLessThan(Long value) {
/* 756 */       addCriterion("MONTH_LIMIT_AMONT <", value, "monthLimitAmont");
/* 757 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontLessThanOrEqualTo(Long value) {
/* 761 */       addCriterion("MONTH_LIMIT_AMONT <=", value, "monthLimitAmont");
/* 762 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontIn(List<Long> values) {
/* 766 */       addCriterion("MONTH_LIMIT_AMONT in", values, "monthLimitAmont");
/* 767 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontNotIn(List<Long> values) {
/* 771 */       addCriterion("MONTH_LIMIT_AMONT not in", values, "monthLimitAmont");
/* 772 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontBetween(Long value1, Long value2) {
/* 776 */       addCriterion("MONTH_LIMIT_AMONT between", value1, value2, "monthLimitAmont");
/* 777 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMonthLimitAmontNotBetween(Long value1, Long value2) {
/* 781 */       addCriterion("MONTH_LIMIT_AMONT not between", value1, value2, "monthLimitAmont");
/* 782 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderLimitCityExample
 * JD-Core Version:    0.6.2
 */
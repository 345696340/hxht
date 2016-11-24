/*     */ package com.game.server.model.dto;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class MobileInfoExample
/*     */ {
/*     */   protected String orderByClause;
/*     */   protected boolean distinct;
/*     */   protected List<Criteria> oredCriteria;
/*     */ 
/*     */   public MobileInfoExample()
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
/* 615 */       return this.condition;
/*     */     }
/*     */ 
/*     */     public Object getValue() {
/* 619 */       return this.value;
/*     */     }
/*     */ 
/*     */     public Object getSecondValue() {
/* 623 */       return this.secondValue;
/*     */     }
/*     */ 
/*     */     public boolean isNoValue() {
/* 627 */       return this.noValue;
/*     */     }
/*     */ 
/*     */     public boolean isSingleValue() {
/* 631 */       return this.singleValue;
/*     */     }
/*     */ 
/*     */     public boolean isBetweenValue() {
/* 635 */       return this.betweenValue;
/*     */     }
/*     */ 
/*     */     public boolean isListValue() {
/* 639 */       return this.listValue;
/*     */     }
/*     */ 
/*     */     public String getTypeHandler() {
/* 643 */       return this.typeHandler;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition)
/*     */     {
/* 648 */       this.condition = condition;
/* 649 */       this.typeHandler = null;
/* 650 */       this.noValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, String typeHandler)
/*     */     {
/* 655 */       this.condition = condition;
/* 656 */       this.value = value;
/* 657 */       this.typeHandler = typeHandler;
/* 658 */       if ((value instanceof List))
/* 659 */         this.listValue = true;
/*     */       else
/* 661 */         this.singleValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value)
/*     */     {
/* 666 */       this(condition, value, null);
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*     */     {
/* 671 */       this.condition = condition;
/* 672 */       this.value = value;
/* 673 */       this.secondValue = secondValue;
/* 674 */       this.typeHandler = typeHandler;
/* 675 */       this.betweenValue = true;
/*     */     }
/*     */ 
/*     */     protected Criterion(String condition, Object value, Object secondValue) {
/* 679 */       this(condition, value, secondValue, null);
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
/*     */     public Criteria andMobileEqualTo(Long value) {
/* 268 */       addCriterion("MOBILE =", value, "mobile");
/* 269 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileNotEqualTo(Long value) {
/* 273 */       addCriterion("MOBILE <>", value, "mobile");
/* 274 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileGreaterThan(Long value) {
/* 278 */       addCriterion("MOBILE >", value, "mobile");
/* 279 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileGreaterThanOrEqualTo(Long value) {
/* 283 */       addCriterion("MOBILE >=", value, "mobile");
/* 284 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileLessThan(Long value) {
/* 288 */       addCriterion("MOBILE <", value, "mobile");
/* 289 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileLessThanOrEqualTo(Long value) {
/* 293 */       addCriterion("MOBILE <=", value, "mobile");
/* 294 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileIn(List<Long> values) {
/* 298 */       addCriterion("MOBILE in", values, "mobile");
/* 299 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileNotIn(List<Long> values) {
/* 303 */       addCriterion("MOBILE not in", values, "mobile");
/* 304 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileBetween(Long value1, Long value2) {
/* 308 */       addCriterion("MOBILE between", value1, value2, "mobile");
/* 309 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andMobileNotBetween(Long value1, Long value2) {
/* 313 */       addCriterion("MOBILE not between", value1, value2, "mobile");
/* 314 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdIsNull() {
/* 318 */       addCriterion("CITY_ID is null");
/* 319 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdIsNotNull() {
/* 323 */       addCriterion("CITY_ID is not null");
/* 324 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdEqualTo(Long value) {
/* 328 */       addCriterion("CITY_ID =", value, "cityId");
/* 329 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdNotEqualTo(Long value) {
/* 333 */       addCriterion("CITY_ID <>", value, "cityId");
/* 334 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdGreaterThan(Long value) {
/* 338 */       addCriterion("CITY_ID >", value, "cityId");
/* 339 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdGreaterThanOrEqualTo(Long value) {
/* 343 */       addCriterion("CITY_ID >=", value, "cityId");
/* 344 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdLessThan(Long value) {
/* 348 */       addCriterion("CITY_ID <", value, "cityId");
/* 349 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdLessThanOrEqualTo(Long value) {
/* 353 */       addCriterion("CITY_ID <=", value, "cityId");
/* 354 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdIn(List<Long> values) {
/* 358 */       addCriterion("CITY_ID in", values, "cityId");
/* 359 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdNotIn(List<Long> values) {
/* 363 */       addCriterion("CITY_ID not in", values, "cityId");
/* 364 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdBetween(Long value1, Long value2) {
/* 368 */       addCriterion("CITY_ID between", value1, value2, "cityId");
/* 369 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityIdNotBetween(Long value1, Long value2) {
/* 373 */       addCriterion("CITY_ID not between", value1, value2, "cityId");
/* 374 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameIsNull() {
/* 378 */       addCriterion("CITY_NAME is null");
/* 379 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameIsNotNull() {
/* 383 */       addCriterion("CITY_NAME is not null");
/* 384 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameEqualTo(String value) {
/* 388 */       addCriterion("CITY_NAME =", value, "cityName");
/* 389 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameNotEqualTo(String value) {
/* 393 */       addCriterion("CITY_NAME <>", value, "cityName");
/* 394 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameGreaterThan(String value) {
/* 398 */       addCriterion("CITY_NAME >", value, "cityName");
/* 399 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameGreaterThanOrEqualTo(String value) {
/* 403 */       addCriterion("CITY_NAME >=", value, "cityName");
/* 404 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameLessThan(String value) {
/* 408 */       addCriterion("CITY_NAME <", value, "cityName");
/* 409 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameLessThanOrEqualTo(String value) {
/* 413 */       addCriterion("CITY_NAME <=", value, "cityName");
/* 414 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameLike(String value) {
/* 418 */       addCriterion("CITY_NAME like", value, "cityName");
/* 419 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameNotLike(String value) {
/* 423 */       addCriterion("CITY_NAME not like", value, "cityName");
/* 424 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameIn(List<String> values) {
/* 428 */       addCriterion("CITY_NAME in", values, "cityName");
/* 429 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameNotIn(List<String> values) {
/* 433 */       addCriterion("CITY_NAME not in", values, "cityName");
/* 434 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameBetween(String value1, String value2) {
/* 438 */       addCriterion("CITY_NAME between", value1, value2, "cityName");
/* 439 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andCityNameNotBetween(String value1, String value2) {
/* 443 */       addCriterion("CITY_NAME not between", value1, value2, "cityName");
/* 444 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdIsNull() {
/* 448 */       addCriterion("PROVINCE_ID is null");
/* 449 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdIsNotNull() {
/* 453 */       addCriterion("PROVINCE_ID is not null");
/* 454 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdEqualTo(Long value) {
/* 458 */       addCriterion("PROVINCE_ID =", value, "provinceId");
/* 459 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdNotEqualTo(Long value) {
/* 463 */       addCriterion("PROVINCE_ID <>", value, "provinceId");
/* 464 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdGreaterThan(Long value) {
/* 468 */       addCriterion("PROVINCE_ID >", value, "provinceId");
/* 469 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
/* 473 */       addCriterion("PROVINCE_ID >=", value, "provinceId");
/* 474 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdLessThan(Long value) {
/* 478 */       addCriterion("PROVINCE_ID <", value, "provinceId");
/* 479 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
/* 483 */       addCriterion("PROVINCE_ID <=", value, "provinceId");
/* 484 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdIn(List<Long> values) {
/* 488 */       addCriterion("PROVINCE_ID in", values, "provinceId");
/* 489 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdNotIn(List<Long> values) {
/* 493 */       addCriterion("PROVINCE_ID not in", values, "provinceId");
/* 494 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdBetween(Long value1, Long value2) {
/* 498 */       addCriterion("PROVINCE_ID between", value1, value2, "provinceId");
/* 499 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
/* 503 */       addCriterion("PROVINCE_ID not between", value1, value2, "provinceId");
/* 504 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameIsNull() {
/* 508 */       addCriterion("PROVINCE_NAME is null");
/* 509 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameIsNotNull() {
/* 513 */       addCriterion("PROVINCE_NAME is not null");
/* 514 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameEqualTo(String value) {
/* 518 */       addCriterion("PROVINCE_NAME =", value, "provinceName");
/* 519 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameNotEqualTo(String value) {
/* 523 */       addCriterion("PROVINCE_NAME <>", value, "provinceName");
/* 524 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameGreaterThan(String value) {
/* 528 */       addCriterion("PROVINCE_NAME >", value, "provinceName");
/* 529 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
/* 533 */       addCriterion("PROVINCE_NAME >=", value, "provinceName");
/* 534 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameLessThan(String value) {
/* 538 */       addCriterion("PROVINCE_NAME <", value, "provinceName");
/* 539 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameLessThanOrEqualTo(String value) {
/* 543 */       addCriterion("PROVINCE_NAME <=", value, "provinceName");
/* 544 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameLike(String value) {
/* 548 */       addCriterion("PROVINCE_NAME like", value, "provinceName");
/* 549 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameNotLike(String value) {
/* 553 */       addCriterion("PROVINCE_NAME not like", value, "provinceName");
/* 554 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameIn(List<String> values) {
/* 558 */       addCriterion("PROVINCE_NAME in", values, "provinceName");
/* 559 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameNotIn(List<String> values) {
/* 563 */       addCriterion("PROVINCE_NAME not in", values, "provinceName");
/* 564 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameBetween(String value1, String value2) {
/* 568 */       addCriterion("PROVINCE_NAME between", value1, value2, "provinceName");
/* 569 */       return (Criteria)this;
/*     */     }
/*     */ 
/*     */     public Criteria andProvinceNameNotBetween(String value1, String value2) {
/* 573 */       addCriterion("PROVINCE_NAME not between", value1, value2, "provinceName");
/* 574 */       return (Criteria)this;
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.MobileInfoExample
 * JD-Core Version:    0.6.2
 */
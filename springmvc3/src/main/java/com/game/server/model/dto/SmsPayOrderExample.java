/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ public class SmsPayOrderExample
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public SmsPayOrderExample()
/*      */   {
/*   39 */     this.oredCriteria = new ArrayList();
/*      */   }
/*      */ 
/*      */   public void setOrderByClause(String orderByClause)
/*      */   {
/*   49 */     this.orderByClause = orderByClause;
/*      */   }
/*      */ 
/*      */   public String getOrderByClause()
/*      */   {
/*   59 */     return this.orderByClause;
/*      */   }
/*      */ 
/*      */   public void setDistinct(boolean distinct)
/*      */   {
/*   69 */     this.distinct = distinct;
/*      */   }
/*      */ 
/*      */   public boolean isDistinct()
/*      */   {
/*   79 */     return this.distinct;
/*      */   }
/*      */ 
/*      */   public List<Criteria> getOredCriteria()
/*      */   {
/*   89 */     return this.oredCriteria;
/*      */   }
/*      */ 
/*      */   public void or(Criteria criteria)
/*      */   {
/*   99 */     this.oredCriteria.add(criteria);
/*      */   }
/*      */ 
/*      */   public Criteria or()
/*      */   {
/*  109 */     Criteria criteria = createCriteriaInternal();
/*  110 */     this.oredCriteria.add(criteria);
/*  111 */     return criteria;
/*      */   }
/*      */ 
/*      */   public Criteria createCriteria()
/*      */   {
/*  121 */     Criteria criteria = createCriteriaInternal();
/*  122 */     if (this.oredCriteria.size() == 0) {
/*  123 */       this.oredCriteria.add(criteria);
/*      */     }
/*  125 */     return criteria;
/*      */   }
/*      */ 
/*      */   protected Criteria createCriteriaInternal()
/*      */   {
/*  135 */     Criteria criteria = new Criteria();
/*  136 */     return criteria;
/*      */   }
/*      */ 
/*      */   public void clear()
/*      */   {
/*  146 */     this.oredCriteria.clear();
/*  147 */     this.orderByClause = null;
/*  148 */     this.distinct = false;
/*      */   }
/*      */ 
/*      */   public static class Criterion
/*      */   {
/*      */     private String condition;
/*      */     private Object value;
/*      */     private Object secondValue;
/*      */     private boolean noValue;
/*      */     private boolean singleValue;
/*      */     private boolean betweenValue;
/*      */     private boolean listValue;
/*      */     private String typeHandler;
/*      */ 
/*      */     public String getCondition()
/*      */     {
/* 1466 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1470 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1474 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1478 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1482 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1486 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1490 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1494 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1499 */       this.condition = condition;
/* 1500 */       this.typeHandler = null;
/* 1501 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1506 */       this.condition = condition;
/* 1507 */       this.value = value;
/* 1508 */       this.typeHandler = typeHandler;
/* 1509 */       if ((value instanceof List))
/* 1510 */         this.listValue = true;
/*      */       else
/* 1512 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1517 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1522 */       this.condition = condition;
/* 1523 */       this.value = value;
/* 1524 */       this.secondValue = secondValue;
/* 1525 */       this.typeHandler = typeHandler;
/* 1526 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1530 */       this(condition, value, secondValue, null);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class Criteria extends GeneratedCriteria
/*      */   {
/*      */   }
/*      */ 
/*      */   protected static abstract class GeneratedCriteria
/*      */   {
/*      */     protected List<Criterion> criteria;
/*      */ 
/*      */     protected GeneratedCriteria()
/*      */     {
/*  162 */       this.criteria = new ArrayList();
/*      */     }
/*      */ 
/*      */     public boolean isValid() {
/*  166 */       return this.criteria.size() > 0;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getAllCriteria() {
/*  170 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getCriteria() {
/*  174 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition) {
/*  178 */       if (condition == null) {
/*  179 */         throw new RuntimeException("Value for condition cannot be null");
/*      */       }
/*  181 */       this.criteria.add(new Criterion(condition));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value, String property) {
/*  185 */       if (value == null) {
/*  186 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*      */       }
/*  188 */       this.criteria.add(new Criterion(condition, value));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/*  192 */       if ((value1 == null) || (value2 == null)) {
/*  193 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*      */       }
/*  195 */       this.criteria.add(new Criterion(condition, value1, value2));
/*      */     }
/*      */ 
/*      */     public Criteria andUidIsNull() {
/*  199 */       addCriterion("UID is null");
/*  200 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidIsNotNull() {
/*  204 */       addCriterion("UID is not null");
/*  205 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidEqualTo(Long value) {
/*  209 */       addCriterion("UID =", value, "uid");
/*  210 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotEqualTo(Long value) {
/*  214 */       addCriterion("UID <>", value, "uid");
/*  215 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidGreaterThan(Long value) {
/*  219 */       addCriterion("UID >", value, "uid");
/*  220 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidGreaterThanOrEqualTo(Long value) {
/*  224 */       addCriterion("UID >=", value, "uid");
/*  225 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidLessThan(Long value) {
/*  229 */       addCriterion("UID <", value, "uid");
/*  230 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidLessThanOrEqualTo(Long value) {
/*  234 */       addCriterion("UID <=", value, "uid");
/*  235 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidIn(List<Long> values) {
/*  239 */       addCriterion("UID in", values, "uid");
/*  240 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotIn(List<Long> values) {
/*  244 */       addCriterion("UID not in", values, "uid");
/*  245 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidBetween(Long value1, Long value2) {
/*  249 */       addCriterion("UID between", value1, value2, "uid");
/*  250 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotBetween(Long value1, Long value2) {
/*  254 */       addCriterion("UID not between", value1, value2, "uid");
/*  255 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNull() {
/*  259 */       addCriterion("CONTENT is null");
/*  260 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNotNull() {
/*  264 */       addCriterion("CONTENT is not null");
/*  265 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentEqualTo(String value) {
/*  269 */       addCriterion("CONTENT =", value, "content");
/*  270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotEqualTo(String value) {
/*  274 */       addCriterion("CONTENT <>", value, "content");
/*  275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThan(String value) {
/*  279 */       addCriterion("CONTENT >", value, "content");
/*  280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThanOrEqualTo(String value) {
/*  284 */       addCriterion("CONTENT >=", value, "content");
/*  285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThan(String value) {
/*  289 */       addCriterion("CONTENT <", value, "content");
/*  290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThanOrEqualTo(String value) {
/*  294 */       addCriterion("CONTENT <=", value, "content");
/*  295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLike(String value) {
/*  299 */       addCriterion("CONTENT like", value, "content");
/*  300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotLike(String value) {
/*  304 */       addCriterion("CONTENT not like", value, "content");
/*  305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIn(List<String> values) {
/*  309 */       addCriterion("CONTENT in", values, "content");
/*  310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotIn(List<String> values) {
/*  314 */       addCriterion("CONTENT not in", values, "content");
/*  315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentBetween(String value1, String value2) {
/*  319 */       addCriterion("CONTENT between", value1, value2, "content");
/*  320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotBetween(String value1, String value2) {
/*  324 */       addCriterion("CONTENT not between", value1, value2, "content");
/*  325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeIsNull() {
/*  329 */       addCriterion("FEE_TYPE is null");
/*  330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeIsNotNull() {
/*  334 */       addCriterion("FEE_TYPE is not null");
/*  335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeEqualTo(Integer value) {
/*  339 */       addCriterion("FEE_TYPE =", value, "feeType");
/*  340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeNotEqualTo(Integer value) {
/*  344 */       addCriterion("FEE_TYPE <>", value, "feeType");
/*  345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeGreaterThan(Integer value) {
/*  349 */       addCriterion("FEE_TYPE >", value, "feeType");
/*  350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeGreaterThanOrEqualTo(Integer value) {
/*  354 */       addCriterion("FEE_TYPE >=", value, "feeType");
/*  355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeLessThan(Integer value) {
/*  359 */       addCriterion("FEE_TYPE <", value, "feeType");
/*  360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeLessThanOrEqualTo(Integer value) {
/*  364 */       addCriterion("FEE_TYPE <=", value, "feeType");
/*  365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeIn(List<Integer> values) {
/*  369 */       addCriterion("FEE_TYPE in", values, "feeType");
/*  370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeNotIn(List<Integer> values) {
/*  374 */       addCriterion("FEE_TYPE not in", values, "feeType");
/*  375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeBetween(Integer value1, Integer value2) {
/*  379 */       addCriterion("FEE_TYPE between", value1, value2, "feeType");
/*  380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeNotBetween(Integer value1, Integer value2) {
/*  384 */       addCriterion("FEE_TYPE not between", value1, value2, "feeType");
/*  385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueIsNull() {
/*  389 */       addCriterion("FEE_VALUE is null");
/*  390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueIsNotNull() {
/*  394 */       addCriterion("FEE_VALUE is not null");
/*  395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueEqualTo(String value) {
/*  399 */       addCriterion("FEE_VALUE =", value, "feeValue");
/*  400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueNotEqualTo(String value) {
/*  404 */       addCriterion("FEE_VALUE <>", value, "feeValue");
/*  405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueGreaterThan(String value) {
/*  409 */       addCriterion("FEE_VALUE >", value, "feeValue");
/*  410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueGreaterThanOrEqualTo(String value) {
/*  414 */       addCriterion("FEE_VALUE >=", value, "feeValue");
/*  415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueLessThan(String value) {
/*  419 */       addCriterion("FEE_VALUE <", value, "feeValue");
/*  420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueLessThanOrEqualTo(String value) {
/*  424 */       addCriterion("FEE_VALUE <=", value, "feeValue");
/*  425 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueLike(String value) {
/*  429 */       addCriterion("FEE_VALUE like", value, "feeValue");
/*  430 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueNotLike(String value) {
/*  434 */       addCriterion("FEE_VALUE not like", value, "feeValue");
/*  435 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueIn(List<String> values) {
/*  439 */       addCriterion("FEE_VALUE in", values, "feeValue");
/*  440 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueNotIn(List<String> values) {
/*  444 */       addCriterion("FEE_VALUE not in", values, "feeValue");
/*  445 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueBetween(String value1, String value2) {
/*  449 */       addCriterion("FEE_VALUE between", value1, value2, "feeValue");
/*  450 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueNotBetween(String value1, String value2) {
/*  454 */       addCriterion("FEE_VALUE not between", value1, value2, "feeValue");
/*  455 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdIsNull() {
/*  459 */       addCriterion("LINK_ID is null");
/*  460 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdIsNotNull() {
/*  464 */       addCriterion("LINK_ID is not null");
/*  465 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdEqualTo(String value) {
/*  469 */       addCriterion("LINK_ID =", value, "linkId");
/*  470 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdNotEqualTo(String value) {
/*  474 */       addCriterion("LINK_ID <>", value, "linkId");
/*  475 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdGreaterThan(String value) {
/*  479 */       addCriterion("LINK_ID >", value, "linkId");
/*  480 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdGreaterThanOrEqualTo(String value) {
/*  484 */       addCriterion("LINK_ID >=", value, "linkId");
/*  485 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdLessThan(String value) {
/*  489 */       addCriterion("LINK_ID <", value, "linkId");
/*  490 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdLessThanOrEqualTo(String value) {
/*  494 */       addCriterion("LINK_ID <=", value, "linkId");
/*  495 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdLike(String value) {
/*  499 */       addCriterion("LINK_ID like", value, "linkId");
/*  500 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdNotLike(String value) {
/*  504 */       addCriterion("LINK_ID not like", value, "linkId");
/*  505 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdIn(List<String> values) {
/*  509 */       addCriterion("LINK_ID in", values, "linkId");
/*  510 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdNotIn(List<String> values) {
/*  514 */       addCriterion("LINK_ID not in", values, "linkId");
/*  515 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdBetween(String value1, String value2) {
/*  519 */       addCriterion("LINK_ID between", value1, value2, "linkId");
/*  520 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdNotBetween(String value1, String value2) {
/*  524 */       addCriterion("LINK_ID not between", value1, value2, "linkId");
/*  525 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateIsNull() {
/*  529 */       addCriterion("SUBMIT_DATE is null");
/*  530 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateIsNotNull() {
/*  534 */       addCriterion("SUBMIT_DATE is not null");
/*  535 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateEqualTo(Date value) {
/*  539 */       addCriterion("SUBMIT_DATE =", value, "submitDate");
/*  540 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateNotEqualTo(Date value) {
/*  544 */       addCriterion("SUBMIT_DATE <>", value, "submitDate");
/*  545 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateGreaterThan(Date value) {
/*  549 */       addCriterion("SUBMIT_DATE >", value, "submitDate");
/*  550 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
/*  554 */       addCriterion("SUBMIT_DATE >=", value, "submitDate");
/*  555 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateLessThan(Date value) {
/*  559 */       addCriterion("SUBMIT_DATE <", value, "submitDate");
/*  560 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
/*  564 */       addCriterion("SUBMIT_DATE <=", value, "submitDate");
/*  565 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateIn(List<Date> values) {
/*  569 */       addCriterion("SUBMIT_DATE in", values, "submitDate");
/*  570 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateNotIn(List<Date> values) {
/*  574 */       addCriterion("SUBMIT_DATE not in", values, "submitDate");
/*  575 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateBetween(Date value1, Date value2) {
/*  579 */       addCriterion("SUBMIT_DATE between", value1, value2, "submitDate");
/*  580 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
/*  584 */       addCriterion("SUBMIT_DATE not between", value1, value2, "submitDate");
/*  585 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusIsNull() {
/*  589 */       addCriterion("REPROT_STATUS is null");
/*  590 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusIsNotNull() {
/*  594 */       addCriterion("REPROT_STATUS is not null");
/*  595 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusEqualTo(Integer value) {
/*  599 */       addCriterion("REPROT_STATUS =", value, "reprotStatus");
/*  600 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusNotEqualTo(Integer value) {
/*  604 */       addCriterion("REPROT_STATUS <>", value, "reprotStatus");
/*  605 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusGreaterThan(Integer value) {
/*  609 */       addCriterion("REPROT_STATUS >", value, "reprotStatus");
/*  610 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusGreaterThanOrEqualTo(Integer value) {
/*  614 */       addCriterion("REPROT_STATUS >=", value, "reprotStatus");
/*  615 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusLessThan(Integer value) {
/*  619 */       addCriterion("REPROT_STATUS <", value, "reprotStatus");
/*  620 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusLessThanOrEqualTo(Integer value) {
/*  624 */       addCriterion("REPROT_STATUS <=", value, "reprotStatus");
/*  625 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusIn(List<Integer> values) {
/*  629 */       addCriterion("REPROT_STATUS in", values, "reprotStatus");
/*  630 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusNotIn(List<Integer> values) {
/*  634 */       addCriterion("REPROT_STATUS not in", values, "reprotStatus");
/*  635 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusBetween(Integer value1, Integer value2) {
/*  639 */       addCriterion("REPROT_STATUS between", value1, value2, "reprotStatus");
/*  640 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusNotBetween(Integer value1, Integer value2) {
/*  644 */       addCriterion("REPROT_STATUS not between", value1, value2, "reprotStatus");
/*  645 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateIsNull() {
/*  649 */       addCriterion("REPROT_DATE is null");
/*  650 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateIsNotNull() {
/*  654 */       addCriterion("REPROT_DATE is not null");
/*  655 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateEqualTo(Date value) {
/*  659 */       addCriterion("REPROT_DATE =", value, "reprotDate");
/*  660 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateNotEqualTo(Date value) {
/*  664 */       addCriterion("REPROT_DATE <>", value, "reprotDate");
/*  665 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateGreaterThan(Date value) {
/*  669 */       addCriterion("REPROT_DATE >", value, "reprotDate");
/*  670 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateGreaterThanOrEqualTo(Date value) {
/*  674 */       addCriterion("REPROT_DATE >=", value, "reprotDate");
/*  675 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateLessThan(Date value) {
/*  679 */       addCriterion("REPROT_DATE <", value, "reprotDate");
/*  680 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateLessThanOrEqualTo(Date value) {
/*  684 */       addCriterion("REPROT_DATE <=", value, "reprotDate");
/*  685 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateIn(List<Date> values) {
/*  689 */       addCriterion("REPROT_DATE in", values, "reprotDate");
/*  690 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateNotIn(List<Date> values) {
/*  694 */       addCriterion("REPROT_DATE not in", values, "reprotDate");
/*  695 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateBetween(Date value1, Date value2) {
/*  699 */       addCriterion("REPROT_DATE between", value1, value2, "reprotDate");
/*  700 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateNotBetween(Date value1, Date value2) {
/*  704 */       addCriterion("REPROT_DATE not between", value1, value2, "reprotDate");
/*  705 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberIsNull() {
/*  709 */       addCriterion("USER_NUMBER is null");
/*  710 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberIsNotNull() {
/*  714 */       addCriterion("USER_NUMBER is not null");
/*  715 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberEqualTo(String value) {
/*  719 */       addCriterion("USER_NUMBER =", value, "userNumber");
/*  720 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberNotEqualTo(String value) {
/*  724 */       addCriterion("USER_NUMBER <>", value, "userNumber");
/*  725 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberGreaterThan(String value) {
/*  729 */       addCriterion("USER_NUMBER >", value, "userNumber");
/*  730 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
/*  734 */       addCriterion("USER_NUMBER >=", value, "userNumber");
/*  735 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberLessThan(String value) {
/*  739 */       addCriterion("USER_NUMBER <", value, "userNumber");
/*  740 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberLessThanOrEqualTo(String value) {
/*  744 */       addCriterion("USER_NUMBER <=", value, "userNumber");
/*  745 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberLike(String value) {
/*  749 */       addCriterion("USER_NUMBER like", value, "userNumber");
/*  750 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberNotLike(String value) {
/*  754 */       addCriterion("USER_NUMBER not like", value, "userNumber");
/*  755 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberIn(List<String> values) {
/*  759 */       addCriterion("USER_NUMBER in", values, "userNumber");
/*  760 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberNotIn(List<String> values) {
/*  764 */       addCriterion("USER_NUMBER not in", values, "userNumber");
/*  765 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberBetween(String value1, String value2) {
/*  769 */       addCriterion("USER_NUMBER between", value1, value2, "userNumber");
/*  770 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberNotBetween(String value1, String value2) {
/*  774 */       addCriterion("USER_NUMBER not between", value1, value2, "userNumber");
/*  775 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeIsNull() {
/*  779 */       addCriterion("ERROR_CODE is null");
/*  780 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeIsNotNull() {
/*  784 */       addCriterion("ERROR_CODE is not null");
/*  785 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeEqualTo(Long value) {
/*  789 */       addCriterion("ERROR_CODE =", value, "errorCode");
/*  790 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeNotEqualTo(Long value) {
/*  794 */       addCriterion("ERROR_CODE <>", value, "errorCode");
/*  795 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeGreaterThan(Long value) {
/*  799 */       addCriterion("ERROR_CODE >", value, "errorCode");
/*  800 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeGreaterThanOrEqualTo(Long value) {
/*  804 */       addCriterion("ERROR_CODE >=", value, "errorCode");
/*  805 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeLessThan(Long value) {
/*  809 */       addCriterion("ERROR_CODE <", value, "errorCode");
/*  810 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeLessThanOrEqualTo(Long value) {
/*  814 */       addCriterion("ERROR_CODE <=", value, "errorCode");
/*  815 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeIn(List<Long> values) {
/*  819 */       addCriterion("ERROR_CODE in", values, "errorCode");
/*  820 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeNotIn(List<Long> values) {
/*  824 */       addCriterion("ERROR_CODE not in", values, "errorCode");
/*  825 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeBetween(Long value1, Long value2) {
/*  829 */       addCriterion("ERROR_CODE between", value1, value2, "errorCode");
/*  830 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeNotBetween(Long value1, Long value2) {
/*  834 */       addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
/*  835 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberIsNull() {
/*  839 */       addCriterion("SEQ_NUMBER is null");
/*  840 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberIsNotNull() {
/*  844 */       addCriterion("SEQ_NUMBER is not null");
/*  845 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberEqualTo(String value) {
/*  849 */       addCriterion("SEQ_NUMBER =", value, "seqNumber");
/*  850 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberNotEqualTo(String value) {
/*  854 */       addCriterion("SEQ_NUMBER <>", value, "seqNumber");
/*  855 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberGreaterThan(String value) {
/*  859 */       addCriterion("SEQ_NUMBER >", value, "seqNumber");
/*  860 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberGreaterThanOrEqualTo(String value) {
/*  864 */       addCriterion("SEQ_NUMBER >=", value, "seqNumber");
/*  865 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberLessThan(String value) {
/*  869 */       addCriterion("SEQ_NUMBER <", value, "seqNumber");
/*  870 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberLessThanOrEqualTo(String value) {
/*  874 */       addCriterion("SEQ_NUMBER <=", value, "seqNumber");
/*  875 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberLike(String value) {
/*  879 */       addCriterion("SEQ_NUMBER like", value, "seqNumber");
/*  880 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberNotLike(String value) {
/*  884 */       addCriterion("SEQ_NUMBER not like", value, "seqNumber");
/*  885 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberIn(List<String> values) {
/*  889 */       addCriterion("SEQ_NUMBER in", values, "seqNumber");
/*  890 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberNotIn(List<String> values) {
/*  894 */       addCriterion("SEQ_NUMBER not in", values, "seqNumber");
/*  895 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberBetween(String value1, String value2) {
/*  899 */       addCriterion("SEQ_NUMBER between", value1, value2, "seqNumber");
/*  900 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberNotBetween(String value1, String value2) {
/*  904 */       addCriterion("SEQ_NUMBER not between", value1, value2, "seqNumber");
/*  905 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIsNull() {
/*  909 */       addCriterion("CP_CONTENT is null");
/*  910 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIsNotNull() {
/*  914 */       addCriterion("CP_CONTENT is not null");
/*  915 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentEqualTo(String value) {
/*  919 */       addCriterion("CP_CONTENT =", value, "cpContent");
/*  920 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotEqualTo(String value) {
/*  924 */       addCriterion("CP_CONTENT <>", value, "cpContent");
/*  925 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentGreaterThan(String value) {
/*  929 */       addCriterion("CP_CONTENT >", value, "cpContent");
/*  930 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentGreaterThanOrEqualTo(String value) {
/*  934 */       addCriterion("CP_CONTENT >=", value, "cpContent");
/*  935 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLessThan(String value) {
/*  939 */       addCriterion("CP_CONTENT <", value, "cpContent");
/*  940 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLessThanOrEqualTo(String value) {
/*  944 */       addCriterion("CP_CONTENT <=", value, "cpContent");
/*  945 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLike(String value) {
/*  949 */       addCriterion("CP_CONTENT like", value, "cpContent");
/*  950 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotLike(String value) {
/*  954 */       addCriterion("CP_CONTENT not like", value, "cpContent");
/*  955 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIn(List<String> values) {
/*  959 */       addCriterion("CP_CONTENT in", values, "cpContent");
/*  960 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotIn(List<String> values) {
/*  964 */       addCriterion("CP_CONTENT not in", values, "cpContent");
/*  965 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentBetween(String value1, String value2) {
/*  969 */       addCriterion("CP_CONTENT between", value1, value2, "cpContent");
/*  970 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotBetween(String value1, String value2) {
/*  974 */       addCriterion("CP_CONTENT not between", value1, value2, "cpContent");
/*  975 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNull() {
/*  979 */       addCriterion("LIMIT_ID is null");
/*  980 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNotNull() {
/*  984 */       addCriterion("LIMIT_ID is not null");
/*  985 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdEqualTo(String value) {
/*  989 */       addCriterion("LIMIT_ID =", value, "limitId");
/*  990 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotEqualTo(String value) {
/*  994 */       addCriterion("LIMIT_ID <>", value, "limitId");
/*  995 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThan(String value) {
/*  999 */       addCriterion("LIMIT_ID >", value, "limitId");
/* 1000 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThanOrEqualTo(String value) {
/* 1004 */       addCriterion("LIMIT_ID >=", value, "limitId");
/* 1005 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThan(String value) {
/* 1009 */       addCriterion("LIMIT_ID <", value, "limitId");
/* 1010 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThanOrEqualTo(String value) {
/* 1014 */       addCriterion("LIMIT_ID <=", value, "limitId");
/* 1015 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLike(String value) {
/* 1019 */       addCriterion("LIMIT_ID like", value, "limitId");
/* 1020 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotLike(String value) {
/* 1024 */       addCriterion("LIMIT_ID not like", value, "limitId");
/* 1025 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIn(List<String> values) {
/* 1029 */       addCriterion("LIMIT_ID in", values, "limitId");
/* 1030 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotIn(List<String> values) {
/* 1034 */       addCriterion("LIMIT_ID not in", values, "limitId");
/* 1035 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdBetween(String value1, String value2) {
/* 1039 */       addCriterion("LIMIT_ID between", value1, value2, "limitId");
/* 1040 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotBetween(String value1, String value2) {
/* 1044 */       addCriterion("LIMIT_ID not between", value1, value2, "limitId");
/* 1045 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdIsNull() {
/* 1049 */       addCriterion("IS_TD is null");
/* 1050 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdIsNotNull() {
/* 1054 */       addCriterion("IS_TD is not null");
/* 1055 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdEqualTo(Long value) {
/* 1059 */       addCriterion("IS_TD =", value, "isTd");
/* 1060 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdNotEqualTo(Long value) {
/* 1064 */       addCriterion("IS_TD <>", value, "isTd");
/* 1065 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdGreaterThan(Long value) {
/* 1069 */       addCriterion("IS_TD >", value, "isTd");
/* 1070 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdGreaterThanOrEqualTo(Long value) {
/* 1074 */       addCriterion("IS_TD >=", value, "isTd");
/* 1075 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdLessThan(Long value) {
/* 1079 */       addCriterion("IS_TD <", value, "isTd");
/* 1080 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdLessThanOrEqualTo(Long value) {
/* 1084 */       addCriterion("IS_TD <=", value, "isTd");
/* 1085 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdIn(List<Long> values) {
/* 1089 */       addCriterion("IS_TD in", values, "isTd");
/* 1090 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdNotIn(List<Long> values) {
/* 1094 */       addCriterion("IS_TD not in", values, "isTd");
/* 1095 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdBetween(Long value1, Long value2) {
/* 1099 */       addCriterion("IS_TD between", value1, value2, "isTd");
/* 1100 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdNotBetween(Long value1, Long value2) {
/* 1104 */       addCriterion("IS_TD not between", value1, value2, "isTd");
/* 1105 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateIsNull() {
/* 1109 */       addCriterion("TD_DATE is null");
/* 1110 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateIsNotNull() {
/* 1114 */       addCriterion("TD_DATE is not null");
/* 1115 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateEqualTo(Date value) {
/* 1119 */       addCriterion("TD_DATE =", value, "tdDate");
/* 1120 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateNotEqualTo(Date value) {
/* 1124 */       addCriterion("TD_DATE <>", value, "tdDate");
/* 1125 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateGreaterThan(Date value) {
/* 1129 */       addCriterion("TD_DATE >", value, "tdDate");
/* 1130 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateGreaterThanOrEqualTo(Date value) {
/* 1134 */       addCriterion("TD_DATE >=", value, "tdDate");
/* 1135 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateLessThan(Date value) {
/* 1139 */       addCriterion("TD_DATE <", value, "tdDate");
/* 1140 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateLessThanOrEqualTo(Date value) {
/* 1144 */       addCriterion("TD_DATE <=", value, "tdDate");
/* 1145 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateIn(List<Date> values) {
/* 1149 */       addCriterion("TD_DATE in", values, "tdDate");
/* 1150 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateNotIn(List<Date> values) {
/* 1154 */       addCriterion("TD_DATE not in", values, "tdDate");
/* 1155 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateBetween(Date value1, Date value2) {
/* 1159 */       addCriterion("TD_DATE between", value1, value2, "tdDate");
/* 1160 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateNotBetween(Date value1, Date value2) {
/* 1164 */       addCriterion("TD_DATE not between", value1, value2, "tdDate");
/* 1165 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIsNull() {
/* 1169 */       addCriterion("PROVINCE_ID is null");
/* 1170 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIsNotNull() {
/* 1174 */       addCriterion("PROVINCE_ID is not null");
/* 1175 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdEqualTo(Long value) {
/* 1179 */       addCriterion("PROVINCE_ID =", value, "provinceId");
/* 1180 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotEqualTo(Long value) {
/* 1184 */       addCriterion("PROVINCE_ID <>", value, "provinceId");
/* 1185 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdGreaterThan(Long value) {
/* 1189 */       addCriterion("PROVINCE_ID >", value, "provinceId");
/* 1190 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
/* 1194 */       addCriterion("PROVINCE_ID >=", value, "provinceId");
/* 1195 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdLessThan(Long value) {
/* 1199 */       addCriterion("PROVINCE_ID <", value, "provinceId");
/* 1200 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
/* 1204 */       addCriterion("PROVINCE_ID <=", value, "provinceId");
/* 1205 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIn(List<Long> values) {
/* 1209 */       addCriterion("PROVINCE_ID in", values, "provinceId");
/* 1210 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotIn(List<Long> values) {
/* 1214 */       addCriterion("PROVINCE_ID not in", values, "provinceId");
/* 1215 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdBetween(Long value1, Long value2) {
/* 1219 */       addCriterion("PROVINCE_ID between", value1, value2, "provinceId");
/* 1220 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
/* 1224 */       addCriterion("PROVINCE_ID not between", value1, value2, "provinceId");
/* 1225 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIsNull() {
/* 1229 */       addCriterion("PROVINCE_NAME is null");
/* 1230 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIsNotNull() {
/* 1234 */       addCriterion("PROVINCE_NAME is not null");
/* 1235 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameEqualTo(String value) {
/* 1239 */       addCriterion("PROVINCE_NAME =", value, "provinceName");
/* 1240 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotEqualTo(String value) {
/* 1244 */       addCriterion("PROVINCE_NAME <>", value, "provinceName");
/* 1245 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameGreaterThan(String value) {
/* 1249 */       addCriterion("PROVINCE_NAME >", value, "provinceName");
/* 1250 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
/* 1254 */       addCriterion("PROVINCE_NAME >=", value, "provinceName");
/* 1255 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLessThan(String value) {
/* 1259 */       addCriterion("PROVINCE_NAME <", value, "provinceName");
/* 1260 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLessThanOrEqualTo(String value) {
/* 1264 */       addCriterion("PROVINCE_NAME <=", value, "provinceName");
/* 1265 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLike(String value) {
/* 1269 */       addCriterion("PROVINCE_NAME like", value, "provinceName");
/* 1270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotLike(String value) {
/* 1274 */       addCriterion("PROVINCE_NAME not like", value, "provinceName");
/* 1275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIn(List<String> values) {
/* 1279 */       addCriterion("PROVINCE_NAME in", values, "provinceName");
/* 1280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotIn(List<String> values) {
/* 1284 */       addCriterion("PROVINCE_NAME not in", values, "provinceName");
/* 1285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameBetween(String value1, String value2) {
/* 1289 */       addCriterion("PROVINCE_NAME between", value1, value2, "provinceName");
/* 1290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotBetween(String value1, String value2) {
/* 1294 */       addCriterion("PROVINCE_NAME not between", value1, value2, "provinceName");
/* 1295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIsNull() {
/* 1299 */       addCriterion("CITY_CODE is null");
/* 1300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIsNotNull() {
/* 1304 */       addCriterion("CITY_CODE is not null");
/* 1305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeEqualTo(Long value) {
/* 1309 */       addCriterion("CITY_CODE =", value, "cityCode");
/* 1310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotEqualTo(Long value) {
/* 1314 */       addCriterion("CITY_CODE <>", value, "cityCode");
/* 1315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeGreaterThan(Long value) {
/* 1319 */       addCriterion("CITY_CODE >", value, "cityCode");
/* 1320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeGreaterThanOrEqualTo(Long value) {
/* 1324 */       addCriterion("CITY_CODE >=", value, "cityCode");
/* 1325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeLessThan(Long value) {
/* 1329 */       addCriterion("CITY_CODE <", value, "cityCode");
/* 1330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeLessThanOrEqualTo(Long value) {
/* 1334 */       addCriterion("CITY_CODE <=", value, "cityCode");
/* 1335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIn(List<Long> values) {
/* 1339 */       addCriterion("CITY_CODE in", values, "cityCode");
/* 1340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotIn(List<Long> values) {
/* 1344 */       addCriterion("CITY_CODE not in", values, "cityCode");
/* 1345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeBetween(Long value1, Long value2) {
/* 1349 */       addCriterion("CITY_CODE between", value1, value2, "cityCode");
/* 1350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotBetween(Long value1, Long value2) {
/* 1354 */       addCriterion("CITY_CODE not between", value1, value2, "cityCode");
/* 1355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIsNull() {
/* 1359 */       addCriterion("CITY_NAME is null");
/* 1360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIsNotNull() {
/* 1364 */       addCriterion("CITY_NAME is not null");
/* 1365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameEqualTo(String value) {
/* 1369 */       addCriterion("CITY_NAME =", value, "cityName");
/* 1370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotEqualTo(String value) {
/* 1374 */       addCriterion("CITY_NAME <>", value, "cityName");
/* 1375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameGreaterThan(String value) {
/* 1379 */       addCriterion("CITY_NAME >", value, "cityName");
/* 1380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameGreaterThanOrEqualTo(String value) {
/* 1384 */       addCriterion("CITY_NAME >=", value, "cityName");
/* 1385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLessThan(String value) {
/* 1389 */       addCriterion("CITY_NAME <", value, "cityName");
/* 1390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLessThanOrEqualTo(String value) {
/* 1394 */       addCriterion("CITY_NAME <=", value, "cityName");
/* 1395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLike(String value) {
/* 1399 */       addCriterion("CITY_NAME like", value, "cityName");
/* 1400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotLike(String value) {
/* 1404 */       addCriterion("CITY_NAME not like", value, "cityName");
/* 1405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIn(List<String> values) {
/* 1409 */       addCriterion("CITY_NAME in", values, "cityName");
/* 1410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotIn(List<String> values) {
/* 1414 */       addCriterion("CITY_NAME not in", values, "cityName");
/* 1415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameBetween(String value1, String value2) {
/* 1419 */       addCriterion("CITY_NAME between", value1, value2, "cityName");
/* 1420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotBetween(String value1, String value2) {
/* 1424 */       addCriterion("CITY_NAME not between", value1, value2, "cityName");
/* 1425 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.SmsPayOrderExample
 * JD-Core Version:    0.6.2
 */
/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ public class SmsPayOrderMonthExample
/*      */ {
/*      */   public int start;
/*      */   public int limit;
/*      */   public String tableName;
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public SmsPayOrderMonthExample()
/*      */   {
/*   45 */     this.oredCriteria = new ArrayList();
/*      */   }
/*      */ 
/*      */   public void setOrderByClause(String orderByClause)
/*      */   {
/*   55 */     this.orderByClause = orderByClause;
/*      */   }
/*      */ 
/*      */   public String getOrderByClause()
/*      */   {
/*   65 */     return this.orderByClause;
/*      */   }
/*      */ 
/*      */   public void setDistinct(boolean distinct)
/*      */   {
/*   75 */     this.distinct = distinct;
/*      */   }
/*      */ 
/*      */   public boolean isDistinct()
/*      */   {
/*   85 */     return this.distinct;
/*      */   }
/*      */ 
/*      */   public List<Criteria> getOredCriteria()
/*      */   {
/*   95 */     return this.oredCriteria;
/*      */   }
/*      */ 
/*      */   public void or(Criteria criteria)
/*      */   {
/*  105 */     this.oredCriteria.add(criteria);
/*      */   }
/*      */ 
/*      */   public Criteria or()
/*      */   {
/*  115 */     Criteria criteria = createCriteriaInternal();
/*  116 */     this.oredCriteria.add(criteria);
/*  117 */     return criteria;
/*      */   }
/*      */ 
/*      */   public Criteria createCriteria()
/*      */   {
/*  127 */     Criteria criteria = createCriteriaInternal();
/*  128 */     if (this.oredCriteria.size() == 0) {
/*  129 */       this.oredCriteria.add(criteria);
/*      */     }
/*  131 */     return criteria;
/*      */   }
/*      */ 
/*      */   protected Criteria createCriteriaInternal()
/*      */   {
/*  141 */     Criteria criteria = new Criteria();
/*  142 */     return criteria;
/*      */   }
/*      */ 
/*      */   public void clear()
/*      */   {
/*  152 */     this.oredCriteria.clear();
/*  153 */     this.orderByClause = null;
/*  154 */     this.distinct = false;
/*      */   }
/*      */ 
/*      */   public String getTableName()
/*      */   {
/* 1541 */     return this.tableName;
/*      */   }
/*      */ 
/*      */   public void setTableName(String tableName) {
/* 1545 */     this.tableName = tableName;
/*      */   }
/*      */ 
/*      */   public int getStart() {
/* 1549 */     return this.start;
/*      */   }
/*      */ 
/*      */   public void setStart(int start) {
/* 1553 */     this.start = start;
/*      */   }
/*      */ 
/*      */   public int getLimit() {
/* 1557 */     return this.limit;
/*      */   }
/*      */ 
/*      */   public void setLimit(int limit) {
/* 1561 */     this.limit = limit;
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
/* 1472 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1476 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1480 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1484 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1488 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1492 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1496 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1500 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1505 */       this.condition = condition;
/* 1506 */       this.typeHandler = null;
/* 1507 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1512 */       this.condition = condition;
/* 1513 */       this.value = value;
/* 1514 */       this.typeHandler = typeHandler;
/* 1515 */       if ((value instanceof List))
/* 1516 */         this.listValue = true;
/*      */       else
/* 1518 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1523 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1528 */       this.condition = condition;
/* 1529 */       this.value = value;
/* 1530 */       this.secondValue = secondValue;
/* 1531 */       this.typeHandler = typeHandler;
/* 1532 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1536 */       this(condition, value, secondValue, null);
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
/*  168 */       this.criteria = new ArrayList();
/*      */     }
/*      */ 
/*      */     public boolean isValid() {
/*  172 */       return this.criteria.size() > 0;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getAllCriteria() {
/*  176 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getCriteria() {
/*  180 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition) {
/*  184 */       if (condition == null) {
/*  185 */         throw new RuntimeException("Value for condition cannot be null");
/*      */       }
/*  187 */       this.criteria.add(new Criterion(condition));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value, String property) {
/*  191 */       if (value == null) {
/*  192 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*      */       }
/*  194 */       this.criteria.add(new Criterion(condition, value));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/*  198 */       if ((value1 == null) || (value2 == null)) {
/*  199 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*      */       }
/*  201 */       this.criteria.add(new Criterion(condition, value1, value2));
/*      */     }
/*      */ 
/*      */     public Criteria andUidIsNull() {
/*  205 */       addCriterion("UID is null");
/*  206 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidIsNotNull() {
/*  210 */       addCriterion("UID is not null");
/*  211 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidEqualTo(Long value) {
/*  215 */       addCriterion("UID =", value, "uid");
/*  216 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotEqualTo(Long value) {
/*  220 */       addCriterion("UID <>", value, "uid");
/*  221 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidGreaterThan(Long value) {
/*  225 */       addCriterion("UID >", value, "uid");
/*  226 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidGreaterThanOrEqualTo(Long value) {
/*  230 */       addCriterion("UID >=", value, "uid");
/*  231 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidLessThan(Long value) {
/*  235 */       addCriterion("UID <", value, "uid");
/*  236 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidLessThanOrEqualTo(Long value) {
/*  240 */       addCriterion("UID <=", value, "uid");
/*  241 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidIn(List<Long> values) {
/*  245 */       addCriterion("UID in", values, "uid");
/*  246 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotIn(List<Long> values) {
/*  250 */       addCriterion("UID not in", values, "uid");
/*  251 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidBetween(Long value1, Long value2) {
/*  255 */       addCriterion("UID between", value1, value2, "uid");
/*  256 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUidNotBetween(Long value1, Long value2) {
/*  260 */       addCriterion("UID not between", value1, value2, "uid");
/*  261 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNull() {
/*  265 */       addCriterion("CONTENT is null");
/*  266 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNotNull() {
/*  270 */       addCriterion("CONTENT is not null");
/*  271 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentEqualTo(String value) {
/*  275 */       addCriterion("CONTENT =", value, "content");
/*  276 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotEqualTo(String value) {
/*  280 */       addCriterion("CONTENT <>", value, "content");
/*  281 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThan(String value) {
/*  285 */       addCriterion("CONTENT >", value, "content");
/*  286 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThanOrEqualTo(String value) {
/*  290 */       addCriterion("CONTENT >=", value, "content");
/*  291 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThan(String value) {
/*  295 */       addCriterion("CONTENT <", value, "content");
/*  296 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThanOrEqualTo(String value) {
/*  300 */       addCriterion("CONTENT <=", value, "content");
/*  301 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLike(String value) {
/*  305 */       addCriterion("CONTENT like", value, "content");
/*  306 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotLike(String value) {
/*  310 */       addCriterion("CONTENT not like", value, "content");
/*  311 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIn(List<String> values) {
/*  315 */       addCriterion("CONTENT in", values, "content");
/*  316 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotIn(List<String> values) {
/*  320 */       addCriterion("CONTENT not in", values, "content");
/*  321 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentBetween(String value1, String value2) {
/*  325 */       addCriterion("CONTENT between", value1, value2, "content");
/*  326 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotBetween(String value1, String value2) {
/*  330 */       addCriterion("CONTENT not between", value1, value2, "content");
/*  331 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeIsNull() {
/*  335 */       addCriterion("FEE_TYPE is null");
/*  336 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeIsNotNull() {
/*  340 */       addCriterion("FEE_TYPE is not null");
/*  341 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeEqualTo(Integer value) {
/*  345 */       addCriterion("FEE_TYPE =", value, "feeType");
/*  346 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeNotEqualTo(Integer value) {
/*  350 */       addCriterion("FEE_TYPE <>", value, "feeType");
/*  351 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeGreaterThan(Integer value) {
/*  355 */       addCriterion("FEE_TYPE >", value, "feeType");
/*  356 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeGreaterThanOrEqualTo(Integer value) {
/*  360 */       addCriterion("FEE_TYPE >=", value, "feeType");
/*  361 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeLessThan(Integer value) {
/*  365 */       addCriterion("FEE_TYPE <", value, "feeType");
/*  366 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeLessThanOrEqualTo(Integer value) {
/*  370 */       addCriterion("FEE_TYPE <=", value, "feeType");
/*  371 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeIn(List<Integer> values) {
/*  375 */       addCriterion("FEE_TYPE in", values, "feeType");
/*  376 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeNotIn(List<Integer> values) {
/*  380 */       addCriterion("FEE_TYPE not in", values, "feeType");
/*  381 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeBetween(Integer value1, Integer value2) {
/*  385 */       addCriterion("FEE_TYPE between", value1, value2, "feeType");
/*  386 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeTypeNotBetween(Integer value1, Integer value2) {
/*  390 */       addCriterion("FEE_TYPE not between", value1, value2, "feeType");
/*  391 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueIsNull() {
/*  395 */       addCriterion("FEE_VALUE is null");
/*  396 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueIsNotNull() {
/*  400 */       addCriterion("FEE_VALUE is not null");
/*  401 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueEqualTo(String value) {
/*  405 */       addCriterion("FEE_VALUE =", value, "feeValue");
/*  406 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueNotEqualTo(String value) {
/*  410 */       addCriterion("FEE_VALUE <>", value, "feeValue");
/*  411 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueGreaterThan(String value) {
/*  415 */       addCriterion("FEE_VALUE >", value, "feeValue");
/*  416 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueGreaterThanOrEqualTo(String value) {
/*  420 */       addCriterion("FEE_VALUE >=", value, "feeValue");
/*  421 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueLessThan(String value) {
/*  425 */       addCriterion("FEE_VALUE <", value, "feeValue");
/*  426 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueLessThanOrEqualTo(String value) {
/*  430 */       addCriterion("FEE_VALUE <=", value, "feeValue");
/*  431 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueLike(String value) {
/*  435 */       addCriterion("FEE_VALUE like", value, "feeValue");
/*  436 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueNotLike(String value) {
/*  440 */       addCriterion("FEE_VALUE not like", value, "feeValue");
/*  441 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueIn(List<String> values) {
/*  445 */       addCriterion("FEE_VALUE in", values, "feeValue");
/*  446 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueNotIn(List<String> values) {
/*  450 */       addCriterion("FEE_VALUE not in", values, "feeValue");
/*  451 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueBetween(String value1, String value2) {
/*  455 */       addCriterion("FEE_VALUE between", value1, value2, "feeValue");
/*  456 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeValueNotBetween(String value1, String value2) {
/*  460 */       addCriterion("FEE_VALUE not between", value1, value2, "feeValue");
/*  461 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdIsNull() {
/*  465 */       addCriterion("LINK_ID is null");
/*  466 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdIsNotNull() {
/*  470 */       addCriterion("LINK_ID is not null");
/*  471 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdEqualTo(String value) {
/*  475 */       addCriterion("LINK_ID =", value, "linkId");
/*  476 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdNotEqualTo(String value) {
/*  480 */       addCriterion("LINK_ID <>", value, "linkId");
/*  481 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdGreaterThan(String value) {
/*  485 */       addCriterion("LINK_ID >", value, "linkId");
/*  486 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdGreaterThanOrEqualTo(String value) {
/*  490 */       addCriterion("LINK_ID >=", value, "linkId");
/*  491 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdLessThan(String value) {
/*  495 */       addCriterion("LINK_ID <", value, "linkId");
/*  496 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdLessThanOrEqualTo(String value) {
/*  500 */       addCriterion("LINK_ID <=", value, "linkId");
/*  501 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdLike(String value) {
/*  505 */       addCriterion("LINK_ID like", value, "linkId");
/*  506 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdNotLike(String value) {
/*  510 */       addCriterion("LINK_ID not like", value, "linkId");
/*  511 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdIn(List<String> values) {
/*  515 */       addCriterion("LINK_ID in", values, "linkId");
/*  516 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdNotIn(List<String> values) {
/*  520 */       addCriterion("LINK_ID not in", values, "linkId");
/*  521 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdBetween(String value1, String value2) {
/*  525 */       addCriterion("LINK_ID between", value1, value2, "linkId");
/*  526 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkIdNotBetween(String value1, String value2) {
/*  530 */       addCriterion("LINK_ID not between", value1, value2, "linkId");
/*  531 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateIsNull() {
/*  535 */       addCriterion("SUBMIT_DATE is null");
/*  536 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateIsNotNull() {
/*  540 */       addCriterion("SUBMIT_DATE is not null");
/*  541 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateEqualTo(Date value) {
/*  545 */       addCriterion("SUBMIT_DATE =", value, "submitDate");
/*  546 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateNotEqualTo(Date value) {
/*  550 */       addCriterion("SUBMIT_DATE <>", value, "submitDate");
/*  551 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateGreaterThan(Date value) {
/*  555 */       addCriterion("SUBMIT_DATE >", value, "submitDate");
/*  556 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
/*  560 */       addCriterion("SUBMIT_DATE >=", value, "submitDate");
/*  561 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateLessThan(Date value) {
/*  565 */       addCriterion("SUBMIT_DATE <", value, "submitDate");
/*  566 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
/*  570 */       addCriterion("SUBMIT_DATE <=", value, "submitDate");
/*  571 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateIn(List<Date> values) {
/*  575 */       addCriterion("SUBMIT_DATE in", values, "submitDate");
/*  576 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateNotIn(List<Date> values) {
/*  580 */       addCriterion("SUBMIT_DATE not in", values, "submitDate");
/*  581 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateBetween(Date value1, Date value2) {
/*  585 */       addCriterion("SUBMIT_DATE between", value1, value2, "submitDate");
/*  586 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
/*  590 */       addCriterion("SUBMIT_DATE not between", value1, value2, "submitDate");
/*  591 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusIsNull() {
/*  595 */       addCriterion("REPROT_STATUS is null");
/*  596 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusIsNotNull() {
/*  600 */       addCriterion("REPROT_STATUS is not null");
/*  601 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusEqualTo(Integer value) {
/*  605 */       addCriterion("REPROT_STATUS =", value, "reprotStatus");
/*  606 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusNotEqualTo(Integer value) {
/*  610 */       addCriterion("REPROT_STATUS <>", value, "reprotStatus");
/*  611 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusGreaterThan(Integer value) {
/*  615 */       addCriterion("REPROT_STATUS >", value, "reprotStatus");
/*  616 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusGreaterThanOrEqualTo(Integer value) {
/*  620 */       addCriterion("REPROT_STATUS >=", value, "reprotStatus");
/*  621 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusLessThan(Integer value) {
/*  625 */       addCriterion("REPROT_STATUS <", value, "reprotStatus");
/*  626 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusLessThanOrEqualTo(Integer value) {
/*  630 */       addCriterion("REPROT_STATUS <=", value, "reprotStatus");
/*  631 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusIn(List<Integer> values) {
/*  635 */       addCriterion("REPROT_STATUS in", values, "reprotStatus");
/*  636 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusNotIn(List<Integer> values) {
/*  640 */       addCriterion("REPROT_STATUS not in", values, "reprotStatus");
/*  641 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusBetween(Integer value1, Integer value2) {
/*  645 */       addCriterion("REPROT_STATUS between", value1, value2, "reprotStatus");
/*  646 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotStatusNotBetween(Integer value1, Integer value2) {
/*  650 */       addCriterion("REPROT_STATUS not between", value1, value2, "reprotStatus");
/*  651 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateIsNull() {
/*  655 */       addCriterion("REPROT_DATE is null");
/*  656 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateIsNotNull() {
/*  660 */       addCriterion("REPROT_DATE is not null");
/*  661 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateEqualTo(Date value) {
/*  665 */       addCriterion("REPROT_DATE =", value, "reprotDate");
/*  666 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateNotEqualTo(Date value) {
/*  670 */       addCriterion("REPROT_DATE <>", value, "reprotDate");
/*  671 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateGreaterThan(Date value) {
/*  675 */       addCriterion("REPROT_DATE >", value, "reprotDate");
/*  676 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateGreaterThanOrEqualTo(Date value) {
/*  680 */       addCriterion("REPROT_DATE >=", value, "reprotDate");
/*  681 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateLessThan(Date value) {
/*  685 */       addCriterion("REPROT_DATE <", value, "reprotDate");
/*  686 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateLessThanOrEqualTo(Date value) {
/*  690 */       addCriterion("REPROT_DATE <=", value, "reprotDate");
/*  691 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateIn(List<Date> values) {
/*  695 */       addCriterion("REPROT_DATE in", values, "reprotDate");
/*  696 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateNotIn(List<Date> values) {
/*  700 */       addCriterion("REPROT_DATE not in", values, "reprotDate");
/*  701 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateBetween(Date value1, Date value2) {
/*  705 */       addCriterion("REPROT_DATE between", value1, value2, "reprotDate");
/*  706 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andReprotDateNotBetween(Date value1, Date value2) {
/*  710 */       addCriterion("REPROT_DATE not between", value1, value2, "reprotDate");
/*  711 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberIsNull() {
/*  715 */       addCriterion("USER_NUMBER is null");
/*  716 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberIsNotNull() {
/*  720 */       addCriterion("USER_NUMBER is not null");
/*  721 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberEqualTo(String value) {
/*  725 */       addCriterion("USER_NUMBER =", value, "userNumber");
/*  726 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberNotEqualTo(String value) {
/*  730 */       addCriterion("USER_NUMBER <>", value, "userNumber");
/*  731 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberGreaterThan(String value) {
/*  735 */       addCriterion("USER_NUMBER >", value, "userNumber");
/*  736 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
/*  740 */       addCriterion("USER_NUMBER >=", value, "userNumber");
/*  741 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberLessThan(String value) {
/*  745 */       addCriterion("USER_NUMBER <", value, "userNumber");
/*  746 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberLessThanOrEqualTo(String value) {
/*  750 */       addCriterion("USER_NUMBER <=", value, "userNumber");
/*  751 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberLike(String value) {
/*  755 */       addCriterion("USER_NUMBER like", value, "userNumber");
/*  756 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberNotLike(String value) {
/*  760 */       addCriterion("USER_NUMBER not like", value, "userNumber");
/*  761 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberIn(List<String> values) {
/*  765 */       addCriterion("USER_NUMBER in", values, "userNumber");
/*  766 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberNotIn(List<String> values) {
/*  770 */       addCriterion("USER_NUMBER not in", values, "userNumber");
/*  771 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberBetween(String value1, String value2) {
/*  775 */       addCriterion("USER_NUMBER between", value1, value2, "userNumber");
/*  776 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserNumberNotBetween(String value1, String value2) {
/*  780 */       addCriterion("USER_NUMBER not between", value1, value2, "userNumber");
/*  781 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeIsNull() {
/*  785 */       addCriterion("ERROR_CODE is null");
/*  786 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeIsNotNull() {
/*  790 */       addCriterion("ERROR_CODE is not null");
/*  791 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeEqualTo(Long value) {
/*  795 */       addCriterion("ERROR_CODE =", value, "errorCode");
/*  796 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeNotEqualTo(Long value) {
/*  800 */       addCriterion("ERROR_CODE <>", value, "errorCode");
/*  801 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeGreaterThan(Long value) {
/*  805 */       addCriterion("ERROR_CODE >", value, "errorCode");
/*  806 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeGreaterThanOrEqualTo(Long value) {
/*  810 */       addCriterion("ERROR_CODE >=", value, "errorCode");
/*  811 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeLessThan(Long value) {
/*  815 */       addCriterion("ERROR_CODE <", value, "errorCode");
/*  816 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeLessThanOrEqualTo(Long value) {
/*  820 */       addCriterion("ERROR_CODE <=", value, "errorCode");
/*  821 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeIn(List<Long> values) {
/*  825 */       addCriterion("ERROR_CODE in", values, "errorCode");
/*  826 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeNotIn(List<Long> values) {
/*  830 */       addCriterion("ERROR_CODE not in", values, "errorCode");
/*  831 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeBetween(Long value1, Long value2) {
/*  835 */       addCriterion("ERROR_CODE between", value1, value2, "errorCode");
/*  836 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorCodeNotBetween(Long value1, Long value2) {
/*  840 */       addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
/*  841 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberIsNull() {
/*  845 */       addCriterion("SEQ_NUMBER is null");
/*  846 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberIsNotNull() {
/*  850 */       addCriterion("SEQ_NUMBER is not null");
/*  851 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberEqualTo(String value) {
/*  855 */       addCriterion("SEQ_NUMBER =", value, "seqNumber");
/*  856 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberNotEqualTo(String value) {
/*  860 */       addCriterion("SEQ_NUMBER <>", value, "seqNumber");
/*  861 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberGreaterThan(String value) {
/*  865 */       addCriterion("SEQ_NUMBER >", value, "seqNumber");
/*  866 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberGreaterThanOrEqualTo(String value) {
/*  870 */       addCriterion("SEQ_NUMBER >=", value, "seqNumber");
/*  871 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberLessThan(String value) {
/*  875 */       addCriterion("SEQ_NUMBER <", value, "seqNumber");
/*  876 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberLessThanOrEqualTo(String value) {
/*  880 */       addCriterion("SEQ_NUMBER <=", value, "seqNumber");
/*  881 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberLike(String value) {
/*  885 */       addCriterion("SEQ_NUMBER like", value, "seqNumber");
/*  886 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberNotLike(String value) {
/*  890 */       addCriterion("SEQ_NUMBER not like", value, "seqNumber");
/*  891 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberIn(List<String> values) {
/*  895 */       addCriterion("SEQ_NUMBER in", values, "seqNumber");
/*  896 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberNotIn(List<String> values) {
/*  900 */       addCriterion("SEQ_NUMBER not in", values, "seqNumber");
/*  901 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberBetween(String value1, String value2) {
/*  905 */       addCriterion("SEQ_NUMBER between", value1, value2, "seqNumber");
/*  906 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSeqNumberNotBetween(String value1, String value2) {
/*  910 */       addCriterion("SEQ_NUMBER not between", value1, value2, "seqNumber");
/*  911 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIsNull() {
/*  915 */       addCriterion("CP_CONTENT is null");
/*  916 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIsNotNull() {
/*  920 */       addCriterion("CP_CONTENT is not null");
/*  921 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentEqualTo(String value) {
/*  925 */       addCriterion("CP_CONTENT =", value, "cpContent");
/*  926 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotEqualTo(String value) {
/*  930 */       addCriterion("CP_CONTENT <>", value, "cpContent");
/*  931 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentGreaterThan(String value) {
/*  935 */       addCriterion("CP_CONTENT >", value, "cpContent");
/*  936 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentGreaterThanOrEqualTo(String value) {
/*  940 */       addCriterion("CP_CONTENT >=", value, "cpContent");
/*  941 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLessThan(String value) {
/*  945 */       addCriterion("CP_CONTENT <", value, "cpContent");
/*  946 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLessThanOrEqualTo(String value) {
/*  950 */       addCriterion("CP_CONTENT <=", value, "cpContent");
/*  951 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLike(String value) {
/*  955 */       addCriterion("CP_CONTENT like", value, "cpContent");
/*  956 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotLike(String value) {
/*  960 */       addCriterion("CP_CONTENT not like", value, "cpContent");
/*  961 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIn(List<String> values) {
/*  965 */       addCriterion("CP_CONTENT in", values, "cpContent");
/*  966 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotIn(List<String> values) {
/*  970 */       addCriterion("CP_CONTENT not in", values, "cpContent");
/*  971 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentBetween(String value1, String value2) {
/*  975 */       addCriterion("CP_CONTENT between", value1, value2, "cpContent");
/*  976 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotBetween(String value1, String value2) {
/*  980 */       addCriterion("CP_CONTENT not between", value1, value2, "cpContent");
/*  981 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNull() {
/*  985 */       addCriterion("LIMIT_ID is null");
/*  986 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNotNull() {
/*  990 */       addCriterion("LIMIT_ID is not null");
/*  991 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdEqualTo(String value) {
/*  995 */       addCriterion("LIMIT_ID =", value, "limitId");
/*  996 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotEqualTo(String value) {
/* 1000 */       addCriterion("LIMIT_ID <>", value, "limitId");
/* 1001 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThan(String value) {
/* 1005 */       addCriterion("LIMIT_ID >", value, "limitId");
/* 1006 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThanOrEqualTo(String value) {
/* 1010 */       addCriterion("LIMIT_ID >=", value, "limitId");
/* 1011 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThan(String value) {
/* 1015 */       addCriterion("LIMIT_ID <", value, "limitId");
/* 1016 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThanOrEqualTo(String value) {
/* 1020 */       addCriterion("LIMIT_ID <=", value, "limitId");
/* 1021 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLike(String value) {
/* 1025 */       addCriterion("LIMIT_ID like", value, "limitId");
/* 1026 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotLike(String value) {
/* 1030 */       addCriterion("LIMIT_ID not like", value, "limitId");
/* 1031 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIn(List<String> values) {
/* 1035 */       addCriterion("LIMIT_ID in", values, "limitId");
/* 1036 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotIn(List<String> values) {
/* 1040 */       addCriterion("LIMIT_ID not in", values, "limitId");
/* 1041 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdBetween(String value1, String value2) {
/* 1045 */       addCriterion("LIMIT_ID between", value1, value2, "limitId");
/* 1046 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotBetween(String value1, String value2) {
/* 1050 */       addCriterion("LIMIT_ID not between", value1, value2, "limitId");
/* 1051 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdIsNull() {
/* 1055 */       addCriterion("IS_TD is null");
/* 1056 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdIsNotNull() {
/* 1060 */       addCriterion("IS_TD is not null");
/* 1061 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdEqualTo(Long value) {
/* 1065 */       addCriterion("IS_TD =", value, "isTd");
/* 1066 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdNotEqualTo(Long value) {
/* 1070 */       addCriterion("IS_TD <>", value, "isTd");
/* 1071 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdGreaterThan(Long value) {
/* 1075 */       addCriterion("IS_TD >", value, "isTd");
/* 1076 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdGreaterThanOrEqualTo(Long value) {
/* 1080 */       addCriterion("IS_TD >=", value, "isTd");
/* 1081 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdLessThan(Long value) {
/* 1085 */       addCriterion("IS_TD <", value, "isTd");
/* 1086 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdLessThanOrEqualTo(Long value) {
/* 1090 */       addCriterion("IS_TD <=", value, "isTd");
/* 1091 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdIn(List<Long> values) {
/* 1095 */       addCriterion("IS_TD in", values, "isTd");
/* 1096 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdNotIn(List<Long> values) {
/* 1100 */       addCriterion("IS_TD not in", values, "isTd");
/* 1101 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdBetween(Long value1, Long value2) {
/* 1105 */       addCriterion("IS_TD between", value1, value2, "isTd");
/* 1106 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIsTdNotBetween(Long value1, Long value2) {
/* 1110 */       addCriterion("IS_TD not between", value1, value2, "isTd");
/* 1111 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateIsNull() {
/* 1115 */       addCriterion("TD_DATE is null");
/* 1116 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateIsNotNull() {
/* 1120 */       addCriterion("TD_DATE is not null");
/* 1121 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateEqualTo(Date value) {
/* 1125 */       addCriterion("TD_DATE =", value, "tdDate");
/* 1126 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateNotEqualTo(Date value) {
/* 1130 */       addCriterion("TD_DATE <>", value, "tdDate");
/* 1131 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateGreaterThan(Date value) {
/* 1135 */       addCriterion("TD_DATE >", value, "tdDate");
/* 1136 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateGreaterThanOrEqualTo(Date value) {
/* 1140 */       addCriterion("TD_DATE >=", value, "tdDate");
/* 1141 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateLessThan(Date value) {
/* 1145 */       addCriterion("TD_DATE <", value, "tdDate");
/* 1146 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateLessThanOrEqualTo(Date value) {
/* 1150 */       addCriterion("TD_DATE <=", value, "tdDate");
/* 1151 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateIn(List<Date> values) {
/* 1155 */       addCriterion("TD_DATE in", values, "tdDate");
/* 1156 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateNotIn(List<Date> values) {
/* 1160 */       addCriterion("TD_DATE not in", values, "tdDate");
/* 1161 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateBetween(Date value1, Date value2) {
/* 1165 */       addCriterion("TD_DATE between", value1, value2, "tdDate");
/* 1166 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTdDateNotBetween(Date value1, Date value2) {
/* 1170 */       addCriterion("TD_DATE not between", value1, value2, "tdDate");
/* 1171 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIsNull() {
/* 1175 */       addCriterion("PROVINCE_ID is null");
/* 1176 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIsNotNull() {
/* 1180 */       addCriterion("PROVINCE_ID is not null");
/* 1181 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdEqualTo(Long value) {
/* 1185 */       addCriterion("PROVINCE_ID =", value, "provinceId");
/* 1186 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotEqualTo(Long value) {
/* 1190 */       addCriterion("PROVINCE_ID <>", value, "provinceId");
/* 1191 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdGreaterThan(Long value) {
/* 1195 */       addCriterion("PROVINCE_ID >", value, "provinceId");
/* 1196 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdGreaterThanOrEqualTo(Long value) {
/* 1200 */       addCriterion("PROVINCE_ID >=", value, "provinceId");
/* 1201 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdLessThan(Long value) {
/* 1205 */       addCriterion("PROVINCE_ID <", value, "provinceId");
/* 1206 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdLessThanOrEqualTo(Long value) {
/* 1210 */       addCriterion("PROVINCE_ID <=", value, "provinceId");
/* 1211 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdIn(List<Long> values) {
/* 1215 */       addCriterion("PROVINCE_ID in", values, "provinceId");
/* 1216 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotIn(List<Long> values) {
/* 1220 */       addCriterion("PROVINCE_ID not in", values, "provinceId");
/* 1221 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdBetween(Long value1, Long value2) {
/* 1225 */       addCriterion("PROVINCE_ID between", value1, value2, "provinceId");
/* 1226 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIdNotBetween(Long value1, Long value2) {
/* 1230 */       addCriterion("PROVINCE_ID not between", value1, value2, "provinceId");
/* 1231 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIsNull() {
/* 1235 */       addCriterion("PROVINCE_NAME is null");
/* 1236 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIsNotNull() {
/* 1240 */       addCriterion("PROVINCE_NAME is not null");
/* 1241 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameEqualTo(String value) {
/* 1245 */       addCriterion("PROVINCE_NAME =", value, "provinceName");
/* 1246 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotEqualTo(String value) {
/* 1250 */       addCriterion("PROVINCE_NAME <>", value, "provinceName");
/* 1251 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameGreaterThan(String value) {
/* 1255 */       addCriterion("PROVINCE_NAME >", value, "provinceName");
/* 1256 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
/* 1260 */       addCriterion("PROVINCE_NAME >=", value, "provinceName");
/* 1261 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLessThan(String value) {
/* 1265 */       addCriterion("PROVINCE_NAME <", value, "provinceName");
/* 1266 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLessThanOrEqualTo(String value) {
/* 1270 */       addCriterion("PROVINCE_NAME <=", value, "provinceName");
/* 1271 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameLike(String value) {
/* 1275 */       addCriterion("PROVINCE_NAME like", value, "provinceName");
/* 1276 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotLike(String value) {
/* 1280 */       addCriterion("PROVINCE_NAME not like", value, "provinceName");
/* 1281 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameIn(List<String> values) {
/* 1285 */       addCriterion("PROVINCE_NAME in", values, "provinceName");
/* 1286 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotIn(List<String> values) {
/* 1290 */       addCriterion("PROVINCE_NAME not in", values, "provinceName");
/* 1291 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameBetween(String value1, String value2) {
/* 1295 */       addCriterion("PROVINCE_NAME between", value1, value2, "provinceName");
/* 1296 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNameNotBetween(String value1, String value2) {
/* 1300 */       addCriterion("PROVINCE_NAME not between", value1, value2, "provinceName");
/* 1301 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIsNull() {
/* 1305 */       addCriterion("CITY_CODE is null");
/* 1306 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIsNotNull() {
/* 1310 */       addCriterion("CITY_CODE is not null");
/* 1311 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeEqualTo(Long value) {
/* 1315 */       addCriterion("CITY_CODE =", value, "cityCode");
/* 1316 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotEqualTo(Long value) {
/* 1320 */       addCriterion("CITY_CODE <>", value, "cityCode");
/* 1321 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeGreaterThan(Long value) {
/* 1325 */       addCriterion("CITY_CODE >", value, "cityCode");
/* 1326 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeGreaterThanOrEqualTo(Long value) {
/* 1330 */       addCriterion("CITY_CODE >=", value, "cityCode");
/* 1331 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeLessThan(Long value) {
/* 1335 */       addCriterion("CITY_CODE <", value, "cityCode");
/* 1336 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeLessThanOrEqualTo(Long value) {
/* 1340 */       addCriterion("CITY_CODE <=", value, "cityCode");
/* 1341 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeIn(List<Long> values) {
/* 1345 */       addCriterion("CITY_CODE in", values, "cityCode");
/* 1346 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotIn(List<Long> values) {
/* 1350 */       addCriterion("CITY_CODE not in", values, "cityCode");
/* 1351 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeBetween(Long value1, Long value2) {
/* 1355 */       addCriterion("CITY_CODE between", value1, value2, "cityCode");
/* 1356 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityCodeNotBetween(Long value1, Long value2) {
/* 1360 */       addCriterion("CITY_CODE not between", value1, value2, "cityCode");
/* 1361 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIsNull() {
/* 1365 */       addCriterion("CITY_NAME is null");
/* 1366 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIsNotNull() {
/* 1370 */       addCriterion("CITY_NAME is not null");
/* 1371 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameEqualTo(String value) {
/* 1375 */       addCriterion("CITY_NAME =", value, "cityName");
/* 1376 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotEqualTo(String value) {
/* 1380 */       addCriterion("CITY_NAME <>", value, "cityName");
/* 1381 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameGreaterThan(String value) {
/* 1385 */       addCriterion("CITY_NAME >", value, "cityName");
/* 1386 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameGreaterThanOrEqualTo(String value) {
/* 1390 */       addCriterion("CITY_NAME >=", value, "cityName");
/* 1391 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLessThan(String value) {
/* 1395 */       addCriterion("CITY_NAME <", value, "cityName");
/* 1396 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLessThanOrEqualTo(String value) {
/* 1400 */       addCriterion("CITY_NAME <=", value, "cityName");
/* 1401 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameLike(String value) {
/* 1405 */       addCriterion("CITY_NAME like", value, "cityName");
/* 1406 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotLike(String value) {
/* 1410 */       addCriterion("CITY_NAME not like", value, "cityName");
/* 1411 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameIn(List<String> values) {
/* 1415 */       addCriterion("CITY_NAME in", values, "cityName");
/* 1416 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotIn(List<String> values) {
/* 1420 */       addCriterion("CITY_NAME not in", values, "cityName");
/* 1421 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameBetween(String value1, String value2) {
/* 1425 */       addCriterion("CITY_NAME between", value1, value2, "cityName");
/* 1426 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNameNotBetween(String value1, String value2) {
/* 1430 */       addCriterion("CITY_NAME not between", value1, value2, "cityName");
/* 1431 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.SmsPayOrderMonthExample
 * JD-Core Version:    0.6.2
 */
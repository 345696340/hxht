/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ public class PaymengtTraceInfoExample
/*      */ {
/*      */   private int start;
/*      */   private int limit;
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public int getStart()
/*      */   {
/*   14 */     return this.start;
/*      */   }
/*      */ 
/*      */   public void setStart(int start) {
/*   18 */     this.start = start;
/*      */   }
/*      */ 
/*      */   public int getLimit() {
/*   22 */     return this.limit;
/*      */   }
/*      */ 
/*      */   public void setLimit(int limit) {
/*   26 */     this.limit = limit;
/*      */   }
/*      */ 
/*      */   public PaymengtTraceInfoExample()
/*      */   {
/*   60 */     this.oredCriteria = new ArrayList();
/*      */   }
/*      */ 
/*      */   public void setOrderByClause(String orderByClause)
/*      */   {
/*   70 */     this.orderByClause = orderByClause;
/*      */   }
/*      */ 
/*      */   public String getOrderByClause()
/*      */   {
/*   80 */     return this.orderByClause;
/*      */   }
/*      */ 
/*      */   public void setDistinct(boolean distinct)
/*      */   {
/*   90 */     this.distinct = distinct;
/*      */   }
/*      */ 
/*      */   public boolean isDistinct()
/*      */   {
/*  100 */     return this.distinct;
/*      */   }
/*      */ 
/*      */   public List<Criteria> getOredCriteria()
/*      */   {
/*  110 */     return this.oredCriteria;
/*      */   }
/*      */ 
/*      */   public void or(Criteria criteria)
/*      */   {
/*  120 */     this.oredCriteria.add(criteria);
/*      */   }
/*      */ 
/*      */   public Criteria or()
/*      */   {
/*  130 */     Criteria criteria = createCriteriaInternal();
/*  131 */     this.oredCriteria.add(criteria);
/*  132 */     return criteria;
/*      */   }
/*      */ 
/*      */   public Criteria createCriteria()
/*      */   {
/*  142 */     Criteria criteria = createCriteriaInternal();
/*  143 */     if (this.oredCriteria.size() == 0) {
/*  144 */       this.oredCriteria.add(criteria);
/*      */     }
/*  146 */     return criteria;
/*      */   }
/*      */ 
/*      */   protected Criteria createCriteriaInternal()
/*      */   {
/*  156 */     Criteria criteria = new Criteria();
/*  157 */     return criteria;
/*      */   }
/*      */ 
/*      */   public void clear()
/*      */   {
/*  167 */     this.oredCriteria.clear();
/*  168 */     this.orderByClause = null;
/*  169 */     this.distinct = false;
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
/* 1827 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1831 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1835 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1839 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1843 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1847 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1851 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1855 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1860 */       this.condition = condition;
/* 1861 */       this.typeHandler = null;
/* 1862 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1867 */       this.condition = condition;
/* 1868 */       this.value = value;
/* 1869 */       this.typeHandler = typeHandler;
/* 1870 */       if ((value instanceof List))
/* 1871 */         this.listValue = true;
/*      */       else
/* 1873 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1878 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1883 */       this.condition = condition;
/* 1884 */       this.value = value;
/* 1885 */       this.secondValue = secondValue;
/* 1886 */       this.typeHandler = typeHandler;
/* 1887 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1891 */       this(condition, value, secondValue, null);
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
/*  183 */       this.criteria = new ArrayList();
/*      */     }
/*      */ 
/*      */     public boolean isValid() {
/*  187 */       return this.criteria.size() > 0;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getAllCriteria() {
/*  191 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     public List<Criterion> getCriteria() {
/*  195 */       return this.criteria;
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition) {
/*  199 */       if (condition == null) {
/*  200 */         throw new RuntimeException("Value for condition cannot be null");
/*      */       }
/*  202 */       this.criteria.add(new Criterion(condition));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value, String property) {
/*  206 */       if (value == null) {
/*  207 */         throw new RuntimeException("Value for " + property + " cannot be null");
/*      */       }
/*  209 */       this.criteria.add(new Criterion(condition, value));
/*      */     }
/*      */ 
/*      */     protected void addCriterion(String condition, Object value1, Object value2, String property) {
/*  213 */       if ((value1 == null) || (value2 == null)) {
/*  214 */         throw new RuntimeException("Between values for " + property + " cannot be null");
/*      */       }
/*  216 */       this.criteria.add(new Criterion(condition, value1, value2));
/*      */     }
/*      */ 
/*      */     public Criteria andIdIsNull() {
/*  220 */       addCriterion("ID is null");
/*  221 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdIsNotNull() {
/*  225 */       addCriterion("ID is not null");
/*  226 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdEqualTo(String value) {
/*  230 */       addCriterion("ID =", value, "id");
/*  231 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdNotEqualTo(String value) {
/*  235 */       addCriterion("ID <>", value, "id");
/*  236 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdGreaterThan(String value) {
/*  240 */       addCriterion("ID >", value, "id");
/*  241 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdGreaterThanOrEqualTo(String value) {
/*  245 */       addCriterion("ID >=", value, "id");
/*  246 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdLessThan(String value) {
/*  250 */       addCriterion("ID <", value, "id");
/*  251 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdLessThanOrEqualTo(String value) {
/*  255 */       addCriterion("ID <=", value, "id");
/*  256 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdLike(String value) {
/*  260 */       addCriterion("ID like", value, "id");
/*  261 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdNotLike(String value) {
/*  265 */       addCriterion("ID not like", value, "id");
/*  266 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdIn(List<String> values) {
/*  270 */       addCriterion("ID in", values, "id");
/*  271 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdNotIn(List<String> values) {
/*  275 */       addCriterion("ID not in", values, "id");
/*  276 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdBetween(String value1, String value2) {
/*  280 */       addCriterion("ID between", value1, value2, "id");
/*  281 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andIdNotBetween(String value1, String value2) {
/*  285 */       addCriterion("ID not between", value1, value2, "id");
/*  286 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdIsNull() {
/*  290 */       addCriterion("TRANSACTION_ID is null");
/*  291 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdIsNotNull() {
/*  295 */       addCriterion("TRANSACTION_ID is not null");
/*  296 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdEqualTo(String value) {
/*  300 */       addCriterion("TRANSACTION_ID =", value, "transactionId");
/*  301 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdNotEqualTo(String value) {
/*  305 */       addCriterion("TRANSACTION_ID <>", value, "transactionId");
/*  306 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdGreaterThan(String value) {
/*  310 */       addCriterion("TRANSACTION_ID >", value, "transactionId");
/*  311 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
/*  315 */       addCriterion("TRANSACTION_ID >=", value, "transactionId");
/*  316 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdLessThan(String value) {
/*  320 */       addCriterion("TRANSACTION_ID <", value, "transactionId");
/*  321 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdLessThanOrEqualTo(String value) {
/*  325 */       addCriterion("TRANSACTION_ID <=", value, "transactionId");
/*  326 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdLike(String value) {
/*  330 */       addCriterion("TRANSACTION_ID like", value, "transactionId");
/*  331 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdNotLike(String value) {
/*  335 */       addCriterion("TRANSACTION_ID not like", value, "transactionId");
/*  336 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdIn(List<String> values) {
/*  340 */       addCriterion("TRANSACTION_ID in", values, "transactionId");
/*  341 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdNotIn(List<String> values) {
/*  345 */       addCriterion("TRANSACTION_ID not in", values, "transactionId");
/*  346 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdBetween(String value1, String value2) {
/*  350 */       addCriterion("TRANSACTION_ID between", value1, value2, "transactionId");
/*  351 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTransactionIdNotBetween(String value1, String value2) {
/*  355 */       addCriterion("TRANSACTION_ID not between", value1, value2, "transactionId");
/*  356 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIsNull() {
/*  360 */       addCriterion("PROVINCE is null");
/*  361 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIsNotNull() {
/*  365 */       addCriterion("PROVINCE is not null");
/*  366 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceEqualTo(String value) {
/*  370 */       addCriterion("PROVINCE =", value, "province");
/*  371 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNotEqualTo(String value) {
/*  375 */       addCriterion("PROVINCE <>", value, "province");
/*  376 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceGreaterThan(String value) {
/*  380 */       addCriterion("PROVINCE >", value, "province");
/*  381 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceGreaterThanOrEqualTo(String value) {
/*  385 */       addCriterion("PROVINCE >=", value, "province");
/*  386 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceLessThan(String value) {
/*  390 */       addCriterion("PROVINCE <", value, "province");
/*  391 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceLessThanOrEqualTo(String value) {
/*  395 */       addCriterion("PROVINCE <=", value, "province");
/*  396 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceLike(String value) {
/*  400 */       addCriterion("PROVINCE like", value, "province");
/*  401 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNotLike(String value) {
/*  405 */       addCriterion("PROVINCE not like", value, "province");
/*  406 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceIn(List<String> values) {
/*  410 */       addCriterion("PROVINCE in", values, "province");
/*  411 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNotIn(List<String> values) {
/*  415 */       addCriterion("PROVINCE not in", values, "province");
/*  416 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceBetween(String value1, String value2) {
/*  420 */       addCriterion("PROVINCE between", value1, value2, "province");
/*  421 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProvinceNotBetween(String value1, String value2) {
/*  425 */       addCriterion("PROVINCE not between", value1, value2, "province");
/*  426 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityIsNull() {
/*  430 */       addCriterion("CITY is null");
/*  431 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityIsNotNull() {
/*  435 */       addCriterion("CITY is not null");
/*  436 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityEqualTo(String value) {
/*  440 */       addCriterion("CITY =", value, "city");
/*  441 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNotEqualTo(String value) {
/*  445 */       addCriterion("CITY <>", value, "city");
/*  446 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityGreaterThan(String value) {
/*  450 */       addCriterion("CITY >", value, "city");
/*  451 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityGreaterThanOrEqualTo(String value) {
/*  455 */       addCriterion("CITY >=", value, "city");
/*  456 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityLessThan(String value) {
/*  460 */       addCriterion("CITY <", value, "city");
/*  461 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityLessThanOrEqualTo(String value) {
/*  465 */       addCriterion("CITY <=", value, "city");
/*  466 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityLike(String value) {
/*  470 */       addCriterion("CITY like", value, "city");
/*  471 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNotLike(String value) {
/*  475 */       addCriterion("CITY not like", value, "city");
/*  476 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityIn(List<String> values) {
/*  480 */       addCriterion("CITY in", values, "city");
/*  481 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNotIn(List<String> values) {
/*  485 */       addCriterion("CITY not in", values, "city");
/*  486 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityBetween(String value1, String value2) {
/*  490 */       addCriterion("CITY between", value1, value2, "city");
/*  491 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCityNotBetween(String value1, String value2) {
/*  495 */       addCriterion("CITY not between", value1, value2, "city");
/*  496 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeIsNull() {
/*  500 */       addCriterion("FEE is null");
/*  501 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeIsNotNull() {
/*  505 */       addCriterion("FEE is not null");
/*  506 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeEqualTo(String value) {
/*  510 */       addCriterion("FEE =", value, "fee");
/*  511 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeNotEqualTo(String value) {
/*  515 */       addCriterion("FEE <>", value, "fee");
/*  516 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeGreaterThan(String value) {
/*  520 */       addCriterion("FEE >", value, "fee");
/*  521 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeGreaterThanOrEqualTo(String value) {
/*  525 */       addCriterion("FEE >=", value, "fee");
/*  526 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeLessThan(String value) {
/*  530 */       addCriterion("FEE <", value, "fee");
/*  531 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeLessThanOrEqualTo(String value) {
/*  535 */       addCriterion("FEE <=", value, "fee");
/*  536 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeLike(String value) {
/*  540 */       addCriterion("FEE like", value, "fee");
/*  541 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeNotLike(String value) {
/*  545 */       addCriterion("FEE not like", value, "fee");
/*  546 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeIn(List<String> values) {
/*  550 */       addCriterion("FEE in", values, "fee");
/*  551 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeNotIn(List<String> values) {
/*  555 */       addCriterion("FEE not in", values, "fee");
/*  556 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeBetween(String value1, String value2) {
/*  560 */       addCriterion("FEE between", value1, value2, "fee");
/*  561 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andFeeNotBetween(String value1, String value2) {
/*  565 */       addCriterion("FEE not between", value1, value2, "fee");
/*  566 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeIsNull() {
/*  570 */       addCriterion("CREATE_TIME is null");
/*  571 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeIsNotNull() {
/*  575 */       addCriterion("CREATE_TIME is not null");
/*  576 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeEqualTo(Date value) {
/*  580 */       addCriterion("CREATE_TIME =", value, "createTime");
/*  581 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeNotEqualTo(Date value) {
/*  585 */       addCriterion("CREATE_TIME <>", value, "createTime");
/*  586 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeGreaterThan(Date value) {
/*  590 */       addCriterion("CREATE_TIME >", value, "createTime");
/*  591 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
/*  595 */       addCriterion("CREATE_TIME >=", value, "createTime");
/*  596 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeLessThan(Date value) {
/*  600 */       addCriterion("CREATE_TIME <", value, "createTime");
/*  601 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
/*  605 */       addCriterion("CREATE_TIME <=", value, "createTime");
/*  606 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeIn(List<Date> values) {
/*  610 */       addCriterion("CREATE_TIME in", values, "createTime");
/*  611 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeNotIn(List<Date> values) {
/*  615 */       addCriterion("CREATE_TIME not in", values, "createTime");
/*  616 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeBetween(Date value1, Date value2) {
/*  620 */       addCriterion("CREATE_TIME between", value1, value2, "createTime");
/*  621 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
/*  625 */       addCriterion("CREATE_TIME not between", value1, value2, "createTime");
/*  626 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectIsNull() {
/*  630 */       addCriterion("SUBJECT is null");
/*  631 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectIsNotNull() {
/*  635 */       addCriterion("SUBJECT is not null");
/*  636 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectEqualTo(String value) {
/*  640 */       addCriterion("SUBJECT =", value, "subject");
/*  641 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectNotEqualTo(String value) {
/*  645 */       addCriterion("SUBJECT <>", value, "subject");
/*  646 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectGreaterThan(String value) {
/*  650 */       addCriterion("SUBJECT >", value, "subject");
/*  651 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectGreaterThanOrEqualTo(String value) {
/*  655 */       addCriterion("SUBJECT >=", value, "subject");
/*  656 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectLessThan(String value) {
/*  660 */       addCriterion("SUBJECT <", value, "subject");
/*  661 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectLessThanOrEqualTo(String value) {
/*  665 */       addCriterion("SUBJECT <=", value, "subject");
/*  666 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectLike(String value) {
/*  670 */       addCriterion("SUBJECT like", value, "subject");
/*  671 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectNotLike(String value) {
/*  675 */       addCriterion("SUBJECT not like", value, "subject");
/*  676 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectIn(List<String> values) {
/*  680 */       addCriterion("SUBJECT in", values, "subject");
/*  681 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectNotIn(List<String> values) {
/*  685 */       addCriterion("SUBJECT not in", values, "subject");
/*  686 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectBetween(String value1, String value2) {
/*  690 */       addCriterion("SUBJECT between", value1, value2, "subject");
/*  691 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSubjectNotBetween(String value1, String value2) {
/*  695 */       addCriterion("SUBJECT not between", value1, value2, "subject");
/*  696 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIsNull() {
/*  700 */       addCriterion("APPKEY is null");
/*  701 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIsNotNull() {
/*  705 */       addCriterion("APPKEY is not null");
/*  706 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyEqualTo(String value) {
/*  710 */       addCriterion("APPKEY =", value, "appkey");
/*  711 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotEqualTo(String value) {
/*  715 */       addCriterion("APPKEY <>", value, "appkey");
/*  716 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyGreaterThan(String value) {
/*  720 */       addCriterion("APPKEY >", value, "appkey");
/*  721 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
/*  725 */       addCriterion("APPKEY >=", value, "appkey");
/*  726 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLessThan(String value) {
/*  730 */       addCriterion("APPKEY <", value, "appkey");
/*  731 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLessThanOrEqualTo(String value) {
/*  735 */       addCriterion("APPKEY <=", value, "appkey");
/*  736 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyLike(String value) {
/*  740 */       addCriterion("APPKEY like", value, "appkey");
/*  741 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotLike(String value) {
/*  745 */       addCriterion("APPKEY not like", value, "appkey");
/*  746 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyIn(List<String> values) {
/*  750 */       addCriterion("APPKEY in", values, "appkey");
/*  751 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotIn(List<String> values) {
/*  755 */       addCriterion("APPKEY not in", values, "appkey");
/*  756 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyBetween(String value1, String value2) {
/*  760 */       addCriterion("APPKEY between", value1, value2, "appkey");
/*  761 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppkeyNotBetween(String value1, String value2) {
/*  765 */       addCriterion("APPKEY not between", value1, value2, "appkey");
/*  766 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameIsNull() {
/*  770 */       addCriterion("APPNAME is null");
/*  771 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameIsNotNull() {
/*  775 */       addCriterion("APPNAME is not null");
/*  776 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameEqualTo(String value) {
/*  780 */       addCriterion("APPNAME =", value, "appname");
/*  781 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameNotEqualTo(String value) {
/*  785 */       addCriterion("APPNAME <>", value, "appname");
/*  786 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameGreaterThan(String value) {
/*  790 */       addCriterion("APPNAME >", value, "appname");
/*  791 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameGreaterThanOrEqualTo(String value) {
/*  795 */       addCriterion("APPNAME >=", value, "appname");
/*  796 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameLessThan(String value) {
/*  800 */       addCriterion("APPNAME <", value, "appname");
/*  801 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameLessThanOrEqualTo(String value) {
/*  805 */       addCriterion("APPNAME <=", value, "appname");
/*  806 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameLike(String value) {
/*  810 */       addCriterion("APPNAME like", value, "appname");
/*  811 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameNotLike(String value) {
/*  815 */       addCriterion("APPNAME not like", value, "appname");
/*  816 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameIn(List<String> values) {
/*  820 */       addCriterion("APPNAME in", values, "appname");
/*  821 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameNotIn(List<String> values) {
/*  825 */       addCriterion("APPNAME not in", values, "appname");
/*  826 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameBetween(String value1, String value2) {
/*  830 */       addCriterion("APPNAME between", value1, value2, "appname");
/*  831 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAppnameNotBetween(String value1, String value2) {
/*  835 */       addCriterion("APPNAME not between", value1, value2, "appname");
/*  836 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoIsNull() {
/*  840 */       addCriterion("OUT_TRADE_NO is null");
/*  841 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoIsNotNull() {
/*  845 */       addCriterion("OUT_TRADE_NO is not null");
/*  846 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoEqualTo(String value) {
/*  850 */       addCriterion("OUT_TRADE_NO =", value, "outTradeNo");
/*  851 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoNotEqualTo(String value) {
/*  855 */       addCriterion("OUT_TRADE_NO <>", value, "outTradeNo");
/*  856 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoGreaterThan(String value) {
/*  860 */       addCriterion("OUT_TRADE_NO >", value, "outTradeNo");
/*  861 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
/*  865 */       addCriterion("OUT_TRADE_NO >=", value, "outTradeNo");
/*  866 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoLessThan(String value) {
/*  870 */       addCriterion("OUT_TRADE_NO <", value, "outTradeNo");
/*  871 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
/*  875 */       addCriterion("OUT_TRADE_NO <=", value, "outTradeNo");
/*  876 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoLike(String value) {
/*  880 */       addCriterion("OUT_TRADE_NO like", value, "outTradeNo");
/*  881 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoNotLike(String value) {
/*  885 */       addCriterion("OUT_TRADE_NO not like", value, "outTradeNo");
/*  886 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoIn(List<String> values) {
/*  890 */       addCriterion("OUT_TRADE_NO in", values, "outTradeNo");
/*  891 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoNotIn(List<String> values) {
/*  895 */       addCriterion("OUT_TRADE_NO not in", values, "outTradeNo");
/*  896 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoBetween(String value1, String value2) {
/*  900 */       addCriterion("OUT_TRADE_NO between", value1, value2, "outTradeNo");
/*  901 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOutTradeNoNotBetween(String value1, String value2) {
/*  905 */       addCriterion("OUT_TRADE_NO not between", value1, value2, "outTradeNo");
/*  906 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdIsNull() {
/*  910 */       addCriterion("PROFILE_ID is null");
/*  911 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdIsNotNull() {
/*  915 */       addCriterion("PROFILE_ID is not null");
/*  916 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdEqualTo(String value) {
/*  920 */       addCriterion("PROFILE_ID =", value, "profileId");
/*  921 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdNotEqualTo(String value) {
/*  925 */       addCriterion("PROFILE_ID <>", value, "profileId");
/*  926 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdGreaterThan(String value) {
/*  930 */       addCriterion("PROFILE_ID >", value, "profileId");
/*  931 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdGreaterThanOrEqualTo(String value) {
/*  935 */       addCriterion("PROFILE_ID >=", value, "profileId");
/*  936 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdLessThan(String value) {
/*  940 */       addCriterion("PROFILE_ID <", value, "profileId");
/*  941 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdLessThanOrEqualTo(String value) {
/*  945 */       addCriterion("PROFILE_ID <=", value, "profileId");
/*  946 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdLike(String value) {
/*  950 */       addCriterion("PROFILE_ID like", value, "profileId");
/*  951 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdNotLike(String value) {
/*  955 */       addCriterion("PROFILE_ID not like", value, "profileId");
/*  956 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdIn(List<String> values) {
/*  960 */       addCriterion("PROFILE_ID in", values, "profileId");
/*  961 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdNotIn(List<String> values) {
/*  965 */       addCriterion("PROFILE_ID not in", values, "profileId");
/*  966 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdBetween(String value1, String value2) {
/*  970 */       addCriterion("PROFILE_ID between", value1, value2, "profileId");
/*  971 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProfileIdNotBetween(String value1, String value2) {
/*  975 */       addCriterion("PROFILE_ID not between", value1, value2, "profileId");
/*  976 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeIsNull() {
/*  980 */       addCriterion("PAY_MENT_TYPE is null");
/*  981 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeIsNotNull() {
/*  985 */       addCriterion("PAY_MENT_TYPE is not null");
/*  986 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeEqualTo(String value) {
/*  990 */       addCriterion("PAY_MENT_TYPE =", value, "payMentType");
/*  991 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeNotEqualTo(String value) {
/*  995 */       addCriterion("PAY_MENT_TYPE <>", value, "payMentType");
/*  996 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeGreaterThan(String value) {
/* 1000 */       addCriterion("PAY_MENT_TYPE >", value, "payMentType");
/* 1001 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeGreaterThanOrEqualTo(String value) {
/* 1005 */       addCriterion("PAY_MENT_TYPE >=", value, "payMentType");
/* 1006 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeLessThan(String value) {
/* 1010 */       addCriterion("PAY_MENT_TYPE <", value, "payMentType");
/* 1011 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeLessThanOrEqualTo(String value) {
/* 1015 */       addCriterion("PAY_MENT_TYPE <=", value, "payMentType");
/* 1016 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeLike(String value) {
/* 1020 */       addCriterion("PAY_MENT_TYPE like", value, "payMentType");
/* 1021 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeNotLike(String value) {
/* 1025 */       addCriterion("PAY_MENT_TYPE not like", value, "payMentType");
/* 1026 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeIn(List<String> values) {
/* 1030 */       addCriterion("PAY_MENT_TYPE in", values, "payMentType");
/* 1031 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeNotIn(List<String> values) {
/* 1035 */       addCriterion("PAY_MENT_TYPE not in", values, "payMentType");
/* 1036 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeBetween(String value1, String value2) {
/* 1040 */       addCriterion("PAY_MENT_TYPE between", value1, value2, "payMentType");
/* 1041 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayMentTypeNotBetween(String value1, String value2) {
/* 1045 */       addCriterion("PAY_MENT_TYPE not between", value1, value2, "payMentType");
/* 1046 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeIsNull() {
/* 1050 */       addCriterion("TIME is null");
/* 1051 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeIsNotNull() {
/* 1055 */       addCriterion("TIME is not null");
/* 1056 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeEqualTo(String value) {
/* 1060 */       addCriterion("TIME =", value, "time");
/* 1061 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeNotEqualTo(String value) {
/* 1065 */       addCriterion("TIME <>", value, "time");
/* 1066 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeGreaterThan(String value) {
/* 1070 */       addCriterion("TIME >", value, "time");
/* 1071 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeGreaterThanOrEqualTo(String value) {
/* 1075 */       addCriterion("TIME >=", value, "time");
/* 1076 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeLessThan(String value) {
/* 1080 */       addCriterion("TIME <", value, "time");
/* 1081 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeLessThanOrEqualTo(String value) {
/* 1085 */       addCriterion("TIME <=", value, "time");
/* 1086 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeLike(String value) {
/* 1090 */       addCriterion("TIME like", value, "time");
/* 1091 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeNotLike(String value) {
/* 1095 */       addCriterion("TIME not like", value, "time");
/* 1096 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeIn(List<String> values) {
/* 1100 */       addCriterion("TIME in", values, "time");
/* 1101 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeNotIn(List<String> values) {
/* 1105 */       addCriterion("TIME not in", values, "time");
/* 1106 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeBetween(String value1, String value2) {
/* 1110 */       addCriterion("TIME between", value1, value2, "time");
/* 1111 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTimeNotBetween(String value1, String value2) {
/* 1115 */       addCriterion("TIME not between", value1, value2, "time");
/* 1116 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionIsNull() {
/* 1120 */       addCriterion("ACTION is null");
/* 1121 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionIsNotNull() {
/* 1125 */       addCriterion("ACTION is not null");
/* 1126 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionEqualTo(String value) {
/* 1130 */       addCriterion("ACTION =", value, "action");
/* 1131 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionNotEqualTo(String value) {
/* 1135 */       addCriterion("ACTION <>", value, "action");
/* 1136 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionGreaterThan(String value) {
/* 1140 */       addCriterion("ACTION >", value, "action");
/* 1141 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionGreaterThanOrEqualTo(String value) {
/* 1145 */       addCriterion("ACTION >=", value, "action");
/* 1146 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionLessThan(String value) {
/* 1150 */       addCriterion("ACTION <", value, "action");
/* 1151 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionLessThanOrEqualTo(String value) {
/* 1155 */       addCriterion("ACTION <=", value, "action");
/* 1156 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionLike(String value) {
/* 1160 */       addCriterion("ACTION like", value, "action");
/* 1161 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionNotLike(String value) {
/* 1165 */       addCriterion("ACTION not like", value, "action");
/* 1166 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionIn(List<String> values) {
/* 1170 */       addCriterion("ACTION in", values, "action");
/* 1171 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionNotIn(List<String> values) {
/* 1175 */       addCriterion("ACTION not in", values, "action");
/* 1176 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionBetween(String value1, String value2) {
/* 1180 */       addCriterion("ACTION between", value1, value2, "action");
/* 1181 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andActionNotBetween(String value1, String value2) {
/* 1185 */       addCriterion("ACTION not between", value1, value2, "action");
/* 1186 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToIsNull() {
/* 1190 */       addCriterion("SMS_FROM_TO is null");
/* 1191 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToIsNotNull() {
/* 1195 */       addCriterion("SMS_FROM_TO is not null");
/* 1196 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToEqualTo(String value) {
/* 1200 */       addCriterion("SMS_FROM_TO =", value, "smsFromTo");
/* 1201 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToNotEqualTo(String value) {
/* 1205 */       addCriterion("SMS_FROM_TO <>", value, "smsFromTo");
/* 1206 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToGreaterThan(String value) {
/* 1210 */       addCriterion("SMS_FROM_TO >", value, "smsFromTo");
/* 1211 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToGreaterThanOrEqualTo(String value) {
/* 1215 */       addCriterion("SMS_FROM_TO >=", value, "smsFromTo");
/* 1216 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToLessThan(String value) {
/* 1220 */       addCriterion("SMS_FROM_TO <", value, "smsFromTo");
/* 1221 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToLessThanOrEqualTo(String value) {
/* 1225 */       addCriterion("SMS_FROM_TO <=", value, "smsFromTo");
/* 1226 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToLike(String value) {
/* 1230 */       addCriterion("SMS_FROM_TO like", value, "smsFromTo");
/* 1231 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToNotLike(String value) {
/* 1235 */       addCriterion("SMS_FROM_TO not like", value, "smsFromTo");
/* 1236 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToIn(List<String> values) {
/* 1240 */       addCriterion("SMS_FROM_TO in", values, "smsFromTo");
/* 1241 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToNotIn(List<String> values) {
/* 1245 */       addCriterion("SMS_FROM_TO not in", values, "smsFromTo");
/* 1246 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToBetween(String value1, String value2) {
/* 1250 */       addCriterion("SMS_FROM_TO between", value1, value2, "smsFromTo");
/* 1251 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsFromToNotBetween(String value1, String value2) {
/* 1255 */       addCriterion("SMS_FROM_TO not between", value1, value2, "smsFromTo");
/* 1256 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentIsNull() {
/* 1260 */       addCriterion("SMS_CONTENT is null");
/* 1261 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentIsNotNull() {
/* 1265 */       addCriterion("SMS_CONTENT is not null");
/* 1266 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentEqualTo(String value) {
/* 1270 */       addCriterion("SMS_CONTENT =", value, "smsContent");
/* 1271 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentNotEqualTo(String value) {
/* 1275 */       addCriterion("SMS_CONTENT <>", value, "smsContent");
/* 1276 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentGreaterThan(String value) {
/* 1280 */       addCriterion("SMS_CONTENT >", value, "smsContent");
/* 1281 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentGreaterThanOrEqualTo(String value) {
/* 1285 */       addCriterion("SMS_CONTENT >=", value, "smsContent");
/* 1286 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentLessThan(String value) {
/* 1290 */       addCriterion("SMS_CONTENT <", value, "smsContent");
/* 1291 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentLessThanOrEqualTo(String value) {
/* 1295 */       addCriterion("SMS_CONTENT <=", value, "smsContent");
/* 1296 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentLike(String value) {
/* 1300 */       addCriterion("SMS_CONTENT like", value, "smsContent");
/* 1301 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentNotLike(String value) {
/* 1305 */       addCriterion("SMS_CONTENT not like", value, "smsContent");
/* 1306 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentIn(List<String> values) {
/* 1310 */       addCriterion("SMS_CONTENT in", values, "smsContent");
/* 1311 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentNotIn(List<String> values) {
/* 1315 */       addCriterion("SMS_CONTENT not in", values, "smsContent");
/* 1316 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentBetween(String value1, String value2) {
/* 1320 */       addCriterion("SMS_CONTENT between", value1, value2, "smsContent");
/* 1321 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsContentNotBetween(String value1, String value2) {
/* 1325 */       addCriterion("SMS_CONTENT not between", value1, value2, "smsContent");
/* 1326 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnIsNull() {
/* 1330 */       addCriterion("WO_PAY_RETURN is null");
/* 1331 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnIsNotNull() {
/* 1335 */       addCriterion("WO_PAY_RETURN is not null");
/* 1336 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnEqualTo(String value) {
/* 1340 */       addCriterion("WO_PAY_RETURN =", value, "woPayReturn");
/* 1341 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnNotEqualTo(String value) {
/* 1345 */       addCriterion("WO_PAY_RETURN <>", value, "woPayReturn");
/* 1346 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnGreaterThan(String value) {
/* 1350 */       addCriterion("WO_PAY_RETURN >", value, "woPayReturn");
/* 1351 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnGreaterThanOrEqualTo(String value) {
/* 1355 */       addCriterion("WO_PAY_RETURN >=", value, "woPayReturn");
/* 1356 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnLessThan(String value) {
/* 1360 */       addCriterion("WO_PAY_RETURN <", value, "woPayReturn");
/* 1361 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnLessThanOrEqualTo(String value) {
/* 1365 */       addCriterion("WO_PAY_RETURN <=", value, "woPayReturn");
/* 1366 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnLike(String value) {
/* 1370 */       addCriterion("WO_PAY_RETURN like", value, "woPayReturn");
/* 1371 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnNotLike(String value) {
/* 1375 */       addCriterion("WO_PAY_RETURN not like", value, "woPayReturn");
/* 1376 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnIn(List<String> values) {
/* 1380 */       addCriterion("WO_PAY_RETURN in", values, "woPayReturn");
/* 1381 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnNotIn(List<String> values) {
/* 1385 */       addCriterion("WO_PAY_RETURN not in", values, "woPayReturn");
/* 1386 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnBetween(String value1, String value2) {
/* 1390 */       addCriterion("WO_PAY_RETURN between", value1, value2, "woPayReturn");
/* 1391 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnNotBetween(String value1, String value2) {
/* 1395 */       addCriterion("WO_PAY_RETURN not between", value1, value2, "woPayReturn");
/* 1396 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusIsNull() {
/* 1400 */       addCriterion("PAY_STATUS is null");
/* 1401 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusIsNotNull() {
/* 1405 */       addCriterion("PAY_STATUS is not null");
/* 1406 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusEqualTo(Long value) {
/* 1410 */       addCriterion("PAY_STATUS =", value, "payStatus");
/* 1411 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusNotEqualTo(Long value) {
/* 1415 */       addCriterion("PAY_STATUS <>", value, "payStatus");
/* 1416 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusGreaterThan(Long value) {
/* 1420 */       addCriterion("PAY_STATUS >", value, "payStatus");
/* 1421 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusGreaterThanOrEqualTo(Long value) {
/* 1425 */       addCriterion("PAY_STATUS >=", value, "payStatus");
/* 1426 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusLessThan(Long value) {
/* 1430 */       addCriterion("PAY_STATUS <", value, "payStatus");
/* 1431 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusLessThanOrEqualTo(Long value) {
/* 1435 */       addCriterion("PAY_STATUS <=", value, "payStatus");
/* 1436 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusIn(List<Long> values) {
/* 1440 */       addCriterion("PAY_STATUS in", values, "payStatus");
/* 1441 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusNotIn(List<Long> values) {
/* 1445 */       addCriterion("PAY_STATUS not in", values, "payStatus");
/* 1446 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusBetween(Long value1, Long value2) {
/* 1450 */       addCriterion("PAY_STATUS between", value1, value2, "payStatus");
/* 1451 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayStatusNotBetween(Long value1, Long value2) {
/* 1455 */       addCriterion("PAY_STATUS not between", value1, value2, "payStatus");
/* 1456 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateIsNull() {
/* 1460 */       addCriterion("PAY_DATE is null");
/* 1461 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateIsNotNull() {
/* 1465 */       addCriterion("PAY_DATE is not null");
/* 1466 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateEqualTo(Date value) {
/* 1470 */       addCriterion("PAY_DATE =", value, "payDate");
/* 1471 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateNotEqualTo(Date value) {
/* 1475 */       addCriterion("PAY_DATE <>", value, "payDate");
/* 1476 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateGreaterThan(Date value) {
/* 1480 */       addCriterion("PAY_DATE >", value, "payDate");
/* 1481 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
/* 1485 */       addCriterion("PAY_DATE >=", value, "payDate");
/* 1486 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateLessThan(Date value) {
/* 1490 */       addCriterion("PAY_DATE <", value, "payDate");
/* 1491 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateLessThanOrEqualTo(Date value) {
/* 1495 */       addCriterion("PAY_DATE <=", value, "payDate");
/* 1496 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateIn(List<Date> values) {
/* 1500 */       addCriterion("PAY_DATE in", values, "payDate");
/* 1501 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateNotIn(List<Date> values) {
/* 1505 */       addCriterion("PAY_DATE not in", values, "payDate");
/* 1506 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateBetween(Date value1, Date value2) {
/* 1510 */       addCriterion("PAY_DATE between", value1, value2, "payDate");
/* 1511 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPayDateNotBetween(Date value1, Date value2) {
/* 1515 */       addCriterion("PAY_DATE not between", value1, value2, "payDate");
/* 1516 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescIsNull() {
/* 1520 */       addCriterion("WO_PAY_RETURN_DESC is null");
/* 1521 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescIsNotNull() {
/* 1525 */       addCriterion("WO_PAY_RETURN_DESC is not null");
/* 1526 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescEqualTo(String value) {
/* 1530 */       addCriterion("WO_PAY_RETURN_DESC =", value, "woPayReturnDesc");
/* 1531 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescNotEqualTo(String value) {
/* 1535 */       addCriterion("WO_PAY_RETURN_DESC <>", value, "woPayReturnDesc");
/* 1536 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescGreaterThan(String value) {
/* 1540 */       addCriterion("WO_PAY_RETURN_DESC >", value, "woPayReturnDesc");
/* 1541 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescGreaterThanOrEqualTo(String value) {
/* 1545 */       addCriterion("WO_PAY_RETURN_DESC >=", value, "woPayReturnDesc");
/* 1546 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescLessThan(String value) {
/* 1550 */       addCriterion("WO_PAY_RETURN_DESC <", value, "woPayReturnDesc");
/* 1551 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescLessThanOrEqualTo(String value) {
/* 1555 */       addCriterion("WO_PAY_RETURN_DESC <=", value, "woPayReturnDesc");
/* 1556 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescLike(String value) {
/* 1560 */       addCriterion("WO_PAY_RETURN_DESC like", value, "woPayReturnDesc");
/* 1561 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescNotLike(String value) {
/* 1565 */       addCriterion("WO_PAY_RETURN_DESC not like", value, "woPayReturnDesc");
/* 1566 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescIn(List<String> values) {
/* 1570 */       addCriterion("WO_PAY_RETURN_DESC in", values, "woPayReturnDesc");
/* 1571 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescNotIn(List<String> values) {
/* 1575 */       addCriterion("WO_PAY_RETURN_DESC not in", values, "woPayReturnDesc");
/* 1576 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescBetween(String value1, String value2) {
/* 1580 */       addCriterion("WO_PAY_RETURN_DESC between", value1, value2, "woPayReturnDesc");
/* 1581 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayReturnDescNotBetween(String value1, String value2) {
/* 1585 */       addCriterion("WO_PAY_RETURN_DESC not between", value1, value2, "woPayReturnDesc");
/* 1586 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdIsNull() {
/* 1590 */       addCriterion("GAME_ID is null");
/* 1591 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdIsNotNull() {
/* 1595 */       addCriterion("GAME_ID is not null");
/* 1596 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdEqualTo(Long value) {
/* 1600 */       addCriterion("GAME_ID =", value, "gameId");
/* 1601 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdNotEqualTo(Long value) {
/* 1605 */       addCriterion("GAME_ID <>", value, "gameId");
/* 1606 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdGreaterThan(Long value) {
/* 1610 */       addCriterion("GAME_ID >", value, "gameId");
/* 1611 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdGreaterThanOrEqualTo(Long value) {
/* 1615 */       addCriterion("GAME_ID >=", value, "gameId");
/* 1616 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdLessThan(Long value) {
/* 1620 */       addCriterion("GAME_ID <", value, "gameId");
/* 1621 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdLessThanOrEqualTo(Long value) {
/* 1625 */       addCriterion("GAME_ID <=", value, "gameId");
/* 1626 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdIn(List<Long> values) {
/* 1630 */       addCriterion("GAME_ID in", values, "gameId");
/* 1631 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdNotIn(List<Long> values) {
/* 1635 */       addCriterion("GAME_ID not in", values, "gameId");
/* 1636 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdBetween(Long value1, Long value2) {
/* 1640 */       addCriterion("GAME_ID between", value1, value2, "gameId");
/* 1641 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdNotBetween(Long value1, Long value2) {
/* 1645 */       addCriterion("GAME_ID not between", value1, value2, "gameId");
/* 1646 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtIsNull() {
/* 1650 */       addCriterion("EXT is null");
/* 1651 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtIsNotNull() {
/* 1655 */       addCriterion("EXT is not null");
/* 1656 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtEqualTo(String value) {
/* 1660 */       addCriterion("EXT =", value, "ext");
/* 1661 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtNotEqualTo(String value) {
/* 1665 */       addCriterion("EXT <>", value, "ext");
/* 1666 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtGreaterThan(String value) {
/* 1670 */       addCriterion("EXT >", value, "ext");
/* 1671 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtGreaterThanOrEqualTo(String value) {
/* 1675 */       addCriterion("EXT >=", value, "ext");
/* 1676 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtLessThan(String value) {
/* 1680 */       addCriterion("EXT <", value, "ext");
/* 1681 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtLessThanOrEqualTo(String value) {
/* 1685 */       addCriterion("EXT <=", value, "ext");
/* 1686 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtLike(String value) {
/* 1690 */       addCriterion("EXT like", value, "ext");
/* 1691 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtNotLike(String value) {
/* 1695 */       addCriterion("EXT not like", value, "ext");
/* 1696 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtIn(List<String> values) {
/* 1700 */       addCriterion("EXT in", values, "ext");
/* 1701 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtNotIn(List<String> values) {
/* 1705 */       addCriterion("EXT not in", values, "ext");
/* 1706 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtBetween(String value1, String value2) {
/* 1710 */       addCriterion("EXT between", value1, value2, "ext");
/* 1711 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExtNotBetween(String value1, String value2) {
/* 1715 */       addCriterion("EXT not between", value1, value2, "ext");
/* 1716 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileIsNull() {
/* 1720 */       addCriterion("MOBILE is null");
/* 1721 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileIsNotNull() {
/* 1725 */       addCriterion("MOBILE is not null");
/* 1726 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileEqualTo(String value) {
/* 1730 */       addCriterion("MOBILE =", value, "mobile");
/* 1731 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNotEqualTo(String value) {
/* 1735 */       addCriterion("MOBILE <>", value, "mobile");
/* 1736 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileGreaterThan(String value) {
/* 1740 */       addCriterion("MOBILE >", value, "mobile");
/* 1741 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileGreaterThanOrEqualTo(String value) {
/* 1745 */       addCriterion("MOBILE >=", value, "mobile");
/* 1746 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileLessThan(String value) {
/* 1750 */       addCriterion("MOBILE <", value, "mobile");
/* 1751 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileLessThanOrEqualTo(String value) {
/* 1755 */       addCriterion("MOBILE <=", value, "mobile");
/* 1756 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileLike(String value) {
/* 1760 */       addCriterion("MOBILE like", value, "mobile");
/* 1761 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNotLike(String value) {
/* 1765 */       addCriterion("MOBILE not like", value, "mobile");
/* 1766 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileIn(List<String> values) {
/* 1770 */       addCriterion("MOBILE in", values, "mobile");
/* 1771 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNotIn(List<String> values) {
/* 1775 */       addCriterion("MOBILE not in", values, "mobile");
/* 1776 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileBetween(String value1, String value2) {
/* 1780 */       addCriterion("MOBILE between", value1, value2, "mobile");
/* 1781 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNotBetween(String value1, String value2) {
/* 1785 */       addCriterion("MOBILE not between", value1, value2, "mobile");
/* 1786 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PaymengtTraceInfoExample
 * JD-Core Version:    0.6.2
 */
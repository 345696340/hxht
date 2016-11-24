/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ public class PayOrderGameConfigExample
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public PayOrderGameConfigExample()
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
/* 1296 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1300 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1304 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1308 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1312 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1316 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1320 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1324 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1329 */       this.condition = condition;
/* 1330 */       this.typeHandler = null;
/* 1331 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1336 */       this.condition = condition;
/* 1337 */       this.value = value;
/* 1338 */       this.typeHandler = typeHandler;
/* 1339 */       if ((value instanceof List))
/* 1340 */         this.listValue = true;
/*      */       else
/* 1342 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1347 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1352 */       this.condition = condition;
/* 1353 */       this.value = value;
/* 1354 */       this.secondValue = secondValue;
/* 1355 */       this.typeHandler = typeHandler;
/* 1356 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1360 */       this(condition, value, secondValue, null);
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
/*      */     public Criteria andSpnumberIsNull() {
/*  259 */       addCriterion("SPNUMBER is null");
/*  260 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberIsNotNull() {
/*  264 */       addCriterion("SPNUMBER is not null");
/*  265 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberEqualTo(Long value) {
/*  269 */       addCriterion("SPNUMBER =", value, "spnumber");
/*  270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberNotEqualTo(Long value) {
/*  274 */       addCriterion("SPNUMBER <>", value, "spnumber");
/*  275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberGreaterThan(Long value) {
/*  279 */       addCriterion("SPNUMBER >", value, "spnumber");
/*  280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberGreaterThanOrEqualTo(Long value) {
/*  284 */       addCriterion("SPNUMBER >=", value, "spnumber");
/*  285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberLessThan(Long value) {
/*  289 */       addCriterion("SPNUMBER <", value, "spnumber");
/*  290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberLessThanOrEqualTo(Long value) {
/*  294 */       addCriterion("SPNUMBER <=", value, "spnumber");
/*  295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberIn(List<Long> values) {
/*  299 */       addCriterion("SPNUMBER in", values, "spnumber");
/*  300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberNotIn(List<Long> values) {
/*  304 */       addCriterion("SPNUMBER not in", values, "spnumber");
/*  305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberBetween(Long value1, Long value2) {
/*  309 */       addCriterion("SPNUMBER between", value1, value2, "spnumber");
/*  310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpnumberNotBetween(Long value1, Long value2) {
/*  314 */       addCriterion("SPNUMBER not between", value1, value2, "spnumber");
/*  315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlIsNull() {
/*  319 */       addCriterion("MO_URL is null");
/*  320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlIsNotNull() {
/*  324 */       addCriterion("MO_URL is not null");
/*  325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlEqualTo(String value) {
/*  329 */       addCriterion("MO_URL =", value, "moUrl");
/*  330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlNotEqualTo(String value) {
/*  334 */       addCriterion("MO_URL <>", value, "moUrl");
/*  335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlGreaterThan(String value) {
/*  339 */       addCriterion("MO_URL >", value, "moUrl");
/*  340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlGreaterThanOrEqualTo(String value) {
/*  344 */       addCriterion("MO_URL >=", value, "moUrl");
/*  345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlLessThan(String value) {
/*  349 */       addCriterion("MO_URL <", value, "moUrl");
/*  350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlLessThanOrEqualTo(String value) {
/*  354 */       addCriterion("MO_URL <=", value, "moUrl");
/*  355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlLike(String value) {
/*  359 */       addCriterion("MO_URL like", value, "moUrl");
/*  360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlNotLike(String value) {
/*  364 */       addCriterion("MO_URL not like", value, "moUrl");
/*  365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlIn(List<String> values) {
/*  369 */       addCriterion("MO_URL in", values, "moUrl");
/*  370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlNotIn(List<String> values) {
/*  374 */       addCriterion("MO_URL not in", values, "moUrl");
/*  375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlBetween(String value1, String value2) {
/*  379 */       addCriterion("MO_URL between", value1, value2, "moUrl");
/*  380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoUrlNotBetween(String value1, String value2) {
/*  384 */       addCriterion("MO_URL not between", value1, value2, "moUrl");
/*  385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlIsNull() {
/*  389 */       addCriterion("MR_URL is null");
/*  390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlIsNotNull() {
/*  394 */       addCriterion("MR_URL is not null");
/*  395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlEqualTo(String value) {
/*  399 */       addCriterion("MR_URL =", value, "mrUrl");
/*  400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlNotEqualTo(String value) {
/*  404 */       addCriterion("MR_URL <>", value, "mrUrl");
/*  405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlGreaterThan(String value) {
/*  409 */       addCriterion("MR_URL >", value, "mrUrl");
/*  410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlGreaterThanOrEqualTo(String value) {
/*  414 */       addCriterion("MR_URL >=", value, "mrUrl");
/*  415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlLessThan(String value) {
/*  419 */       addCriterion("MR_URL <", value, "mrUrl");
/*  420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlLessThanOrEqualTo(String value) {
/*  424 */       addCriterion("MR_URL <=", value, "mrUrl");
/*  425 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlLike(String value) {
/*  429 */       addCriterion("MR_URL like", value, "mrUrl");
/*  430 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlNotLike(String value) {
/*  434 */       addCriterion("MR_URL not like", value, "mrUrl");
/*  435 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlIn(List<String> values) {
/*  439 */       addCriterion("MR_URL in", values, "mrUrl");
/*  440 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlNotIn(List<String> values) {
/*  444 */       addCriterion("MR_URL not in", values, "mrUrl");
/*  445 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlBetween(String value1, String value2) {
/*  449 */       addCriterion("MR_URL between", value1, value2, "mrUrl");
/*  450 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMrUrlNotBetween(String value1, String value2) {
/*  454 */       addCriterion("MR_URL not between", value1, value2, "mrUrl");
/*  455 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffIsNull() {
/*  459 */       addCriterion("OFF is null");
/*  460 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffIsNotNull() {
/*  464 */       addCriterion("OFF is not null");
/*  465 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffEqualTo(Integer value) {
/*  469 */       addCriterion("OFF =", value, "off");
/*  470 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffNotEqualTo(Integer value) {
/*  474 */       addCriterion("OFF <>", value, "off");
/*  475 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffGreaterThan(Integer value) {
/*  479 */       addCriterion("OFF >", value, "off");
/*  480 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffGreaterThanOrEqualTo(Integer value) {
/*  484 */       addCriterion("OFF >=", value, "off");
/*  485 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffLessThan(Integer value) {
/*  489 */       addCriterion("OFF <", value, "off");
/*  490 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffLessThanOrEqualTo(Integer value) {
/*  494 */       addCriterion("OFF <=", value, "off");
/*  495 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffIn(List<Integer> values) {
/*  499 */       addCriterion("OFF in", values, "off");
/*  500 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffNotIn(List<Integer> values) {
/*  504 */       addCriterion("OFF not in", values, "off");
/*  505 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffBetween(Integer value1, Integer value2) {
/*  509 */       addCriterion("OFF between", value1, value2, "off");
/*  510 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOffNotBetween(Integer value1, Integer value2) {
/*  514 */       addCriterion("OFF not between", value1, value2, "off");
/*  515 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIsNull() {
/*  519 */       addCriterion("CREATED is null");
/*  520 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIsNotNull() {
/*  524 */       addCriterion("CREATED is not null");
/*  525 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedEqualTo(Date value) {
/*  529 */       addCriterion("CREATED =", value, "created");
/*  530 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotEqualTo(Date value) {
/*  534 */       addCriterion("CREATED <>", value, "created");
/*  535 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedGreaterThan(Date value) {
/*  539 */       addCriterion("CREATED >", value, "created");
/*  540 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
/*  544 */       addCriterion("CREATED >=", value, "created");
/*  545 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedLessThan(Date value) {
/*  549 */       addCriterion("CREATED <", value, "created");
/*  550 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedLessThanOrEqualTo(Date value) {
/*  554 */       addCriterion("CREATED <=", value, "created");
/*  555 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIn(List<Date> values) {
/*  559 */       addCriterion("CREATED in", values, "created");
/*  560 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotIn(List<Date> values) {
/*  564 */       addCriterion("CREATED not in", values, "created");
/*  565 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedBetween(Date value1, Date value2) {
/*  569 */       addCriterion("CREATED between", value1, value2, "created");
/*  570 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotBetween(Date value1, Date value2) {
/*  574 */       addCriterion("CREATED not between", value1, value2, "created");
/*  575 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidIsNull() {
/*  579 */       addCriterion("CPID is null");
/*  580 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidIsNotNull() {
/*  584 */       addCriterion("CPID is not null");
/*  585 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidEqualTo(Long value) {
/*  589 */       addCriterion("CPID =", value, "cpid");
/*  590 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotEqualTo(Long value) {
/*  594 */       addCriterion("CPID <>", value, "cpid");
/*  595 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidGreaterThan(Long value) {
/*  599 */       addCriterion("CPID >", value, "cpid");
/*  600 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidGreaterThanOrEqualTo(Long value) {
/*  604 */       addCriterion("CPID >=", value, "cpid");
/*  605 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidLessThan(Long value) {
/*  609 */       addCriterion("CPID <", value, "cpid");
/*  610 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidLessThanOrEqualTo(Long value) {
/*  614 */       addCriterion("CPID <=", value, "cpid");
/*  615 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidIn(List<Long> values) {
/*  619 */       addCriterion("CPID in", values, "cpid");
/*  620 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotIn(List<Long> values) {
/*  624 */       addCriterion("CPID not in", values, "cpid");
/*  625 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidBetween(Long value1, Long value2) {
/*  629 */       addCriterion("CPID between", value1, value2, "cpid");
/*  630 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpidNotBetween(Long value1, Long value2) {
/*  634 */       addCriterion("CPID not between", value1, value2, "cpid");
/*  635 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNull() {
/*  639 */       addCriterion("CONTENT is null");
/*  640 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIsNotNull() {
/*  644 */       addCriterion("CONTENT is not null");
/*  645 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentEqualTo(String value) {
/*  649 */       addCriterion("CONTENT =", value, "content");
/*  650 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotEqualTo(String value) {
/*  654 */       addCriterion("CONTENT <>", value, "content");
/*  655 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThan(String value) {
/*  659 */       addCriterion("CONTENT >", value, "content");
/*  660 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentGreaterThanOrEqualTo(String value) {
/*  664 */       addCriterion("CONTENT >=", value, "content");
/*  665 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThan(String value) {
/*  669 */       addCriterion("CONTENT <", value, "content");
/*  670 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLessThanOrEqualTo(String value) {
/*  674 */       addCriterion("CONTENT <=", value, "content");
/*  675 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentLike(String value) {
/*  679 */       addCriterion("CONTENT like", value, "content");
/*  680 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotLike(String value) {
/*  684 */       addCriterion("CONTENT not like", value, "content");
/*  685 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentIn(List<String> values) {
/*  689 */       addCriterion("CONTENT in", values, "content");
/*  690 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotIn(List<String> values) {
/*  694 */       addCriterion("CONTENT not in", values, "content");
/*  695 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentBetween(String value1, String value2) {
/*  699 */       addCriterion("CONTENT between", value1, value2, "content");
/*  700 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNotBetween(String value1, String value2) {
/*  704 */       addCriterion("CONTENT not between", value1, value2, "content");
/*  705 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameIsNull() {
/*  709 */       addCriterion("CONTENT_NAME is null");
/*  710 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameIsNotNull() {
/*  714 */       addCriterion("CONTENT_NAME is not null");
/*  715 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameEqualTo(String value) {
/*  719 */       addCriterion("CONTENT_NAME =", value, "contentName");
/*  720 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameNotEqualTo(String value) {
/*  724 */       addCriterion("CONTENT_NAME <>", value, "contentName");
/*  725 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameGreaterThan(String value) {
/*  729 */       addCriterion("CONTENT_NAME >", value, "contentName");
/*  730 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameGreaterThanOrEqualTo(String value) {
/*  734 */       addCriterion("CONTENT_NAME >=", value, "contentName");
/*  735 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameLessThan(String value) {
/*  739 */       addCriterion("CONTENT_NAME <", value, "contentName");
/*  740 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameLessThanOrEqualTo(String value) {
/*  744 */       addCriterion("CONTENT_NAME <=", value, "contentName");
/*  745 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameLike(String value) {
/*  749 */       addCriterion("CONTENT_NAME like", value, "contentName");
/*  750 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameNotLike(String value) {
/*  754 */       addCriterion("CONTENT_NAME not like", value, "contentName");
/*  755 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameIn(List<String> values) {
/*  759 */       addCriterion("CONTENT_NAME in", values, "contentName");
/*  760 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameNotIn(List<String> values) {
/*  764 */       addCriterion("CONTENT_NAME not in", values, "contentName");
/*  765 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameBetween(String value1, String value2) {
/*  769 */       addCriterion("CONTENT_NAME between", value1, value2, "contentName");
/*  770 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andContentNameNotBetween(String value1, String value2) {
/*  774 */       addCriterion("CONTENT_NAME not between", value1, value2, "contentName");
/*  775 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeIsNull() {
/*  779 */       addCriterion("TYPE is null");
/*  780 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeIsNotNull() {
/*  784 */       addCriterion("TYPE is not null");
/*  785 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeEqualTo(Integer value) {
/*  789 */       addCriterion("TYPE =", value, "type");
/*  790 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeNotEqualTo(Integer value) {
/*  794 */       addCriterion("TYPE <>", value, "type");
/*  795 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeGreaterThan(Integer value) {
/*  799 */       addCriterion("TYPE >", value, "type");
/*  800 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
/*  804 */       addCriterion("TYPE >=", value, "type");
/*  805 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeLessThan(Integer value) {
/*  809 */       addCriterion("TYPE <", value, "type");
/*  810 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeLessThanOrEqualTo(Integer value) {
/*  814 */       addCriterion("TYPE <=", value, "type");
/*  815 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeIn(List<Integer> values) {
/*  819 */       addCriterion("TYPE in", values, "type");
/*  820 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeNotIn(List<Integer> values) {
/*  824 */       addCriterion("TYPE not in", values, "type");
/*  825 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeBetween(Integer value1, Integer value2) {
/*  829 */       addCriterion("TYPE between", value1, value2, "type");
/*  830 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andTypeNotBetween(Integer value1, Integer value2) {
/*  834 */       addCriterion("TYPE not between", value1, value2, "type");
/*  835 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentIsNull() {
/*  839 */       addCriterion("SMS_RETURN_CONTENT is null");
/*  840 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentIsNotNull() {
/*  844 */       addCriterion("SMS_RETURN_CONTENT is not null");
/*  845 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentEqualTo(String value) {
/*  849 */       addCriterion("SMS_RETURN_CONTENT =", value, "smsReturnContent");
/*  850 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentNotEqualTo(String value) {
/*  854 */       addCriterion("SMS_RETURN_CONTENT <>", value, "smsReturnContent");
/*  855 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentGreaterThan(String value) {
/*  859 */       addCriterion("SMS_RETURN_CONTENT >", value, "smsReturnContent");
/*  860 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentGreaterThanOrEqualTo(String value) {
/*  864 */       addCriterion("SMS_RETURN_CONTENT >=", value, "smsReturnContent");
/*  865 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentLessThan(String value) {
/*  869 */       addCriterion("SMS_RETURN_CONTENT <", value, "smsReturnContent");
/*  870 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentLessThanOrEqualTo(String value) {
/*  874 */       addCriterion("SMS_RETURN_CONTENT <=", value, "smsReturnContent");
/*  875 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentLike(String value) {
/*  879 */       addCriterion("SMS_RETURN_CONTENT like", value, "smsReturnContent");
/*  880 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentNotLike(String value) {
/*  884 */       addCriterion("SMS_RETURN_CONTENT not like", value, "smsReturnContent");
/*  885 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentIn(List<String> values) {
/*  889 */       addCriterion("SMS_RETURN_CONTENT in", values, "smsReturnContent");
/*  890 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentNotIn(List<String> values) {
/*  894 */       addCriterion("SMS_RETURN_CONTENT not in", values, "smsReturnContent");
/*  895 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentBetween(String value1, String value2) {
/*  899 */       addCriterion("SMS_RETURN_CONTENT between", value1, value2, "smsReturnContent");
/*  900 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSmsReturnContentNotBetween(String value1, String value2) {
/*  904 */       addCriterion("SMS_RETURN_CONTENT not between", value1, value2, "smsReturnContent");
/*  905 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNull() {
/*  909 */       addCriterion("LIMIT_ID is null");
/*  910 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNotNull() {
/*  914 */       addCriterion("LIMIT_ID is not null");
/*  915 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdEqualTo(String value) {
/*  919 */       addCriterion("LIMIT_ID =", value, "limitId");
/*  920 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotEqualTo(String value) {
/*  924 */       addCriterion("LIMIT_ID <>", value, "limitId");
/*  925 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThan(String value) {
/*  929 */       addCriterion("LIMIT_ID >", value, "limitId");
/*  930 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThanOrEqualTo(String value) {
/*  934 */       addCriterion("LIMIT_ID >=", value, "limitId");
/*  935 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThan(String value) {
/*  939 */       addCriterion("LIMIT_ID <", value, "limitId");
/*  940 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThanOrEqualTo(String value) {
/*  944 */       addCriterion("LIMIT_ID <=", value, "limitId");
/*  945 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLike(String value) {
/*  949 */       addCriterion("LIMIT_ID like", value, "limitId");
/*  950 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotLike(String value) {
/*  954 */       addCriterion("LIMIT_ID not like", value, "limitId");
/*  955 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIn(List<String> values) {
/*  959 */       addCriterion("LIMIT_ID in", values, "limitId");
/*  960 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotIn(List<String> values) {
/*  964 */       addCriterion("LIMIT_ID not in", values, "limitId");
/*  965 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdBetween(String value1, String value2) {
/*  969 */       addCriterion("LIMIT_ID between", value1, value2, "limitId");
/*  970 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotBetween(String value1, String value2) {
/*  974 */       addCriterion("LIMIT_ID not between", value1, value2, "limitId");
/*  975 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeIsNull() {
/*  979 */       addCriterion("SERVICE_TYPE is null");
/*  980 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeIsNotNull() {
/*  984 */       addCriterion("SERVICE_TYPE is not null");
/*  985 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeEqualTo(String value) {
/*  989 */       addCriterion("SERVICE_TYPE =", value, "serviceType");
/*  990 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeNotEqualTo(String value) {
/*  994 */       addCriterion("SERVICE_TYPE <>", value, "serviceType");
/*  995 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeGreaterThan(String value) {
/*  999 */       addCriterion("SERVICE_TYPE >", value, "serviceType");
/* 1000 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
/* 1004 */       addCriterion("SERVICE_TYPE >=", value, "serviceType");
/* 1005 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeLessThan(String value) {
/* 1009 */       addCriterion("SERVICE_TYPE <", value, "serviceType");
/* 1010 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeLessThanOrEqualTo(String value) {
/* 1014 */       addCriterion("SERVICE_TYPE <=", value, "serviceType");
/* 1015 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeLike(String value) {
/* 1019 */       addCriterion("SERVICE_TYPE like", value, "serviceType");
/* 1020 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeNotLike(String value) {
/* 1024 */       addCriterion("SERVICE_TYPE not like", value, "serviceType");
/* 1025 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeIn(List<String> values) {
/* 1029 */       addCriterion("SERVICE_TYPE in", values, "serviceType");
/* 1030 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeNotIn(List<String> values) {
/* 1034 */       addCriterion("SERVICE_TYPE not in", values, "serviceType");
/* 1035 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeBetween(String value1, String value2) {
/* 1039 */       addCriterion("SERVICE_TYPE between", value1, value2, "serviceType");
/* 1040 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andServiceTypeNotBetween(String value1, String value2) {
/* 1044 */       addCriterion("SERVICE_TYPE not between", value1, value2, "serviceType");
/* 1045 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIsNull() {
/* 1049 */       addCriterion("CP_CONTENT is null");
/* 1050 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIsNotNull() {
/* 1054 */       addCriterion("CP_CONTENT is not null");
/* 1055 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentEqualTo(String value) {
/* 1059 */       addCriterion("CP_CONTENT =", value, "cpContent");
/* 1060 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotEqualTo(String value) {
/* 1064 */       addCriterion("CP_CONTENT <>", value, "cpContent");
/* 1065 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentGreaterThan(String value) {
/* 1069 */       addCriterion("CP_CONTENT >", value, "cpContent");
/* 1070 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentGreaterThanOrEqualTo(String value) {
/* 1074 */       addCriterion("CP_CONTENT >=", value, "cpContent");
/* 1075 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLessThan(String value) {
/* 1079 */       addCriterion("CP_CONTENT <", value, "cpContent");
/* 1080 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLessThanOrEqualTo(String value) {
/* 1084 */       addCriterion("CP_CONTENT <=", value, "cpContent");
/* 1085 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentLike(String value) {
/* 1089 */       addCriterion("CP_CONTENT like", value, "cpContent");
/* 1090 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotLike(String value) {
/* 1094 */       addCriterion("CP_CONTENT not like", value, "cpContent");
/* 1095 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentIn(List<String> values) {
/* 1099 */       addCriterion("CP_CONTENT in", values, "cpContent");
/* 1100 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotIn(List<String> values) {
/* 1104 */       addCriterion("CP_CONTENT not in", values, "cpContent");
/* 1105 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentBetween(String value1, String value2) {
/* 1109 */       addCriterion("CP_CONTENT between", value1, value2, "cpContent");
/* 1110 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCpContentNotBetween(String value1, String value2) {
/* 1114 */       addCriterion("CP_CONTENT not between", value1, value2, "cpContent");
/* 1115 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentIsNull() {
/* 1119 */       addCriterion("SP_CONTENT is null");
/* 1120 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentIsNotNull() {
/* 1124 */       addCriterion("SP_CONTENT is not null");
/* 1125 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentEqualTo(String value) {
/* 1129 */       addCriterion("SP_CONTENT =", value, "spContent");
/* 1130 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentNotEqualTo(String value) {
/* 1134 */       addCriterion("SP_CONTENT <>", value, "spContent");
/* 1135 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentGreaterThan(String value) {
/* 1139 */       addCriterion("SP_CONTENT >", value, "spContent");
/* 1140 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentGreaterThanOrEqualTo(String value) {
/* 1144 */       addCriterion("SP_CONTENT >=", value, "spContent");
/* 1145 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentLessThan(String value) {
/* 1149 */       addCriterion("SP_CONTENT <", value, "spContent");
/* 1150 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentLessThanOrEqualTo(String value) {
/* 1154 */       addCriterion("SP_CONTENT <=", value, "spContent");
/* 1155 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentLike(String value) {
/* 1159 */       addCriterion("SP_CONTENT like", value, "spContent");
/* 1160 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentNotLike(String value) {
/* 1164 */       addCriterion("SP_CONTENT not like", value, "spContent");
/* 1165 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentIn(List<String> values) {
/* 1169 */       addCriterion("SP_CONTENT in", values, "spContent");
/* 1170 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentNotIn(List<String> values) {
/* 1174 */       addCriterion("SP_CONTENT not in", values, "spContent");
/* 1175 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentBetween(String value1, String value2) {
/* 1179 */       addCriterion("SP_CONTENT between", value1, value2, "spContent");
/* 1180 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andSpContentNotBetween(String value1, String value2) {
/* 1184 */       addCriterion("SP_CONTENT not between", value1, value2, "spContent");
/* 1185 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontIsNull() {
/* 1189 */       addCriterion("AMONT is null");
/* 1190 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontIsNotNull() {
/* 1194 */       addCriterion("AMONT is not null");
/* 1195 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontEqualTo(String value) {
/* 1199 */       addCriterion("AMONT =", value, "amont");
/* 1200 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontNotEqualTo(String value) {
/* 1204 */       addCriterion("AMONT <>", value, "amont");
/* 1205 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontGreaterThan(String value) {
/* 1209 */       addCriterion("AMONT >", value, "amont");
/* 1210 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontGreaterThanOrEqualTo(String value) {
/* 1214 */       addCriterion("AMONT >=", value, "amont");
/* 1215 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontLessThan(String value) {
/* 1219 */       addCriterion("AMONT <", value, "amont");
/* 1220 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontLessThanOrEqualTo(String value) {
/* 1224 */       addCriterion("AMONT <=", value, "amont");
/* 1225 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontLike(String value) {
/* 1229 */       addCriterion("AMONT like", value, "amont");
/* 1230 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontNotLike(String value) {
/* 1234 */       addCriterion("AMONT not like", value, "amont");
/* 1235 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontIn(List<String> values) {
/* 1239 */       addCriterion("AMONT in", values, "amont");
/* 1240 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontNotIn(List<String> values) {
/* 1244 */       addCriterion("AMONT not in", values, "amont");
/* 1245 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontBetween(String value1, String value2) {
/* 1249 */       addCriterion("AMONT between", value1, value2, "amont");
/* 1250 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andAmontNotBetween(String value1, String value2) {
/* 1254 */       addCriterion("AMONT not between", value1, value2, "amont");
/* 1255 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderGameConfigExample
 * JD-Core Version:    0.6.2
 */
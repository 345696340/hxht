/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ public class SkSmsPayOrderInfoExample
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public SkSmsPayOrderInfoExample()
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
/* 1196 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1200 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1204 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1208 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1212 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1216 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1220 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1224 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1229 */       this.condition = condition;
/* 1230 */       this.typeHandler = null;
/* 1231 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1236 */       this.condition = condition;
/* 1237 */       this.value = value;
/* 1238 */       this.typeHandler = typeHandler;
/* 1239 */       if ((value instanceof List))
/* 1240 */         this.listValue = true;
/*      */       else
/* 1242 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1247 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1252 */       this.condition = condition;
/* 1253 */       this.value = value;
/* 1254 */       this.secondValue = secondValue;
/* 1255 */       this.typeHandler = typeHandler;
/* 1256 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1260 */       this(condition, value, secondValue, null);
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
/*      */     public Criteria andMobileNumIsNull() {
/*  259 */       addCriterion("MOBILE_NUM is null");
/*  260 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumIsNotNull() {
/*  264 */       addCriterion("MOBILE_NUM is not null");
/*  265 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumEqualTo(String value) {
/*  269 */       addCriterion("MOBILE_NUM =", value, "mobileNum");
/*  270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotEqualTo(String value) {
/*  274 */       addCriterion("MOBILE_NUM <>", value, "mobileNum");
/*  275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumGreaterThan(String value) {
/*  279 */       addCriterion("MOBILE_NUM >", value, "mobileNum");
/*  280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumGreaterThanOrEqualTo(String value) {
/*  284 */       addCriterion("MOBILE_NUM >=", value, "mobileNum");
/*  285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumLessThan(String value) {
/*  289 */       addCriterion("MOBILE_NUM <", value, "mobileNum");
/*  290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumLessThanOrEqualTo(String value) {
/*  294 */       addCriterion("MOBILE_NUM <=", value, "mobileNum");
/*  295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumLike(String value) {
/*  299 */       addCriterion("MOBILE_NUM like", value, "mobileNum");
/*  300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotLike(String value) {
/*  304 */       addCriterion("MOBILE_NUM not like", value, "mobileNum");
/*  305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumIn(List<String> values) {
/*  309 */       addCriterion("MOBILE_NUM in", values, "mobileNum");
/*  310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotIn(List<String> values) {
/*  314 */       addCriterion("MOBILE_NUM not in", values, "mobileNum");
/*  315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumBetween(String value1, String value2) {
/*  319 */       addCriterion("MOBILE_NUM between", value1, value2, "mobileNum");
/*  320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMobileNumNotBetween(String value1, String value2) {
/*  324 */       addCriterion("MOBILE_NUM not between", value1, value2, "mobileNum");
/*  325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoIsNull() {
/*  329 */       addCriterion("ORDER_NO is null");
/*  330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoIsNotNull() {
/*  334 */       addCriterion("ORDER_NO is not null");
/*  335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoEqualTo(String value) {
/*  339 */       addCriterion("ORDER_NO =", value, "orderNo");
/*  340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoNotEqualTo(String value) {
/*  344 */       addCriterion("ORDER_NO <>", value, "orderNo");
/*  345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoGreaterThan(String value) {
/*  349 */       addCriterion("ORDER_NO >", value, "orderNo");
/*  350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
/*  354 */       addCriterion("ORDER_NO >=", value, "orderNo");
/*  355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoLessThan(String value) {
/*  359 */       addCriterion("ORDER_NO <", value, "orderNo");
/*  360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoLessThanOrEqualTo(String value) {
/*  364 */       addCriterion("ORDER_NO <=", value, "orderNo");
/*  365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoLike(String value) {
/*  369 */       addCriterion("ORDER_NO like", value, "orderNo");
/*  370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoNotLike(String value) {
/*  374 */       addCriterion("ORDER_NO not like", value, "orderNo");
/*  375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoIn(List<String> values) {
/*  379 */       addCriterion("ORDER_NO in", values, "orderNo");
/*  380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoNotIn(List<String> values) {
/*  384 */       addCriterion("ORDER_NO not in", values, "orderNo");
/*  385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoBetween(String value1, String value2) {
/*  389 */       addCriterion("ORDER_NO between", value1, value2, "orderNo");
/*  390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andOrderNoNotBetween(String value1, String value2) {
/*  394 */       addCriterion("ORDER_NO not between", value1, value2, "orderNo");
/*  395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgIsNull() {
/*  399 */       addCriterion("MO_MSG is null");
/*  400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgIsNotNull() {
/*  404 */       addCriterion("MO_MSG is not null");
/*  405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgEqualTo(String value) {
/*  409 */       addCriterion("MO_MSG =", value, "moMsg");
/*  410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgNotEqualTo(String value) {
/*  414 */       addCriterion("MO_MSG <>", value, "moMsg");
/*  415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgGreaterThan(String value) {
/*  419 */       addCriterion("MO_MSG >", value, "moMsg");
/*  420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgGreaterThanOrEqualTo(String value) {
/*  424 */       addCriterion("MO_MSG >=", value, "moMsg");
/*  425 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgLessThan(String value) {
/*  429 */       addCriterion("MO_MSG <", value, "moMsg");
/*  430 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgLessThanOrEqualTo(String value) {
/*  434 */       addCriterion("MO_MSG <=", value, "moMsg");
/*  435 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgLike(String value) {
/*  439 */       addCriterion("MO_MSG like", value, "moMsg");
/*  440 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgNotLike(String value) {
/*  444 */       addCriterion("MO_MSG not like", value, "moMsg");
/*  445 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgIn(List<String> values) {
/*  449 */       addCriterion("MO_MSG in", values, "moMsg");
/*  450 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgNotIn(List<String> values) {
/*  454 */       addCriterion("MO_MSG not in", values, "moMsg");
/*  455 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgBetween(String value1, String value2) {
/*  459 */       addCriterion("MO_MSG between", value1, value2, "moMsg");
/*  460 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMoMsgNotBetween(String value1, String value2) {
/*  464 */       addCriterion("MO_MSG not between", value1, value2, "moMsg");
/*  465 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeIsNull() {
/*  469 */       addCriterion("PROD_CODE is null");
/*  470 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeIsNotNull() {
/*  474 */       addCriterion("PROD_CODE is not null");
/*  475 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeEqualTo(String value) {
/*  479 */       addCriterion("PROD_CODE =", value, "prodCode");
/*  480 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeNotEqualTo(String value) {
/*  484 */       addCriterion("PROD_CODE <>", value, "prodCode");
/*  485 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeGreaterThan(String value) {
/*  489 */       addCriterion("PROD_CODE >", value, "prodCode");
/*  490 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeGreaterThanOrEqualTo(String value) {
/*  494 */       addCriterion("PROD_CODE >=", value, "prodCode");
/*  495 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeLessThan(String value) {
/*  499 */       addCriterion("PROD_CODE <", value, "prodCode");
/*  500 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeLessThanOrEqualTo(String value) {
/*  504 */       addCriterion("PROD_CODE <=", value, "prodCode");
/*  505 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeLike(String value) {
/*  509 */       addCriterion("PROD_CODE like", value, "prodCode");
/*  510 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeNotLike(String value) {
/*  514 */       addCriterion("PROD_CODE not like", value, "prodCode");
/*  515 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeIn(List<String> values) {
/*  519 */       addCriterion("PROD_CODE in", values, "prodCode");
/*  520 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeNotIn(List<String> values) {
/*  524 */       addCriterion("PROD_CODE not in", values, "prodCode");
/*  525 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeBetween(String value1, String value2) {
/*  529 */       addCriterion("PROD_CODE between", value1, value2, "prodCode");
/*  530 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andProdCodeNotBetween(String value1, String value2) {
/*  534 */       addCriterion("PROD_CODE not between", value1, value2, "prodCode");
/*  535 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultIsNull() {
/*  539 */       addCriterion("RESULT is null");
/*  540 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultIsNotNull() {
/*  544 */       addCriterion("RESULT is not null");
/*  545 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultEqualTo(String value) {
/*  549 */       addCriterion("RESULT =", value, "result");
/*  550 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultNotEqualTo(String value) {
/*  554 */       addCriterion("RESULT <>", value, "result");
/*  555 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultGreaterThan(String value) {
/*  559 */       addCriterion("RESULT >", value, "result");
/*  560 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultGreaterThanOrEqualTo(String value) {
/*  564 */       addCriterion("RESULT >=", value, "result");
/*  565 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultLessThan(String value) {
/*  569 */       addCriterion("RESULT <", value, "result");
/*  570 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultLessThanOrEqualTo(String value) {
/*  574 */       addCriterion("RESULT <=", value, "result");
/*  575 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultLike(String value) {
/*  579 */       addCriterion("RESULT like", value, "result");
/*  580 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultNotLike(String value) {
/*  584 */       addCriterion("RESULT not like", value, "result");
/*  585 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultIn(List<String> values) {
/*  589 */       addCriterion("RESULT in", values, "result");
/*  590 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultNotIn(List<String> values) {
/*  594 */       addCriterion("RESULT not in", values, "result");
/*  595 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultBetween(String value1, String value2) {
/*  599 */       addCriterion("RESULT between", value1, value2, "result");
/*  600 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResultNotBetween(String value1, String value2) {
/*  604 */       addCriterion("RESULT not between", value1, value2, "result");
/*  605 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoIsNull() {
/*  609 */       addCriterion("ERRORINFO is null");
/*  610 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoIsNotNull() {
/*  614 */       addCriterion("ERRORINFO is not null");
/*  615 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoEqualTo(String value) {
/*  619 */       addCriterion("ERRORINFO =", value, "errorinfo");
/*  620 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoNotEqualTo(String value) {
/*  624 */       addCriterion("ERRORINFO <>", value, "errorinfo");
/*  625 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoGreaterThan(String value) {
/*  629 */       addCriterion("ERRORINFO >", value, "errorinfo");
/*  630 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoGreaterThanOrEqualTo(String value) {
/*  634 */       addCriterion("ERRORINFO >=", value, "errorinfo");
/*  635 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoLessThan(String value) {
/*  639 */       addCriterion("ERRORINFO <", value, "errorinfo");
/*  640 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoLessThanOrEqualTo(String value) {
/*  644 */       addCriterion("ERRORINFO <=", value, "errorinfo");
/*  645 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoLike(String value) {
/*  649 */       addCriterion("ERRORINFO like", value, "errorinfo");
/*  650 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoNotLike(String value) {
/*  654 */       addCriterion("ERRORINFO not like", value, "errorinfo");
/*  655 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoIn(List<String> values) {
/*  659 */       addCriterion("ERRORINFO in", values, "errorinfo");
/*  660 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoNotIn(List<String> values) {
/*  664 */       addCriterion("ERRORINFO not in", values, "errorinfo");
/*  665 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoBetween(String value1, String value2) {
/*  669 */       addCriterion("ERRORINFO between", value1, value2, "errorinfo");
/*  670 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andErrorinfoNotBetween(String value1, String value2) {
/*  674 */       addCriterion("ERRORINFO not between", value1, value2, "errorinfo");
/*  675 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeIsNull() {
/*  679 */       addCriterion("EXPIRY_TIME is null");
/*  680 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeIsNotNull() {
/*  684 */       addCriterion("EXPIRY_TIME is not null");
/*  685 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeEqualTo(String value) {
/*  689 */       addCriterion("EXPIRY_TIME =", value, "expiryTime");
/*  690 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeNotEqualTo(String value) {
/*  694 */       addCriterion("EXPIRY_TIME <>", value, "expiryTime");
/*  695 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeGreaterThan(String value) {
/*  699 */       addCriterion("EXPIRY_TIME >", value, "expiryTime");
/*  700 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeGreaterThanOrEqualTo(String value) {
/*  704 */       addCriterion("EXPIRY_TIME >=", value, "expiryTime");
/*  705 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeLessThan(String value) {
/*  709 */       addCriterion("EXPIRY_TIME <", value, "expiryTime");
/*  710 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeLessThanOrEqualTo(String value) {
/*  714 */       addCriterion("EXPIRY_TIME <=", value, "expiryTime");
/*  715 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeLike(String value) {
/*  719 */       addCriterion("EXPIRY_TIME like", value, "expiryTime");
/*  720 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeNotLike(String value) {
/*  724 */       addCriterion("EXPIRY_TIME not like", value, "expiryTime");
/*  725 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeIn(List<String> values) {
/*  729 */       addCriterion("EXPIRY_TIME in", values, "expiryTime");
/*  730 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeNotIn(List<String> values) {
/*  734 */       addCriterion("EXPIRY_TIME not in", values, "expiryTime");
/*  735 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeBetween(String value1, String value2) {
/*  739 */       addCriterion("EXPIRY_TIME between", value1, value2, "expiryTime");
/*  740 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andExpiryTimeNotBetween(String value1, String value2) {
/*  744 */       addCriterion("EXPIRY_TIME not between", value1, value2, "expiryTime");
/*  745 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressIsNull() {
/*  749 */       addCriterion("MAC_ADDRESS is null");
/*  750 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressIsNotNull() {
/*  754 */       addCriterion("MAC_ADDRESS is not null");
/*  755 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressEqualTo(String value) {
/*  759 */       addCriterion("MAC_ADDRESS =", value, "macAddress");
/*  760 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressNotEqualTo(String value) {
/*  764 */       addCriterion("MAC_ADDRESS <>", value, "macAddress");
/*  765 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressGreaterThan(String value) {
/*  769 */       addCriterion("MAC_ADDRESS >", value, "macAddress");
/*  770 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressGreaterThanOrEqualTo(String value) {
/*  774 */       addCriterion("MAC_ADDRESS >=", value, "macAddress");
/*  775 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressLessThan(String value) {
/*  779 */       addCriterion("MAC_ADDRESS <", value, "macAddress");
/*  780 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressLessThanOrEqualTo(String value) {
/*  784 */       addCriterion("MAC_ADDRESS <=", value, "macAddress");
/*  785 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressLike(String value) {
/*  789 */       addCriterion("MAC_ADDRESS like", value, "macAddress");
/*  790 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressNotLike(String value) {
/*  794 */       addCriterion("MAC_ADDRESS not like", value, "macAddress");
/*  795 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressIn(List<String> values) {
/*  799 */       addCriterion("MAC_ADDRESS in", values, "macAddress");
/*  800 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressNotIn(List<String> values) {
/*  804 */       addCriterion("MAC_ADDRESS not in", values, "macAddress");
/*  805 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressBetween(String value1, String value2) {
/*  809 */       addCriterion("MAC_ADDRESS between", value1, value2, "macAddress");
/*  810 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andMacAddressNotBetween(String value1, String value2) {
/*  814 */       addCriterion("MAC_ADDRESS not between", value1, value2, "macAddress");
/*  815 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiIsNull() {
/*  819 */       addCriterion("IMSI is null");
/*  820 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiIsNotNull() {
/*  824 */       addCriterion("IMSI is not null");
/*  825 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiEqualTo(String value) {
/*  829 */       addCriterion("IMSI =", value, "imsi");
/*  830 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiNotEqualTo(String value) {
/*  834 */       addCriterion("IMSI <>", value, "imsi");
/*  835 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiGreaterThan(String value) {
/*  839 */       addCriterion("IMSI >", value, "imsi");
/*  840 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiGreaterThanOrEqualTo(String value) {
/*  844 */       addCriterion("IMSI >=", value, "imsi");
/*  845 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiLessThan(String value) {
/*  849 */       addCriterion("IMSI <", value, "imsi");
/*  850 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiLessThanOrEqualTo(String value) {
/*  854 */       addCriterion("IMSI <=", value, "imsi");
/*  855 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiLike(String value) {
/*  859 */       addCriterion("IMSI like", value, "imsi");
/*  860 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiNotLike(String value) {
/*  864 */       addCriterion("IMSI not like", value, "imsi");
/*  865 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiIn(List<String> values) {
/*  869 */       addCriterion("IMSI in", values, "imsi");
/*  870 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiNotIn(List<String> values) {
/*  874 */       addCriterion("IMSI not in", values, "imsi");
/*  875 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiBetween(String value1, String value2) {
/*  879 */       addCriterion("IMSI between", value1, value2, "imsi");
/*  880 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andImsiNotBetween(String value1, String value2) {
/*  884 */       addCriterion("IMSI not between", value1, value2, "imsi");
/*  885 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeIsNull() {
/*  889 */       addCriterion("CREADE is null");
/*  890 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeIsNotNull() {
/*  894 */       addCriterion("CREADE is not null");
/*  895 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeEqualTo(Date value) {
/*  899 */       addCriterion("CREADE =", value, "creade");
/*  900 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeNotEqualTo(Date value) {
/*  904 */       addCriterion("CREADE <>", value, "creade");
/*  905 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeGreaterThan(Date value) {
/*  909 */       addCriterion("CREADE >", value, "creade");
/*  910 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeGreaterThanOrEqualTo(Date value) {
/*  914 */       addCriterion("CREADE >=", value, "creade");
/*  915 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeLessThan(Date value) {
/*  919 */       addCriterion("CREADE <", value, "creade");
/*  920 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeLessThanOrEqualTo(Date value) {
/*  924 */       addCriterion("CREADE <=", value, "creade");
/*  925 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeIn(List<Date> values) {
/*  929 */       addCriterion("CREADE in", values, "creade");
/*  930 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeNotIn(List<Date> values) {
/*  934 */       addCriterion("CREADE not in", values, "creade");
/*  935 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeBetween(Date value1, Date value2) {
/*  939 */       addCriterion("CREADE between", value1, value2, "creade");
/*  940 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreadeNotBetween(Date value1, Date value2) {
/*  944 */       addCriterion("CREADE not between", value1, value2, "creade");
/*  945 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNull() {
/*  949 */       addCriterion("LIMIT_ID is null");
/*  950 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIsNotNull() {
/*  954 */       addCriterion("LIMIT_ID is not null");
/*  955 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdEqualTo(String value) {
/*  959 */       addCriterion("LIMIT_ID =", value, "limitId");
/*  960 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotEqualTo(String value) {
/*  964 */       addCriterion("LIMIT_ID <>", value, "limitId");
/*  965 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThan(String value) {
/*  969 */       addCriterion("LIMIT_ID >", value, "limitId");
/*  970 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdGreaterThanOrEqualTo(String value) {
/*  974 */       addCriterion("LIMIT_ID >=", value, "limitId");
/*  975 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThan(String value) {
/*  979 */       addCriterion("LIMIT_ID <", value, "limitId");
/*  980 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLessThanOrEqualTo(String value) {
/*  984 */       addCriterion("LIMIT_ID <=", value, "limitId");
/*  985 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdLike(String value) {
/*  989 */       addCriterion("LIMIT_ID like", value, "limitId");
/*  990 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotLike(String value) {
/*  994 */       addCriterion("LIMIT_ID not like", value, "limitId");
/*  995 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdIn(List<String> values) {
/*  999 */       addCriterion("LIMIT_ID in", values, "limitId");
/* 1000 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotIn(List<String> values) {
/* 1004 */       addCriterion("LIMIT_ID not in", values, "limitId");
/* 1005 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdBetween(String value1, String value2) {
/* 1009 */       addCriterion("LIMIT_ID between", value1, value2, "limitId");
/* 1010 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLimitIdNotBetween(String value1, String value2) {
/* 1014 */       addCriterion("LIMIT_ID not between", value1, value2, "limitId");
/* 1015 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidIsNull() {
/* 1019 */       addCriterion("LINKID is null");
/* 1020 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidIsNotNull() {
/* 1024 */       addCriterion("LINKID is not null");
/* 1025 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidEqualTo(String value) {
/* 1029 */       addCriterion("LINKID =", value, "linkid");
/* 1030 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidNotEqualTo(String value) {
/* 1034 */       addCriterion("LINKID <>", value, "linkid");
/* 1035 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidGreaterThan(String value) {
/* 1039 */       addCriterion("LINKID >", value, "linkid");
/* 1040 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidGreaterThanOrEqualTo(String value) {
/* 1044 */       addCriterion("LINKID >=", value, "linkid");
/* 1045 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidLessThan(String value) {
/* 1049 */       addCriterion("LINKID <", value, "linkid");
/* 1050 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidLessThanOrEqualTo(String value) {
/* 1054 */       addCriterion("LINKID <=", value, "linkid");
/* 1055 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidLike(String value) {
/* 1059 */       addCriterion("LINKID like", value, "linkid");
/* 1060 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidNotLike(String value) {
/* 1064 */       addCriterion("LINKID not like", value, "linkid");
/* 1065 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidIn(List<String> values) {
/* 1069 */       addCriterion("LINKID in", values, "linkid");
/* 1070 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidNotIn(List<String> values) {
/* 1074 */       addCriterion("LINKID not in", values, "linkid");
/* 1075 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidBetween(String value1, String value2) {
/* 1079 */       addCriterion("LINKID between", value1, value2, "linkid");
/* 1080 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andLinkidNotBetween(String value1, String value2) {
/* 1084 */       addCriterion("LINKID not between", value1, value2, "linkid");
/* 1085 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIsNull() {
/* 1089 */       addCriterion("STATUS is null");
/* 1090 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIsNotNull() {
/* 1094 */       addCriterion("STATUS is not null");
/* 1095 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusEqualTo(String value) {
/* 1099 */       addCriterion("STATUS =", value, "status");
/* 1100 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotEqualTo(String value) {
/* 1104 */       addCriterion("STATUS <>", value, "status");
/* 1105 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusGreaterThan(String value) {
/* 1109 */       addCriterion("STATUS >", value, "status");
/* 1110 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusGreaterThanOrEqualTo(String value) {
/* 1114 */       addCriterion("STATUS >=", value, "status");
/* 1115 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLessThan(String value) {
/* 1119 */       addCriterion("STATUS <", value, "status");
/* 1120 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLessThanOrEqualTo(String value) {
/* 1124 */       addCriterion("STATUS <=", value, "status");
/* 1125 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusLike(String value) {
/* 1129 */       addCriterion("STATUS like", value, "status");
/* 1130 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotLike(String value) {
/* 1134 */       addCriterion("STATUS not like", value, "status");
/* 1135 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusIn(List<String> values) {
/* 1139 */       addCriterion("STATUS in", values, "status");
/* 1140 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotIn(List<String> values) {
/* 1144 */       addCriterion("STATUS not in", values, "status");
/* 1145 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusBetween(String value1, String value2) {
/* 1149 */       addCriterion("STATUS between", value1, value2, "status");
/* 1150 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andStatusNotBetween(String value1, String value2) {
/* 1154 */       addCriterion("STATUS not between", value1, value2, "status");
/* 1155 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.SkSmsPayOrderInfoExample
 * JD-Core Version:    0.6.2
 */
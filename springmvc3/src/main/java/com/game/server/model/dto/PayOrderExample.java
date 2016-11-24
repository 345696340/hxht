/*      */ package com.game.server.model.dto;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.List;
/*      */ 
/*      */ public class PayOrderExample
/*      */ {
/*      */   protected String orderByClause;
/*      */   protected boolean distinct;
/*      */   protected List<Criteria> oredCriteria;
/*      */ 
/*      */   public PayOrderExample()
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
/* 1266 */       return this.condition;
/*      */     }
/*      */ 
/*      */     public Object getValue() {
/* 1270 */       return this.value;
/*      */     }
/*      */ 
/*      */     public Object getSecondValue() {
/* 1274 */       return this.secondValue;
/*      */     }
/*      */ 
/*      */     public boolean isNoValue() {
/* 1278 */       return this.noValue;
/*      */     }
/*      */ 
/*      */     public boolean isSingleValue() {
/* 1282 */       return this.singleValue;
/*      */     }
/*      */ 
/*      */     public boolean isBetweenValue() {
/* 1286 */       return this.betweenValue;
/*      */     }
/*      */ 
/*      */     public boolean isListValue() {
/* 1290 */       return this.listValue;
/*      */     }
/*      */ 
/*      */     public String getTypeHandler() {
/* 1294 */       return this.typeHandler;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition)
/*      */     {
/* 1299 */       this.condition = condition;
/* 1300 */       this.typeHandler = null;
/* 1301 */       this.noValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, String typeHandler)
/*      */     {
/* 1306 */       this.condition = condition;
/* 1307 */       this.value = value;
/* 1308 */       this.typeHandler = typeHandler;
/* 1309 */       if ((value instanceof List))
/* 1310 */         this.listValue = true;
/*      */       else
/* 1312 */         this.singleValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value)
/*      */     {
/* 1317 */       this(condition, value, null);
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
/*      */     {
/* 1322 */       this.condition = condition;
/* 1323 */       this.value = value;
/* 1324 */       this.secondValue = secondValue;
/* 1325 */       this.typeHandler = typeHandler;
/* 1326 */       this.betweenValue = true;
/*      */     }
/*      */ 
/*      */     protected Criterion(String condition, Object value, Object secondValue) {
/* 1330 */       this(condition, value, secondValue, null);
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
/*      */     public Criteria andGameIdIsNull() {
/*  259 */       addCriterion("GAME_ID is null");
/*  260 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdIsNotNull() {
/*  264 */       addCriterion("GAME_ID is not null");
/*  265 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdEqualTo(Long value) {
/*  269 */       addCriterion("GAME_ID =", value, "gameId");
/*  270 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdNotEqualTo(Long value) {
/*  274 */       addCriterion("GAME_ID <>", value, "gameId");
/*  275 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdGreaterThan(Long value) {
/*  279 */       addCriterion("GAME_ID >", value, "gameId");
/*  280 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdGreaterThanOrEqualTo(Long value) {
/*  284 */       addCriterion("GAME_ID >=", value, "gameId");
/*  285 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdLessThan(Long value) {
/*  289 */       addCriterion("GAME_ID <", value, "gameId");
/*  290 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdLessThanOrEqualTo(Long value) {
/*  294 */       addCriterion("GAME_ID <=", value, "gameId");
/*  295 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdIn(List<Long> values) {
/*  299 */       addCriterion("GAME_ID in", values, "gameId");
/*  300 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdNotIn(List<Long> values) {
/*  304 */       addCriterion("GAME_ID not in", values, "gameId");
/*  305 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdBetween(Long value1, Long value2) {
/*  309 */       addCriterion("GAME_ID between", value1, value2, "gameId");
/*  310 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGameIdNotBetween(Long value1, Long value2) {
/*  314 */       addCriterion("GAME_ID not between", value1, value2, "gameId");
/*  315 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdIsNull() {
/*  319 */       addCriterion("USER_ID is null");
/*  320 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdIsNotNull() {
/*  324 */       addCriterion("USER_ID is not null");
/*  325 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdEqualTo(Long value) {
/*  329 */       addCriterion("USER_ID =", value, "userId");
/*  330 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdNotEqualTo(Long value) {
/*  334 */       addCriterion("USER_ID <>", value, "userId");
/*  335 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdGreaterThan(Long value) {
/*  339 */       addCriterion("USER_ID >", value, "userId");
/*  340 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
/*  344 */       addCriterion("USER_ID >=", value, "userId");
/*  345 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdLessThan(Long value) {
/*  349 */       addCriterion("USER_ID <", value, "userId");
/*  350 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdLessThanOrEqualTo(Long value) {
/*  354 */       addCriterion("USER_ID <=", value, "userId");
/*  355 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdIn(List<Long> values) {
/*  359 */       addCriterion("USER_ID in", values, "userId");
/*  360 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdNotIn(List<Long> values) {
/*  364 */       addCriterion("USER_ID not in", values, "userId");
/*  365 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdBetween(Long value1, Long value2) {
/*  369 */       addCriterion("USER_ID between", value1, value2, "userId");
/*  370 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserIdNotBetween(Long value1, Long value2) {
/*  374 */       addCriterion("USER_ID not between", value1, value2, "userId");
/*  375 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileIsNull() {
/*  379 */       addCriterion("USER_MOBILE is null");
/*  380 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileIsNotNull() {
/*  384 */       addCriterion("USER_MOBILE is not null");
/*  385 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileEqualTo(Long value) {
/*  389 */       addCriterion("USER_MOBILE =", value, "userMobile");
/*  390 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileNotEqualTo(Long value) {
/*  394 */       addCriterion("USER_MOBILE <>", value, "userMobile");
/*  395 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileGreaterThan(Long value) {
/*  399 */       addCriterion("USER_MOBILE >", value, "userMobile");
/*  400 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileGreaterThanOrEqualTo(Long value) {
/*  404 */       addCriterion("USER_MOBILE >=", value, "userMobile");
/*  405 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileLessThan(Long value) {
/*  409 */       addCriterion("USER_MOBILE <", value, "userMobile");
/*  410 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileLessThanOrEqualTo(Long value) {
/*  414 */       addCriterion("USER_MOBILE <=", value, "userMobile");
/*  415 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileIn(List<Long> values) {
/*  419 */       addCriterion("USER_MOBILE in", values, "userMobile");
/*  420 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileNotIn(List<Long> values) {
/*  424 */       addCriterion("USER_MOBILE not in", values, "userMobile");
/*  425 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileBetween(Long value1, Long value2) {
/*  429 */       addCriterion("USER_MOBILE between", value1, value2, "userMobile");
/*  430 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andUserMobileNotBetween(Long value1, Long value2) {
/*  434 */       addCriterion("USER_MOBILE not between", value1, value2, "userMobile");
/*  435 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdIsNull() {
/*  439 */       addCriterion("CHANNEL_ID is null");
/*  440 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdIsNotNull() {
/*  444 */       addCriterion("CHANNEL_ID is not null");
/*  445 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdEqualTo(Long value) {
/*  449 */       addCriterion("CHANNEL_ID =", value, "channelId");
/*  450 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdNotEqualTo(Long value) {
/*  454 */       addCriterion("CHANNEL_ID <>", value, "channelId");
/*  455 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdGreaterThan(Long value) {
/*  459 */       addCriterion("CHANNEL_ID >", value, "channelId");
/*  460 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
/*  464 */       addCriterion("CHANNEL_ID >=", value, "channelId");
/*  465 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdLessThan(Long value) {
/*  469 */       addCriterion("CHANNEL_ID <", value, "channelId");
/*  470 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdLessThanOrEqualTo(Long value) {
/*  474 */       addCriterion("CHANNEL_ID <=", value, "channelId");
/*  475 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdIn(List<Long> values) {
/*  479 */       addCriterion("CHANNEL_ID in", values, "channelId");
/*  480 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdNotIn(List<Long> values) {
/*  484 */       addCriterion("CHANNEL_ID not in", values, "channelId");
/*  485 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdBetween(Long value1, Long value2) {
/*  489 */       addCriterion("CHANNEL_ID between", value1, value2, "channelId");
/*  490 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andChannelIdNotBetween(Long value1, Long value2) {
/*  494 */       addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
/*  495 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinIsNull() {
/*  499 */       addCriterion("COIN is null");
/*  500 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinIsNotNull() {
/*  504 */       addCriterion("COIN is not null");
/*  505 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinEqualTo(Double value) {
/*  509 */       addCriterion("COIN =", value, "coin");
/*  510 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinNotEqualTo(Double value) {
/*  514 */       addCriterion("COIN <>", value, "coin");
/*  515 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinGreaterThan(Double value) {
/*  519 */       addCriterion("COIN >", value, "coin");
/*  520 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinGreaterThanOrEqualTo(Double value) {
/*  524 */       addCriterion("COIN >=", value, "coin");
/*  525 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinLessThan(Double value) {
/*  529 */       addCriterion("COIN <", value, "coin");
/*  530 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinLessThanOrEqualTo(Double value) {
/*  534 */       addCriterion("COIN <=", value, "coin");
/*  535 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinIn(List<Double> values) {
/*  539 */       addCriterion("COIN in", values, "coin");
/*  540 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinNotIn(List<Double> values) {
/*  544 */       addCriterion("COIN not in", values, "coin");
/*  545 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinBetween(Double value1, Double value2) {
/*  549 */       addCriterion("COIN between", value1, value2, "coin");
/*  550 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCoinNotBetween(Double value1, Double value2) {
/*  554 */       addCriterion("COIN not between", value1, value2, "coin");
/*  555 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultIsNull() {
/*  559 */       addCriterion("WO_PAY_RESULT is null");
/*  560 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultIsNotNull() {
/*  564 */       addCriterion("WO_PAY_RESULT is not null");
/*  565 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultEqualTo(String value) {
/*  569 */       addCriterion("WO_PAY_RESULT =", value, "woPayResult");
/*  570 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultNotEqualTo(String value) {
/*  574 */       addCriterion("WO_PAY_RESULT <>", value, "woPayResult");
/*  575 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultGreaterThan(String value) {
/*  579 */       addCriterion("WO_PAY_RESULT >", value, "woPayResult");
/*  580 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultGreaterThanOrEqualTo(String value) {
/*  584 */       addCriterion("WO_PAY_RESULT >=", value, "woPayResult");
/*  585 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultLessThan(String value) {
/*  589 */       addCriterion("WO_PAY_RESULT <", value, "woPayResult");
/*  590 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultLessThanOrEqualTo(String value) {
/*  594 */       addCriterion("WO_PAY_RESULT <=", value, "woPayResult");
/*  595 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultLike(String value) {
/*  599 */       addCriterion("WO_PAY_RESULT like", value, "woPayResult");
/*  600 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultNotLike(String value) {
/*  604 */       addCriterion("WO_PAY_RESULT not like", value, "woPayResult");
/*  605 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultIn(List<String> values) {
/*  609 */       addCriterion("WO_PAY_RESULT in", values, "woPayResult");
/*  610 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultNotIn(List<String> values) {
/*  614 */       addCriterion("WO_PAY_RESULT not in", values, "woPayResult");
/*  615 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultBetween(String value1, String value2) {
/*  619 */       addCriterion("WO_PAY_RESULT between", value1, value2, "woPayResult");
/*  620 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoPayResultNotBetween(String value1, String value2) {
/*  624 */       addCriterion("WO_PAY_RESULT not between", value1, value2, "woPayResult");
/*  625 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtIsNull() {
/*  629 */       addCriterion("GAME_PAY_EXT is null");
/*  630 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtIsNotNull() {
/*  634 */       addCriterion("GAME_PAY_EXT is not null");
/*  635 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtEqualTo(String value) {
/*  639 */       addCriterion("GAME_PAY_EXT =", value, "gamePayExt");
/*  640 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtNotEqualTo(String value) {
/*  644 */       addCriterion("GAME_PAY_EXT <>", value, "gamePayExt");
/*  645 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtGreaterThan(String value) {
/*  649 */       addCriterion("GAME_PAY_EXT >", value, "gamePayExt");
/*  650 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtGreaterThanOrEqualTo(String value) {
/*  654 */       addCriterion("GAME_PAY_EXT >=", value, "gamePayExt");
/*  655 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtLessThan(String value) {
/*  659 */       addCriterion("GAME_PAY_EXT <", value, "gamePayExt");
/*  660 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtLessThanOrEqualTo(String value) {
/*  664 */       addCriterion("GAME_PAY_EXT <=", value, "gamePayExt");
/*  665 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtLike(String value) {
/*  669 */       addCriterion("GAME_PAY_EXT like", value, "gamePayExt");
/*  670 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtNotLike(String value) {
/*  674 */       addCriterion("GAME_PAY_EXT not like", value, "gamePayExt");
/*  675 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtIn(List<String> values) {
/*  679 */       addCriterion("GAME_PAY_EXT in", values, "gamePayExt");
/*  680 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtNotIn(List<String> values) {
/*  684 */       addCriterion("GAME_PAY_EXT not in", values, "gamePayExt");
/*  685 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtBetween(String value1, String value2) {
/*  689 */       addCriterion("GAME_PAY_EXT between", value1, value2, "gamePayExt");
/*  690 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayExtNotBetween(String value1, String value2) {
/*  694 */       addCriterion("GAME_PAY_EXT not between", value1, value2, "gamePayExt");
/*  695 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultIsNull() {
/*  699 */       addCriterion("GAME_PAY_RESULT is null");
/*  700 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultIsNotNull() {
/*  704 */       addCriterion("GAME_PAY_RESULT is not null");
/*  705 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultEqualTo(String value) {
/*  709 */       addCriterion("GAME_PAY_RESULT =", value, "gamePayResult");
/*  710 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultNotEqualTo(String value) {
/*  714 */       addCriterion("GAME_PAY_RESULT <>", value, "gamePayResult");
/*  715 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultGreaterThan(String value) {
/*  719 */       addCriterion("GAME_PAY_RESULT >", value, "gamePayResult");
/*  720 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultGreaterThanOrEqualTo(String value) {
/*  724 */       addCriterion("GAME_PAY_RESULT >=", value, "gamePayResult");
/*  725 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultLessThan(String value) {
/*  729 */       addCriterion("GAME_PAY_RESULT <", value, "gamePayResult");
/*  730 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultLessThanOrEqualTo(String value) {
/*  734 */       addCriterion("GAME_PAY_RESULT <=", value, "gamePayResult");
/*  735 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultLike(String value) {
/*  739 */       addCriterion("GAME_PAY_RESULT like", value, "gamePayResult");
/*  740 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultNotLike(String value) {
/*  744 */       addCriterion("GAME_PAY_RESULT not like", value, "gamePayResult");
/*  745 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultIn(List<String> values) {
/*  749 */       addCriterion("GAME_PAY_RESULT in", values, "gamePayResult");
/*  750 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultNotIn(List<String> values) {
/*  754 */       addCriterion("GAME_PAY_RESULT not in", values, "gamePayResult");
/*  755 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultBetween(String value1, String value2) {
/*  759 */       addCriterion("GAME_PAY_RESULT between", value1, value2, "gamePayResult");
/*  760 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andGamePayResultNotBetween(String value1, String value2) {
/*  764 */       addCriterion("GAME_PAY_RESULT not between", value1, value2, "gamePayResult");
/*  765 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIsNull() {
/*  769 */       addCriterion("CREATED is null");
/*  770 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIsNotNull() {
/*  774 */       addCriterion("CREATED is not null");
/*  775 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedEqualTo(Date value) {
/*  779 */       addCriterion("CREATED =", value, "created");
/*  780 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotEqualTo(Date value) {
/*  784 */       addCriterion("CREATED <>", value, "created");
/*  785 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedGreaterThan(Date value) {
/*  789 */       addCriterion("CREATED >", value, "created");
/*  790 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
/*  794 */       addCriterion("CREATED >=", value, "created");
/*  795 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedLessThan(Date value) {
/*  799 */       addCriterion("CREATED <", value, "created");
/*  800 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedLessThanOrEqualTo(Date value) {
/*  804 */       addCriterion("CREATED <=", value, "created");
/*  805 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedIn(List<Date> values) {
/*  809 */       addCriterion("CREATED in", values, "created");
/*  810 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotIn(List<Date> values) {
/*  814 */       addCriterion("CREATED not in", values, "created");
/*  815 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedBetween(Date value1, Date value2) {
/*  819 */       addCriterion("CREATED between", value1, value2, "created");
/*  820 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCreatedNotBetween(Date value1, Date value2) {
/*  824 */       addCriterion("CREATED not between", value1, value2, "created");
/*  825 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeIsNull() {
/*  829 */       addCriterion("RES_CODE is null");
/*  830 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeIsNotNull() {
/*  834 */       addCriterion("RES_CODE is not null");
/*  835 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeEqualTo(Long value) {
/*  839 */       addCriterion("RES_CODE =", value, "resCode");
/*  840 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeNotEqualTo(Long value) {
/*  844 */       addCriterion("RES_CODE <>", value, "resCode");
/*  845 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeGreaterThan(Long value) {
/*  849 */       addCriterion("RES_CODE >", value, "resCode");
/*  850 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeGreaterThanOrEqualTo(Long value) {
/*  854 */       addCriterion("RES_CODE >=", value, "resCode");
/*  855 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeLessThan(Long value) {
/*  859 */       addCriterion("RES_CODE <", value, "resCode");
/*  860 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeLessThanOrEqualTo(Long value) {
/*  864 */       addCriterion("RES_CODE <=", value, "resCode");
/*  865 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeIn(List<Long> values) {
/*  869 */       addCriterion("RES_CODE in", values, "resCode");
/*  870 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeNotIn(List<Long> values) {
/*  874 */       addCriterion("RES_CODE not in", values, "resCode");
/*  875 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeBetween(Long value1, Long value2) {
/*  879 */       addCriterion("RES_CODE between", value1, value2, "resCode");
/*  880 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResCodeNotBetween(Long value1, Long value2) {
/*  884 */       addCriterion("RES_CODE not between", value1, value2, "resCode");
/*  885 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescIsNull() {
/*  889 */       addCriterion("RES_DESC is null");
/*  890 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescIsNotNull() {
/*  894 */       addCriterion("RES_DESC is not null");
/*  895 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescEqualTo(String value) {
/*  899 */       addCriterion("RES_DESC =", value, "resDesc");
/*  900 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescNotEqualTo(String value) {
/*  904 */       addCriterion("RES_DESC <>", value, "resDesc");
/*  905 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescGreaterThan(String value) {
/*  909 */       addCriterion("RES_DESC >", value, "resDesc");
/*  910 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescGreaterThanOrEqualTo(String value) {
/*  914 */       addCriterion("RES_DESC >=", value, "resDesc");
/*  915 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescLessThan(String value) {
/*  919 */       addCriterion("RES_DESC <", value, "resDesc");
/*  920 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescLessThanOrEqualTo(String value) {
/*  924 */       addCriterion("RES_DESC <=", value, "resDesc");
/*  925 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescLike(String value) {
/*  929 */       addCriterion("RES_DESC like", value, "resDesc");
/*  930 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescNotLike(String value) {
/*  934 */       addCriterion("RES_DESC not like", value, "resDesc");
/*  935 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescIn(List<String> values) {
/*  939 */       addCriterion("RES_DESC in", values, "resDesc");
/*  940 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescNotIn(List<String> values) {
/*  944 */       addCriterion("RES_DESC not in", values, "resDesc");
/*  945 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescBetween(String value1, String value2) {
/*  949 */       addCriterion("RES_DESC between", value1, value2, "resDesc");
/*  950 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andResDescNotBetween(String value1, String value2) {
/*  954 */       addCriterion("RES_DESC not between", value1, value2, "resDesc");
/*  955 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdIsNull() {
/*  959 */       addCriterion("WO_ORDER_ID is null");
/*  960 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdIsNotNull() {
/*  964 */       addCriterion("WO_ORDER_ID is not null");
/*  965 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdEqualTo(String value) {
/*  969 */       addCriterion("WO_ORDER_ID =", value, "woOrderId");
/*  970 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdNotEqualTo(String value) {
/*  974 */       addCriterion("WO_ORDER_ID <>", value, "woOrderId");
/*  975 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdGreaterThan(String value) {
/*  979 */       addCriterion("WO_ORDER_ID >", value, "woOrderId");
/*  980 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdGreaterThanOrEqualTo(String value) {
/*  984 */       addCriterion("WO_ORDER_ID >=", value, "woOrderId");
/*  985 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdLessThan(String value) {
/*  989 */       addCriterion("WO_ORDER_ID <", value, "woOrderId");
/*  990 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdLessThanOrEqualTo(String value) {
/*  994 */       addCriterion("WO_ORDER_ID <=", value, "woOrderId");
/*  995 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdLike(String value) {
/*  999 */       addCriterion("WO_ORDER_ID like", value, "woOrderId");
/* 1000 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdNotLike(String value) {
/* 1004 */       addCriterion("WO_ORDER_ID not like", value, "woOrderId");
/* 1005 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdIn(List<String> values) {
/* 1009 */       addCriterion("WO_ORDER_ID in", values, "woOrderId");
/* 1010 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdNotIn(List<String> values) {
/* 1014 */       addCriterion("WO_ORDER_ID not in", values, "woOrderId");
/* 1015 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdBetween(String value1, String value2) {
/* 1019 */       addCriterion("WO_ORDER_ID between", value1, value2, "woOrderId");
/* 1020 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andWoOrderIdNotBetween(String value1, String value2) {
/* 1024 */       addCriterion("WO_ORDER_ID not between", value1, value2, "woOrderId");
/* 1025 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceIsNull() {
/* 1029 */       addCriterion("PRICE is null");
/* 1030 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceIsNotNull() {
/* 1034 */       addCriterion("PRICE is not null");
/* 1035 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceEqualTo(Long value) {
/* 1039 */       addCriterion("PRICE =", value, "price");
/* 1040 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceNotEqualTo(Long value) {
/* 1044 */       addCriterion("PRICE <>", value, "price");
/* 1045 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceGreaterThan(Long value) {
/* 1049 */       addCriterion("PRICE >", value, "price");
/* 1050 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceGreaterThanOrEqualTo(Long value) {
/* 1054 */       addCriterion("PRICE >=", value, "price");
/* 1055 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceLessThan(Long value) {
/* 1059 */       addCriterion("PRICE <", value, "price");
/* 1060 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceLessThanOrEqualTo(Long value) {
/* 1064 */       addCriterion("PRICE <=", value, "price");
/* 1065 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceIn(List<Long> values) {
/* 1069 */       addCriterion("PRICE in", values, "price");
/* 1070 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceNotIn(List<Long> values) {
/* 1074 */       addCriterion("PRICE not in", values, "price");
/* 1075 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceBetween(Long value1, Long value2) {
/* 1079 */       addCriterion("PRICE between", value1, value2, "price");
/* 1080 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andPriceNotBetween(Long value1, Long value2) {
/* 1084 */       addCriterion("PRICE not between", value1, value2, "price");
/* 1085 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameIsNull() {
/* 1089 */       addCriterion("BUS_NAME is null");
/* 1090 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameIsNotNull() {
/* 1094 */       addCriterion("BUS_NAME is not null");
/* 1095 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameEqualTo(String value) {
/* 1099 */       addCriterion("BUS_NAME =", value, "busName");
/* 1100 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameNotEqualTo(String value) {
/* 1104 */       addCriterion("BUS_NAME <>", value, "busName");
/* 1105 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameGreaterThan(String value) {
/* 1109 */       addCriterion("BUS_NAME >", value, "busName");
/* 1110 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameGreaterThanOrEqualTo(String value) {
/* 1114 */       addCriterion("BUS_NAME >=", value, "busName");
/* 1115 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameLessThan(String value) {
/* 1119 */       addCriterion("BUS_NAME <", value, "busName");
/* 1120 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameLessThanOrEqualTo(String value) {
/* 1124 */       addCriterion("BUS_NAME <=", value, "busName");
/* 1125 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameLike(String value) {
/* 1129 */       addCriterion("BUS_NAME like", value, "busName");
/* 1130 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameNotLike(String value) {
/* 1134 */       addCriterion("BUS_NAME not like", value, "busName");
/* 1135 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameIn(List<String> values) {
/* 1139 */       addCriterion("BUS_NAME in", values, "busName");
/* 1140 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameNotIn(List<String> values) {
/* 1144 */       addCriterion("BUS_NAME not in", values, "busName");
/* 1145 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameBetween(String value1, String value2) {
/* 1149 */       addCriterion("BUS_NAME between", value1, value2, "busName");
/* 1150 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andBusNameNotBetween(String value1, String value2) {
/* 1154 */       addCriterion("BUS_NAME not between", value1, value2, "busName");
/* 1155 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameIsNull() {
/* 1159 */       addCriterion("COMPANY_NAME is null");
/* 1160 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameIsNotNull() {
/* 1164 */       addCriterion("COMPANY_NAME is not null");
/* 1165 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameEqualTo(String value) {
/* 1169 */       addCriterion("COMPANY_NAME =", value, "companyName");
/* 1170 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameNotEqualTo(String value) {
/* 1174 */       addCriterion("COMPANY_NAME <>", value, "companyName");
/* 1175 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameGreaterThan(String value) {
/* 1179 */       addCriterion("COMPANY_NAME >", value, "companyName");
/* 1180 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
/* 1184 */       addCriterion("COMPANY_NAME >=", value, "companyName");
/* 1185 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameLessThan(String value) {
/* 1189 */       addCriterion("COMPANY_NAME <", value, "companyName");
/* 1190 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameLessThanOrEqualTo(String value) {
/* 1194 */       addCriterion("COMPANY_NAME <=", value, "companyName");
/* 1195 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameLike(String value) {
/* 1199 */       addCriterion("COMPANY_NAME like", value, "companyName");
/* 1200 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameNotLike(String value) {
/* 1204 */       addCriterion("COMPANY_NAME not like", value, "companyName");
/* 1205 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameIn(List<String> values) {
/* 1209 */       addCriterion("COMPANY_NAME in", values, "companyName");
/* 1210 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameNotIn(List<String> values) {
/* 1214 */       addCriterion("COMPANY_NAME not in", values, "companyName");
/* 1215 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameBetween(String value1, String value2) {
/* 1219 */       addCriterion("COMPANY_NAME between", value1, value2, "companyName");
/* 1220 */       return (Criteria)this;
/*      */     }
/*      */ 
/*      */     public Criteria andCompanyNameNotBetween(String value1, String value2) {
/* 1224 */       addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
/* 1225 */       return (Criteria)this;
/*      */     }
/*      */   }
/*      */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.PayOrderExample
 * JD-Core Version:    0.6.2
 */
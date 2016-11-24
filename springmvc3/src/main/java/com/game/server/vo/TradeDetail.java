/*     */ package com.game.server.vo;
/*     */ 
/*     */ import com.thoughtworks.xstream.annotations.XStreamAlias;
/*     */ 
/*     */ @XStreamAlias("TRANS_DETAIL")
/*     */ public class TradeDetail
/*     */ {
/*     */   String PARTNER_TRADE_NO;
/*     */   String PAYEE_PARTNER_ACCT_ID;
/*     */   String PAYEE_PARTNER_ACCT_NAME;
/*     */   String PAYEE_CARD_TYPE;
/*     */   String PAYEE_CARD_NO;
/*     */   String PAYEE_BANK_CODE;
/*     */   String PAYEE_CARD_NAME;
/*     */   String PAYEE_CERT_TYPE;
/*     */   String PAYEE_CERT_CODE;
/*     */   String PAY_AMOUNT;
/*     */   String DETAIL_REMARK;
/*     */   String TRADE_RESERVED_FIELD1;
/*     */   String TRADE_RESERVED_FIELD2;
/*     */   String TRADE_RESERVED_FIELD3;
/*     */   String TRADE_RESERVED_FIELD4;
/*     */   String TRADE_RESERVED_FIELD5;
/*     */ 
/*     */   public String getPARTNER_TRADE_NO()
/*     */   {
/*  44 */     return this.PARTNER_TRADE_NO;
/*     */   }
/*     */ 
/*     */   public void setPARTNER_TRADE_NO(String PARTNER_TRADE_NO) {
/*  48 */     this.PARTNER_TRADE_NO = PARTNER_TRADE_NO;
/*     */   }
/*     */ 
/*     */   public String getPAYEE_PARTNER_ACCT_ID() {
/*  52 */     return this.PAYEE_PARTNER_ACCT_ID;
/*     */   }
/*     */ 
/*     */   public void setPAYEE_PARTNER_ACCT_ID(String PAYEE_PARTNER_ACCT_ID) {
/*  56 */     this.PAYEE_PARTNER_ACCT_ID = PAYEE_PARTNER_ACCT_ID;
/*     */   }
/*     */ 
/*     */   public String getPAYEE_PARTNER_ACCT_NAME() {
/*  60 */     return this.PAYEE_PARTNER_ACCT_NAME;
/*     */   }
/*     */ 
/*     */   public void setPAYEE_PARTNER_ACCT_NAME(String PAYEE_PARTNER_ACCT_NAME) {
/*  64 */     this.PAYEE_PARTNER_ACCT_NAME = PAYEE_PARTNER_ACCT_NAME;
/*     */   }
/*     */ 
/*     */   public String getPAYEE_CARD_TYPE() {
/*  68 */     return this.PAYEE_CARD_TYPE;
/*     */   }
/*     */ 
/*     */   public void setPAYEE_CARD_TYPE(String PAYEE_CARD_TYPE) {
/*  72 */     this.PAYEE_CARD_TYPE = PAYEE_CARD_TYPE;
/*     */   }
/*     */ 
/*     */   public String getPAYEE_CARD_NO() {
/*  76 */     return this.PAYEE_CARD_NO;
/*     */   }
/*     */ 
/*     */   public void setPAYEE_CARD_NO(String PAYEE_CARD_NO) {
/*  80 */     this.PAYEE_CARD_NO = PAYEE_CARD_NO;
/*     */   }
/*     */ 
/*     */   public String getPAYEE_BANK_CODE() {
/*  84 */     return this.PAYEE_BANK_CODE;
/*     */   }
/*     */ 
/*     */   public void setPAYEE_BANK_CODE(String PAYEE_BANK_CODE) {
/*  88 */     this.PAYEE_BANK_CODE = PAYEE_BANK_CODE;
/*     */   }
/*     */ 
/*     */   public String getPAYEE_CARD_NAME() {
/*  92 */     return this.PAYEE_CARD_NAME;
/*     */   }
/*     */ 
/*     */   public void setPAYEE_CARD_NAME(String PAYEE_CARD_NAME) {
/*  96 */     this.PAYEE_CARD_NAME = PAYEE_CARD_NAME;
/*     */   }
/*     */ 
/*     */   public String getPAYEE_CERT_TYPE() {
/* 100 */     return this.PAYEE_CERT_TYPE;
/*     */   }
/*     */ 
/*     */   public void setPAYEE_CERT_TYPE(String PAYEE_CERT_TYPE) {
/* 104 */     this.PAYEE_CERT_TYPE = PAYEE_CERT_TYPE;
/*     */   }
/*     */ 
/*     */   public String getPAYEE_CERT_CODE() {
/* 108 */     return this.PAYEE_CERT_CODE;
/*     */   }
/*     */ 
/*     */   public void setPAYEE_CERT_CODE(String PAYEE_CERT_CODE) {
/* 112 */     this.PAYEE_CERT_CODE = PAYEE_CERT_CODE;
/*     */   }
/*     */ 
/*     */   public String getPAY_AMOUNT() {
/* 116 */     return this.PAY_AMOUNT;
/*     */   }
/*     */ 
/*     */   public void setPAY_AMOUNT(String PAY_AMOUNT) {
/* 120 */     this.PAY_AMOUNT = PAY_AMOUNT;
/*     */   }
/*     */ 
/*     */   public String getDETAIL_REMARK() {
/* 124 */     return this.DETAIL_REMARK;
/*     */   }
/*     */ 
/*     */   public void setDETAIL_REMARK(String DETAIL_REMARK) {
/* 128 */     this.DETAIL_REMARK = DETAIL_REMARK;
/*     */   }
/*     */ 
/*     */   public String getTRADE_RESERVED_FIELD1() {
/* 132 */     return this.TRADE_RESERVED_FIELD1;
/*     */   }
/*     */ 
/*     */   public void setTRADE_RESERVED_FIELD1(String TRADE_RESERVED_FIELD1) {
/* 136 */     this.TRADE_RESERVED_FIELD1 = TRADE_RESERVED_FIELD1;
/*     */   }
/*     */ 
/*     */   public String getTRADE_RESERVED_FIELD2() {
/* 140 */     return this.TRADE_RESERVED_FIELD2;
/*     */   }
/*     */ 
/*     */   public void setTRADE_RESERVED_FIELD2(String TRADE_RESERVED_FIELD2) {
/* 144 */     this.TRADE_RESERVED_FIELD2 = TRADE_RESERVED_FIELD2;
/*     */   }
/*     */ 
/*     */   public String getTRADE_RESERVED_FIELD3() {
/* 148 */     return this.TRADE_RESERVED_FIELD3;
/*     */   }
/*     */ 
/*     */   public void setTRADE_RESERVED_FIELD3(String TRADE_RESERVED_FIELD3) {
/* 152 */     this.TRADE_RESERVED_FIELD3 = TRADE_RESERVED_FIELD3;
/*     */   }
/*     */ 
/*     */   public String getTRADE_RESERVED_FIELD4() {
/* 156 */     return this.TRADE_RESERVED_FIELD4;
/*     */   }
/*     */ 
/*     */   public void setTRADE_RESERVED_FIELD4(String TRADE_RESERVED_FIELD4) {
/* 160 */     this.TRADE_RESERVED_FIELD4 = TRADE_RESERVED_FIELD4;
/*     */   }
/*     */ 
/*     */   public String getTRADE_RESERVED_FIELD5() {
/* 164 */     return this.TRADE_RESERVED_FIELD5;
/*     */   }
/*     */ 
/*     */   public void setTRADE_RESERVED_FIELD5(String TRADE_RESERVED_FIELD5) {
/* 168 */     this.TRADE_RESERVED_FIELD5 = TRADE_RESERVED_FIELD5;
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.vo.TradeDetail
 * JD-Core Version:    0.6.2
 */
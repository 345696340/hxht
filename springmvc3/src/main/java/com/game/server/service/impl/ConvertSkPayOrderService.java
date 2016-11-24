/*     */ package com.game.server.service.impl;
/*     */ 
/*     */ import com.game.server.model.dto.SkPayOrderInfo;
/*     */ import com.game.server.service.ConvertService;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ public class ConvertSkPayOrderService
/*     */   implements ConvertService<String, SkPayOrderInfo>
/*     */ {
/*  14 */   public String key = "98aef17842d739d5ece751dbf6722fd0";
/*     */ 
/*     */   public SkPayOrderInfo fromTo(String s)
/*     */   {
/*  18 */     SkPayOrderInfo payOrderInfo = new SkPayOrderInfo();
/*  19 */     StringTokenizer parmter = new StringTokenizer(s, "&");
/*  20 */     while (parmter.hasMoreTokens()) {
/*  21 */       String parStr = parmter.nextToken();
/*  22 */       String[] p = parStr.split("=");
/*  23 */       if ((p[0] != null) && (p[0].equals("cpid"))) {
/*  24 */         payOrderInfo.setCpid(p[1]);
/*     */       }
/*  26 */       if ((p[0] != null) && (p[0].equals("gate"))) {
/*  27 */         payOrderInfo.setGate(p[1]);
/*     */       }
/*  29 */       if ((p[0] != null) && (p[0].equals("wo_sms"))) {
/*  30 */         payOrderInfo.setWoSms(p[1]);
/*     */       }
/*  32 */       if ((p[0] != null) && (p[0].equals("appkey"))) {
/*  33 */         payOrderInfo.setAppkey(p[1]);
/*     */       }
/*  35 */       if ((p[0] != null) && (p[0].equals("trade_type"))) {
/*  36 */         payOrderInfo.setTradeType(p[1]);
/*     */       }
/*  38 */       if ((p[0] != null) && (p[0].equals("operator"))) {
/*  39 */         payOrderInfo.setOperator(p[1]);
/*     */       }
/*  41 */       if ((p[0] != null) && (p[0].equals("mobile_num"))) {
/*  42 */         payOrderInfo.setMobileNum(p[1]);
/*     */       }
/*  44 */       if ((p[0] != null) && (p[0].equals("charge_time"))) {
/*  45 */         payOrderInfo.setChargetime(p[1]);
/*     */       }
/*  47 */       if ((p[0] != null) && (p[0].equals("content"))) {
/*  48 */         payOrderInfo.setContent(p[1]);
/*     */       }
/*  50 */       if ((p[0] != null) && (p[0].equals("motime"))) {
/*  51 */         payOrderInfo.setMotime(p[1]);
/*     */       }
/*  53 */       if ((p[0] != null) && (p[0].equals("amount"))) {
/*  54 */         payOrderInfo.setAmount(p[1]);
/*     */       }
/*  56 */       if ((p[0] != null) && (p[0].equals("zt_order_no"))) {
/*  57 */         payOrderInfo.setZtOrderNo(p[1]);
/*     */       }
/*  59 */       if ((p[0] != null) && (p[0].equals("cp_order_no"))) {
/*  60 */         payOrderInfo.setCpOrderId(p[1]);
/*     */       }
/*  62 */       if ((p[0] != null) && (p[0].equals("sign"))) {
/*  63 */         payOrderInfo.setSign(p[1]);
/*     */       }
/*  65 */       if ((p[0] != null) && (p[0].equals("status"))) {
/*  66 */         payOrderInfo.setStatus(p[1]);
/*     */       }
/*     */     }
/*  69 */     return payOrderInfo;
/*     */   }
/*     */ 
/*     */   public String toFrom(SkPayOrderInfo payOrderInfo) {
/*  73 */     StringBuffer p = new StringBuffer();
/*     */ 
/*  75 */     p.append("cpid=").append(payOrderInfo.getCpid());
/*  76 */     p.append("&wo_sms=").append(payOrderInfo.getWoSms());
/*  77 */     p.append("&appkey=").append(payOrderInfo.getAppkey());
/*  78 */     p.append("&gate=").append(payOrderInfo.getGate());
/*  79 */     p.append("&trade_type=").append(payOrderInfo.getTradeType());
/*  80 */     p.append("&operator=").append(payOrderInfo.getOperator());
/*  81 */     p.append("&mobile_num=").append(payOrderInfo.getMobileNum());
/*  82 */     p.append("&content=").append(payOrderInfo.getContent());
/*  83 */     p.append("&motime=").append(payOrderInfo.getMotime());
/*  84 */     p.append("&amount=").append(payOrderInfo.getAmount());
/*  85 */     p.append("&cp_order_no=").append(payOrderInfo.getCpOrderId());
/*  86 */     p.append(this.key);
/*  87 */     return p.toString();
/*     */   }
/*     */ 
/*     */   public String toFromVali(String cpid, String cp_order_no, String wo_sms) {
/*  91 */     StringBuffer p = new StringBuffer();
/*  92 */     p.append("cpid=").append(cpid);
/*  93 */     p.append("&cp_order_no=").append(cp_order_no);
/*  94 */     p.append("&wo_sms=").append(wo_sms);
/*     */ 
/*  96 */     return p.toString();
/*     */   }
/*     */ 
/*     */   public String toFromMr(SkPayOrderInfo payOrderInfo) {
/* 100 */     StringBuffer p = new StringBuffer();
/* 101 */     p.append("cpid=").append(payOrderInfo.getCpid());
/*     */ 
/* 103 */     p.append("&trade_type=").append(payOrderInfo.getTradeType());
/* 104 */     p.append("&operator=").append(payOrderInfo.getOperator());
/* 105 */     p.append("&charge_time=").append(payOrderInfo.getChargetime());
/* 106 */     p.append("&mobile_num=").append(payOrderInfo.getMobileNum());
/* 107 */     p.append("&zt_order_no=").append(payOrderInfo.getZtOrderNo());
/* 108 */     p.append("&cp_order_no=").append(payOrderInfo.getCpOrderId());
/* 109 */     p.append("&amount=").append(payOrderInfo.getAmount());
/* 110 */     p.append("&status=").append(payOrderInfo.getStatus());
/* 111 */     p.append(this.key);
/* 112 */     return p.toString();
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.impl.ConvertSkPayOrderService
 * JD-Core Version:    0.6.2
 */
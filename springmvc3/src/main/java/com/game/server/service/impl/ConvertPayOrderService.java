/*    */ package com.game.server.service.impl;
/*    */ 
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import com.game.server.service.ConvertService;
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ public class ConvertPayOrderService
/*    */   implements ConvertService<String, PayOrderInfo>
/*    */ {
/* 63 */   String key = "98aef17842d739d5ece751dbf6722fd0";
/*    */ 
/*    */   public PayOrderInfo fromTo(String s)
/*    */   {
/* 15 */     PayOrderInfo payOrderInfo = new PayOrderInfo();
/* 16 */     StringTokenizer parmter = new StringTokenizer(s, "&");
/* 17 */     while (parmter.hasMoreTokens()) {
/* 18 */       String parStr = parmter.nextToken();
/* 19 */       String[] p = parStr.split("=");
/* 20 */       if ((p[0] != null) && (p[0].equals("cpid"))) {
/* 21 */         payOrderInfo.setCpid(new Long(p[1]));
/*    */       }
/* 23 */       if ((p[0] != null) && (p[0].equals("gate"))) {
/* 24 */         payOrderInfo.setGate(new Long(p[1]));
/*    */       }
/* 26 */       if ((p[0] != null) && (p[0].equals("trade_type"))) {
/* 27 */         payOrderInfo.setTradeType(p[1]);
/*    */       }
/* 29 */       if ((p[0] != null) && (p[0].equals("operator"))) {
/* 30 */         payOrderInfo.setOperator(p[1]);
/*    */       }
/* 32 */       if ((p[0] != null) && (p[0].equals("mobile_num"))) {
/* 33 */         payOrderInfo.setMobileNum(new Long(p[1]));
/*    */       }
/* 35 */       if ((p[0] != null) && (p[0].equals("content"))) {
/* 36 */         payOrderInfo.setContent(p[1]);
/*    */       }
/* 38 */       if ((p[0] != null) && (p[0].equals("motime"))) {
/* 39 */         payOrderInfo.setMotime(p[1]);
/*    */       }
/* 41 */       if ((p[0] != null) && (p[0].equals("amount"))) {
/* 42 */         payOrderInfo.setAmount(new Integer(p[1]));
/*    */       }
/* 44 */       if ((p[0] != null) && (p[0].equals("cp_order_no"))) {
/* 45 */         payOrderInfo.setCpOrderNo(p[1]);
/*    */       }
/* 47 */       if ((p[0] != null) && (p[0].equals("sign"))) {
/* 48 */         payOrderInfo.setSign(p[1]);
/*    */       }
/* 50 */       if ((p[0] != null) && (p[0].equals("charge_time"))) {
/* 51 */         payOrderInfo.setChargeTime(p[1]);
/*    */       }
/* 53 */       if ((p[0] != null) && (p[0].equals("zt_order_no"))) {
/* 54 */         payOrderInfo.setZtOrderNo(p[1]);
/*    */       }
/* 56 */       if ((p[0] != null) && (p[0].equals("status"))) {
/* 57 */         payOrderInfo.setStatus(p[1]);
/*    */       }
/*    */     }
/* 60 */     return payOrderInfo;
/*    */   }
/*    */ 
/*    */   public String toFrom(PayOrderInfo payOrderInfo)
/*    */   {
/* 67 */     StringBuffer p = new StringBuffer();
/* 68 */     p.append("cpid=").append(payOrderInfo.getCpid());
/* 69 */     p.append("&gate=").append(payOrderInfo.getGate());
/* 70 */     p.append("&trade_type=").append(payOrderInfo.getTradeType());
/* 71 */     p.append("&operator=").append(payOrderInfo.getOperator());
/* 72 */     p.append("&mobile_num=").append(payOrderInfo.getMobileNum());
/* 73 */     p.append("&content=").append(payOrderInfo.getContent());
/* 74 */     p.append("&motime=").append(payOrderInfo.getMotime());
/* 75 */     p.append("&amount=").append(payOrderInfo.getAmount());
/* 76 */     p.append("&cp_order_no=").append(payOrderInfo.getCpOrderNo());
/* 77 */     p.append(this.key);
/* 78 */     return p.toString();
/*    */   }
/*    */ 
/*    */   public String toFromMr(PayOrderInfo payOrderInfo) {
/* 82 */     StringBuffer p = new StringBuffer();
/*    */ 
/* 84 */     p.append("cpid=").append(payOrderInfo.getCpid());
/* 85 */     p.append("&trade_type=").append(payOrderInfo.getTradeType());
/* 86 */     p.append("&operator=").append(payOrderInfo.getOperator());
/* 87 */     p.append("&charge_time=").append(payOrderInfo.getChargeTime());
/* 88 */     p.append("&mobile_num=").append(payOrderInfo.getMobileNum());
/* 89 */     p.append("&zt_order_no=").append(payOrderInfo.getZtOrderNo());
/* 90 */     p.append("&cp_order_no=").append(payOrderInfo.getCpOrderNo());
/* 91 */     p.append("&amount=").append(payOrderInfo.getAmount());
/* 92 */     p.append("&status=").append(payOrderInfo.getStatus());
/* 93 */     p.append(this.key);
/* 94 */     return p.toString();
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.impl.ConvertPayOrderService
 * JD-Core Version:    0.6.2
 */
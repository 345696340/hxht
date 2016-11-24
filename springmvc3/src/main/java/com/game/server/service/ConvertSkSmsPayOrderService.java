/*    */ package com.game.server.service;
/*    */ 
/*    */ import com.game.server.model.dto.SkSmsPayOrderInfo;
/*    */ import com.game.server.service.ConvertService;
/*    */ import com.game.server.util.JsonUtil;
/*    */ import java.util.HashMap;
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ public class ConvertSkSmsPayOrderService
/*    */   implements ConvertService<String, SkSmsPayOrderInfo>
/*    */ {
/*    */   public SkSmsPayOrderInfo fromTo(String s)
/*    */   {
/* 17 */     SkSmsPayOrderInfo payOrderInfo = new SkSmsPayOrderInfo();
/* 18 */     HashMap map = (HashMap)JsonUtil.json2bean(s, HashMap.class);
/* 19 */     payOrderInfo.setMobileNum((String)map.get("paymentUser"));
/* 20 */     payOrderInfo.setOrderNo((String)map.get("orderNo"));
/* 21 */     payOrderInfo.setMoMsg((String)map.get("moMsg"));
/* 22 */     payOrderInfo.setProdCode((String)map.get("prod_code"));
/* 23 */     payOrderInfo.setResult((String)map.get("ret"));
/* 24 */     payOrderInfo.setErrorinfo((String)map.get("message"));
/* 25 */     payOrderInfo.setExpiryTime((String)map.get("expiry_time"));
/* 26 */     if ((payOrderInfo.getMobileNum() == null) || (payOrderInfo.getMobileNum().equals(""))) {
/* 27 */       payOrderInfo.setMobileNum((String)map.get("mobile"));
/*    */     }
/* 29 */     return payOrderInfo;
/*    */   }
/*    */ 
/*    */   public SkSmsPayOrderInfo fromToUri(String s)
/*    */   {
/* 34 */     SkSmsPayOrderInfo payOrderInfo = new SkSmsPayOrderInfo();
/* 35 */     StringTokenizer parmter = new StringTokenizer(s, "&");
/* 36 */     while (parmter.hasMoreTokens()) {
/* 37 */       String parStr = parmter.nextToken();
/* 38 */       String[] p = parStr.split("=");
/* 39 */       if ((p[0] != null) && (p[0].equals("order_no"))) {
/* 40 */         payOrderInfo.setOrderNo(p[1]);
/*    */       }
/* 42 */       if ((p[0] != null) && (p[0].equals("prod_code"))) {
/* 43 */         payOrderInfo.setProdCode(p[1]);
/*    */       }
/* 45 */       if ((p[0] != null) && (p[0].equals("mobile"))) {
/* 46 */         payOrderInfo.setMobileNum(p[1]);
/*    */       }
/* 48 */       if ((p[0] != null) && (p[0].equals("sms_msg"))) {
/* 49 */         payOrderInfo.setMoMsg(p[1]);
/*    */       }
/* 51 */       if ((p[0] != null) && (p[0].equals("ret"))) {
/* 52 */         payOrderInfo.setStatus(p[1]);
/*    */       }
/* 54 */       if ((p[0] != null) && (p[0].equals("message"))) {
/* 55 */         payOrderInfo.setErrorinfo(p[1]);
/*    */       }
/* 57 */       if ((p[0] != null) && (p[0].equals("expiry_time"))) {
/* 58 */         payOrderInfo.setExpiryTime(p[1]);
/*    */       }
/*    */ 
/* 60 */       if ((p[0] == null) || (!p[0].equals("Sec")));
/*    */     }
/*    */ 
/* 64 */     return payOrderInfo;
/*    */   }
/*    */ 
/*    */   public String toFrom(SkSmsPayOrderInfo skSmsPayOrderInfo)
/*    */   {
/* 69 */     HashMap map = new HashMap();
/* 70 */     map.put("imsi", "");
/* 71 */     map.put("account", "");
/* 72 */     map.put("macaddr", "");
/* 73 */     if ((skSmsPayOrderInfo.getResult() != null) && (skSmsPayOrderInfo.getResult().equals("true"))) {
/* 74 */       map.put("result", Boolean.valueOf(true));
/*    */     }
/*    */     else {
/* 77 */       map.put("result", Boolean.valueOf(false));
/*    */     }
/* 79 */     return JsonUtil.bean2json(map);
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.ConvertSkSmsPayOrderService
 * JD-Core Version:    0.6.2
 */
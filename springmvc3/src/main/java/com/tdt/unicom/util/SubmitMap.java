/*    */ package com.tdt.unicom.util;
/*    */ 
/*    */ import com.game.server.model.dto.SmsPayOrder;
/*    */ import com.tdt.unicom.domains.Submit;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class SubmitMap
/*    */ {
/* 13 */   public static final HashMap<String, Submit> submitMap = new HashMap();
/*    */ 
/* 15 */   public static final HashMap<String, SmsPayOrder> smsPayOrderHashMap = new HashMap();
/*    */ 
/*    */   public static void add(String key, Submit value) {
/* 18 */     submitMap.put(key, value);
/*    */   }
/*    */ 
/*    */   public static Submit get(String key) {
/* 22 */     return (Submit)submitMap.get(key);
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.util.SubmitMap
 * JD-Core Version:    0.6.2
 */
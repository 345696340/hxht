/*    */ package com.game.server.service;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ 
/*    */ public class BaimingdanNo
/*    */ {
/* 11 */   private static final HashMap<String, String> map = new HashMap();
/*    */ 
/*    */   public static boolean getBai(String no)
/*    */   {
/* 18 */     String isNull = (String)map.get(no);
/* 19 */     if (isNull == null) {
/* 20 */       return false;
/*    */     }
/* 22 */     return true;
/*    */   }
/*    */ 
/*    */   static
/*    */   {
/* 14 */     map.put("", "");
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.BaimingdanNo
 * JD-Core Version:    0.6.2
 */
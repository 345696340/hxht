/*    */ package com.game.server.util;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class JdbCached
/*    */ {
/* 12 */   private static Map<String, Object> map = Collections.synchronizedMap(new HashMap());
/*    */ 
/*    */   public static void add(String KEY, String VALUE) {
/* 15 */     map.put(KEY, VALUE);
/*    */   }
/*    */ 
/*    */   public static void addMap(String KEY, HashMap value) {
/* 19 */     map.put(KEY, value);
/*    */   }
/*    */ 
/*    */   public static Object get(String KEY) {
/* 23 */     return map.get(KEY);
/*    */   }
/*    */ 
/*    */   public static Object remove(String KEY) {
/* 27 */     return map.remove(KEY);
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.JdbCached
 * JD-Core Version:    0.6.2
 */
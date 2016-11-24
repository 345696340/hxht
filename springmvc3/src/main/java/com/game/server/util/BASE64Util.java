/*    */ package com.game.server.util;
/*    */ 
/*    */ import sun.misc.BASE64Decoder;
/*    */ import sun.misc.BASE64Encoder;
/*    */ 
/*    */ public class BASE64Util
/*    */ {
/*    */   public static String getBASE64(String s)
/*    */   {
/* 11 */     if (s == null) return null;
/* 12 */     return new BASE64Encoder().encode(s.getBytes());
/*    */   }
/*    */ 
/*    */   public static String getFromBASE64(String s)
/*    */   {
/* 17 */     if (s == null) return null;
/* 18 */     BASE64Decoder decoder = new BASE64Decoder();
/*    */     try {
/* 20 */       byte[] b = decoder.decodeBuffer(s);
/* 21 */       return new String(b); } catch (Exception e) {
/*    */     }
/* 23 */     return null;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.BASE64Util
 * JD-Core Version:    0.6.2
 */
/*    */ package com.game.server.util;
/*    */ 
/*    */ import javax.servlet.http.Cookie;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class CookieUtil
/*    */ {
/*    */   public static void addCookie(HttpServletResponse response, HttpServletRequest request, String key, String value)
/*    */   {
/* 13 */     Cookie cookie = new Cookie(key, value);
/* 14 */     cookie.setMaxAge(0);
/* 15 */     cookie.setPath("/");
/* 16 */     response.addCookie(cookie);
/*    */   }
/*    */ 
/*    */   public static String getCookie(HttpServletResponse response, HttpServletRequest request, String key) {
/* 20 */     Cookie[] cookies = request.getCookies();
/* 21 */     for (int i = 0; i < cookies.length; i++) {
/* 22 */       if (cookies[i].getName().equals(key)) {
/* 23 */         return cookies[i].getValue();
/*    */       }
/*    */     }
/* 26 */     return null;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.CookieUtil
 * JD-Core Version:    0.6.2
 */
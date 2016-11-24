/*    */ package com.core.sgip.util;
/*    */ 
/*    */ public class SGIPSeq
/*    */ {
/* 25 */   private static long MIN_SEQ = 0L;
/*    */ 
/* 27 */   private static long MAX_SEQ = 2147483647L;
/*    */ 
/* 29 */   private static long CUR_SEQ = MIN_SEQ;
/*    */ 
/*    */   public static synchronized long getSeq()
/*    */   {
/* 33 */     if (CUR_SEQ == MAX_SEQ)
/*    */     {
/* 35 */       CUR_SEQ = MIN_SEQ;
/*    */     }
/* 37 */     return CUR_SEQ++;
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.util.SGIPSeq
 * JD-Core Version:    0.6.2
 */
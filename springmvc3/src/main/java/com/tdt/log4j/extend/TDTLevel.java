/*    */ package com.tdt.log4j.extend;
/*    */ 
/*    */ import org.apache.log4j.Level;
/*    */ 
/*    */ public class TDTLevel extends Level
/*    */ {
/*    */   private static final long serialVersionUID = 7288304330257085144L;
/*    */   public static final int REMIND_INT = 20001;
/*    */   public static final int LETHAL_INT = 50001;
/* 17 */   private static String REMIND_STR = "REMIND";
/* 18 */   private static String LETHAL_STR = "LETHAL";
/*    */ 
/* 20 */   public static final TDTLevel REMIND = new TDTLevel(20001, REMIND_STR, 7);
/* 21 */   public static final TDTLevel LETHAL = new TDTLevel(50001, LETHAL_STR, 0);
/*    */ 
/*    */   protected TDTLevel(int level, String strLevel, int syslogEquiv) {
/* 24 */     super(level, strLevel, syslogEquiv);
/*    */   }
/*    */ 
/*    */   public static Level toLevel(String sArg)
/*    */   {
/* 32 */     return toLevel(sArg, REMIND);
/*    */   }
/*    */ 
/*    */   public static Level toLevel(String sArg, Level defaultValue) {
/* 36 */     if (sArg == null) {
/* 37 */       return defaultValue;
/*    */     }
/* 39 */     String stringVal = sArg.toUpperCase();
/*    */ 
/* 41 */     if (stringVal.equals(REMIND_STR))
/* 42 */       return REMIND;
/* 43 */     if (stringVal.equals(LETHAL_STR)) {
/* 44 */       return LETHAL;
/*    */     }
/*    */ 
/* 47 */     return Level.toLevel(sArg, defaultValue);
/*    */   }
/*    */   public static Level toLevel(int i) throws IllegalArgumentException {
/* 50 */     switch (i) {
/*    */     case 20001:
/* 52 */       return REMIND;
/*    */     case 50001:
/* 54 */       return LETHAL;
/*    */     }
/* 56 */     return Level.toLevel(i);
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.log4j.extend.TDTLevel
 * JD-Core Version:    0.6.2
 */
/*   */ package com.tdt.log4j.extend;
/*   */ 
/*   */ import org.apache.log4j.spi.LoggingEvent;
/*   */ import org.apache.log4j.spi.TriggeringEventEvaluator;
/*   */ 
/*   */ public final class MockTriggeringEventEvaluator
/*   */   implements TriggeringEventEvaluator
/*   */ {
/*   */   public boolean isTriggeringEvent(LoggingEvent event)
/*   */   {
/* 9 */     return true;
/*   */   }
/*   */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.log4j.extend.MockTriggeringEventEvaluator
 * JD-Core Version:    0.6.2
 */
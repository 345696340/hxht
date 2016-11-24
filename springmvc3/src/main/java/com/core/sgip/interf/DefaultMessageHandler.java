/*    */ package com.core.sgip.interf;
/*    */ 
/*    */ import com.core.sgip.body.command.Deliver;
/*    */ import com.core.sgip.body.command.Report;
/*    */ import com.core.sgip.body.command.Submit;
/*    */ import com.core.sgip.head.SGIPMsgHead;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class DefaultMessageHandler
/*    */   implements MessageHandler
/*    */ {
/* 29 */   private static Logger logger = Logger.getLogger("A3");
/*    */ 
/*    */   public void handleDeliverMessage(SGIPMsgHead head, Deliver deliver)
/*    */   {
/* 33 */     logger.debug("handle message handleDeliverMessage sgipMsgHead is " + head + " deliver detail:" + deliver);
/*    */   }
/*    */ 
/*    */   public void handleReportMessage(SGIPMsgHead head, Report report)
/*    */   {
/* 38 */     logger.debug("handle message handleReportMessage sgipMsgHead is " + head + " report detail:" + report);
/*    */   }
/*    */ 
/*    */   public void handleSubmitMessage(SGIPMsgHead head, Submit submit)
/*    */   {
/* 43 */     logger.debug("handle message handleSubmitMessage sgipMsgHead is " + head + " submit detail:" + submit);
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.interf.DefaultMessageHandler
 * JD-Core Version:    0.6.2
 */
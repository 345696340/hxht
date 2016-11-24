/*    */ package com.game.server.jms.listener;
/*    */ 
/*    */ import org.springframework.jms.core.JmsTemplate;
/*    */ 
/*    */ public abstract class JmsListener
/*    */ {
/*    */   private JmsTemplate jmsTemplate;
/*    */ 
/*    */   public abstract void report();
/*    */ 
/*    */   public JmsTemplate getJmsTemplate()
/*    */   {
/* 15 */     return this.jmsTemplate;
/*    */   }
/*    */ 
/*    */   public void setJmsTemplate(JmsTemplate jmsTemplate) {
/* 19 */     this.jmsTemplate = jmsTemplate;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.JmsListener
 * JD-Core Version:    0.6.2
 */
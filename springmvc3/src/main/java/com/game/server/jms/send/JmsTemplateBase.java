/*    */ package com.game.server.jms.send;
/*    */ 
/*    */ import javax.jms.Destination;
/*    */ import org.springframework.jms.core.JmsTemplate;
/*    */ 
/*    */ public abstract class JmsTemplateBase<T>
/*    */ {
/*    */   JmsTemplate jmsTemplate;
/*    */   Destination destination;
/*    */ 
/*    */   public abstract boolean send(T paramT);
/*    */ 
/*    */   public Destination getDestination()
/*    */   {
/* 19 */     return this.destination;
/*    */   }
/*    */ 
/*    */   public void setDestination(Destination destination) {
/* 23 */     this.destination = destination;
/*    */   }
/*    */ 
/*    */   public JmsTemplate getJmsTemplate() {
/* 27 */     return this.jmsTemplate;
/*    */   }
/*    */ 
/*    */   public void setJmsTemplate(JmsTemplate jmsTemplate) {
/* 31 */     this.jmsTemplate = jmsTemplate;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.send.JmsTemplateBase
 * JD-Core Version:    0.6.2
 */
/*    */ package com.core.sgip.jms;
/*    */ 
/*    */ import com.tdt.unicom.domains.Submit;
/*    */ import javax.jms.Connection;
/*    */ import javax.jms.ConnectionFactory;
/*    */ import javax.jms.Destination;
/*    */ import javax.jms.MessageProducer;
/*    */ import javax.jms.ObjectMessage;
/*    */ import javax.jms.Session;
/*    */ import org.apache.activemq.ActiveMQConnection;
/*    */ import org.apache.activemq.ActiveMQConnectionFactory;
/*    */ 
/*    */ public class JmsSendSubmit
/*    */ {
/*    */   MessageProducer producer;
/*    */   Session session;
/*    */ 
/*    */   public JmsSendSubmit(Submit submit)
/*    */   {
/* 26 */     Connection connection = null;
/*    */ 
/* 30 */     ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, "tcp://127.0.0.1:61616");
/*    */     try
/*    */     {
/* 34 */       connection = connectionFactory.createConnection();
/*    */ 
/* 36 */       connection.start();
/*    */ 
/* 38 */       this.session = connection.createSession(Boolean.TRUE.booleanValue(), 1);
/*    */ 
/* 41 */       Destination destination = this.session.createQueue("SmsSubmitUpQueue");
/*    */ 
/* 43 */       this.producer = this.session.createProducer(destination);
/*    */ 
/* 47 */       sendMessage(submit);
/* 48 */       this.session.commit();
/*    */     } catch (Exception e) {
/* 50 */       e.printStackTrace();
/*    */     } finally {
/*    */       try {
/* 53 */         if (null != connection)
/* 54 */           connection.close();
/*    */       }
/*    */       catch (Throwable ignore)
/*    */       {
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   private void sendMessage(Submit submit) throws Exception {
/* 63 */     ObjectMessage message = this.session.createObjectMessage();
/*    */ 
/* 65 */     message.setObject(submit);
/* 66 */     this.producer.send(message);
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.jms.JmsSendSubmit
 * JD-Core Version:    0.6.2
 */
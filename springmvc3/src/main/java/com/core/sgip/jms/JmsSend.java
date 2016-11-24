/*    */ package com.core.sgip.jms;
/*    */ 
/*    */ import com.tdt.unicom.domains.Deliver;
/*    */ import javax.jms.Connection;
/*    */ import javax.jms.ConnectionFactory;
/*    */ import javax.jms.Destination;
/*    */ import javax.jms.MessageProducer;
/*    */ import javax.jms.ObjectMessage;
/*    */ import javax.jms.Session;
/*    */ import org.apache.activemq.ActiveMQConnection;
/*    */ import org.apache.activemq.ActiveMQConnectionFactory;
/*    */ 
/*    */ public class JmsSend
/*    */ {
/*    */   MessageProducer producer;
/*    */   Session session;
/*    */ 
/*    */   public JmsSend(Deliver deliver)
/*    */   {
/* 25 */     Connection connection = null;
/*    */ 
/* 29 */     ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, "tcp://59.110.1.67:61618");
/*    */     try
/*    */     {
/* 33 */       connection = connectionFactory.createConnection();
/*    */ 
/* 35 */       connection.start();
/*    */ 
/* 37 */       this.session = connection.createSession(Boolean.TRUE.booleanValue(), 1);
/*    */ 
/* 40 */       Destination destination = this.session.createQueue("SmsUpQueue");
/*    */ 
/* 42 */       this.producer = this.session.createProducer(destination);
/*    */ 
/* 46 */       sendMessage(deliver);
/* 47 */       this.session.commit();
/*    */     } catch (Exception e) {
/* 49 */       e.printStackTrace();
/*    */     } finally {
/*    */       try {
/* 52 */         if (null != connection)
/* 53 */           connection.close();
/*    */       }
/*    */       catch (Throwable ignore)
/*    */       {
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   private void sendMessage(Deliver deliver) throws Exception {
/* 62 */     ObjectMessage message = this.session.createObjectMessage();
/*    */ 
/* 64 */     message.setObject(deliver);
/* 65 */     this.producer.send(message);
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.jms.JmsSend
 * JD-Core Version:    0.6.2
 */
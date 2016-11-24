/*    */ package com.game.server.pay.http.listener;
/*    */ 
/*    */ import com.game.server.service.SGIPServiceThread;
/*    */ import java.io.PrintStream;
/*    */ import javax.servlet.ServletContextEvent;
/*    */ import javax.servlet.ServletContextListener;
/*    */ 
/*    */ public class SGIPServerContextListener
/*    */   implements ServletContextListener
/*    */ {
/*    */   public void contextInitialized(ServletContextEvent sce)
/*    */   {
/* 15 */     System.out.println("短彩接收线程开启");
/* 16 */     new SGIPServiceThread().start();
/*    */   }
/*    */ 
/*    */   public void contextDestroyed(ServletContextEvent sce)
/*    */   {
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.listener.SGIPServerContextListener
 * JD-Core Version:    0.6.2
 */
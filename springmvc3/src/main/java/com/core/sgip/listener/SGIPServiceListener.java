/*    */ package com.core.sgip.listener;
/*    */ 
/*    */ import com.core.sgip.server.SGIPServer;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class SGIPServiceListener extends HttpServlet
/*    */ {
/*    */   private static final String VALUE_YES = "Y";
/*    */   private static final long serialVersionUID = 1L;
/* 31 */   private static Logger logger = Logger.getLogger(SGIPServiceListener.class);
/*    */ 
/*    */   public void init()
/*    */     throws ServletException
/*    */   {
/*    */     try
/*    */     {
/* 38 */       String start = getInitParameter("start");
/* 39 */       String nio = getInitParameter("nio");
/* 40 */       logger.debug("************* sgip service start param = " + start + ";nio=" + nio);
/* 41 */       if ("Y".equalsIgnoreCase(start))
/*    */       {
/* 43 */         if ("Y".equalsIgnoreCase(nio))
/*    */         {
/* 45 */           SGIPServer.getInstance().startNIOSGIPService();
/*    */         }
/*    */         else
/* 48 */           SGIPServer.getInstance().startSGIPService();
/*    */       }
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 53 */       logger.error(e);
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.listener.SGIPServiceListener
 * JD-Core Version:    0.6.2
 */
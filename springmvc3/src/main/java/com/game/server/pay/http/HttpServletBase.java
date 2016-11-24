/*    */ package com.game.server.pay.http;
/*    */ 
/*    */ import com.game.server.model.dto.impl.PayOrderGameConfigMapper;
/*    */ import com.game.server.model.dto.impl.PayOrderInfoMapper;
/*    */ import com.game.server.model.dto.impl.SkPayOrderInfoMapper;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.ServletConfig;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.SingleThreadModel;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*    */ 
/*    */ public abstract class HttpServletBase extends HttpServlet
/*    */   implements SingleThreadModel
/*    */ {
/*    */   public PayOrderInfoMapper myPayOrderInfoDAO;
/*    */   public PayOrderGameConfigMapper myPayOrderGameConfigMapper;
/*    */   public SkPayOrderInfoMapper mySkPayOrderInfoDAO;
/*    */ 
/*    */   protected abstract void doPost(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse)
/*    */     throws ServletException, IOException;
/*    */ 
/*    */   public void init(ServletConfig config)
/*    */     throws ServletException
/*    */   {
/* 34 */     super.init(config);
/* 35 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*    */ 
/* 37 */     this.myPayOrderInfoDAO = ((PayOrderInfoMapper)applicationContext.getBean("myPayOrderInfoMapper"));
/*    */ 
/* 39 */     this.mySkPayOrderInfoDAO = ((SkPayOrderInfoMapper)applicationContext.getBean("mySkPayOrderInfoMapper"));
/* 40 */     this.myPayOrderGameConfigMapper = ((PayOrderGameConfigMapper)applicationContext.getBean("myPayOrderGameConfigMapper"));
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.HttpServletBase
 * JD-Core Version:    0.6.2
 */
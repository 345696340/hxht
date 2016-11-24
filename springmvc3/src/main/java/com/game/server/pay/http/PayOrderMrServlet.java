/*    */ package com.game.server.pay.http;
/*    */ 
/*    */ import com.game.server.jms.send.MrJmsSend;
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import com.game.server.model.dto.PayOrderInfoExample;
/*    */ import com.game.server.model.dto.PayOrderInfoExample.Criteria;
/*    */ import com.game.server.model.dto.impl.PayOrderInfoMapper;
/*    */ import com.game.server.service.impl.ConvertPayOrderService;
/*    */ import com.game.server.service.impl.ValidatePayOrderService;
/*    */ import com.game.server.vo.Result;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.List;
/*    */ import javax.servlet.ServletConfig;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.log4j.Logger;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*    */ 
/*    */ public class PayOrderMrServlet extends HttpServletBase
/*    */ {
/* 29 */   private static final Logger logger = Logger.getLogger("A1");
/*    */ 
/* 31 */   private ConvertPayOrderService myConvertPayOrderService = new ConvertPayOrderService();
/*    */ 
/* 33 */   private ValidatePayOrderService validateService = new ValidatePayOrderService();
/*    */   private MrJmsSend mrJmsSend;
/*    */ 
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 39 */     StringBuffer content = new StringBuffer();
/* 40 */     request.setCharacterEncoding("GBK");
/* 41 */     response.setContentType("text/html; charset=GBK");
/*    */ 
/* 43 */     Result returnValue = new Result();
/*    */ 
/* 45 */     logger.info(getClass() + " mr begin --------------------------- ");
/* 46 */     content = new StringBuffer(request.getQueryString());
/* 47 */     logger.info("mr [ " + content.toString() + "]");
/*    */     try {
/* 49 */       PayOrderInfo payOrderInfo = this.myConvertPayOrderService.fromTo(content.toString());
/* 50 */       returnValue.setCp_order_no(payOrderInfo.getCpOrderNo());
/* 51 */       returnValue.setCpid(payOrderInfo.getCpid().toString());
/* 52 */       PayOrderInfoExample example = new PayOrderInfoExample();
/* 53 */       example.createCriteria().andCpOrderNoEqualTo(payOrderInfo.getCpOrderNo());
/* 54 */       List list = this.myPayOrderInfoDAO.selectByExample(example);
/*    */ 
/* 56 */       if ((list == null) || (list.size() == 0)) {
/* 57 */         logger.info("mr [ " + content.toString() + " ]  还没有mo");
/* 58 */         returnValue.setRet_result("1111");
/*    */       }
/* 61 */       else if (!this.validateService.validate(payOrderInfo, this.myConvertPayOrderService.toFromMr(payOrderInfo))) {
/* 62 */         logger.info("mr [ " + content.toString() + " ]  校验失败");
/* 63 */         returnValue.setRet_result("1111");
/*    */       }
/*    */       else {
/* 66 */         PayOrderInfo updatePayOrderInfo = (PayOrderInfo)list.get(0);
/*    */ 
/* 68 */         updatePayOrderInfo.setStatus(payOrderInfo.getStatus());
/* 69 */         updatePayOrderInfo.setZtOrderNo(payOrderInfo.getZtOrderNo());
/* 70 */         updatePayOrderInfo.setChargeTime(payOrderInfo.getChargeTime());
/*    */ 
/* 72 */         int count = this.myPayOrderInfoDAO.updateByExample(updatePayOrderInfo, example);
/* 73 */         if (count > 0) {
/* 74 */           returnValue.setRet_result("0000");
/*    */         } else {
/* 76 */           logger.info("mo [" + content.toString() + "] 更新数据库失败!");
/* 77 */           returnValue.setRet_result("1111");
/*    */         }
/*    */       }
/*    */     } catch (Exception e) {
/* 81 */       returnValue.setRet_result("1111");
/*    */     } finally {
/* 83 */       response.getWriter().write(returnValue.toString());
/* 84 */       logger.info("mr return " + returnValue.toString());
/* 85 */       logger.info(getClass() + " mr end --------------------------- ");
/*    */     }
/*    */   }
/*    */ 
/*    */   public void init(ServletConfig config)
/*    */     throws ServletException
/*    */   {
/* 92 */     super.init(config);
/* 93 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*    */ 
/* 95 */     this.mrJmsSend = ((MrJmsSend)applicationContext.getBean("payOrderMrJmsSend"));
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.PayOrderMrServlet
 * JD-Core Version:    0.6.2
 */
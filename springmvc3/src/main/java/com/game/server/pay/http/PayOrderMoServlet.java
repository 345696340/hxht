/*    */ package com.game.server.pay.http;
/*    */ 
/*    */ import com.game.server.jms.send.MoJmsSend;
/*    */ import com.game.server.model.dto.PayOrderInfo;
/*    */ import com.game.server.model.dto.PayOrderInfoExample;
/*    */ import com.game.server.model.dto.PayOrderInfoExample.Criteria;
/*    */ import com.game.server.model.dto.impl.PayOrderInfoMapper;
/*    */ import com.game.server.service.impl.ConvertPayOrderService;
/*    */ import com.game.server.service.impl.ValidatePayOrderService;
/*    */ import com.game.server.vo.Result;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ import javax.servlet.ServletConfig;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.log4j.Logger;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*    */ 
/*    */ public class PayOrderMoServlet extends HttpServletBase
/*    */ {
/* 30 */   private static final Logger logger = Logger.getLogger("A1");
/*    */ 
/* 32 */   private ConvertPayOrderService myConvertPayOrderService = new ConvertPayOrderService();
/*    */ 
/* 34 */   private ValidatePayOrderService validateService = new ValidatePayOrderService();
/*    */   private MoJmsSend moJmsSend;
/*    */ 
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*    */     throws ServletException, IOException
/*    */   {
/* 40 */     StringBuffer content = new StringBuffer();
/* 41 */     request.setCharacterEncoding("GBK");
/* 42 */     response.setContentType("text/html; charset=GBK");
/* 43 */     Result returnValue = new Result();
/*    */ 
/* 45 */     logger.info(getClass() + " mo begin --------------------------- ");
/* 46 */     content = new StringBuffer(request.getQueryString());
/* 47 */     logger.info("mo [" + content.toString() + "]");
/*    */     try
/*    */     {
/* 50 */       PayOrderInfo payOrderInfo = this.myConvertPayOrderService.fromTo(content.toString());
/* 51 */       returnValue.setCp_order_no(payOrderInfo.getCpOrderNo());
/* 52 */       returnValue.setCpid(payOrderInfo.getCpid().toString());
/* 53 */       PayOrderInfoExample example = new PayOrderInfoExample();
/* 54 */       example.createCriteria().andCpOrderNoEqualTo(payOrderInfo.getCpOrderNo());
/* 55 */       List list = this.myPayOrderInfoDAO.selectByExample(example);
/* 56 */       if ((list != null) && (list.size() > 0)) {
/* 57 */         logger.info("mo [" + content.toString() + "] MO订单已经存在!");
/* 58 */         returnValue.setRet_result("1111");
/*    */       }
/* 61 */       else if (!this.validateService.validate(payOrderInfo, this.myConvertPayOrderService.toFrom(payOrderInfo))) {
/* 62 */         logger.info("mo [" + content.toString() + "] 校验失败!");
/* 63 */         returnValue.setRet_result("1111");
/*    */       }
/*    */       else {
/* 66 */         payOrderInfo.setLinkid(UUID.randomUUID().toString());
/* 67 */         payOrderInfo.setCreated(new Date());
/* 68 */         int count = this.myPayOrderInfoDAO.insert(payOrderInfo);
/* 69 */         if (count > 0) {
/* 70 */           returnValue.setRet_result("0000");
/*    */         } else {
/* 72 */           logger.info("mo [" + content.toString() + "] 插入数据库失败!");
/* 73 */           returnValue.setRet_result("1111");
/*    */         }
/*    */       }
/*    */     } catch (Exception e) {
/* 77 */       e.printStackTrace();
/* 78 */       returnValue.setRet_result("1111");
/*    */     } finally {
/* 80 */       response.getWriter().write(returnValue.toString());
/* 81 */       logger.info("mo return " + returnValue.toString());
/* 82 */       logger.info(getClass() + " mo end --------------------------- ");
/*    */     }
/*    */   }
/*    */ 
/*    */   public void init(ServletConfig config) throws ServletException {
/* 87 */     super.init(config);
/* 88 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*    */ 
/* 90 */     this.moJmsSend = ((MoJmsSend)applicationContext.getBean("payOrderMoJmsSend"));
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.PayOrderMoServlet
 * JD-Core Version:    0.6.2
 */
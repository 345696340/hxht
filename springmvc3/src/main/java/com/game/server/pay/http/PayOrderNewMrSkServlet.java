/*     */ package com.game.server.pay.http;
/*     */ 
/*     */ import com.game.server.jms.send.MrJmsSend;
/*     */ import com.game.server.model.dto.PayOrderInfo;
/*     */ import com.game.server.model.dto.SkPayOrderInfo;
/*     */ import com.game.server.model.dto.SkPayOrderInfoExample;
/*     */ import com.game.server.model.dto.SkPayOrderInfoExample.Criteria;
/*     */ import com.game.server.model.dto.impl.PayOrderLimitDateMapper;
/*     */ import com.game.server.model.dto.impl.SkPayOrderInfoMapper;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.impl.ConvertSkPayOrderService;
/*     */ import com.game.server.service.impl.ValidateSkPayOrderService;
/*     */ import com.game.server.vo.Result;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ import java.util.List;
/*     */ import javax.servlet.ServletConfig;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*     */ 
/*     */ public class PayOrderNewMrSkServlet extends HttpServletBase
/*     */ {
/*  27 */   private static final Logger logger = Logger.getLogger("A1");
/*     */ 
/*  29 */   private ConvertSkPayOrderService myConvertPayOrderService = new ConvertSkPayOrderService();
/*     */ 
/*  31 */   private ValidateSkPayOrderService validateService = new ValidateSkPayOrderService();
/*     */   private MrJmsSend mrJmsSend;
/*     */   private LimitService myLimitService;
/*     */   private PayOrderLimitDateMapper myPayOrderLimitDateMapper;
/*     */ 
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  41 */     StringBuffer content = new StringBuffer();
/*  42 */     request.setCharacterEncoding("GBK");
/*  43 */     response.setContentType("text/html; charset=GBK");
/*     */ 
/*  45 */     Result returnValue = new Result();
/*     */ 
/*  47 */     logger.info(getClass() + " mr begin --------------------------- ");
/*  48 */     content = new StringBuffer(request.getQueryString());
/*  49 */     logger.info("mr [ " + content.toString() + "]");
/*     */     try {
/*  51 */       SkPayOrderInfo payOrderInfo = this.myConvertPayOrderService.fromTo(content.toString());
/*  52 */       returnValue.setCp_order_no(payOrderInfo.getCpOrderId());
/*  53 */       returnValue.setCpid(payOrderInfo.getCpid().toString());
/*  54 */       SkPayOrderInfoExample example = new SkPayOrderInfoExample();
/*  55 */       example.createCriteria().andCpOrderIdEqualTo(payOrderInfo.getCpOrderId());
/*  56 */       List list = this.mySkPayOrderInfoDAO.selectByExample(example);
/*     */ 
/*  58 */       if ((list == null) || (list.size() == 0)) {
/*  59 */         logger.info("mr [ " + content.toString() + " ]  锟斤拷没锟斤拷mo");
/*  60 */         returnValue.setRet_result("1111");
/*     */       }
/*  63 */       else if (!this.validateService.validate(payOrderInfo, this.myConvertPayOrderService.toFromMr(payOrderInfo))) {
/*  64 */         logger.info("mr [ " + content.toString() + " ]  校锟斤拷失锟斤拷");
/*  65 */         returnValue.setRet_result("1111");
/*     */       }
/*     */       else {
/*  68 */         SkPayOrderInfo updatePayOrderInfo = (SkPayOrderInfo)list.get(0);
/*     */ 
/*  70 */         updatePayOrderInfo.setStatus(payOrderInfo.getStatus());
/*  71 */         updatePayOrderInfo.setZtOrderNo(payOrderInfo.getZtOrderNo());
/*  72 */         updatePayOrderInfo.setChargetime(payOrderInfo.getChargetime());
/*     */ 
/*  74 */         if ((payOrderInfo.getStatus() != null) && (payOrderInfo.getStatus().equals("SUCCESS"))) {
/*     */           try {
/*  76 */             this.myLimitService.addMobile(updatePayOrderInfo.getMobileNum(), updatePayOrderInfo.getLimitId(), Long.valueOf(Long.valueOf(updatePayOrderInfo.getAmount()).longValue() / 100L));
/*     */           } catch (Exception e) {
/*  78 */             e.printStackTrace();
/*     */           }
/*     */         }
/*  81 */         int count = this.mySkPayOrderInfoDAO.updateByExample(updatePayOrderInfo, example);
/*  82 */         if (count > 0) {
/*  83 */           returnValue.setRet_result("0000");
/*     */         } else {
/*  85 */           logger.info("mo [" + content.toString() + "] 锟斤拷锟斤拷锟斤拷锟捷匡拷失锟斤拷!");
/*  86 */           returnValue.setRet_result("1111");
/*     */         }
/*  88 */         PayOrderInfo payOrderInfo1 = new PayOrderInfo();
/*  89 */         payOrderInfo1.setContent(payOrderInfo.getContent());
/*  90 */         this.mrJmsSend.send(updatePayOrderInfo);
/*     */       }
/*     */     } catch (Exception e) { returnValue.setRet_result("1111");
/*     */     } finally {
/*  94 */       response.getWriter().write(returnValue.toString());
/*  95 */       logger.info("mr return " + returnValue.toString());
/*  96 */       logger.info(getClass() + " mr end --------------------------- ");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void init(ServletConfig config)
/*     */     throws ServletException
/*     */   {
/* 103 */     super.init(config);
/* 104 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*     */ 
/* 106 */     this.mrJmsSend = ((MrJmsSend)applicationContext.getBean("payOrderMrJmsSend"));
/*     */ 
/* 108 */     this.myLimitService = ((LimitService)applicationContext.getBean("myLimitService"));
/* 109 */     this.myPayOrderLimitDateMapper = ((PayOrderLimitDateMapper)applicationContext.getBean("myPayOrderLimitDateMapper"));
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.PayOrderNewMrSkServlet
 * JD-Core Version:    0.6.2
 */
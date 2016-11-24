/*     */ package com.game.server.pay.http;
/*     */ 
/*     */ import com.game.server.jms.send.MrCommonJmsSend;
/*     */ import com.game.server.model.dto.PayOrderInfo;
/*     */ import com.game.server.model.dto.SkSmsPayOrderInfo;
/*     */ import com.game.server.model.dto.SkSmsPayOrderInfoExample;
/*     */ import com.game.server.model.dto.SkSmsPayOrderInfoExample.Criteria;
/*     */ import com.game.server.model.dto.impl.SkSmsPayOrderInfoMapper;
/*     */ import com.game.server.service.impl.ConvertSkSmsPayOrderService;
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
/*     */ public class SkSmsPayOrderMrServlet extends HttpServletBase
/*     */ {
/*  24 */   private static final Logger logger = Logger.getLogger("SKSMS");
/*     */ 
/*  26 */   ConvertSkSmsPayOrderService myConvertSkSmsPayOrderService = new ConvertSkSmsPayOrderService();
/*     */   private SkSmsPayOrderInfoMapper mySkSmsPayOrderInfoMapper;
/*     */   private MrCommonJmsSend mrJmsSend;
/*     */ 
/*     */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  33 */     doPost(request, response);
/*     */   }
/*     */ 
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  38 */     StringBuffer content = new StringBuffer();
/*  39 */     request.setCharacterEncoding("GBK");
/*  40 */     response.setContentType("text/html; charset=GBK");
/*     */ 
/*  42 */     logger.info(getClass() + " sm_sms_validate begin --------------------------- ");
/*     */ 
/*  49 */     content = new StringBuffer(request.getQueryString());
/*  50 */     logger.info("sm_sms_validate [" + content.toString() + "]");
/*  51 */     String result = "";
/*     */     try {
/*  53 */       SkSmsPayOrderInfo skSmsPayOrderInfo = this.myConvertSkSmsPayOrderService.fromToUri(content.toString());
/*  54 */       if ((skSmsPayOrderInfo.getMobileNum() == null) || (skSmsPayOrderInfo.getMobileNum().equals(""))) {
/*  55 */         logger.info("sm_sms_validate 手机号码不能为空!");
/*  56 */         skSmsPayOrderInfo.setResult("false");
/*  57 */         result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*     */       }
/*  60 */       else if ((skSmsPayOrderInfo.getOrderNo() == null) || (skSmsPayOrderInfo.getOrderNo().equals(""))) {
/*  61 */         logger.info("sm_sms_validate 订单编号不能为空!");
/*  62 */         skSmsPayOrderInfo.setResult("false");
/*  63 */         result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*     */       }
/*     */       else
/*     */       {
/*  67 */         SkSmsPayOrderInfoExample example = new SkSmsPayOrderInfoExample();
/*  68 */         example.createCriteria().andOrderNoEqualTo(skSmsPayOrderInfo.getOrderNo());
/*  69 */         List lists = this.mySkSmsPayOrderInfoMapper.selectByExample(example);
/*  70 */         if ((lists == null) || (lists.size() <= 0)) {
/*  71 */           logger.info("sm_sms_validate mobileNum [" + skSmsPayOrderInfo.getMobileNum() + "] orderNo [" + skSmsPayOrderInfo.getOrderNo() + "] 还没有MO");
/*  72 */           skSmsPayOrderInfo.setResult("false");
/*  73 */           result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*     */         }
/*  75 */         SkSmsPayOrderInfo updateSkSmsPayOrderInfo = (SkSmsPayOrderInfo)lists.get(0);
/*  76 */         logger.info("sm_sms_validate mobileNum [" + updateSkSmsPayOrderInfo.getMobileNum() + "] moMsg [" + updateSkSmsPayOrderInfo.getMoMsg() + "] 短信上行指令");
/*  77 */         String[] moMsg = updateSkSmsPayOrderInfo.getMoMsg().split("\\*");
/*  78 */         String configId = moMsg[(moMsg.length - 1)];
/*     */ 
/*  80 */         updateSkSmsPayOrderInfo.setExpiryTime(skSmsPayOrderInfo.getExpiryTime());
/*  81 */         updateSkSmsPayOrderInfo.setStatus(skSmsPayOrderInfo.getStatus());
/*  82 */         updateSkSmsPayOrderInfo.setProdCode(skSmsPayOrderInfo.getProdCode());
/*  83 */         updateSkSmsPayOrderInfo.setErrorinfo(skSmsPayOrderInfo.getErrorinfo());
/*     */ 
/*  85 */         this.mySkSmsPayOrderInfoMapper.updateByPrimaryKey(updateSkSmsPayOrderInfo);
/*     */ 
/*  87 */         PayOrderInfo payOrderInfo = new PayOrderInfo();
/*     */ 
/*  89 */         payOrderInfo.setMobileNum(Long.valueOf(updateSkSmsPayOrderInfo.getMobileNum()));
/*  90 */         payOrderInfo.setContent(configId);
/*  91 */         payOrderInfo.setStatus(skSmsPayOrderInfo.getStatus());
/*  92 */         payOrderInfo.setLinkid(updateSkSmsPayOrderInfo.getLinkid());
/*  93 */         this.mrJmsSend.send(payOrderInfo);
/*     */       }
/*     */     } catch (Exception e) { e.printStackTrace();
/*  96 */       logger.info("sm_sms_validate  系统异常");
/*  97 */       SkSmsPayOrderInfo skSmsPayOrderInfo = new SkSmsPayOrderInfo();
/*  98 */       skSmsPayOrderInfo.setResult("false");
/*  99 */       result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*     */     } finally
/*     */     {
/* 102 */       response.getWriter().write(result);
/* 103 */       logger.info("sm_sms_validate return " + result);
/* 104 */       logger.info("sm_sms_validate end --------------------------- ");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void init(ServletConfig config) throws ServletException {
/* 109 */     super.init(config);
/* 110 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*     */ 
/* 112 */     this.mrJmsSend = ((MrCommonJmsSend)applicationContext.getBean("commonPayOrderMrJmsSend"));
/*     */ 
/* 114 */     this.mySkSmsPayOrderInfoMapper = ((SkSmsPayOrderInfoMapper)applicationContext.getBean("mySkSmsPayOrderInfo"));
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.SkSmsPayOrderMrServlet
 * JD-Core Version:    0.6.2
 */
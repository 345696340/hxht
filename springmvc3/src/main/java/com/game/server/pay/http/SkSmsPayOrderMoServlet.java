/*     */ package com.game.server.pay.http;
/*     */ 
/*     */ import com.game.server.jms.send.MoCommonJmsSend;
/*     */ import com.game.server.model.dto.PayOrderGameConfig;
/*     */ import com.game.server.model.dto.PayOrderInfo;
/*     */ import com.game.server.model.dto.PayOrderLimitDate;
/*     */ import com.game.server.model.dto.SkSmsPayOrderInfo;
/*     */ import com.game.server.model.dto.impl.PayOrderLimitDateMapper;
/*     */ import com.game.server.model.dto.impl.SkSmsPayOrderInfoMapper;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.ReportService;
/*     */ import com.game.server.service.impl.ConvertSkSmsPayOrderService;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Reader;
/*     */ import java.util.Date;
/*     */ import java.util.UUID;
/*     */ import javax.servlet.ServletConfig;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*     */ 
/*     */ public class SkSmsPayOrderMoServlet extends HttpServletBase
/*     */ {
/*  30 */   private static final Logger logger = Logger.getLogger("SKSMS");
/*     */ 
/*  32 */   ConvertSkSmsPayOrderService myConvertSkSmsPayOrderService = new ConvertSkSmsPayOrderService();
/*     */   private LimitService myLimitService;
/*     */   private PayOrderLimitDateMapper myPayOrderLimitDateMapper;
/*     */   private ReportService myReportService;
/*     */   private SkSmsPayOrderInfoMapper mySkSmsPayOrderInfoMapper;
/*     */   private MoCommonJmsSend moJmsSend;
/*     */ 
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  46 */     StringBuffer content = new StringBuffer();
/*  47 */     request.setCharacterEncoding("GBK");
/*  48 */     response.setContentType("text/html; charset=GBK");
/*     */ 
/*  50 */     logger.info(getClass() + " sm_sms_validate begin --------------------------- ");
/*  51 */     InputStream in = request.getInputStream();
/*  52 */     Reader rData = new InputStreamReader(in);
/*     */     int c;
/*  54 */     while ((c = rData.read()) != -1) {
/*  55 */       content.append((char)c);
/*     */     }
/*  57 */     logger.info("sm_sms_validate [" + content.toString() + "]");
/*  58 */     String result = "";
/*     */     try {
/*  60 */       SkSmsPayOrderInfo skSmsPayOrderInfo = this.myConvertSkSmsPayOrderService.fromTo(content.toString());
/*  61 */       if ((skSmsPayOrderInfo.getMobileNum() == null) || (skSmsPayOrderInfo.getMobileNum().equals(""))) {
/*  62 */         logger.info("sm_sms_validate 手机号码不能为空!");
/*  63 */         skSmsPayOrderInfo.setResult("false");
/*  64 */         result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*     */       }
/*     */       else {
/*  67 */         logger.info("sm_sms_validate mobileNum [" + skSmsPayOrderInfo.getMobileNum() + "] moMsg [" + skSmsPayOrderInfo.getMoMsg() + "] 短信上行指令");
/*  68 */         String[] moMsg = skSmsPayOrderInfo.getMoMsg().split("\\*");
/*  69 */         String configId = moMsg[(moMsg.length - 1)];
/*     */ 
/*  72 */         PayOrderGameConfig payOrderGameConfig = this.myReportService.isCheckOff(configId);
/*     */ 
/*  74 */         if (payOrderGameConfig == null) { logger.info("sm_sms_validate mobileNum [" + skSmsPayOrderInfo.getMobileNum() + "] moMsg [" + skSmsPayOrderInfo.getMoMsg() + "] 系统配置指令错误!");
/*  76 */           skSmsPayOrderInfo.setResult("false");
/*  77 */           result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*     */           return; }
/*  81 */         String limitId = this.myPayOrderLimitDateMapper.selectByPrimaryKey(Long.valueOf(payOrderGameConfig.getLimitId())).getId();
/*     */ 
/*  83 */         boolean validate = this.myLimitService.validate(limitId, skSmsPayOrderInfo.getMobileNum());
/*  84 */         logger.info("sm_sms_validate mobileNum [" + skSmsPayOrderInfo.getMobileNum() + "] moMsg [" + skSmsPayOrderInfo.getMoMsg() + "] 校验结果 " + validate);
/*  85 */         if (validate) { skSmsPayOrderInfo.setResult("true");
/*  87 */           result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*  88 */           skSmsPayOrderInfo.setLinkid(UUID.randomUUID().toString());
/*  89 */           skSmsPayOrderInfo.setCreade(new Date());
/*  90 */           skSmsPayOrderInfo.setResult("true");
/*  91 */           skSmsPayOrderInfo.setImsi(payOrderGameConfig.getAmont());
/*  92 */           logger.info("sm_sms_validate mobileNum [" + skSmsPayOrderInfo.getMobileNum() + "] moMsg [" + skSmsPayOrderInfo.getMoMsg() + "] 校验成功");
/*  93 */           int count = this.mySkSmsPayOrderInfoMapper.insert(skSmsPayOrderInfo);
/*  94 */           logger.info("sm_sms_validate mobileNum [" + skSmsPayOrderInfo.getMobileNum() + "] moMsg [" + skSmsPayOrderInfo.getMoMsg() + "] 入库 " + count);
/*  95 */           PayOrderInfo skPayOrderInfo = new PayOrderInfo();
/*  96 */           skPayOrderInfo.setMobileNum(Long.valueOf(skSmsPayOrderInfo.getMobileNum()));
/*  97 */           skPayOrderInfo.setLinkid(skSmsPayOrderInfo.getLinkid());
/*  98 */           skPayOrderInfo.setAmount(Integer.valueOf(Integer.parseInt(payOrderGameConfig.getAmont())));
/*  99 */           skPayOrderInfo.setContent(configId);
/* 100 */           this.myLimitService.addMobile(skSmsPayOrderInfo.getMobileNum(), limitId, Long.valueOf(Long.valueOf(payOrderGameConfig.getAmont()).longValue() / 100L));
/* 101 */           this.moJmsSend.send(skPayOrderInfo);
/* 102 */           logger.info("sm_sms_validate mobileNum [" + skSmsPayOrderInfo.getMobileNum() + "] moMsg [" + skSmsPayOrderInfo.getMoMsg() + "] 发送JMS 开始上报MO");
/*     */           return; } logger.info("sm_sms_validate mobileNum [" + skSmsPayOrderInfo.getMobileNum() + "] moMsg [" + skSmsPayOrderInfo.getMoMsg() + "] 校验失败");
/* 106 */         skSmsPayOrderInfo.setResult("false");
/* 107 */         result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*     */         return; }  } catch (Exception e) { e.printStackTrace();
/* 112 */       logger.info("sm_sms_validate mobileNum  系统异常");
/* 113 */       SkSmsPayOrderInfo skSmsPayOrderInfo = new SkSmsPayOrderInfo();
/* 114 */       skSmsPayOrderInfo.setResult("false");
/* 115 */       result = this.myConvertSkSmsPayOrderService.toFrom(skSmsPayOrderInfo);
/*     */     } finally
/*     */     {
/* 118 */       response.getWriter().write(result);
/* 119 */       logger.info("sm_sms_validate return " + result);
/* 120 */       logger.info("sm_sms_validate end --------------------------- ");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void init(ServletConfig config) throws ServletException {
/* 125 */     super.init(config);
/* 126 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*     */ 
/* 128 */     this.moJmsSend = ((MoCommonJmsSend)applicationContext.getBean("commonPayOrderMoJmsSend"));
/*     */ 
/* 130 */     this.myLimitService = ((LimitService)applicationContext.getBean("myLimitService"));
/* 131 */     this.myReportService = ((ReportService)applicationContext.getBean("reportService"));
/* 132 */     this.myPayOrderLimitDateMapper = ((PayOrderLimitDateMapper)applicationContext.getBean("myPayOrderLimitDateMapper"));
/* 133 */     this.mySkSmsPayOrderInfoMapper = ((SkSmsPayOrderInfoMapper)applicationContext.getBean("mySkSmsPayOrderInfo"));
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.SkSmsPayOrderMoServlet
 * JD-Core Version:    0.6.2
 */
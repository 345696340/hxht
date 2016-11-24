/*     */ package com.game.server.pay.http;
/*     */ 
/*     */ import com.game.server.jms.send.MoJmsSend;
/*     */ import com.game.server.model.dto.PayOrderGameConfig;
/*     */ import com.game.server.model.dto.PayOrderLimitDate;
/*     */ import com.game.server.model.dto.SkPayOrderInfo;
/*     */ import com.game.server.model.dto.SkPayOrderInfoExample;
/*     */ import com.game.server.model.dto.SkPayOrderInfoExample.Criteria;
/*     */ import com.game.server.model.dto.impl.PayOrderLimitDateMapper;
/*     */ import com.game.server.model.dto.impl.SkPayOrderInfoMapper;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.ReportService;
/*     */ import com.game.server.service.impl.ConvertSkPayOrderService;
/*     */ import com.game.server.service.impl.ValidateSkPayOrderService;
/*     */ import com.game.server.util.MD5;
/*     */ import com.game.server.vo.Result;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.io.PrintWriter;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import javax.servlet.ServletConfig;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*     */ 
/*     */ public class PayOrderNewMoSkServlet extends HttpServletBase
/*     */ {
/*  32 */   private static final Logger logger = Logger.getLogger("A1");
/*     */ 
/*  34 */   private ConvertSkPayOrderService myConvertSkPayOrderService = new ConvertSkPayOrderService();
/*     */ 
/*  36 */   private ValidateSkPayOrderService validateService = new ValidateSkPayOrderService();
/*     */   private MoJmsSend moJmsSend;
/*     */   private LimitService myLimitService;
/*     */   private ReportService myReportService;
/*     */   private PayOrderLimitDateMapper myPayOrderLimitDateMapper;
/*     */ 
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  48 */     StringBuffer content = new StringBuffer();
/*  49 */     request.setCharacterEncoding("GBK");
/*  50 */     response.setContentType("text/html; charset=GBK");
/*  51 */     Result returnValue = new Result();
/*     */ 
/*  53 */     logger.info(getClass() + " mo begin --------------------------- ");
/*  54 */     content = new StringBuffer(request.getQueryString());
/*  55 */     logger.info("mo [" + content.toString() + "]");
/*  56 */     String ret_result = "0000";
/*  57 */     SkPayOrderInfo payOrderInfo = null;
/*     */     try {
/*  59 */       payOrderInfo = this.myConvertSkPayOrderService.fromTo(content.toString());
/*  60 */       payOrderInfo.setId(UUID.randomUUID().toString());
/*  61 */       returnValue.setCp_order_no(payOrderInfo.getCpOrderId());
/*  62 */       returnValue.setCpid(payOrderInfo.getCpid().toString());
/*  63 */       SkPayOrderInfoExample example = new SkPayOrderInfoExample();
/*  64 */       example.createCriteria().andCpOrderIdEqualTo(payOrderInfo.getCpOrderId());
/*  65 */       List list = this.mySkPayOrderInfoDAO.selectByExample(example);
/*     */       int count;
/*  66 */       if ((list != null) && (list.size() > 0)) {
/*  67 */         logger.info("mo [" + content.toString() + "] MO 请求内容!");
/*  68 */         payOrderInfo.setStatus("1002");
/*  69 */         returnValue.setRet_result("1111");
/*     */       }
/*     */       else
/*     */       {
/*     */
/*  72 */         if (!this.validateService.validate(payOrderInfo, this.myConvertSkPayOrderService.toFrom(payOrderInfo))) {
/*  73 */           logger.info("mo [" + content.toString() + "] !");
/*  74 */           payOrderInfo.setStatus("1003");
/*  75 */           ret_result = "1111";
/*  76 */           returnValue.setRet_result("1111");
/*     */         }
/*     */         else
/*     */         {
/*  80 */           PayOrderGameConfig payOrderGameConfig = this.myReportService.isCheckOff(Long.valueOf(payOrderInfo.getCpid()), payOrderInfo.getContent());
/*     */
/*  81 */           if (payOrderGameConfig == null) {
/*  82 */             payOrderInfo.setStatus("1004");
/*  83 */             logger.info("mo cpid [" + payOrderInfo.getCpid() + "] content [" + content.toString() + "] !");
/*  84 */             ret_result = "1111";
/*  85 */             returnValue.setRet_result("1111");
/*     */           }
/*     */           else
/*     */           {
/*  89 */             String limitId = this.myPayOrderLimitDateMapper.selectByPrimaryKey(Long.valueOf(payOrderGameConfig.getLimitId())).getId();
/*     */ 
/*  91 */             boolean isSuccess = this.myLimitService.validate(limitId, payOrderInfo.getMobileNum());
/*     */
/*  92 */             if (!isSuccess) {
/*  93 */               payOrderInfo.setStatus("1005");
/*  94 */               logger.info("mo cpid [" + payOrderInfo.getCpid() + "] content [" + content.toString() + "] ");
/*  95 */               ret_result = "1111";
/*  96 */               returnValue.setRet_result("1111");
/*     */             }
/*     */             else {
/*  99 */               payOrderInfo.setLimitId(limitId);
/*     */ 
/* 102 */               String result = vali2(payOrderInfo.getCpid(), payOrderInfo.getCpOrderId(), payOrderInfo.getWoSms());
/* 103 */               logger.info("二次确认返回结果 result [" + result + "]");
/* 104 */               payOrderInfo.setIsVailResult(result);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*     */       int count;
/* 107 */       e.printStackTrace();
/* 108 */       returnValue.setRet_result("1111");
/*     */     }
/*     */     finally
/*     */     {
/*     */       int count;
/* 110 */       if (payOrderInfo != null) {
/* 111 */         payOrderInfo.setCreated(new Date());
/* 112 */          count = this.mySkPayOrderInfoDAO.insert(payOrderInfo);
/* 113 */         if (count > 0) {
/* 114 */           returnValue.setRet_result(ret_result);
/* 115 */           logger.info("入库成功 [" + content + "]");
/* 116 */           this.moJmsSend.send(payOrderInfo);
/*     */         } else {
/* 118 */           logger.info("mo [" + content.toString() + "] 入库失败!");
/* 119 */           returnValue.setRet_result("1111");
/*     */         }
/*     */       } else {
/* 122 */         logger.info("错误的请求 content [" + content + "]");
/*     */       }
/* 124 */       response.getWriter().write(returnValue.toString());
/* 125 */       logger.info("mo return " + returnValue.toString());
/* 126 */       logger.info(getClass() + " mo end --------------------------- ");
/*     */     }
/*     */   }
/*     */ 
/*     */   private String vali2(String cpid, String cp_order_no, String wo_sms) throws IOException {
/* 131 */     String urlHead = "http://211.151.183.205:8005/paymentorder2jf?";
/* 132 */     String urlStr = this.myConvertSkPayOrderService.toFromVali(cpid, cp_order_no, wo_sms);
/* 133 */     String sign = MD5.GetMD5Code(urlStr + this.myConvertSkPayOrderService.key);
/* 134 */     urlStr = urlStr + "&sign=" + sign.toUpperCase();
/* 135 */     logger.info(" vali2 request parm [" + urlStr + "]");
/* 136 */     URL url = new URL(urlHead + urlStr);
/* 137 */     System.out.println(url.toString());
/* 138 */     HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
/*     */ 
/* 140 */     urlConn.setDoOutput(true);
/* 141 */     urlConn.setDoInput(true);
/* 142 */     urlConn.setUseCaches(false);
/*     */ 
/* 144 */     urlConn.setRequestProperty("Content-typ", "text/plain");
/* 145 */     urlConn.setRequestProperty("Proxy-Connection", "Keep-Alive");
/* 146 */     urlConn.setRequestProperty("Content-type", "text/html");
/* 147 */     urlConn.setRequestProperty("Accept-Charset", "gbk");
/* 148 */     urlConn.setRequestProperty("contentType", "gbk");
/* 149 */     urlConn.setRequestMethod("POST");
/* 150 */     urlConn.connect();
/* 151 */     OutputStream outStrm = urlConn.getOutputStream();
/* 152 */     BufferedOutputStream oos = new BufferedOutputStream(outStrm);
/* 153 */     oos.write(urlStr.getBytes());
/* 154 */     oos.flush();
/* 155 */     oos.close();
/* 156 */     InputStream inStrm = urlConn.getInputStream();
/* 157 */     ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
/* 158 */     byte[] buffer = new byte[1024];
/* 159 */     int len = -1;
/* 160 */     while ((len = inStrm.read(buffer)) != -1) {
/* 161 */       outSteam.write(buffer, 0, len);
/*     */     }
/* 163 */     outSteam.close();
/* 164 */     inStrm.close();
/* 165 */     return new String(outSteam.toString().getBytes("gbk"), "utf-8");
/*     */   }
/*     */ 
/*     */   public void init(ServletConfig config) throws ServletException {
/* 169 */     super.init(config);
/* 170 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*     */ 
/* 172 */     this.moJmsSend = ((MoJmsSend)applicationContext.getBean("payOrderMoJmsSend"));
/*     */ 
/* 174 */     this.myLimitService = ((LimitService)applicationContext.getBean("myLimitService"));
/* 175 */     this.myReportService = ((ReportService)applicationContext.getBean("reportService"));
/* 176 */     this.myPayOrderLimitDateMapper = ((PayOrderLimitDateMapper)applicationContext.getBean("myPayOrderLimitDateMapper"));
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.PayOrderNewMoSkServlet
 * JD-Core Version:    0.6.2
 */
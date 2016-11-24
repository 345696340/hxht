/*    */ package com.game.server.pay.http;
/*    */ 
/*    */ import com.game.server.model.dto.PaymengtTraceInfo;
/*    */ import com.game.server.service.PaymentTraceService;
/*    */ import com.game.server.util.JsonUtil;
/*    */ import com.game.server.vo.response.PaymengtQueryTraceListResponse;
/*    */ import com.game.server.vo.response.PaymengtQueryTraceListResponse.UserIdPaymentInfo;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.Reader;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import javax.servlet.ServletConfig;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.apache.log4j.Logger;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*    */
/*    */ public class PayOrderQueryTraceListServlet extends HttpServletBase
/*    */ {
/*    */   private PaymentTraceService myPaymentTraceServiceImpl;
/* 29 */   private static final Logger logger = Logger.getLogger("A1");
/*    */
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*    */   {
/* 33 */     PaymengtQueryTraceListResponse queryTraceListResponse = new PaymengtQueryTraceListResponse();
/*    */     try {
/* 35 */       StringBuffer content = new StringBuffer();
/* 36 */       request.setCharacterEncoding("GBK");
/* 37 */       response.setContentType("text/html; charset=GBK");
/*    */ 
/* 39 */       logger.info(getClass() + " PayOrderQueryTraceListServlet begin --------------------------- ");
/*    */ 
/* 42 */       InputStream in = request.getInputStream();
/* 43 */       Reader rData = new InputStreamReader(in);
/*    */       int c;
/* 45 */       while ((c = rData.read()) != -1) {
/* 46 */         content.append((char)c);
/*    */       }
/* 48 */       logger.info("PayOrderQueryTraceListServlet content [" + content.toString() + "]");
/* 49 */       HashMap req = (HashMap)JsonUtil.json2bean(content.toString(), HashMap.class);
/* 50 */       String queryType = (String)req.get("queryType");
/* 51 */       String userId = (String)req.get("userId");
/* 52 */       String fromDate = (String)req.get("fromDate");
/* 53 */       String toDate = (String)req.get("toDate");
/* 54 */       String startNote = (String)req.get("startNote");
/*    */       String json;
/* 55 */       if ((queryType == null) || (queryType.equals(""))) {
/* 56 */         queryTraceListResponse.setResultCode("9998");
/* 57 */         queryTraceListResponse.setResultDescription("queryType不能为空!");
/*    */       }
/*    */       else {
/* 60 */         Date formDateD = fromDate == null ? null : new SimpleDateFormat("yyyyMMdd").parse(fromDate);
/* 61 */         Date toDateD = toDate == null ? null : new SimpleDateFormat("yyyyMMdd").parse(toDate);
/* 62 */         List<PaymengtTraceInfo> paymengtTraceInfoList = this.myPaymentTraceServiceImpl.listPaymentTraceInfo(userId, Integer.parseInt(queryType), formDateD, toDateD, startNote == null ? 0 : Integer.parseInt(startNote) + 1);
/* 63 */         for (PaymengtTraceInfo paymengtTraceInfo : paymengtTraceInfoList)
/*    */         {
/* 75 */           PaymengtQueryTraceListResponse tmp420_417 = new PaymengtQueryTraceListResponse();
                tmp420_417.getClass();
                PaymengtQueryTraceListResponse.UserIdPaymentInfo dto = new PaymengtQueryTraceListResponse().new UserIdPaymentInfo();
/* 65 */           dto.setUserId(paymengtTraceInfo.getMobile());
/* 66 */           dto.setAppKey(paymengtTraceInfo.getAppkey());
/* 67 */           dto.setAppName(paymengtTraceInfo.getAppname());
/* 68 */           dto.setCreateTime(new SimpleDateFormat("yyyyMMdd hh:mm:ss").format(paymengtTraceInfo.getCreateTime()));
/* 69 */           dto.setCity(paymengtTraceInfo.getCity());
/* 70 */           dto.setProvince(paymengtTraceInfo.getProvince());
/* 71 */           dto.setOutTradeNo(paymengtTraceInfo.getOutTradeNo());
/* 72 */           dto.setPaymentType("WO+计费2.0");
/* 73 */           queryTraceListResponse.addUserIdPaymentInfo(dto); } queryTraceListResponse.setResultCode("0");
/* 76 */         queryTraceListResponse.setResultDescription("成功");
/*    */
/*    */         return; }  } catch (Exception e) { queryTraceListResponse.setResultCode("9999");
/* 79 */       queryTraceListResponse.setResultDescription("系统错误!");
/* 80 */       e.printStackTrace();
/*    */       String json;
/*    */       return; } finally { String json = JsonUtil.bean2json(queryTraceListResponse);
/* 83 */       logger.info("PayOrderQueryTraceListServlet end [" + json + "]");
/* 84 */       response.getWriter().write(json); }
/*    */   }
/*    */
/*    */   public void init(ServletConfig config)
/*    */     throws ServletException
/*    */   {
/* 90 */     super.init(config);
/* 91 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*    */ 
/* 93 */     this.myPaymentTraceServiceImpl = ((PaymentTraceService)applicationContext.getBean("myPaymentTraceServiceImpl"));
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.PayOrderQueryTraceListServlet
 * JD-Core Version:    0.6.2
 */
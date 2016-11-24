/*     */ package com.game.server.pay.http;
/*     */ 
/*     */ import com.game.server.jms.listener.SmsListener;
/*     */ import com.game.server.model.dto.MobileInfo;
/*     */ import com.game.server.model.dto.impl.GamePayChannelMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderMapper;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.ReportService;
/*     */ import com.game.server.util.JsonUtil;
/*     */ import com.game.server.vo.Result;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Reader;
/*     */ import java.util.HashMap;
/*     */ import javax.servlet.ServletConfig;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*     */ 
/*     */ public class PayOrderEmaiGameServlet extends HttpServletBase
/*     */ {
/*  30 */   private static final Logger logger = Logger.getLogger("A3");
/*     */   private LimitService myLimitService;
/*     */   private GamePayChannelMapper myGamePayChannelMapper;
/*     */   private PayOrderMapper myPayOrderMapper;
/*     */   private ReportService myReportService;
/*     */   private SmsListener mySmsListener;
/*     */ 
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  44 */     Long beginTime = Long.valueOf(System.currentTimeMillis());
/*  45 */     StringBuffer content = new StringBuffer();
/*     */ 
/*  47 */     response.setContentType("text/html;");
/*  48 */     Result returnValue = new Result();
/*     */ 
/*  50 */     logger.info(getClass() + " payOrder begin --------------------------- ");
/*  51 */     InputStream in = request.getInputStream();
/*  52 */     Reader rData = new InputStreamReader(in);
/*     */     int c;
/*  54 */     while ((c = rData.read()) != -1) {
/*  55 */       content.append((char)c);
/*     */     }
/*  57 */     logger.info("payOrder [" + content.toString() + "]");
/*  58 */     HashMap map = (HashMap)JsonUtil.json2bean(content.toString(), HashMap.class);
/*     */     try
/*     */     {
/*  61 */       if (map.get("mobile") == null) {
/*  62 */         returnValue.setRet_result("1113");
/*     */       }
/*  65 */       else if (map.get("payCoin") == null) {
/*  66 */         returnValue.setRet_result("1114");
/*     */       }
/*  69 */       else if (map.get("channelId") == null) {
/*  70 */         returnValue.setRet_result("1115");
/*     */       }
/*     */       else
/*     */       {
/*  74 */         map.put("limitId", map.get("channelId"));
/*     */ 
/*  76 */         String limitId = (String)map.get("channelId");
/*  77 */         boolean vali = this.myLimitService.validate(limitId, (String)map.get("mobile"));
/*  78 */         logger.info("鏍￠獙璁¤垂 鏄惁瓒呴檺 longtime : vali[" + vali + "] longtime [" + (System.currentTimeMillis() - beginTime.longValue()) + "]");
/*  79 */         if (!vali) {
/*  80 */           returnValue.setRet_result("1111");
/*     */         }
/*     */         else {
/*  83 */           MobileInfo mobileInfo = this.myLimitService.getMobileInfo(((String)map.get("mobile")).substring(0, 7));
/*     */ 
/*  85 */           map.put("PROVINCE_CODE", Long.valueOf(mobileInfo.getProvinceId().longValue()));
/*  86 */           map.put("PROVINCE_NAME", mobileInfo.getProvinceName());
/*  87 */           map.put("CITY_CODE", Long.valueOf(mobileInfo.getCityId().longValue()));
/*  88 */           map.put("CITY_NAME", mobileInfo.getCityName());
/*  89 */           HashMap isSuccess = this.mySmsListener.pay(map);
/*  90 */           logger.info("wo 璁¤垂杩斿洖 retCode [" + isSuccess + "] longtime [" + (System.currentTimeMillis() - beginTime.longValue()) + "]");
/*     */ 
/*  92 */           returnValue.setRet_result(isSuccess.get("retCode").toString());
/*     */         }
/*     */       }
/*     */     } catch (Exception e) { e.printStackTrace();
/*     */ 
/*  97 */       returnValue.setRet_result("1113");
/*     */     } finally {
/*  99 */       response.getWriter().write(returnValue.toString());
/* 100 */       logger.info("payOrder return " + returnValue.toString());
/*     */ 
/* 102 */       logger.info(getClass() + " payOrder end --------------------------- longtime [" + (System.currentTimeMillis() - beginTime.longValue()) + "]");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void init(ServletConfig config) throws ServletException {
/* 107 */     super.init(config);
/* 108 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*     */ 
/* 110 */     this.myLimitService = ((LimitService)applicationContext.getBean("myLimitService"));
/*     */ 
/* 112 */     this.myPayOrderMapper = ((PayOrderMapper)applicationContext.getBean("myPayOrder"));
/* 113 */     this.myGamePayChannelMapper = ((GamePayChannelMapper)applicationContext.getBean("myGamePayChannel"));
/* 114 */     this.mySmsListener = ((SmsListener)applicationContext.getBean("smsJmsMessageListener"));
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.PayOrderEmaiGameServlet
 * JD-Core Version:    0.6.2
 */
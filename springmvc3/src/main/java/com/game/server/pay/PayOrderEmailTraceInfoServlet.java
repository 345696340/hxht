/*     */ package com.game.server.pay;
/*     */ 
/*     */ import com.game.server.jms.listener.SmsListener;
/*     */ import com.game.server.model.dto.MobileInfo;
/*     */ import com.game.server.model.dto.PaymengtTraceInfo;
/*     */ import com.game.server.model.dto.PaymengtTraceSmsInfo;
/*     */ import com.game.server.pay.http.HttpServletBase;
import com.game.server.service.LimitService;
/*     */ import com.game.server.service.PaymentTraceService;
/*     */ import com.game.server.util.JsonUtil;
/*     */ import com.game.server.vo.Result;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintStream;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Reader;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import javax.servlet.ServletConfig;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*     */ 
/*     */ public class PayOrderEmailTraceInfoServlet extends HttpServletBase
/*     */ {
/*  30 */   private static final Logger logger = Logger.getLogger("A3");
/*     */   private LimitService myLimitService;
/*     */   private PaymentTraceService myPaymentTraceServiceImpl;
/*  36 */   private static final HashMap<String, String> GAME_INFO_MAP = new HashMap();
/*     */   private SmsListener mySmsListener;
/*  46 */   Random rand = new Random();
/*     */ 
/* 173 */   private Random r = new Random();
/*     */ 
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  50 */     Long beginTime = Long.valueOf(System.currentTimeMillis());
/*  51 */     StringBuffer content = new StringBuffer();
/*     */ 
/*  53 */     response.setContentType("text/html;");
/*  54 */     Result returnValue = new Result();
/*     */ 
/*  56 */     logger.info(getClass() + " payOrder begin --------------------------- ");
/*  57 */     InputStream in = request.getInputStream();
/*  58 */     Reader rData = new InputStreamReader(in);
/*     */     int c;
/*  60 */     while ((c = rData.read()) != -1) {
/*  61 */       content.append((char)c);
/*     */     }
/*  63 */     logger.info("payOrder [" + content.toString() + "]");
/*     */     try {
/*  65 */       int thisHour = new Date().getHours();
/*     */ 
/*  71 */       HashMap map = (HashMap)JsonUtil.json2bean(content.toString(), HashMap.class);
/*  72 */       if ((map.get("mobile") == null) || (map.get("mobile").toString().equals(""))) {
/*  73 */         logger.info("手机号不能为空");
/*  74 */         returnValue.setRet_result("1113");
/*  75 */         return;
/*     */       }
/*  77 */       if ((map.get("channelId") == null) || (map.get("channelId").toString().equals(""))) {
/*  78 */         returnValue.setRet_result("1115");
/*  79 */         logger.info("限制ID不能为空");
/*  80 */         return;
/*     */       }
/*  82 */       if ((map.get("ext") == null) || (map.get("ext").toString().equals(""))) {
/*  83 */         returnValue.setRet_result("1114");
/*  84 */         logger.info("渠道不能为空");
/*  85 */         return;
/*     */       }
/*  87 */       if ((map.get("payCoin") == null) || (map.get("payCoin").toString().equals(""))) {
/*  88 */         returnValue.setRet_result("1114");
/*  89 */         logger.info("计费金额不能为空");
/*  90 */         return;
/*     */       }
/*  92 */       String limitId = (String)map.get("channelId");
/*  93 */       map.put("limitId", map.get("channelId"));
/*     */ 
/*  95 */       boolean vali = this.myLimitService.validate(limitId, (String)map.get("mobile"));
/*     */ 
/*  97 */       if (!vali) {
/*  98 */         returnValue.setRet_result("1111");
/*  99 */         return;
/*     */       }
/* 101 */       MobileInfo mobileInfo = this.myLimitService.getMobileInfo(((String)map.get("mobile")).substring(0, 7));
/* 102 */       map.put("PROVINCE_CODE", Long.valueOf(mobileInfo.getProvinceId().longValue()));
/* 103 */       map.put("PROVINCE_NAME", mobileInfo.getProvinceName());
/* 104 */       map.put("CITY_CODE", Long.valueOf(mobileInfo.getCityId().longValue()));
/* 105 */       map.put("CITY_NAME", mobileInfo.getCityName());
/* 106 */       map.put("EXT", map.get("ext").toString());
/* 107 */       HashMap isSuccess = this.mySmsListener.pay(map);
/* 108 */       logger.info("wo 计费返回 retCode [" + isSuccess + "] longtime [" + (System.currentTimeMillis() - beginTime.longValue()) + "]");
/*     */ 
/* 112 */       if (isSuccess.get("retCode").toString().equals("0000")) {
/* 113 */         String spNum = "10655516002";
/*     */ 
/* 115 */         returnValue.setRet_result(isSuccess.get("retCode").toString());
/* 116 */         PaymengtTraceInfo paymengtTraceInfo = createTraceInfo(mobileInfo.getCityName(), mobileInfo.getProvinceName(), map.get("mobile").toString(), map.get("ext").toString(), map.get("channelId").toString());
/*     */ 
/* 118 */         paymengtTraceInfo.setWoPayReturn(isSuccess.get("retCode").toString());
/* 119 */         paymengtTraceInfo.setSmsContent("成功");
/* 120 */         paymengtTraceInfo.setTransactionId(isSuccess.get("transactionId").toString());
/* 121 */         paymengtTraceInfo.setExt(map.get("ext").toString());
/* 122 */         paymengtTraceInfo.setMobile(map.get("mobile").toString());
/* 123 */         paymengtTraceInfo.setSmsFromTo(mobileInfo.getProvinceName());
/* 124 */         String payOrderId = this.myPaymentTraceServiceImpl.createOrder(paymengtTraceInfo);
/*     */ 
/* 127 */         String message = "您好,感谢您订购\"鸿信游戏2.0元道具包\"业务。资费2.0元，不含通信费。请回复验证码:“y”确认订购。【鸿信互通】";
/*     */ 
/* 129 */         PaymengtTraceSmsInfo paymengtTraceSmsInfo = new PaymengtTraceSmsInfo();
/* 130 */         paymengtTraceSmsInfo.setAction("下发短信确认信息");
/*     */ 
/* 132 */         int randNum = this.rand.nextInt(120) + 60;
/* 133 */         paymengtTraceSmsInfo.setCreateDate(new Date(new Date().getTime() - randNum * 1000));
/*     */ 
/* 135 */         paymengtTraceSmsInfo.setSmsContent(message);
/* 136 */         paymengtTraceSmsInfo.setSmsFromTo(spNum + " 发送到" + map.get("mobile").toString());
/* 137 */         paymengtTraceSmsInfo.setTransactionId(payOrderId);
/* 138 */         this.myPaymentTraceServiceImpl.createSmsTrace(paymengtTraceSmsInfo);
/*     */ 
/* 140 */         paymengtTraceSmsInfo.setCreateDate(new Date(new Date().getTime() - randNum * 1000));
/* 141 */         message = "Y";
/* 142 */         paymengtTraceSmsInfo.setSmsContent(message);
/* 143 */         paymengtTraceSmsInfo.setSmsFromTo(map.get("mobile").toString() + " 发送到" + spNum);
/* 144 */         paymengtTraceSmsInfo.setTransactionId(payOrderId);
/* 145 */         this.myPaymentTraceServiceImpl.createSmsTrace(paymengtTraceSmsInfo);
/*     */ 
/* 148 */         PaymengtTraceSmsInfo paymengtTraceSmsInfo2 = new PaymengtTraceSmsInfo();
/* 149 */         paymengtTraceSmsInfo2.setAction("用户计费成功下行短信");
/* 150 */         paymengtTraceSmsInfo2.setCreateDate(new Date());
/* 151 */         paymengtTraceSmsInfo2.setSmsContent("您已经成功定制鸿信游戏 " + paymengtTraceInfo.getFee() + " 元道具包!【鸿信互通】");
/* 152 */         paymengtTraceSmsInfo2.setSmsFromTo(map.get("mobile").toString() + " 上行确认短信到 " + spNum);
/* 153 */         paymengtTraceSmsInfo2.setTransactionId(payOrderId);
/* 154 */         this.myPaymentTraceServiceImpl.createSmsTrace(paymengtTraceSmsInfo2);
/*     */       } else {
/* 156 */         logger.info("payorder-error mobile[" + map.get("mobile").toString() + "] wo_retCode[" + isSuccess.get("retCode").toString() + "] channelId[" + map.get("channelId") + "] ext[" + map.get("ext") + "] payCoin [" + map.get("payCoin") + "]");
/*     */ 
/* 158 */         returnValue.setRet_result(isSuccess.get("retCode").toString());
/*     */       }
/*     */     } catch (Exception e) {
/* 161 */       e.printStackTrace();
/* 162 */       returnValue.setRet_result("1113");
/*     */     } finally {
/* 164 */       response.getWriter().write(returnValue.toString());
/* 165 */       logger.info("payOrder return " + returnValue.toString());
/*     */ 
/* 167 */       logger.info(getClass() + " payOrder end --------------------------- longtime [" + (System.currentTimeMillis() - beginTime.longValue()) + "]");
/*     */     }
/*     */   }
/*     */ 
/*     */   private String getRandomGameId()
/*     */   {
/* 176 */     List idList = new ArrayList();
/* 177 */     idList.add(Integer.valueOf(1));
/* 178 */     idList.add(Integer.valueOf(8));
/* 179 */     return idList.get(this.r.nextInt(2)).toString();
/*     */   }
/*     */ 
/*     */   private PaymengtTraceInfo createTraceInfo(String cityName, String provinceName, String mobile, String ext, String channelId)
/*     */   {
/* 184 */     String gameId = getRandomGameId();
/* 185 */     PaymengtTraceInfo paymengtTraceInfo = new PaymengtTraceInfo();
/* 186 */     paymengtTraceInfo.setAction("1");
/* 187 */     paymengtTraceInfo.setAppname((String)GAME_INFO_MAP.get(gameId));
/* 188 */     paymengtTraceInfo.setCreateTime(new Date());
/* 189 */     paymengtTraceInfo.setFee("2");
/* 190 */     paymengtTraceInfo.setPayMentType("2");
/* 191 */     paymengtTraceInfo.setCity(cityName);
/* 192 */     paymengtTraceInfo.setProvince(provinceName);
/* 193 */     paymengtTraceInfo.setPayStatus(Long.valueOf(0L));
/* 194 */     paymengtTraceInfo.setWoPayReturnDesc(channelId);
/* 195 */     paymengtTraceInfo.setGameId(Long.valueOf(Long.parseLong(gameId)));
/* 196 */     paymengtTraceInfo.setMobile(mobile);
/* 197 */     paymengtTraceInfo.setExt(ext);
/* 198 */     return paymengtTraceInfo;
/*     */   }
/*     */ 
/*     */   public void init(ServletConfig config) throws ServletException {
/* 202 */     super.init(config);
/* 203 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*     */ 
/* 205 */     this.myLimitService = ((LimitService)applicationContext.getBean("myLimitService"));
/*     */ 
/* 207 */     this.mySmsListener = ((SmsListener)applicationContext.getBean("smsJmsMessageListener"));
/* 208 */     this.myPaymentTraceServiceImpl = ((PaymentTraceService)applicationContext.getBean("myPaymentTraceServiceImpl"));
/*     */   }
/*     */ 
/*     */   public static void main(String[] agre)
/*     */   {
/* 213 */     int house = new Date().getHours();
/* 214 */     System.out.println(house);
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/*  42 */     GAME_INFO_MAP.put("1", "愚公移山");
/*  43 */     GAME_INFO_MAP.put("8", "泡泡奥特曼");
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.PayOrderEmailTraceInfoServlet
 * JD-Core Version:    0.6.2
 */
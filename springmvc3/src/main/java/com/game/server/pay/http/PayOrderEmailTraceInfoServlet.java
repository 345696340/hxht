/*     */ package com.game.server.pay.http;
/*     */ 
/*     */ import com.game.server.jms.listener.SmsListener;
/*     */ import com.game.server.model.dto.MobileInfo;
/*     */ import com.game.server.model.dto.PaymengtTraceInfo;
/*     */ import com.game.server.model.dto.PaymengtTraceSmsInfo;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.PaymentTraceService;
/*     */ import com.game.server.util.JsonUtil;
/*     */ import com.game.server.vo.Result;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintStream;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.Reader;
/*     */ import java.text.SimpleDateFormat;
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
/* 194 */   private Random r = new Random();
/*     */ 
/*     */   public static String getRandomString(int length)
/*     */   {
/*  49 */     String base = "0123456789";
/*  50 */     Random random = new Random();
/*  51 */     StringBuffer sb = new StringBuffer();
/*  52 */     for (int i = 0; i < length; i++) {
/*  53 */       int number = random.nextInt(base.length());
/*  54 */       sb.append(base.charAt(number));
/*     */     }
/*  56 */     return sb.toString();
/*     */   }
/*     */ 
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
/*     */   {
/*  61 */     Long beginTime = Long.valueOf(System.currentTimeMillis());
/*  62 */     StringBuffer content = new StringBuffer();
/*     */ 
/*  64 */     response.setContentType("text/html;");
/*  65 */     Result returnValue = new Result();
/*     */ 
/*  67 */     logger.info(getClass() + " payOrder begin --------------------------- ");
/*  68 */     InputStream in = request.getInputStream();
/*  69 */     Reader rData = new InputStreamReader(in);
/*     */     int c;
/*  71 */     while ((c = rData.read()) != -1) {
/*  72 */       content.append((char)c);
/*     */     }
/*  74 */     logger.info("payOrder [" + content.toString() + "]");
/*     */     try {
/*  76 */       int thisHour = new Date().getHours();
/*     */ 
/*  82 */       HashMap map = (HashMap)JsonUtil.json2bean(content.toString(), HashMap.class);
/*  83 */       if ((map.get("mobile") == null) || (map.get("mobile").toString().equals(""))) {
/*  84 */         logger.info("手机号不能为空");
/*  85 */         returnValue.setRet_result("1113");
/*     */       }
/*  88 */       else if ((map.get("channelId") == null) || (map.get("channelId").toString().equals(""))) {
/*  89 */         returnValue.setRet_result("1115");
/*  90 */         logger.info("限制ID不能为空");
/*     */       }
/*  93 */       else if ((map.get("ext") == null) || (map.get("ext").toString().equals(""))) {
/*  94 */         returnValue.setRet_result("1114");
/*  95 */         logger.info("渠道不能为空");
/*     */       }
/*  98 */       else if ((map.get("payCoin") == null) || (map.get("payCoin").toString().equals(""))) {
/*  99 */         returnValue.setRet_result("1114");
/* 100 */         logger.info("计费金额不能为空");
/*     */       }
/*     */       else {
/* 103 */         String limitId = (String)map.get("channelId");
/* 104 */         map.put("limitId", map.get("channelId"));
/*     */ 
/* 106 */         boolean vali = this.myLimitService.validate(limitId, (String)map.get("mobile"));
/*     */ 
/* 108 */         if (!vali) {
/* 109 */           returnValue.setRet_result("1111");
/*     */         }
/*     */         else {
/* 112 */           MobileInfo mobileInfo = this.myLimitService.getMobileInfo(((String)map.get("mobile")).substring(0, 7));
/* 113 */           map.put("PROVINCE_CODE", Long.valueOf(mobileInfo.getProvinceId().longValue()));
/* 114 */           map.put("PROVINCE_NAME", mobileInfo.getProvinceName());
/* 115 */           map.put("CITY_CODE", Long.valueOf(mobileInfo.getCityId().longValue()));
/* 116 */           map.put("CITY_NAME", mobileInfo.getCityName());
/* 117 */           map.put("EXT", map.get("ext").toString());
/* 118 */           HashMap isSuccess = this.mySmsListener.pay(map);
/* 119 */           logger.info("wo 计费返回 retCode [" + isSuccess + "] longtime [" + (System.currentTimeMillis() - beginTime.longValue()) + "]");
/*     */ 
/* 123 */           if (isSuccess.get("retCode").toString().equals("0000")) {
/* 124 */             String spNum = "10655516002";
/* 125 */             String keyPass = getRandomString(4);
/* 126 */             returnValue.setRet_result(isSuccess.get("retCode").toString());
/* 127 */             PaymengtTraceInfo paymengtTraceInfo = createTraceInfo(mobileInfo.getCityName(), mobileInfo.getProvinceName(), map.get("mobile").toString(), map.get("ext").toString(), map.get("channelId").toString());
/*     */ 
/* 129 */             paymengtTraceInfo.setWoPayReturn(isSuccess.get("retCode").toString());
/* 130 */             paymengtTraceInfo.setSmsContent("成功");
/* 131 */             paymengtTraceInfo.setTransactionId(isSuccess.get("transactionId").toString());
/* 132 */             paymengtTraceInfo.setExt(map.get("ext").toString());
/* 133 */             paymengtTraceInfo.setMobile(map.get("mobile").toString());
/* 134 */             paymengtTraceInfo.setSmsFromTo(mobileInfo.getProvinceName());
/* 135 */             paymengtTraceInfo.setFee(map.get("payCoin").toString());
/* 136 */             String payOrderId = this.myPaymentTraceServiceImpl.createOrder(paymengtTraceInfo);
/* 137 */             Date nowDate = new Date();
/* 138 */             int randNum = this.rand.nextInt(120) + 60;
/*     */ 
/* 141 */             PaymengtTraceSmsInfo paymengtTraceSmsInfoStart = new PaymengtTraceSmsInfo();
/* 142 */             paymengtTraceSmsInfoStart.setAction("用户获取支付验证码");
/* 143 */             paymengtTraceSmsInfoStart.setCreateDate(nowDate);
/* 144 */             paymengtTraceSmsInfoStart.setTransactionId(payOrderId);
/* 145 */             logger.info("用户获取支付验证码 : " + payOrderId);
/* 146 */             this.myPaymentTraceServiceImpl.createSmsTrace(paymengtTraceSmsInfoStart);
/* 147 */             String message = "您好,感谢您订购\"鸿信游戏" + map.get("payCoin").toString() + ".0元道具包\"业务。资费" + map.get("payCoin").toString() + ".0元，不含通信费。请回复验证码:“" + keyPass + "”确认订购。【鸿信互通】";
/* 148 */             PaymengtTraceSmsInfo paymengtTraceSmsInfo = new PaymengtTraceSmsInfo();
/* 149 */             paymengtTraceSmsInfo.setAction("平台下发验证码短信");
/* 150 */             paymengtTraceSmsInfo.setCreateDate(nowDate);
/* 151 */             paymengtTraceSmsInfo.setSmsContent("您好,感谢您订购\"鸿信游戏" + map.get("payCoin").toString() + ".0元道具包\"业务。资费" + map.get("payCoin").toString() + ".0元，不含通信费。请回复验证码:“" + keyPass + "”确认订购。【鸿信互通】");
/* 152 */             paymengtTraceSmsInfo.setSmsFromTo(spNum + "->" + map.get("mobile").toString());
/* 153 */             paymengtTraceSmsInfo.setTransactionId(payOrderId);
/* 154 */             this.myPaymentTraceServiceImpl.createSmsTrace(paymengtTraceSmsInfo);
/*     */ 
/* 156 */             PaymengtTraceSmsInfo paymengtTraceSmsInfo1 = new PaymengtTraceSmsInfo();
/* 157 */             Date upDate = new Date(nowDate.getTime() + this.rand.nextInt(120) * 1000);
/*     */ 
/* 159 */             paymengtTraceSmsInfo1.setCreateDate(upDate);
/* 160 */             message = keyPass;
/* 161 */             paymengtTraceSmsInfo1.setSmsContent(message);
/* 162 */             paymengtTraceSmsInfo1.setSmsFromTo(map.get("mobile").toString() + "->" + spNum);
/* 163 */             paymengtTraceSmsInfo1.setTransactionId(payOrderId);
/* 164 */             paymengtTraceSmsInfo1.setAction("用户确认支付");
/* 165 */             this.myPaymentTraceServiceImpl.createSmsTrace(paymengtTraceSmsInfo1);
/*     */ 
/* 167 */             Date sumDate = new Date(upDate.getTime() + this.rand.nextInt(3) * 1000);
/*     */ 
/* 169 */             PaymengtTraceSmsInfo paymengtTraceSmsInfo2 = new PaymengtTraceSmsInfo();
/* 170 */             paymengtTraceSmsInfo2.setAction("计费成功通知短信");
/* 171 */             paymengtTraceSmsInfo2.setCreateDate(sumDate);
/* 172 */             paymengtTraceSmsInfo2.setSmsContent("您已经成功定制鸿信游戏 " + paymengtTraceInfo.getFee() + " 元道具包!【鸿信互通】");
/* 173 */             paymengtTraceSmsInfo2.setSmsFromTo(spNum + "->" + map.get("mobile").toString());
/* 174 */             paymengtTraceSmsInfo2.setTransactionId(payOrderId);
/* 175 */             this.myPaymentTraceServiceImpl.createSmsTrace(paymengtTraceSmsInfo2);
/*     */           } else {
/* 177 */             logger.info("payorder-error mobile[" + map.get("mobile").toString() + "] wo_retCode[" + isSuccess.get("retCode").toString() + "] channelId[" + map.get("channelId") + "] ext[" + map.get("ext") + "] payCoin [" + map.get("payCoin") + "]");
/*     */ 
/* 179 */             returnValue.setRet_result(isSuccess.get("retCode").toString());
/*     */           }
/*     */         }
/*     */       } } catch (Exception e) { e.printStackTrace();
/* 183 */       returnValue.setRet_result("1113");
/*     */     } finally {
/* 185 */       response.getWriter().write(returnValue.toString());
/* 186 */       logger.info("payOrder return " + returnValue.toString());
/*     */ 
/* 188 */       logger.info(getClass() + " payOrder end --------------------------- longtime [" + (System.currentTimeMillis() - beginTime.longValue()) + "]");
/*     */     }
/*     */   }
/*     */ 
/*     */   private String getRandomGameId()
/*     */   {
/* 197 */     List idList = new ArrayList();
/* 198 */     idList.add(Integer.valueOf(1));
/* 199 */     idList.add(Integer.valueOf(8));
/* 200 */     return idList.get(this.r.nextInt(2)).toString();
/*     */   }
/*     */ 
/*     */   private PaymengtTraceInfo createTraceInfo(String cityName, String provinceName, String mobile, String ext, String channelId)
/*     */   {
/* 205 */     String gameId = getRandomGameId();
/* 206 */     PaymengtTraceInfo paymengtTraceInfo = new PaymengtTraceInfo();
/* 207 */     paymengtTraceInfo.setAction("1");
/* 208 */     paymengtTraceInfo.setAppname((String)GAME_INFO_MAP.get(gameId));
/* 209 */     paymengtTraceInfo.setCreateTime(new Date());
/* 210 */     paymengtTraceInfo.setFee("2");
/* 211 */     paymengtTraceInfo.setPayMentType("2");
/* 212 */     paymengtTraceInfo.setCity(cityName);
/* 213 */     paymengtTraceInfo.setProvince(provinceName);
/* 214 */     paymengtTraceInfo.setPayStatus(Long.valueOf(0L));
/* 215 */     paymengtTraceInfo.setWoPayReturnDesc(channelId);
/* 216 */     paymengtTraceInfo.setGameId(Long.valueOf(Long.parseLong(gameId)));
/* 217 */     paymengtTraceInfo.setMobile(mobile);
/* 218 */     paymengtTraceInfo.setExt(ext);
/* 219 */     return paymengtTraceInfo;
/*     */   }
/*     */ 
/*     */   public void init(ServletConfig config) throws ServletException {
/* 223 */     super.init(config);
/* 224 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*     */ 
/* 226 */     this.myLimitService = ((LimitService)applicationContext.getBean("myLimitService"));
/*     */ 
/* 228 */     this.mySmsListener = ((SmsListener)applicationContext.getBean("smsJmsMessageListener"));
/* 229 */     this.myPaymentTraceServiceImpl = ((PaymentTraceService)applicationContext.getBean("myPaymentTraceServiceImpl"));
/*     */   }
/*     */ 
/*     */   public static void main(String[] agre)
/*     */   {
/* 234 */     Random rand = new Random();
/* 235 */     Date nowDate = new Date();
/* 236 */     int randNum = rand.nextInt(120) + 60;
/*     */ 
/* 238 */     Date upDate = new Date(nowDate.getTime() + rand.nextInt(120) * 1000);
/*     */ 
/* 240 */     Date sumDate = new Date(upDate.getTime() + rand.nextInt(3) * 1000);
/* 241 */     System.out.println(new SimpleDateFormat("yyyyMMdd hh:mm:ss").format(nowDate));
/* 242 */     System.out.println(new SimpleDateFormat("yyyyMMdd hh:mm:ss").format(upDate));
/* 243 */     System.out.println(new SimpleDateFormat("yyyyMMdd hh:mm:ss").format(sumDate));
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/*  42 */     GAME_INFO_MAP.put("1", "愚公移山");
/*  43 */     GAME_INFO_MAP.put("8", "泡泡奥特曼");
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.PayOrderEmailTraceInfoServlet
 * JD-Core Version:    0.6.2
 */
/*     */ package com.game.server.pay.http;
/*     */ 
/*     */ import com.game.server.model.dto.PaymengtTraceInfo;
/*     */ import com.game.server.service.PaymentTraceService;
/*     */ import com.game.server.service.RedisService;
/*     */ import com.game.server.util.JsonUtil;
/*     */ import com.game.server.vo.response.PaymengtQueryTraceResponse;
/*     */ import com.game.server.vo.response.PaymengtQueryTraceResponse.TraceInfos;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.lang.reflect.Method;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Random;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.spec.SecretKeySpec;
/*     */ import javax.servlet.ServletConfig;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.web.context.support.WebApplicationContextUtils;
/*     */
/*     */ public class PayOrderQueryTraceInfoServlet extends HttpServletBase
/*     */ {
/*     */   private PaymentTraceService myPaymentTraceServiceImpl;
/*     */   private RedisService redisService;
/*  33 */   private static final Logger logger = Logger.getLogger("A1");
/*     */
/*  86 */   Random rand = new Random();
/*     */
/*     */   public static String encodeBase64(byte[] input)
/*     */     throws Exception
/*     */   {
/*  39 */     Class clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
/*     */ 
/*  41 */     Method mainMethod = clazz.getMethod("encode", byte[].class);
/*  42 */     mainMethod.setAccessible(true);
/*  43 */     Object retObj = mainMethod.invoke(null, new Object[] { input });
/*  44 */     return (String)retObj;
/*     */   }
/*     */
/*     */   public static void main(String[] agre) {
/*     */     try {
/*  49 */       System.out.println(encodeBase64(new String("sdafas;ldfja;fjsalk;dfj").getBytes()));
/*     */     } catch (Exception e) {
/*  51 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */
/*     */   public static String Encrypt(String sSrc, String sKey)
/*     */     throws Exception
/*     */   {
/*  58 */     if (sKey == null) {
/*  59 */       System.out.print("Key为空null");
/*  60 */       return null;
/*     */     }
/*     */ 
/*  63 */     if (sKey.length() != 16) {
/*  64 */       System.out.print("Key长度不是16位");
/*  65 */       return null;
/*     */     }
/*  67 */     byte[] raw = sKey.getBytes("utf-8");
/*  68 */     SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
/*  69 */     Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
/*  70 */     cipher.init(1, skeySpec);
/*  71 */     byte[] encrypted = cipher.doFinal(sSrc.getBytes("utf-8"));
/*  72 */     return encodeBase64(encrypted);
/*     */   }
/*     */
/*     */   public static String getRandomString(int length) {
/*  76 */     String base = "0123456789";
/*  77 */     Random random = new Random();
/*  78 */     StringBuffer sb = new StringBuffer();
/*  79 */     for (int i = 0; i < length; i++) {
/*  80 */       int number = random.nextInt(base.length());
/*  81 */       sb.append(base.charAt(number));
/*     */     }
/*  83 */     return sb.toString();
/*     */   }
/*     */
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/*     */     throws ServletException, IOException
/*     */   {
/*  90 */     PaymengtQueryTraceResponse queryTraceResponse = new PaymengtQueryTraceResponse();
/*     */     try {
/*  92 */       StringBuffer content = new StringBuffer();
/*  93 */       request.setCharacterEncoding("gbk");
/*  94 */       response.setContentType("text/html; charset=gbk");
/*     */ 
/*  96 */       logger.info(getClass() + " PayOrderQueryTraceInfoServlet begin --------------------------- ");
/*     */ 
/*  99 */       InputStream in = request.getInputStream();
/* 100 */       Reader rData = new InputStreamReader(in);
/*     */       int c;
/* 102 */       while ((c = rData.read()) != -1) {
/* 103 */         content.append((char)c);
/*     */       }
/* 105 */       logger.info("PayOrderQueryTraceInfoServlet content [" + content.toString() + "]");
/* 106 */       HashMap req = (HashMap)JsonUtil.json2bean(content.toString(), HashMap.class);
/* 107 */       logger.info("PayOrderQueryTraceInfoServlet HashMap : " + req);
/* 108 */       String transactionId = (String)req.get("transactionId");
/* 109 */       queryTraceResponse.setTransactionId(transactionId);
/*     */       String json;
/* 110 */       if ((transactionId == null) || (transactionId.equals(""))) {
/* 111 */         queryTraceResponse.setResultCode("9998");
/* 112 */         queryTraceResponse.setResultDescription("transactionId不能为空!");
/*     */       }
/*     */       else {
/* 115 */         PaymengtTraceInfo paymengtTraceInfo = this.myPaymentTraceServiceImpl.getPaymengtTraceInfo(transactionId);
/*     */
/* 116 */         if (paymengtTraceInfo == null) {
/* 117 */           queryTraceResponse.setResultCode("9997");
/* 118 */           queryTraceResponse.setResultDescription("transactionId 找不到!");
/*     */         }
/*     */         else {
/* 121 */           String spNum = "10655516002";
/* 122 */           String rand = this.redisService.get(transactionId);
/* 123 */           int randomSS = this.redisService.get(transactionId + "DATE") == null ? 0 : Integer.parseInt(this.redisService.get(transactionId + "DATE"));
/* 124 */           if (randomSS == 0) {
/* 125 */             randomSS = (int)(Math.random() * 200.0D);
/*     */           }
/* 127 */           if ((rand == null) || (rand.equals(""))) {
/* 128 */             rand = getRandomString(4);
/* 129 */             this.redisService.set(transactionId, rand);
/* 130 */             this.redisService.set(transactionId + "DATE", String.valueOf(randomSS));
/*     */           }
/* 132 */           Date randomDate = new Date(paymengtTraceInfo.getCreateTime().getTime() + randomSS * 1000);
/* 133 */           for (int i = 0; i < 4; i++)
/*     */           {
                    PaymengtQueryTraceResponse.TraceInfos t = new PaymengtQueryTraceResponse().new TraceInfos();
/* 136 */             if (i == 0) {
/* 137 */               t.setTime(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(paymengtTraceInfo.getCreateTime()));
/* 138 */               t.setAction("用户获取支付验证码");
/* 139 */               t.setDescription(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(paymengtTraceInfo.getCreateTime()) + "|paymentUser：" + paymengtTraceInfo.getMobile() + "|" + transactionId + "|subject：鸿信游戏" + paymengtTraceInfo.getFee() + ".0元道具包| description：| price：" + paymengtTraceInfo.getFee() + ".0|quantity：1|totalFee：" + paymengtTraceInfo.getFee() + ".0| 。");
/* 140 */               t.setSmsFromTo("应用->WO+计费平台");
/* 141 */               t.setSmsContent(paymengtTraceInfo.getMobile() + "发起购买:" + paymengtTraceInfo.getFee() + ".0元道具包业务:金额:" + paymengtTraceInfo.getFee() + ".0");
/*     */             }
/* 143 */             if (i == 1) {
/* 144 */               t.setAction("平台向用户下发验证码");
/* 145 */               t.setSmsContent("您好,感谢您订购鸿信游戏" + paymengtTraceInfo.getFee() + ".0元道具包业务。资费" + paymengtTraceInfo.getFee() + ".0元，不含通信费。请回填验证码:“" + rand + "”确认订购。【联通APP计费】");
/* 146 */               t.setSmsFromTo(spNum + "->" + paymengtTraceInfo.getMobile());
/* 147 */               t.setTime(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(paymengtTraceInfo.getCreateTime()));
/*     */             }
/* 149 */             if (i == 2) {
/* 150 */               t.setAction("用户确认支付");
/* 151 */               t.setTime(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(randomDate));
/*     */ 
/* 153 */               t.setDescription(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(randomDate) + "|price：" + paymengtTraceInfo.getFee() + ".0|" + "totalFee：" + paymengtTraceInfo.getFee() + ".0" + "|timeStamp:" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(randomDate) + "|paymentUser：" + paymengtTraceInfo.getMobile() + "|outTradeNo:" + transactionId + "|subject：鸿信游戏" + paymengtTraceInfo.getFee() + ".0元道具包| description：| quantity：1| 。");
/* 154 */               t.setSmsContent("用户回填验证码" + rand + "，确认支付");
/* 155 */               t.setSmsFromTo("应用->WO+计费平台");
/*     */             }
/* 157 */             if (i == 3) {
/* 158 */               t.setTime(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(randomDate));
/* 159 */               t.setAction("计费成功通知短信");
/* 160 */               t.setSmsFromTo(spNum + "->" + paymengtTraceInfo.getMobile());
/* 161 */               t.setMessageContext("尊敬的用户，您已成功购买游戏支付的鸿信游戏" + paymengtTraceInfo.getFee() + ".0元道具包，支付金额" + paymengtTraceInfo.getFee() + ".0元。咨询电话：4000600611。【联通APP计费】");
/*     */             }
/* 163 */             queryTraceResponse.addTraceInfos(t);
/* 175 */           }
/*     */ queryTraceResponse.setResultCode("0");
/* 176 */           queryTraceResponse.setResultDescription("success");
/*     */
/*     */           return;
/*     */         }
/*     */       } } catch (Exception e) { queryTraceResponse.setResultCode("9999");
/* 179 */       queryTraceResponse.setResultDescription("系统错误!");
/* 180 */       e.printStackTrace();
/*     */       String json;
/*     */       return;
/*     */     } finally { String json = JsonUtil.bean2json(queryTraceResponse);
/* 183 */       logger.info("PayOrderQueryTraceInfoServlet end [" + json + "]");
/* 184 */       response.getWriter().write(json); }
/*     */   }
/*     */
/*     */   public void init(ServletConfig config)
/*     */     throws ServletException
/*     */   {
/* 190 */     super.init(config);
/* 191 */     ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
/*     */ 
/* 193 */     this.myPaymentTraceServiceImpl = ((PaymentTraceService)applicationContext.getBean("myPaymentTraceServiceImpl"));
/*     */ 
/* 195 */     this.redisService = ((RedisService)applicationContext.getBean("redisService"));
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.pay.http.PayOrderQueryTraceInfoServlet
 * JD-Core Version:    0.6.2
 */
/*     */ package com.game.server.jms.listener;
/*     */ 
/*     */ import com.core.sgip.client.SGIPClient;
/*     */ import com.game.server.jms.send.MoEmailJmsSend;
/*     */ import com.game.server.model.dto.GamePayChannel;
/*     */ import com.game.server.model.dto.MobileInfo;
/*     */ import com.game.server.model.dto.PayOrderGameConfig;
/*     */ import com.game.server.model.dto.PayOrderGameConfigExample;
/*     */ import com.game.server.model.dto.PayOrderGameConfigExample.Criteria;
/*     */ import com.game.server.model.dto.PayOrderInfo;
/*     */ import com.game.server.model.dto.PayOrderLimitDate;
/*     */ import com.game.server.model.dto.PaymengtTraceInfo;
/*     */ import com.game.server.model.dto.SmsPayOrderExample;
/*     */
/*     */ import com.game.server.model.dto.SmsPayOrderMonth;
/*     */ import com.game.server.model.dto.SmsPayOrderMonthExample;
/*     */
/*     */ import com.game.server.model.dto.impl.GamePayChannelMapper;
/*     */ import com.game.server.model.dto.impl.MobileInfoMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderGameConfigMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderInfoMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderLimitDateMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderMapper;
/*     */ import com.game.server.model.dto.impl.SmsPayOrderMapper;
/*     */ import com.game.server.model.dto.impl.SmsPayOrderMonthMapper;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.PaymentTraceService;
/*     */ import com.game.server.service.RedisService;
/*     */ import com.game.server.service.ReportService;
/*     */ import com.game.server.util.EncodeUtils2;
/*     */ import com.game.server.util.JdbCached;
/*     */ import com.game.server.util.JsonUtil;
/*     */ import com.game.server.util.ObjectToString;
/*     */ import com.game.server.util.SmsUtil;
/*     */ import com.tdt.unicom.domains.Deliver;
/*     */ import com.tdt.unicom.sgip.svr.SPSender;
/*     */ import com.tdt.unicom.spsvr.MTReq;
/*     */ import com.tdt.unicom.util.SubmitMap;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.URLEncoder;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import javax.jms.JMSException;
/*     */ import javax.jms.Message;
/*     */ import javax.jms.MessageListener;
/*     */ import javax.jms.ObjectMessage;
/*     */ import org.apache.http.HttpEntity;
/*     */ import org.apache.http.HttpResponse;
/*     */ import org.apache.http.client.methods.HttpPost;
/*     */ import org.apache.http.entity.StringEntity;
/*     */ import org.apache.http.impl.client.DefaultHttpClient;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class SmsListener
/*     */   implements MessageListener
/*     */ {
/*     */   SmsDeliverMessageConverter smsDeliverMessageConverter;
/*     */   LimitService myLimitService;
/*     */   RedisService redisService;
/*  42 */   private static final HashMap<String, String> GAME_INFO_MAP = new HashMap();
/*     */   private PaymentTraceService myPaymentTraceServiceImpl;
/*     */   private PayOrderGameConfigMapper myPayOrderGameConfigMapper;
/*     */   private PayOrderLimitDateMapper myPayOrderLimitDateMapper;
/*     */   private GamePayChannelMapper myGamePayChannelMapper;
/*     */   private SmsPayOrderMapper mySmsPayOrderMapper;
/*     */   private PayOrderMapper myPayOrderMapper;
/*     */   private MoEmailJmsSend myMoJmsSend;
/*     */   public PayOrderInfoMapper myPayOrderInfoDAO;
/*     */   private SmsPayOrderMonthMapper mySmsPayOrderMonthMapper;
/*  77 */   public static SPSender sender = SPSender.getInstance(SubmitMap.submitMap);
/*     */   private ReportService myReportService;
/*     */   private MobileInfoMapper mobileInfoMapper;
/*     */   private Random r;
/*  81 */   private static final Logger logger = Logger.getLogger("A1");
/*     */ 
/*     */   public SmsListener()
/*     */   {
/*  38 */     this.smsDeliverMessageConverter = new SmsDeliverMessageConverter();
/*     */ 
/*  74 */     this.r = new Random();
/*     */   }
/*     */ 
/*     */   public void onMessage(Message message)
/*     */   {
/*  85 */     logger.info("短信接收MQ -------------------start------------------------------------- ");
/*  86 */     ObjectMessage objectMessage = (ObjectMessage)message;
/*  87 */     ObjectToString objUtil = new ObjectToString();
/*     */     try {
/*  89 */       Deliver deliver = (Deliver)this.smsDeliverMessageConverter.fromMessage(message);
/*  90 */       logger.info(objUtil.outObjPropertyString(deliver));
/*     */ 
/*  92 */       if ((deliver != null) && ((deliver.getMessageContent().equals("tdhx1")) || (deliver.getMessageContent().equals("tdhx10")) || (deliver.getMessageContent().equals("tdhx15")))) {
/*  93 */         logger.info("用户退订业务 " + objUtil.outObjPropertyString(deliver));
/*  94 */         SmsPayOrderMonthExample example = new SmsPayOrderMonthExample();
/*  95 */         SmsPayOrderMonthExample.Criteria c = example.createCriteria();
/*  96 */         c.andUserNumberEqualTo(deliver.getUserNumber());
/*  97 */         c.andIsTdIsNull();
/*  98 */         c.andReprotStatusEqualTo(Integer.valueOf(2));
/*  99 */         c.andErrorCodeEqualTo(Long.valueOf(100L));
/* 100 */         if (deliver.getMessageContent().equals("tdhx1")) {
/* 101 */           c.andCpContentEqualTo("hxby1");
/*     */         }
/* 103 */         if (deliver.getMessageContent().equals("tdhx10")) {
/* 104 */           c.andCpContentEqualTo("hxby10");
/*     */         }
/* 106 */         if (deliver.getMessageContent().equals("tdhx15")) {
/* 107 */           c.andCpContentEqualTo("hxby15");
/*     */         }
/* 109 */         example.setTableName(new SimpleDateFormat("yyyyMM").format(new Date()));
/* 110 */         List list = this.mySmsPayOrderMonthMapper.selectByExample(example);
/* 111 */         if ((list != null) && (list.size() > 0)) { SmsPayOrderMonth smsPayOrder = (SmsPayOrderMonth)list.get(0);
/* 113 */           logger.info("退订业务 : " + objUtil.outObjPropertyString(smsPayOrder));
/* 114 */           smsPayOrder.setIsTd(Long.valueOf(2L));
/*     */ 
/* 116 */           smsPayOrder.setTdDate(new Date());
/* 117 */           smsPayOrder.setTableName(new SimpleDateFormat("yyyyMM").format(new Date()));
/* 118 */           SmsPayOrderExample exampleForUpdate = new SmsPayOrderExample();
/* 119 */           exampleForUpdate.createCriteria().andUidEqualTo(smsPayOrder.getUid());
/*     */ 
/* 121 */           this.mySmsPayOrderMonthMapper.updateByPrimaryKey(smsPayOrder);
/* 122 */           String returnValue = this.myReportService.httpGet("http://123.196.120.81:8001/sms/TD/HXBY_Uin_TD.ashx?mobile=" + smsPayOrder.getUserNumber() + "&linkid=" + smsPayOrder.getLinkId());
/* 123 */           logger.info("上报短信退订业务 url [http://123.196.120.81:8001/sms/TD/HXBY_Uin_TD.ashx?mobile=" + smsPayOrder.getUserNumber() + "&linkid=" + smsPayOrder.getLinkId() + "] returnValue [" + returnValue + "]");
/*     */           return; } logger.info("找不到的订单 id [" + deliver.getLinkID() + "]");
/*     */       }
/*     */ 
/* 131 */       PayOrderGameConfigExample example = new PayOrderGameConfigExample();
/* 132 */       example.createCriteria().andCpContentEqualTo(deliver.getMessageContent());
/* 133 */       List payOrderGameConfigs = this.myPayOrderGameConfigMapper.selectByExample(example);
/*     */ 
/* 135 */       if (payOrderGameConfigs.size() <= 0) {
/* 136 */         logger.info("系统配置错误");
/* 137 */         logger.info("短信接收MQ -------------------end---------------------------------------- ");
/*     */       }
/*     */       else
/*     */       {
/* 141 */         PayOrderLimitDate payOrderLimitDate = this.myPayOrderLimitDateMapper.selectByPrimaryKey(new Long(((PayOrderGameConfig)payOrderGameConfigs.get(0)).getLimitId()));
/* 142 */         if (payOrderLimitDate == null) {
/* 143 */           logger.info("限制为空 ");
/* 144 */           logger.info("短信接收MQ -------------------end---------------------------------------- ");
/*     */         }
/*     */         else {
/* 147 */           PayOrderGameConfig payOrderGameConfig = (PayOrderGameConfig)payOrderGameConfigs.get(0);
/*     */ 
/* 149 */           if (payOrderGameConfig.getType().equals(Integer.valueOf(0))) {
/* 150 */             logger.info("次配置是WO+ 接口 : " + payOrderGameConfigs.toString());
/* 151 */             String userNumber = deliver.getUserNumber();
/* 152 */             if ((userNumber == null) || (userNumber.equals("")))
/*     */             {
/* 154 */               throw new Exception("手机号不能为空! ");
/*     */             }
/* 156 */             userNumber = userNumber.substring(2, 13);
/* 157 */             boolean vali = this.myLimitService.validate(payOrderLimitDate.getId(), userNumber);
/* 158 */             if (vali) {
/*     */               try {
/* 160 */                 HashMap map = new HashMap();
/* 161 */                 System.out.println("------------------------------------------------------------------------------------------------------------------- 开始计费");
/* 162 */                 System.out.println("mobile:" + userNumber + "payCoin:" + payOrderGameConfig.getAmont());
/* 163 */                 map.put("mobile", userNumber);
/* 164 */                 logger.info("payOrderGameConfig.getAmont() 支付的金额: " + payOrderGameConfig.getAmont());
/* 165 */                 map.put("payCoin", payOrderGameConfig.getAmont());
/* 166 */                 map.put("limitId", payOrderLimitDate.getId());
/* 167 */                 map.put("content", deliver.getMessageContent());
/* 168 */                 MobileInfo mobileInfo = this.myLimitService.getMobileInfo(userNumber.substring(0, 7));
/* 169 */                 if (mobileInfo != null) {
/* 170 */                   map.put("PROVINCE_CODE", Long.valueOf(mobileInfo.getProvinceId().longValue()));
/* 171 */                   map.put("PROVINCE_NAME", mobileInfo.getProvinceName());
/* 172 */                   map.put("CITY_CODE", Long.valueOf(mobileInfo.getCityId().longValue()));
/* 173 */                   map.put("CITY_NAME", mobileInfo.getCityName());
/* 174 */                   map.put("EXT", payOrderLimitDate.getId().toString());
/*     */                 }
/*     */ 
/* 177 */                 logger.info("参数设置结束，请求的计费参数为 : " + map);
/* 178 */                 HashMap result = pay(map);
/* 179 */                 System.out.println("------------------------------------------------------------------------------------------------------------------- 计费结束");
/* 180 */                 logger.info("hashMap content :" + result);
/* 181 */                 System.out.println("hashMap content :" + result);
/* 182 */                 String returnValue = "";
/* 183 */                 String url = "";
/*     */                 String payOrderId;
/* 184 */                 if (result.get("transactionId") == null) {
/* 185 */                   url = payOrderGameConfig.getMrUrl() + "mobile=" + userNumber + "&linkid=&code=" + result.get("retCode") + "&status=1";
/* 186 */                   returnValue = this.myReportService.httpGet(url);
/*     */                 }
/*     */                 else {
/* 189 */                   url = payOrderGameConfig.getMrUrl() + "mobile=" + userNumber + "&linkid=" + result.get("transactionId") + "&code=" + result.get("retCode") + "&status=0";
/* 190 */                   returnValue = this.myReportService.httpGet(url);
/* 191 */                   PaymengtTraceInfo paymengtTraceInfo = createTraceInfo(mobileInfo.getCityName(), mobileInfo.getProvinceName(), userNumber, deliver.getMessageContent(), payOrderLimitDate.getId());
/*     */ 
/* 193 */                   paymengtTraceInfo.setWoPayReturn(result.get("retCode").toString());
/* 194 */                   paymengtTraceInfo.setSmsContent("成功");
/* 195 */                   paymengtTraceInfo.setTransactionId(result.get("transactionId").toString());
/* 196 */                   paymengtTraceInfo.setExt("");
/* 197 */                   paymengtTraceInfo.setMobile(userNumber);
/* 198 */                   paymengtTraceInfo.setSmsFromTo(mobileInfo.getProvinceName());
/* 199 */                   paymengtTraceInfo.setFee(map.get("payCoin").toString());
/* 200 */                   payOrderId = this.myPaymentTraceServiceImpl.createOrder(paymengtTraceInfo);
/*     */                 }
/* 202 */                 logger.info("userNumber:" + userNumber + " 上报地址:" + url);
/* 203 */                 logger.info(result.get("transactionId") + "&code=" + result.get("retCode") + "&status=0");
/*     */               }
/*     */               catch (Exception e) {
/* 206 */                 e.printStackTrace();
/*     */               }
/*     */             } else {
/* 209 */               logger.info("上报地址:wo+smsaddress:" + payOrderGameConfig.getMrUrl() + "mobile=" + userNumber + "&linkid=&code=1113" + "&status=1");
/* 210 */               String returnValue = this.myReportService.httpGet(payOrderGameConfig.getMrUrl() + "mobile=" + userNumber + "&linkid=&code=1113" + "&status=1");
/* 211 */               logger.info("mobile:" + userNumber + " 上报结果:" + returnValue);
/*     */             }
/*     */           }
/* 214 */           if (payOrderGameConfig.getType().equals(Integer.valueOf(1))) {
/* 215 */             logger.info("次配置是短信接口 : " + payOrderGameConfigs.toString());
/* 216 */             boolean vali = this.myLimitService.validate(payOrderLimitDate.getId(), deliver.getUserNumber().substring(2, deliver.getUserNumber().length()));
/* 217 */             if (vali)
/*     */             {
/* 219 */               ArrayList mobiles = new ArrayList();
/* 220 */               mobiles.add(deliver.getUserNumber());
/* 221 */               MTReq mtReq = new MTReq();
/* 222 */               mtReq.setLinkId(deliver.getLinkID());
/* 223 */               mtReq.setFeeType(2);
/* 224 */               mtReq.setCharNum(new String[] { deliver.getUserNumber() });
/* 225 */               mtReq.setFeeValue(payOrderGameConfig.getAmont());
/* 226 */               mtReq.setServiceType(payOrderGameConfig.getServiceType());
/* 227 */               mtReq.setMessageContent(payOrderGameConfig.getSmsReturnContent());
/* 228 */               mtReq.setPhoneList(mobiles);
/* 229 */               mtReq.setReportFlag("1");
/* 230 */               mtReq.setSpNumber(payOrderGameConfig.getSpnumber().toString());
/* 231 */               logger.info(" userNumber [" + deliver.getUserNumber() + "] messageContent [" + deliver.getMessageContent() + "]");
/* 232 */               HashMap value = new HashMap();
/* 233 */               value.put("cpContent", deliver.getMessageContent());
/* 234 */               value.put("limitId", payOrderLimitDate.getId());
/* 235 */               JdbCached.addMap(deliver.getUserNumber(), value);
/* 236 */               sender.addTask(mtReq);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (JMSException e) {
/* 243 */       e.printStackTrace();
/*     */     } catch (UnsupportedEncodingException e) {
/* 245 */       e.printStackTrace();
/*     */     } catch (Exception e) {
/* 247 */       e.printStackTrace();
/*     */     } finally {
/* 249 */       logger.info("?跺?扮?ㄦ?风??淇′?琛?璇? -------------------end---------------------------------------- ");
/*     */     }
/*     */   }
/*     */ 
/*     */   private String getRandomGameId()
/*     */   {
/* 256 */     List idList = new ArrayList();
/* 257 */     idList.add(Integer.valueOf(1));
/* 258 */     idList.add(Integer.valueOf(8));
/* 259 */     return idList.get(this.r.nextInt(2)).toString();
/*     */   }
/*     */ 
/*     */   private PaymengtTraceInfo createTraceInfo(String cityName, String provinceName, String mobile, String ext, String channelId) {
/* 263 */     String gameId = getRandomGameId();
/* 264 */     PaymengtTraceInfo paymengtTraceInfo = new PaymengtTraceInfo();
/* 265 */     paymengtTraceInfo.setAction("1");
/* 266 */     paymengtTraceInfo.setAppname((String)GAME_INFO_MAP.get(gameId));
/* 267 */     paymengtTraceInfo.setCreateTime(new Date());
/* 268 */     paymengtTraceInfo.setFee("2");
/* 269 */     paymengtTraceInfo.setPayMentType("2");
/* 270 */     paymengtTraceInfo.setCity(cityName);
/* 271 */     paymengtTraceInfo.setProvince(provinceName);
/* 272 */     paymengtTraceInfo.setPayStatus(Long.valueOf(0L));
/* 273 */     paymengtTraceInfo.setWoPayReturnDesc(channelId);
/* 274 */     paymengtTraceInfo.setGameId(Long.valueOf(Long.parseLong(gameId)));
/* 275 */     paymengtTraceInfo.setMobile(mobile);
/* 276 */     paymengtTraceInfo.setExt(ext);
/* 277 */     return paymengtTraceInfo;
/*     */   }
/*     */ 
/*     */   public static void main(String[] agre) {
/* 281 */     ArrayList mobiles = new ArrayList();
/* 282 */     mobiles.add("18515325915");
/*     */     try {
/* 284 */       SGIPClient.startCommunicationSms(mobiles, new String("hxdb1".getBytes(), "utf8"), "HXYX1", "12345678");
/*     */     } catch (Exception e) {
/* 286 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public HashMap pay(HashMap map) {
/* 291 */     HashMap returnMap = new HashMap();
/* 292 */     long beginTime = System.currentTimeMillis();
/*     */     try
/*     */     {
/*     */       HashMap localHashMap1;
/* 294 */       if (map.get("mobile") == null) {
/* 295 */         returnMap.put("retCode", "1112");
/* 296 */         return returnMap;
/*     */       }
/* 298 */       if (map.get("payCoin") == null) {
/* 299 */         returnMap.put("retCode", "1112");
/* 300 */         return returnMap;
/*     */       }
/* 302 */       if (map.get("limitId") == null) {
/* 303 */         returnMap.put("retCode", "1112");
/* 304 */         return returnMap;
/*     */       }
/* 306 */       String limitId = (String)map.get("limitId");
/*     */ 
/* 308 */       GamePayChannel gamePayChannel = this.myGamePayChannelMapper.selectByPrimaryKey(new Long(map.get("payCoin").toString()));
/* 309 */       if (gamePayChannel == null) {
/* 310 */         returnMap.put("retCode", "1112");
/* 311 */         return returnMap;
/*     */       }
/*     */ 
/* 314 */       PayOrderInfo payOrderInfo = new PayOrderInfo();
/*     */ 
/* 316 */       String payUtl = "http://smtp.wo.cn:3071/aiwmServPortal/rest/woplus/charge";
/* 317 */       String mobile = map.get("mobile").toString();
/* 318 */       String channelId = gamePayChannel.getChannelId();
/* 319 */       String key = gamePayChannel.getCreator();
/*     */ 
/* 321 */       payOrderInfo.setMobileNum(new Long(mobile));
/* 322 */       payOrderInfo.setCreated(new Date());
/*     */ 
/* 324 */       String userId = EncodeUtils2.encode(key, mobile);
/* 325 */       map.put("channelId", channelId);
/* 326 */       map.put("phoneNum", userId);
/* 327 */       payOrderInfo.setContent((String)map.get("content"));
/* 328 */       String str = JsonUtil.bean2json(map);
/* 329 */       DefaultHttpClient client = new DefaultHttpClient();
/* 330 */       HttpPost post = new HttpPost(payUtl);
/*     */ 
/* 332 */       StringEntity s = null;
/*     */ 
/* 334 */       s = new StringEntity(str);
/* 335 */       s.setContentEncoding("UTF-8");
/* 336 */       s.setContentType("text/plain");
/* 337 */       post.setEntity(s);
/*     */ 
/* 339 */       HttpResponse woresponse = client.execute(post);
/* 340 */       HttpEntity entity = woresponse.getEntity();
/* 341 */       BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
/*     */ 
/* 343 */       String result = "";
/* 344 */       String line = null;
/* 345 */       while ((line = reader.readLine()) != null) {
/* 346 */         result = result + line;
/*     */       }
/* 348 */       logger.info("wo+ return value : " + result + " time [" + (beginTime - System.currentTimeMillis()) + "]");
/* 349 */       String payCoin = map.get("payCoin").toString();
/*     */ 
/* 351 */       payOrderInfo.setAmount(Integer.valueOf(Integer.parseInt(payCoin)));
/* 352 */       HashMap resultWo = (HashMap)JsonUtil.json2bean(result, HashMap.class);
/* 353 */       payOrderInfo.setLinkid(UUID.randomUUID().toString());
/* 354 */       long beginTimedb = System.currentTimeMillis();
/* 355 */       SmsUtil smsUtil = new SmsUtil();
/*     */       String rand;
/* 356 */       if (((String)resultWo.get("res_code")).equals("0")) {
/* 357 */         payOrderInfo.setStatus(resultWo.get("res_code").toString());
/* 358 */         payOrderInfo.setContentName(resultWo.get("res_desc").toString());
/* 359 */         payOrderInfo.setProvinceId(Long.valueOf(map.get("PROVINCE_CODE").toString()));
/* 360 */         payOrderInfo.setProvinceName(map.get("PROVINCE_NAME").toString());
/* 361 */         payOrderInfo.setCityCode(Long.valueOf(map.get("CITY_CODE").toString()));
/* 362 */         payOrderInfo.setCityName(map.get("CITY_NAME").toString());
/* 363 */         payOrderInfo.setContent(map.get("EXT").toString());
/* 364 */         this.myLimitService.addMobile(mobile, map.get("limitId").toString(), Long.valueOf(gamePayChannel.getCoin().longValue()));
/*     */ 
/* 366 */         rand = getRandomString(4);
/* 367 */         String message = "您好,感谢您订购鸿信游戏" + payCoin + ".0元道具包业务。资费" + payCoin + ".0元，不含通信费。请回填验证码:“" + rand + "”确认订购。【联通APP计费】";
/* 368 */         this.redisService.set(resultWo.get("transaction_id").toString(), rand);
/*     */ 
/* 370 */         int randomSS = 0;
/* 371 */         randomSS = (int)(Math.random() * 200.0D);
/* 372 */         this.redisService.set(resultWo.get("transaction_id").toString() + "DATE", String.valueOf(randomSS));
/*     */ 
/* 375 */         smsUp(mobile, message);
/*     */ 
/* 377 */         new SmsSendThread(randomSS, mobile, "尊敬的用户，您已成功购买游戏支付的鸿信游戏" + payCoin + ".0元道具包，支付金额" + payCoin + ".0元。咨询电话：4000600611。【联通APP计费】").start();
/* 378 */         this.myPayOrderInfoDAO.insert(payOrderInfo);
/* 379 */         logger.info("wo 计费成功:  time [" + (beginTimedb - System.currentTimeMillis()) + "]");
/* 380 */         String transactionId = resultWo.get("transaction_id").toString();
/* 381 */         returnMap.put("retCode", "0000");
/* 382 */         returnMap.put("transactionId", transactionId);
/* 383 */         return returnMap;
/*     */       }
/* 385 */       payOrderInfo.setStatus(resultWo.get("res_code").toString());
/* 386 */       payOrderInfo.setContentName(resultWo.get("res_desc").toString());
/* 387 */       payOrderInfo.setProvinceId(Long.valueOf(map.get("PROVINCE_CODE").toString()));
/* 388 */       payOrderInfo.setProvinceName(map.get("PROVINCE_NAME").toString());
/* 389 */       payOrderInfo.setCityCode(Long.valueOf(map.get("CITY_CODE").toString()));
/* 390 */       payOrderInfo.setCityName(map.get("CITY_NAME").toString());
/* 391 */       payOrderInfo.setContent(map.get("EXT").toString());
/* 392 */       this.myPayOrderInfoDAO.insert(payOrderInfo);
/* 393 */       logger.info("wo 计费失败 retCode [" + (String)resultWo.get("res_code") + "] longtime [" + (beginTimedb - System.currentTimeMillis()) + "]");
/* 394 */       returnMap.put("retCode", (String)resultWo.get("res_code"));
/* 395 */       return returnMap;
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/*     */       GamePayChannel gamePayChannel;
/* 399 */       e.printStackTrace();
/* 400 */       returnMap.put("retCode", "1113");
/* 401 */       return returnMap;
/*     */     } finally {
/* 403 */       logger.info(getClass() + " payOrder end --------------------------- ");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String getRandomString(int length) {
/* 408 */     String base = "0123456789";
/* 409 */     Random random = new Random();
/* 410 */     StringBuffer sb = new StringBuffer();
/* 411 */     for (int i = 0; i < length; i++) {
/* 412 */       int number = random.nextInt(base.length());
/* 413 */       sb.append(base.charAt(number));
/*     */     }
/* 415 */     return sb.toString();
/*     */   }
/*     */ 
/*     */   protected void smsUp(String mobile, String message) throws Exception {
/* 419 */     String urlHead = "http://101.200.210.122:8080/sms-web";
/* 420 */     SmsUtil smsUtil = new SmsUtil();
/* 421 */     String acountName = "hxht1";
/* 422 */     String pwd = "hxht11";
/* 423 */     String level = "3";
/* 424 */     String mobiles = mobile;
/* 425 */     String spNumber = "01";
/* 426 */     message = URLEncoder.encode(message, "UTF8");
/* 427 */     String url = urlHead + "/SmsBackLogSendServlet?Level=" + level + "&acountName=" + acountName + "&pwd=" + pwd + "&message=" + message + "&spNumber=" + spNumber;
/*     */ 
/* 429 */     smsUtil.send(url, mobiles);
/*     */   }
/*     */ 
/*     */   public LimitService getMyLimitService() {
/* 433 */     return this.myLimitService;
/*     */   }
/*     */ 
/*     */   public void setMyLimitService(LimitService myLimitService) {
/* 437 */     this.myLimitService = myLimitService;
/*     */   }
/*     */ 
/*     */   public SmsDeliverMessageConverter getSmsDeliverMessageConverter() {
/* 441 */     return this.smsDeliverMessageConverter;
/*     */   }
/*     */ 
/*     */   public void setSmsDeliverMessageConverter(SmsDeliverMessageConverter smsDeliverMessageConverter) {
/* 445 */     this.smsDeliverMessageConverter = smsDeliverMessageConverter;
/*     */   }
/*     */ 
/*     */   public PayOrderGameConfigMapper getMyPayOrderGameConfigMapper() {
/* 449 */     return this.myPayOrderGameConfigMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderGameConfigMapper(PayOrderGameConfigMapper myPayOrderGameConfigMapper) {
/* 453 */     this.myPayOrderGameConfigMapper = myPayOrderGameConfigMapper;
/*     */   }
/*     */ 
/*     */   public GamePayChannelMapper getMyGamePayChannelMapper() {
/* 457 */     return this.myGamePayChannelMapper;
/*     */   }
/*     */ 
/*     */   public void setMyGamePayChannelMapper(GamePayChannelMapper myGamePayChannelMapper) {
/* 461 */     this.myGamePayChannelMapper = myGamePayChannelMapper;
/*     */   }
/*     */ 
/*     */   public PayOrderMapper getMyPayOrderMapper() {
/* 465 */     return this.myPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderMapper(PayOrderMapper myPayOrderMapper) {
/* 469 */     this.myPayOrderMapper = myPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public PayOrderInfoMapper getMyPayOrderInfoDAO() {
/* 473 */     return this.myPayOrderInfoDAO;
/*     */   }
/*     */ 
/*     */   public MoEmailJmsSend getMyMoJmsSend() {
/* 477 */     return this.myMoJmsSend;
/*     */   }
/*     */ 
/*     */   public void setMyMoJmsSend(MoEmailJmsSend myMoJmsSend) {
/* 481 */     this.myMoJmsSend = myMoJmsSend;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderInfoDAO(PayOrderInfoMapper myPayOrderInfoDAO) {
/* 485 */     this.myPayOrderInfoDAO = myPayOrderInfoDAO;
/*     */   }
/*     */ 
/*     */   public PayOrderLimitDateMapper getMyPayOrderLimitDateMapper() {
/* 489 */     return this.myPayOrderLimitDateMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderLimitDateMapper(PayOrderLimitDateMapper myPayOrderLimitDateMapper) {
/* 493 */     this.myPayOrderLimitDateMapper = myPayOrderLimitDateMapper;
/*     */   }
/*     */ 
/*     */   public ReportService getMyReportService() {
/* 497 */     return this.myReportService;
/*     */   }
/*     */ 
/*     */   public void setMyReportService(ReportService myReportService) {
/* 501 */     this.myReportService = myReportService;
/*     */   }
/*     */ 
/*     */   public SmsPayOrderMapper getMySmsPayOrderMapper() {
/* 505 */     return this.mySmsPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public void setMySmsPayOrderMapper(SmsPayOrderMapper mySmsPayOrderMapper) {
/* 509 */     this.mySmsPayOrderMapper = mySmsPayOrderMapper;
/*     */   }
/*     */ 
/*     */   public SmsPayOrderMonthMapper getMySmsPayOrderMonthMapper() {
/* 513 */     return this.mySmsPayOrderMonthMapper;
/*     */   }
/*     */ 
/*     */   public void setMySmsPayOrderMonthMapper(SmsPayOrderMonthMapper mySmsPayOrderMonthMapper) {
/* 517 */     this.mySmsPayOrderMonthMapper = mySmsPayOrderMonthMapper;
/*     */   }
/*     */ 
/*     */   public RedisService getRedisService() {
/* 521 */     return this.redisService;
/*     */   }
/*     */ 
/*     */   public void setRedisService(RedisService redisService) {
/* 525 */     this.redisService = redisService;
/*     */   }
/*     */ 
/*     */   public PaymentTraceService getMyPaymentTraceServiceImpl()
/*     */   {
/* 568 */     return this.myPaymentTraceServiceImpl;
/*     */   }
/*     */ 
/*     */   public void setMyPaymentTraceServiceImpl(PaymentTraceService myPaymentTraceServiceImpl) {
/* 572 */     this.myPaymentTraceServiceImpl = myPaymentTraceServiceImpl;
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/*  45 */     GAME_INFO_MAP.put("1", "愚公移山");
/*  46 */     GAME_INFO_MAP.put("8", "泡泡奥特曼");
/*     */   }
/*     */ 
/*     */   public class SmsSendThread extends Thread
/*     */   {
/* 530 */     public int ss = 0;
/*     */     public String mobile;
/*     */     public String message;
/*     */ 
/*     */     public SmsSendThread(int ss, String mobile, String message)
/*     */     {
/* 537 */       this.ss = ss;
/* 538 */       this.mobile = mobile;
/* 539 */       this.message = message;
/*     */     }
/*     */ 
/*     */     public void run()
/*     */     {
/*     */       try {
/* 545 */         Thread.sleep(this.ss * 1000);
/* 546 */         smsUp(this.mobile, this.message);
/*     */       } catch (Exception e) {
/* 548 */         e.printStackTrace();
/*     */       }
/*     */     }
/*     */ 
/*     */     protected void smsUp(String mobile, String message) throws Exception {
/* 553 */       String urlHead = "http://101.200.210.122:8080/sms-web";
/* 554 */       SmsUtil smsUtil = new SmsUtil();
/* 555 */       String acountName = "hxht1";
/* 556 */       String pwd = "hxht11";
/* 557 */       String level = "3";
/* 558 */       String mobiles = mobile;
/* 559 */       String spNumber = "01";
/* 560 */       message = URLEncoder.encode(message, "UTF8");
/* 561 */       String url = urlHead + "/SmsBackLogSendServlet?Level=" + level + "&acountName=" + acountName + "&pwd=" + pwd + "&message=" + message + "&spNumber=" + spNumber;
/*     */ 
/* 563 */       smsUtil.send(url, mobiles);
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.jms.listener.SmsListener
 * JD-Core Version:    0.6.2
 */
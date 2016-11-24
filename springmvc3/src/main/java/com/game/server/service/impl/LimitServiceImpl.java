/*     */ package com.game.server.service.impl;
/*     */ 
/*     */ import com.game.server.model.dto.MobileInfo;
/*     */ import com.game.server.model.dto.MobileInfoExample;
/*     */
/*     */ import com.game.server.model.dto.PayOrderBackExample;
/*     */
/*     */ import com.game.server.model.dto.PayOrderLimitCity;
/*     */ import com.game.server.model.dto.PayOrderLimitCityExample;
/*     */
/*     */ import com.game.server.model.dto.PayOrderLimitDate;
/*     */ import com.game.server.model.dto.PayOrderLimitDateExample;
/*     */
/*     */ import com.game.server.model.dto.impl.MobileInfoMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderBackMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderLimitCityMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderLimitDateMapper;
/*     */ import com.game.server.service.LimitService;
/*     */ import com.game.server.service.RedisService;
/*     */ import java.io.PrintStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.List;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class LimitServiceImpl
/*     */   implements LimitService
/*     */ {
/*     */   PayOrderLimitCityMapper payOrderLimitCityMapper;
/*     */   PayOrderLimitDateMapper payOrderLimitDateMapper;
/*     */   MobileInfoMapper mobileInfoMapper;
/*     */   RedisService redisService;
/*     */   PayOrderBackMapper myPayOrderBackMapper;
/*  33 */   private static final Logger logger = Logger.getLogger("A3");
/*     */ 
/*  36 */   private static String DATE_COUNT_CHANNEL = "DATE_COUNT";
/*     */ 
/*  39 */   private static String MONTH_COUNT_CHANNEL = "MONTH_COUNT";
/*     */ 
/*  41 */   private static String PERSISTENCE = "PERSISTENCE";
/*     */ 
/*     */   public boolean validate(String channelId, String mobileid) throws UnsupportedEncodingException {
/*  44 */     logger.info("开始校验 channelId [" + channelId + "] mobileid [" + mobileid + "]");
/*  45 */     if (this.redisService.get(mobileid + "_IS_3MIN") != null) {
/*  46 */       logger.info("用户计费需要超过3分钟 channelId [" + channelId + "] mobileid [" + mobileid + "]");
/*  47 */       return false;
/*     */     }
/*  49 */     PayOrderBackExample payOrderBackExample = new PayOrderBackExample();
/*  50 */     payOrderBackExample.createCriteria().andMobileEqualTo(mobileid);
/*  51 */     List isBack = this.myPayOrderBackMapper.selectByExample(payOrderBackExample);
/*  52 */     if ((isBack != null) && (isBack.size() > 0)) {
/*  53 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 黑名单用户");
/*  54 */       return false;
/*     */     }
/*  56 */     MobileInfo mobileInfo = getMobileInfo(mobileid.substring(0, 7));
/*  57 */     if (mobileInfo == null) {
/*  58 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 手机号码错误");
/*  59 */       return false;
/*     */     }
/*  61 */     logger.info("号码省份 channelId [" + channelId + "] mobileid [" + mobileid + "] 省份 [" + mobileInfo.getProvinceName() + "] 地市 [" + mobileInfo.getCityName() + "]");
/*  62 */     PayOrderLimitDateExample example = new PayOrderLimitDateExample();
/*  63 */     example.createCriteria().andIdEqualTo(channelId);
/*  64 */     List payOrderList = this.payOrderLimitDateMapper.selectByExample(example);
/*     */ 
/*  66 */     List<PayOrderLimitDate> payOrderList1 = this.payOrderLimitDateMapper.selectByExample(example);
/*  67 */     boolean isSuccess = false;
/*     */ 
/*  69 */     for (PayOrderLimitDate temp : payOrderList1)
/*     */     {
/*  71 */       String bizCount = this.redisService.get(temp.getId() + "_" + mobileid);
/*  72 */       if ((bizCount == null) || (bizCount.equals(""))) {
/*  73 */         bizCount = this.redisService.get(temp.getId() + "_" + mobileid + "_" + PERSISTENCE);
/*     */       }
/*  75 */       if (bizCount != null)
/*     */       {
/*  77 */         if (!temp.getId().equals(channelId)) {
/*  78 */           logger.info("validate channelId [" + channelId + "] huchichannelId [" + temp.getId() + "] mobileid [" + mobileid + "] 业务互斥，不可以对一个号码进行不同计费");
/*  79 */           return false;
/*     */         }
/*     */       }
/*  82 */       if (temp.getId().equals(channelId)) {
/*  83 */         isSuccess = true;
/*     */       }
/*     */     }
/*  86 */     if (!isSuccess) {
/*  87 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 限制渠道ID错误!");
/*  88 */       return false;
/*     */     }
/*  90 */     if ((payOrderList == null) || (payOrderList.size() == 0)) {
/*  91 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 渠道不存在");
/*  92 */       return false;
/*     */     }
/*     */ 
/*  95 */     if (!validateEveUserCount(((PayOrderLimitDate)payOrderList.get(0)).getId() + "_" + mobileid, ((PayOrderLimitDate)payOrderList.get(0)).getMonthCountLimit().intValue())) {
/*  96 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 用户本月已经计费");
/*  97 */       return false;
/*     */     }
/*     */ 
/* 101 */     PayOrderLimitDate thisPayOrderLimitDate = (PayOrderLimitDate)payOrderList.get(0);
/* 102 */     if (thisPayOrderLimitDate.getOff() == null) {
/* 103 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 通道已经关闭");
/* 104 */       return false;
/*     */     }
/* 106 */     if (thisPayOrderLimitDate.getOff().intValue() != 1) {
/* 107 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 通道已经关闭");
/* 108 */       return false;
/*     */     }
/* 110 */     if (!validateDateAmont(thisPayOrderLimitDate)) {
/* 111 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 通道限制已经超限");
/* 112 */       return false;
/*     */     }
/* 114 */     if (!validateMonthAmont(thisPayOrderLimitDate)) {
/* 115 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] 通道限制已经超限");
/* 116 */       return false;
/*     */     }
/* 118 */     PayOrderLimitCityExample payOrderLimitCityExample = new PayOrderLimitCityExample();
/* 119 */     payOrderLimitCityExample.createCriteria().andLimitIdEqualTo(thisPayOrderLimitDate.getUid());
/* 120 */     List<PayOrderLimitCity> payOrderLimitCityList = this.payOrderLimitCityMapper.selectByExample(payOrderLimitCityExample);
/* 121 */     if ((payOrderLimitCityList != null) && (payOrderLimitCityList.size() > 0))
/*     */     {
/* 123 */       for (PayOrderLimitCity temp : payOrderLimitCityList) {
/* 124 */         logger.info("校验省份关闭情况 本号码省份ID[" + mobileInfo.getProvinceId() + "] 屏蔽省份ID [" + temp.getProvinceId() + "] 本号码地市 [" + mobileInfo.getCityId() + "] 屏蔽地市 [" + temp.getCityId() + "] 屏蔽所在省份 [" + temp.getProvinceId().equals(mobileInfo.getProvinceId()) + "]");
/* 125 */         long provinceId = temp.getProvinceId().longValue();
/*     */ 
/* 127 */         if (temp.getProvinceId().equals(mobileInfo.getProvinceId())) {
/* 128 */           if ((temp.getMonthLimitAmont() != null) && 
/* 129 */             (!validateProvinceMonthAmonth(channelId, temp.getProvinceId().longValue(), temp.getMonthLimitAmont().longValue()))) {
/* 130 */             logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] provinceName [" + temp.getRrovinceName() + "] 省份月限超限");
/* 131 */             return false;
/*     */           }
/*     */ 
/* 134 */           if ((temp.getDateLimitAmont() != null) && 
/* 135 */             (!validateProvinceDateAmonth(channelId, temp.getProvinceId().longValue(), temp.getDateLimitAmont().longValue()))) {
/* 136 */             logger.info("validate channelId [" + channelId + "] mobileid [" + mobileid + "] provinceName [" + temp.getRrovinceName() + "] 省份日限超限");
/* 137 */             return false;
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 151 */     return true;
/*     */   }
/*     */ 
/*     */   public void addMobile(String mobile, String channelId, Long amonth)
/*     */   {
/* 157 */     int thisMonthSs = getThisMonth().intValue();
/* 158 */     String userConut = this.redisService.get(channelId + "_" + mobile);
/* 159 */     logger.info("validate channelId [" + channelId + "] mobileid [" + mobile + "] userConut[" + userConut + "] 本月开始计费");
/* 160 */     if ((userConut != null) && (!userConut.equals(""))) {
/* 161 */       int temp = Integer.parseInt(userConut) + 1;
/* 162 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobile + "] userConut[" + userConut + "] 本月已有计费,累计" + temp);
/* 163 */       this.redisService.set(channelId + "_" + mobile, String.valueOf(temp), thisMonthSs);
/* 164 */       this.redisService.set(channelId + "_" + mobile + "_" + PERSISTENCE, String.valueOf(temp));
/*     */     } else {
/* 166 */       logger.info("validate channelId [" + channelId + "] mobileid [" + mobile + "] userConut[" + userConut + "] 本月还没有计费，累计1");
/* 167 */       this.redisService.set(channelId + "_" + mobile, "1", thisMonthSs);
/* 168 */       this.redisService.set(channelId + "_" + mobile + "_" + PERSISTENCE, "1");
/*     */     }
/*     */ 
/* 171 */     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
/* 172 */     String thisMonth = format.format(new Date());
/* 173 */     String amontStr = this.redisService.get(MONTH_COUNT_CHANNEL + thisMonth + channelId);
/* 174 */     Long amontMonth = Long.valueOf(0L);
/* 175 */     if (amontStr != null)
/* 176 */       amontMonth = Long.valueOf(amonth.longValue() + new Long(amontStr).longValue());
/*     */     else {
/* 178 */       amontMonth = amonth;
/*     */     }
/* 180 */     MobileInfo mobileinfo = getMobileInfo(mobile.substring(0, 7));
/* 181 */     long provinceId = mobileinfo.getProvinceId().longValue();
/* 182 */     this.redisService.set(MONTH_COUNT_CHANNEL + thisMonth + channelId, amontMonth.toString(), thisMonthSs);
/*     */ 
/* 184 */     String amontMonthProStr = this.redisService.get(MONTH_COUNT_CHANNEL + thisMonth + channelId + "_" + provinceId);
/* 185 */     Long amontMonthPro = Long.valueOf(0L);
/* 186 */     if (amontMonthProStr != null)
/* 187 */       amontMonthPro = Long.valueOf(amonth.longValue() + new Long(amontMonthProStr).longValue());
/*     */     else {
/* 189 */       amontMonthPro = amonth;
/*     */     }
/* 191 */     logger.info("测试 加入 省份通道月限 key [" + MONTH_COUNT_CHANNEL + thisMonth + channelId + "_" + provinceId + "] value [" + amontMonthPro.toString() + "]");
/* 192 */     this.redisService.set(MONTH_COUNT_CHANNEL + thisMonth + channelId + "_" + provinceId, amontMonthPro.toString(), thisMonthSs);
/* 193 */     this.redisService.incr(MONTH_COUNT_CHANNEL + thisMonth + "_" + provinceId + "_TOUSU_" + channelId);
/*     */ 
/* 196 */     SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
/* 197 */     String thisDate = formatDate.format(new Date());
/* 198 */     String amontStrDate = this.redisService.get(DATE_COUNT_CHANNEL + thisDate + channelId);
/* 199 */     Long amontDate = Long.valueOf(0L);
/* 200 */     if (amontStrDate != null)
/* 201 */       amontDate = Long.valueOf(amonth.longValue() + new Long(amontStrDate).longValue());
/*     */     else {
/* 203 */       amontDate = amonth;
/*     */     }
/* 205 */     this.redisService.set(DATE_COUNT_CHANNEL + thisDate + channelId, amontDate.toString(), getThisDate().intValue());
/*     */ 
/* 207 */     String amontDateProStr = this.redisService.get(DATE_COUNT_CHANNEL + thisDate + channelId + "_" + provinceId);
/* 208 */     Long amontDatePro = Long.valueOf(0L);
/* 209 */     if (amontDateProStr != null)
/* 210 */       amontDatePro = Long.valueOf(amonth.longValue() + new Long(amontDateProStr).longValue());
/*     */     else {
/* 212 */       amontDatePro = amonth;
/*     */     }
/* 214 */     logger.info("测试 加入 省份通道日限 key [" + DATE_COUNT_CHANNEL + thisDate + channelId + "_" + provinceId + "] value [" + amontDatePro.toString() + "]");
/* 215 */     this.redisService.set(DATE_COUNT_CHANNEL + thisDate + channelId + "_" + provinceId, amontDatePro.toString(), getThisDate().intValue());
/* 216 */     this.redisService.set(mobile + "_IS_3MIN", "1", 180);
/*     */   }
/*     */ 
/*     */   private Long getThisDate() {
/* 220 */     Calendar curDate = Calendar.getInstance();
/* 221 */     Calendar tommorowDate = new GregorianCalendar(curDate.get(1), curDate.get(2), curDate.get(5) + 1, 0, 0, 0);
/*     */ 
/* 224 */     return Long.valueOf((tommorowDate.getTimeInMillis() - curDate.getTimeInMillis()) / 1000L);
/*     */   }
/*     */ 
/*     */   private Long getThisMonth()
/*     */   {
/* 229 */     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
/* 230 */     Calendar ca = Calendar.getInstance();
/* 231 */     ca.set(5, ca.getActualMaximum(5));
/* 232 */     String last = format.format(ca.getTime());
/* 233 */     last = last + " 23:59:59";
/* 234 */     Calendar curDate = Calendar.getInstance();
/* 235 */     Calendar tommorowDate = new GregorianCalendar(curDate.get(1), curDate.get(2), curDate.get(5) + 1, 0, 0, 0);
/*     */     try
/*     */     {
/* 239 */       return Long.valueOf((new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(last).getTime() - new Date().getTime()) / 1000L);
/*     */     } catch (ParseException e) {
/* 241 */       e.printStackTrace();
/*     */     }
/* 243 */     return null;
/*     */   }
/*     */ 
/*     */   public static void main(String[] agre) {
/* 247 */     System.out.println(new LimitServiceImpl().getThisMonth());
/*     */   }
/*     */ 
/*     */   public MobileInfo getMobileInfo(String mobile)
/*     */   {
/* 252 */     MobileInfoExample example = new MobileInfoExample();
/* 253 */     example.createCriteria().andMobileEqualTo(new Long(mobile));
/* 254 */     List mobileInfoList = this.mobileInfoMapper.selectByExample(example);
/* 255 */     if ((mobileInfoList != null) && (mobileInfoList.size() > 0)) {
/* 256 */       return (MobileInfo)mobileInfoList.get(0);
/*     */     }
/* 258 */     return null;
/*     */   }
/*     */ 
/*     */   public boolean validateDateAmont(PayOrderLimitDate channelId)
/*     */   {
/* 263 */     logger.info("validateDateAmont beign limitId[" + channelId.getId() + "] DateLimit [" + channelId.getDateLimit() + "] 开始，通道日限");
/* 264 */     SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
/* 265 */     String thisDate = formatDate.format(new Date());
/* 266 */     String amontStrDate = this.redisService.get(DATE_COUNT_CHANNEL + thisDate + channelId.getId());
/* 267 */     if (amontStrDate == null) {
/* 268 */       logger.info("validateDateAmont end limitId[" + channelId.getId() + "] DateLimit [" + channelId.getDateLimit() + "] 结束，通道日限,本月还没有做过计费");
/* 269 */       return true;
/*     */     }
/* 271 */     Long amonth = new Long(amontStrDate);
/* 272 */     if (amonth.longValue() >= channelId.getDateLimit().longValue()) {
/* 273 */       logger.info("limit faild limitId[" + channelId.getId() + "] DateLimit [" + channelId.getDateLimit() + "] amont[" + amonth + "] 结束，通道日限，超限");
/* 274 */       return false;
/*     */     }
/* 276 */     logger.info("validateDateAmont end limitId[" + channelId.getId() + "] DateLimit [" + channelId.getDateLimit() + "] 校验成功");
/* 277 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean validateProvinceMonthAmonth(String channelId, long provinceId, long amonthLimit)
/*     */   {
/* 283 */     logger.info("validateProvinceMonthAmonth beign provinceId [" + provinceId + "] limitId[" + channelId + "] DateLimit [" + amonthLimit + "] 开始,通道省份月限");
/* 284 */     SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM");
/* 285 */     String thisDate = formatDate.format(new Date());
/* 286 */     String amontStrDate = this.redisService.get(MONTH_COUNT_CHANNEL + thisDate + channelId + "_" + provinceId);
/* 287 */     if (amontStrDate == null) {
/* 288 */       logger.info("validateProvinceMonthAmonth end provinceId [" + provinceId + "] limitId[" + channelId + "] DateLimit [" + amonthLimit + "] 结束，通道省份月限,本月还没有做过计费");
/* 289 */       return true;
/*     */     }
/* 291 */     Long amonth = new Long(amontStrDate);
/* 292 */     if (amonth.longValue() >= amonthLimit) {
/* 293 */       logger.info("validateProvinceMonthAmonth faild provinceId [" + provinceId + "] limitId[" + channelId + "] DateLimit [" + amonthLimit + "] amont[" + amonth + "] 结束，通道省份月限,超限");
/* 294 */       return false;
/*     */     }
/* 296 */     logger.info("validateProvinceMonthAmonth end provinceId [" + provinceId + "] limitId[" + channelId + "] DateLimit [" + amonthLimit + "] 校验成功");
/* 297 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean validateProvinceDateAmonth(String channelId, long provinceId, long amonthLimit)
/*     */   {
/* 303 */     logger.info("validateProvinceDateAmonth beign provinceId [" + provinceId + "] limitId[" + channelId + "] DateLimit [" + amonthLimit + "] 开始,通道省份日限");
/* 304 */     SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
/* 305 */     String thisDate = formatDate.format(new Date());
/* 306 */     String amontStrDate = this.redisService.get(DATE_COUNT_CHANNEL + thisDate + channelId + "_" + provinceId);
/* 307 */     if (amontStrDate == null) {
/* 308 */       logger.info("validateProvinceDateAmonth end provinceId [" + provinceId + "] limitId[" + channelId + "] DateLimit [" + amonthLimit + "] 结束，通道省份日限,本日还没有做过计费");
/* 309 */       return true;
/*     */     }
/* 311 */     Long amonth = new Long(amontStrDate);
/* 312 */     if (amonth.longValue() >= amonthLimit) {
/* 313 */       logger.info("validateProvinceDateAmonth faild provinceId [" + provinceId + "] limitId[" + channelId + "] DateLimit [" + amonthLimit + "] amont[" + amonth + "] 结束，通道省份日限,超限");
/* 314 */       return false;
/*     */     }
/* 316 */     logger.info("validateProvinceDateAmonth end provinceId [" + provinceId + "] limitId[" + channelId + "] DateLimit [" + amonthLimit + "] 校验成功");
/* 317 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean validateMonthAmont(PayOrderLimitDate channelId)
/*     */   {
/* 324 */     logger.info("validateMonthAmont beign limitId[" + channelId.getId() + "] DateLimit [" + channelId.getDateLimit() + "] 开始,通道月限");
/* 325 */     SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM");
/* 326 */     String thisDate = formatDate.format(new Date());
/* 327 */     String amontStrDate = this.redisService.get(MONTH_COUNT_CHANNEL + thisDate + channelId.getId());
/* 328 */     if (amontStrDate == null) {
/* 329 */       logger.info("validateMonthAmont end limitId[" + channelId.getId() + "] DateLimit [" + channelId.getDateLimit() + "] 结束，通道月限,本月还没有做过计费");
/* 330 */       return true;
/*     */     }
/* 332 */     Long amonth = new Long(amontStrDate);
/* 333 */     if (amonth.longValue() >= channelId.getMonthLimit().longValue()) {
/* 334 */       logger.info("validateMonthAmont faild limitId[" + channelId.getId() + "] DateLimit [" + channelId.getDateLimit() + "] amont[" + amonth + "] 结束，通道月限,超限");
/* 335 */       return false;
/*     */     }
/* 337 */     logger.info("validateMonthAmont end limitId[" + channelId.getId() + "] DateLimit [" + channelId.getDateLimit() + "] 校验成功");
/* 338 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean validateEveUserCount(String mobile, int monthCount)
/*     */   {
/* 345 */     String value = this.redisService.get(mobile);
/* 346 */     logger.info("validateEveUserCount beign mobile[" + mobile + "] 本月设置 monthCount [" + monthCount + "] 本月已使用 [" + value + "]开始，用户次数限制");
/*     */ 
/* 349 */     if ((value != null) && (!value.equals(""))) {
/* 350 */       int thisMonthCount = Integer.parseInt(value);
/* 351 */       if (thisMonthCount >= monthCount) {
/* 352 */         logger.info("validateEveUserCount end mobile[" + mobile + "] monthCount [" + monthCount + "] 本月已使用 [" + value + "] 本月用户已经做过计费，不可以再次计费");
/* 353 */         return false;
/*     */       }
/* 355 */       logger.info("validateEveUserCount beign mobile[" + mobile + "]  monthCount [" + monthCount + "] 本月已使用 [" + value + "] 本月校验用户成功");
/* 356 */       return true;
/*     */     }
/*     */ 
/* 359 */     logger.info("validateEveUserCount beign mobile[" + mobile + "] 本月设置 monthCount [" + monthCount + "] 本月已使用 [" + value + "]本月校验用户成功");
/* 360 */     return true;
/*     */   }
/*     */ 
/*     */   public PayOrderLimitCityMapper getPayOrderLimitCityMapper()
/*     */   {
/* 365 */     return this.payOrderLimitCityMapper;
/*     */   }
/*     */ 
/*     */   public void setPayOrderLimitCityMapper(PayOrderLimitCityMapper payOrderLimitCityMapper) {
/* 369 */     this.payOrderLimitCityMapper = payOrderLimitCityMapper;
/*     */   }
/*     */ 
/*     */   public PayOrderLimitDateMapper getPayOrderLimitDateMapper() {
/* 373 */     return this.payOrderLimitDateMapper;
/*     */   }
/*     */ 
/*     */   public void setPayOrderLimitDateMapper(PayOrderLimitDateMapper payOrderLimitDateMapper) {
/* 377 */     this.payOrderLimitDateMapper = payOrderLimitDateMapper;
/*     */   }
/*     */ 
/*     */   public MobileInfoMapper getMobileInfoMapper() {
/* 381 */     return this.mobileInfoMapper;
/*     */   }
/*     */ 
/*     */   public void setMobileInfoMapper(MobileInfoMapper mobileInfoMapper) {
/* 385 */     this.mobileInfoMapper = mobileInfoMapper;
/*     */   }
/*     */ 
/*     */   public RedisService getRedisService() {
/* 389 */     return this.redisService;
/*     */   }
/*     */ 
/*     */   public void setRedisService(RedisService redisService) {
/* 393 */     this.redisService = redisService;
/*     */   }
/*     */ 
/*     */   public PayOrderBackMapper getMyPayOrderBackMapper() {
/* 397 */     return this.myPayOrderBackMapper;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderBackMapper(PayOrderBackMapper myPayOrderBackMapper) {
/* 401 */     this.myPayOrderBackMapper = myPayOrderBackMapper;
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.impl.LimitServiceImpl
 * JD-Core Version:    0.6.2
 */
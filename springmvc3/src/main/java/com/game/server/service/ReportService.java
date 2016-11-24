/*     */ package com.game.server.service;
/*     */ 
/*     */ import com.game.server.model.dto.PayOrderGameConfig;
/*     */ import com.game.server.model.dto.PayOrderGameConfigExample;
/*     */
/*     */ import com.game.server.model.dto.PayOrderInfo;
/*     */ import com.game.server.model.dto.PayOrderInfoExample;
/*     */
/*     */ import com.game.server.model.dto.SkPayOrderInfo;
/*     */ import com.game.server.model.dto.SkPayOrderInfoExample;
/*     */
/*     */ import com.game.server.model.dto.impl.PayOrderGameConfigMapper;
/*     */ import com.game.server.model.dto.impl.PayOrderInfoMapper;
/*     */ import com.game.server.model.dto.impl.SkPayOrderInfoMapper;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.PrintStream;
/*     */ import java.net.URL;
/*     */ import java.net.URLConnection;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.http.entity.StringEntity;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class ReportService
/*     */ {
/*     */   private PayOrderGameConfigMapper payOrderGameConfigDAO;
/*     */   public PayOrderInfoMapper myPayOrderInfoDAO;
/*     */   public SkPayOrderInfoMapper mySkPayOrderInfoMapper;
/*  29 */   private static final Logger logger = Logger.getLogger("A1");
/*     */ 
/*     */   public PayOrderGameConfig isCheckOff(Long cpid, String content) {
/*  32 */     PayOrderGameConfigExample example = new PayOrderGameConfigExample();
/*  33 */     PayOrderGameConfigExample.Criteria c = example.createCriteria();
/*  34 */     logger.info("开始截取命令行，去掉最后8位订单ID");
/*  35 */     content = content.substring(0, content.length() - 8);
/*  36 */     c.andCpidEqualTo(cpid);
/*  37 */     c.andTypeEqualTo(Integer.valueOf(2));
/*  38 */     c.andContentLike("%" + content + "%");
/*  39 */     List listPayOrderGameConfig = this.payOrderGameConfigDAO.selectByExample(example);
/*  40 */     if ((listPayOrderGameConfig == null) || (listPayOrderGameConfig.size() != 1)) {
/*  41 */       logger.info("配置问题，没有相关配置 指令 [" + cpid + "] content [" + content + "]");
/*  42 */       return null;
/*     */     }
/*  44 */     PayOrderGameConfig payOrderGameConfig = (PayOrderGameConfig)listPayOrderGameConfig.get(0);
/*  45 */     if (payOrderGameConfig.getOff().intValue() == 0) {
/*  46 */       logger.info("配置已经关闭，不允许上报 指令 [" + cpid + "] content [" + content + "]");
/*  47 */       return null;
/*     */     }
/*  49 */     return payOrderGameConfig;
/*     */   }
/*     */ 
/*     */   public PayOrderGameConfig isCheckOff(String content) {
/*  53 */     PayOrderGameConfigExample example = new PayOrderGameConfigExample();
/*  54 */     example.createCriteria().andContentEqualTo(content);
/*  55 */     List listPayOrderGameConfig = this.payOrderGameConfigDAO.selectByExample(example);
/*  56 */     if ((listPayOrderGameConfig == null) || (listPayOrderGameConfig.size() != 1)) {
/*  57 */       logger.info("配置问题，没有相关配置 指令 [" + content + "]");
/*  58 */       return null;
/*     */     }
/*  60 */     PayOrderGameConfig payOrderGameConfig = (PayOrderGameConfig)listPayOrderGameConfig.get(0);
/*  61 */     if (payOrderGameConfig.getOff().intValue() == 0) {
/*  62 */       logger.info("配置已经关闭，不允许上报 指令 [" + content + "]");
/*  63 */       return null;
/*     */     }
/*  65 */     return payOrderGameConfig;
/*     */   }
/*     */ 
/*     */   public boolean reportEmail(PayOrderInfo payOrderInfo)
/*     */   {
/*  75 */     logger.info("mo report begin --------------------------- ");
/*  76 */     PayOrderGameConfig payOrderGameConfig = isCheckOff(payOrderInfo.getContent());
/*  77 */     if (payOrderGameConfig != null) {
/*  78 */       payOrderGameConfig.getMoUrl();
/*  79 */       String url = payOrderGameConfig.getMoUrl() + "?mobile=" + payOrderInfo.getMobileNum() + "&spnumber=" + payOrderGameConfig.getSpnumber() + "&msg=" + payOrderInfo.getContent() + "&fee=" + payOrderInfo.getAmount() + "&linkid=" + payOrderInfo.getLinkid() + "&status=" + payOrderInfo.getStatus();
/*  80 */       String httpResult = httpGet(url);
/*  81 */       payOrderInfo.setIsReportMo(Long.valueOf(1L));
/*  82 */       payOrderInfo.setContentName(payOrderGameConfig.getContentName());
/*  83 */       PayOrderInfoExample example = new PayOrderInfoExample();
/*  84 */       example.createCriteria().andLinkidEqualTo(payOrderInfo.getLinkid());
/*  85 */       List list = this.myPayOrderInfoDAO.selectByExample(example);
/*  86 */       payOrderInfo.setUid(((PayOrderInfo)list.get(0)).getUid());
/*  87 */       this.myPayOrderInfoDAO.updateByExample(payOrderInfo, example);
/*  88 */       logger.info("http get result : " + httpResult);
/*     */     }
/*  90 */     logger.info("mo report end --------------------------- ");
/*  91 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean reportMo(SkPayOrderInfo payOrderInfo)
/*     */   {
/* 101 */     logger.info("mo report begin --------------------------- ");
/* 102 */     PayOrderGameConfig payOrderGameConfig = isCheckOff(Long.valueOf(payOrderInfo.getCpid()), payOrderInfo.getContent());
/* 103 */     if (payOrderGameConfig != null) {
/* 104 */       payOrderGameConfig.getMoUrl();
/* 105 */       String url = payOrderGameConfig.getMoUrl() + "?mobile=" + payOrderInfo.getMobileNum() + "&spnumber=" + payOrderGameConfig.getSpnumber() + "&msg=" + payOrderInfo.getContent() + "&fee=" + payOrderInfo.getAmount() + "&linkid=" + payOrderInfo.getId();
/* 106 */       String httpResult = httpGet(url);
/* 107 */       payOrderInfo.setIsUpMo("1");
/* 108 */       payOrderInfo.setUpMoDate(new Date());
/* 109 */       SkPayOrderInfoExample example = new SkPayOrderInfoExample();
/* 110 */       example.createCriteria().andIdEqualTo(payOrderInfo.getId());
/* 111 */       List list = this.mySkPayOrderInfoMapper.selectByExample(example);
/* 112 */       payOrderInfo.setUid(((SkPayOrderInfo)list.get(0)).getUid());
/* 113 */       this.mySkPayOrderInfoMapper.updateByExample(payOrderInfo, example);
/* 114 */       logger.info("http get result : " + httpResult);
/*     */     }
/* 116 */     logger.info("mo report end --------------------------- ");
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean reportMo(PayOrderInfo payOrderInfo)
/*     */   {
/* 128 */     logger.info("mo report begin --------------------------- ");
/* 129 */     PayOrderGameConfig payOrderGameConfig = isCheckOff(payOrderInfo.getContent());
/* 130 */     if (payOrderGameConfig != null) {
/* 131 */       payOrderGameConfig.getMoUrl();
/* 132 */       String url = payOrderGameConfig.getMoUrl() + "?mobile=" + payOrderInfo.getMobileNum() + "&spnumber=" + payOrderGameConfig.getSpnumber() + "&msg=" + payOrderInfo.getContent() + "&fee=" + payOrderInfo.getAmount() + "&linkid=" + payOrderInfo.getLinkid();
/* 133 */       String httpResult = httpGet(url);
/*     */ 
/* 141 */       logger.info("http get result : " + httpResult);
/*     */     }
/* 143 */     logger.info("mo report end --------------------------- ");
/* 144 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean reportMr(PayOrderInfo payOrderInfo) {
/* 148 */     logger.info("mr report begin --------------------------- payOrderInfo.getContent() : " + payOrderInfo.getContent());
/* 149 */     PayOrderGameConfig payOrderGameConfig = isCheckOff(payOrderInfo.getContent());
/* 150 */     if (payOrderGameConfig != null) {
/* 151 */       String url = payOrderGameConfig.getMrUrl() + "?mobile=" + payOrderInfo.getMobileNum() + "&spnumber=" + payOrderGameConfig.getSpnumber() + "&msg=" + payOrderInfo.getContent() + "&status=" + payOrderInfo.getStatus() + "&linkid=" + payOrderInfo.getLinkid();
/* 152 */       String httpResult = httpGet(url);
/*     */ 
/* 160 */       logger.info("http get result : " + httpResult);
/*     */     }
/* 162 */     logger.info("mr report end --------------------------- ");
/* 163 */     return false;
/*     */   }
/*     */ 
/*     */   public boolean reportMr(SkPayOrderInfo payOrderInfo)
/*     */   {
/* 173 */     logger.info("mr report begin --------------------------- ");
/* 174 */     PayOrderGameConfig payOrderGameConfig = isCheckOff(Long.valueOf(payOrderInfo.getCpid()), payOrderInfo.getContent());
/* 175 */     if (payOrderGameConfig != null) {
/* 176 */       String url = payOrderGameConfig.getMrUrl() + "?mobile=" + payOrderInfo.getMobileNum() + "&spnumber=" + payOrderGameConfig.getSpnumber() + "&msg=" + payOrderInfo.getContent() + "&status=" + payOrderInfo.getStatus() + "&linkid=" + payOrderInfo.getId();
/* 177 */       String httpResult = httpGet(url);
/* 178 */       payOrderInfo.setIsUpMr("1");
/* 179 */       payOrderInfo.setLimitId(payOrderGameConfig.getLimitId());
/* 180 */       payOrderInfo.setUpMrDate(new Date());
/* 181 */       SkPayOrderInfoExample example = new SkPayOrderInfoExample();
/* 182 */       example.createCriteria().andIdEqualTo(payOrderInfo.getId());
/* 183 */       List list = this.mySkPayOrderInfoMapper.selectByExample(example);
/* 184 */       payOrderInfo.setUid(((SkPayOrderInfo)list.get(0)).getUid());
/* 185 */       this.mySkPayOrderInfoMapper.updateByExample(payOrderInfo, example);
/* 186 */       logger.info("http get result : " + httpResult);
/*     */     }
/* 188 */     logger.info("mr report end --------------------------- ");
/* 189 */     return false;
/*     */   }
/*     */ 
/*     */   public String httpGet(String payUrl) {
/* 193 */     Long time = Long.valueOf(new Date().getTime());
/* 194 */     String url = payUrl;
/* 195 */     logger.info("发送请求 上报请求地址    " + url);
/*     */ 
/* 197 */     String result = "";
/* 198 */     BufferedReader in = null;
/*     */     try {
/* 200 */       URL realUrl = new URL(url);
/*     */ 
/* 202 */       URLConnection connection = realUrl.openConnection();
/*     */ 
/* 204 */       connection.setRequestProperty("accept", "*/*");
/* 205 */       connection.setRequestProperty("connection", "Keep-Alive");
/* 206 */       connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
/* 207 */       StringEntity s = null;
/*     */ 
/* 209 */       connection.connect();
/*     */ 
/* 211 */       Map<String,List<String>> map = connection.getHeaderFields();
/*     */ 
/* 213 */       for (String key : map.keySet()) {
/* 214 */         System.out.println(key + "--->" + map.get(key));
/*     */       }
/*     */ 
/* 217 */       in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
/*     */       String line;
/* 220 */       while ((line = in.readLine()) != null) {
/* 221 */         result = result + line;
/*     */       }
/* 223 */       logger.info("发送请求 上报计费通知接口返回   " + result);
/*     */     } catch (Exception e) {
/* 225 */       logger.info("发送请求 上报计费通知接口异常   " + result);
/* 226 */       e.printStackTrace();
/*     */     } finally {
/*     */       try {
/* 229 */         if (in != null)
/* 230 */           in.close();
/*     */       }
/*     */       catch (Exception e2) {
/* 233 */         e2.printStackTrace();
/*     */       }
/*     */     }
/* 236 */     return result;
/*     */   }
/*     */ 
/*     */   public PayOrderGameConfigMapper getPayOrderGameConfigDAO() {
/* 240 */     return this.payOrderGameConfigDAO;
/*     */   }
/*     */ 
/*     */   public void setPayOrderGameConfigDAO(PayOrderGameConfigMapper payOrderGameConfigDAO) {
/* 244 */     this.payOrderGameConfigDAO = payOrderGameConfigDAO;
/*     */   }
/*     */ 
/*     */   public void setMyPayOrderInfoDAO(PayOrderInfoMapper myPayOrderInfoDAO) {
/* 248 */     this.myPayOrderInfoDAO = myPayOrderInfoDAO;
/*     */   }
/*     */ 
/*     */   public SkPayOrderInfoMapper getMySkPayOrderInfoMapper() {
/* 252 */     return this.mySkPayOrderInfoMapper;
/*     */   }
/*     */ 
/*     */   public void setMySkPayOrderInfoMapper(SkPayOrderInfoMapper mySkPayOrderInfoMapper) {
/* 256 */     this.mySkPayOrderInfoMapper = mySkPayOrderInfoMapper;
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.ReportService
 * JD-Core Version:    0.6.2
 */
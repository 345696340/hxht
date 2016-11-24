/*     */ package com.tdt.unicom.sgip.svr;
/*     */ 
/*     */ import com.tdt.unicom.domains.SGIPHeader;

/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.jdom.Document;
/*     */ import org.jdom.Element;
/*     */ import org.jdom.JDOMException;
/*     */ import org.jdom.input.SAXBuilder;
/*     */ 
/*     */ public class SPProduction
/*     */ {
/*  17 */   private static Logger log = Logger.getLogger(SPProduction.class);
/*     */ 
/*  19 */   private static final List<SPProduction> productions = new ArrayList();
/*     */   private String name;
/*     */   private String spnumber;
/*     */   private String serviceType;
/*     */   private String transmitIp;
/*     */   private int destPort;
/*     */ 
/*     */   public String getName()
/*     */   {
/*  93 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String name) {
/*  97 */     this.name = name;
/*     */   }
/*     */ 
/*     */   public String getSpnumber() {
/* 101 */     return this.spnumber;
/*     */   }
/*     */ 
/*     */   public void setSpnumber(String spnumber) {
/* 105 */     this.spnumber = spnumber;
/*     */   }
/*     */ 
/*     */   public String getServiceType() {
/* 109 */     return this.serviceType;
/*     */   }
/*     */ 
/*     */   public void setServiceType(String serviceType) {
/* 113 */     this.serviceType = serviceType;
/*     */   }
/*     */ 
/*     */   public String getTransmitIp() {
/* 117 */     return this.transmitIp;
/*     */   }
/*     */ 
/*     */   public void setTransmitIp(String transmitIp) {
/* 121 */     this.transmitIp = transmitIp;
/*     */   }
/*     */ 
/*     */   public int getDestPort() {
/* 125 */     return this.destPort;
/*     */   }
/*     */ 
/*     */   public void setDestPort(int destPort) {
/* 129 */     this.destPort = destPort;
/*     */   }
/*     */ 
/*     */   public static SPProduction getProduction(String spNumber)
/*     */   {
/* 138 */     SPProduction spProduction = new SPProduction();
/* 139 */     for (SPProduction production : productions) {
/* 140 */       if (spNumber.trim().equals(production.getSpnumber())) {
/* 141 */         spProduction = production;
/* 142 */         break;
/*     */       }
/*     */     }
/* 145 */     return spProduction;
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/*     */     try
/*     */     {
/*  29 */       SAXBuilder builder = new SAXBuilder();
/*  30 */       Document doc = null;
/*  31 */       String osname = System.getProperty("os.name");
/*  32 */       Pattern ospn = Pattern.compile("^windows.*$", 2);
/*  33 */       String confpath = Thread.currentThread().getContextClassLoader().getResource(".").getPath();
/*  34 */       if (ospn.matcher(osname).matches()) {
/*  35 */         log.info("操作系统名称:" + osname + ",配置文件路径:" + System.getProperty("user.dir") + "\\productionConf.xml");
/*  36 */         doc = builder.build(confpath + "\\productionConf.xml");
/*     */       } else {
/*  38 */         log.info("操作系统名称:" + osname + ",配置文件路径:" + System.getProperty("user.dir") + "/productionConf.xml");
/*  39 */         doc = builder.build(confpath + "/productionConf.xml");
/*     */       }
/*     */ 
/*  43 */       Element productionConf = doc.getRootElement();
/*  44 */       Element uncomConf = productionConf.getChild("unicomconf");
/*     */ 
/*  46 */       SPSender.unicomIp = uncomConf.getChildText("ipaddr");
/*  47 */       SPSender.unicomPort = Integer.valueOf(uncomConf.getChildText("addrport")).intValue();
/*  48 */       String srcNodeId = uncomConf.getChildText("spNodeid");
/*  49 */       SGIPHeader.srcNodeId=srcNodeId;
/*  50 */       SPSender.spCorpId = srcNodeId.substring(5, 10);
/*  51 */       SPSender.spLoginName = uncomConf.getChildText("spUserName");
/*  52 */       SPSender.spLogPassword = uncomConf.getChildText("spPassword");
/*  53 */       UnicomSPMonitor.spListenPort = Integer.parseInt(uncomConf.getChildText("spListenPort"));
/*  54 */       UnicomSPMonitor.smgLoginUserName = uncomConf.getChildText("smgUserName");
/*  55 */       UnicomSPMonitor.smgLoginPassword = uncomConf.getChildText("smgPassword");
/*     */ 
/*  57 */       List<Element> productconfList = productionConf.getChildren("productconf");
/*  58 */       log.info("***************** 加载网关配置  ********************");
/*  59 */       log.info("联通SMG地址:" + SPSender.unicomIp);
/*  60 */       log.info("联通SMG端口:" + SPSender.unicomPort);
/*  61 */       log.info("源节点编号：" + SGIPHeader.srcNodeId);
/*  62 */       log.info("SMG连接SP端口:" + UnicomSPMonitor.spListenPort);
/*  63 */       log.info("SP登陆SMG用户名：" + SPSender.spLoginName);
/*  64 */       log.info("SP登陆SMG密码：" + SPSender.spLogPassword);
/*  65 */       log.info("SMG登陆SP用户名：" + UnicomSPMonitor.smgLoginUserName);
/*  66 */       log.info("SMG登陆SP密码：" + UnicomSPMonitor.smgLoginPassword);
/*  67 */       log.info("***************** 网关配置完成  ********************\n");
/*  68 */       log.info("***************** 加载转发配置  ********************");
/*  69 */       for (Element productconf : productconfList)
/*     */       {
/*  71 */         SPProduction productbean = new SPProduction();
/*  72 */         productbean.setName(productconf.getChildTextTrim("name"));
/*  73 */         productbean.setSpnumber(productconf.getChildTextTrim("spnumber"));
/*  74 */         productbean.setServiceType(productconf.getChildTextTrim("servicetype"));
/*  75 */         productbean.setTransmitIp(productconf.getChildTextTrim("transmitip"));
/*  76 */         productbean.setDestPort(Integer.valueOf(productconf.getChildTextTrim("destport")).intValue());
/*  77 */         productions.add(productbean);
/*     */ 
/*  79 */         log.info("产品名称:" + productbean.getName());
/*  80 */         log.info("SP接入号码:" + productbean.getSpnumber());
/*  81 */         log.info("业务代码:" + productbean.getServiceType());
/*  82 */         log.info("转发地址:" + productbean.getTransmitIp() + ":" + productbean.getDestPort() + "\n");
/*     */       }
/*  84 */       log.info("***************** 转发配置结束  ********************");
/*     */     } catch (JDOMException e) {
/*  86 */       log.error("解析转发配置文件出错!", e);
/*     */     } catch (IOException e) {
/*  88 */       log.error("解析转发配置文件发生IO流异常", e);
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.sgip.svr.SPProduction
 * JD-Core Version:    0.6.2
 */
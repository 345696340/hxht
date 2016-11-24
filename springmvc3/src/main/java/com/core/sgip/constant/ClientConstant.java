/*     */ package com.core.sgip.constant;
/*     */ 
/*     */ import com.core.sgip.interf.MessageHandler;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
/*     */ import java.util.Properties;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class ClientConstant
/*     */ {
/*  27 */   public static String COMPANY_CODE = "00000";
/*     */ 
/*  29 */   public static String AREA_CODE = "0731";
/*     */ 
/*  31 */   public static String LOGIN_NAME = "";
/*     */ 
/*  33 */   public static String LOGIN_PWD = "";
/*     */ 
/*  35 */   public static String SP_NUMBER = "";
/*     */ 
/*  37 */   public static String SERVER_IP = "110.52.11.6";
/*     */ 
/*  39 */   public static String SERVER_PORT = "8801";
/*     */ 
/*  41 */   public static int SGIP_SUBMIT_MAX_USER_NUMBER = 50;
/*     */ 
/*  43 */   public static int RESPONSE_TIMEOUT = 5;
/*     */ 
/*  45 */   public static int LOCALHOST_SGIP_PORT = 8804;
/*     */ 
/*  47 */   private static String SGIP_MESSAGE_HANDLE_CLASS = "com.core.sgip.interf.DefaultMessageHandler";
/*     */ 
/*  49 */   public static String DEFAULT_SERVICE_TYPE = "defaultype";
/*     */ 
/*  51 */   public static MessageHandler SGIP_MSG_HANDLER = null;
/*     */ 
/*  53 */   public static String PERMIT_IP = "110.52.11.6";
/*     */ 
/*  55 */   public static String IS_NIO = "y";
/*     */ 
/*     */   private static void initInstanceOfHandler(String messageHandlerClass)
/*     */   {
/*     */     try
/*     */     {
/* 122 */       Class clazz = Class.forName(messageHandlerClass);
/* 123 */       SGIP_MSG_HANDLER = (MessageHandler)clazz.newInstance();
/*     */     }
/*     */     catch (ClassNotFoundException e) {
/* 126 */       e.printStackTrace();
/*     */     }
/*     */     catch (InstantiationException e) {
/* 129 */       e.printStackTrace();
/*     */     }
/*     */     catch (IllegalAccessException e) {
/* 132 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   static
/*     */   {
/*  59 */     Properties props = new Properties();
/*     */     try
/*     */     {
/*  62 */       props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("sgip.properties"));
/*  63 */       Set<String> keys = props.stringPropertyNames();
/*  64 */       for (String key : keys)
/*     */       {
/*  66 */         if (key.startsWith("sgip.error"))
/*     */         {
/*  68 */           SGIPConstant.ERROR_CODE.put(key.substring("sgip.error".length() + 1), props.getProperty(key));
/*     */         }
/*     */       }
/*  71 */       SP_NUMBER = props.getProperty("client.SPNumber");
/*  72 */       LOGIN_NAME = props.getProperty("client.login.name");
/*  73 */       LOGIN_PWD = props.getProperty("client.login.pwd");
/*  74 */       AREA_CODE = props.getProperty("client.login.areaCode");
/*  75 */       COMPANY_CODE = props.getProperty("client.login.companyCode");
/*  76 */       SERVER_IP = props.getProperty("sgip.server.ip");
/*  77 */       SERVER_PORT = props.getProperty("sgip.server.port");
/*  78 */       String max = props.getProperty("sgip.submit.usernumber.max");
/*  79 */       if ((max != null) && (!"".equals(max)))
/*     */       {
/*  81 */         SGIP_SUBMIT_MAX_USER_NUMBER = Integer.valueOf(max).intValue();
/*     */       }
/*  83 */       String timeout = props.getProperty("sgip.receive.response.timeout");
/*  84 */       if ((timeout != null) && (!"".equals(timeout)))
/*     */       {
/*  86 */         RESPONSE_TIMEOUT = Integer.valueOf(timeout).intValue();
/*     */       }
/*  88 */       String port = props.getProperty("localhost.sgip.service.port");
/*  89 */       if ((port != null) && (!"".equals(port)))
/*     */       {
/*  91 */         LOCALHOST_SGIP_PORT = Integer.valueOf(port).intValue();
/*     */       }
/*  93 */       String serviceType = props.getProperty("sgip.submit.service.type");
/*  94 */       DEFAULT_SERVICE_TYPE = serviceType;
/*     */ 
/*  96 */       String validIp = props.getProperty("sgip.service.permit.ip");
/*  97 */       PERMIT_IP = validIp;
/*     */ 
/*  99 */       String isNio = props.getProperty("sgip.client.nio");
/* 100 */       if ((isNio != null) && (!"".equals(isNio)))
/*     */       {
/* 102 */         IS_NIO = isNio;
/*     */       }
/*     */ 
/* 105 */       String messageHandlerClass = props.getProperty("sgip.message.handle.class");
/* 106 */       if ((messageHandlerClass != null) && (!"".equals(messageHandlerClass)))
/*     */       {
/* 108 */         SGIP_MESSAGE_HANDLE_CLASS = messageHandlerClass;
/*     */       }
/* 110 */       initInstanceOfHandler(SGIP_MESSAGE_HANDLE_CLASS);
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/* 114 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.core.sgip.constant.ClientConstant
 * JD-Core Version:    0.6.2
 */
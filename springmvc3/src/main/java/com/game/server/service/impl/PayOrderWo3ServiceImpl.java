/*    */ package com.game.server.service.impl;
/*    */ 
/*    */ import com.game.server.service.PayOrderWo3Service;

/*    */ import com.game.server.util.XstreamUtil;
/*    */ import com.game.server.vo.request.PayOrderAiPayTradeRequest;
/*    */ import com.game.server.vo.response.PayOrderAiPayTradeResponse;
/*    */ import java.io.BufferedOutputStream;
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.net.HttpURLConnection;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class PayOrderWo3ServiceImpl
/*    */   implements PayOrderWo3Service
/*    */ {
/*    */   public String sendHttp(String urlStr, String xml)
/*    */     throws IOException
/*    */   {
/* 20 */     URL url = new URL(urlStr);
/* 21 */     System.out.println(url.toString());
/* 22 */     HttpURLConnection urlConn = (HttpURLConnection)url.openConnection();
/*    */ 
/* 24 */     urlConn.setDoOutput(true);
/* 25 */     urlConn.setDoInput(true);
/* 26 */     urlConn.setUseCaches(false);
/*    */ 
/* 28 */     urlConn.setRequestProperty("Content-typ", "text/plain");
/* 29 */     urlConn.setRequestProperty("Proxy-Connection", "Keep-Alive");
/* 30 */     urlConn.setRequestProperty("Content-type", "text/html");
/* 31 */     urlConn.setRequestProperty("Accept-Charset", "gbk");
/* 32 */     urlConn.setRequestProperty("contentType", "gbk");
/* 33 */     urlConn.setRequestMethod("POST");
/* 34 */     urlConn.connect();
/* 35 */     OutputStream outStrm = urlConn.getOutputStream();
/* 36 */     BufferedOutputStream oos = new BufferedOutputStream(outStrm);
/* 37 */     oos.write(xml.getBytes());
/* 38 */     oos.flush();
/* 39 */     oos.close();
/* 40 */     InputStream inStrm = urlConn.getInputStream();
/* 41 */     ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
/* 42 */     byte[] buffer = new byte[1024];
/* 43 */     int len = -1;
/* 44 */     while ((len = inStrm.read(buffer)) != -1) {
/* 45 */       outSteam.write(buffer, 0, len);
/*    */     }
/* 47 */     outSteam.close();
/* 48 */     inStrm.close();
/* 49 */     String returnValue = new String(outSteam.toString().getBytes("gbk"), "utf-8");
/* 50 */     System.out.println(new String(outSteam.toString().getBytes("gbk"), "utf-8"));
/* 51 */     return returnValue;
/*    */   }
/*    */ 
/*    */   public PayOrderAiPayTradeResponse webPay(PayOrderAiPayTradeRequest payOrderAiPayTradeRequest)
/*    */   {
/* 57 */     String xml = XstreamUtil.objFromXml(payOrderAiPayTradeRequest);
/* 58 */     String returnXml = "";
/*    */     try {
/* 60 */       returnXml = sendHttp("http://120.52.21.138:8080/aipay_web/web/woAppWebPay.do", xml);
/*    */     } catch (IOException e) {
/* 62 */       e.printStackTrace();
/*    */     }
/* 64 */     return null;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.impl.PayOrderWo3ServiceImpl
 * JD-Core Version:    0.6.2
 */
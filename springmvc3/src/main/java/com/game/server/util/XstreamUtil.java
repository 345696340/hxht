/*    */ package com.game.server.util;
/*    */ 
/*    */ import com.game.server.vo.request.PayOrderAiPayTradeRequest;
/*    */ import com.game.server.vo.response.PayOrderAiPayTradeResponse;
/*    */ import com.thoughtworks.xstream.XStream;
/*    */ import com.thoughtworks.xstream.io.xml.DomDriver;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.PrintStream;
/*    */ import java.io.StringBufferInputStream;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ 
/*    */ public class XstreamUtil
/*    */ {
/*    */   public static Object xmlFromObj(String xml)
/*    */   {
/*    */     try
/*    */     {
/* 24 */       xml = new String(xml.getBytes("UTF-8"), "UTF-8");
/* 25 */       System.out.println("xml : " + xml);
/*    */     }
/*    */     catch (UnsupportedEncodingException e) {
/* 28 */       e.printStackTrace();
/*    */     }
/* 30 */     return xmlFromObj(new StringBufferInputStream(xml));
/*    */   }
/*    */ 
/*    */   public static Object xmlFromObj(InputStream in) {
/* 34 */     PayOrderAiPayTradeResponse datas = null;
/*    */     try {
/* 36 */       BufferedReader reader = null;
/* 37 */       XStream xstream = new XStream(new DomDriver());
/* 38 */       xstream.autodetectAnnotations(true);
/* 39 */       xstream.processAnnotations(PayOrderAiPayTradeResponse.class);
/* 40 */       StringBuffer bufferStr = new StringBuffer();
/*    */       try
/*    */       {
/* 43 */         reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
/*    */       } catch (UnsupportedEncodingException e) {
/* 45 */         e.printStackTrace();
/*    */       }
/*    */ 
/* 48 */       if (reader != null)
/*    */         try {
/* 50 */           String line = reader.readLine();
/* 51 */           while (line != null) {
/* 52 */             bufferStr.append(line);
/* 53 */             line = reader.readLine();
/*    */           }
/* 55 */           datas = (PayOrderAiPayTradeResponse)xstream.fromXML(bufferStr.toString());
/*    */         }
/*    */         catch (Exception e)
/*    */         {
/*    */         }
/*    */     }
/*    */     catch (Exception e) {
/* 62 */       e.printStackTrace();
/*    */     }
/* 64 */     return datas;
/*    */   }
/*    */ 
/*    */   public static String objFromXml(PayOrderAiPayTradeRequest datas) {
/* 68 */     XStream xstream = new XStream();
/* 69 */     xstream.autodetectAnnotations(true);
/* 70 */     xstream.processAnnotations(PayOrderAiPayTradeRequest.class);
/* 71 */     String xml = xstream.toXML(datas);
/* 72 */     xml = xml.replaceAll("\n", "");
/* 73 */     xml = xml.replaceAll("\r", "");
/* 74 */     return xml;
/*    */   }
/*    */ 
/*    */   public static void main(String[] agre)
/*    */   {
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.XstreamUtil
 * JD-Core Version:    0.6.2
 */
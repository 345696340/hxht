/*     */ package com.game.server.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.apache.http.HttpEntity;
/*     */ import org.apache.http.HttpResponse;
/*     */ import org.apache.http.ParseException;
/*     */ import org.apache.http.client.ClientProtocolException;
/*     */ import org.apache.http.client.HttpClient;
/*     */ import org.apache.http.client.entity.UrlEncodedFormEntity;
/*     */ import org.apache.http.client.methods.HttpPost;
/*     */ import org.apache.http.client.methods.HttpUriRequest;
/*     */ import org.apache.http.conn.ClientConnectionManager;
/*     */ import org.apache.http.entity.StringEntity;
/*     */ import org.apache.http.impl.client.DefaultHttpClient;
/*     */ import org.apache.http.params.BasicHttpParams;
/*     */ import org.apache.http.params.HttpConnectionParams;
/*     */ import org.apache.http.params.HttpParams;
/*     */ import org.apache.http.util.EntityUtils;
/*     */ 
/*     */ public class SmsUtil
/*     */ {
/* 104 */   String urlHead = "http://182.92.244.52:8080/sms-web";
/*     */ 
/*     */   public String send(String url, String mobiles)
/*     */   {
/*  32 */     DefaultHttpClient httpclient = new DefaultHttpClient();
/*  33 */     String body = null;
/*  34 */     HttpPost post = postForm(url);
/*  35 */     StringEntity httpEntity = null;
/*     */     try {
/*  37 */       httpEntity = new StringEntity(mobiles);
/*     */     } catch (UnsupportedEncodingException e) {
/*  39 */       e.printStackTrace();
/*     */     }
/*  41 */     post.setEntity(httpEntity);
/*  42 */     body = invoke(httpclient, post);
/*  43 */     System.out.println(body);
/*  44 */     httpclient.getConnectionManager().shutdown();
/*  45 */     return body;
/*     */   }
/*     */ 
/*     */   private static String invoke(DefaultHttpClient httpclient, HttpUriRequest httpost)
/*     */   {
/*  50 */     HttpResponse response = sendRequest(httpclient, httpost);
/*  51 */     String body = paseResponse(response);
/*  52 */     return body;
/*     */   }
/*     */ 
/*     */   private static String paseResponse(HttpResponse response) {
/*  56 */     HttpEntity entity = response.getEntity();
/*  57 */     String charset = EntityUtils.getContentCharSet(entity);
/*  58 */     String body = null;
/*     */     try {
/*  60 */       body = EntityUtils.toString(entity);
/*     */     } catch (ParseException e) {
/*  62 */       e.printStackTrace();
/*     */     } catch (IOException e) {
/*  64 */       e.printStackTrace();
/*     */     }
/*  66 */     return body;
/*     */   }
/*     */ 
/*     */   private static HttpResponse sendRequest(DefaultHttpClient httpclient, HttpUriRequest httpost)
/*     */   {
/*  71 */     HttpResponse response = null;
/*     */     try {
/*  73 */       response = httpclient.execute(httpost);
/*     */     } catch (ClientProtocolException e) {
/*  75 */       e.printStackTrace();
/*     */     } catch (IOException e) {
/*  77 */       e.printStackTrace();
/*     */     }
/*  79 */     return response;
/*     */   }
/*     */ 
/*     */   private static HttpPost postForm(String url) {
/*  83 */     HttpPost httpost = new HttpPost(url);
/*  84 */     List nvps = new ArrayList();
/*     */     try {
/*  86 */       httpost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
/*     */     } catch (UnsupportedEncodingException e) {
/*  88 */       e.printStackTrace();
/*     */     }
/*  90 */     return httpost;
/*     */   }
/*     */ 
/*     */   public HttpClient getHttpClient() {
/*  94 */     HttpParams httpParams = new BasicHttpParams();
/*  95 */     HttpConnectionParams.setConnectionTimeout(httpParams, 10000);
/*     */ 
/*  97 */     HttpConnectionParams.setTcpNoDelay(httpParams, true);
/*  98 */     httpParams.setBooleanParameter("http.protocol.expect-continue", false);
/*  99 */     HttpClient httpClient = new DefaultHttpClient(httpParams);
/*     */ 
/* 101 */     return httpClient;
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.SmsUtil
 * JD-Core Version:    0.6.2
 */
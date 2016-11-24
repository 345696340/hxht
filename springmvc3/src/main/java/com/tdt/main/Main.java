/*    */ package com.tdt.main;
/*    */ 
/*    */ import com.tdt.unicom.domains.Submit;
/*    */ import com.tdt.unicom.sgip.svr.UnicomSPMonitor;
/*    */ import com.tdt.unicom.spsvr.ClientUnicomMonitor;
/*    */ import java.io.IOException;
/*    */ import java.util.Collections;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class Main
/*    */ {
/* 19 */   private static final Map<String, Submit> MT_SENDED_MAP = Collections.synchronizedMap(new HashMap());
/*    */ 
/*    */   public void lauchSystem() {
/* 22 */     new Thread(new launchUnicomSPMonitor()).start();
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 26 */     Main main = new Main();
/* 27 */     main.lauchSystem();
/*    */   }
/*    */ 
/*    */   static class launchUnicomSPMonitor
/*    */     implements Runnable
/*    */   {
/*    */     public void run()
/*    */     {
/*    */       try
/*    */       {
/* 38 */         new UnicomSPMonitor(Main.MT_SENDED_MAP).startSvr();
/*    */       } catch (IOException e) {
/* 40 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   static class launchClientReqMonitor
/*    */     implements Runnable
/*    */   {
/*    */     public void run()
/*    */     {
/* 32 */       new ClientUnicomMonitor(Main.MT_SENDED_MAP).recsvr();
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.main.Main
 * JD-Core Version:    0.6.2
 */
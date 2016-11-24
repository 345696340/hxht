/*    */ package com.game.server.service;
/*    */ 
/*    */ import com.tdt.unicom.domains.Submit;
/*    */ import com.tdt.unicom.sgip.svr.UnicomSPMonitor;
/*    */ import java.io.IOException;
/*    */ import java.util.Collections;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class SGIPServiceThread extends Thread
/*    */   implements Runnable
/*    */ {
/* 18 */   private static final Map<String, Submit> MT_SENDED_MAP = Collections.synchronizedMap(new HashMap());
/*    */ 
/*    */   public void run()
/*    */   {
/* 22 */     new Thread(new launchUnicomSPMonitor()).start();
/*    */   }
/*    */ 
/*    */   static class launchUnicomSPMonitor implements Runnable {
/*    */     public void run() {
/*    */       try {
/* 28 */         new UnicomSPMonitor(SGIPServiceThread.MT_SENDED_MAP).startSvr();
/*    */       } catch (IOException e) {
/* 30 */         e.printStackTrace();
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.service.SGIPServiceThread
 * JD-Core Version:    0.6.2
 */
/*    */ package com.tdt.unicom.sgip.svr;
/*    */ 
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
/*    */ import java.util.concurrent.ThreadFactory;
/*    */ 
/*    */ public class MOCarrier
/*    */ {
/*    */   private ExecutorService exec;
/*    */ 
/*    */   public MOCarrier()
/*    */   {
/* 13 */     this.exec = Executors.newCachedThreadPool(new ThreadFactory() {
/* 14 */       int threadNo = 0;
/*    */ 
/* 16 */       public Thread newThread(Runnable task) { this.threadNo += 1;
/* 17 */         Thread thread = new Thread(task);
/* 18 */         thread.setName("MO-Carrier-" + this.threadNo);
/* 19 */         return thread;
/*    */       }
/*    */     });
/*    */   }
/*    */ 
/*    */   class Woker
/*    */     implements Runnable
/*    */   {
/*    */     Woker()
/*    */     {
/*    */     }
/*    */ 
/*    */     public void run()
/*    */     {
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\com.sms.sgip-2.0-beta-7.jar
 * Qualified Name:     com.tdt.unicom.sgip.svr.MOCarrier
 * JD-Core Version:    0.6.2
 */
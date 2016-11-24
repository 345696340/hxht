/*    */ package com.game.server.task;
/*    */ 
/*    */ import com.game.server.biz.BizFacade;
/*    */ import com.game.server.model.dto.GameInfo;
/*    */ import com.game.server.model.dto.GameInfoCachedMap;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ @Service
/*    */ public class GameInfoTask
/*    */ {
/*    */   BizFacade bizFacade;
/*    */ 
/*    */   public void job()
/*    */   {
/* 21 */     List<GameInfo> list = this.bizFacade.getGameList();
/* 22 */     for (GameInfo temp : list)
/* 23 */       GameInfoCachedMap.getMap().put(temp.getUid().toString(), temp);
/*    */   }
/*    */ 
/*    */   public BizFacade getBizFacade()
/*    */   {
/* 28 */     return this.bizFacade;
/*    */   }
/*    */ 
/*    */   public void setBizFacade(BizFacade bizFacade) {
/* 32 */     this.bizFacade = bizFacade;
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.task.GameInfoTask
 * JD-Core Version:    0.6.2
 */
/*    */ package com.game.server.model.dto;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.LinkedList;
/*    */ import java.util.List;
/*    */ import java.util.TreeMap;
/*    */ 
/*    */ public class GameInfoCachedMap
/*    */ {
/* 13 */   private static TreeMap<String, GameInfo> map = new TreeMap();
/*    */ 
/* 15 */   private static List gameList = new ArrayList();
/*    */ 
/* 17 */   private static LinkedList gameSort = new LinkedList();
/*    */ 
/*    */   public TreeMap<String, GameInfo> GameInfoCachedMap()
/*    */   {
/* 21 */     return map;
/*    */   }
/*    */ 
/*    */   public static List getGameList() {
/* 25 */     return gameList;
/*    */   }
/*    */ 
/*    */   public static void setGameList(List gameList) {
/* 29 */     gameList = gameList;
/*    */   }
/*    */ 
/*    */   public static TreeMap<String, GameInfo> getMap() {
/* 33 */     return map;
/*    */   }
/*    */ 
/*    */   public static void setMap(TreeMap<String, GameInfo> map) {
/* 37 */     map = map;
/*    */   }
/*    */ 
/*    */   public static LinkedList getGameSort() {
/* 41 */     return gameSort;
/*    */   }
/*    */ 
/*    */   public static void setGameSort(LinkedList gameSort) {
/* 45 */     gameSort = gameSort;
/*    */   }
/*    */ }

/* Location:           D:\com.email.game.db-1.0-SNAPSHOT.jar
 * Qualified Name:     com.game.server.model.dto.GameInfoCachedMap
 * JD-Core Version:    0.6.2
 */
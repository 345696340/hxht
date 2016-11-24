/*    */ package com.game.server.util;
/*    */ 
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParser;
/*    */ import flexjson.JSONSerializer;
/*    */ import flexjson.transformer.DateTransformer;
/*    */ 
/*    */ public class JsonUtil
/*    */ {
/*    */   public static JSONSerializer getJSONSerializer(String[] dateFields)
/*    */   {
/* 19 */     JSONSerializer serializer = new JSONSerializer();
/* 20 */     serializer.exclude(new String[] { "class" });
/* 21 */     serializer.transform(new DateTransformer("yyyy-MM-dd HH:mm:ss"), dateFields);
/*    */ 
/* 23 */     return serializer;
/*    */   }
/*    */ 
/*    */   public static JSONSerializer getJSONSerializer(String[] dateFields, String option)
/*    */   {
/* 28 */     JSONSerializer serializer = new JSONSerializer();
/* 29 */     serializer.exclude(new String[] { "class" });
/* 30 */     serializer.transform(new DateTransformer(option), dateFields);
/* 31 */     return serializer;
/*    */   }
/*    */ 
/*    */   public static Object json2bean(String json, Class c) {
/* 35 */     Gson g = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
/*    */ 
/* 37 */     return g.fromJson(json, c);
/*    */   }
/*    */ 
/*    */   public static String bean2json(Object o) {
/* 41 */     Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").setPrettyPrinting().disableHtmlEscaping().excludeFieldsWithoutExposeAnnotation().create();
/*    */ 
/* 44 */     String returnValue = null;
/*    */     try {
/* 46 */       returnValue = g.toJson(o);
/*    */     } catch (Exception e) {
/* 48 */       e.printStackTrace();
/*    */     }
/* 50 */     return returnValue;
/*    */   }
/*    */ 
/*    */   public static String getAsString(String jsonStr, String key) {
/* 54 */     JsonObject jo = (JsonObject)new JsonParser().parse(jsonStr);
/* 55 */     return jo.get(key).getAsString();
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.JsonUtil
 * JD-Core Version:    0.6.2
 */
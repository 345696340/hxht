/*    */ package com.game.server.util;
/*    */ 
/*    */ import java.lang.reflect.Array;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
/*    */ import java.util.Date;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ public class ObjectToString
/*    */ {
/* 12 */   private static final Logger logger = Logger.getLogger("A1");
/*    */ 
/*    */   public String outObjPropertyString(Object obj) {
/* 15 */     StringBuffer sb = new StringBuffer();
/* 16 */     if (null != obj) {
/*    */       try {
/* 18 */         getPropertyString(obj, sb);
/*    */       } catch (Exception e) {
/* 20 */         logger.debug("outObjPropertyString is error " + e.getMessage());
/* 21 */         e.printStackTrace();
/*    */       }
/*    */     }
/* 24 */     return sb.toString();
/*    */   }
/*    */ 
/*    */   public String getPropertyString(Object entityName, StringBuffer sb) throws Exception {
/* 28 */     Class c = entityName.getClass();
/* 29 */     Field[] field = c.getDeclaredFields();
/* 30 */     Object obj = null;
/* 31 */     String classname = "";
/* 32 */     Object tempObj = null;
/* 33 */     sb.append("------  begin ------\n");
/* 34 */     for (Field f : field)
/*    */     {
/* 36 */       sb.append(f.getName());
/* 37 */       sb.append(" : ");
/* 38 */       obj = invokeMethod(entityName, f.getName(), f.getType(), null);
/* 39 */       if (null != obj) {
/* 40 */         if (obj.getClass().isArray()) {
/* 41 */           for (int i = 0; i < Array.getLength(obj); i++) {
/* 42 */             tempObj = Array.get(obj, i);
/* 43 */             if (tempObj.getClass().isPrimitive())
/* 44 */               sb.append(tempObj.toString());
/* 45 */             else if ((tempObj instanceof String))
/* 46 */               sb.append(tempObj.toString());
/* 47 */             else if ((tempObj instanceof Date))
/* 48 */               sb.append(tempObj.toString());
/* 49 */             else if ((tempObj instanceof Number))
/* 50 */               sb.append(tempObj.toString());
/*    */             else {
/* 52 */               getPropertyString(tempObj, sb);
/*    */             }
/*    */           }
/*    */         }
/*    */ 
/* 57 */         classname = obj.getClass().getName();
/* 58 */         if (classname.indexOf("com.cignacmb.core.model.") > -1) {
/* 59 */           getPropertyString(obj, sb);
/*    */         }
/*    */ 
/*    */       }
/*    */ 
/* 69 */       sb.append(obj);
/* 70 */       sb.append("\n");
/*    */     }
/* 72 */     sb.append("------  end ------\n");
/* 73 */     return sb.toString();
/*    */   }
/*    */ 
/*    */   public Object invokeMethod(Object owner, String methodName, Class fieldType, Object[] args) throws Exception
/*    */   {
/* 78 */     Class ownerClass = owner.getClass();
/*    */ 
/* 80 */     methodName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
/* 81 */     Method method = null;
/*    */     try {
/* 83 */       if (fieldType == Boolean.TYPE)
/* 84 */         method = ownerClass.getMethod("is" + methodName, new Class[0]);
/*    */       else
/* 86 */         method = ownerClass.getMethod("get" + methodName, new Class[0]);
/*    */     }
/*    */     catch (SecurityException e) {
/* 89 */       e.printStackTrace();
/*    */     }
/*    */     catch (NoSuchMethodException e)
/*    */     {
/* 93 */       return " can't find 'get" + methodName + "' method";
/*    */     }
/*    */ 
/* 96 */     return method.invoke(owner, new Object[0]);
/*    */   }
/*    */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.ObjectToString
 * JD-Core Version:    0.6.2
 */
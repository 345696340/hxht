/*     */ package com.game.server.util;
/*     */ 
/*     */ import java.lang.reflect.Array;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.util.AbstractMap;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class TypeUtil
/*     */ {
/*     */   private static String complexTypeToString(String scope, Object parentObject, List visitedObjs)
/*     */   {
/*  20 */     StringBuffer buffer = new StringBuffer("");
/*     */     try
/*     */     {
/*  26 */       Class cl = parentObject.getClass();
/*  27 */       while (cl != null)
/*     */       {
/*  29 */         processFields(cl.getDeclaredFields(), scope, parentObject, buffer, visitedObjs);
/*     */ 
/*  35 */         cl = cl.getSuperclass();
/*     */       }
/*     */     } catch (IllegalAccessException iae) {
/*  38 */       buffer.append(iae.toString());
/*     */     }
/*     */ 
/*  41 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */   private static void processFields(Field[] fields, String scope, Object parentObject, StringBuffer buffer, List visitedObjs)
/*     */     throws IllegalAccessException
/*     */   {
/*  59 */     for (int i = 0; i < fields.length; i++)
/*     */     {
/*  63 */       if ((!fields[i].getName().equals("__discriminator")) && (!fields[i].getName().equals("__uninitialized")))
/*     */       {
/*  72 */         fields[i].setAccessible(true);
/*  73 */         if (!Modifier.isStatic(fields[i].getModifiers()))
/*     */         {
/*  80 */           buffer.append(typeToString(scope + "." + fields[i].getName(), fields[i].get(parentObject), visitedObjs));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static boolean isCollectionType(Object obj)
/*     */   {
/*  94 */     return (obj.getClass().isArray()) || ((obj instanceof Collection)) || ((obj instanceof Hashtable)) || ((obj instanceof HashMap)) || ((obj instanceof HashSet)) || ((obj instanceof List)) || ((obj instanceof AbstractMap));
/*     */   }
/*     */ 
/*     */   public static boolean isComplexType(Object obj)
/*     */   {
/* 111 */     if (((obj instanceof Boolean)) || ((obj instanceof Short)) || ((obj instanceof Byte)) || ((obj instanceof Integer)) || ((obj instanceof Long)) || ((obj instanceof Float)) || ((obj instanceof Character)) || ((obj instanceof Double)) || ((obj instanceof String)))
/*     */     {
/* 121 */       return false;
/*     */     }
/* 123 */     Class objectClass = obj.getClass();
/*     */ 
/* 125 */     if ((objectClass == Boolean.TYPE) || (objectClass == Boolean.class) || (objectClass == Short.TYPE) || (objectClass == Short.class) || (objectClass == Byte.TYPE) || (objectClass == Byte.class) || (objectClass == Integer.TYPE) || (objectClass == Integer.class) || (objectClass == Long.TYPE) || (objectClass == Long.class) || (objectClass == Float.TYPE) || (objectClass == Float.class) || (objectClass == Character.TYPE) || (objectClass == Character.class) || (objectClass == Double.TYPE) || (objectClass == Double.class) || (objectClass == String.class))
/*     */     {
/* 142 */       return false;
/*     */     }
/* 144 */     return true;
/*     */   }
/*     */ 
/*     */   private static String collectionTypeToString(String scope, Object obj, List visitedObjs)
/*     */   {
/* 159 */     StringBuffer buffer = new StringBuffer("");
/* 160 */     if (obj.getClass().isArray()) {
/* 161 */       if (Array.getLength(obj) > 0)
/* 162 */         for (int j = 0; j < Array.getLength(obj); j++) {
/* 163 */           Object x = Array.get(obj, j);
/* 164 */           buffer.append(typeToString(scope + "[" + j + "]", x, visitedObjs));
/*     */         }
/*     */       else
/* 167 */         buffer.append(scope + "[]: empty/n");
/*     */     }
/*     */     else {
/* 170 */       boolean isCollection = obj instanceof Collection;
/* 171 */       boolean isHashTable = obj instanceof Hashtable;
/* 172 */       boolean isHashMap = obj instanceof HashMap;
/* 173 */       boolean isHashSet = obj instanceof HashSet;
/* 174 */       boolean isAbstractMap = obj instanceof AbstractMap;
/* 175 */       boolean isMap = (isAbstractMap) || (isHashMap) || (isHashTable);
/* 176 */       if (isMap) {
/* 177 */         Set keySet = ((Map)obj).keySet();
/* 178 */         Iterator iterator = keySet.iterator();
/* 179 */         int size = keySet.size();
/* 180 */         if (size > 0)
/* 181 */           for (int j = 0; iterator.hasNext(); j++) {
/* 182 */             Object key = iterator.next();
/* 183 */             Object x = ((Map)obj).get(key);
/* 184 */             buffer.append(typeToString(scope + "[/" + key + "/]", x, visitedObjs));
/*     */           }
/*     */         else
/* 187 */           buffer.append(scope + "[]: empty/n");
/*     */       }
/* 189 */       else if ((isCollection) || (isHashSet))
/*     */       {
/* 192 */         Iterator iterator = null;
/* 193 */         int size = 0;
/* 194 */         if (obj != null) {
/* 195 */           if (isCollection) {
/* 196 */             iterator = ((Collection)obj).iterator();
/* 197 */             size = ((Collection)obj).size();
/* 198 */           } else if (isHashTable) {
/* 199 */             iterator = ((Hashtable)obj).values().iterator();
/* 200 */             size = ((Hashtable)obj).size();
/* 201 */           } else if (isHashSet) {
/* 202 */             iterator = ((HashSet)obj).iterator();
/* 203 */             size = ((HashSet)obj).size();
/* 204 */           } else if (isHashMap) {
/* 205 */             iterator = ((HashMap)obj).values().iterator();
/* 206 */             size = ((HashMap)obj).size();
/*     */           }
/* 208 */           if (size > 0)
/* 209 */             for (int j = 0; iterator.hasNext(); j++) {
/* 210 */               Object x = iterator.next();
/* 211 */               buffer.append(typeToString(scope + "[" + j + "]", x, visitedObjs));
/*     */             }
/*     */           else {
/* 214 */             buffer.append(scope + "[]: empty/n");
/*     */           }
/*     */         }
/*     */         else
/*     */         {
/* 219 */           buffer.append(scope + "[]: null/n");
/*     */         }
/*     */       }
/*     */     }
/* 223 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */   private static String typeToString(String scope, Object obj, List visitedObjs)
/*     */   {
/* 236 */     if (obj == null)
/* 237 */       return scope + ": null";
/* 238 */     if (isCollectionType(obj))
/* 239 */       return collectionTypeToString(scope, obj, visitedObjs);
/* 240 */     if (isComplexType(obj)) {
/* 241 */       if (!visitedObjs.contains(obj)) {
/* 242 */         visitedObjs.add(obj);
/* 243 */         return complexTypeToString(scope, obj, visitedObjs);
/*     */       }
/* 245 */       return scope + ": <already visited>/n";
/*     */     }
/*     */ 
/* 248 */     return scope + ": " + obj.toString();
/*     */   }
/*     */ 
/*     */   public static String typeToString(String scope, Object obj)
/*     */   {
/* 264 */     if (obj == null)
/* 265 */       return ": null";
/* 266 */     if (isCollectionType(obj))
/* 267 */       return collectionTypeToString(scope, obj, new ArrayList());
/* 268 */     if (isComplexType(obj)) {
/* 269 */       return complexTypeToString(scope, obj, new ArrayList());
/*     */     }
/* 271 */     return scope + ": " + obj.toString();
/*     */   }
/*     */ }

/* Location:           D:\daima\com.zip
 * Qualified Name:     com.game.server.util.TypeUtil
 * JD-Core Version:    0.6.2
 */
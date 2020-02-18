/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.business.utility;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import it.csi.siac.siaccommon.util.log.LogUtil;

public final class DummyMapper {
	private static LogUtil log = new LogUtil(DummyMapper.class);
	
	/** Costruttore privato per non instanziabilit&agrave; */
	private DummyMapper() {
		// Non permettere l'instanziazione
	}
	
	/**
	 * rimappa i fields di un oggetto sorgente accessibili via pulic accessor (getQualcosa()) solo se non sono null (o empty in caso di collection)
	 * sull'oggetto di destinazione.
	 * 
	 * @param src
	 * @param dest
	 */
	public static void mapNotNullNotEmpty(Object src, Object dest) {
		if(src == null){
			return;
		}
		
		final Map<String, Method> methods = getMethods(src);
		
		for(Entry<String, Method> methodEntry : methods.entrySet()) {
			final String setMethodName = methodEntry.getKey().replaceFirst("^(get)", "set");
			if(methodEntry.getKey().startsWith("get")
					&& !"getClass".equals(methodEntry.getKey())
					&& methods.containsKey(setMethodName)){
				Object obj;
				try {
					obj = getValue(src, methodEntry.getValue());
				} catch (IllegalArgumentException e) {
					// L'errore e' gia' stato loggato
					continue;
				}
				if(obj != null){
					// Setto in destinazione solo se l'oggetto non e' null
					if(obj instanceof Collection && ((Collection<?>) obj).isEmpty()){
						// e solo se la collection non e' vuota!
						continue;
					}
					final Class<?> objType = methodEntry.getValue().getReturnType();
					setValue(dest, obj, setMethodName, objType);
				}
			}
		}
	}
	
	private static Map<String, Method> getMethods(Object src) {
		final Method[] methods = src.getClass().getMethods();
		Map<String, Method> res = new HashMap<String, Method>();
		for(Method method : methods) {
			res.put(method.getName(), method);
		}
		
		return res;
	}
	
	private static Object getValue(Object src, Method method) {
		final String metName = "getValue";
		final String methodName = method.getName();
		Object obj = null;
		try {
			obj = method.invoke(src);
		} catch (IllegalArgumentException e) {
			final String errMsg = "getMethod:" + methodName + " value: " + obj + "[IllegalArgumentException: " + e.getMessage() + "]";
			log.debug(metName, errMsg);
			throw new IllegalArgumentException(errMsg, e);
		} catch (IllegalAccessException e) {
			final String errMsg = "getMethod:" + methodName + " value: " + obj + "[IllegalAccessException: " + e.getMessage() + "]";
			log.debug(metName, errMsg);
			throw new IllegalArgumentException(errMsg, e);
		} catch (InvocationTargetException e) {
			final String errMsg = "getMethod:" + methodName + " value: " + obj + "[InvocationTargetException: " + e.getMessage() + "]";
			log.warn(metName, errMsg, e.getCause());
			throw new IllegalArgumentException(errMsg, e);
		}
		return obj;
	}
	
	private static void setValue(Object dest, Object obj, String setMethodName, Class<?> objType) {
		final String metName = "setValue";
		try {
			final Method setMethod = dest.getClass().getMethod(setMethodName, objType);
			setMethod.invoke(dest, obj);
		} catch (SecurityException e) {
			log.debug(metName, "SecurityException invoking:" + setMethodName + " value: " + obj + " [" + e.getMessage() + "]");
		} catch (NoSuchMethodException e) {
			log.debug(metName, "NoSuchMethodException invoking setMethod:" + setMethodName + " value: " + obj + " [" + e.getMessage() + "]");
		} catch (IllegalArgumentException e) {
			log.debug(metName, "IllegalArgumentException invoking setMethod:" + setMethodName + " value: " + obj + " [" + e.getMessage() + "]");
		} catch (IllegalAccessException e) {
			log.debug(metName, "IllegalAccessException invoking setMethod:" + setMethodName + " value: " + obj + " [" + e.getMessage() + "]");
		} catch (InvocationTargetException e) {
			log.warn(metName, "InvocationTargetException invoking setMethod:" + setMethodName + " value: " +obj + " [" + e.getMessage() + "]", e.getCause());
		}
	}

}

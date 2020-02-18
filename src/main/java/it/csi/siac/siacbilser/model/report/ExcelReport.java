/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.report;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

/**
 * VariazioneImportoCapitolo.
 *
 * @author Elisa Chiari 
 * @version 1.0.0 - 17/07/2017
 * 
 */
public abstract class ExcelReport implements Serializable {
	
	/** Per la serializzazione */
	private static final long serialVersionUID = 1289903525295240026L;

	/**
	 * Trasforma tutti i campi dell'oggetto forniti in input in campi di una mappa
	 * @param reportColumns i campi da trasformare
	 * @return la mappa dei campi
	 * @throws IllegalArgumentException nel caso in cui vi sia un errore nella generazione della mappa
	 */
	protected <T extends ReportColumn> Map<T, Object> getAsMap(T... reportColumns) {
		final Map<T ,Object> mappa = new HashMap<T, Object>();
		final Class<?> clazz = this.getClass();
		
		for(T rc : reportColumns) {
			final String getterName = "get" + StringUtils.capitalize(rc.getFieldName());
			try {
				final Method getter = clazz.getMethod(getterName);
				final Object fieldValue = getter.invoke(this);
				mappa.put(rc, fieldValue);
			} catch (SecurityException e) {
				throw new IllegalArgumentException("Errore di sicurezza nella generazione della mappa per la classe " + this.getClass()
					+ " e campo " + rc.getFieldName(), e);
			} catch (NoSuchMethodException e) {
				throw new IllegalArgumentException("Getter non trovato nella generazione della mappa per la classe " + this.getClass()
					+ " e campo " + rc.getFieldName(), e);
			} catch (IllegalArgumentException e) {
				throw new IllegalArgumentException("Errore nel passaggio degli argomenti al getter nella generazione della mappa per la classe "
					+ this.getClass() + " e campo " + rc.getFieldName(), e);
			} catch (IllegalAccessException e) {
				throw new IllegalArgumentException("Accesso non permesso nella generazione della mappa per la classe " + this.getClass()
					+ " e campo " + rc.getFieldName(), e);
			} catch (InvocationTargetException e) {
				throw new IllegalArgumentException("Errore interno nella generazione della mappa per la classe " + this.getClass()
					+ " e campo " + rc.getFieldName(), e);
			}
		}
		return mappa;
	}
	
	/**
	 * @return
	 */
	public abstract <T extends ReportColumn> Map<T, Object> getCampi();
	
}

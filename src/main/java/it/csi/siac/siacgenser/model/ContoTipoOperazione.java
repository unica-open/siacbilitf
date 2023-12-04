/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.bind.annotation.XmlType;

/**
 * raggruppa le attuali configurazioni di utilizzo del conto nell'ambito della
 * causale
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.31.26
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class ContoTipoOperazione implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1117168375247749737L;

	private Conto conto;
	
	private ClasseDiConciliazione classeDiConciliazione;
	
	private OperazioneSegnoConto operazioneSegnoConto;
	private OperazioneUtilizzoConto operazioneUtilizzoConto;
	private OperazioneUtilizzoImporto operazioneUtilizzoImporto;
	private OperazioneTipoImporto operazioneTipoImporto;
	/**
	 * @return the conto
	 */
	public Conto getConto() {
		return conto;
	}
	/**
	 * @param conto the conto to set
	 */
	public void setConto(Conto conto) {
		this.conto = conto;
	}
	/**
	 * @return the operazioneSegnoConto
	 */
	public OperazioneSegnoConto getOperazioneSegnoConto() {
		return operazioneSegnoConto;
	}
	/**
	 * @param operazioneSegnoConto the operazioneSegnoConto to set
	 */
	public void setOperazioneSegnoConto(OperazioneSegnoConto operazioneSegnoConto) {
		this.operazioneSegnoConto = operazioneSegnoConto;
	}
	/**
	 * @return the operazioneUtilizzoConto
	 */
	public OperazioneUtilizzoConto getOperazioneUtilizzoConto() {
		return operazioneUtilizzoConto;
	}
	/**
	 * @param operazioneUtilizzoConto the operazioneUtilizzoConto to set
	 */
	public void setOperazioneUtilizzoConto(
			OperazioneUtilizzoConto operazioneUtilizzoConto) {
		this.operazioneUtilizzoConto = operazioneUtilizzoConto;
	}
	/**
	 * @return the operazioneUtilizzoImporto
	 */
	public OperazioneUtilizzoImporto getOperazioneUtilizzoImporto() {
		return operazioneUtilizzoImporto;
	}
	/**
	 * @param operazioneUtilizzoImporto the operazioneUtilizzoImporto to set
	 */
	public void setOperazioneUtilizzoImporto(
			OperazioneUtilizzoImporto operazioneUtilizzoImporto) {
		this.operazioneUtilizzoImporto = operazioneUtilizzoImporto;
	}
	/**
	 * @return the operazioneTipoImporto
	 */
	public OperazioneTipoImporto getOperazioneTipoImporto() {
		return operazioneTipoImporto;
	}
	/**
	 * @param operazioneTipoImporto the operazioneTipoImporto to set
	 */
	public void setOperazioneTipoImporto(OperazioneTipoImporto operazioneTipoImporto) {
		this.operazioneTipoImporto = operazioneTipoImporto;
	}
	
	public ClasseDiConciliazione getClasseDiConciliazione() {
		return classeDiConciliazione;
	}
	
	public void setClasseDiConciliazione(ClasseDiConciliazione classeDiConciliazione) {
		this.classeDiConciliazione = classeDiConciliazione;
	}
	
	/**
	 * Imposta l'operazione passata come parametro.
	 *
	 * @param operazione the new operazione
	 */
	public void setOperazione(Operazione operazione) {
		
		final String setMethodName = "set" + operazione.getClass().getSimpleName();
		final String errorMsg = "Impossibile impostare il tipo operazione. ";
		
		try {
			final Method method = this.getClass().getMethod(setMethodName, operazione.getClass());
			method.invoke(this, operazione);
		} catch (SecurityException e) {
			throw new IllegalStateException(errorMsg + " "+setMethodName ,e);
		} catch (NoSuchMethodException e) {
			throw new IllegalArgumentException(errorMsg + " Verificare di avere il metodo "+setMethodName+".", e);
		} catch (IllegalArgumentException e) {
			throw new IllegalStateException(errorMsg + " "+setMethodName ,e);
		} catch (IllegalAccessException e) {
			throw new IllegalStateException(errorMsg + " Impossibile accedere al metodo "+setMethodName+" per il tipo operazione. "+operazione.getClass().getSimpleName() +".", e);
		} catch (InvocationTargetException e) {
			throw new IllegalStateException(errorMsg + " Il metodo "+setMethodName+" ha fallito: "+e.getTargetException().getMessage() +".", e);
		}
		
	}
	

}
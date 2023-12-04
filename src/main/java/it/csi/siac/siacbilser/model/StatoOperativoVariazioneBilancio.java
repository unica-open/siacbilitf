/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;


@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativoVariazioneBilancio {
	//SIAC-8332
	PRE_BOZZA("BOZZA-DEC"),
	BOZZA("BOZZA"),
	DEFINITIVA("DEFINITIVA"),
	ANNULLATA("ANNULLATA"),
	GIUNTA("GIUNTA"),
	CONSIGLIO("CONSIGLIO"),
	PRE_DEFINITIVA("PRE-DEFINITIVA", "PRE-DEFINITIVA"),
	;
	
	private final String descrizione;
	private final String variableName;
	
	/**
	 * Costruttore a partire dalla descrizione per l'utente.
	 * <br/>
	 * Il nome della variabile di processo &egrave; desunto a partire dal nome dell'istanza dell'enum.
	 * 
	 * @param descrizione la descrizione per l'utente
	 */
	private StatoOperativoVariazioneBilancio(String descrizione) {
		this.descrizione = descrizione;
		this.variableName = this.name();
	}
	/**
	 * Costruttore a partire dalla descrizione per l'utente e dal nome della variabile di processo.
	 * 
	 * @param descrizione la descrizione per l'utente
	 * @param variableName il nome della variabile di processo
	 */
	private StatoOperativoVariazioneBilancio(String descrizione, String variableName) {
		this.descrizione = descrizione;
		this.variableName = variableName;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @return the variableName
	 */
	public String getVariableName() {
		return variableName;
	}
	
	public static StatoOperativoVariazioneBilancio byVariableName(String variableName) {
		for(StatoOperativoVariazioneBilancio sovdb : values()) {
			if(sovdb.getVariableName().equals(variableName)) {
				return sovdb;
			}
		}
		throw new IllegalArgumentException("Nessuno StatoOperativoVariazioneBilancio corrispondente al nome variabile " + variableName);
	}
	
	public static StatoOperativoVariazioneBilancio byVariableNameEventuallyNull(String variableName) {
		for(StatoOperativoVariazioneBilancio sovdb : values()) {
			if(sovdb.getVariableName().equals(variableName)) {
				return sovdb;
			}
		}
		return null;
	}

}
/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0
 * @created 14-apr-2015 
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum StatoAccettazionePrimaNotaDefinitiva {
	
	INTEGRATO("1", "Integrato con inventario"),
	RIFIUTATO("2", "Rifiutato"),
	DA_ACCETTARE("3", "Da Accettare"),
	;
	
	private String codice;
	private String descrizione;
	
	private StatoAccettazionePrimaNotaDefinitiva(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	/**
	 * By codice.
	 *
	 * @param code the code
	 * @return the stato accettazione prima nota definitiva
	 */
	public static StatoAccettazionePrimaNotaDefinitiva byCodice(String code) {
		for (StatoAccettazionePrimaNotaDefinitiva st : StatoAccettazionePrimaNotaDefinitiva.values()) {
			if(st.getCodice().equals(code)) {
				return st;
			}
		}
		return null;
	}

}
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
public enum StatoAccettazionePrimaNotaProvvisoria {
	
	DEFINITIVO("1", "Definitivo"),
	RIFIUTATO("2", "Rifiutato"),
	PROVVISORIO("3", "Provvisorio"),
	;
	
	private String codice;
	private String descrizione;
	
	private StatoAccettazionePrimaNotaProvvisoria(String codice, String descrizione) {
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

}
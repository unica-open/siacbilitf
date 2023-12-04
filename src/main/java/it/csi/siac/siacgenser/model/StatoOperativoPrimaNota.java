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
public enum StatoOperativoPrimaNota {
	PROVVISORIO("P", "Provvisorio"),
	DEFINITIVO("D", "Definitivo"),
	ANNULLATO("A", "Annullato"),
	;
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoPrimaNota(String codice, String descrizione) {
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
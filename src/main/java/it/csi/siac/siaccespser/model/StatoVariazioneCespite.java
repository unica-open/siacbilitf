/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Cespiti
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public enum StatoVariazioneCespite {
	
	PROVVISORIO ("P", "Provvisorio"),
	DEFINITIVO  ("D", "Definitivo"),
	ANNULLATO   ("A", "Annullato"),
	;
	
	private final String codice;
	private final String descrizione;
	
	private StatoVariazioneCespite(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
}
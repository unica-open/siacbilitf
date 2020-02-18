/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0.0 - 26/10/2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum ClasseDiConciliazione {

	COSTI("Costi di esercizio e pluriennali"),
	RICAVI("Ricavi"),
	CREDITI("Crediti"),
	DEBITI("Debiti"),
	CONTI("Conti"),
	;
	
	private final String descrizione;
	
	private ClasseDiConciliazione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

}

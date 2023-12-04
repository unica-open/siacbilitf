/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.31.25
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum StatoOperativoCausaleEP {
	PROVVISORIO("Provvisorio"),
	VALIDO("Valido"),
	ANNULLATO("Annullato"),
	;
	
	private String descrizione;
	
	private StatoOperativoCausaleEP(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

}
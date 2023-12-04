/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * valori ammessi:
 * L - Libera
 * I -  Integrata
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.31.25
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum TipoCausale {
	
	Libera("LIB", "Libera"),
	Integrata("INT", "Integrata"),
	;
	
	private String codice;
	private String descrizione;
	
	private TipoCausale(String codice, String descrizione) {
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
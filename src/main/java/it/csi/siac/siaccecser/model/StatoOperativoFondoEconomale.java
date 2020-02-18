/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.19
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum StatoOperativoFondoEconomale {
	VALIDO("V", "Valido"),
	ANNULLATO("A", "Annullato");
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoFondoEconomale(String codice, String descrizione) {
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
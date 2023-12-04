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
public enum StatoOperativoGiustificativi {
	VALIDO("V", "Valido"),
	ANNULLATO("A", "Annullato"),
	ESCLUSO_AL_PAGAMENTO("E", "Escluso al pagamento");
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoGiustificativi(String codice, String descrizione) {
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
	
	public static StatoOperativoGiustificativi byCodice(String codice) {
		for(StatoOperativoGiustificativi sog : values()) {
			if(sog.getCodice().equals(codice)) {
				return sog;
			}
		}
		return null;
	}
}
/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.22
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum TipologiaGiustificativo {
	RIMBORSO("R", "Rimborso"),
	ANTICIPO("A", "Anticipo"),
	ANTICIPO_MISSIONE("M", "Anticipo missione"),
	PAGAMENTO("P", "Pagamento"),
	;
	
	private String codice;
	private String descrizione;
	
	private TipologiaGiustificativo(String codice, String descrizione) {
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
	
	public static TipologiaGiustificativo byCodice(String codice) {
		for(TipologiaGiustificativo tg : values()) {
			if(tg.getCodice().equals(codice)) {
				return tg;
			}
		}
		return null;
	}
}
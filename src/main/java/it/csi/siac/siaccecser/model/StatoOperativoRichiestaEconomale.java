/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum StatoOperativoRichiestaEconomale {
	PRENOTATA("PR", "Prenotata"),
	EVASA("EV", "Evasa"),
	DA_RENDICONTARE("DR", "Da rendicontare"),
	RENDICONTATA("RE", "Rendicontata"),
	AGLI_ATTI("AA", "Agli atti"),
	ANNULLATA("AN", "Annullata");
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoRichiestaEconomale(String codice, String descrizione) {
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
	
	public static StatoOperativoRichiestaEconomale byCodice(String codice) {
		for(StatoOperativoRichiestaEconomale sore : values()) {
			if(sore.getCodice().equals(codice)) {
				return sore;
			}
		}
		return null;
	}
}
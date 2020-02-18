/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum TipoStampa { //siac_d__stampa_stato
	
	BOZZA("B", "Bozza"),
	DEFINITIVA("D", "Definitiva");
	
	private String codice;
	private String descrizione;
	
	private TipoStampa(String codice, String descrizione) {
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

	public static TipoStampa fromCodice(String codice) {
		for(TipoStampa tsi : values()) {
			if(tsi.getCodice().equals(codice)) {
				return tsi;
			}
		}
		return null;
	}
}	
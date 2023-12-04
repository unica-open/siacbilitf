/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * valor ammessi sono
 * DARE
 * AVERE
 * NON DEFINITO (per i conti epilogativi)
 * 
 * Per i conti con segno si dovrà verificare in ciusura di bilancio che il saldo
 * finale sia dello stesso segno della Classe a cui appartiene il conto.
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum SegnoConto { 
	DARE("DARE", "Dare"), 
	AVERE("AVERE", "Avere"), 
	ND("ND", "Non Definitivo");
	
	private String codice;
	private String descrizione;
	
	private SegnoConto(String codice, String descrizione) {
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
	 * @return the codice
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	public static SegnoConto fromCodice(String codice) {
		final String trimmedCodice = codice.trim();
		for(SegnoConto sc : values()) {
			if(sc.getCodice().equals(trimmedCodice)) {
				return sc;
			}
		}
		return null;
	}

}
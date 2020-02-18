/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum StatoStampaAllegatoAtto {

	DEFINITIVO("D","Definitivo"),
	;
	
	private final String codice;
	private final String descrizione;
		
	private StatoStampaAllegatoAtto(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	public static StatoStampaAllegatoAtto fromCodice(String codice) {
		for(StatoStampaAllegatoAtto ssaa : values()) {
			if(ssaa.getCodice().equals(codice)) {
				return ssaa;
			}
		}
		return null;
	}
	
}

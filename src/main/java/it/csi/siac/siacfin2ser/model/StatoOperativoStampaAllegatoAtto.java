/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Rappresenta lo stato di un atto all'interno dell'operazione di convalida
 * @author Elisa Chiari
 * @version 1.0
 * @created 12/01/2016
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum StatoOperativoStampaAllegatoAtto {

	ANNULLATO("A", "Annullato"),
	VALIDO("V","Valido");

	
	private String codice;
	private String descrizione;
	
	private StatoOperativoStampaAllegatoAtto(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}

	public static StatoOperativoStampaAllegatoAtto fromCodice(String codice) {
		for(StatoOperativoStampaAllegatoAtto sosaa : values()) {
			if(sosaa.getCodice().equals(codice)) {
				return sosaa;
			}
		}
		return null;
	}
}

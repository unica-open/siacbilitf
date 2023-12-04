/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativoCronoprogramma
 * 
 * 
 */

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativoCronoprogramma {

	ANNULLATO("AN", "Annullato"), 
	VALIDO("VA", "Valido"),
	PROVVISORIO("PR", "Provvisorio");

	private String codice;
	private String descrizione;
	
	StatoOperativoCronoprogramma(String codice, String descrizione){
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice(){
		return this.codice;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
}

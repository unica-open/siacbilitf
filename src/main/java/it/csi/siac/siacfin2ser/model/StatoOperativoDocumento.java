/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativoDocumento
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum StatoOperativoDocumento {
	
	INCOMPLETO 				("I", "Incompleto"), 
	VALIDO 					("V","Valido"),
	LIQUIDATO 				("L","Liquidato"),
	PARZIALMENTE_LIQUIDATO 	("PL","Parzialmente liquidato"),
	PARZIALMENTE_EMESSO 	("PE","Parzialmente emesso"),
	EMESSO 					("EM","Emesso"),
	ANNULLATO 				("A","Annullato"),
	STORNATO 				("ST","Stornato");
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoDocumento(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
}

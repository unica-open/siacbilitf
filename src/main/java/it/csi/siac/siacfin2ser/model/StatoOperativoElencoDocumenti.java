/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * @author sviluppo1
 * @version 1.0
 * @created 08-set-2014 17.52.02
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum StatoOperativoElencoDocumenti {
	
	BOZZA("B", "Bozza"),
	COMPLETATO("C", "Completato"),
	RIFIUTATO("R", "Rifiutato");
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoElencoDocumenti(String codice, String descrizione) {
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
	
	/**
	 * Ottiene lo Stato operativo corrispondente al codice fornito.
	 * 
	 * @param codice il codice da cui ottenere lo stato
	 * 
	 * @return lo stato corrispondente al codice, se presente
	 */
	public static StatoOperativoElencoDocumenti fromCodice(String codice) {
		for(StatoOperativoElencoDocumenti soed : values()) {
			if(soed.getCodice().equals(codice)) {
				return soed;
			}
		}
		return null;
	}
}
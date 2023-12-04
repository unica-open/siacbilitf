/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Rappresenta lo stato di un atto all'interno dell'operazione di convalida
 * @author Administrator
 * @version 1.0
 * @created 08-set-2014 17.51.58
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum StatoOperativoAllegatoAtto {
	
	DA_COMPLETARE("D", "Da completare"),
	COMPLETATO("C", "Completato"),
	RIFIUTATO("R", "Rifiutato"),
	PARZIALMENTE_CONVALIDATO("PC", "Parzialmente convalidato"),
	CONVALIDATO("CV", "Convalidato"),
	ANNULLATO("A", "Annullato");
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoAllegatoAtto(String codice, String descrizione) {
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
	public static StatoOperativoAllegatoAtto fromCodice(String codice) {
		for(StatoOperativoAllegatoAtto soaa : values()) {
			if(soaa.getCodice().equals(codice)) {
				return soaa;
			}
		}
		return null;
	}

}
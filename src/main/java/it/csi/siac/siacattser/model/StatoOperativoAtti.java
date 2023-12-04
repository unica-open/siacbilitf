/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativo degli atti
 * 
 * @author rmontuori
 * 
 */

@XmlType(namespace = ATTDataDictionary.NAMESPACE)
public enum StatoOperativoAtti {
	PROVVISORIO("PROVVISORIO"), 
	DEFINITIVO("DEFINITIVO"), 
	ANNULLATO("ANNULLATO");
	
	private final String descrizione;
	
	/**
	 * Costruttore
	 * @param descrizione la descrizione dello stato
	 */
	StatoOperativoAtti(String descrizione) {
		this.descrizione = descrizione;
	}
	
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return this.descrizione;
	}

	/**
	 * A partire dallo stato come stringa
	 * @param statoOperativoAtto lo stato come stringa
	 * @return lo stato come enum
	 */
	public static StatoOperativoAtti fromString(String statoOperativoAtto) {
		for (StatoOperativoAtti stato : StatoOperativoAtti.values()) {
			if (stato.descrizione.equalsIgnoreCase(statoOperativoAtto)) {
				// Lo stato coincide: lo restituisco
				return stato;
			}
		}
		// Nessuno stato trovato
		return null;
	}
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;

/**
 * Tipo di media scelta per l'accantonamento per il fondo crediti a dubbia e difficile esazione.
 *
 * @author Alessandro Marchino
 * @version 1.0.0 - 02/04/2021
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoMediaAccantonamentoFondiDubbiaEsigibilita {

	/** The semplice totali. */
	SEMPLICE_TOTALI("SEMPLICE_TOTALI", "Media semplice dei totali"),
	
	/** The semplice rapporti. */
	SEMPLICE_RAPPORTI("SEMPLICE_RAPPORTI", "Media semplice dei rapporti"),
	
	/** The ponderata totali. */
	PONDERATA_TOTALI("PONDERATA_TOTALI", "Media ponderata dei totali"),
	
	/** The ponderata rapporti. */
	PONDERATA_RAPPORTI("PONDERATA_RAPPORTI", "Media ponderata dei rapporti"),
	
	/** The utente. */
	UTENTE("UTENTE", "Media utente"),
	;
	
	/** The codice. */
	private final String codice;
	
	/** The descrizione. */
	private final String descrizione;
	
	/**
	 * Instantiates a new tipo media accantonamento fondi dubbia esigibilita.
	 *
	 * @param codice the codice
	 * @param descrizione the descrizione
	 */
	private TipoMediaAccantonamentoFondiDubbiaEsigibilita(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	/**
	 * Gets the codice.
	 *
	 * @return the codice
	 */
	public String getCodice() {
		return this.codice;
	}
	
	/**
	 * Gets the descrizione.
	 *
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return this.descrizione;
	}
	
	/**
	 * By codice.
	 *
	 * @param codice the codice
	 * @return the tipo media
	 */
	public static TipoMediaAccantonamentoFondiDubbiaEsigibilita byCodice(String codice){
		for(TipoMediaAccantonamentoFondiDubbiaEsigibilita e : TipoMediaAccantonamentoFondiDubbiaEsigibilita.values()){
			if(e.getCodice().equals(codice)){
				return e;
			}
		}
		throw new IllegalArgumentException("Il codice "+ codice + " non ha un valore corrispondente in TipoMediaAccantonamentoFondiDubbiaEsigibilita");
	}
	
}

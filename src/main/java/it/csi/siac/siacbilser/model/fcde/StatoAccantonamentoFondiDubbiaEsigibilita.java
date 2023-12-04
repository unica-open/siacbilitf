/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;

/**
 * Tipo di accantonamento per il fondo crediti a dubbia e difficile esazione.
 *
 * @author Alessandro Marchino
 * @version 1.0.0 - 02/04/2021
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoAccantonamentoFondiDubbiaEsigibilita {

	/** The bozza. */
	BOZZA("BOZZA", "Bozza"),
	
	/** The definitivo. */
	DEFINITIVA("DEFINITIVA", "Definitiva"),
	;
	
	/** The codice. */
	private final String codice;
	
	/** The descrizione. */
	private final String descrizione;
	
	/**
	 * Instantiates a new stato accantonamento fondi dubbia esigibilita.
	 *
	 * @param codice the codice
	 * @param descrizione the descrizione
	 */
	private StatoAccantonamentoFondiDubbiaEsigibilita(String codice, String descrizione) {
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
}

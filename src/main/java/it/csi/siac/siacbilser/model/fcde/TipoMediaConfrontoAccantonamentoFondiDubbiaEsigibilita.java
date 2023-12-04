/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita {
	PREVISIONE("PREVISIONE", "Previsione"),
	GESTIONE("GESTIONE", "Gestione"),
	;
	private final String codice;
	private final String descrizione;
	/**
	 * @param codice
	 * @param descrizione
	 */
	private TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return this.codice;
	}
	/**
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
	public static TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita byCodice(String codice){
		for(TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita e : TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita.values()){
			if(e.getCodice().equals(codice)){
				return e;
			}
		}
		throw new IllegalArgumentException("Il codice "+ codice + " non ha un valore corrispondente in TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita");
	}
	
}

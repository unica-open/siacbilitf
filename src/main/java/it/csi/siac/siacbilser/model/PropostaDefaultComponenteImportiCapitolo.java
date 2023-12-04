/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum PropostaDefaultComponenteImportiCapitolo  implements DecodificaTipoComponenteImportiCapitolo {

	SI("01", "Si"),
	NO("02", "No"),
	SOLO_PREVISIONE("03", "Solo Previsione"),
	SOLO_GESTIONE("04", "Solo Gestione"),
	;
	
	private final String codice;
	private final String descrizione;
	/**
	 * Costruttore
	 * @param codice il codice
	 * @param descrizione la descrizione
	 */
	private PropostaDefaultComponenteImportiCapitolo(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	@Override
	public String getCodice() {
		return this.codice;
	}
	@Override
	public String getDescrizione() {
		return this.descrizione;
	}
	
}

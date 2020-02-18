/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoTipoComponenteImportiCapitolo implements DecodificaTipoComponenteImportiCapitolo {

	VALIDO("V", "Valido"),
	ANNULLATO("A", "Annullato"),
	;
	private final String codice;
	private final String descrizione;
	/**
	 * Costruttore
	 * @param codice il codice
	 * @param descrizione la descrizione
	 */
	private StatoTipoComponenteImportiCapitolo(String codice, String descrizione) {
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

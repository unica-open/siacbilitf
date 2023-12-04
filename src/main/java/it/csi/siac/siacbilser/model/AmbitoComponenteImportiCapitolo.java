/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum AmbitoComponenteImportiCapitolo implements DecodificaTipoComponenteImportiCapitolo, DecodificaTipoComponenteImportiCapitoloConMacrotipo {

	AUTONOMO("01", "Autonomo", MacrotipoComponenteImportiCapitolo.FRESCO),
	VINCOLATO("02", "Vincolato", MacrotipoComponenteImportiCapitolo.FRESCO),
	DA_DEFINIRE("03", "Da definire", MacrotipoComponenteImportiCapitolo.FRESCO),
	;
	private final String codice;
	private final String descrizione;
	private final MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo;
	/**
	 * Costruttore
	 * @param codice il codice
	 * @param descrizione la descrizione
	 * @param macrotipoComponenteImportiCapitolo il macrotipo
	 */
	private AmbitoComponenteImportiCapitolo(String codice, String descrizione, MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.macrotipoComponenteImportiCapitolo = macrotipoComponenteImportiCapitolo;
	}
	@Override
	public String getCodice() {
		return this.codice;
	}
	@Override
	public String getDescrizione() {
		return this.descrizione;
	}
	@Override
	public MacrotipoComponenteImportiCapitolo getMacrotipoComponenteImportiCapitolo() {
		return this.macrotipoComponenteImportiCapitolo;
	}
}

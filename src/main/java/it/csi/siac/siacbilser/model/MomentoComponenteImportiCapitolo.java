/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum MomentoComponenteImportiCapitolo implements DecodificaTipoComponenteImportiCapitolo, DecodificaTipoComponenteImportiCapitoloConMacrotipo {

	GESTIONE("01", "Previsione", MacrotipoComponenteImportiCapitolo.FPV),
	PREVISIONE("02", "Gestione", MacrotipoComponenteImportiCapitolo.FPV),
	ROR_EFFETTIVO("03", "ROR effettivo", MacrotipoComponenteImportiCapitolo.FPV),
	ROR_PREVISIONE("04", "ROR previsione", MacrotipoComponenteImportiCapitolo.FPV),
	;
	
	private final String codice;
	private final String descrizione;
	private final MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo;
	/**
	 * Costruttore
	 * @param codice il codice
	 * @param descrizione la descrizioe
	 * @param macrotipoComponenteImportiCapitolo il macrotipo
	 */
	private MomentoComponenteImportiCapitolo(String codice, String descrizione,
			MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo) {
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

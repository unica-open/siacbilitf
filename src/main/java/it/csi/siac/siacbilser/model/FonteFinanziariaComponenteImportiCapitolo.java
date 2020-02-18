/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum FonteFinanziariaComponenteImportiCapitolo implements DecodificaTipoComponenteImportiCapitolo, DecodificaTipoComponenteImportiCapitoloConMacrotipo {

	FRESCO_FPV("01", "Fresco", MacrotipoComponenteImportiCapitolo.FPV),
	AVANZO_FPV("02", "Avanzo", MacrotipoComponenteImportiCapitolo.FPV),
	AVANZO_AVANZO("03", "Avanzo", MacrotipoComponenteImportiCapitolo.AVANZO),
	REISCRIZIONE_PERENTI_AVANZO("04", "Reiscrizione Perenti", MacrotipoComponenteImportiCapitolo.AVANZO),
	;
	
	private final String codice;
	private final String descrizione;
	private final MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo;
	/**
	 * Costruttore
	 * @param codice il codice
	 * @param descrizione la descrizione
	 * @param macrotipoComponenteImportiCapitolo il macrotipo componente importi capitolo
	 */
	private FonteFinanziariaComponenteImportiCapitolo(String codice, String descrizione, MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo) {
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

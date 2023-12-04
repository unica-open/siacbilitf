/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import it.csi.siac.siacfin2ser.model.DecodificaEnum;

public enum SottotipoComponenteImportiCapitolo implements DecodificaTipoComponenteImportiCapitolo, DecodificaTipoComponenteImportiCapitoloConMacrotipo, DecodificaEnum {
	
	PROGRAMMATO_NON_IMPEGNATO("01", "PROGRAMMATO NON IMPEGNATO", MacrotipoComponenteImportiCapitolo.FPV),
	CUMULATO("02", "CUMULATO", MacrotipoComponenteImportiCapitolo.FPV),
	APPLICATO("03", "APPLICATO", MacrotipoComponenteImportiCapitolo.FPV),
	;
	
	private final String codice;
	private final String descrizione;
	private final MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo;
	
	
	private SottotipoComponenteImportiCapitolo(String codice, String descrizione, MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo) {
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

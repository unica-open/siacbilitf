/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import it.csi.siac.siacfin2ser.model.DecodificaEnum;

public enum MacrotipoComponenteImportiCapitolo implements DecodificaTipoComponenteImportiCapitolo, DecodificaEnum {
	
	FRESCO("01", "FRESCO"),
	FPV("02", "FPV"),
	AVANZO("03", "AVANZO"),
	DA_ATTRIBUIRE("04", "DA ATTRIBUIRE"),
	;
	
	private final String codice;
	private final String descrizione;
	/**
	 * Costruttore di wrap
	 * @param codice il codice
	 * @param descrizione la descrizione
	 */
	private MacrotipoComponenteImportiCapitolo(String codice, String descrizione) {
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
	
	
	public static MacrotipoComponenteImportiCapitolo getByCode(String code) {
		for (MacrotipoComponenteImportiCapitolo mt : MacrotipoComponenteImportiCapitolo.values()){
			if(mt.getCodice().equals(code)){
				return mt;
			}
		}
		return null;
	}
	
	public static MacrotipoComponenteImportiCapitolo getByDesc(String desc) {
		for (MacrotipoComponenteImportiCapitolo mt : MacrotipoComponenteImportiCapitolo.values()){
			if(mt.getDescrizione().equalsIgnoreCase(desc)){
				return mt;
			}
		}
		return null;
	}
	
}

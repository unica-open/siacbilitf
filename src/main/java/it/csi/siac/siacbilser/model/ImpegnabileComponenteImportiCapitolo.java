/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.DecodificaEnum;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum ImpegnabileComponenteImportiCapitolo  implements DecodificaTipoComponenteImportiCapitolo , DecodificaEnum  {

	SI("01", "Si"),
	NO("02", "No"),
	AUTO("03", "Auto"),
	;
	
	private final String codice;
	private final String descrizione;
	/**
	 * Costruttore
	 * @param codice il codice
	 * @param descrizione la descrizione
	 */
	private ImpegnabileComponenteImportiCapitolo(String codice, String descrizione) {
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

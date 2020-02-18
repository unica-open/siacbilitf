/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.DecodificaEnum;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.20
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum StatoOperativoOperazioneCassa implements DecodificaEnum{
	PROVVISORIO("P", "Provvisorio"),
	DEFINITIVO("D", "Definitivo"),
	ANNULLATO("A", "Annullato");
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoOperazioneCassa(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	/**
	 * @return the codice
	 */
	@Override
	public String getCodice() {
		return codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	public static StatoOperativoOperazioneCassa byCodice(String codice) {
		for(StatoOperativoOperazioneCassa sooc : values()) {
			if(sooc.getCodice().equals(codice)) {
				return sooc;
			}
		}
		return null;
	}
	
	public static StatoOperativoOperazioneCassa byCodiceEvenNull(String codice) {
		if(codice == null) {
			return null;
		}
		return byCodice(codice);
	}
	
	
}
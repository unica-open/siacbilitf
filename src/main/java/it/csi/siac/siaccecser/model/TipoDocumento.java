/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;


/**
 * @author 552
 * @version 1.0
 * @created 06-mar-2015 16.27.54
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum TipoDocumento {
	
	GIORNALE_CASSA("GIO","Giornale di cassa"),
	RENDICONTO("REN","Rendiconto"),
	RICEVUTA("RIC","Ricevuta");

	
	private String codice;
	private String descrizione;
	
	private TipoDocumento(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	
	public static TipoDocumento fromCodice(String codice) {
		for(TipoDocumento tdoc : values()) {
			if(tdoc.getCodice().equals(codice)) {
				return tdoc;
			}
		}
		return null;
	}
}

	
	

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

/**
 * @version 1.0
 * @created 14-apr-2015 
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum StatoOperativoClassificatoreGSA {
	
	/** The definitivo. */
	VALIDO("V", "Valido"),
	
	/** The annullato. */
	ANNULLATO("A", "Annullato"),
	;
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoClassificatoreGSA(String codice, String descrizione) {
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
	
	/**
	 * By descrizione.
	 *
	 * @param desc the desc
	 * @return the stato operativo classificatore GSA
	 */
	public static StatoOperativoClassificatoreGSA byDescrizione(String desc) {
		if(StringUtils.isBlank(desc)) {
			return null;
		}
		for(StatoOperativoClassificatoreGSA st : StatoOperativoClassificatoreGSA.values()) {
			if(st.getDescrizione().equalsIgnoreCase(desc)) {
				return st;
			}
		}
		return null;
	}
	
}
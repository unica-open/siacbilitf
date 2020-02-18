/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

/**
 * @version 1.0
 * @created 14-apr-2015 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativoQuadroEconomico {
	
	/** The definitivo. */
	VALIDO("V", "Valido"),
	
	/** The annullato. */
	ANNULLATO("A", "Annullato"),
	;
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoQuadroEconomico(String codice, String descrizione) {
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
	public static StatoOperativoQuadroEconomico byDescrizione(String desc) {
		if(StringUtils.isBlank(desc)) {
			return null;
		}
		for(StatoOperativoQuadroEconomico st : StatoOperativoQuadroEconomico.values()) {
			if(st.getDescrizione().equalsIgnoreCase(desc)) {
				return st;
			}
		}
		return null;
	}
	
}
/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoAttivita {
	
	ISTITUZIONALE("I"),
	PROMISCUA("P"),
	COMMERCIALE("C");
	
	private String codice;
	
	private TipoAttivita(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	public static TipoAttivita fromCodice(String codice) {
		for(TipoAttivita ta : values()) {
			if(ta.getCodice().equals(codice)) {
				return ta;
			}
		}
		return null;
	}
	
}

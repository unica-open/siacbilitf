/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum StatoSubdocumentoIva {
	
	// siac_d_subdoc_iva_stato
	
	DEFINITIVO("DE"),
	PROVVISORIO("PR"),
	PROVVISORIO_DEFINITIVO("PD");
	
	private String codice;
	
	private StatoSubdocumentoIva(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	public static StatoSubdocumentoIva fromCodice(String codice) {
		for(StatoSubdocumentoIva ssi : values()) {
			if(ssi.getCodice().equals(codice)) {
				return ssi;
			}
		}
		return null;
	}

}

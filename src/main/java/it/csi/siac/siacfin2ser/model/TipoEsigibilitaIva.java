/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoEsigibilitaIva {
	
	// siac_d_iva_esigibilita_tipo
	
	IMMEDIATA("I"),
	DIFFERITA("D");
	
	private String codice;
	
	private TipoEsigibilitaIva(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	public static TipoEsigibilitaIva fromCodice(String codice) {
		for(TipoEsigibilitaIva tei : values()) {
			if(tei.getCodice().equals(codice)) {
				return tei;
			}
		}
		return null;
	}

	
}

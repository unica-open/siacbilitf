/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoOrdinativo { //siac_d_ordinativo_tipo
	
	PAGAMENTO("P", "PAGAMENTO"),
	INCASSO("I", "INCASSO");
	
	private String codice;
	private String descrizione;
	
	private TipoOrdinativo(String codice, String descrizione) {
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

	public static TipoOrdinativo fromCodice(String codice) {
		for(TipoOrdinativo tsi : values()) {
			if(tsi.getCodice().equals(codice)) {
				return tsi;
			}
		}
		return null;
	}
	
}

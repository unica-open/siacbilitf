/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativoCronoprogramma
 * 
 * 
 */

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativoMovimentoGestione {

	ANNULLATO("A"), 
	DEFINITIVO("D"),
	DEFINITIVO_NON_LIQUIDABILE("N"),
	PROVVISORIO("P");

	private String codice;
	
	StatoOperativoMovimentoGestione(String codice){
		this.codice = codice;
	}
	
	public String getCodice(){
		return codice;
	}
	
}

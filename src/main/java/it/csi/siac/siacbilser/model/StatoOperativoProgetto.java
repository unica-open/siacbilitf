/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativoProgetto
 * 
 * 
 */

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativoProgetto {

	ANNULLATO("AN"), 
	VALIDO("VA"), 
	//PROVVISORIO("PR")
	;

	String codice;
	
	StatoOperativoProgetto(String codice){
		this.codice = codice;
	}
	
	public String getCodice(){
		return codice;
	}
	
}

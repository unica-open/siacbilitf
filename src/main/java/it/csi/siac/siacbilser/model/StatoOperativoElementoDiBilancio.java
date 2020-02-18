/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativoElementoDiBilancio, condiviso tra Capitolo e UPB
 * 
 * @author rmontuori
 * 
 */

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativoElementoDiBilancio {

	ANNULLATO("AN"), 
	VALIDO("VA"), 
	PROVVISORIO("PR");

	String codice;
	
	StatoOperativoElementoDiBilancio(String codice){
		this.codice = codice;
	}
	
	public String getCodice(){
		return codice;
	}
	
}

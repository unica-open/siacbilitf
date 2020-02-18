/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

/**
 * TipoGruppoDocumento
 */

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoGruppoDocumento {

	NOTA_DI_CREDITO("NCD"), 
	FATTURA("FAT");

	String codice;
	
	TipoGruppoDocumento(String codice){
		this.codice = codice;
	}
	
	public String getCodice(){
		return codice;
	}
	
}

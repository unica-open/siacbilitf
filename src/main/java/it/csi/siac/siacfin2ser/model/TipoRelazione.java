/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

/**
 * TipoFamigliaDocumento
 */

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoRelazione {

	SUBORDINATO("SUB"), 
	NOTA_CREDITO("NCD"),
	NOTA_CREDITO_IVA("NCDI"),
	QUOTE_PER_IVA_DIFFERITA("QPID"),
	CONTROREGISTRAZIONE_INTRASTAT("CRI"),
	SEDE_SECONDARIA("SEDE_SECONDARIA"),
	SOSTITUZIONE_ORDINATIVO("SOS_ORD"),
	ORDINATIVO_SUBORDINATO("SUB_ORD"),
	;

	String codice;
	
	TipoRelazione(String codice){
		this.codice = codice;
	}
	
	public String getCodice(){
		return codice;
	}
	
	public static TipoRelazione fromCodice(String codice) {
		for(TipoRelazione tr : values()) {
			if(tr.getCodice().equals(codice)) {
				return tr;
			}
		}
		return null;
	}
	
}

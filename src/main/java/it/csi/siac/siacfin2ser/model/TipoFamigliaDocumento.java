/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * TipoFamigliaDocumento
 */

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoFamigliaDocumento {

	ENTRATA("E"), 
	SPESA("S"),
	IVA_ENTRATA("IE"),
	IVA_SPESA("IS");

	String codice;
	
	TipoFamigliaDocumento(String codice){
		this.codice = codice;
	}
	
	public String getCodice(){
		return codice;
	}
	
	public static boolean isSpesa(TipoFamigliaDocumento tipoFamigliaDocumento) {
		return tipoFamigliaDocumento != null && tipoFamigliaDocumento.isSpesa();
	}
	
	public boolean isSpesa() {
		return SPESA.equals(this) || IVA_SPESA.equals(this);
	}
	
	public static boolean isEntrata(TipoFamigliaDocumento tipoFamigliaDocumento) {
		return tipoFamigliaDocumento != null && tipoFamigliaDocumento.isEntrata();
	}
	
	public boolean isEntrata() {
		return ENTRATA.equals(this) || IVA_ENTRATA.equals(this);
	}
	
}

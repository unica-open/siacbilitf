/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * TipoDocumentoFEL
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public enum StatoAcquisizioneFEL {
	
	IMPORTATA("S", "importata"),
	DA_ACQUISIRE("N", "da acquisire"),
	SOSPESA("A", "sospesa");
	
	
	
	private String codice;
	private String descrizione;
	
	private StatoAcquisizioneFEL(String codice, String descrizione) {
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
	
	/**
	 * By codice.
	 *
	 * @param codice the codice
	 * @return the siac d class fam enum
	 */
	public static StatoAcquisizioneFEL byCodice(String codice){
		for(StatoAcquisizioneFEL e : StatoAcquisizioneFEL.values()){
			if(e.getCodice().equals(codice)){
				return e;
			}
		}
		return null;
	}
	
	
}
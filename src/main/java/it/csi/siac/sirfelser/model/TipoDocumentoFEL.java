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
public enum TipoDocumentoFEL {
	
	FATTURA("TD01", "fattura", Boolean.TRUE),
	ACCONTO_FATTURA("TD02", "acconto/anticipo su fattura", Boolean.TRUE),
	ACCONTO_PARCELLA("TD03", "acconto/anticipo su parcella", Boolean.TRUE),
	NOTA_DI_CREDITO("TD04", "nota di credito", Boolean.TRUE),
	NOTA_DI_DEBITO("TD05", "nota di debito", Boolean.TRUE),
	PARCELLA("TD06", "parcella", Boolean.TRUE);
	
	
	
	private String codice;
	private String descrizione;
	private Boolean flagBilancio;
	
	private TipoDocumentoFEL(String codice, String descrizione, Boolean flagBilancio) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.flagBilancio = flagBilancio;
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
	 * @return the flagBilancio
	 */
	public Boolean getFlagBilancio() {
		return flagBilancio;
	}
	
	/**
	 * By codice.
	 *
	 * @param codice the codice
	 * @return the tipo documento FEL
	 */
	public static TipoDocumentoFEL byCodice(String codice){
		for(TipoDocumentoFEL e : TipoDocumentoFEL.values()){
			if(e.getCodice().equals(codice)){
				return e;
			}
		}
		return null;
	}
}
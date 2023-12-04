 /*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;


@XmlType(namespace = PagoPADataDictionary.NAMESPACE)
public class Errore extends EntitaEnte{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8022186472752951714L;
	
	
	private String codice;
	private String descrizione;
	
	



	public Errore(String codice, String descrizione){
		this();
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	
	
	public Errore() {
		super();
	}


	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}



	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodice(){
		return this.codice;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	 
	
}
 

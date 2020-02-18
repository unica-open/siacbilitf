/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Distinta extends Entita {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7611523913004740998L;
	
	
	private String codice;
	private String descrizione;


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


}

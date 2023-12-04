/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0
 * @created 14-apr-2015 
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum StatoOperativoRegistrazioneMovFin {
	NOTIFICATO("N", "Notificato"),
	ELABORATO("E", "Elaborato"),
	ANNULLATO("A", "Annullato"),
	REGISTRATO("R", "Registrato"),
	CONTABILIZZATO("C", "Contabilizzato"),
	;
	
	private String codice;
	private String descrizione;
	
	private StatoOperativoRegistrazioneMovFin(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	
	

}
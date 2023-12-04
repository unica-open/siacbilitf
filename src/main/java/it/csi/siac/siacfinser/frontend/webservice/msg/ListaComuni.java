/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Permette la ricerca del comune inserendo una descrizione.
 * 
 * @author andrea.colombo
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListaComuni extends AbstractSoggettoServiceRequest {

	private String idStato;
	private String descrizioneComune;
	private String codiceCatastale;

	public String getIdStato() {
		return idStato;
	}

	public void setIdStato(String idStato) {
		this.idStato = idStato;
	}

	public String getDescrizioneComune() {
		return descrizioneComune;
	}

	public void setDescrizioneComune(String descrizioneComune) {
		this.descrizioneComune = descrizioneComune;
	}

	public String getCodiceCatastale() {
		return codiceCatastale;
	}

	public void setCodiceCatastale(String codiceCatastale) {
		this.codiceCatastale = codiceCatastale;
	}

}

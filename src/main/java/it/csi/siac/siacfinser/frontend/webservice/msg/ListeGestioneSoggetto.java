/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;



/**
 * oggetti liste contenute delle pagine di soggetto
 * 
 * @author paolos
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListeGestioneSoggetto extends AbstractSoggettoServiceRequest {
	
	private String descrizioneComune;
	private String idAmbito;

	public String getDescrizioneComune() {
		return descrizioneComune;
	}

	public void setDescrizioneComune(String descrizioneComune) {
		this.descrizioneComune = descrizioneComune;
	}

	public String getIdAmbito() {
		return idAmbito;
	}

	public void setIdAmbito(String idAmbito) {
		this.idAmbito = idAmbito;
	}
	

}

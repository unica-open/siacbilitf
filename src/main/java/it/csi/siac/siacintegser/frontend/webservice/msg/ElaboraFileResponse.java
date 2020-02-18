/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacintegser.frontend.webservice.INTEGSvcDictionary;

/**
 * The Class ElaboraFileResponse.
 * 
 * @author Domenico
 */
@XmlType(namespace = INTEGSvcDictionary.NAMESPACE)
public class ElaboraFileResponse extends ServiceResponse {
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	

	/**
	 * Adds the messaggio.
	 *
	 * @param messaggio the messaggio
	 */
	public void addMessaggio(Messaggio messaggio) {
		getMessaggi().add(messaggio);
	}
	
	/**
	 * Adds the messaggio.
	 *
	 * @param codice the codice
	 * @param descrizione the descrizione
	 */
	public void addMessaggio(String codice, String descrizione) {
		getMessaggi().add(new Messaggio(codice, descrizione));
	}

	/**
	 * @return the messaggi
	 */
	public List<Messaggio> getMessaggi() {
		return messaggi;
	}


	/**
	 * @param messaggi the messaggi to set
	 */
	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi != null ? messaggi : new ArrayList<Messaggio>();
	}

	
	/**
	 * Adds the messaggi.
	 *
	 * @param msgs the messaggi
	 */
	public void addMessaggi(List<Messaggio> msgs){
		getMessaggi().addAll(msgs);
	}
	
}
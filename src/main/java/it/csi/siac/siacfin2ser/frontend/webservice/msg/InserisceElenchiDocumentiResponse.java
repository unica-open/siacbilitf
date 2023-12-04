/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElenchiDocumentiAllegato;


@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceElenchiDocumentiResponse extends ServiceResponse {
	
	//serve?
	private Bilancio bilancio;
	private ElenchiDocumentiAllegato elenchiDocumentiAllegato;
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	/**
	 * @return the elenchiDocumentiAllegato
	 */
	public ElenchiDocumentiAllegato getElenchiDocumentiAllegato() {
		return elenchiDocumentiAllegato;
	}
	
	/**
	 * @param elenchiDocumentiAllegato the elenchiDocumentiAllegato to set
	 */
	public void setElenchiDocumentiAllegato(ElenchiDocumentiAllegato elenchiDocumentiAllegato) {
		this.elenchiDocumentiAllegato = elenchiDocumentiAllegato;
	}
	
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
	 * @param messaggio the messaggio
	 */
	public void addMessaggio(String codice, String descrizione) {
		addMessaggio(new Messaggio(codice,descrizione));
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
	
	

}

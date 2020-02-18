/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class CompletaAllegatoAttoMultiploResponse extends ServiceResponse {

	//FIXME: vedere cosa serve
	private AllegatoAtto allegatoAtto;
	
	private List<AllegatoAtto> allegatiScartati = new ArrayList<AllegatoAtto>();
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	

	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}

	
	/**
	 * @return the allegatiScartati
	 */
	public List<AllegatoAtto> getAllegatiScartati() {
		return allegatiScartati;
	}

	/**
	 * @param allegatiScartati the allegatiScartati to set
	 */
	public void setAllegatiScartati(List<AllegatoAtto> allegatiScartati) {
		this.allegatiScartati = allegatiScartati;
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

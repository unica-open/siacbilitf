/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.PrimaNota;

/**
 * Response per la registrazione massiva della prima nota integrata
 * 
 * @author Domenico
 * 
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RegistraMassivaPrimaNotaIntegrataResponse extends ServiceResponse {

	@XmlElementWrapper(name="primeNoteInserite")
	@XmlElement(name="primaNotaInserita")
	private List<PrimaNota> primeNoteInserite = new ArrayList<PrimaNota>();
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();

	/**
	 * Elenco delle prime note correttament inserite.
	 * 
	 * @return the primeNote
	 */
	@XmlTransient
	public List<PrimaNota> getPrimeNoteInserite() {
		return primeNoteInserite;
	}

	/**
	 * @param primeNote the primeNote to set
	 */
	public void setPrimeNoteInserite(List<PrimaNota> primeNote) {
		this.primeNoteInserite = primeNote != null ? primeNote : new ArrayList<PrimaNota>();
	}
	
	/**
	 * Aggiunge una PrimaNota alla lista di quelle inserite correttamente.
	 * 
	 * @param primaNota
	 */
	public void addPrimaNotaInserita(PrimaNota primaNota){
		getPrimeNoteInserite().add(primaNota);
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

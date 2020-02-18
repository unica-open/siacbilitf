/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.PrimaNota;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class ValidazioneMassivaPrimaNotaIntegrataResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "primeNoteScartate")
	@XmlElement(name = "primaNota")
	private List<PrimaNota> primeNoteScartate = new ArrayList<PrimaNota>();
	
	private List<Errore> messaggi = new ArrayList<Errore>();

	/**
	 * @return the primeNoteScartate
	 */
	@XmlTransient
	public List<PrimaNota> getPrimeNoteScartate() {
		return primeNoteScartate;
	}

	/**
	 * @param primeNoteScartate the primeNoteScartate to set
	 */
	public void setPrimeNoteScartate(List<PrimaNota> primeNoteScartate) {
		this.primeNoteScartate = primeNoteScartate != null ? primeNoteScartate : new ArrayList<PrimaNota>();
	}

	/**
	 * @return the messaggi
	 */
	public List<Errore> getMessaggi() {
		return messaggi;
	}

	/**
	 * @param messaggi the messaggi to set
	 */
	public void setListaMessaggi(List<Errore> messaggi) {
		this.messaggi = messaggi != null ? messaggi : new ArrayList<Errore>();
	}
	
}

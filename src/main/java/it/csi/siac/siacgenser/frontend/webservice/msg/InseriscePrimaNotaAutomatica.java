/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class InseriscePrimaNotaAutomatica extends ServiceRequest {

	/**
	 * Insieme delle registrazioni dal quale creare la PrimaNota automatica.
	 */
	private List<RegistrazioneMovFin> registrazioniMovFin = new ArrayList<RegistrazioneMovFin>();

	/**
	 * @return the registrazioniMovFin
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFin() {
		return registrazioniMovFin;
	}

	/**
	 * Imposta l'insieme delle registrazioni dal quale creare la PrimaNota automatica.
	 * Ad esempio i documenti hanno una registrazioneMovFin per ogni quota ed inseriscono una sola PrimaNota.
	 * 
	 * @param registrazioniMovFin the registrazioniMovFin to set
	 */
	public void setRegistrazioniMovFin(List<RegistrazioneMovFin> registrazioniMovFin) {
		this.registrazioniMovFin = registrazioniMovFin != null ? registrazioniMovFin : new ArrayList<RegistrazioneMovFin>();
	}
	
	public void addRegistrazioneMovFin(RegistrazioneMovFin registrazioneMovFin) {
		getRegistrazioniMovFin().add(registrazioneMovFin);
	}

	


	
}

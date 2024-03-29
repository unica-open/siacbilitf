/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerCapitolo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 27/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class InserisceConciliazioniPerCapitolo extends ServiceRequest {
	
	private Bilancio bilancio;
	@XmlElementWrapper(name="conciliazioniPerCapitolo")
	@XmlElement(name="conciliazione")
	private List<ConciliazionePerCapitolo> conciliazioniPerCapitolo = new ArrayList<ConciliazionePerCapitolo>();

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
	 * @return the conciliazioniPerCapitolo
	 */
	@XmlTransient
	public List<ConciliazionePerCapitolo> getConciliazioniPerCapitolo() {
		return conciliazioniPerCapitolo;
	}

	/**
	 * @param conciliazioniPerCapitolo the conciliazioniPerCapitolo to set
	 */
	public void setConciliazioniPerCapitolo(List<ConciliazionePerCapitolo> conciliazioniPerCapitolo) {
		this.conciliazioniPerCapitolo = conciliazioniPerCapitolo;
	}

}

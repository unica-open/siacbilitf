/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerCapitolo;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 27/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class InserisceConciliazionePerCapitolo extends ServiceRequest {
	
	private Bilancio bilancio;
	private ConciliazionePerCapitolo conciliazionePerCapitolo;

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
	 * @return the conciliazionePerCapitolo
	 */
	public ConciliazionePerCapitolo getConciliazionePerCapitolo() {
		return conciliazionePerCapitolo;
	}

	/**
	 * @param conciliazionePerCapitolo the conciliazionePerCapitolo to set
	 */
	public void setConciliazionePerCapitolo(
			ConciliazionePerCapitolo conciliazionePerCapitolo) {
		this.conciliazionePerCapitolo = conciliazionePerCapitolo;
	}

}

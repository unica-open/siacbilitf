/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerCapitolo;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Valentina
 * @version 1.0.0 - 28/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaConciliazionePerCapitolo extends ServiceRequest {
	
	private ConciliazionePerCapitolo conciliazionePerCapitolo;
	private ParametriPaginazione parametriPaginazione;
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
	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}
	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	
	
}

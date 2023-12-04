/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerTitolo;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 02/11/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaContiConciliazionePerTitolo extends ServiceRequest {
	
	private ConciliazionePerTitolo conciliazionePerTitolo;

	/**
	 * @return the conciliazionePerTitolo
	 */
	public ConciliazionePerTitolo getConciliazionePerTitolo() {
		return conciliazionePerTitolo;
	}

	/**
	 * @param conciliazionePerTitolo the conciliazionePerTitolo to set
	 */
	public void setConciliazionePerTitolo(ConciliazionePerTitolo conciliazionePerTitolo) {
		this.conciliazionePerTitolo = conciliazionePerTitolo;
	}

}

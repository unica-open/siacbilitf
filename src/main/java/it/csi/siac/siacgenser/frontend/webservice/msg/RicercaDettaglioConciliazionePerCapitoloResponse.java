/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerCapitolo;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 26/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaDettaglioConciliazionePerCapitoloResponse extends ServiceResponse {
	
	private ConciliazionePerCapitolo conciliazionePerCapitolo;

	/**
	 * @return the conciliazionePerCapitolo
	 */
	public ConciliazionePerCapitolo getConciliazionePerCapitolo() {
		return conciliazionePerCapitolo;
	}

	/**
	 * @param conciliazionePerCapitolo the conciliazionePerCapitolo to set
	 */
	public void setConciliazionePerCapitolo(ConciliazionePerCapitolo conciliazionePerCapitolo) {
		this.conciliazionePerCapitolo = conciliazionePerCapitolo;
	}
	
}

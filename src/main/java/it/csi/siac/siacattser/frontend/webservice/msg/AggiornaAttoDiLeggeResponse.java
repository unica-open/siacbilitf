/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.AttoDiLegge;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response del servizio di aggiornamento atto di legge
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class AggiornaAttoDiLeggeResponse extends ServiceResponse {
	
	private AttoDiLegge attoDiLeggeAggiornato;

	/**
	 * @return the attoDiLeggeAggiornato
	 */
	public AttoDiLegge getAttoDiLeggeAggiornato() {
		return attoDiLeggeAggiornato;
	}

	/**
	 * @param attoDiLeggeAggiornato the attoDiLeggeAggiornato to set
	 */
	public void setAttoDiLeggeAggiornato(AttoDiLegge attoDiLeggeAggiornato) {
		this.attoDiLeggeAggiornato = attoDiLeggeAggiornato;
	}

}

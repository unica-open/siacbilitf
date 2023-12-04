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
 * Response del servizio di cancellazione atti di legge
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class CancellaAttoDiLeggeResponse extends ServiceResponse {
	
	private AttoDiLegge attoDiLeggeCancellato;

	/**
	 * @return the attoDiLeggeCancellato
	 */
	public AttoDiLegge getAttoDiLeggeCancellato() {
		return attoDiLeggeCancellato;
	}

	/**
	 * @param attoDiLeggeCancellato the attoDiLeggeCancellato to set
	 */
	public void setAttoDiLeggeCancellato(AttoDiLegge attoDiLeggeCancellato) {
		this.attoDiLeggeCancellato = attoDiLeggeCancellato;
	}


}

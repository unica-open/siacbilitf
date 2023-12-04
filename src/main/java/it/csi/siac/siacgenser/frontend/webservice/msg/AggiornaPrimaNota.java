/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class AggiornaPrimaNota extends BasePrimaNotaRequest {

	private boolean saltaCheckStatoPerAmbito = false;

	/**
	 * @return the saltaCheckStatoPerAmbito
	 */
	@XmlTransient
	public boolean isSaltaCheckStatoPerAmbito() {
		return saltaCheckStatoPerAmbito;
	}

	/**
	 * @param saltaCheckStatoPerAmbito the saltaCheckStatoPerAmbito to set
	 */
	public void setSaltaCheckStatoPerAmbito(boolean saltaCheckStatoPerAmbito) {
		this.saltaCheckStatoPerAmbito = saltaCheckStatoPerAmbito;
	}
	
	
}

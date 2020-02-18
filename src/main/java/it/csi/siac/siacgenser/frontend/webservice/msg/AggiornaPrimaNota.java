/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.PrimaNota;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class AggiornaPrimaNota extends ServiceRequest {

	private PrimaNota primaNota;
	private boolean saltaCheckStatoPerAmbito = false;


	/**
	 * @return the primaNota
	 */
	public PrimaNota getPrimaNota() {
		return primaNota;
	}

	/**
	 * @param primaNota the primaNota to set
	 */
	public void setPrimaNota(PrimaNota primaNota) {
		this.primaNota = primaNota;
	}

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

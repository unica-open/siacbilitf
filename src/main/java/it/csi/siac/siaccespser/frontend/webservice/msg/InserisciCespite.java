/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class InserisciCespite extends ServiceRequest {

	private Cespite cespite;
	
	private boolean preserveValoreAttuale = false;

	/**
	 * @return the Cespiti
	 */
	public Cespite getCespite() {
		return cespite;
	}

	/**
	 * @param rateo the Cespiti to set
	 */
	public void setCespite(Cespite cespite) {
		this.cespite = cespite;
	}

	/**
	 * @return the preserveValoreAttuale
	 */
	@XmlTransient
	public boolean isPreserveValoreAttuale() {
		return this.preserveValoreAttuale;
	}

	/**
	 * @param preserveValoreAttuale the preserveValoreAttuale to set
	 */
	public void setPreserveValoreAttuale(boolean preserveValoreAttuale) {
		this.preserveValoreAttuale = preserveValoreAttuale;
	}
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreGSA;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 26/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class AnnullaClassificatoreGSA extends ServiceRequest {
	
	private ClassificatoreGSA classificatoreGSA;
	
	private Bilancio bilancio;

	/**
	 * Gets the classificatore GSA.
	 *
	 * @return the conciliazionePerTitolo
	 */
	public ClassificatoreGSA getClassificatoreGSA() {
		return classificatoreGSA;
	}

	/**
	 * Sets the classificatore GSA.
	 *
	 * @param classificatoreGSA the new classificatore GSA
	 */
	public void setClassificatoreGSA(ClassificatoreGSA classificatoreGSA) {
		this.classificatoreGSA = classificatoreGSA;
	}

	/**
	 * Gets the bilancio.
	 *
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * Sets the bilancio.
	 *
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

}

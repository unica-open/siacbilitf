/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CausaleEP;
import it.csi.siac.siacgenser.model.CausaleEPModelDetail;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaDettaglioModulareCausale extends ServiceRequest {

	private CausaleEP causaleEP;
	private Bilancio bilancio;
	@XmlElementWrapper(name="causaleEPModelDetails")
	@XmlElement(name="modelDetail")
	private CausaleEPModelDetail[] causaleEPModelDetails;

	/**
	 * @return the causaleEP
	 */
	public CausaleEP getCausaleEP() {
		return causaleEP;
	}

	/**
	 * @param causaleEP the causaleEP to set
	 */
	public void setCausaleEP(CausaleEP causaleEP) {
		this.causaleEP = causaleEP;
	}

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
	 * @return the causaleEPModelDetails
	 */
	@XmlTransient
	public CausaleEPModelDetail[] getCausaleEPModelDetails() {
		return causaleEPModelDetails;
	}

	/**
	 * @param causaleEPModelDetails the causaleEPModelDetails to set
	 */
	public void setCausaleEPModelDetails(CausaleEPModelDetail... causaleEPModelDetails) {
		this.causaleEPModelDetails = causaleEPModelDetails;
	}
	
}

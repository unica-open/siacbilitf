/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerBeneficiario;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 27/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class AggiornaConciliazionePerBeneficiario extends ServiceRequest {
	
	private Bilancio bilancio;
	private ConciliazionePerBeneficiario conciliazionePerBeneficiario;

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
	 * @return the conciliazionePerBeneficiario
	 */
	public ConciliazionePerBeneficiario getConciliazionePerBeneficiario() {
		return conciliazionePerBeneficiario;
	}

	/**
	 * @param conciliazionePerBeneficiario the conciliazionePerBeneficiario to set
	 */
	public void setConciliazionePerBeneficiario(ConciliazionePerBeneficiario conciliazionePerBeneficiario) {
		this.conciliazionePerBeneficiario = conciliazionePerBeneficiario;
	}

}

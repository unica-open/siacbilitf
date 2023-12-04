/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerBeneficiario;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 26/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaDettaglioConciliazionePerBeneficiarioResponse extends ServiceResponse {
	
	private ConciliazionePerBeneficiario conciliazionePerBeneficiario;

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

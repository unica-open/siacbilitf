/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerBeneficiario;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Valentina
 * @version 1.0.0 - 28/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaConciliazionePerBeneficiario extends ServiceRequest {
	
	private ConciliazionePerBeneficiario conciliazionePerBeneficiario;
	private ParametriPaginazione parametriPaginazione;
	
	
	/**
	 * @return the conciliazionePerBeneficiario
	 */
	public ConciliazionePerBeneficiario getConciliazionePerBeneficiario() {
		return conciliazionePerBeneficiario;
	}
	/**
	 * @param conciliazionePerBeneficiario the conciliazionePerBeneficiario to set
	 */
	public void setConciliazionePerBeneficiario(
			ConciliazionePerBeneficiario conciliazionePerBeneficiario) {
		this.conciliazionePerBeneficiario = conciliazionePerBeneficiario;
	}
	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}
	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	
	
}

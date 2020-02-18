/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerBeneficiario;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 27/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class InserisceConciliazioniPerBeneficiarioResponse extends ServiceResponse {
	
	@XmlElementWrapper(name="conciliazioniPerBeneficiario")
	@XmlElement(name="conciliazione")
	private List<ConciliazionePerBeneficiario> conciliazioniPerBeneficiario = new ArrayList<ConciliazionePerBeneficiario>();

	/**
	 * @return the conciliazioniPerBeneficiario
	 */
	@XmlTransient
	public List<ConciliazionePerBeneficiario> getConciliazioniPerBeneficiario() {
		return conciliazioniPerBeneficiario;
	}

	/**
	 * @param conciliazioniPerBeneficiario the conciliazioniPerBeneficiario to set
	 */
	public void setConciliazioniPerBeneficiario(List<ConciliazionePerBeneficiario> conciliazioniPerBeneficiario) {
		this.conciliazioniPerBeneficiario = conciliazioniPerBeneficiario;
	}
	
}

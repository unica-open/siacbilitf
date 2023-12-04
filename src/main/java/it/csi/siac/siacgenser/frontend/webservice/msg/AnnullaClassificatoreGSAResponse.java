/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreGSA;

/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 27/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class AnnullaClassificatoreGSAResponse extends ServiceResponse {
	
	private ClassificatoreGSA classificatoreGSA;

	/**
	 * Gets the conciliazione per beneficiario.
	 *
	 * @return the conciliazionePerBeneficiario
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
	
}

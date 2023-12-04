/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreGSA;

import javax.xml.bind.annotation.XmlType;

/**
 * The Class RicercaDettaglioClassificatoreGSAResponse.
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaDettaglioClassificatoreGSAResponse extends ServiceResponse {

	private ClassificatoreGSA classificatoreGSA;
	
	/**
	 * @return the classificatoreGSA
	 */
	public ClassificatoreGSA getClassificatoreGSA() {
		return classificatoreGSA;
	}

	/**
	 * @param classificatoreGSA the classificatoreGSA to set
	 */
	public void setClassificatoreGSA(ClassificatoreGSA classificatoreGSA) {
		this.classificatoreGSA = classificatoreGSA;
	}
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreGSA;
import it.csi.siac.siacgenser.model.ClassificatoreGSAModelDetail;

/**
 * The Class RicercaSinteticaClassificatoreGSA.
 * 
 * @author Elisa chiari
 * @version 1.0.0 19/12/2017
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaClassificatoreGSA extends RicercaSinteticaBaseRequest {

	private ClassificatoreGSA classificatoreGSA;
	private Bilancio bilancio;
	private ClassificatoreGSAModelDetail[] classificatoreGSAModelDetails;
	
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

	/**
	 * @return the classificatoreGSAModelDetails
	 */
	public ClassificatoreGSAModelDetail[] getClassificatoreGSAModelDetails() {
		return classificatoreGSAModelDetails;
	}

	/**
	 * @param classificatoreGSAModelDetails the classificatoreGSAModelDetails to set
	 */
	public void setClassificatoreGSAModelDetails(ClassificatoreGSAModelDetail... classificatoreGSAModelDetails) {
		this.classificatoreGSAModelDetails = classificatoreGSAModelDetails;
	}
	
	
}

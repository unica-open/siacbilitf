/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Ambito;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;

/**
 * The Class RicercaClassificatoreGSAValido.
 * 
 * @author Marchino Alessandro
 * @version 1.0.0 - 04/01/2018
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaClassificatoreGSAValido extends ServiceRequest {

	private Bilancio bilancio;
	private Ambito ambito;
	
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
	 * @return the ambito
	 */
	public Ambito getAmbito() {
		return this.ambito;
	}

	/**
	 * @param ambito the ambito to set
	 */
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}

}

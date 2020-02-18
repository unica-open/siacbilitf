/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.QuadroEconomico;


/**
 * @author Marchino Alessandro
 * @version 1.0.0 - 26/10/2015
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceQuadroEconomico extends ServiceRequest {
	
	private QuadroEconomico quadroEconomico;
	private Bilancio bilancio;


	public QuadroEconomico getQuadroEconomico() {
		return quadroEconomico;
	}


	public void setQuadroEconomico(QuadroEconomico quadroEconomico) {
		this.quadroEconomico = quadroEconomico;
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

}

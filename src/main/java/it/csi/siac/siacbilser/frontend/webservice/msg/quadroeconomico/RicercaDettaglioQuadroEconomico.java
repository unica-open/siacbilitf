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
import it.csi.siac.siacbilser.model.QuadroEconomicoModelDetail;

/**
 * The Class RicercaDettaglioClassificatoreGSA.
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioQuadroEconomico extends ServiceRequest {

	private QuadroEconomico quadroEconomico;
	private Bilancio bilancio;
	
	private QuadroEconomicoModelDetail[] quadroEconomicoModelDetails;
	


	/**
	 * @return the quadroEconomico
	 */
	public QuadroEconomico getQuadroEconomico() {
		return quadroEconomico;
	}

	/**
	 * @param quadroEconomico the quadroEconomico to set
	 */
	public void setQuadroEconomico(QuadroEconomico quadroEconomico) {
		this.quadroEconomico = quadroEconomico;
	}

	/**
	 * @return the quadroEconomicoModelDetails
	 */
	public QuadroEconomicoModelDetail[] getQuadroEconomicoModelDetails() {
		return quadroEconomicoModelDetails;
	}

	/**
	 * @param quadroEconomicoModelDetails the quadroEconomicoModelDetails to set
	 */
	public void setQuadroEconomicoModelDetails(QuadroEconomicoModelDetail[] quadroEconomicoModelDetails) {
		this.quadroEconomicoModelDetails = quadroEconomicoModelDetails;
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

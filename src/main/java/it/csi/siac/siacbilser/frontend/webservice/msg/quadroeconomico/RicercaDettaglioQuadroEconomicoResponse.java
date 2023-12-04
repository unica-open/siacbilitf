/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico;

import it.csi.siac.siacbilser.model.QuadroEconomico;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

import javax.xml.bind.annotation.XmlType;

/**
 * The Class RicercaDettaglioClassificatoreGSAResponse.
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioQuadroEconomicoResponse extends ServiceResponse {

	private QuadroEconomico quadroEconomico;

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
	
	
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.AttoDiLegge;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response del servizio di inserimento atto di legge
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class InserisceAttoDiLeggeResponse extends ServiceResponse {
	
	private AttoDiLegge attoDiLeggeInserito;

	/**
	 * @return the attoDiLeggeInserito
	 */
	public AttoDiLegge getAttoDiLeggeInserito() {
		return attoDiLeggeInserito;
	}

	/**
	 * @param attoDiLeggeInserito the attoDiLeggeInserito to set
	 */
	public void setAttoDiLeggeInserito(AttoDiLegge attoDiLeggeInserito) {
		this.attoDiLeggeInserito = attoDiLeggeInserito;
	}

}

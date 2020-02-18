/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.OperazioneCassa;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class AnnullaOperazioneDiCassa extends ServiceRequest {
	
	private OperazioneCassa operazioneCassa;

	/**
	 * @return the operazioneCassa
	 */
	public OperazioneCassa getOperazioneCassa() {
		return operazioneCassa;
	}

	/**
	 * @param operazioneCassa the operazioneCassa to set
	 */
	public void setOperazioneCassa(OperazioneCassa operazioneCassa) {
		this.operazioneCassa = operazioneCassa;
	}

}

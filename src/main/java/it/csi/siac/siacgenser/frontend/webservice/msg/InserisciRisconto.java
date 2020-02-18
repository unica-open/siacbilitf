/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Risconto;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class InserisciRisconto extends ServiceRequest {

	private Risconto risconto;

	/**
	 * @return the risconto
	 */
	public Risconto getRisconto() {
		return risconto;
	}

	/**
	 * @param risconto the risconto to set
	 */
	public void setRisconto(Risconto risconto) {
		this.risconto = risconto;
	}
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.VariazioneCespite;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class AggiornaVariazioneCespite.
 * @author Marchino Alessandro
 * @version 1.0.0 - 08/08/2018
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class AggiornaVariazioneCespite extends ServiceRequest {

	private VariazioneCespite variazioneCespite;

	/**
	 * @return the variazioneCespite
	 */
	public VariazioneCespite getVariazioneCespite() {
		return this.variazioneCespite;
	}

	/**
	 * @param variazioneCespite the variazioneCespite to set
	 */
	public void setVariazioneCespite(VariazioneCespite variazioneCespite) {
		this.variazioneCespite = variazioneCespite;
	}

}

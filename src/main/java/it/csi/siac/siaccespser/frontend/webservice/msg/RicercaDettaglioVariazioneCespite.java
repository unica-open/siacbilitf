/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.ModelDetailServiceRequest;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.VariazioneCespite;

/**
 * The Class RicercaDettaglioVariazioneCespite.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaDettaglioVariazioneCespite extends ModelDetailServiceRequest {
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

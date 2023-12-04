/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Rateo;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class InserisciRateo extends ServiceRequest {
	private Rateo rateo;

	/**
	 * @return the rateo
	 */
	public Rateo getRateo() {
		return rateo;
	}

	/**
	 * @param rateo the rateo to set
	 */
	public void setRateo(Rateo rateo) {
		this.rateo = rateo;
	}
	
	
	
}

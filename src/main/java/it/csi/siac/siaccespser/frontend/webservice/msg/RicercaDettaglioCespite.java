/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccespser.model.CespiteModelDetail;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaDettaglioCespite extends ServiceRequest {
	private Cespite cespite;
	private CespiteModelDetail[] listaCespiteModelDetails;

	/**
	 * @return the cespite
	 */
	public Cespite getCespite() {
		return cespite;
	}

	/**
	 * @param cespite the cespite to set
	 */
	public void setCespite(Cespite cespite) {
		this.cespite = cespite;
	}

	/**
	 * @return the listaCespiteModelDetails
	 */
	public CespiteModelDetail[] getListaCespiteModelDetails() {
		return listaCespiteModelDetails;
	}

	/**
	 * @param listaCespiteModelDetails the listaCespiteModelDetails to set
	 */
	public void setListaCespiteModelDetails(CespiteModelDetail[] listaCespiteModelDetails) {
		this.listaCespiteModelDetails = listaCespiteModelDetails;
	}
	
	
}

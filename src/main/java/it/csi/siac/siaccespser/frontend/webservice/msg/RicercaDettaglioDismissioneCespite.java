/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.DismissioneCespite;
import it.csi.siac.siaccespser.model.DismissioneCespiteModelDetail;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaDettaglioDismissioneCespite extends ServiceRequest {
	private DismissioneCespite cespite;
	private DismissioneCespiteModelDetail[] listaDismissioneCespiteModelDetails;

	/**
	 * @return the cespite
	 */
	public DismissioneCespite getDismissioneCespite() {
		return cespite;
	}

	/**
	 * @param cespite the cespite to set
	 */
	public void setDismissioneCespite(DismissioneCespite cespite) {
		this.cespite = cespite;
	}

	/**
	 * @return the listaDismissioneCespiteModelDetails
	 */
	public DismissioneCespiteModelDetail[] getListaDismissioneCespiteModelDetails() {
		return listaDismissioneCespiteModelDetails;
	}

	/**
	 * @param listaDismissioneCespiteModelDetails the listaDismissioneCespiteModelDetails to set
	 */
	public void setListaDismissioneCespiteModelDetails(DismissioneCespiteModelDetail[] listaDismissioneCespiteModelDetails) {
		this.listaDismissioneCespiteModelDetails = listaDismissioneCespiteModelDetails;
	}
	
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccespser.model.CategoriaCespitiModelDetail;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaDettaglioCategoriaCespiti extends ServiceRequest {

	private CategoriaCespiti categoriaCespiti;
	private CategoriaCespitiModelDetail[] categoriaCespitiModelDetails;


	/**
	 * @return the categoriaCespiti
	 */
	public CategoriaCespiti getCategoriaCespiti() {
		return categoriaCespiti;
	}

	/**
	 * @param categoriaCespiti the categoriaCespiti to set
	 */
	public void setCategoriaCespiti(CategoriaCespiti categoriaCespiti) {
		this.categoriaCespiti = categoriaCespiti;
	}

	/**
	 * @return the categoriaCespitiModelDetails
	 */
	public CategoriaCespitiModelDetail[] getCategoriaCespitiModelDetails() {
		return categoriaCespitiModelDetails;
	}

	/**
	 * @param categoriaCespitiModelDetails the categoriaCespitiModelDetails to set
	 */
	public void setCategoriaCespitiModelDetails(CategoriaCespitiModelDetail[] categoriaCespitiModelDetails) {
		this.categoriaCespitiModelDetails = categoriaCespitiModelDetails;
	}
	
	
}

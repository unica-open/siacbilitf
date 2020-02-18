/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccespser.model.CategoriaCespitiModelDetail;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaSinteticaCategoriaCespiti extends RicercaSinteticaBaseRequest {
	
	private CategoriaCespiti categoriaCespiti;
	private CategoriaCespitiModelDetail[] categoriaCespitiModelDetails;
	private Boolean escludiAnnullati;

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

	/**
	 * @return the escludiAnnullati
	 */
	public Boolean getEscludiAnnullati() {
		return escludiAnnullati;
	}

	/**
	 * @param escludiAnnullati the escludiAnnullati to set
	 */
	public void setEscludiAnnullati(Boolean escludiAnnullati) {
		this.escludiAnnullati = escludiAnnullati;
	}
	
}

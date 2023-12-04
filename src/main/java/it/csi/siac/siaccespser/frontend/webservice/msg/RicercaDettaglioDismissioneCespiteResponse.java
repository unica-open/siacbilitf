/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.DismissioneCespite;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * @author elisa
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaDettaglioDismissioneCespiteResponse extends ServiceResponse {
	private DismissioneCespite dismissioneCespite;

	/**
	 * @return the cespite
	 */
	public DismissioneCespite getDismissioneCespite() {
		return dismissioneCespite;
	}

	/**
	 * @param cespite the cespite to set
	 */
	public void setDismissioneCespite(DismissioneCespite cespite) {
		this.dismissioneCespite = cespite;
	}
}

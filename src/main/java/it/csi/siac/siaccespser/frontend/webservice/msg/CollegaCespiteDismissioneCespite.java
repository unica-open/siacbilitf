/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.DismissioneCespite;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class CollegaCespiteDismissioneCespite extends ServiceRequest {

	private DismissioneCespite dismissioneCespite;
	
	private List<Integer> uidsCespiti;

	/**
	 * @return the dismissioneCespite
	 */
	public DismissioneCespite getDismissioneCespite() {
		return dismissioneCespite;
	}

	/**
	 * @param dismissioneCespite the dismissioneCespite to set
	 */
	public void setDismissioneCespite(DismissioneCespite dismissioneCespite) {
		this.dismissioneCespite = dismissioneCespite;
	}

	/**
	 * @return the cespite
	 */
	public List<Integer> getUidsCespiti() {
		return uidsCespiti;
	}

	/**
	 * Sets the uids cespiti.
	 *
	 * @param uidsCespiti the new uids cespiti
	 */
	public void setUidsCespiti(List<Integer> uidsCespiti) {
		this.uidsCespiti = uidsCespiti;
	}
	
	
}

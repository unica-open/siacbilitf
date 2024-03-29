/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.DismissioneCespite;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * @author antonino
 * @version 1.0.0 - 31-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class CollegaCespiteDismissioneCespiteResponse extends ServiceResponse {
	
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
	 * @return the uidsCespiti
	 */
	public List<Integer> getUidsCespiti() {
		return uidsCespiti;
	}

	/**
	 * @param uidsCespiti the uidsCespiti to set
	 */
	public void setUidsCespiti(List<Integer> uidsCespiti) {
		this.uidsCespiti = uidsCespiti;
	}
	
	
}

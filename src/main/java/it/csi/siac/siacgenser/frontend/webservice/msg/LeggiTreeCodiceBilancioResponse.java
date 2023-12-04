/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CodiceBilancio;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * The Class LeggiTreeCodiceBilancioResponse.
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class LeggiTreeCodiceBilancioResponse extends ServiceResponse {

	private List<CodiceBilancio> treeCodiciBilancio = new ArrayList<CodiceBilancio>();

	/**
	 * @return the treeCodiciBilancio
	 */
	public List<CodiceBilancio> getTreeCodiciBilancio() {
		return treeCodiciBilancio;
	}

	/**
	 * @param treeCodiciBilancio the treeCodiciBilancio to set
	 */
	public void setTreeCodiciBilancio(List<CodiceBilancio> treeCodiciBilancio) {
		this.treeCodiciBilancio = treeCodiciBilancio;
	}

	
	
}

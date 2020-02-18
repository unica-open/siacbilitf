/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * 
 * @author Nazha Ahmad
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ContaMovimentiAssociatiACapitolo extends ServiceRequest {
	
	private Integer idCapitolo;

	/**
	 * @return the idCapitolo
	 */
	public Integer getIdCapitolo() {
		return idCapitolo;
	}

	/**
	 * @param idCapitolo the idCapitolo to set
	 */
	public void setIdCapitolo(Integer idCapitolo) {
		this.idCapitolo = idCapitolo;
	}
	

}

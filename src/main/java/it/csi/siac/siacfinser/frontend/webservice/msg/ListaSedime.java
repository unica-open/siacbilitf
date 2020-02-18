/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * 
 *  accetta una stringa con la parte iniziale del sedime
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListaSedime extends ServiceRequest {

	
	private String descrizioneSedime;

	public String getDescrizioneSedime() {
		return descrizioneSedime;
	}

	public void setDescrizioneSedime(String descrizioneSedime) {
		this.descrizioneSedime = descrizioneSedime;
	}
}

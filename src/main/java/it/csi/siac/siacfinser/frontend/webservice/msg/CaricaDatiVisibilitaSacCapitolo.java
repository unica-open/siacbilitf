/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CaricaDatiVisibilitaSacCapitolo  extends ServiceRequest{

	private Integer uidCapitolo;

	public Integer getUidCapitolo() {
		return uidCapitolo;
	}

	public void setUidCapitolo(Integer uidCapitolo) {
		this.uidCapitolo = uidCapitolo;
	}
	
	
}

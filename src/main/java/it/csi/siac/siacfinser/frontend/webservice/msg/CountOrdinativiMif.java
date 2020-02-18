/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CountOrdinativiMif extends ServiceRequest {
	private Integer idElaborazione;

	public Integer getIdElaborazione() {
		return idElaborazione;
	}

	public void setIdElaborazione(Integer idElaborazione) {
		this.idElaborazione = idElaborazione;
	}
}

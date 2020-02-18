/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaCodiceSoggetto extends ServiceRequest {
	private Integer uidSoggetto;

	public Integer getUidSoggetto() {
		return uidSoggetto;
	}

	public void setUidSoggetto(Integer uidSoggetto) {
		this.uidSoggetto = uidSoggetto;
	}


}

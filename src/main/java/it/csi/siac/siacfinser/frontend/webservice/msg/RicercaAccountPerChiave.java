/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAccountPerChiave extends ServiceRequest {

	private Ente ente;
	private String accountId;
	
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
}

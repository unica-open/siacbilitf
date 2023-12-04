/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaStatoSdiDocumento { //extends ServiceRequest {
	
	private String idDocumento;
	private String statoSdi;
	
	
	public String getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}
	public String getStatoSdi() {
		return statoSdi;
	}
	public void setStatoSdi(String statoSdi) {
		this.statoSdi = statoSdi;
	}
	
	
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaGruppoTipoAccreditoPerChiave extends ServiceRequest {
	
	private String tipoCode;
	private Integer tipoId;
	
	
	public String getTipoCode() {
		return tipoCode;
	}
	public void setTipoCode(String tipoCode) {
		this.tipoCode = tipoCode;
	}
	public Integer getTipoId() {
		return tipoId;
	}
	public void setTipoId(Integer tipoId) {
		this.tipoId = tipoId;
	}
	
	
	

}

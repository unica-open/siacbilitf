/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo
 * BIL.BilancioService.ricercaDettaglioBilancio()
 * 
 * @author Domenico Lisi
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioBilancio extends ServiceRequest {
	
	private Integer chiaveBilancio;

	public Integer getChiaveBilancio() {
		return chiaveBilancio;
	}
	public void setChiaveBilancio(Integer chiaveBilancio) {
		this.chiaveBilancio = chiaveBilancio;
	}
	
	

}

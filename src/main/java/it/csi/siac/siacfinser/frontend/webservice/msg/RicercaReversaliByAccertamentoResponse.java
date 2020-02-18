/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;


/**
 * Risposta 
 * 
 * @author rnontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaReversaliByAccertamentoResponse extends ServiceResponse {

	Boolean reversaliCollegateAlMovimento;

	/**
	 * @return the reversaliCollegate
	 */
	public Boolean getReversaliCollegateAlMovimento() {
		return reversaliCollegateAlMovimento;
	}

	/**
	 * @param reversaliCollegate the reversaliCollegate to set
	 */
	public void setReversaliCollegateAlMovimento(Boolean reversaliCollegateAlMovimento) {
		this.reversaliCollegateAlMovimento = reversaliCollegateAlMovimento;
	}
	
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AttributiBilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.BilancioService.aggiornaAttributiBilancio()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaAttributiBilancioResponse extends ServiceResponse {
	
	private AttributiBilancio attributiBilancio;

	/**
	 * @return the attributiBilancio
	 */
	public AttributiBilancio getAttributiBilancio() {
		return attributiBilancio;
	}

	/**
	 * @param attributiBilancio the attributiBilancio to set
	 */
	public void setAttributiBilancio(AttributiBilancio attributiBilancio) {
		this.attributiBilancio = attributiBilancio;
	}

}

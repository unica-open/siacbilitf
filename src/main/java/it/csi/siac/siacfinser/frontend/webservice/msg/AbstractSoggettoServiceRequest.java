/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * request astratta da cui estendono tutte le request del soggetto
 * per avere la possibilita di settare l'ambito anche da chiamata del service
 * 
 * @author 
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public abstract class AbstractSoggettoServiceRequest extends ServiceRequest {
	
	private String codificaAmbito;

	public String getCodificaAmbito() {
		return codificaAmbito;
	}

	public void setCodificaAmbito(String codificaAmbito) {
		this.codificaAmbito = codificaAmbito;
	}

}

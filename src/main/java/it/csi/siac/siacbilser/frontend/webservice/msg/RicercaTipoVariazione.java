/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Request per il servizio di RicercaTipoVariazione.
 * 
 * @author Marchino Alessandro
 * @version 1.0.0 - 10/01/2014
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoVariazione extends ServiceRequest {
	
	private Ente ente;

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * Impostare l'uid dell'ente.
	 * 
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
	

}

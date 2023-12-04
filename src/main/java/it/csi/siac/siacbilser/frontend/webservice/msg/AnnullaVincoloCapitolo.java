/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Vincolo;
import it.csi.siac.siaccorser.model.ServiceRequest;



/**
 * Richiesta al metodo
 * BIL.VincoloCapitoloService.annullaVincoloCapitoloPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AnnullaVincoloCapitolo extends ServiceRequest {
	
	//impostare solo uid del vincolo
	private Vincolo vincolo;

	public Vincolo getVincolo() {
		return vincolo;
	}

	/**
	 * Impostare solo uid del Vincolo.
	 * 
	 * @param vincolo
	 */
	public void setVincolo(Vincolo vincolo) {
		this.vincolo = vincolo;
	}
	
	
	
	

}

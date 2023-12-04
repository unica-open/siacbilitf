/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Vincolo;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo
 * BIL.VincoloCapitoloService.annullaVincoloCapitoloPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AnnullaVincoloCapitoloResponse extends ServiceResponse {
	
	private Vincolo vincolo;

	public Vincolo getVincolo() {
		return vincolo;
	}

	public void setVincolo(Vincolo vincolo) {
		this.vincolo = vincolo;
	}
	
	

}

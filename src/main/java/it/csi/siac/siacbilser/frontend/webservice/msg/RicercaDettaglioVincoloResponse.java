/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VincoloCapitoli;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo
 * BIL.VincoloCapitoloService.ricercaVincoloCapitoloPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioVincoloResponse extends ServiceResponse {

	private VincoloCapitoli vincoloCapitoli;

	public VincoloCapitoli getVincoloCapitoli() {
		return vincoloCapitoli;
	}

	public void setVincoloCapitoli(VincoloCapitoli vincoloCapitoli) {
		this.vincoloCapitoli = vincoloCapitoli;
	}
	
	
	
	

	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloMassivaEntrataPrevisione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaSinteticaCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioMassivaCapitoloEntrataPrevisioneResponse extends ServiceResponse {
	
	private CapitoloMassivaEntrataPrevisione capitoloMassivaEntrataPrevisione;

	public CapitoloMassivaEntrataPrevisione getCapitoloMassivaEntrataPrevisione() {
		return capitoloMassivaEntrataPrevisione;
	}

	public void setCapitoloMassivaEntrataPrevisione(
			CapitoloMassivaEntrataPrevisione capitoloMassivaEntrataPrevisione) {
		this.capitoloMassivaEntrataPrevisione = capitoloMassivaEntrataPrevisione;
	}

	
}

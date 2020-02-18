/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloMassivaUscitaPrevisione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaSinteticaCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioMassivaCapitoloUscitaPrevisioneResponse extends ServiceResponse {
	
	private CapitoloMassivaUscitaPrevisione capitoloMassivaUscitaPrevisione;

	public CapitoloMassivaUscitaPrevisione getCapitoloMassivaUscitaPrevisione() {
		return capitoloMassivaUscitaPrevisione;
	}

	public void setCapitoloMassivaUscitaPrevisione(
			CapitoloMassivaUscitaPrevisione capitoloMassivaUscitaPrevisione) {
		this.capitoloMassivaUscitaPrevisione = capitoloMassivaUscitaPrevisione;
	}
}

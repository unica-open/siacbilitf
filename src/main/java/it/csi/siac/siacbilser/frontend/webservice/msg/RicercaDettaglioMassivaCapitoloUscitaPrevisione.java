/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaSinteticaCapitoloUPrev;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaSinteticaCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioMassivaCapitoloUscitaPrevisione extends ServiceRequest {

	private Ente ente;
	private RicercaSinteticaCapitoloUPrev ricercaSinteticaCapitoloUPrev;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaSinteticaCapitoloUPrev getRicercaSinteticaCapitoloUPrev() {
		return ricercaSinteticaCapitoloUPrev;
	}

	public void setRicercaSinteticaCapitoloUPrev(
			RicercaSinteticaCapitoloUPrev ricercaSinteticaCapitoloUPrev) {
		this.ricercaSinteticaCapitoloUPrev = ricercaSinteticaCapitoloUPrev;
	}
}

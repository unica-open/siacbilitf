/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaSinteticaCapitoloEGest;
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
public class RicercaDettaglioMassivaCapitoloEntrataGestione extends ServiceRequest {

	private Ente ente;
	private RicercaSinteticaCapitoloEGest ricercaSinteticaCapitoloEGest;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaSinteticaCapitoloEGest getRicercaSinteticaCapitoloEGest() {
		return ricercaSinteticaCapitoloEGest;
	}

	public void setRicercaSinteticaCapitoloEGest(
			RicercaSinteticaCapitoloEGest ricercaSinteticaCapitoloEGest) {
		this.ricercaSinteticaCapitoloEGest = ricercaSinteticaCapitoloEGest;
	}
}

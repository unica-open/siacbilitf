/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaSinteticaCapitoloUGest;
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
public class RicercaDettaglioMassivaCapitoloUscitaGestione extends ServiceRequest {

	private Ente ente;
	private RicercaSinteticaCapitoloUGest ricercaSinteticaCapitoloUGest;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaSinteticaCapitoloUGest getRicercaSinteticaCapitoloUGest() {
		return ricercaSinteticaCapitoloUGest;
	}

	public void setRicercaSinteticaCapitoloUGest(
			RicercaSinteticaCapitoloUGest ricercaSinteticaCapitoloUGest) {
		this.ricercaSinteticaCapitoloUGest = ricercaSinteticaCapitoloUGest;
	}
}

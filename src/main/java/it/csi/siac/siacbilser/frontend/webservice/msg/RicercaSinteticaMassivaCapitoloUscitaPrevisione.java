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
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Richiesta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaSinteticaCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaMassivaCapitoloUscitaPrevisione extends ServiceRequest {

	private Ente ente;
	private RicercaSinteticaCapitoloUPrev ricercaSinteticaCapitoloUPrev;
	private ParametriPaginazione parametriPaginazione;

	private int paginaRemote = 0;
	private int posizionePaginaRemote = 0;

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

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public int getPaginaRemote() {
		return paginaRemote;
	}

	public void setPaginaRemote(int paginaRemote) {
		this.paginaRemote = paginaRemote;
	}

	public int getPosizionePaginaRemote() {
		return posizionePaginaRemote;
	}

	public void setPosizionePaginaRemote(int posizionePaginaRemote) {
		this.posizionePaginaRemote = posizionePaginaRemote;
	}
	
	
}

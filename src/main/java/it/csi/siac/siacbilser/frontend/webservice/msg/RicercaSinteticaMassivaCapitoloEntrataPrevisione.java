/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaSinteticaCapitoloEPrev;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Richiesta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaSinteticaCapitoloEntrataPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaMassivaCapitoloEntrataPrevisione extends ServiceRequest {

	private Ente ente;
	private RicercaSinteticaCapitoloEPrev ricercaSinteticaCapitoloEPrev;
	private ParametriPaginazione parametriPaginazione;

	private int paginaRemote = 0;
	private int posizionePaginaRemote = 0;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaSinteticaCapitoloEPrev getRicercaSinteticaCapitoloEPrev() {
		return ricercaSinteticaCapitoloEPrev;
	}

	public void setRicercaSinteticaCapitoloEPrev(
			RicercaSinteticaCapitoloEPrev ricercaSinteticaCapitoloEPrev) {
		this.ricercaSinteticaCapitoloEPrev = ricercaSinteticaCapitoloEPrev;
	}

	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
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

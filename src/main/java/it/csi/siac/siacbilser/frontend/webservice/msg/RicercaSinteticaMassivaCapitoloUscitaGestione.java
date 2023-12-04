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
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Richiesta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaSinteticaCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaMassivaCapitoloUscitaGestione extends ServiceRequest {

	private Ente ente;
	private RicercaSinteticaCapitoloUGest ricercaSinteticaCapitoloUGest;
	private ParametriPaginazione parametriPaginazione;

	private int paginaRemote = 0;
	private int posizionePaginaRemote = 0;

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

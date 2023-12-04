/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Richiesta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaVariazioniCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioniCapitoloUscitaGestione extends ServiceRequest {

//	private Ente ente;
//	private Bilancio bilancio;
	private CapitoloUscitaGestione capitoloUscitaGest;
	
	private ParametriPaginazione parametriPaginazione;

	public CapitoloUscitaGestione getCapitoloUscitaGest() {
		return capitoloUscitaGest;
	}

	public void setCapitoloUscitaGest(CapitoloUscitaGestione capitoloUscitaGest) {
		this.capitoloUscitaGest = capitoloUscitaGest;
	}

//	public Ente getEnte() {
//		return ente;
//	}
//
//	public void setEnte(Ente ente) {
//		this.ente = ente;
//	}
//
//	public Bilancio getBilancio() {
//		return bilancio;
//	}
//
//	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
//	}

	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	
}

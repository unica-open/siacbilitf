/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import it.csi.siac.siacattser.model.AttoAmministrativoModelDetail;
import it.csi.siac.siacattser.model.ric.RicercaAtti;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Request al servizio di ricerca sintetica del provvedimento
 */
public class RicercaSinteticaProvvedimento extends ServiceRequest {
	private Ente ente;
	// parametri ricerca
	private RicercaAtti ricercaAtti;
	
	private ParametriPaginazione parametriPaginazione;
	private AttoAmministrativoModelDetail[] attoAmministrativoModelDetail;
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the ricercaAtti
	 */
	public RicercaAtti getRicercaAtti() {
		return ricercaAtti;
	}
	/**
	 * @param ricercaAtti the ricercaAtti to set
	 */
	public void setRicercaAtti(RicercaAtti ricercaAtti) {
		this.ricercaAtti = ricercaAtti;
	}
	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}
	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	/**
	 * @return the attoAmministrativoModelDetail
	 */
	public AttoAmministrativoModelDetail[] getAttoAmministrativoModelDetail() {
		return attoAmministrativoModelDetail;
	}
	/**
	 * @param attoAmministrativoModelDetail the attoAmministrativoModelDetail to set
	 */
	public void setAttoAmministrativoModelDetail(AttoAmministrativoModelDetail... attoAmministrativoModelDetail) {
		this.attoAmministrativoModelDetail = attoAmministrativoModelDetail;
	}

}

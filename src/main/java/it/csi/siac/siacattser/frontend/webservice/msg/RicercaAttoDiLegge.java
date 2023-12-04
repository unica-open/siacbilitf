/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.ric.RicercaLeggi;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Request al servizio di ricerca atto di legge
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaAttoDiLegge extends ServiceRequest {
	
	private Ente ente;
	private RicercaLeggi attoDiLegge;
	private ParametriPaginazione parametriPaginazione;
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
	 * @return the attoDiLegge
	 */
	public RicercaLeggi getAttoDiLegge() {
		return attoDiLegge;
	}
	/**
	 * @param attoDiLegge the attoDiLegge to set
	 */
	public void setAttoDiLegge(RicercaLeggi attoDiLegge) {
		this.attoDiLegge = attoDiLegge;
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
	

}

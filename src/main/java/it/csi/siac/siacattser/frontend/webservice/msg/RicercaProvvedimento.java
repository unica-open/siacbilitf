/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.ric.RicercaAtti;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

/**
 * Request al servizio di ricerca provvedimento
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaProvvedimento extends ServiceRequest {
	
	private Ente ente;
	// parametri ricerca
	private RicercaAtti ricercaAtti;
	
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
	
	
}

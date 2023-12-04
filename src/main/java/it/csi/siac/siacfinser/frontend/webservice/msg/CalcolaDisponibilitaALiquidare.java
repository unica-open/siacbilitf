/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;



import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;

/**
 *  
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CalcolaDisponibilitaALiquidare extends ServiceRequest {
	
	private Ente ente;
	private Liquidazione liquidazione;
	private Bilancio bilancio;
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
	 * @return the liquidazione
	 */
	public Liquidazione getLiquidazione() {
		return liquidazione;
	}
	/**
	 * @param liquidazione the liquidazione to set
	 */
	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	

}
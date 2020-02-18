/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaLiquidazioneK;

/**
 * Richiesta al metodo FIN.LiquidazioneService.ricercaLiquidazionePerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaLiquidazionePerChiave extends ServiceRequest {
	
	private Ente ente;
	private RicercaLiquidazioneK pRicercaLiquidazioneK;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public RicercaLiquidazioneK getpRicercaLiquidazioneK() {
		return pRicercaLiquidazioneK;
	}
	public void setpRicercaLiquidazioneK(RicercaLiquidazioneK pRicercaLiquidazioneK) {
		this.pRicercaLiquidazioneK = pRicercaLiquidazioneK;
	}

	
} 
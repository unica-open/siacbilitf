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
import it.csi.siac.siacfinser.model.ric.RicercaProvvisorioDiCassaK;

/**
 * Richiesta al metodo FIN.LiquidazioneService.ricercaLiquidazionePerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaProvvisorioDiCassaPerChiave extends ServiceRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	private RicercaProvvisorioDiCassaK pRicercaProvvisorioK;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public void setpRicercaLiquidazioneK(RicercaProvvisorioDiCassaK pRicercaProvvisorioK) {
		this.setpRicercaProvvisorioK(pRicercaProvvisorioK);
	}
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	public RicercaProvvisorioDiCassaK getpRicercaProvvisorioK() {
		return pRicercaProvvisorioK;
	}
	public void setpRicercaProvvisorioK(RicercaProvvisorioDiCassaK pRicercaProvvisorioK) {
		this.pRicercaProvvisorioK = pRicercaProvvisorioK;
	}

	
} 
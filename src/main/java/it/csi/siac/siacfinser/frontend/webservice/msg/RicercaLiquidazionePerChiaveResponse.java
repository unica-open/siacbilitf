/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;

/**
 * Risposta al metodo FIN.LiquidazioneService.ricercaLiquidazionePerChiave()
 * 
 * @author ccivilla
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaLiquidazionePerChiaveResponse extends ServiceResponse {

	private Liquidazione liquidazione;
	private Bilancio bilancio;
	private Impegno impegno;
	private CapitoloUscitaGestione capitoloUscitaGestione;

	public Liquidazione getLiquidazione() {
		return liquidazione;
	}

	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	public void setCapitoloUscitaGestione(
			CapitoloUscitaGestione capitoloUscitaGestione) {
		this.capitoloUscitaGestione = capitoloUscitaGestione;
	}
	
	
}

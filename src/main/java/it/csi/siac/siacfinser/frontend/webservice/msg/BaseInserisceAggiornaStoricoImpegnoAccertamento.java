/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.model.StoricoImpegnoAccertamento;

/**
 * Richiesta al metodo FIN.MovimentoGestioneService.inserisceImpegni()
 * 
 * @author 
 * 
 */
public class BaseInserisceAggiornaStoricoImpegnoAccertamento extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private StoricoImpegnoAccertamento storicoImpegnoAccertamento;
	
	
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
	/**
	 * @return the storicoImpegniAccertamenti
	 */
	public StoricoImpegnoAccertamento getStoricoImpegnoAccertamento() {
		return storicoImpegnoAccertamento;
	}
	/**
	 * @param storicoImpegniAccertamenti the storicoImpegniAccertamenti to set
	 */
	public void setStoricoImpegnoAccertamento(StoricoImpegnoAccertamento storicoImpegniAccertamenti) {
		this.storicoImpegnoAccertamento = storicoImpegniAccertamenti;
	}
}
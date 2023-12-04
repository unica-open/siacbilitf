/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.model.StoricoImpegnoAccertamento;

/**
 * Risposta al metodo FIN.MovimentoGestioneService.inserisceImpegni()
 * 
 * @author 
 * 
 */
public class BaseInserisceAggiornaStoricoImpegnoAccertamentoResponse extends ServiceResponse {

	private StoricoImpegnoAccertamento storicoImpegnoAccertamento;

	/**
	 * @return the storicoImpegnoAccertamento
	 */
	public StoricoImpegnoAccertamento getStoricoImpegnoAccertamento() {
		return storicoImpegnoAccertamento;
	}

	/**
	 * @param storicoImpegnoAccertamento the storicoImpegnoAccertamento to set
	 */
	public void setStoricoImpegnoAccertamento(StoricoImpegnoAccertamento storicoImpegnoAccertamento) {
		this.storicoImpegnoAccertamento = storicoImpegnoAccertamento;
	}
	
	
}

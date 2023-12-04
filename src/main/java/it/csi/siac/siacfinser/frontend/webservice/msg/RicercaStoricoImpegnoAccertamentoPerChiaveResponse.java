/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.StoricoImpegnoAccertamento;

/**
 * Richiesta al metodo FIN.MovimentoGestioneService.inserisceImpegni()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaStoricoImpegnoAccertamentoPerChiaveResponse extends ServiceResponse {
	
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
/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.StoricoImpegnoAccertamento;

/**
 * Richiesta al metodo FIN.MovimentoGestioneService.inserisceImpegni()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class EliminaStoricoImpegnoAccertamento extends ServiceRequest {
	
	private StoricoImpegnoAccertamento storicoImpegnoAccertamento;
	
	private Bilancio bilancio;

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
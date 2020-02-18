/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.StoricoImpegnoAccertamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaStoricoImpegnoAccertamentoResponse extends PaginazioneResponse {
	
	private Ente ente;
	private List<StoricoImpegnoAccertamento> elencoStoricoImpegnoAccertamento;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the elencoStoricoImpegnoAccertamento
	 */
	public List<StoricoImpegnoAccertamento> getElencoStoricoImpegnoAccertamento() {
		return elencoStoricoImpegnoAccertamento;
	}
	/**
	 * @param elencoStoricoImpegnoAccertamento the elencoStoricoImpegnoAccertamento to set
	 */
	public void setElencoStoricoImpegnoAccertamento(List<StoricoImpegnoAccertamento> elencoStoricoImpegnoAccertamento) {
		this.elencoStoricoImpegnoAccertamento = elencoStoricoImpegnoAccertamento;
	}
	
	
	
	
}

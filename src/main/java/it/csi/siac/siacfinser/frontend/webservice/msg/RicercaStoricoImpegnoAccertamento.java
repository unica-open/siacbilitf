/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaStoricoImpegnoAccertamento;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaStoricoImpegnoAccertamento extends PaginazioneRequest {
	
	private Ente ente;
	private ParametroRicercaStoricoImpegnoAccertamento parametroRicercaStoricoImpegnoAccertamento;
	
	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * @return the parametroRicercaStoricoImpegnoAccertamento
	 */
	public ParametroRicercaStoricoImpegnoAccertamento getParametroRicercaStoricoImpegnoAccertamento() {
		return parametroRicercaStoricoImpegnoAccertamento;
	}

	/**
	 * @param parametroRicercaStoricoImpegnoAccertamento the parametroRicercaStoricoImpegnoAccertamento to set
	 */
	public void setParametroRicercaStoricoImpegnoAccertamento(
			ParametroRicercaStoricoImpegnoAccertamento parametroRicercaStoricoImpegnoAccertamento) {
		this.parametroRicercaStoricoImpegnoAccertamento = parametroRicercaStoricoImpegnoAccertamento;
	}
	
}

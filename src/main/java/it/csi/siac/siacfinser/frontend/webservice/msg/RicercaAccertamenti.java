/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaAccertamento;

/**
 * Richiesta al metodo FIN.AccertamentoService.ricercaAccertamenti()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAccertamenti extends PaginazioneRequest {

	private RicercaAccertamento pRicercaAccertamento;

	public RicercaAccertamento getpRicercaAccertamento() {
		return pRicercaAccertamento;
	}

	public void setpRicercaAccertamento(RicercaAccertamento pRicercaAccertamento) {
		this.pRicercaAccertamento = pRicercaAccertamento;
	}

}

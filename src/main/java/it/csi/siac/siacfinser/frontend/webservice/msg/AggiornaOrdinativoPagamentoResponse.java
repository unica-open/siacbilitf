/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaOrdinativoPagamentoResponse extends ServiceResponse {
	
	private OrdinativoPagamento ordinativoPagamentoAggiornato;

	public OrdinativoPagamento getOrdinativoPagamentoAggiornato() {
		return ordinativoPagamentoAggiornato;
	}

	public void setOrdinativoPagamentoAggiornato(
			OrdinativoPagamento ordinativoPagamentoAggiornato) {
		this.ordinativoPagamentoAggiornato = ordinativoPagamentoAggiornato;
	}
}

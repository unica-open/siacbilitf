/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;

/**
 * Risposta al metodo FIN.OrdinativoService.ricercaOrdinativoPagamentoPerChiave()
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaOrdinativoPagamentoPerChiaveResponse extends RicercaAttributiMovimentoGestioneResponse {

	private OrdinativoPagamento ordinativoPagamento;

	public OrdinativoPagamento getOrdinativoPagamento() {
		return ordinativoPagamento;
	}

	public void setOrdinativoPagamento(OrdinativoPagamento ordinativoPagamento) {
		this.ordinativoPagamento = ordinativoPagamento;
	} 	
}

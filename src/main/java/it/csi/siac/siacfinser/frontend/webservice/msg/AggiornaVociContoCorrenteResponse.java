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
public class AggiornaVociContoCorrenteResponse extends ServiceResponse {
	
	private OrdinativoPagamento ordinativoPagamentoInserito;

	public OrdinativoPagamento getOrdinativoPagamentoInserito() {
		return ordinativoPagamentoInserito;
	}

	public void setOrdinativoPagamentoInserito(
			OrdinativoPagamento ordinativoPagamentoInserito) {
		this.ordinativoPagamentoInserito = ordinativoPagamentoInserito;
	}

	
}

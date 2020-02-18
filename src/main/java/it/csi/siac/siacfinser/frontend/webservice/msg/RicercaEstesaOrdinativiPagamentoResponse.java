/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.RicercaEstesaOrdinativoDiPagamento;

/**
 * Risposta al metodo FIN.OrdinativoService.ricercaEstesaOrdinativiPagamento()
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaEstesaOrdinativiPagamentoResponse extends PaginazioneResponse {

	private List<RicercaEstesaOrdinativoDiPagamento> ordinativiPagamento = new ArrayList<RicercaEstesaOrdinativoDiPagamento>();

	/**
	 * @return the ordinativiPagamento
	 */
	public List<RicercaEstesaOrdinativoDiPagamento> getOrdinativiPagamento() {
		return ordinativiPagamento;
	}

	/**
	 * @param ordinativiPagamento the ordinativiPagamento to set
	 */
	public void setOrdinativiPagamento(
			List<RicercaEstesaOrdinativoDiPagamento> ordinativiPagamento) {
		this.ordinativiPagamento = ordinativiPagamento;
	}


}

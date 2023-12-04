/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;

/**
 * Parametri per la ricerca dell'Ordinativo Pagamento per chiave
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaOrdinativoPagamentoK extends RicercaOrdinativoK  {

    	private static final long serialVersionUID = -6576315117619313331L;
	
    	private OrdinativoPagamento ordinativoPagamento;
	
		public OrdinativoPagamento getOrdinativoPagamento() {
		    return ordinativoPagamento;
		}
	
		public void setOrdinativoPagamento(OrdinativoPagamento ordinativoPagamento) {
		    this.ordinativoPagamento = ordinativoPagamento;
		}
}

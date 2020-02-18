/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.FondiDubbiaEsegibilitaService.aggiornaFondoDubbiaEsegibilita()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaFondoDubbiaEsigibilitaResponse extends ServiceResponse {

	private AccantonamentoFondiDubbiaEsigibilita accantonamentoFondiDubbiaEsigibilita;

	/**
	 * @return the accantonamentoFondiDubbiaEsigibilita
	 */
	public AccantonamentoFondiDubbiaEsigibilita getAccantonamentoFondiDubbiaEsigibilita() {
		return accantonamentoFondiDubbiaEsigibilita;
	}

	/**
	 * @param accantonamentoFondiDubbiaEsigibilita the accantonamentoFondiDubbiaEsigibilita to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilita(AccantonamentoFondiDubbiaEsigibilita accantonamentoFondiDubbiaEsigibilita) {
		this.accantonamentoFondiDubbiaEsigibilita = accantonamentoFondiDubbiaEsigibilita;
	}

}

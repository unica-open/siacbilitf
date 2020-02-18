/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.FondiDubbiaEsegibilitaService.eliminaFondoDubbiaEsegibilita()
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class EliminaFondoDubbiaEsigibilitaRendicontoResponse extends ServiceResponse {

	private AccantonamentoFondiDubbiaEsigibilitaRendiconto accantonamentoFondiDubbiaEsigibilitaRendiconto;

	/**
	 * @return the accantonamentoFondiDubbiaEsigibilitaRendiconto
	 */
	public AccantonamentoFondiDubbiaEsigibilitaRendiconto getAccantonamentoFondiDubbiaEsigibilitaRendiconto() {
		return accantonamentoFondiDubbiaEsigibilitaRendiconto;
	}

	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaRendiconto the accantonamentoFondiDubbiaEsigibilitaRendiconto to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaRendiconto(AccantonamentoFondiDubbiaEsigibilitaRendiconto accantonamentoFondiDubbiaEsigibilitaRendiconto) {
		this.accantonamentoFondiDubbiaEsigibilitaRendiconto = accantonamentoFondiDubbiaEsigibilitaRendiconto;
	}

}

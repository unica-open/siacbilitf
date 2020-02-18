/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail;
import it.csi.siac.siaccorser.model.Bilancio;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsigibilitaRendicontoService.ricercaSinteticaFondiDubbiaEsigibilitaRendiconto()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaFondiDubbiaEsigibilitaRendiconto extends RicercaSinteticaBaseRequest {

	private Bilancio bilancio;
	private AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail[] accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails;
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails
	 */
	public AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail[] getAccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails() {
		return accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails;
	}
	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails the accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails(AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail... accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails) {
		this.accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails = accantonamentoFondiDubbiaEsigibilitaRendicontoModelDetails;
	}
	

}

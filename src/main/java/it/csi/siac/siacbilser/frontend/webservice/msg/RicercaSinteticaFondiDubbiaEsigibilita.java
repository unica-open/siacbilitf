/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AccantonamentoFondiDubbiaEsigibilitaModelDetail;
import it.csi.siac.siaccorser.model.Bilancio;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsigibilitaService.ricercaSinteticaFondiDubbiaEsigibilita()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaFondiDubbiaEsigibilita extends RicercaSinteticaBaseRequest {

	private Bilancio bilancio;
	private AccantonamentoFondiDubbiaEsigibilitaModelDetail[] accantonamentoFondiDubbiaEsigibilitaModelDetails;
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
	 * @return the accantonamentoFondiDubbiaEsigibilitaModelDetails
	 */
	public AccantonamentoFondiDubbiaEsigibilitaModelDetail[] getAccantonamentoFondiDubbiaEsigibilitaModelDetails() {
		return accantonamentoFondiDubbiaEsigibilitaModelDetails;
	}
	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaModelDetails the accantonamentoFondiDubbiaEsigibilitaModelDetails to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaModelDetails(AccantonamentoFondiDubbiaEsigibilitaModelDetail... accantonamentoFondiDubbiaEsigibilitaModelDetails) {
		this.accantonamentoFondiDubbiaEsigibilitaModelDetails = accantonamentoFondiDubbiaEsigibilitaModelDetails;
	}
	

}

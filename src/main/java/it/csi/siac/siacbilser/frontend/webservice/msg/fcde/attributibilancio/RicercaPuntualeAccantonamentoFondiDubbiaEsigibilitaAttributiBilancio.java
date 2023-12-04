/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.model.fcde.modeldetail.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetail;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.FondiDubbiaEsigibilitaService.ricercaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio()
 * 
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio extends ServiceRequest {

	private AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	private AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetail[] accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails;
	/**
	 * @return the accantonamentoFondiDubbiaEsigibilitaAttributiBilancio
	 */
	public AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio getAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio() {
		return this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}
	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaAttributiBilancio the accantonamentoFondiDubbiaEsigibilitaAttributiBilancio to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio) {
		this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancio = accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}
	/**
	 * @return the accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails
	 */
	public AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetail[] getAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails() {
		return this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails;
	}
	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails the accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails(AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetail... accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails) {
		this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails = accantonamentoFondiDubbiaEsigibilitaAttributiBilancioModelDetails;
	}

}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaSpesaResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Risposta al metodo FIN.CartaContabileService.ricercaCartaContabilePerChiave()
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaDocumentiCartaResponse extends PaginazioneResponse {

	
	private RicercaQuotaSpesaResponse responseQuoteSpesa;

	public RicercaQuotaSpesaResponse getResponseQuoteSpesa() {
		return responseQuoteSpesa;
	}

	public void setResponseQuoteSpesa(RicercaQuotaSpesaResponse responseQuoteSpesa) {
		this.responseQuoteSpesa = responseQuoteSpesa;
	}
	
}

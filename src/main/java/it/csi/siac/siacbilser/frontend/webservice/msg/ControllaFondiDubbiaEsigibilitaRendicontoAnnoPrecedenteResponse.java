/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al controllo sui fondi a dubbia e difficile esazione dell'anno precedente a quello di bilancio
 * @author Marchino Alessandro
 */
public class ControllaFondiDubbiaEsigibilitaRendicontoAnnoPrecedenteResponse extends ServiceResponse {

	private Long numeroFondiAnnoPrecedente;

	/**
	 * @return the numeroFondiAnnoPrecedente
	 */
	public Long getNumeroFondiAnnoPrecedente() {
		return numeroFondiAnnoPrecedente;
	}

	/**
	 * @param numeroFondiAnnoPrecedente the numeroFondiAnnoPrecedente to set
	 */
	public void setNumeroFondiAnnoPrecedente(Long numeroFondiAnnoPrecedente) {
		this.numeroFondiAnnoPrecedente = numeroFondiAnnoPrecedente;
	}
	
}

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
public class ControllaFondiDubbiaEsigibilitaRendicontoAnnoCorrenteResponse extends ServiceResponse {

	private Long numeroFondiAnnoCorrente;

	/**
	 * @return the numeroFondiAnnoPrecedente
	 */
	public Long getNumeroFondiAnnoCorrente() {
		return numeroFondiAnnoCorrente;
	}

	/**
	 * @param numeroFondiAnnoCorrente the numeroFondiAnnoPrecedente to set
	 */
	public void setNumeroFondiAnnoCorrente(Long numeroFondiAnnoCorrente) {
		this.numeroFondiAnnoCorrente = numeroFondiAnnoCorrente;
	}
	
}

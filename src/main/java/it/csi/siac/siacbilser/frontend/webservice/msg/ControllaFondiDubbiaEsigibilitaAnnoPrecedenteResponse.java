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
public class ControllaFondiDubbiaEsigibilitaAnnoPrecedenteResponse extends ServiceResponse {

	private Long numeroFondiAnnoPrecedente;
	// SIAC-5481
	private Long numeroFondiGestioneAnnoPrecedente;

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

	/**
	 * @return the numeroFondiGestioneAnnoPrecedente
	 */
	public Long getNumeroFondiGestioneAnnoPrecedente() {
		return numeroFondiGestioneAnnoPrecedente;
	}

	/**
	 * @param numeroFondiGestioneAnnoPrecedente the numeroFondiGestioneAnnoPrecedente to set
	 */
	public void setNumeroFondiGestioneAnnoPrecedente(Long numeroFondiGestioneAnnoPrecedente) {
		this.numeroFondiGestioneAnnoPrecedente = numeroFondiGestioneAnnoPrecedente;
	}
	
}

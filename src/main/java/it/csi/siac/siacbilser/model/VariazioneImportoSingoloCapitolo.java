/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;

/**
 * VariazioneImportoSingoloCapitolo
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VariazioneImportoSingoloCapitolo extends VariazioneDiBilancio {

	private static final long serialVersionUID = 861361995172032558L;
	
	private ApplicazioneVariazione applicazioneVariazione;
	private AttoAmministrativo attoAmministrativo;
	//SIAC-4737
	private AttoAmministrativo attoAmministrativoVariazioneDiBilancio;
	
	private DettaglioVariazioneImportoCapitolo dettaglioVariazioneImporto;

	// Filtro
	private Capitolo<?, ?> capitolo;

	/**
	 * @return the dettaglioVariazioneImporto
	 */
	public DettaglioVariazioneImportoCapitolo getDettaglioVariazioneImporto() {
		return dettaglioVariazioneImporto;
	}

	/**
	 * @param dettaglioVariazioneImporto the dettaglioVariazioneImporto to set
	 */
	public void setDettaglioVariazioneImporto(DettaglioVariazioneImportoCapitolo dettaglioVariazioneImporto) {
		this.dettaglioVariazioneImporto = dettaglioVariazioneImporto;
	}

	/**
	 * @return the applicazioneVariazione
	 */
	public ApplicazioneVariazione getApplicazioneVariazione() {
		return applicazioneVariazione;
	}

	/**
	 * @param applicazioneVariazione the applicazioneVariazione to set
	 */
	public void setApplicazioneVariazione(ApplicazioneVariazione applicazioneVariazione) {
		this.applicazioneVariazione = applicazioneVariazione;
	}

	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}

	/**
	 * Gets the atto amministrativo variazione di bilancio.
	 *
	 * @return the atto amministrativo variazione di bilancio
	 */
	public AttoAmministrativo getAttoAmministrativoVariazioneDiBilancio() {
		return attoAmministrativoVariazioneDiBilancio;
	}

	/**
	 * Sets the atto amministrativo variazione di bilancio.
	 *
	 * @param attoAmministrativoVariazioneDiBilancio the new atto amministrativo variazione di bilancio
	 */
	public void setAttoAmministrativoVariazioneDiBilancio(AttoAmministrativo attoAmministrativoVariazioneDiBilancio) {
		this.attoAmministrativoVariazioneDiBilancio = attoAmministrativoVariazioneDiBilancio;
	}

	/**
	 * @return the capitolo
	 */
	@XmlTransient
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.ConsultazioneEntitaSvcDictionary;
import it.csi.siac.siacconsultazioneentitaser.model.ParametriRicercaCapitoloEntrataConsultabile;
import it.csi.siac.siacconsultazioneentitaser.model.ParametriRicercaCapitoloSpesaConsultabile;
import it.csi.siac.siacconsultazioneentitaser.model.ParametriRicercaEntitaConsultabile;
import it.csi.siac.siacconsultazioneentitaser.model.ParametriRicercaProvvedimentoConsultabile;
import it.csi.siac.siacconsultazioneentitaser.model.ParametriRicercaSoggettoConsultabile;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
/**
 * Classe di request per la ricerca sintetica del capitolo spesa consultabile (cruscottino)
 * @author Elisa Chiari
 * @version 1.0.0 - 08/03/2016
 * */
@XmlType(namespace = ConsultazioneEntitaSvcDictionary.NAMESPACE)
public class RicercaSinteticaEntitaConsultabile extends ServiceRequest {

	private Ente ente;
	
	@XmlElements({
		@XmlElement(name = "parametriRicercaCapitoloSpesaConsultabile", type = ParametriRicercaCapitoloSpesaConsultabile.class),
		@XmlElement(name = "parametriRicercaCapitoloEntrataConsultabile", type = ParametriRicercaCapitoloEntrataConsultabile.class),
		@XmlElement(name = "parametriRicercaProvvedimentoConsultabile", type = ParametriRicercaProvvedimentoConsultabile.class),
		@XmlElement(name = "parametriRicercaSoggettoConsultabile", type = ParametriRicercaSoggettoConsultabile.class),
	})
	private ParametriRicercaEntitaConsultabile parametriRicercaEntitaConsultabile;
	
	private ParametriPaginazione parametriPaginazione;


	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * @return the parametriRicercaEntitaConsultabile
	 */
	@XmlTransient
	public ParametriRicercaEntitaConsultabile getParametriRicercaEntitaConsultabile() {
		return parametriRicercaEntitaConsultabile;
	}

	/**
	 * @param parametriRicercaEntitaConsultabile the parametriRicercaEntitaConsultabile to set
	 */
	public void setParametriRicercaEntitaConsultabile(ParametriRicercaEntitaConsultabile parametriRicercaEntitaConsultabile) {
		this.parametriRicercaEntitaConsultabile = parametriRicercaEntitaConsultabile;
	}

	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfinser.model.MovimentoGestione;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Evento;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;
import it.csi.siac.siacgenser.model.TipoEvento;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaRegistrazioneMovFin extends ServiceRequest {

	private RegistrazioneMovFin registrazioneMovFin;
	private TipoEvento tipoEvento;
	private Evento evento;
	private Evento eventoRegistrazioneIniziale;
	private Integer annoMovimento;
	private String numeroMovimento;
	private Integer numeroSubmovimento;
	private Date dataRegistrazioneDa;
	private Date dataRegistrazioneA;	
	private Integer idDocumento;
	private AttoAmministrativo attoAmministrativo;
	//SIAC-5944
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	//SIAC-5290
	private Capitolo<?,?> capitolo;
	private Soggetto soggetto;
	private MovimentoGestione movimentoGestione;
	private MovimentoGestione submovimentoGestione;
	

	private ParametriPaginazione parametriPaginazione;

	
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
	 * @return the registrazioneMovFin
	 */
	public RegistrazioneMovFin getRegistrazioneMovFin() {
		return registrazioneMovFin;
	}

	/**
	 * @param registrazioneMovFin the registrazioneMovFin to set
	 */
	public void setRegistrazioneMovFin(RegistrazioneMovFin registrazioneMovFin) {
		this.registrazioneMovFin = registrazioneMovFin;
	}
	
	/**
	 * @return the tipoEvento
	 */
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	/**
	 * @param tipoEvento the tipoEvento to set
	 */
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	/**
	 * @return the evento
	 */
	public Evento getEvento() {
		return evento;
	}

	/**
	 * @param evento the evento to set
	 */
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	/**
	 * @return the eventoRegistrazioneIniziale
	 */
	public Evento getEventoRegistrazioneIniziale() {
		return eventoRegistrazioneIniziale;
	}

	/**
	 * @param eventoRegistrazioneIniziale the eventoRegistrazioneIniziale to set
	 */
	public void setEventoRegistrazioneIniziale(Evento eventoRegistrazioneIniziale) {
		this.eventoRegistrazioneIniziale = eventoRegistrazioneIniziale;
	}

	/**
	 * @return the annoMovimento
	 */
	public Integer getAnnoMovimento() {
		return annoMovimento;
	}

	/**
	 * @param annoMovimento the annoMovimento to set
	 */
	public void setAnnoMovimento(Integer annoMovimento) {
		this.annoMovimento = annoMovimento;
	}

	/**
	 * @return the numeroMovimento
	 */
	public String getNumeroMovimento() {
		return numeroMovimento;
	}

	/**
	 * @param numeroMovimento the numeroMovimento to set
	 */
	public void setNumeroMovimento(String numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}

	/**
	 * @return the numeroSubmovimento
	 */
	public Integer getNumeroSubmovimento() {
		return numeroSubmovimento;
	}

	/**
	 * @param numeroSubmovimento the numeroSubmovimento to set
	 */
	public void setNumeroSubmovimento(Integer numeroSubmovimento) {
		this.numeroSubmovimento = numeroSubmovimento;
	}
	
	/**
	 * @return the dataRegistrazioneDa
	 */
	public Date getDataRegistrazioneDa() {
		return dataRegistrazioneDa;
	}

	/**
	 * @param dataRegistrazioneDa the dataRegistrazioneDa to set
	 */
	public void setDataRegistrazioneDa(Date dataRegistrazioneDa) {
		this.dataRegistrazioneDa = dataRegistrazioneDa;
	}

	/**
	 * @return the dataRegistrazioneA
	 */
	public Date getDataRegistrazioneA() {
		return dataRegistrazioneA;
	}

	/**
	 * @param dataRegistrazioneA the dataRegistrazioneA to set
	 */
	public void setDataRegistrazioneA(Date dataRegistrazioneA) {
		this.dataRegistrazioneA = dataRegistrazioneA;
	}

	
	/**
	 * @return the idDocumento
	 */
	public Integer getIdDocumento() {
		return idDocumento;
	}

	/**
	 * @param idDocumento the idDocumento to set
	 */
	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}
	
	/**
	 * Gets the capitolo.
	 *
	 * @return the capitolo
	 */
	public Capitolo<?,?> getCapitolo() {
		return capitolo;
	}

	/**
	 * Sets the capitolo.
	 *
	 * @param capitolo the capitolo
	 */
	public void setCapitolo(Capitolo<?,?> capitolo) {
		this.capitolo = capitolo;
	}

	/**
	 * Gets the soggetto.
	 *
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}

	/**
	 * Sets the soggetto.
	 *
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	/**
	 * Gets the movimento gestione.
	 *
	 * @return the movimentoGestione
	 */
	public MovimentoGestione getMovimentoGestione() {
		return movimentoGestione;
	}

	/**
	 * Sets the movimento gestione.
	 *
	 * @param movimentoGestione the movimentoGestione to set
	 */
	public void setMovimentoGestione(MovimentoGestione movimentoGestione) {
		this.movimentoGestione = movimentoGestione;
	}

	/**
	 * Gets the submovimento gestione.
	 *
	 * @return the submovimentoGestione
	 */
	public MovimentoGestione getSubmovimentoGestione() {
		return submovimentoGestione;
	}

	/**
	 * Sets the submovimento gestione.
	 *
	 * @param submovimentoGestione the submovimentoGestione to set
	 */
	public void setSubmovimentoGestione(MovimentoGestione submovimentoGestione) {
		this.submovimentoGestione = submovimentoGestione;
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
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}

	/**
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}


}

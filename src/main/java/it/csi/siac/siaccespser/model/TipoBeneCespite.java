/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.util.Date;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacgenser.model.CausaleEP;
import it.csi.siac.siacgenser.model.Conto;
import it.csi.siac.siacgenser.model.Evento;

/**
 * The Class TipoBeneCespiti.
 * @author elisa
 * @version 1.0.0 - 31-05-2018
 */
public class TipoBeneCespite extends Codifica {
	
	/** Per la serializzazione */
	private static final long serialVersionUID = -2469820189911408108L;
	
	private CategoriaCespiti categoriaCespiti;
	private Conto contoPatrimoniale;
	private Conto contoAmmortamento;
	private Evento eventoAmmortamento;
	private CausaleEP causaleAmmortamento;
	
	private String testoScritturaAmmortamento;
	
	private Conto contoFondoAmmortamento;
	private Conto contoPlusvalenza;
	private Conto contoMinusValenza;
	
	private Conto contoIncremento;	
	private Evento eventoIncremento;
	private CausaleEP causaleIncremento;
	
	private Conto contoDecremento;
	private Evento eventoDecremento;
	private CausaleEP causaleDecremento;	
	
	private Conto contoAlienazione;
	private Conto contoDonazione;
	
	private Ente ente;
	private Boolean annullato;
	private Date dataInizioValiditaFiltro;
	
	
	/**
	 * @return the annullato
	 */
	public Boolean getAnnullato() {
		return annullato;
	}
	/**
	 * @param annullato the annullato to set
	 */
	public void setAnnullato(Boolean annullato) {
		this.annullato = annullato;
	}
	/**
	 * @return the categoriaCespiti
	 */
	public CategoriaCespiti getCategoriaCespiti() {
		return categoriaCespiti;
	}
	/**
	 * @param categoriaCespiti the categoriaCespiti to set
	 */
	public void setCategoriaCespiti(CategoriaCespiti categoriaCespiti) {
		this.categoriaCespiti = categoriaCespiti;
	}
	/**
	 * @return the testoScritturaAmmortamento
	 */
	public String getTestoScritturaAmmortamento() {
		return testoScritturaAmmortamento;
	}
	/**
	 * @param testoScritturaAmmortamento the testoScritturaAmmortamento to set
	 */
	public void setTestoScritturaAmmortamento(String testoScritturaAmmortamento) {
		this.testoScritturaAmmortamento = testoScritturaAmmortamento;
	}
	/**
	 * @return the eventoAmmortamento
	 */
	public Evento getEventoAmmortamento() {
		return eventoAmmortamento;
	}
	/**
	 * @param eventoAmmortamento the eventoAmmortamento to set
	 */
	public void setEventoAmmortamento(Evento eventoAmmortamento) {
		this.eventoAmmortamento = eventoAmmortamento;
	}
	/**
	 * @return the causaleAmmortamento
	 */
	public CausaleEP getCausaleAmmortamento() {
		return causaleAmmortamento;
	}
	/**
	 * @param causaleAmmortamento the causaleAmmortamento to set
	 */
	public void setCausaleAmmortamento(CausaleEP causaleAmmortamento) {
		this.causaleAmmortamento = causaleAmmortamento;
	}
	/**
	 * @return the contoAmmortamento
	 */
	public Conto getContoAmmortamento() {
		return contoAmmortamento;
	}
	/**
	 * @param contoAmmortamento the contoAmmortamento to set
	 */
	public void setContoAmmortamento(Conto contoAmmortamento) {
		this.contoAmmortamento = contoAmmortamento;
	}
	/**
	 * @return the eventoIncremento
	 */
	public Evento getEventoIncremento() {
		return eventoIncremento;
	}
	/**
	 * @param eventoIncremento the eventoIncremento to set
	 */
	public void setEventoIncremento(Evento eventoIncremento) {
		this.eventoIncremento = eventoIncremento;
	}
	/**
	 * @return the causaleIncremento
	 */
	public CausaleEP getCausaleIncremento() {
		return causaleIncremento;
	}
	/**
	 * @param causaleIncremento the causaleIncremento to set
	 */
	public void setCausaleIncremento(CausaleEP causaleIncremento) {
		this.causaleIncremento = causaleIncremento;
	}
	/**
	 * @return the contoIncremento
	 */
	public Conto getContoIncremento() {
		return contoIncremento;
	}
	/**
	 * @param contoIncremento the contoIncremento to set
	 */
	public void setContoIncremento(Conto contoIncremento) {
		this.contoIncremento = contoIncremento;
	}
	/**
	 * @return the eventoDecremento
	 */
	public Evento getEventoDecremento() {
		return eventoDecremento;
	}
	/**
	 * @param eventoDecremento the eventoDecremento to set
	 */
	public void setEventoDecremento(Evento eventoDecremento) {
		this.eventoDecremento = eventoDecremento;
	}
	/**
	 * @return the causaleDecremento
	 */
	public CausaleEP getCausaleDecremento() {
		return causaleDecremento;
	}
	/**
	 * @param causaleDecremento the causaleDecremento to set
	 */
	public void setCausaleDecremento(CausaleEP causaleDecremento) {
		this.causaleDecremento = causaleDecremento;
	}
	/**
	 * @return the contoDecremento
	 */
	public Conto getContoDecremento() {
		return contoDecremento;
	}
	/**
	 * @param contoDecremento the contoDecremento to set
	 */
	public void setContoDecremento(Conto contoDecremento) {
		this.contoDecremento = contoDecremento;
	}
	/**
	 * @return the contoPatrimoniale
	 */
	public Conto getContoPatrimoniale() {
		return contoPatrimoniale;
	}
	/**
	 * @param contoPatrimoniale the contoPatrimoniale to set
	 */
	public void setContoPatrimoniale(Conto contoPatrimoniale) {
		this.contoPatrimoniale = contoPatrimoniale;
	}
	/**
	 * @return the contoFondoAmmortamento
	 */
	public Conto getContoFondoAmmortamento() {
		return contoFondoAmmortamento;
	}
	/**
	 * @param contoFondoAmmortamento the contoFondoAmmortamento to set
	 */
	public void setContoFondoAmmortamento(Conto contoFondoAmmortamento) {
		this.contoFondoAmmortamento = contoFondoAmmortamento;
	}
	/**
	 * @return the contoPlusvalenza
	 */
	public Conto getContoPlusvalenza() {
		return contoPlusvalenza;
	}
	/**
	 * @param contoPlusvalenza the contoPlusvalenza to set
	 */
	public void setContoPlusvalenza(Conto contoPlusvalenza) {
		this.contoPlusvalenza = contoPlusvalenza;
	}
	/**
	 * @return the contoMinusValenza
	 */
	public Conto getContoMinusValenza() {
		return contoMinusValenza;
	}
	/**
	 * @param contoMinusValenza the contoMinusValenza to set
	 */
	public void setContoMinusValenza(Conto contoMinusValenza) {
		this.contoMinusValenza = contoMinusValenza;
	}
	/**
	 * @return the contoAlienazione
	 */
	public Conto getContoAlienazione() {
		return contoAlienazione;
	}
	/**
	 * @param contoAlienazione the contoAlienazione to set
	 */
	public void setContoAlienazione(Conto contoAlienazione) {
		this.contoAlienazione = contoAlienazione;
	}
	/**
	 * @return the contoDonazione
	 */
	public Conto getContoDonazione() {
		return contoDonazione;
	}
	/**
	 * @param contoDonazione the contoDonazione to set
	 */
	public void setContoDonazione(Conto contoDonazione) {
		this.contoDonazione = contoDonazione;
	}
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
	 * @return the dataInizioValiditaFiltro
	 */
	public Date getDataInizioValiditaFiltro() {
		return dataInizioValiditaFiltro;
	}
	/**
	 * @param dataInizioValiditaFiltro the dataInizioValiditaFiltro to set
	 */
	public void setDataInizioValiditaFiltro(Date dataInizioValiditaFiltro) {
		this.dataInizioValiditaFiltro = dataInizioValiditaFiltro;
	}
	
	
	
}

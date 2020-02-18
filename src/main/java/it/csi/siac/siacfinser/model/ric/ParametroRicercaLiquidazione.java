/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * 
 * Tutti i parametri presenti sono opzionali. Nel caso in cui la ricerca
 * presenti un numero di risultati maggiore di 50 l'applicativo restituira l
 * errore : Ricerca Troppo Ampia, consigliando all utente di rendere piu
 * specifica la propria ricerca
 * 
 * @author Cristian
 * 
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaLiquidazione implements Serializable {

	private static final long serialVersionUID = -1L;

	// discrimina chi chiama la ricerca, ad esempio se cdu liquiadazione o se
	// ordinativo
	private String tipoRicerca;
	private Integer annoBilancio;
	private Integer annoEsercizio;

	// capitolo
	private Integer annoCapitolo;
	private Integer numeroUEB;
	private BigDecimal numeroCapitolo;
	private BigDecimal numeroArticolo;
	private Integer uidCapitolo;

	// impegno
	// private Impegno impegno;
	private Integer annoImpegno;
	private BigDecimal numeroImpegno;
	private BigDecimal numeroSubImpegno;

	// soggetto
	// private Soggetto soggetto;
	private String codiceCreditore;

	// AttoAmministrativo
	// private AttoAmministrativo attoAmministrativo;
	private String tipoProvvedimento;
	private Integer annoProvvedimento;
	private BigDecimal numeroProvvedimento;
	private Integer uidProvvedimento;
	private Integer uidStrutturaAmministrativaProvvedimento;

	// liquidazione
	private Integer annoLiquidazione;
	private BigDecimal numeroLiquidazione;

	// Mutuo
	private BigDecimal numeroMutuo;
	private BigDecimal numeroMutuoImpegno;
	
	//SIAC-5253 itroduciamo la possibilita' di escludere stati precisi:
	private List<String> statiDaEscludere;

	public Integer getAnnoBilancio() {
		return annoBilancio;
	}

	public void setAnnoBilancio(Integer annoBilancio) {
		this.annoBilancio = annoBilancio;
	}

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	public Integer getAnnoCompetenza() {
		return annoCapitolo;
	}

	public void setAnnoCompetenza(Integer annoCompetenza) {
		this.annoCapitolo = annoCompetenza;
	}

	public BigDecimal getNumeroCapitolo() {
		return numeroCapitolo;
	}

	public void setNumeroCapitolo(BigDecimal numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}

	public BigDecimal getNumeroArticolo() {
		return numeroArticolo;
	}

	public void setNumeroArticolo(BigDecimal numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	public BigDecimal getNumeroImpegno() {
		return numeroImpegno;
	}

	public void setNumeroImpegno(BigDecimal numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	public String getCodiceCreditore() {
		return codiceCreditore;
	}

	public void setCodiceCreditore(String codiceCreditore) {
		this.codiceCreditore = codiceCreditore;
	}

	public String getTipoProvvedimento() {
		return tipoProvvedimento;
	}

	public void setTipoProvvedimento(String tipoProvvedimento) {
		this.tipoProvvedimento = tipoProvvedimento;
	}

	public Integer getAnnoProvvedimento() {
		return annoProvvedimento;
	}

	public void setAnnoProvvedimento(Integer annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}

	public BigDecimal getNumeroProvvedimento() {
		return numeroProvvedimento;
	}

	public void setNumeroProvvedimento(BigDecimal numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}

	public Integer getAnnoLiquidazione() {
		return annoLiquidazione;
	}

	public void setAnnoLiquidazione(Integer annoLiquidazione) {
		this.annoLiquidazione = annoLiquidazione;
	}

	public BigDecimal getNumeroLiquidazione() {
		return numeroLiquidazione;
	}

	public void setNumeroLiquidazione(BigDecimal numeroLiquidazione) {
		this.numeroLiquidazione = numeroLiquidazione;
	}

	public BigDecimal getNumeroMutuo() {
		return numeroMutuo;
	}

	public void setNumeroMutuo(BigDecimal numeroMutuo) {
		this.numeroMutuo = numeroMutuo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getNumeroUEB() {
		return numeroUEB;
	}

	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}

	public Integer getUidCapitolo() {
		return uidCapitolo;
	}

	public void setUidCapitolo(Integer uidCapitolo) {
		this.uidCapitolo = uidCapitolo;
	}

	public Integer getUidProvvedimento() {
		return uidProvvedimento;
	}

	public void setUidProvvedimento(Integer uidProvvedimento) {
		this.uidProvvedimento = uidProvvedimento;
	}

	public Integer getAnnoCapitolo() {
		return annoCapitolo;
	}

	public void setAnnoCapitolo(Integer annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}

	public BigDecimal getNumeroMutuoImpegno() {
		return numeroMutuoImpegno;
	}

	public void setNumeroMutuoImpegno(BigDecimal numeroMutuoImpegno) {
		this.numeroMutuoImpegno = numeroMutuoImpegno;
	}

	public BigDecimal getNumeroSubImpegno() {
		return numeroSubImpegno;
	}

	public void setNumeroSubImpegno(BigDecimal numeroSubImpegno) {
		this.numeroSubImpegno = numeroSubImpegno;
	}

	/**
	 * @return the tipoRicerca
	 */
	public String getTipoRicerca() {
		return tipoRicerca;
	}

	/**
	 * @param tipoRicerca
	 *            the tipoRicerca to set
	 */
	public void setTipoRicerca(String tipoRicerca) {
		this.tipoRicerca = tipoRicerca;
	}

	public Integer getUidStrutturaAmministrativaProvvedimento() {
		return uidStrutturaAmministrativaProvvedimento;
	}

	public void setUidStrutturaAmministrativaProvvedimento(
			Integer uidStrutturaAmministrativaProvvedimento) {
		this.uidStrutturaAmministrativaProvvedimento = uidStrutturaAmministrativaProvvedimento;
	}

	public List<String> getStatiDaEscludere() {
		return statiDaEscludere;
	}

	public void setStatiDaEscludere(List<String> statiDaEscludere) {
		this.statiDaEscludere = statiDaEscludere;
	}

}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;


/**
 * 
 * Tutti i parametri presenti sono opzionali.
 * Nel caso in cui la ricerca presenti un numero di risultati maggiore di 50 l'applicativo restituira l errore : Ricerca Troppo Ampia, consigliando
 * all utente di rendere piu specifica la propria ricerca
 * 
 * @author GianMarco
 *
 */


@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaImpegno implements Serializable{

	
	private static final long serialVersionUID = -7523104820573227426L;

	private Integer annoBilancio;
	private Integer annoEsercizio;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	private String tipoFinanziamento;
	private String elementoPianoDeiConti;
	private Integer annoImpegno;
	private Integer numeroImpegno;
	private String stato;
	private String cig;
	private String cup;
	//codiceProgetto
	private String progetto;
	private String flagDaRiaccertamento;
	private String flagSoggettoDurc;
	private Integer annoProvvedimento;
	private Integer numeroProvvedimento;
	// nella ParametriRicercaMovSubMov era 	private TipoAtto tipoProvvedimento;
	private String tipoProvvedimento;
	// nella ParametriRicercaMovSubMov era private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	private String strutturaAmministrativoContabileDelProvvedimento;
	private String codiceCreditore;
	private boolean competenzaCorrente;
	private boolean competenzaCompetenza;
	private boolean competenzaFuturi;
	private Integer annoImpegnoRiaccertato;
	private Integer numeroImpegnoRiaccertato;
	private Integer annoImpegnoOrigine;
	private Integer numeroImpegnoOrigine;
	private Integer uidCapitolo;
	private Integer uidProvvedimento;
	private String codiceClasseSoggetto;
	
	// usato da ricerca impegni e subimpegni
	private String tipoImpegno;

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}
	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}
	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}
	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}
	public Integer getNumeroUEB() {
		return numeroUEB;
	}
	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}
	public String getTipoFinanziamento() {
		return tipoFinanziamento;
	}
	public void setTipoFinanziamento(String tipoFinanziamento) {
		this.tipoFinanziamento = tipoFinanziamento;
	}
	public String getElementoPianoDeiConti() {
		return elementoPianoDeiConti;
	}
	public void setElementoPianoDeiConti(String elementoPianoDeiConti) {
		this.elementoPianoDeiConti = elementoPianoDeiConti;
	}
	public Integer getNumeroImpegno() {
		return numeroImpegno;
	}
	public void setNumeroImpegno(Integer numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public String getCig() {
		return cig;
	}
	public void setCig(String cig) {
		this.cig = cig;
	}
	public String getCup() {
		return cup;
	}
	public void setCup(String cup) {
		this.cup = cup;
	}
	public String getProgetto() {
		return progetto;
	}
	public void setProgetto(String progetto) {
		this.progetto = progetto;
	}
	public String getFlagDaRiaccertamento() {
		return flagDaRiaccertamento;
	}
	public void setFlagDaRiaccertamento(String flagDaRiaccertamento) {
		this.flagDaRiaccertamento = flagDaRiaccertamento;
	}
	public Integer getNumeroProvvedimento() {
		return numeroProvvedimento;
	}
	public void setNumeroProvvedimento(Integer numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}
	public String getTipoProvvedimento() {
		return tipoProvvedimento;
	}
	public void setTipoProvvedimento(String tipoProvvedimento) {
		this.tipoProvvedimento = tipoProvvedimento;
	}
	public String getStrutturaAmministrativoContabileDelProvvedimento() {
		return strutturaAmministrativoContabileDelProvvedimento;
	}
	public void setStrutturaAmministrativoContabileDelProvvedimento(
			String strutturaAmministrativoContabileDelProvvedimento) {
		this.strutturaAmministrativoContabileDelProvvedimento = strutturaAmministrativoContabileDelProvvedimento;
	}

	public boolean isCompetenzaCorrente() {
		return competenzaCorrente;
	}
	public void setCompetenzaCorrente(boolean competenzaCorrente) {
		this.competenzaCorrente = competenzaCorrente;
	}
	public boolean isCompetenzaCompetenza() {
		return competenzaCompetenza;
	}
	public void setCompetenzaCompetenza(boolean competenzaCompetenza) {
		this.competenzaCompetenza = competenzaCompetenza;
	}
	public boolean isCompetenzaFuturi() {
		return competenzaFuturi;
	}
	public void setCompetenzaFuturi(boolean competenzaFuturi) {
		this.competenzaFuturi = competenzaFuturi;
	}
	public Integer getNumeroImpegnoRiaccertato() {
		return numeroImpegnoRiaccertato;
	}
	public void setNumeroImpegnoRiaccertato(Integer numeroImpegnoRiaccertato) {
		this.numeroImpegnoRiaccertato = numeroImpegnoRiaccertato;
	}
	public Integer getNumeroImpegnoOrigine() {
		return numeroImpegnoOrigine;
	}
	public void setNumeroImpegnoOrigine(Integer numeroImpegnoOrigine) {
		this.numeroImpegnoOrigine = numeroImpegnoOrigine;
	}
	public Integer getAnnoImpegno() {
		return annoImpegno;
	}
	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}
	public Integer getAnnoProvvedimento() {
		return annoProvvedimento;
	}
	public void setAnnoProvvedimento(Integer annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}
	public Integer getAnnoImpegnoRiaccertato() {
		return annoImpegnoRiaccertato;
	}
	public void setAnnoImpegnoRiaccertato(Integer annoImpegnoRiaccertato) {
		this.annoImpegnoRiaccertato = annoImpegnoRiaccertato;
	}
	public Integer getAnnoImpegnoOrigine() {
		return annoImpegnoOrigine;
	}
	public void setAnnoImpegnoOrigine(Integer annoImpegnoOrigine) {
		this.annoImpegnoOrigine = annoImpegnoOrigine;
	}
	public String getCodiceCreditore() {
		return codiceCreditore;
	}
	public void setCodiceCreditore(String codiceCreditore) {
		this.codiceCreditore = codiceCreditore;
	}
	public Integer getAnnoBilancio() {
		return annoBilancio;
	}
	public void setAnnoBilancio(Integer annoBilancio) {
		this.annoBilancio = annoBilancio;
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
	public String getCodiceClasseSoggetto() {
		return codiceClasseSoggetto;
	}
	public void setCodiceClasseSoggetto(String codiceClasseSoggetto) {
		this.codiceClasseSoggetto = codiceClasseSoggetto;
	}
	public String getTipoImpegno() {
		return tipoImpegno;
	}
	public void setTipoImpegno(String tipoImpegno) {
		this.tipoImpegno = tipoImpegno;
	}
	public String getFlagSoggettoDurc() {
		return flagSoggettoDurc;
	}
	public void setFlagSoggettoDurc(String soggettoDurc) {
		this.flagSoggettoDurc = soggettoDurc;
	}

	
	
	
	
	
	
	
	
	
}

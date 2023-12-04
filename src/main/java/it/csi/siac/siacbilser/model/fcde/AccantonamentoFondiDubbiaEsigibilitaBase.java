/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.BilUtilities;
import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * Classe di base per la gestione dell'accantonamento per i fondi di dubbia e difficile esazione
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public abstract class AccantonamentoFondiDubbiaEsigibilitaBase<C extends Capitolo<?, ?>> extends EntitaEnte {

	private static final long serialVersionUID = -8616817912407372199L;
	
	private BigDecimal percentualeAccantonamentoFondi;
	private BigDecimal percentualeAccantonamentoFondi1;
	private BigDecimal percentualeAccantonamentoFondi2;
	private BigDecimal percentualeAccantonamentoFondi3;
	private BigDecimal percentualeAccantonamentoFondi4;

	// SIAC-7858
	private BigDecimal numeratore;
	private BigDecimal numeratore1;
	private BigDecimal numeratore2;
	private BigDecimal numeratore3;
	private BigDecimal numeratore4;
	private BigDecimal denominatore;
	private BigDecimal denominatore1;
	private BigDecimal denominatore2;
	private BigDecimal denominatore3;
	private BigDecimal denominatore4;
	private BigDecimal mediaSempliceTotali;
	private BigDecimal mediaSempliceRapporti;
	private BigDecimal mediaPonderataTotali;
	private BigDecimal mediaPonderataRapporti;
	private BigDecimal mediaUtente;
	private String note;

	// Metadati caricati insieme al dato per ottimizzazione su caricamento massivo
	private BigDecimal numeratoreOriginale;
	private BigDecimal numeratore1Originale;
	private BigDecimal numeratore2Originale;
	private BigDecimal numeratore3Originale;
	private BigDecimal numeratore4Originale;
	private BigDecimal denominatoreOriginale;
	private BigDecimal denominatore1Originale;
	private BigDecimal denominatore2Originale;
	private BigDecimal denominatore3Originale;
	private BigDecimal denominatore4Originale;
	private BigDecimal mediaUtenteOriginale;
	private BigDecimal accantonamentoOriginale;
	private BigDecimal accantonamento1Originale;
	private BigDecimal accantonamento2Originale;
	private TipoMediaAccantonamentoFondiDubbiaEsigibilita tipoMediaPrescelta; // Valutare se sostituire con n campi boolean, one per media; valutare se spostare sull'accantonamento
	
	private AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	
	// Per ottimizzazione
	private BigDecimal stanziamentoCapitolo;
	private BigDecimal stanziamentoCapitolo1;
	private BigDecimal stanziamentoCapitolo2;
	
	//SIAC-8770 e SIAC-8769
	private BigDecimal importoVariazioniSuCapitolo;

	// SIAC-8393 e SIAC-8394
	private BigDecimal accantonamento;
	private BigDecimal accantonamento1;
	private BigDecimal accantonamento2;
	
	/**
	 * @return the percentualeAccantonamentoFondi
	 */
	public BigDecimal getPercentualeAccantonamentoFondi() {
		return percentualeAccantonamentoFondi;
	}
	/**
	 * @param percentualeAccantonamentoFondi the percentualeAccantonamentoFondi to set
	 */
	public void setPercentualeAccantonamentoFondi(BigDecimal percentualeAccantonamentoFondi) {
		this.percentualeAccantonamentoFondi = percentualeAccantonamentoFondi;
	}
	/**
	 * @return the percentualeAccantonamentoFondi1
	 */
	public BigDecimal getPercentualeAccantonamentoFondi1() {
		return percentualeAccantonamentoFondi1;
	}
	/**
	 * @param percentualeAccantonamentoFondi1 the percentualeAccantonamentoFondi1 to set
	 */
	public void setPercentualeAccantonamentoFondi1(BigDecimal percentualeAccantonamentoFondi1) {
		this.percentualeAccantonamentoFondi1 = percentualeAccantonamentoFondi1;
	}
	/**
	 * @return the percentualeAccantonamentoFondi2
	 */
	public BigDecimal getPercentualeAccantonamentoFondi2() {
		return percentualeAccantonamentoFondi2;
	}
	/**
	 * @param percentualeAccantonamentoFondi2 the percentualeAccantonamentoFondi2 to set
	 */
	public void setPercentualeAccantonamentoFondi2(BigDecimal percentualeAccantonamentoFondi2) {
		this.percentualeAccantonamentoFondi2 = percentualeAccantonamentoFondi2;
	}
	/**
	 * @return the percentualeAccantonamentoFondi3
	 */
	public BigDecimal getPercentualeAccantonamentoFondi3() {
		return percentualeAccantonamentoFondi3;
	}
	/**
	 * @param percentualeAccantonamentoFondi3 the percentualeAccantonamentoFondi3 to set
	 */
	public void setPercentualeAccantonamentoFondi3(BigDecimal percentualeAccantonamentoFondi3) {
		this.percentualeAccantonamentoFondi3 = percentualeAccantonamentoFondi3;
	}
	/**
	 * @return the percentualeAccantonamentoFondi4
	 */
	public BigDecimal getPercentualeAccantonamentoFondi4() {
		return percentualeAccantonamentoFondi4;
	}
	/**
	 * @param percentualeAccantonamentoFondi4 the percentualeAccantonamentoFondi4 to set
	 */
	public void setPercentualeAccantonamentoFondi4(BigDecimal percentualeAccantonamentoFondi4) {
		this.percentualeAccantonamentoFondi4 = percentualeAccantonamentoFondi4;
	}
	/**
	 * @return the numeratore
	 */
	public BigDecimal getNumeratore() {
		return this.numeratore;
	}
	/**
	 * @param numeratore the numeratore to set
	 */
	public void setNumeratore(BigDecimal numeratore) {
		this.numeratore = numeratore;
	}
	/**
	 * @return the numeratore1
	 */
	public BigDecimal getNumeratore1() {
		return this.numeratore1;
	}
	/**
	 * @param numeratore1 the numeratore1 to set
	 */
	public void setNumeratore1(BigDecimal numeratore1) {
		this.numeratore1 = numeratore1;
	}
	/**
	 * @return the numeratore2
	 */
	public BigDecimal getNumeratore2() {
		return this.numeratore2;
	}
	/**
	 * @param numeratore2 the numeratore2 to set
	 */
	public void setNumeratore2(BigDecimal numeratore2) {
		this.numeratore2 = numeratore2;
	}
	/**
	 * @return the numeratore3
	 */
	public BigDecimal getNumeratore3() {
		return this.numeratore3;
	}
	/**
	 * @param numeratore3 the numeratore3 to set
	 */
	public void setNumeratore3(BigDecimal numeratore3) {
		this.numeratore3 = numeratore3;
	}
	/**
	 * @return the numeratore4
	 */
	public BigDecimal getNumeratore4() {
		return this.numeratore4;
	}
	/**
	 * @param numeratore4 the numeratore4 to set
	 */
	public void setNumeratore4(BigDecimal numeratore4) {
		this.numeratore4 = numeratore4;
	}
	/**
	 * @return the denominatore
	 */
	public BigDecimal getDenominatore() {
		return this.denominatore;
	}
	/**
	 * @param denominatore the denominatore to set
	 */
	public void setDenominatore(BigDecimal denominatore) {
		this.denominatore = denominatore;
	}
	/**
	 * @return the denominatore1
	 */
	public BigDecimal getDenominatore1() {
		return this.denominatore1;
	}
	/**
	 * @param denominatore1 the denominatore1 to set
	 */
	public void setDenominatore1(BigDecimal denominatore1) {
		this.denominatore1 = denominatore1;
	}
	/**
	 * @return the denominatore2
	 */
	public BigDecimal getDenominatore2() {
		return this.denominatore2;
	}
	/**
	 * @param denominatore2 the denominatore2 to set
	 */
	public void setDenominatore2(BigDecimal denominatore2) {
		this.denominatore2 = denominatore2;
	}
	/**
	 * @return the denominatore3
	 */
	public BigDecimal getDenominatore3() {
		return this.denominatore3;
	}
	/**
	 * @param denominatore3 the denominatore3 to set
	 */
	public void setDenominatore3(BigDecimal denominatore3) {
		this.denominatore3 = denominatore3;
	}
	/**
	 * @return the denominatore4
	 */
	public BigDecimal getDenominatore4() {
		return this.denominatore4;
	}
	/**
	 * @param denominatore4 the denominatore4 to set
	 */
	public void setDenominatore4(BigDecimal denominatore4) {
		this.denominatore4 = denominatore4;
	}
	/**
	 * @return the mediaSempliceTotali
	 */
	public BigDecimal getMediaSempliceTotali() {
		return this.mediaSempliceTotali;
	}
	/**
	 * @param mediaSempliceTotali the mediaSempliceTotali to set
	 */
	public void setMediaSempliceTotali(BigDecimal mediaSempliceTotali) {
		this.mediaSempliceTotali = mediaSempliceTotali;
	}
	/**
	 * @return the mediaSempliceRapporti
	 */
	public BigDecimal getMediaSempliceRapporti() {
		return this.mediaSempliceRapporti;
	}
	/**
	 * @param mediaSempliceRapporti the mediaSempliceRapporti to set
	 */
	public void setMediaSempliceRapporti(BigDecimal mediaSempliceRapporti) {
		this.mediaSempliceRapporti = mediaSempliceRapporti;
	}
	/**
	 * @return the mediaPonderataTotali
	 */
	public BigDecimal getMediaPonderataTotali() {
		return this.mediaPonderataTotali;
	}
	/**
	 * @param mediaPonderataTotali the mediaPonderataTotali to set
	 */
	public void setMediaPonderataTotali(BigDecimal mediaPonderataTotali) {
		this.mediaPonderataTotali = mediaPonderataTotali;
	}
	/**
	 * @return the mediaPonderataRapporti
	 */
	public BigDecimal getMediaPonderataRapporti() {
		return this.mediaPonderataRapporti;
	}
	/**
	 * @param mediaPonderataRapporti the mediaPonderataRapporti to set
	 */
	public void setMediaPonderataRapporti(BigDecimal mediaPonderataRapporti) {
		this.mediaPonderataRapporti = mediaPonderataRapporti;
	}
	/**
	 * @return the mediaUtente
	 */
	public BigDecimal getMediaUtente() {
		return this.mediaUtente;
	}
	/**
	 * @param mediaUtente the mediaUtente to set
	 */
	public void setMediaUtente(BigDecimal mediaUtente) {
		this.mediaUtente = mediaUtente;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return this.note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * @return the tipoAccantonamentoFondiDubbiaEsigiblita
	 */
	public abstract TipoAccantonamentoFondiDubbiaEsigibilita getTipoAccantonamentoFondiDubbiaEsigiblita();
	/**
	 * @param tipoAccantonamentoFondiDubbiaEsigiblita the tipoAccantonamentoFondiDubbiaEsigiblita to set
	 */
	public void setTipoAccantonamentoFondiDubbiaEsigiblita(TipoAccantonamentoFondiDubbiaEsigibilita tipoAccantonamentoFondiDubbiaEsigiblita) {
		// Do nothing. For reflection usage
	}
	/**
	 * @return the numeratoreOriginale
	 */
	public BigDecimal getNumeratoreOriginale() {
		return this.numeratoreOriginale;
	}
	/**
	 * @param numeratoreOriginale the numeratoreOriginale to set
	 */
	public void setNumeratoreOriginale(BigDecimal numeratoreOriginale) {
		this.numeratoreOriginale = numeratoreOriginale;
	}
	/**
	 * @return the numeratore1Originale
	 */
	public BigDecimal getNumeratore1Originale() {
		return this.numeratore1Originale;
	}
	/**
	 * @param numeratore1Originale the numeratore1Originale to set
	 */
	public void setNumeratore1Originale(BigDecimal numeratore1Originale) {
		this.numeratore1Originale = numeratore1Originale;
	}
	/**
	 * @return the numeratore2Originale
	 */
	public BigDecimal getNumeratore2Originale() {
		return this.numeratore2Originale;
	}
	/**
	 * @param numeratore2Originale the numeratore2Originale to set
	 */
	public void setNumeratore2Originale(BigDecimal numeratore2Originale) {
		this.numeratore2Originale = numeratore2Originale;
	}
	/**
	 * @return the numeratore3Originale
	 */
	public BigDecimal getNumeratore3Originale() {
		return this.numeratore3Originale;
	}
	/**
	 * @param numeratore3Originale the numeratore3Originale to set
	 */
	public void setNumeratore3Originale(BigDecimal numeratore3Originale) {
		this.numeratore3Originale = numeratore3Originale;
	}
	/**
	 * @return the numeratore4Originale
	 */
	public BigDecimal getNumeratore4Originale() {
		return this.numeratore4Originale;
	}
	/**
	 * @param numeratore4Originale the numeratore4Originale to set
	 */
	public void setNumeratore4Originale(BigDecimal numeratore4Originale) {
		this.numeratore4Originale = numeratore4Originale;
	}
	/**
	 * @return the denominatoreOriginale
	 */
	public BigDecimal getDenominatoreOriginale() {
		return this.denominatoreOriginale;
	}
	/**
	 * @param denominatoreOriginale the denominatoreOriginale to set
	 */
	public void setDenominatoreOriginale(BigDecimal denominatoreOriginale) {
		this.denominatoreOriginale = denominatoreOriginale;
	}
	/**
	 * @return the denominatore1Originale
	 */
	public BigDecimal getDenominatore1Originale() {
		return this.denominatore1Originale;
	}
	/**
	 * @param denominatore1Originale the denominatore1Originale to set
	 */
	public void setDenominatore1Originale(BigDecimal denominatore1Originale) {
		this.denominatore1Originale = denominatore1Originale;
	}
	/**
	 * @return the denominatore2Originale
	 */
	public BigDecimal getDenominatore2Originale() {
		return this.denominatore2Originale;
	}
	/**
	 * @param denominatore2Originale the denominatore2Originale to set
	 */
	public void setDenominatore2Originale(BigDecimal denominatore2Originale) {
		this.denominatore2Originale = denominatore2Originale;
	}
	/**
	 * @return the denominatore3Originale
	 */
	public BigDecimal getDenominatore3Originale() {
		return this.denominatore3Originale;
	}
	/**
	 * @param denominatore3Originale the denominatore3Originale to set
	 */
	public void setDenominatore3Originale(BigDecimal denominatore3Originale) {
		this.denominatore3Originale = denominatore3Originale;
	}
	/**
	 * @return the denominatore4Originale
	 */
	public BigDecimal getDenominatore4Originale() {
		return this.denominatore4Originale;
	}
	/**
	 * @param denominatore4Originale the denominatore4Originale to set
	 */
	public void setDenominatore4Originale(BigDecimal denominatore4Originale) {
		this.denominatore4Originale = denominatore4Originale;
	}
	/**
	 * @return the mediaUtenteOriginale
	 */
	public BigDecimal getMediaUtenteOriginale() {
		return this.mediaUtenteOriginale;
	}
	/**
	 * @param mediaUtenteOriginale the mediaUtenteOriginale to set
	 */
	public void setMediaUtenteOriginale(BigDecimal mediaUtenteOriginale) {
		this.mediaUtenteOriginale = mediaUtenteOriginale;
	}
	/**
	 * @return the accantonamentoOriginale
	 */
	public BigDecimal getAccantonamentoOriginale() {
		return this.accantonamentoOriginale;
	}
	/**
	 * @param accantonamentoOriginale the accantonamentoOriginale to set
	 */
	public void setAccantonamentoOriginale(BigDecimal accantonamentoOriginale) {
		this.accantonamentoOriginale = accantonamentoOriginale;
	}
	/**
	 * @return the accantonamento1Originale
	 */
	public BigDecimal getAccantonamento1Originale() {
		return this.accantonamento1Originale;
	}
	/**
	 * @param accantonamento1Originale the accantonamento1Originale to set
	 */
	public void setAccantonamento1Originale(BigDecimal accantonamento1Originale) {
		this.accantonamento1Originale = accantonamento1Originale;
	}
	/**
	 * @return the accantonamento2Originale
	 */
	public BigDecimal getAccantonamento2Originale() {
		return this.accantonamento2Originale;
	}
	/**
	 * @param accantonamento2Originale the accantonamento2Originale to set
	 */
	public void setAccantonamento2Originale(BigDecimal accantonamento2Originale) {
		this.accantonamento2Originale = accantonamento2Originale;
	}
	/**
	 * @return the tipoMediaPrescelta
	 */
	public TipoMediaAccantonamentoFondiDubbiaEsigibilita getTipoMediaPrescelta() {
		return this.tipoMediaPrescelta;
	}
	/**
	 * @param tipoMediaPrescelta the tipoMediaPrescelta to set
	 */
	public void setTipoMediaPrescelta(TipoMediaAccantonamentoFondiDubbiaEsigibilita tipoMediaPrescelta) {
		this.tipoMediaPrescelta = tipoMediaPrescelta;
	}
	/**
	 * @return the accantonamentoFondiDubbiaEsigibilitaAttributiBilancio
	 */
	public AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio getAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio() {
		return this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}
	/**
	 * @param accantonamentoFondiDubbiaEsigibilitaAttributiBilancio the accantonamentoFondiDubbiaEsigibilitaAttributiBilancio to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(AccantonamentoFondiDubbiaEsigibilitaAttributiBilancio accantonamentoFondiDubbiaEsigibilitaAttributiBilancio) {
		this.accantonamentoFondiDubbiaEsigibilitaAttributiBilancio = accantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
	}
	/**
	 * @return the stanziamentoCapitolo
	 */
	public BigDecimal getStanziamentoCapitolo() {
		return stanziamentoCapitolo;
	}
	/**
	 * @param stanziamentoCapitolo the stanziamentoCapitolo to set
	 */
	public void setStanziamentoCapitolo(BigDecimal stanziamentoCapitolo) {
		this.stanziamentoCapitolo = stanziamentoCapitolo;
	}
	/**
	 * @return the stanziamentoCapitolo1
	 */
	public BigDecimal getStanziamentoCapitolo1() {
		return stanziamentoCapitolo1;
	}
	/**
	 * @param stanziamentoCapitolo1 the stanziamentoCapitolo1 to set
	 */
	public void setStanziamentoCapitolo1(BigDecimal stanziamentoCapitolo1) {
		this.stanziamentoCapitolo1 = stanziamentoCapitolo1;
	}
	/**
	 * @return the stanziamentoCapitolo2
	 */
	public BigDecimal getStanziamentoCapitolo2() {
		return stanziamentoCapitolo2;
	}
	/**
	 * @param stanziamentoCapitolo2 the stanziamentoCapitolo2 to set
	 */
	public void setStanziamentoCapitolo2(BigDecimal stanziamentoCapitolo2) {
		this.stanziamentoCapitolo2 = stanziamentoCapitolo2;
	}
	
	public BigDecimal getImportoVariazioniSuCapitolo() {
		return importoVariazioniSuCapitolo;
	}
	public void setImportoVariazioniSuCapitolo(BigDecimal importoVariazioniSuCapitolo) {
		this.importoVariazioniSuCapitolo = importoVariazioniSuCapitolo;
	}

	//SIAC-8770 e SIAC-8769
	public BigDecimal getSommaStanziamentoVariazioni() {
		BigDecimal addendo = getStanziamentoCapitolo() != null? getStanziamentoCapitolo() : BigDecimal.ZERO;
		BigDecimal addendo2 = getImportoVariazioniSuCapitolo() != null? getImportoVariazioniSuCapitolo() : BigDecimal.ZERO;
		return addendo.add(addendo2);
	}
	
	
	public boolean isPresentiVariazioni(){
		return getImportoVariazioniSuCapitolo() != null && getImportoVariazioniSuCapitolo().compareTo(BigDecimal.ZERO) != 0;
	}
	
	/**
	 * @return the accantonamento
	 */
	public BigDecimal getAccantonamento() {
		return accantonamento;
	}
	/**
	 * @param accantonamento the accantonamento to set
	 */
	public void setAccantonamento(BigDecimal accantonamento) {
		this.accantonamento = accantonamento;
	}
	/**
	 * @return the accantonamento1
	 */
	public BigDecimal getAccantonamento1() {
		return accantonamento1;
	}
	/**
	 * @param accantonamento1 the accantonamento1 to set
	 */
	public void setAccantonamento1(BigDecimal accantonamento1) {
		this.accantonamento1 = accantonamento1;
	}
	/**
	 * @return the accantonamento2
	 */
	public BigDecimal getAccantonamento2() {
		return accantonamento2;
	}
	/**
	 * @param accantonamento2 the accantonamento2 to set
	 */
	public void setAccantonamento2(BigDecimal accantonamento2) {
		this.accantonamento2 = accantonamento2;
	}
	/**
	 * Estrae il capitolo
	 * @return il capitolo associato
	 */
	public abstract C ottieniCapitolo();
	/**
	 * Imposta il capitolo
	 * @param cap il capitolo
	 */
	public abstract void impostaCapitolo(C cap);
	
	/**
	 * @return the numeratoreModificaUtente
	 */
	@XmlTransient
	public boolean getNumeratoreModificaUtente() {
		return (this.numeratore == null ^ this.numeratoreOriginale == null) || (this.numeratore != null && this.numeratoreOriginale != null && this.numeratore.compareTo(this.numeratoreOriginale) != 0);
	}
	/**
	 * @return the numeratore1ModificaUtente
	 */
	@XmlTransient
	public Boolean getNumeratore1ModificaUtente() {
		return (this.numeratore1 == null ^ this.numeratore1Originale == null) || (this.numeratore1 != null && this.numeratore1Originale != null && this.numeratore1.compareTo(this.numeratore1Originale) != 0);
	}
	/**
	 * @return the numeratore2ModificaUtente
	 */
	@XmlTransient
	public Boolean getNumeratore2ModificaUtente() {
		return (this.numeratore2 == null ^ this.numeratore2Originale == null) || (this.numeratore2 != null && this.numeratore2Originale != null && this.numeratore2.compareTo(this.numeratore2Originale) != 0);
	}
	/**
	 * @return the numeratore3ModificaUtente
	 */
	@XmlTransient
	public Boolean getNumeratore3ModificaUtente() {
		return (this.numeratore3 == null ^ this.numeratore3Originale == null) || (this.numeratore3 != null && this.numeratore3Originale != null && this.numeratore3.compareTo(this.numeratore3Originale) != 0);
	}
	/**
	 * @return the numeratore4ModificaUtente
	 */
	@XmlTransient
	public Boolean getNumeratore4ModificaUtente() {
		return (this.numeratore4 == null ^ this.numeratore4Originale == null) || (this.numeratore4 != null && this.numeratore4Originale != null && this.numeratore4.compareTo(this.numeratore4Originale) != 0);
	}
	/**
	 * @return the denominatoreModificaUtente
	 */
	@XmlTransient
	public Boolean getDenominatoreModificaUtente() {
		return (this.denominatore == null ^ this.denominatoreOriginale == null) || (this.denominatore != null && this.denominatoreOriginale != null && this.denominatore.compareTo(this.denominatoreOriginale) != 0);
	}
	/**
	 * @return the denominatore1ModificaUtente
	 */
	@XmlTransient
	public Boolean getDenominatore1ModificaUtente() {
		return (this.denominatore1 == null ^ this.denominatore1Originale == null) || (this.denominatore1 != null && this.denominatore1Originale != null && this.denominatore1.compareTo(this.denominatore1Originale) != 0);
	}
	/**
	 * @return the denominatore2ModificaUtente
	 */
	@XmlTransient
	public Boolean getDenominatore2ModificaUtente() {
		return (this.denominatore2 == null ^ this.denominatore2Originale == null) || (this.denominatore2 != null && this.denominatore2Originale != null && this.denominatore2.compareTo(this.denominatore2Originale) != 0);
	}
	/**
	 * @return the denominatore3ModificaUtente
	 */
	@XmlTransient
	public Boolean getDenominatore3ModificaUtente() {
		return (this.denominatore3 == null ^ this.denominatore3Originale == null) || (this.denominatore3 != null && this.denominatore3Originale != null && this.denominatore3.compareTo(this.denominatore3Originale) != 0);
	}
	/**
	 * @return the denominatore4ModificaUtente
	 */
	@XmlTransient
	public Boolean getDenominatore4ModificaUtente() {
		return (this.denominatore4 == null ^ this.denominatore4Originale == null) || (this.denominatore4 != null && this.denominatore4Originale != null && this.denominatore4.compareTo(this.denominatore4Originale) != 0);
	}
	/**
	 * @return the mediaUtenteModificaUtente
	 */
	@XmlTransient
	public Boolean getMediaUtenteModificaUtente() {
		return (this.mediaUtente == null ^ this.mediaUtenteOriginale == null) || (this.mediaUtente != null && this.mediaUtenteOriginale != null && this.mediaUtente.compareTo(this.mediaUtenteOriginale) != 0);
	}
	/**
	 * @return the accantonamentoModificaUtente
	 */
	@XmlTransient
	public Boolean getAccantonamentoModificaUtente() {
		return (this.accantonamento == null ^ this.accantonamentoOriginale == null) || (this.accantonamento != null && this.accantonamentoOriginale != null && this.accantonamento.compareTo(this.accantonamentoOriginale) != 0);
	}
	/**
	 * @return the accantonamentoModificaUtente
	 */
	@XmlTransient
	public Boolean getAccantonamento1ModificaUtente() {
		return (this.accantonamento1 == null ^ this.accantonamento1Originale == null) || (this.accantonamento1 != null && this.accantonamento1Originale != null && this.accantonamento1.compareTo(this.accantonamento1Originale) != 0);
	}
	/**
	 * @return the accantonamento2ModificaUtente
	 */
	@XmlTransient
	public Boolean getAccantonamento2ModificaUtente() {
		return (this.accantonamento2 == null ^ this.accantonamento2Originale == null) || (this.accantonamento2 != null && this.accantonamento2Originale != null && this.accantonamento2.compareTo(this.accantonamento2Originale) != 0);
	}

	/**
	 * Recupero della percentuale di accantonamento
	 * @param idx l'indice
	 * @return la parcentuale
	 */
	public BigDecimal recuperaPercentualeAccantonamentoFondi(int idx) {
		switch(idx) {
			case 0: return percentualeAccantonamentoFondi;
			case 1: return percentualeAccantonamentoFondi1;
			case 2: return percentualeAccantonamentoFondi2;
			case 3: return percentualeAccantonamentoFondi3;
			case 4: return percentualeAccantonamentoFondi4;
			default: return null;
		}
	}
	/**
	 * Recupero dell'incasso
	 * @param idx l'indice
	 * @return l'incasso
	 */
	public BigDecimal recuperaNumeratore(int idx) {
		switch(idx) {
			case 0: return numeratore;
			case 1: return numeratore1;
			case 2: return numeratore2;
			case 3: return numeratore3;
			case 4: return numeratore4;
			default: return null;
		}
	}
	/**
	 * Recupero dell'accertamento
	 * @param idx l'indice
	 * @return l'accertamento
	 */
	public BigDecimal recuperaDenominatore(int idx) {
		switch(idx) {
			case 0: return denominatore;
			case 1: return denominatore1;
			case 2: return denominatore2;
			case 3: return denominatore3;
			case 4: return denominatore4;
			default: return null;
		}
	}

	/**
	 * Recupero della media
	 * @return la media
	 */
	public BigDecimal recuperaMedia() {
		if(tipoMediaPrescelta == null) {
			// Null safety per lo switch sull'enum
			return null;
		}
		switch(tipoMediaPrescelta) {
			case SEMPLICE_TOTALI: return mediaSempliceTotali;
			case SEMPLICE_RAPPORTI: return mediaSempliceRapporti;
			case PONDERATA_TOTALI: return mediaPonderataTotali;
			case PONDERATA_RAPPORTI: return mediaPonderataRapporti;
			case UTENTE: return mediaUtente;
			default: return null;
		}
	}
	/**
	 * @return the percentualeAccantonamentoFCDE
	 */
	@XmlTransient
	public BigDecimal getPercentualeAccantonamentoFCDE() {
		BigDecimal media = recuperaMedia();
		return BilUtilities.BIG_DECIMAL_ONE_HUNDRED.subtract(media != null ? media : BigDecimal.ZERO);
	}
	
	/**
	 * @return the note as html
	 */
	@XmlTransient
	public String getNoteAsHtml() {
		return note != null ? note.replaceAll(",", "<br/>") : null;
	}
}

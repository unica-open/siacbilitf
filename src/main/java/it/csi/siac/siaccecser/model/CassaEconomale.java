/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ImportoDerivato;
import it.csi.siac.siacbilser.model.ImportoDerivatoFunctionEnum;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.08
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class CassaEconomale extends Entita {

	private static final long serialVersionUID = -4834363667694550438L;
	
	/**
	 * Codice che si pu&ograve; ripetere negli anni ma univoco in un anno di Bilancio.
	 */
	private String codice;
	private String descrizione;
	private String responsabile;
	private String numeroContoCorrente;
	private TipoDiCassa tipoDiCassa;
	private StatoOperativoCassaEconomale statoOperativoCassaEconomale;
	
	/**
	 * Inserito dall'utente.
	 * Non obbligatorio
	 * Quando la disponibilit&agrave; scende sotto questo limite l'utente viene bloccato con un messaggio  di errore
	 */
	private BigDecimal limiteImporto;
	private Ente ente;
	private List<RichiestaEconomale> richiesteEconomali = new ArrayList<RichiestaEconomale>();
	private List<OperazioneCassa> operazioniCassaEconomale = new ArrayList<OperazioneCassa>();
	
	
	private VariabiliStampa variabiliStampa;
	
	// Lotto M
	@ImportoDerivato(value = ImportoDerivatoFunctionEnum.disponibilitaCassaContanti, calcolareDiDefault = false)
	private BigDecimal disponibilitaCassaContanti;
	@ImportoDerivato(value = ImportoDerivatoFunctionEnum.disponibilitaCassaContoCorrente, calcolareDiDefault = false)
	private BigDecimal disponibilitaCassaContoCorrente;
	
	private Soggetto soggetto;
	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the responsabile
	 */
	public String getResponsabile() {
		return responsabile;
	}
	/**
	 * @param responsabile the responsabile to set
	 */
	public void setResponsabile(String responsabile) {
		this.responsabile = responsabile;
	}
	/**
	 * @return the numeroContoCorrente
	 */
	public String getNumeroContoCorrente() {
		return numeroContoCorrente;
	}
	/**
	 * @param numeroContoCorrente the numeroContoCorrente to set
	 */
	public void setNumeroContoCorrente(String numeroContoCorrente) {
		this.numeroContoCorrente = numeroContoCorrente;
	}
	/**
	 * @return the tipoDiCassa
	 */
	public TipoDiCassa getTipoDiCassa() {
		return tipoDiCassa;
	}
	/**
	 * @param tipoDiCassa the tipoDiCassa to set
	 */
	public void setTipoDiCassa(TipoDiCassa tipoDiCassa) {
		this.tipoDiCassa = tipoDiCassa;
	}
	/**
	 * @return the statoOperativoCassaEconomale
	 */
	public StatoOperativoCassaEconomale getStatoOperativoCassaEconomale() {
		return statoOperativoCassaEconomale;
	}
	/**
	 * @param statoOperativoCassaEconomale the statoOperativoCassaEconomale to set
	 */
	public void setStatoOperativoCassaEconomale(
			StatoOperativoCassaEconomale statoOperativoCassaEconomale) {
		this.statoOperativoCassaEconomale = statoOperativoCassaEconomale;
	}
	/**
	 * @return the limiteImporto
	 */
	public BigDecimal getLimiteImporto() {
		return limiteImporto;
	}
	/**
	 * @return the limiteImporto, not null
	 */
	public BigDecimal getLimiteImportoNotNull() {
		return limiteImporto == null ? BigDecimal.ZERO : limiteImporto;
	}
	/**
	 * @param limiteImporto the limiteImporto to set
	 */
	public void setLimiteImporto(BigDecimal limiteImporto) {
		this.limiteImporto = limiteImporto;
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
	 * @return the richiesteEconomali
	 */
	public List<RichiestaEconomale> getRichiesteEconomali() {
		return richiesteEconomali;
	}
	/**
	 * @param richiesteEconomali the richiesteEconomali to set
	 */
	public void setRichiesteEconomali(List<RichiestaEconomale> richiesteEconomali) {
		this.richiesteEconomali = richiesteEconomali != null ? richiesteEconomali : new ArrayList<RichiestaEconomale>();
	}
	/**
	 * @return the operazioniCassaEconomale
	 */
	public List<OperazioneCassa> getOperazioniCassaEconomale() {
		return operazioniCassaEconomale;
	}
	/**
	 * @param operazioniCassaEconomale the operazioniCassaEconomale to set
	 */
	public void setOperazioniCassaEconomale(List<OperazioneCassa> operazioniCassaEconomale) {
		this.operazioniCassaEconomale = operazioniCassaEconomale != null ? operazioniCassaEconomale : new ArrayList<OperazioneCassa>();
	}
	/**
	 * @return the variabiliStampa
	 */
	public VariabiliStampa getVariabiliStampa() {
		return variabiliStampa;
	}
	/**
	 * @param variabiliStampa the variabiliStampa to set
	 */
	public void setVariabiliStampa(VariabiliStampa variabiliStampa) {
		this.variabiliStampa = variabiliStampa;
	}
	
	// Lotto M
	/**
	 * @return the disponibilitaCassaContanti
	 */
	public BigDecimal getDisponibilitaCassaContanti() {
		return disponibilitaCassaContanti;
	}
	/**
	 * @return the disponibilitaCassaContantiNotNull
	 */
	public BigDecimal getDisponibilitaCassaContantiNotNull() {
		return disponibilitaCassaContanti != null ? disponibilitaCassaContanti : BigDecimal.ZERO;
	}
	/**
	 * @param disponibilitaCassaContanti the disponibilitaCassaContanti to set
	 */
	public void setDisponibilitaCassaContanti(BigDecimal disponibilitaCassaContanti) {
		this.disponibilitaCassaContanti = disponibilitaCassaContanti;
	}
	/**
	 * @return the disponibilitaCassaContoCorrente
	 */
	public BigDecimal getDisponibilitaCassaContoCorrente() {
		return disponibilitaCassaContoCorrente;
	}
	/**
	 * @return the disponibilitaCassaContoCorrenteNotNull
	 */
	public BigDecimal getDisponibilitaCassaContoCorrenteNotNull() {
		return disponibilitaCassaContoCorrente != null ? disponibilitaCassaContoCorrente : BigDecimal.ZERO;
	}
	/**
	 * @param disponibilitaCassaContoCorrente the disponibilitaCassaContoCorrente to set
	 */
	public void setDisponibilitaCassaContoCorrente(BigDecimal disponibilitaCassaContoCorrente) {
		this.disponibilitaCassaContoCorrente = disponibilitaCassaContoCorrente;
	}
	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}
	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	/**
	 * Calcola il totale della disponibilit&agrave; per la cassa economale.
	 * <br/>
	 * Metodo di calcolo: <code>TOTALE = CONTANTI + CONTO/CORRENTE</code>.
	 * 
	 * @return the disponibilitaCassaTotale
	 */
	public BigDecimal getDisponibilitaCassaTotale() {
		return getDisponibilitaCassaContantiNotNull().add(getDisponibilitaCassaContoCorrenteNotNull());
	}
}
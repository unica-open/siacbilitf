/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneSpesa;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public abstract class ImpegnoAbstract extends MovimentoGestione {

	private static final long serialVersionUID = -9184089589875390594L;

	private int chiaveCapitoloUscitaGestione;

	// Anno dell'accertamento o degli accertamenti che ha finanziato l'impegno
	private int annoFinanziamento;
	
	// Numero dell'accertamento che ha finanziato l'impegno
	private int numeroAccFinanziamento;

	// Codice Identificativo di Gara
	private String cig;// impegno
	
	// Importo calcolato: indica per che importo è possibile inserire liquidazioni
	private BigDecimal disponibilitaLiquidare;// impegno
	
	// E' il risultato secco della function che calcola il disp a liquidare senza ulteriori mediazioni
	private BigDecimal disponibilitaLiquidareBase;// impegno
	
	// Importo calcolato indica la differenza tra impegnato e pagato per il
	// calcolo del residuo.
	private BigDecimal disponibilitaPagare;// impegno
	
	// Importo calcolato indica la differenza tra impegnato e finanziato con le
	private BigDecimal disponibilitaFinanziare;// impegno
	private BigDecimal disponibilitaSubimpegnare;// impegno

	@Deprecated
	@XmlElement(name = "totaleSubImpegni")
	private BigDecimal totaleSubImpegniBigDecimal;// impegno

	@Deprecated private String statoOperativoMovimentoGestioneSpesa;// impegno
	@Deprecated private String descrizioneStatoOperativoMovimentoGestioneSpesa;
	private Date dataStatoOperativoMovimentoGestioneSpesa;

	// usato per i vincoli
	private BigDecimal sommaLiquidazioniDoc;
	private BigDecimal disponibilitaImpegnoModifica;
	private BigDecimal disponibilitaVincolare;
	
	private boolean flagPrenotazione;
	private boolean flagCassaEconomale;
	private boolean flagSDF;
	private boolean flagPrenotazioneLiquidabile;
	
	private String cronoprogramma;
	private Integer idCronoprogramma;
	private Integer idSpesaCronoprogramma;
	
	private Boolean flagCheckDisponibilitaCapitolo;
	
	private boolean flagFrazionabile;
	//per i vecchi impegni serve sapere la situazione in cui frazionabile non e' definito
	private boolean frazionabileValorizzato = false;

	/**
	 * INSERIMENTO PARAMETRI INSERIMENTO/AGGIORNA IMPEGNO
	 */

	private Integer annoImpegnoOrigine, numImpegnoOrigine;

	private ClassificatoreGenerico tipoImpegno;

	List<ModificaMovimentoGestioneSpesa> listaModificheMovimentoGestioneSpesa;

	
	// SIAC-6695
	private String motivazioneDisponibilitaLiquidare;
	private String motivazioneDisponibilitaPagare;
	private String motivazioneDisponibilitaFinanziare;
	private String motivazioneDisponibilitaSubImpegnare;
	private String motivazioneDisponibilitaImpegnoModifica;
	private String motivazioneDisponibilitaVincolare;
	
	public ImpegnoAbstract(MovimentoGestione movimentoGestione) {
		super(movimentoGestione);
	}

	public ImpegnoAbstract() {
		super();
	}

	public ClassificatoreGenerico getTipoImpegno() {
		return tipoImpegno;
	}

	public void setTipoImpegno(ClassificatoreGenerico tipoImpegno) {
		this.tipoImpegno = tipoImpegno;
	}

	public String getCig() {
		return cig;
	}

	public void setCig(String cig) {
		this.cig = cig;
	}

	public BigDecimal getDisponibilitaLiquidare() {
		return disponibilitaLiquidare;
	}

	public void setDisponibilitaLiquidare(BigDecimal disponibilitaLiquidare) {
		this.disponibilitaLiquidare = disponibilitaLiquidare;
	}

	public BigDecimal getDisponibilitaPagare() {
		return disponibilitaPagare;
	}

	public void setDisponibilitaPagare(BigDecimal disponibilitaPagare) {
		this.disponibilitaPagare = disponibilitaPagare;
	}

	public BigDecimal getDisponibilitaFinanziare() {
		return disponibilitaFinanziare;
	}

	public void setDisponibilitaFinanziare(BigDecimal disponibilitaFinanziare) {
		this.disponibilitaFinanziare = disponibilitaFinanziare;
	}

	public String getStatoOperativoMovimentoGestioneSpesa() {
		return statoOperativoMovimentoGestioneSpesa;
	}

	public void setStatoOperativoMovimentoGestioneSpesa(
			String statoOperativoMovimentoGestioneSpesa) {
		this.statoOperativoMovimentoGestioneSpesa = statoOperativoMovimentoGestioneSpesa;
	}

	public String getDescrizioneStatoOperativoMovimentoGestioneSpesa() {
		return descrizioneStatoOperativoMovimentoGestioneSpesa;
	}

	public void setDescrizioneStatoOperativoMovimentoGestioneSpesa(
			String descrizioneStatoOperativoMovimentoGestioneSpesa) {
		this.descrizioneStatoOperativoMovimentoGestioneSpesa = descrizioneStatoOperativoMovimentoGestioneSpesa;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataStatoOperativoMovimentoGestioneSpesa() {
		return dataStatoOperativoMovimentoGestioneSpesa;
	}

	public void setDataStatoOperativoMovimentoGestioneSpesa(
			Date dataStatoOperativoMovimentoGestioneSpesa) {
		this.dataStatoOperativoMovimentoGestioneSpesa = dataStatoOperativoMovimentoGestioneSpesa;
	}

	public Integer getAnnoImpegnoOrigine() {
		return annoImpegnoOrigine;
	}

	public void setAnnoImpegnoOrigine(Integer annoImpegnoOrigine) {
		this.annoImpegnoOrigine = annoImpegnoOrigine;
	}

	public Integer getNumImpegnoOrigine() {
		return numImpegnoOrigine;
	}

	public void setNumImpegnoOrigine(Integer numImpegnoOrigine) {
		this.numImpegnoOrigine = numImpegnoOrigine;
	}

	public int getAnnoFinanziamento() {
		return annoFinanziamento;
	}

	public void setAnnoFinanziamento(int annoFinanziamento) {
		this.annoFinanziamento = annoFinanziamento;
	}

	public int getNumeroAccFinanziamento() {
		return numeroAccFinanziamento;
	}

	public void setNumeroAccFinanziamento(int numeroAccFinanziamento) {
		this.numeroAccFinanziamento = numeroAccFinanziamento;
	}

	public BigDecimal getDisponibilitaSubimpegnare() {
		return disponibilitaSubimpegnare;
	}

	public void setDisponibilitaSubimpegnare(
			BigDecimal disponibilitaSubimpegnare) {
		this.disponibilitaSubimpegnare = disponibilitaSubimpegnare;
	}

	public Integer getTotaleSubImpegni() {
		return totaleSubImpegniBigDecimal == null ? null : totaleSubImpegniBigDecimal.intValue();
	}

	@Deprecated
	@XmlTransient
	public BigDecimal getTotaleSubImpegniBigDecimal() {
		return totaleSubImpegniBigDecimal;
	}

	@Deprecated
	public void setTotaleSubImpegniBigDecimal(BigDecimal totaleSubImpegni) {
		this.totaleSubImpegniBigDecimal = totaleSubImpegni;
	}

	public List<ModificaMovimentoGestioneSpesa> getListaModificheMovimentoGestioneSpesa() {
		return listaModificheMovimentoGestioneSpesa;
	}

	public void setListaModificheMovimentoGestioneSpesa(
			List<ModificaMovimentoGestioneSpesa> listaModificheMovimentoGestioneSpesa) {
		this.listaModificheMovimentoGestioneSpesa = listaModificheMovimentoGestioneSpesa;
	}

	public int getChiaveCapitoloUscitaGestione() {
		return chiaveCapitoloUscitaGestione;
	}

	public void setChiaveCapitoloUscitaGestione(int chiaveCapitoloUscitaGestione) {
		this.chiaveCapitoloUscitaGestione = chiaveCapitoloUscitaGestione;
	}


	public BigDecimal getSommaLiquidazioniDoc() {
		return sommaLiquidazioniDoc;
	}

	public void setSommaLiquidazioniDoc(BigDecimal sommaLiquidazioniDoc) {
		this.sommaLiquidazioniDoc = sommaLiquidazioniDoc;
	}

	public BigDecimal getDisponibilitaImpegnoModifica() {
		return disponibilitaImpegnoModifica;
	}

	public void setDisponibilitaImpegnoModifica(
			BigDecimal disponibilitaImpegnoModifica) {
		this.disponibilitaImpegnoModifica = disponibilitaImpegnoModifica;
	}

	public BigDecimal getDisponibilitaVincolare() {
		return disponibilitaVincolare;
	}

	public void setDisponibilitaVincolare(BigDecimal disponibilitaVincolare) {
		this.disponibilitaVincolare = disponibilitaVincolare;
	}

	public BigDecimal getDisponibilitaLiquidareBase() {
		return disponibilitaLiquidareBase;
	}

	public void setDisponibilitaLiquidareBase(BigDecimal disponibilitaLiquidareBase) {
		this.disponibilitaLiquidareBase = disponibilitaLiquidareBase;
	}

	public boolean isFlagPrenotazione() {
		return flagPrenotazione;
	}

	public void setFlagPrenotazione(boolean flagPrenotazione) {
		this.flagPrenotazione = flagPrenotazione;
	}

	public boolean isFlagCassaEconomale() {
		return flagCassaEconomale;
	}

	public void setFlagCassaEconomale(boolean flagCassaEconomale) {
		this.flagCassaEconomale = flagCassaEconomale;
	}

	public boolean isFlagSDF() {
		return flagSDF;
	}

	public void setFlagSDF(boolean flagSDF) {
		this.flagSDF = flagSDF;
	}

	public boolean isFlagFrazionabile() {
		return flagFrazionabile;
	}

	public void setFlagFrazionabile(boolean flagFrazionabile) {
		this.flagFrazionabile = flagFrazionabile;
	}

	public boolean isFrazionabileValorizzato() {
		return frazionabileValorizzato;
	}

	public void setFrazionabileValorizzato(boolean frazionabileValorizzato) {
		this.frazionabileValorizzato = frazionabileValorizzato;
	}

	public boolean isFlagPrenotazioneLiquidabile() {
		return flagPrenotazioneLiquidabile;
	}

	public void setFlagPrenotazioneLiquidabile(boolean flagPrenotazioneLiquidabile) {
		this.flagPrenotazioneLiquidabile = flagPrenotazioneLiquidabile;
	}


	/**
	 * @return the flagCheckDisponibilitaCapitolo
	 */
	public Boolean isFlagCheckDisponibilitaCapitolo() {
		return flagCheckDisponibilitaCapitolo;
	}

	/**
	 * @param flagCheckDisponibilitaCapitolo the flagCheckDisponibilitaCapitolo to set
	 */
	public void setFlagCheckDisponibilitaCapitolo(
			Boolean flagCheckDisponibilitaCapitolo) {
		this.flagCheckDisponibilitaCapitolo = flagCheckDisponibilitaCapitolo;
	}

	/**
	 * @return the motivazioneDisponibilitaLiquidare
	 */
	public String getMotivazioneDisponibilitaLiquidare() {
		return this.motivazioneDisponibilitaLiquidare;
	}

	/**
	 * @param motivazioneDisponibilitaLiquidare the motivazioneDisponibilitaLiquidare to set
	 */
	public void setMotivazioneDisponibilitaLiquidare(String motivazioneDisponibilitaLiquidare) {
		this.motivazioneDisponibilitaLiquidare = motivazioneDisponibilitaLiquidare;
	}

	/**
	 * @return the motivazioneDisponibilitaPagare
	 */
	public String getMotivazioneDisponibilitaPagare() {
		return this.motivazioneDisponibilitaPagare;
	}

	/**
	 * @param motivazioneDisponibilitaPagare the motivazioneDisponibilitaPagare to set
	 */
	public void setMotivazioneDisponibilitaPagare(String motivazioneDisponibilitaPagare) {
		this.motivazioneDisponibilitaPagare = motivazioneDisponibilitaPagare;
	}

	/**
	 * @return the motivazioneDisponibilitaFinanziare
	 */
	public String getMotivazioneDisponibilitaFinanziare() {
		return this.motivazioneDisponibilitaFinanziare;
	}

	/**
	 * @param motivazioneDisponibilitaFinanziare the motivazioneDisponibilitaFinanziare to set
	 */
	public void setMotivazioneDisponibilitaFinanziare(String motivazioneDisponibilitaFinanziare) {
		this.motivazioneDisponibilitaFinanziare = motivazioneDisponibilitaFinanziare;
	}

	/**
	 * @return the motivazioneDisponibilitaSubImpegnare
	 */
	public String getMotivazioneDisponibilitaSubImpegnare() {
		return this.motivazioneDisponibilitaSubImpegnare;
	}

	/**
	 * @param motivazioneDisponibilitaSubImpegnare the motivazioneDisponibilitaSubImpegnare to set
	 */
	public void setMotivazioneDisponibilitaSubImpegnare(String motivazioneDisponibilitaSubImpegnare) {
		this.motivazioneDisponibilitaSubImpegnare = motivazioneDisponibilitaSubImpegnare;
	}

	/**
	 * @return the motivazioneDisponibilitaImpegnoModifica
	 */
	public String getMotivazioneDisponibilitaImpegnoModifica() {
		return this.motivazioneDisponibilitaImpegnoModifica;
	}

	/**
	 * @param motivazioneDisponibilitaImpegnoModifica the motivazioneDisponibilitaImpegnoModifica to set
	 */
	public void setMotivazioneDisponibilitaImpegnoModifica(String motivazioneDisponibilitaImpegnoModifica) {
		this.motivazioneDisponibilitaImpegnoModifica = motivazioneDisponibilitaImpegnoModifica;
	}

	/**
	 * @return the motivazioneDisponibilitaVincolare
	 */
	public String getMotivazioneDisponibilitaVincolare() {
		return this.motivazioneDisponibilitaVincolare;
	}

	/**
	 * @param motivazioneDisponibilitaVincolare the motivazioneDisponibilitaVincolare to set
	 */
	public void setMotivazioneDisponibilitaVincolare(String motivazioneDisponibilitaVincolare) {
		this.motivazioneDisponibilitaVincolare = motivazioneDisponibilitaVincolare;
	}

	public String getCronoprogramma() {
		return cronoprogramma;
	}

	public void setCronoprogramma(String cronoprogramma) {
		this.cronoprogramma = cronoprogramma;
	}

	public Integer getIdCronoprogramma() {
		return idCronoprogramma;
	}

	public void setIdCronoprogramma(Integer idCronoprogramma) {
		this.idCronoprogramma = idCronoprogramma;
	}

	public Integer getIdSpesaCronoprogramma() {
		return idSpesaCronoprogramma;
	}

	public void setIdSpesaCronoprogramma(Integer idSpesaCronoprogramma) {
		this.idSpesaCronoprogramma = idSpesaCronoprogramma;
	}

}
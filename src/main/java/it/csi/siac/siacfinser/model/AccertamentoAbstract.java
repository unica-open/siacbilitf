/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneEntrata;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public abstract class AccertamentoAbstract extends MovimentoGestione {

	private static final long serialVersionUID = -9184089589875390594L;
	
	private CapitoloEntrataGestione capitoloEntrataGestione;
	private int chiaveCapitoloEntrataGestione;
	
	private List<SubAccertamento> subAccertamenti;

	private BigDecimal disponibilitaIncassare;
	private BigDecimal disponibilitaSubAccertare;
	private BigDecimal totaleSubAccertamenti;
	
	private String statoOperativoMovimentoGestioneEntrata;
	private String descrizioneStatoOperativoMovimentoGestioneEntrata;
	private Date dataStatoOperativoMovimentoGestioneEntrata;
	
	private boolean automatico;
	
	//E' un importo tipico dei soli acc/subacc:
	private BigDecimal importoUtilizzabile;
	private BigDecimal disponibilitaUtilizzare;
	///////////////////////////////////////////

	/**
	 * INSERIMENTO PARAMETRI INSERIMENTO/AGGIORNA IMPEGNO
	 */
	
	/*
	private String codMissione, codProgramma, descProgramma, codPdc, descPdc, codContoEconomico, descCodContoEconomico, codCofog, codTransazioneEuropeaSpesa, descTransazioneEuropeaSpesa, codSiope, descCodSiope, codRicorrenteSpesa, codCapitoloSanitarioSpesa, codPrgPolReg;
	private String codClassGen11, codClassGen12, codClassGen13, codClassGen14, codClassGen15;*/
	
	
	private Integer annoAccertamentoOrigine, numAccertamentoOrigine;
	
	private ClassificatoreGenerico tipoImpegno;
	
	List<ModificaMovimentoGestioneEntrata> listaModificheMovimentoGestioneEntrata;
	
	private boolean flagFattura;
	private boolean flagCorrispettivo;
	
	// SIAC-6695
	private String motivazioneDisponibilitaIncassare;
	private String motivazioneDisponibilitaSubAccertare;
	private String motivazioneDisponibilitaUtilizzare;
	
	public ClassificatoreGenerico getTipoImpegno() {
		return tipoImpegno;
	}

	public void setTipoImpegno(ClassificatoreGenerico tipoImpegno) {
		this.tipoImpegno = tipoImpegno;
	}

	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitoloEntrataGestione;
	}

	public void setCapitoloEntrataGestione(
			CapitoloEntrataGestione capitoloEntrataGestione) {
		this.capitoloEntrataGestione = capitoloEntrataGestione;
	}

	public List<SubAccertamento> getElencoSubAccertamenti() {
		return subAccertamenti;
	}
	public void setElencoSubAccertamenti(List<SubAccertamento> subAccertamenti) {
		this.subAccertamenti = subAccertamenti;
	}

	public BigDecimal getDisponibilitaIncassare() {
		return disponibilitaIncassare;
	}

	public void setDisponibilitaIncassare(BigDecimal disponibilitaIncassare) {
		this.disponibilitaIncassare = disponibilitaIncassare;
	}

	public BigDecimal getDisponibilitaSubAccertare() {
		return disponibilitaSubAccertare;
	}

	public void setDisponibilitaSubAccertare(BigDecimal disponibilitaSubAccertare) {
		this.disponibilitaSubAccertare = disponibilitaSubAccertare;
	}

	public BigDecimal getTotaleSubAccertamenti() {
		return totaleSubAccertamenti;
	}

	public void setTotaleSubAccertamenti(BigDecimal totaleSubAccertamenti) {
		this.totaleSubAccertamenti = totaleSubAccertamenti;
	}

	public String getStatoOperativoMovimentoGestioneEntrata() {
		return statoOperativoMovimentoGestioneEntrata;
	}

	public void setStatoOperativoMovimentoGestioneEntrata(
			String statoOperativoMovimentoGestioneEntrata) {
		this.statoOperativoMovimentoGestioneEntrata = statoOperativoMovimentoGestioneEntrata;
	}

	public String getDescrizioneStatoOperativoMovimentoGestioneEntrata() {
		return descrizioneStatoOperativoMovimentoGestioneEntrata;
	}

	public void setDescrizioneStatoOperativoMovimentoGestioneEntrata(
			String descrizioneStatoOperativoMovimentoGestioneEntrata) {
		this.descrizioneStatoOperativoMovimentoGestioneEntrata = descrizioneStatoOperativoMovimentoGestioneEntrata;
	}

	public Date getDataStatoOperativoMovimentoGestioneEntrata() {
		return dataStatoOperativoMovimentoGestioneEntrata;
	}

	public void setDataStatoOperativoMovimentoGestioneEntrata(
			Date dataStatoOperativoMovimentoGestioneEntrata) {
		this.dataStatoOperativoMovimentoGestioneEntrata = dataStatoOperativoMovimentoGestioneEntrata;
	}

	public Integer getAnnoAccertamentoOrigine() {
		return annoAccertamentoOrigine;
	}

	public void setAnnoAccertamentoOrigine(Integer annoAccertamentoOrigine) {
		this.annoAccertamentoOrigine = annoAccertamentoOrigine;
	}

	public Integer getNumAccertamentoOrigine() {
		return numAccertamentoOrigine;
	}

	public void setNumAccertamentoOrigine(Integer numAccertamentoOrigine) {
		this.numAccertamentoOrigine = numAccertamentoOrigine;
	}

	public List<ModificaMovimentoGestioneEntrata> getListaModificheMovimentoGestioneEntrata() {
		return listaModificheMovimentoGestioneEntrata;
	}

	public void setListaModificheMovimentoGestioneEntrata(
			List<ModificaMovimentoGestioneEntrata> listaModificheMovimentoGestioneEntrata) {
		this.listaModificheMovimentoGestioneEntrata = listaModificheMovimentoGestioneEntrata;
	}

	public int getChiaveCapitoloEntrataGestione() {
		return chiaveCapitoloEntrataGestione;
	}

	public void setChiaveCapitoloEntrataGestione(int chiaveCapitoloEntrataGestione) {
		this.chiaveCapitoloEntrataGestione = chiaveCapitoloEntrataGestione;
	}

	public List<SubAccertamento> getSubAccertamenti() {
		return subAccertamenti;
	}

	public void setSubAccertamenti(List<SubAccertamento> subAccertamenti) {
		this.subAccertamenti = subAccertamenti;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public BigDecimal getImportoUtilizzabile() {
		return importoUtilizzabile;
	}

	public void setImportoUtilizzabile(BigDecimal importoUtilizzabile) {
		this.importoUtilizzabile = importoUtilizzabile;
	}

	public BigDecimal getDisponibilitaUtilizzare() {
		return disponibilitaUtilizzare;
	}

	public void setDisponibilitaUtilizzare(BigDecimal disponibilitaUtilizzare) {
		this.disponibilitaUtilizzare = disponibilitaUtilizzare;
	}

	public boolean isFlagFattura() {
		return flagFattura;
	}

	public void setFlagFattura(boolean flagFattura) {
		this.flagFattura = flagFattura;
	}

	/**
	 * @return the motivazioneDisponibilitaIncassare
	 */
	public String getMotivazioneDisponibilitaIncassare() {
		return this.motivazioneDisponibilitaIncassare;
	}

	/**
	 * @param motivazioneDisponibilitaIncassare the motivazioneDisponibilitaIncassare to set
	 */
	public void setMotivazioneDisponibilitaIncassare(String motivazioneDisponibilitaIncassare) {
		this.motivazioneDisponibilitaIncassare = motivazioneDisponibilitaIncassare;
	}

	/**
	 * @return the motivazioneDisponibilitaSubAccertare
	 */
	public String getMotivazioneDisponibilitaSubAccertare() {
		return this.motivazioneDisponibilitaSubAccertare;
	}

	/**
	 * @param motivazioneDisponibilitaSubAccertare the motivazioneDisponibilitaSubAccertare to set
	 */
	public void setMotivazioneDisponibilitaSubAccertare(String motivazioneDisponibilitaSubAccertare) {
		this.motivazioneDisponibilitaSubAccertare = motivazioneDisponibilitaSubAccertare;
	}

	/**
	 * @return the motivazioneDisponibilitaUtilizzare
	 */
	public String getMotivazioneDisponibilitaUtilizzare() {
		return this.motivazioneDisponibilitaUtilizzare;
	}

	/**
	 * @param motivazioneDisponibilitaUtilizzare the motivazioneDisponibilitaUtilizzare to set
	 */
	public void setMotivazioneDisponibilitaUtilizzare(String motivazioneDisponibilitaUtilizzare) {
		this.motivazioneDisponibilitaUtilizzare = motivazioneDisponibilitaUtilizzare;
	}

	public boolean isFlagCorrispettivo() {
		return flagCorrispettivo;
	}

	public void setFlagCorrispettivo(boolean flagCorrispettivo) {
		this.flagCorrispettivo = flagCorrispettivo;
	}
	
}

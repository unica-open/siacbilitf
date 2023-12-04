/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.progetto.MutuoAssociatoProgetto;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * @author elisa
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class Progetto extends EntitaEnte {
	private static final long serialVersionUID = 9050464913913926339L;

	private String codice;
	private Bilancio bilancio;
	private String descrizione;
	private String note;
	private Boolean rilevanteFPV;
	private List<Cronoprogramma> cronoprogrammi = new ArrayList<Cronoprogramma>();
	private TipoAmbito tipoAmbito;
	private BigDecimal valoreComplessivo = BigDecimal.ZERO;
	private StatoOperativoProgetto statoOperativoProgetto;
	private AttoAmministrativo attoAmministrativo;
   
	//campi nuovi 06/03/2015
	
	private Date dataIndizioneGara;
	private Date dataAggiudicazioneGara;
	private Boolean investimentoInCorsoDiDefinizione;
	
	//campi nuovi SIAC-6255
	private String cup;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	private String responsabileUnico;
	private Boolean spaziFinanziari;
	private ModalitaAffidamentoProgetto modalitaAffidamentoProgetto;
	private TipoProgetto tipoProgetto;
	
	private List<MutuoAssociatoProgetto> elencoMutuiAssociati;
	

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getRilevanteFPV() {
		return rilevanteFPV;
	}

	public void setRilevanteFPV(Boolean rilevanteFPV) {
		this.rilevanteFPV = rilevanteFPV;
	}

	public List<Cronoprogramma> getCronoprogrammi() {
		return cronoprogrammi;
	}

	public void setCronoprogrammi(List<Cronoprogramma> cronoprogrammi) {
		this.cronoprogrammi = cronoprogrammi;
	}

	public TipoAmbito getTipoAmbito() {
		return tipoAmbito;
	}

	public void setTipoAmbito(TipoAmbito tipoAmbito) {
		this.tipoAmbito = tipoAmbito;
	}

	public BigDecimal getValoreComplessivo() {
		return valoreComplessivo;
	}

	public void setValoreComplessivo(BigDecimal valoreComplessivo) {
		this.valoreComplessivo = valoreComplessivo;
	}

	public StatoOperativoProgetto getStatoOperativoProgetto() {
		return statoOperativoProgetto;
	}

	public void setStatoOperativoProgetto(StatoOperativoProgetto statoOperativoProgetto) {
		this.statoOperativoProgetto = statoOperativoProgetto;
	}

	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}

	public Date getDataIndizioneGara() {
		return dataIndizioneGara;
	}

	public void setDataIndizioneGara(Date dataIndizioneGara) {
		this.dataIndizioneGara = dataIndizioneGara;
	}

	public Date getDataAggiudicazioneGara() {
		return dataAggiudicazioneGara;
	}

	public void setDataAggiudicazioneGara(Date dataAggiudicazioneGara) {
		this.dataAggiudicazioneGara = dataAggiudicazioneGara;
	}

	public Boolean getInvestimentoInCorsoDiDefinizione() {
		return investimentoInCorsoDiDefinizione;
	}

	public void setInvestimentoInCorsoDiDefinizione(Boolean investimentoInCorsoDiDefinizione) {
		this.investimentoInCorsoDiDefinizione = investimentoInCorsoDiDefinizione;
	}

	/**
	 * @return the cup
	 */
	public String getCup() {
		return cup;
	}

	/**
	 * @param cup the cup to set
	 */
	public void setCup(String cup) {
		this.cup = cup;
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

	/**
	 * @return the rUP
	 */
	public String getResponsabileUnico() {
		return responsabileUnico;
	}

	/**
	 * @param rUP the rUP to set
	 */
	public void setResponsabileUnico(String responsabileUnico) {
		this.responsabileUnico = responsabileUnico;
	}

	/**
	 * @return the spaziFinanziari
	 */
	public Boolean getSpaziFinanziari() {
		return spaziFinanziari;
	}

	/**
	 * @param spaziFinanziari the spaziFinanziari to set
	 */
	public void setSpaziFinanziari(Boolean spaziFinanziari) {
		this.spaziFinanziari = spaziFinanziari;
	}

	/**
	 * @return the modalitaAffidamento
	 */
	public ModalitaAffidamentoProgetto getModalitaAffidamentoProgetto() {
		return modalitaAffidamentoProgetto;
	}

	/**
	 * @param modalitaAffidamento the modalitaAffidamento to set
	 */
	public void setModalitaAffidamentoProgetto(ModalitaAffidamentoProgetto modalitaAffidamento) {
		this.modalitaAffidamentoProgetto = modalitaAffidamento;
	}

	/**
	 * @return the tipoProgetto
	 */
	public TipoProgetto getTipoProgetto() {
		return tipoProgetto;
	}

	/**
	 * @param tipoProgetto the tipoProgetto to set
	 */
	public void setTipoProgetto(TipoProgetto tipoProgetto) {
		this.tipoProgetto = tipoProgetto;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public List<MutuoAssociatoProgetto> getElencoMutuiAssociati() {
		return elencoMutuiAssociati;
	}

	public void setElencoMutuiAssociati(List<MutuoAssociatoProgetto> elencoMutuiAssociati) {
		this.elencoMutuiAssociati = elencoMutuiAssociati;
	}
	
	
}

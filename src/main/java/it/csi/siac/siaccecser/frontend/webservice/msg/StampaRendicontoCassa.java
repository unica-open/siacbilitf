/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.CassaEconomale;
import it.csi.siac.siaccecser.model.TipoStampa;
import it.csi.siac.siaccorser.frontend.webservice.msg.report.ReportServiceRequest;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class StampaRendicontoCassa extends ReportServiceRequest {
	
	private CassaEconomale cassaEconomale;
	private Date periodoUltimoRendicontoDataInizio;
	private Date periodoUltimoRendicontoDataFine;
	private Date periodoDaRendicontareDataInizio;
	private Date periodoDaRendicontareDataFine;
	
	private Integer ultimoNumeroRendiconto;
	//input data da elaborare
	private Date dataRendiconto;
	//BOZZA/DEFINITIVA
	private TipoStampa tipoStampa;
	private Bilancio bilancio;
	private Integer nextNumeroRendiconto;
	
	// SIAC-4799: dati per l'allegato atto
	private Soggetto soggetto;
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	private String causale;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	private Boolean anticipiSpesaDaInserire;

	/**
	 * @return the cassaEconomale
	 */
	public CassaEconomale getCassaEconomale() {
		return cassaEconomale;
	}

	/**
	 * @param cassaEconomale the cassaEconomale to set
	 */
	public void setCassaEconomale(CassaEconomale cassaEconomale) {
		this.cassaEconomale = cassaEconomale;
	}

	/**
	 * @return the periodoUltimoRendicontoDataInizio
	 */
	public Date getPeriodoUltimoRendicontoDataInizio() {
		return periodoUltimoRendicontoDataInizio;
	}

	/**
	 * @param periodoUltimoRendicontoDataInizio the periodoUltimoRendicontoDataInizio to set
	 */
	public void setPeriodoUltimoRendicontoDataInizio(
			Date periodoUltimoRendicontoDataInizio) {
		this.periodoUltimoRendicontoDataInizio = periodoUltimoRendicontoDataInizio;
	}

	/**
	 * @return the periodoUltimoRendicontoDataFine
	 */
	public Date getPeriodoUltimoRendicontoDataFine() {
		return periodoUltimoRendicontoDataFine;
	}

	/**
	 * @param periodoUltimoRendicontoDataFine the periodoUltimoRendicontoDataFine to set
	 */
	public void setPeriodoUltimoRendicontoDataFine(
			Date periodoUltimoRendicontoDataFine) {
		this.periodoUltimoRendicontoDataFine = periodoUltimoRendicontoDataFine;
	}

	/**
	 * @return the periodoDaRendicontareDataInizio
	 */
	public Date getPeriodoDaRendicontareDataInizio() {
		return periodoDaRendicontareDataInizio;
	}

	/**
	 * @param periodoDaRendicontareDataInizio the periodoDaRendicontareDataInizio to set
	 */
	public void setPeriodoDaRendicontareDataInizio(
			Date periodoDaRendicontareDataInizio) {
		this.periodoDaRendicontareDataInizio = periodoDaRendicontareDataInizio;
	}

	/**
	 * @return the periodoDaRendicontareDataFine
	 */
	public Date getPeriodoDaRendicontareDataFine() {
		return periodoDaRendicontareDataFine;
	}

	/**
	 * @param periodoDaRendicontareDataFine the periodoDaRendicontareDataFine to set
	 */
	public void setPeriodoDaRendicontareDataFine(Date periodoDaRendicontareDataFine) {
		this.periodoDaRendicontareDataFine = periodoDaRendicontareDataFine;
	}

	/**
	 * @return the ultimoNumeroRendiconto
	 */
	public Integer getUltimoNumeroRendiconto() {
		return ultimoNumeroRendiconto;
	}

	/**
	 * @param ultimoNumeroRendiconto the ultimoNumeroRendiconto to set
	 */
	public void setUltimoNumeroRendiconto(Integer ultimoNumeroRendiconto) {
		this.ultimoNumeroRendiconto = ultimoNumeroRendiconto;
	}

	/**
	 * @return the dataRendiconto
	 */
	public Date getDataRendiconto() {
		return dataRendiconto;
	}

	/**
	 * @param dataRendiconto the dataRendiconto to set
	 */
	public void setDataRendiconto(Date dataRendiconto) {
		this.dataRendiconto = dataRendiconto;
	}

	/**
	 * @return the tipoStampa
	 */
	public TipoStampa getTipoStampa() {
		return tipoStampa;
	}

	/**
	 * @param tipoStampa the tipoStampa to set
	 */
	public void setTipoStampa(TipoStampa tipoStampa) {
		this.tipoStampa = tipoStampa;
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

	/**
	 * @return the nextNumeroRendiconto
	 */
	public Integer getNextNumeroRendiconto() {
		return nextNumeroRendiconto;
	}

	/**
	 * @param nextNumeroRendiconto the nextNumeroRendiconto to set
	 */
	public void setNextNumeroRendiconto(Integer nextNumeroRendiconto) {
		this.nextNumeroRendiconto = nextNumeroRendiconto;
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
	 * @return the modalitaPagamentoSoggetto
	 */
	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggetto() {
		return modalitaPagamentoSoggetto;
	}

	/**
	 * @param modalitaPagamentoSoggetto the modalitaPagamentoSoggetto to set
	 */
	public void setModalitaPagamentoSoggetto(ModalitaPagamentoSoggetto modalitaPagamentoSoggetto) {
		this.modalitaPagamentoSoggetto = modalitaPagamentoSoggetto;
	}

	/**
	 * @return the causale
	 */
	public String getCausale() {
		return causale;
	}

	/**
	 * @param causale the causale to set
	 */
	public void setCausale(String causale) {
		this.causale = causale;
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
	 * @return the anticipiSpesaDaInserire
	 */
	public Boolean getAnticipiSpesaDaInserire() {
		return anticipiSpesaDaInserire;
	}

	/**
	 * @param anticipiSpesaDaInserire the anticipiSpesaDaInserire to set
	 */
	public void setAnticipiSpesaDaInserire(Boolean anticipiSpesaDaInserire) {
		this.anticipiSpesaDaInserire = anticipiSpesaDaInserire;
	}

}

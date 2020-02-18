/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Entita;

/**
 * @author 552
 * @version 1.0
 * @created 06-mar-2015 16.27.45
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class StampaRendiconto extends Entita {

	/** per serializzazione */
	private static final long serialVersionUID = 3067960271919608233L;
	
	/**
	 * E' un numero annualizzato che viene assegnato al rendiconto quando viene
	 * stampato in definitivo.
	 */
	private Integer numeroRendiconto;
	/**
	 * periodo di stampa del rendiconto
	 */
	private Date periodoDataInizio;
	/**
	 * periodo di stampa del rendiconto
	 */
	private Date periodoDataFine;
	private Date dataRendiconto;
	private Integer ultimoNumeroRendiconto;
	private Bilancio bilancio;
	private CassaEconomale cassaEconomale;
	private Movimento movimento;

	/**
	 * @return the numeroRendiconto
	 */
	public Integer getNumeroRendiconto() {
		return numeroRendiconto;
	}

	/**
	 * @param numeroRendiconto the numeroRendiconto to set
	 */
	public void setNumeroRendiconto(Integer numeroRendiconto) {
		this.numeroRendiconto = numeroRendiconto;
	}

	/**
	 * @return the periodoDataInizio
	 */
	public Date getPeriodoDataInizio() {
		return periodoDataInizio;
	}

	/**
	 * @param periodoDataInizio the periodoDataInizio to set
	 */
	public void setPeriodoDataInizio(Date periodoDataInizio) {
		this.periodoDataInizio = periodoDataInizio;
	}

	/**
	 * @return the periodoDataFine
	 */
	public Date getPeriodoDataFine() {
		return periodoDataFine;
	}

	/**
	 * @param periodoDataFine the periodoDataFine to set
	 */
	public void setPeriodoDataFine(Date periodoDataFine) {
		this.periodoDataFine = periodoDataFine;
	}

	/**
	 * @return the dataRendiconto
	 */
	public Date getDataRendiconto() {
		return dataRendiconto;
	}

	/**
	 * @param date the dataRendiconto to set
	 */
	public void setDataRendiconto(Date date) {
		this.dataRendiconto = date;
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
	 * @return the movimento
	 */
	public Movimento getMovimento() {
		return movimento;
	}

	/**
	 * @param movimento the movimento to set
	 */
	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}

}
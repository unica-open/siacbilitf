/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Entita;

/**
 * @author 552
 * @version 1.0
 * @created 06-mar-2015 16.27.44
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class StampaGiornale extends Entita {

	/** per serializzazione */
	private static final long serialVersionUID = -6207565809976822895L;
	
	private Date dataUltimaStampa;
	private Integer ultimaPaginaStampataDefinitiva;
	private BigDecimal ultimoImportoEntrataCC;
	private BigDecimal ultimoImportoEntrataContanti;
	private BigDecimal ultimoImportoUscitaCC;
	private BigDecimal ultimoImportoUscitaContanti;
	private CassaEconomale cassaEconomale;
	private Bilancio bilancio;

	/**
	 * @return the dataUltimaStampa
	 */
	public Date getDataUltimaStampa() {
		return dataUltimaStampa;
	}

	/**
	 * @param dataUltimaStampa the dataUltimaStampa to set
	 */
	public void setDataUltimaStampa(Date dataUltimaStampa) {
		this.dataUltimaStampa = dataUltimaStampa;
	}

	/**
	 * @return the ultimaPaginaStampataDefinitiva
	 */
	public Integer getUltimaPaginaStampataDefinitiva() {
		return ultimaPaginaStampataDefinitiva;
	}

	/**
	 * @param ultimaPaginaStampataDefinitiva the ultimaPaginaStampataDefinitiva to set
	 */
	public void setUltimaPaginaStampataDefinitiva(Integer ultimaPaginaStampataDefinitiva) {
		this.ultimaPaginaStampataDefinitiva = ultimaPaginaStampataDefinitiva;
	}

	/**
	 * @return the ultimoImportoEntrataCC
	 */
	public BigDecimal getUltimoImportoEntrataCC() {
		return ultimoImportoEntrataCC;
	}

	/**
	 * @param ultimoImportoEntrataCC the ultimoImportoEntrataCC to set
	 */
	public void setUltimoImportoEntrataCC(BigDecimal ultimoImportoEntrataCC) {
		this.ultimoImportoEntrataCC = ultimoImportoEntrataCC;
	}

	/**
	 * @return the ultimoImportoEntrataContanti
	 */
	public BigDecimal getUltimoImportoEntrataContanti() {
		return ultimoImportoEntrataContanti;
	}

	/**
	 * @param ultimoImportoEntrataContanti the ultimoImportoEntrataContanti to set
	 */
	public void setUltimoImportoEntrataContanti(BigDecimal ultimoImportoEntrataContanti) {
		this.ultimoImportoEntrataContanti = ultimoImportoEntrataContanti;
	}

	/**
	 * @return the ultimoImportoUscitaCC
	 */
	public BigDecimal getUltimoImportoUscitaCC() {
		return ultimoImportoUscitaCC;
	}

	/**
	 * @param ultimoImportoUscitaCC the ultimoImportoUscitaCC to set
	 */
	public void setUltimoImportoUscitaCC(BigDecimal ultimoImportoUscitaCC) {
		this.ultimoImportoUscitaCC = ultimoImportoUscitaCC;
	}

	/**
	 * @return the ultimoImportoUscitaContanti
	 */
	public BigDecimal getUltimoImportoUscitaContanti() {
		return ultimoImportoUscitaContanti;
	}

	/**
	 * @param ultimoImportoUscitaContanti the ultimoImportaUscitaContanti to set
	 */
	public void setUltimoImportoUscitaContanti(BigDecimal ultimoImportoUscitaContanti) {
		this.ultimoImportoUscitaContanti = ultimoImportoUscitaContanti;
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

}
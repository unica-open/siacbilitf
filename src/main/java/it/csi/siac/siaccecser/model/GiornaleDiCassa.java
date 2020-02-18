/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.10
 */


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class GiornaleDiCassa extends Entita {

	private static final long serialVersionUID = -4609899636548972553L;
	
	private Date dataUltimaStampaGiornale;
	private BigDecimal importoContoCorrente;
	private BigDecimal importoContanti;
	/**
	 * @return the dataUltimaStampaGiornale
	 */
	public Date getDataUltimaStampaGiornale() {
		return dataUltimaStampaGiornale;
	}
	/**
	 * @param dataUltimaStampaGiornale the dataUltimaStampaGiornale to set
	 */
	public void setDataUltimaStampaGiornale(Date dataUltimaStampaGiornale) {
		this.dataUltimaStampaGiornale = dataUltimaStampaGiornale;
	}
	/**
	 * @return the importoContoCorrente
	 */
	public BigDecimal getImportoContoCorrente() {
		return importoContoCorrente;
	}
	/**
	 * @return the importoContoCorrente, not null
	 */
	public BigDecimal getImportoContoCorrenteNotNull() {
		return importoContoCorrente == null ? BigDecimal.ZERO : importoContoCorrente;
	}
	/**
	 * @param importoContoCorrente the importoContoCorrente to set
	 */
	public void setImportoContoCorrente(BigDecimal importoContoCorrente) {
		this.importoContoCorrente = importoContoCorrente;
	}
	/**
	 * @return the importoContanti
	 */
	public BigDecimal getImportoContanti() {
		return importoContanti;
	}
	/**
	 * @return the importoContanti, not null
	 */
	public BigDecimal getImportoContantiNotNull() {
		return importoContanti == null ? BigDecimal.ZERO : importoContanti;
	}
	/**
	 * @param importoContanti the importoContanti to set
	 */
	public void setImportoContanti(BigDecimal importoContanti) {
		this.importoContanti = importoContanti;
	}
	
	
	
}
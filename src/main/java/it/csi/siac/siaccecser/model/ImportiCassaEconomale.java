/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Entita;

/**
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.12
 */


@XmlType(namespace = CECDataDictionary.NAMESPACE)
@Deprecated
public class ImportiCassaEconomale extends Entita {

	private static final long serialVersionUID = -7270564413747679230L;
	
	private BigDecimal stanziamentoCassaContoCorrente;
	private BigDecimal stanziamentoCassaContanti;
	private BigDecimal disponibilitaCassaContoCorrente;
	private BigDecimal disponibilitaCassaContanti;
	private Bilancio bilancio;
	
	
	
	/**
	 * @return the stanziamentoCassaContoCorrente
	 */
	public BigDecimal getStanziamentoCassaContoCorrente() {
		return stanziamentoCassaContoCorrente;
	}
	/**
	 * @return the stanziamentoCassaContoCorrente, not null
	 */
	public BigDecimal getStanziamentoCassaContoCorrenteNotNull() {
		return stanziamentoCassaContoCorrente == null ? BigDecimal.ZERO : stanziamentoCassaContoCorrente;
	}
	/**
	 * @param stanziamentoCassaContoCorrente the stanziamentoCassaContoCorrente to set
	 */
	public void setStanziamentoCassaContoCorrente(BigDecimal stanziamentoCassaContoCorrente) {
		this.stanziamentoCassaContoCorrente = stanziamentoCassaContoCorrente;
	}
	/**
	 * @return the stanziamentoCassaContanti
	 */
	public BigDecimal getStanziamentoCassaContanti() {
		return stanziamentoCassaContanti;
	}
	/**
	 * @return the stanziamentoCassaContanti, not null
	 */
	public BigDecimal getStanziamentoCassaContantiNotNull() {
		return stanziamentoCassaContanti == null ? BigDecimal.ZERO : stanziamentoCassaContanti;
	}
	/**
	 * @param stanziamentoCassaContanti the stanziamentoCassaContanti to set
	 */
	public void setStanziamentoCassaContanti(BigDecimal stanziamentoCassaContanti) {
		this.stanziamentoCassaContanti = stanziamentoCassaContanti;
	}
	/**
	 * @return the totaleStanziamento
	 */
	public BigDecimal getTotaleStanziamento() {
		return getStanziamentoCassaContoCorrenteNotNull().add(getStanziamentoCassaContantiNotNull());
	}
	/**
	 * @return the disponibilitaCassaContoCorrente
	 */
	public BigDecimal getDisponibilitaCassaContoCorrente() {
		return disponibilitaCassaContoCorrente;
	}
	/**
	 * @return the disponibilitaCassaContoCorrente, not null
	 */
	public BigDecimal getDisponibilitaCassaContoCorrenteNotNull() {
		return disponibilitaCassaContoCorrente == null ? BigDecimal.ZERO : disponibilitaCassaContoCorrente;
	}
	/**
	 * @param disponibilitaCassaContoCorrente the disponibilitaCassaContoCorrente to set
	 */
	public void setDisponibilitaCassaContoCorrente(BigDecimal disponibilitaCassaContoCorrente) {
		this.disponibilitaCassaContoCorrente = disponibilitaCassaContoCorrente;
	}
	/**
	 * @return the disponibilitaCassaContanti
	 */
	public BigDecimal getDisponibilitaCassaContanti() {
		return disponibilitaCassaContanti;
	}
	/**
	 * @return the disponibilitaCassaContanti, not null
	 */
	public BigDecimal getDisponibilitaCassaContantiNotNull() {
		return disponibilitaCassaContanti == null ? BigDecimal.ZERO : disponibilitaCassaContanti;
	}
	/**
	 * @param disponibilitaCassaContanti the disponibilitaCassaContanti to set
	 */
	public void setDisponibilitaCassaContanti(BigDecimal disponibilitaCassaContanti) {
		this.disponibilitaCassaContanti = disponibilitaCassaContanti;
	}
	/**
	 * @return the totaleDisponibilita
	 */
	public BigDecimal getTotaleDisponibilita() {
		return getDisponibilitaCassaContoCorrenteNotNull().add(getDisponibilitaCassaContantiNotNull());
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
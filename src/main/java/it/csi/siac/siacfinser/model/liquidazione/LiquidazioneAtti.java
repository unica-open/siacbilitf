/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.liquidazione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class LiquidazioneAtti extends Liquidazione {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6527645148399591530L;

	private Integer annoEsercizio;
	private Integer numeroLiquidazionePrecedente;
	
	private String beneficiario;
	

	/**
	 * @return the beneficiario
	 */
	public String getBeneficiario() {
		return beneficiario;
	}
	/**
	 * @param beneficiario the beneficiario to set
	 */
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	/**
	 * @return the numeroLiquidazionePrecedente
	 */
	public Integer getNumeroLiquidazionePrecedente() {
		return numeroLiquidazionePrecedente;
	}
	/**
	 * @param numeroLiquidazionePrecedente the numeroLiquidazionePrecedente to set
	 */
	public void setNumeroLiquidazionePrecedente(Integer numeroLiquidazionePrecedente) {
		this.numeroLiquidazionePrecedente = numeroLiquidazionePrecedente;
	}

}

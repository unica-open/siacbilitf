/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * DatiGestionaliFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class DatiGestionaliFEL extends EntitaEnte{
	
	
	private static final long serialVersionUID = 347063894118577812L;
	
	
	private Integer progressivo;
	private String tipoDato;
	private Date riferimentoData;
	
	private FatturaFEL fattura;

	/**
	 * @return the progressivo
	 */
	public Integer getProgressivo() {
		return progressivo;
	}
	/**
	 * @param progressivo the progressivo to set
	 */
	public void setProgressivo(Integer progressivo) {
		this.progressivo = progressivo;
	}
	/**
	 * @return the tipoDato
	 */
	public String getTipoDato() {
		return tipoDato;
	}
	/**
	 * @param tipoDato the tipoDato to set
	 */
	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}
	/**
	 * @return the dataRiferimento
	 */
	public Date getRiferimentoData() {
		return riferimentoData;
	}
	/**
	 * @param dataRiferimento the dataRiferimento to set
	 */
	public void setRiferimentoData(Date riferimentoData) {
		this.riferimentoData = riferimentoData;
	}
	/**
	 * @return the fattura
	 */
	public FatturaFEL getFattura() {
		return fattura;
	}
	/**
	 * @param fattura the fattura to set
	 */
	public void setFattura(FatturaFEL fattura) {
		this.fattura = fattura;
	}
	
	
	
	
	
	
	
}

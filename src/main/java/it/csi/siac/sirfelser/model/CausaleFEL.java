/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import javax.xml.bind.annotation.XmlType;

/**
 * CausaleFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class CausaleFEL extends EntitaEnte{
	
	private static final long serialVersionUID = -5355940963580081075L;
	
	
	private Integer progressivo;
	private String causale;
	
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
	 * @return the causale
	 */
	public String getCausale() {
		return causale;
	}
	/**
	 * @param causale the causale to set
	 */
	public void setCausale(String descrizione) {
		this.causale = descrizione;
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

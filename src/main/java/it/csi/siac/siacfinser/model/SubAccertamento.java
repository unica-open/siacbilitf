/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * SubAccertamenti
 * 
 * @author fabio
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SubAccertamento extends Accertamento {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8824869170370409149L;

	private BigDecimal numeroAccertamentoPadre;
	private int annoAccertamentoPadre;
	
	//SIAC-6929
	private BigDecimal importoInizialePadre;
	private BigDecimal importoAttualePadre;
	private String descrizionePadre;
	
	public BigDecimal getNumeroAccertamentoPadre() {
		return numeroAccertamentoPadre;
	}
	public void setNumeroAccertamentoPadre(BigDecimal numeroAccertamentoPadre) {
		this.numeroAccertamentoPadre = numeroAccertamentoPadre;
	}
	public int getAnnoAccertamentoPadre() {
		return annoAccertamentoPadre;
	}
	public void setAnnoAccertamentoPadre(int annoAccertamentoPadre) {
		this.annoAccertamentoPadre = annoAccertamentoPadre;
	}
	/**
	 * @return the importoInizialePadre
	 */
	public BigDecimal getImportoInizialePadre() {
		return importoInizialePadre;
	}
	/**
	 * @param importoInizialePadre the importoInizialePadre to set
	 */
	public void setImportoInizialePadre(BigDecimal importoInizialePadre) {
		this.importoInizialePadre = importoInizialePadre;
	}
	/**
	 * @return the importoAttualePadre
	 */
	public BigDecimal getImportoAttualePadre() {
		return importoAttualePadre;
	}
	/**
	 * @param importoAttualePadre the importoAttualePadre to set
	 */
	public void setImportoAttualePadre(BigDecimal importoAttualePadre) {
		this.importoAttualePadre = importoAttualePadre;
	}
	/**
	 * @return the descrizionePadre
	 */
	public String getDescrizionePadre() {
		return descrizionePadre;
	}
	/**
	 * @param descrizionePadre the descrizionePadre to set
	 */
	public void setDescrizionePadre(String descrizionePadre) {
		this.descrizionePadre = descrizionePadre;
	}


}

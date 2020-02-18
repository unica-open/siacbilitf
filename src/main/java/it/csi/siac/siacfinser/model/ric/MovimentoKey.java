/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class MovimentoKey implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer annoEsercizio;
	private Integer annoMovimento;
	private BigDecimal numeroMovimento;
	private BigDecimal numeroSubMovimento;
	
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	public Integer getAnnoMovimento() {
		return annoMovimento;
	}
	public void setAnnoMovimento(Integer annoMovimento) {
		this.annoMovimento = annoMovimento;
	}
	public BigDecimal getNumeroMovimento() {
		return numeroMovimento;
	}
	public void setNumeroMovimento(BigDecimal numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}
	public BigDecimal getNumeroSubMovimento() {
		return numeroSubMovimento;
	}
	public void setNumeroSubMovimento(BigDecimal numeroSubMovimento) {
		this.numeroSubMovimento = numeroSubMovimento;
	}
	
}

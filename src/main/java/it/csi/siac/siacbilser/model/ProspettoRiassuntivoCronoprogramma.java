/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ProspettoRiassuntivoCronoprogramma extends EntitaEnte {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6786873911173550640L;

	private Integer anno;

	private BigDecimal totaliEntrate = BigDecimal.ZERO;	
	private BigDecimal totaliSpese = BigDecimal.ZERO;
	
	
	public ProspettoRiassuntivoCronoprogramma() {
		// Costruttore vuoto
	}
	
	
	public ProspettoRiassuntivoCronoprogramma(Integer anno,
			BigDecimal totaliEntrate, BigDecimal totaliSpese) {
		super();
		this.anno = anno;
		this.totaliEntrate = totaliEntrate;
		this.totaliSpese = totaliSpese;
	}


	public ProspettoRiassuntivoCronoprogramma(Integer anno) {
		this.anno = anno;
	}
	
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public BigDecimal getTotaliEntrate() {
		return totaliEntrate;
	}

	public void setTotaliEntrate(BigDecimal totaliEntrate) {
		this.totaliEntrate = totaliEntrate;
	}

	public BigDecimal getTotaliSpese() {
		return totaliSpese;
	}

	public void setTotaliSpese(BigDecimal totaliSpese) {
		this.totaliSpese = totaliSpese;
	}
	
	
	

	

}

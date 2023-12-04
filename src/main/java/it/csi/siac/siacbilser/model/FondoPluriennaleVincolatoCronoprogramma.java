/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class FondoPluriennaleVincolatoCronoprogramma extends EntitaEnte {

	/**
	 * 
	 */
	private static final long serialVersionUID = -568064934014865770L;
	
	
	private Integer anno;

	private BigDecimal importo;	
	private BigDecimal importoFPV;
	
	
	public FondoPluriennaleVincolatoCronoprogramma() {
		// Costruttore vuoto
		
	}
	
	public FondoPluriennaleVincolatoCronoprogramma(Integer anno) {
		this.anno = anno;
	}
	
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	public BigDecimal getImporto() {
		return importo;
	}
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	public BigDecimal getImportoFPV() {
		return importoFPV;
	}
	public void setImportoFPV(BigDecimal importoFPV) {
		this.importoFPV = importoFPV;
	}
	
	// SIAC-5212: aggiunti metodi di utilita'
	public void addImporto(BigDecimal importo) {
		if(importo == null) {
			return;
		}
		if(this.importo == null) {
			this.importo = importo;
			return;
		}
		this.importo = this.importo.add(importo);
	}
	public void addImportoFPV(BigDecimal importoFPV) {
		if(importoFPV == null) {
			return;
		}
		if(this.importoFPV == null) {
			this.importoFPV = importoFPV;
			return;
		}
		this.importoFPV = this.importoFPV.add(importoFPV);
	}

	

}

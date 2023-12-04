/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

//SIAC-7349
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ComponenteImpegnatoPerAnno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6779540101541555540L;
	private int idComponente;
	private Integer annoComponente;
	private BigDecimal importoImpegnato;
	public int getIdComponente() {
		return idComponente;
	}
	public void setIdComponente(int idComponente) {
		this.idComponente = idComponente;
	}
	public Integer getAnnoComponente() {
		return annoComponente;
	}
	public void setAnnoComponente(Integer annoComponente) {
		this.annoComponente = annoComponente;
	}
	public BigDecimal getImportoImpegnato() {
		return importoImpegnato;
	}
	public void setImportoImpegnato(BigDecimal importoImpegnato) {
		this.importoImpegnato = importoImpegnato;
	}
	
	
	
	
	
	

}

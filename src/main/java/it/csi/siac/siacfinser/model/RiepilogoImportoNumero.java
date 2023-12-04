/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RiepilogoImportoNumero implements Serializable {

	private static final long serialVersionUID = -8784420145007443214L;
	
	private BigDecimal importo;
	private Integer numero;
	
	public RiepilogoImportoNumero(){}
	
	public RiepilogoImportoNumero(BigDecimal imp){
		this(imp, null);
	}
	
	public RiepilogoImportoNumero(BigDecimal imp, Integer num){
		this.importo = imp;
		this.numero = num;
	}
	
	public BigDecimal getImporto() {
		return importo;
	}
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
}

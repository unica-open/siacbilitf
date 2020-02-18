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
	private int numero;
	
	public RiepilogoImportoNumero(){
		// Costruttore vuoto
	}
	
	public RiepilogoImportoNumero(BigDecimal imp,int num){
		this.importo=imp;
		this.numero=num;
	}
	
	public static BigDecimal sommaImporti(Object ... importoNumeros){
		BigDecimal somma = BigDecimal.ZERO;
		if(importoNumeros!=null && importoNumeros.length>0){
			for(Object it: importoNumeros){
				if(it!=null){
					if(it instanceof RiepilogoImportoNumero){
						somma = somma.add(((RiepilogoImportoNumero)it).getImporto());
					} else if(it instanceof BigDecimal){
						somma = somma.add((BigDecimal)it);
					}
				}
			}
		}
		return somma;
	}
	
	public BigDecimal getImporto() {
		return importo;
	}
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}

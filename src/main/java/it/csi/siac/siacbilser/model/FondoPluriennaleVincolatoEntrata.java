/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * Usato dalle function per il calcolo fpv di entrata
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class FondoPluriennaleVincolatoEntrata extends FondoPluriennaleVincolatoCronoprogramma {

	private static final long serialVersionUID = 4188617007986978459L;
	/**
	 * 
	 */
	
	private BigDecimal fpvEntrataSpesaCorrente=BigDecimal.ZERO;
	private BigDecimal fpvEntrataSpesaContoCapitale=BigDecimal.ZERO;

	private BigDecimal totale=BigDecimal.ZERO;


	
	
	public FondoPluriennaleVincolatoEntrata() {
		// Costruttore vuoto
	}


	public FondoPluriennaleVincolatoEntrata(
			BigDecimal fpvEntrataSpesaCorrente,
			BigDecimal fpvEntrataSpesaContoCapitale, BigDecimal totale) {
		
		this.fpvEntrataSpesaCorrente = fpvEntrataSpesaCorrente;
		this.fpvEntrataSpesaContoCapitale = fpvEntrataSpesaContoCapitale;
		this.totale = totale;
	}


	public BigDecimal getFpvEntrataSpesaCorrente() {
		return fpvEntrataSpesaCorrente;
	}







	public void setFpvEntrataSpesaCorrente(BigDecimal fpvEntrataSpesaCorrente) {
		this.fpvEntrataSpesaCorrente = fpvEntrataSpesaCorrente;
	}







	public BigDecimal getFpvEntrataSpesaContoCapitale() {
		return fpvEntrataSpesaContoCapitale;
	}







	public void setFpvEntrataSpesaContoCapitale(
			BigDecimal fpvEntrataSpesaContoCapitale) {
		this.fpvEntrataSpesaContoCapitale = fpvEntrataSpesaContoCapitale;
	}







	public BigDecimal getTotale() {
		return totale;
	}







	public void setTotale(BigDecimal totale) {
		this.totale = totale;
	}


	@Override
	public String toString() {
		return "FondoPluriennaleVincolatoEntrata [fpvEntrataSpesaCorrente="
				+ fpvEntrataSpesaCorrente + ", fpvEntrataSpesaContoCapitale="
				+ fpvEntrataSpesaContoCapitale + ", totale=" + totale + "]";
	}





}
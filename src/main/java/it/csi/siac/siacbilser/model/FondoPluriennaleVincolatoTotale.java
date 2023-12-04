/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * Usato dalle function per il calcolo fpv totale 
 * aggiunto il 18/03/2015 Ahmad
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class FondoPluriennaleVincolatoTotale extends FondoPluriennaleVincolatoCronoprogramma {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8571592183303451390L;

	private BigDecimal totale=BigDecimal.ZERO;

	private FondoPluriennaleVincolatoCronoprogramma fpvEntrata;
	private FondoPluriennaleVincolatoCronoprogramma fpvUscita;


	
	
	public FondoPluriennaleVincolatoTotale(Integer anno, BigDecimal totale,
			FondoPluriennaleVincolatoCronoprogramma fpvEntrata,
			FondoPluriennaleVincolatoCronoprogramma fpvUscita) {
		super();
		this.totale = totale;
		this.fpvEntrata = fpvEntrata;
		this.fpvUscita = fpvUscita;
		setAnno(anno);
	}




	public FondoPluriennaleVincolatoTotale() {
		// Costruttore vuoto
	}



	public BigDecimal getTotale() {
		return totale;
	}




	public void setTotale(BigDecimal totale) {
		this.totale = totale;
	}




	public FondoPluriennaleVincolatoCronoprogramma getFpvEntrata() {
		return fpvEntrata;
	}




	public void setFpvEntrata(FondoPluriennaleVincolatoCronoprogramma fpvEntrata) {
		this.fpvEntrata = fpvEntrata;
	}




	public FondoPluriennaleVincolatoCronoprogramma getFpvUscita() {
		return fpvUscita;
	}




	public void setFpvUscita(FondoPluriennaleVincolatoCronoprogramma fpvUscita) {
		this.fpvUscita = fpvUscita;
	}





}
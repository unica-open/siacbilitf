/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * 
 * Tutti i parametri presenti sono opzionali. Nel caso in cui la ricerca
 * presenti un numero di risultati maggiore di 50 l'applicativo restituira l
 * errore : Ricerca Troppo Ampia, consigliando all utente di rendere piu
 * specifica la propria ricerca
 * 
 * @author Marco
 *
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaOrdinativoPagamento extends BaseParametroRicercaOrdinativo {

	private static final long serialVersionUID = -1L;

	private boolean caricaLiquidazione = false;

	private BigInteger numeroMutuo;

	private Integer annoImpegno;
	private BigDecimal numeroImpegno;
	private BigDecimal numeroSubImpegno;

	private Integer annoLiquidazione;
	private BigInteger numeroLiquidazione;
	
	private String codiceCreditore;
	private String codiceCreditoreCessioneIncasso;

	public boolean isCaricaLiquidazione() {
		return caricaLiquidazione;
	}

	public void setCaricaLiquidazione(boolean caricaLiquidazione) {
		this.caricaLiquidazione = caricaLiquidazione;
	}

	public BigInteger getNumeroMutuo() {
		return numeroMutuo;
	}

	public void setNumeroMutuo(BigInteger numeroMutuo) {
		this.numeroMutuo = numeroMutuo;
	}

	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	public BigDecimal getNumeroImpegno() {
		return numeroImpegno;
	}

	public void setNumeroImpegno(BigDecimal numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	public BigDecimal getNumeroSubImpegno() {
		return numeroSubImpegno;
	}

	public void setNumeroSubImpegno(BigDecimal numeroSubImpegno) {
		this.numeroSubImpegno = numeroSubImpegno;
	}

	public Integer getAnnoLiquidazione() {
		return annoLiquidazione;
	}

	public void setAnnoLiquidazione(Integer annoLiquidazione) {
		this.annoLiquidazione = annoLiquidazione;
	}

	public BigInteger getNumeroLiquidazione() {
		return numeroLiquidazione;
	}

	public void setNumeroLiquidazione(BigInteger numeroLiquidazione) {
		this.numeroLiquidazione = numeroLiquidazione;
	}

	public String getCodiceCreditoreCessioneIncasso() {
		return codiceCreditoreCessioneIncasso;
	}

	public void setCodiceCreditoreCessioneIncasso(String codiceCreditoreCessioneIncasso) {
		this.codiceCreditoreCessioneIncasso = codiceCreditoreCessioneIncasso;
	}

	public String getCodiceCreditore() {
		return codiceCreditore;
	}

	public void setCodiceCreditore(String codiceCreditore) {
		this.codiceCreditore = codiceCreditore;
	}

}

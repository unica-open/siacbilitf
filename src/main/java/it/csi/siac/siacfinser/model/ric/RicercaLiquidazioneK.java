/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;

/**
 * Parametri per la ricerca dell'Impegno per chiave
 * 
 * @author ccivilla
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaLiquidazioneK implements Serializable {
	
	private static final long serialVersionUID = -1L;
	
	private Integer annoEsercizio;
	//da verificare quale mantenere
	private Integer annoLiquidazione;
	//da verificare quale mantenere
	private BigDecimal numeroLiquidazione;
	//-------------------------------------------------------------------------
	//da verificare quale mantenere
	private Bilancio bilancio;
	//da verificare quale mantenere
	private Liquidazione liquidazione;
	private String tipoRicerca;
	
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	public Integer getAnnoLiquidazione() {
		return annoLiquidazione;
	}
	public void setAnnoLiquidazione(Integer annoLiquidazione) {
		this.annoLiquidazione = annoLiquidazione;
	}
	public BigDecimal getNumeroLiquidazione() {
		return numeroLiquidazione;
	}
	public void setNumeroLiquidazione(BigDecimal numeroLiquidazione) {
		this.numeroLiquidazione = numeroLiquidazione;
	}
	public Liquidazione getLiquidazione() {
		return liquidazione;
	}
	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the tipoRicerca
	 */
	public String getTipoRicerca() {
		return tipoRicerca;
	}
	/**
	 * @param tipoRicerca the tipoRicerca to set
	 */
	public void setTipoRicerca(String tipoRicerca) {
		this.tipoRicerca = tipoRicerca;
	}
	
	

}

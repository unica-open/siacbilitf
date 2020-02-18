/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Parametri per la ricerca dell'Impegno per chiave
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaImpegnoK implements Serializable {

	private static final long serialVersionUID = -8784420145007443214L;
	
	private Integer annoEsercizio;
	private Integer annoImpegno;
	private BigDecimal numeroImpegno;
	private Boolean caricaDatiUlteriori = false;
	private Boolean caricaSediEModalitaPagamento = false;
	
	/**
	 * Se indicato la ricerca puo' essere indirizzata ad un sub in particolare:
	 */
	private BigDecimal numeroSubDaCercare;
	
	
	
	/**
	 * @return the caricaDatiUlteriori
	 */
	public Boolean getCaricaDatiUlteriori() {
		return caricaDatiUlteriori;
	}

	/**
	 * @param caricaDatiUlteriori the caricaDatiUlteriori to set
	 */
	public void setCaricaDatiUlteriori(Boolean caricaDatiUlteriori) {
		this.caricaDatiUlteriori = caricaDatiUlteriori;
	}

	/**
	 * @return the caricaSediEModalitaPagamento
	 */
	public Boolean getCaricaSediEModalitaPagamento() {
		return caricaSediEModalitaPagamento;
	}

	/**
	 * @param caricaSediEModalitaPagamento the caricaSediEModalitaPagamento to set
	 */
	public void setCaricaSediEModalitaPagamento(Boolean caricaSediEModalitaPagamento) {
		this.caricaSediEModalitaPagamento = caricaSediEModalitaPagamento;
	}

	public BigDecimal getNumeroImpegno() {
		return numeroImpegno;
	}

	public void setNumeroImpegno(BigDecimal numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	public Integer getAnnoImpegno() {
		return annoImpegno;
	}

	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	public BigDecimal getNumeroSubDaCercare() {
		return numeroSubDaCercare;
	}

	public void setNumeroSubDaCercare(BigDecimal numeroSubDaCercare) {
		this.numeroSubDaCercare = numeroSubDaCercare;
	}
	
}

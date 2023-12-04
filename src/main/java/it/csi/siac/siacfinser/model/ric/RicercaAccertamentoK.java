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
 * Parametri per la ricerca dell'Accertamento per chiave
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaAccertamentoK implements Serializable {

	private static final long serialVersionUID = -1522923831615233218L;

	private Integer annoEsercizio;
	private Integer annoAccertamento;
	private BigDecimal numeroAccertamento;
	
	/**
	 * Se indicato la ricerca puo' essere indirizzata ad un sub in particolare:
	 */
	private BigDecimal numeroSubDaCercare;
		

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	public Integer getAnnoAccertamento() {
		return annoAccertamento;
	}

	public void setAnnoAccertamento(Integer annoAccertamento) {
		this.annoAccertamento = annoAccertamento;
	}

	public BigDecimal getNumeroAccertamento() {
		return numeroAccertamento;
	}

	public void setNumeroAccertamento(BigDecimal numeroAccertamento) {
		this.numeroAccertamento = numeroAccertamento;
	}

	public BigDecimal getNumeroSubDaCercare() {
		return numeroSubDaCercare;
	}

	public void setNumeroSubDaCercare(BigDecimal numeroSubDaCercare) {
		this.numeroSubDaCercare = numeroSubDaCercare;
	}
	
}

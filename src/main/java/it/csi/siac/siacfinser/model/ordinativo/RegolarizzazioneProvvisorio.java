/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ordinativo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.TransazioneElementare;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RegolarizzazioneProvvisorio  extends TransazioneElementare {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5219233868863361694L;
	
	private Integer idRegolarizzazioneProvvisorio;
	private BigDecimal importo;
	private Ordinativo ordinativo;
	private ProvvisorioDiCassa provvisorioDiCassa;
	
	public BigDecimal getImporto() {
		return importo;
	}
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	public Ordinativo getOrdinativo() {
		return ordinativo;
	}
	public void setOrdinativo(Ordinativo ordinativo) {
		this.ordinativo = ordinativo;
	}
	public ProvvisorioDiCassa getProvvisorioDiCassa() {
		return provvisorioDiCassa;
	}
	public void setProvvisorioDiCassa(ProvvisorioDiCassa provvisorioDiCassa) {
		this.provvisorioDiCassa = provvisorioDiCassa;
	}
	public Integer getIdRegolarizzazioneProvvisorio() {
		return idRegolarizzazioneProvvisorio;
	}
	public void setIdRegolarizzazioneProvvisorio(
			Integer idRegolarizzazioneProvvisorio) {
		this.idRegolarizzazioneProvvisorio = idRegolarizzazioneProvvisorio;
	}	
}

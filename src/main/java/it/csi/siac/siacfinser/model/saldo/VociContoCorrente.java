/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.saldo;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class VociContoCorrente extends EntitaEnte {
	private static final long serialVersionUID = 917216459322016031L;

	private Integer anno;
	private Integer idClassifConto;
	private String contoCorrente;
	private BigDecimal saldoIniziale;
	private List<AddebitoContoCorrente> elencoAddebiti;

	public BigDecimal getSaldoIniziale() {
		return saldoIniziale;
	}

	public void setSaldoIniziale(BigDecimal saldoIniziale) {
		this.saldoIniziale = saldoIniziale;
	}

	public List<AddebitoContoCorrente> getElencoAddebiti() {
		return elencoAddebiti;
	}

	public void setElencoAddebiti(List<AddebitoContoCorrente> elencoAddebiti) {
		this.elencoAddebiti = elencoAddebiti;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public String getContoCorrente() {
		return contoCorrente;
	}

	public void setContoCorrente(String contoCorrente) {
		this.contoCorrente = contoCorrente;
	}

	public Integer getIdClassifConto() {
		return idClassifConto;
	}

	public void setIdClassifConto(Integer idClassifConto) {
		this.idClassifConto = idClassifConto;
	}
}

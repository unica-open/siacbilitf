/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * ImportiUPB, rappresenta le voci relative agli importi dell'UPB
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public abstract class ImportiUPB extends EntitaEnte {

	private static final long serialVersionUID = 3917153972230705156L;
	
	private Integer annoCompetenza;
	private BigDecimal stanziamento;
	private BigDecimal stanziamentoCassa;
	private BigDecimal stanziamentoCassaIniziale;
	private BigDecimal stanziamentoIniziale;
	private BigDecimal stanziamentoProposto;
	private BigDecimal stanziamentoResiduo;
	private BigDecimal stanziamentoResiduoIniziale;
	private BigDecimal fondoPluriennaleVinc;

	public Integer getAnnoCompetenza() {
		return annoCompetenza;
	}

	public void setAnnoCompetenza(Integer annoCompetenza) {
		this.annoCompetenza = annoCompetenza;
	}

	public BigDecimal getFondoPluriennaleVinc() {
		return fondoPluriennaleVinc;
	}

	public void setFondoPluriennaleVinc(BigDecimal fondoPluriennaleVinc) {
		this.fondoPluriennaleVinc = fondoPluriennaleVinc;
	}

	public BigDecimal getStanziamento() {
		return stanziamento;
	}

	public void setStanziamento(BigDecimal stanziamento) {
		this.stanziamento = stanziamento;
	}

	public BigDecimal getStanziamentoCassa() {
		return stanziamentoCassa;
	}

	public void setStanziamentoCassa(BigDecimal stanziamentoCassa) {
		this.stanziamentoCassa = stanziamentoCassa;
	}

	public BigDecimal getStanziamentoCassaIniziale() {
		return stanziamentoCassaIniziale;
	}

	public void setStanziamentoCassaIniziale(BigDecimal stanziamentoCassaIniziale) {
		this.stanziamentoCassaIniziale = stanziamentoCassaIniziale;
	}

	public BigDecimal getStanziamentoIniziale() {
		return stanziamentoIniziale;
	}

	public void setStanziamentoIniziale(BigDecimal stanziamentoIniziale) {
		this.stanziamentoIniziale = stanziamentoIniziale;
	}

	public BigDecimal getStanziamentoProposto() {
		return stanziamentoProposto;
	}

	public void setStanziamentoProposto(BigDecimal stanziamentoProposto) {
		this.stanziamentoProposto = stanziamentoProposto;
	}

	public BigDecimal getStanziamentoResiduo() {
		return stanziamentoResiduo;
	}

	public void setStanziamentoResiduo(BigDecimal stanziamentoResiduo) {
		this.stanziamentoResiduo = stanziamentoResiduo;
	}

	public BigDecimal getStanziamentoResiduoIniziale() {
		return stanziamentoResiduoIniziale;
	}

	public void setStanziamentoResiduoIniziale(
			BigDecimal stanziamentoResiduoIniziale) {
		this.stanziamentoResiduoIniziale = stanziamentoResiduoIniziale;
	}

}

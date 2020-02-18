/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * DatiVariazioneImportoCapitolo
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DatiVariazioneImportoCapitolo implements Serializable {

	private static final long serialVersionUID = 861361995172032558L;
	
	private Integer anno;
	private StatoOperativoVariazioneDiBilancio statoOperativoVariazioneDiBilancio;
	private Long numero;
	private BigDecimal stanziamento;
	private BigDecimal stanziamentoCassa;
	private BigDecimal stanziamentoResiduo;
	
	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	/**
	 * @return the statoOperativoVariazioneDiBilancio
	 */
	public StatoOperativoVariazioneDiBilancio getStatoOperativoVariazioneDiBilancio() {
		return statoOperativoVariazioneDiBilancio;
	}
	/**
	 * @param statoOperativoVariazioneDiBilancio the statoOperativoVariazioneDiBilancio to set
	 */
	public void setStatoOperativoVariazioneDiBilancio(StatoOperativoVariazioneDiBilancio statoOperativoVariazioneDiBilancio) {
		this.statoOperativoVariazioneDiBilancio = statoOperativoVariazioneDiBilancio;
	}
	/**
	 * @return the numero
	 */
	public Long getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	/**
	 * @return the stanziamento
	 */
	public BigDecimal getStanziamento() {
		return stanziamento;
	}
	/**
	 * @param stanziamento the stanziamento to set
	 */
	public void setStanziamento(BigDecimal stanziamento) {
		this.stanziamento = stanziamento;
	}
	/**
	 * @return the stanziamentoCassa
	 */
	public BigDecimal getStanziamentoCassa() {
		return stanziamentoCassa;
	}
	/**
	 * @param stanziamentoCassa the stanziamentoCassa to set
	 */
	public void setStanziamentoCassa(BigDecimal stanziamentoCassa) {
		this.stanziamentoCassa = stanziamentoCassa;
	}
	/**
	 * @return the stanziamentoResiduo
	 */
	public BigDecimal getStanziamentoResiduo() {
		return stanziamentoResiduo;
	}
	/**
	 * @param stanziamentoResiduo the stanziamentoResiduo to set
	 */
	public void setStanziamentoResiduo(BigDecimal stanziamentoResiduo) {
		this.stanziamentoResiduo = stanziamentoResiduo;
	}
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class RitenutaFEL extends EntitaEnte{
	
	private static final long serialVersionUID = 7597366710040903590L;
	
	
	private BigDecimal aliquota;
	private BigDecimal importo;
	private String tipo;
	private String causalePagamento;
	
	private FatturaFEL fattura;
	
	
	/**
	 * @return the aliquota
	 */
	public BigDecimal getAliquota() {
		return aliquota;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @return the causalePagamento
	 */
	public String getCausalePagamento() {
		return causalePagamento;
	}
	
	
	/**
	 * @param aliquota the aliquota to set
	 */
	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @param causalePagamento the causalePagamento to set
	 */
	public void setCausalePagamento(String causalePagamento) {
		this.causalePagamento = causalePagamento;
	}
	/**
	 * @return the fattura
	 */
	public FatturaFEL getFattura() {
		return fattura;
	}
	/**
	 * @param fattura the fattura to set
	 */
	public void setFattura(FatturaFEL fattura) {
		this.fattura = fattura;
	}
	
	
	
	

}

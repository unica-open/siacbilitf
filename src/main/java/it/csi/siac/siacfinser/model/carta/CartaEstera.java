/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.carta;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.codifiche.CodificaFin;

/**
 *  @author
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class CartaEstera extends Entita {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = -69609459013898763L;

	private Integer idCartaEstera;
		
	private String istruzioni;
	private String causalePagamento;
	private String diversoTitolare;
	
	private String tipologiaPagamento;
	private String metodoConsegna;
	
	// Somma di importoValutaEstera delle righe della carta 
	private BigDecimal totaleValutaEstera;
	
	private Date dataValuta;
	
	private CodificaFin commissioniEstero;
	private CodificaFin valuta;
	
	private TipoPagamento tipoPagamento;
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum TipoPagamento {
		Bonifico, Assegno, Altro
	}

	public Integer getIdCartaEstera() {
		return idCartaEstera;
	}
	
	public void setIdCartaEstera(Integer idCartaEstera) {
		this.idCartaEstera = idCartaEstera;
	}
	
	public String getIstruzioni() {
		return istruzioni;
	}
	
	public void setIstruzioni(String istruzioni) {
		this.istruzioni = istruzioni;
	}
	
	public String getCausalePagamento() {
		return causalePagamento;
	}
	
	public void setCausalePagamento(String causalePagamento) {
		this.causalePagamento = causalePagamento;
	}
	
	public BigDecimal getTotaleValutaEstera() {
		return totaleValutaEstera;
	}
	
	public void setTotaleValutaEstera(BigDecimal totaleValutaEstera) {
		this.totaleValutaEstera = totaleValutaEstera;
	}
	
	public CodificaFin getCommissioniEstero() {
		return commissioniEstero;
	}
	
	public void setCommissioniEstero(CodificaFin commissioniEstero) {
		this.commissioniEstero = commissioniEstero;
	}
	
	public CodificaFin getValuta() {
		return valuta;
	}
	
	public void setValuta(CodificaFin valuta) {
		this.valuta = valuta;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataValuta() {
		return dataValuta;
	}

	public void setDataValuta(Date dataValuta) {
		this.dataValuta = dataValuta;
	}

	public String getDiversoTitolare() {
		return diversoTitolare;
	}
	
	public void setDiversoTitolare(String diversoTitolare) {
		this.diversoTitolare = diversoTitolare;
	}

	public String getTipologiaPagamento() {
		return tipologiaPagamento;
	}

	public void setTipologiaPagamento(String tipologiaPagamento) {
		this.tipologiaPagamento = tipologiaPagamento;
	}

	public String getMetodoConsegna() {
		return metodoConsegna;
	}

	public void setMetodoConsegna(String metodoConsegna) {
		this.metodoConsegna = metodoConsegna;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
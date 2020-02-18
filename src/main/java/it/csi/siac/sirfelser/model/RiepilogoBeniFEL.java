/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * RiepilogoBeniFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class RiepilogoBeniFEL extends Entita{
	
	private static final long serialVersionUID = -4698704005581859852L;
	
	private Ente ente;
	private FatturaFEL fattura;
	private NaturaFEL naturaFEL;
	
	private Integer progressivo;
	private BigDecimal aliquotaIva;
	private BigDecimal speseAccessorie;
	private BigDecimal arrotondamento;
	private BigDecimal imponibileImporto;
	private BigDecimal imposta;
	private String esigibilitaIva;
	
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
	/**
	 * @return the naturaFEL
	 */
	public NaturaFEL getNaturaFEL() {
		return naturaFEL;
	}
	/**
	 * @param naturaFEL the naturaFEL to set
	 */
	public void setNaturaFEL(NaturaFEL naturaFEL) {
		this.naturaFEL = naturaFEL;
	}
	/**
	 * @return the progressivo
	 */
	public Integer getProgressivo() {
		return progressivo;
	}
	/**
	 * @param progressivo the progressivo to set
	 */
	public void setProgressivo(Integer progressivo) {
		this.progressivo = progressivo;
	}
	/**
	 * @return the aliquotaIva
	 */
	public BigDecimal getAliquotaIva() {
		return aliquotaIva;
	}
	/**
	 * @return the aliquotaIvaNotNull
	 */
	public BigDecimal getAliquotaIvaNotNull() {
		return aliquotaIva != null ? aliquotaIva : BigDecimal.ZERO;
	}
	/**
	 * @param aliquotaIva the aliquotaIva to set
	 */
	public void setAliquotaIva(BigDecimal aliquotaIva) {
		this.aliquotaIva = aliquotaIva;
	}
	/**
	 * @return the speseAccessorie
	 */
	public BigDecimal getSpeseAccessorie() {
		return speseAccessorie;
	}
	/**
	 * @return the speseAccessorieNotNull
	 */
	public BigDecimal getSpeseAccessorieNotNull() {
		return speseAccessorie != null ? speseAccessorie : BigDecimal.ZERO;
	}
	/**
	 * @param speseAccessorie the speseAccessorie to set
	 */
	public void setSpeseAccessorie(BigDecimal speseAccessorie) {
		this.speseAccessorie = speseAccessorie;
	}
	/**
	 * @return the arrotondamento
	 */
	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}
	/**
	 * @return the arrotondamentoNotNull
	 */
	public BigDecimal getArrotondamentoNotNull() {
		return arrotondamento != null ? arrotondamento : BigDecimal.ZERO;
	}
	/**
	 * @param arrotondamento the arrotondamento to set
	 */
	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento;
	}
	/**
	 * @return the imponibileImporto
	 */
	public BigDecimal getImponibileImporto() {
		return imponibileImporto;
	}
	/**
	 * @return the imponibileImportoNotNull
	 */
	public BigDecimal getImponibileImportoNotNull() {
		return imponibileImporto != null ? imponibileImporto : BigDecimal.ZERO;
	}
	/**
	 * @param imponibileImporto the imponibileImporto to set
	 */
	public void setImponibileImporto(BigDecimal imponibileImporto) {
		this.imponibileImporto = imponibileImporto;
	}
	/**
	 * @return the imposta
	 */
	public BigDecimal getImposta() {
		return imposta;
	}
	/**
	 * @return the impostaNotNull
	 */
	public BigDecimal getImpostaNotNull() {
		return imposta != null ? imposta : BigDecimal.ZERO;
	}
	/**
	 * @param imposta the imposta to set
	 */
	public void setImposta(BigDecimal imposta) {
		this.imposta = imposta;
	}
	/**
	 * @return the esigibilitaIva
	 */
	public String getEsigibilitaIva() {
		return esigibilitaIva;
	}
	/**
	 * @param esigibilitaIva the esigibilitaIva to set
	 */
	public void setEsigibilitaIva(String esigibilitaIva) {
		this.esigibilitaIva = esigibilitaIva;
	}
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

/**
 * Disponibilit&agrave; per il capitolo di uscita gestione
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class DisponibilitaCapitoloUscitaGestione implements Serializable {

	private static final long serialVersionUID = -16762918709298173L;
	
	private BigDecimal disponibilitaVariare;
	private BigDecimal disponibilitaImpegnare;
	private BigDecimal disponibilitaPagare;
	private BigDecimal impegnato;
	private BigDecimal liquidato;
	private BigDecimal pagato;
	// SIAC-4970
	private BigDecimal impegnatoDaRiaccertamento;
	private BigDecimal impegnatoDaEserciziPrec;
	
	// SIAC-6899 
	private BigDecimal finanziatoDaFPV;
	private BigDecimal finanziatoDaAvanzo;
	
	private BigDecimal impegnatoDaPrenotazione;
	private BigDecimal liquidatoDaPrenotazioni;
	
	
	private Long numeroImpegni;
	private Long numeroLiquidazioni;
	private Long numeroOrdinativi;
	
	
	/**
	 * 
	 * @return the finanziatoDaFPV
	 */
	public BigDecimal getFinanziatoDaFPV() {
		return finanziatoDaFPV;
	}
	/**
	 * 
	 * @param finanziatoDaFPV the finanziatoDaFPV to set
	 */
	public void setFinanziatoDaFPV(BigDecimal finanziatoDaFPV) {
		this.finanziatoDaFPV = finanziatoDaFPV;
	}
	
	/**
	 * 
	 * @param finanziatodaFPV the finanziatodaFPV to set
	 */
	public void setFinanziatoDaFPV0(BigDecimal finanziatoDaFPV) {
		this.finanziatoDaFPV = finanziatoDaFPV!=null?finanziatoDaFPV:BigDecimal.ZERO;
	}
	
	/**
	 * 
	 * @return the finanziatoDaAvanzo
	 */
	public BigDecimal getFinanziatoDaAvanzo() {
		return finanziatoDaAvanzo;
	}
	/**
	 * 
	 * @param finanziatoDaAvanzo the finanziatoDaAvanzo to set
	 */
	public void setFinanziatoDaAvanzo(BigDecimal finanziatoDaAvanzo) {
		this.finanziatoDaAvanzo = finanziatoDaAvanzo;
	}
	
	/**
	 * 
	 * @param finanziatoDaAvanzo the finanziatoDaAvanzo to set
	 */
	public void setFinanziatoDaAvanzo0(BigDecimal finanziatoDaAvanzo) {
		this.finanziatoDaAvanzo = finanziatoDaAvanzo!=null?finanziatoDaAvanzo:BigDecimal.ZERO;
	}
	
	/**
	 * @return the disponibilitaVariare
	 */
	public BigDecimal getDisponibilitaVariare() {
		return disponibilitaVariare;
	}
	/**
	 * @param disponibilitaVariare the disponibilitaVariare to set
	 */
	public void setDisponibilitaVariare(BigDecimal disponibilitaVariare) {
		this.disponibilitaVariare = disponibilitaVariare;
	}
	/**
	 * @param disponibilitaVariare the disponibilitaVariare to set
	 */
	public void setDisponibilitaVariare0(BigDecimal disponibilitaVariare) {
		this.disponibilitaVariare = disponibilitaVariare!=null?disponibilitaVariare:BigDecimal.ZERO;
	}
	/**
	 * @return the disponibilitaImpegnare
	 */
	public BigDecimal getDisponibilitaImpegnare() {
		return disponibilitaImpegnare;
	}
	/**
	 * @param disponibilitaImpegnare the disponibilitaImpegnare to set
	 */
	public void setDisponibilitaImpegnare(BigDecimal disponibilitaImpegnare) {
		this.disponibilitaImpegnare = disponibilitaImpegnare;
	}
	/**
	 * @param disponibilitaImpegnare the disponibilitaImpegnare to set
	 */
	public void setDisponibilitaImpegnare0(BigDecimal disponibilitaImpegnare) {
		this.disponibilitaImpegnare = disponibilitaImpegnare!=null?disponibilitaImpegnare:BigDecimal.ZERO;
	}
	/**
	 * @return the disponibilitaPagare
	 */
	public BigDecimal getDisponibilitaPagare() {
		return disponibilitaPagare;
	}
	/**
	 * @param disponibilitaPagare the disponibilitaPagare to set
	 */
	public void setDisponibilitaPagare(BigDecimal disponibilitaPagare) {
		this.disponibilitaPagare = disponibilitaPagare;
	}
	/**
	 * @param disponibilitaPagare the disponibilitaPagare to set
	 */
	public void setDisponibilitaPagare0(BigDecimal disponibilitaPagare) {
		this.disponibilitaPagare = disponibilitaPagare!=null?disponibilitaPagare:BigDecimal.ZERO;
	}
	/**
	 * @return the impegnato
	 */
	public BigDecimal getImpegnato() {
		return impegnato;
	}
	/**
	 * @param impegnato the impegnato to set
	 */
	public void setImpegnato(BigDecimal impegnato) {
		this.impegnato = impegnato;
	}
	/**
	 * @param impegnato the impegnato to set
	 */
	public void setImpegnato0(BigDecimal impegnato) {
		this.impegnato = impegnato!=null?impegnato:BigDecimal.ZERO;
	}
	/**
	 * @return the liquidato
	 */
	public BigDecimal getLiquidato() {
		return liquidato;
	}
	/**
	 * @param liquidato the liquidato to set
	 */
	public void setLiquidato(BigDecimal liquidato) {
		this.liquidato = liquidato;
	}
	/**
	 * @param liquidato the liquidato to set
	 */
	public void setLiquidato0(BigDecimal liquidato) {
		this.liquidato = liquidato!=null?liquidato:BigDecimal.ZERO;
	}
	/**
	 * @return the pagato
	 */
	public BigDecimal getPagato() {
		return pagato;
	}
	/**
	 * @param pagato the pagato to set
	 */
	public void setPagato(BigDecimal pagato) {
		this.pagato = pagato;
	}
	/**
	 * @param pagato the pagato to set
	 */
	public void setPagato0(BigDecimal pagato) {
		this.pagato = pagato!=null?pagato:BigDecimal.ZERO;
	}
	/**
	 * @return the impegnatoDaRiaccertamento
	 */
	public BigDecimal getImpegnatoDaRiaccertamento() {
		return impegnatoDaRiaccertamento;
	}
	/**
	 * @param impegnatoDaRiaccertamento the impegnatoDaRiaccertamento to set
	 */
	public void setImpegnatoDaRiaccertamento(BigDecimal impegnatoDaRiaccertamento) {
		this.impegnatoDaRiaccertamento = impegnatoDaRiaccertamento;
	}
	/**
	 * @param impegnatoDaRiaccertamento the impegnatoDaRiaccertamento to set
	 */
	public void setImpegnatoDaRiaccertamento0(BigDecimal impegnatoDaRiaccertamento) {
		this.impegnatoDaRiaccertamento = impegnatoDaRiaccertamento!=null?impegnatoDaRiaccertamento:BigDecimal.ZERO;
	}
	/**
	 * @return the impegnatoDaEserciziPrec
	 */
	public BigDecimal getImpegnatoDaEserciziPrec() {
		return impegnatoDaEserciziPrec;
	}
	/**
	 * @param impegnatoDaEserciziPrec the impegnatoDaEserciziPrec to set
	 */
	public void setImpegnatoDaEserciziPrec(BigDecimal impegnatoDaEserciziPrec) {
		this.impegnatoDaEserciziPrec = impegnatoDaEserciziPrec;
	}
	/**
	 * @param impegnatoDaEserciziPrec the impegnatoDaEserciziPrec to set
	 */
	public void setImpegnatoDaEserciziPrec0(BigDecimal impegnatoDaEserciziPrec) {
		this.impegnatoDaEserciziPrec = impegnatoDaEserciziPrec!=null?impegnatoDaEserciziPrec:BigDecimal.ZERO;
	}
	/**
	 * @return the impegnatoDaPrenotazione
	 */
	public BigDecimal getImpegnatoDaPrenotazione() {
		return impegnatoDaPrenotazione;
	}
	/**
	 * @param impegnatoDaPrenotazione the impegnatoDaPrenotazione to set
	 */
	public void setImpegnatoDaPrenotazione(BigDecimal impegnatoDaPrenotazione) {
		this.impegnatoDaPrenotazione = impegnatoDaPrenotazione;
	}
	/**
	 * @param impegnatoDaPrenotazione the impegnatoDaPrenotazione to set
	 */
	public void setImpegnatoDaPrenotazione0(BigDecimal impegnatoDaPrenotazione) {
		this.impegnatoDaPrenotazione = impegnatoDaPrenotazione!=null?impegnatoDaPrenotazione:BigDecimal.ZERO;
	}
	/**
	 * @return the liquidatoDaPrenotazioni
	 */
	public BigDecimal getLiquidatoDaPrenotazioni() {
		return liquidatoDaPrenotazioni;
	}
	/**
	 * @param liquidatoDaPrenotazioni the liquidatoDaPrenotazioni to set
	 */
	public void setLiquidatoDaPrenotazioni(BigDecimal liquidatoDaPrenotazioni) {
		this.liquidatoDaPrenotazioni = liquidatoDaPrenotazioni;
	}
	/**
	 * @param liquidatoDaPrenotazioni the liquidatoDaPrenotazioni to set
	 */
	public void setLiquidatoDaPrenotazioni0(BigDecimal liquidatoDaPrenotazioni) {
		this.liquidatoDaPrenotazioni = liquidatoDaPrenotazioni!=null?liquidatoDaPrenotazioni:BigDecimal.ZERO;
	}
	/**
	 * @return the numeroImpegni
	 */
	public Long getNumeroImpegni() {
		return numeroImpegni;
	}
	/**
	 * @param numeroImpegni the numeroImpegni to set
	 */
	public void setNumeroImpegni(Long numeroImpegni) {
		this.numeroImpegni = numeroImpegni;
	}
	/**
	 * @return the numeroLiquidazioni
	 */
	public Long getNumeroLiquidazioni() {
		return numeroLiquidazioni;
	}
	/**
	 * @param numeroLiquidazioni the numeroLiquidazioni to set
	 */
	public void setNumeroLiquidazioni(Long numeroLiquidazioni) {
		this.numeroLiquidazioni = numeroLiquidazioni;
	}
	/**
	 * @return the numeroOrdinativi
	 */
	public Long getNumeroOrdinativi() {
		return numeroOrdinativi;
	}
	/**
	 * @param numeroOrdinativi the numeroOrdinativi to set
	 */
	public void setNumeroOrdinativi(Long numeroOrdinativi) {
		this.numeroOrdinativi = numeroOrdinativi;
	}
	
}

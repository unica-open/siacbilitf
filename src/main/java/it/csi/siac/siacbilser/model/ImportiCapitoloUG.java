/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * ImportiCapitoloUG (uscita gestione)
 * 
 * @author rmontuori 
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiCapitoloUG extends ImportiCapitolo {

	private static final long serialVersionUID = 9183300381739432089L;

	@ImportoPersistente private BigDecimal stanziamentoAsset = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoCassaAsset = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoResAsset = BigDecimal.ZERO;	
	//new 1.2 //default non caricato 
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.totalePagato) private BigDecimal totalePagato = BigDecimal.ZERO;
	//new 1.2 //default non caricato
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaPagare) private BigDecimal disponibilitaPagare = BigDecimal.ZERO;
	
//	@Deprecated
//	@ImportoDerivato(value="fnc_siac_disponibilitaimpegnareug")  private BigDecimal disponibilitaImpegnare = BigDecimal.ZERO; //new 1.2
	
	//new 1.7
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno1) private BigDecimal disponibilitaImpegnareAnno1 = BigDecimal.ZERO;
	//new 1.7
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno2) private BigDecimal disponibilitaImpegnareAnno2 = BigDecimal.ZERO;
	//new 1.7
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno3) private BigDecimal disponibilitaImpegnareAnno3 = BigDecimal.ZERO;
	
	// SIAC-4585
	@ImportoPersistente private BigDecimal massimoImpegnabile;
	
	//SIAC-7220
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno1UG) private BigDecimal diCuiImpegnatoAnno1UG = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno2UG) private BigDecimal diCuiImpegnatoAnno2UG = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno3UG) private BigDecimal diCuiImpegnatoAnno3UG = BigDecimal.ZERO;
	//

	public BigDecimal getStanziamentoAsset() {
		return stanziamentoAsset;
	}

	public void setStanziamentoAsset(BigDecimal stanziamentoAsset) {
		this.stanziamentoAsset = stanziamentoAsset;
	}

	public BigDecimal getStanziamentoCassaAsset() {
		return stanziamentoCassaAsset;
	}

	public void setStanziamentoCassaAsset(BigDecimal stanziamentoCassaAsset) {
		this.stanziamentoCassaAsset = stanziamentoCassaAsset;
	}

	public BigDecimal getStanziamentoResAsset() {
		return stanziamentoResAsset;
	}

	public void setStanziamentoResAsset(BigDecimal stanziamentoResAsset) {
		this.stanziamentoResAsset = stanziamentoResAsset;
	}	
	
	public BigDecimal getTotalePagato() {
		return totalePagato;
	}

	public void setTotalePagato(BigDecimal totalePagato) {
		this.totalePagato = totalePagato;
	}

	@Deprecated
	public BigDecimal getDisponibilitaImpegnare() {
		return getDisponibilitaImpegnareAnno1();
	}

	@Deprecated
	public void setDisponibilitaImpegnare(BigDecimal disponibilitaImpegnare) {
		//setDisponibilitaImpegnareAnno1(disponibilitaImpegnare);
	}

	public BigDecimal getDisponibilitaPagare() {
		return disponibilitaPagare;
	}

	public void setDisponibilitaPagare(BigDecimal disponibilitaPagare) {
		this.disponibilitaPagare = disponibilitaPagare;
	}

	public BigDecimal getDisponibilitaImpegnareAnno1() {
		return disponibilitaImpegnareAnno1;
	}

	public void setDisponibilitaImpegnareAnno1(
			BigDecimal disponibilitaImpegnareAnno1) {
		this.disponibilitaImpegnareAnno1 = disponibilitaImpegnareAnno1;
	}

	public BigDecimal getDisponibilitaImpegnareAnno2() {
		return disponibilitaImpegnareAnno2;
	}

	public void setDisponibilitaImpegnareAnno2(
			BigDecimal disponibilitaImpegnareAnno2) {
		this.disponibilitaImpegnareAnno2 = disponibilitaImpegnareAnno2;
	}

	public BigDecimal getDisponibilitaImpegnareAnno3() {
		return disponibilitaImpegnareAnno3;
	}

	public void setDisponibilitaImpegnareAnno3(
			BigDecimal disponibilitaImpegnareAnno3) {
		this.disponibilitaImpegnareAnno3 = disponibilitaImpegnareAnno3;
	}

	/**
	 * @return the massimoImpegnabile
	 */
	public BigDecimal getMassimoImpegnabile() {
		return massimoImpegnabile;
	}

	/**
	 * @param massimoImpegnabile the massimoImpegnabile to set
	 */
	public void setMassimoImpegnabile(BigDecimal massimoImpegnabile) {
		this.massimoImpegnabile = massimoImpegnabile;
	}

	public void addStanziamentoCassaAsset(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoCassaAsset==null){
			this.stanziamentoCassaAsset = BigDecimal.ZERO;
		}
		this.stanziamentoCassaAsset = this.stanziamentoCassaAsset.add(stanziamentoAsset);
	}
	
	public void addStanziamentoAsset(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoAsset==null){
			this.stanziamentoAsset = BigDecimal.ZERO;
		}
		this.stanziamentoAsset = this.stanziamentoAsset.add(value);
	}
	
	public void addStanziamentoResAsset(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.stanziamentoResAsset==null){
			this.stanziamentoResAsset = BigDecimal.ZERO;
		}
		this.stanziamentoResAsset = this.stanziamentoResAsset.add(value);
	}
	
	public void addTotalePagato(BigDecimal value) {
		if(value == null){
			return;
		}
		if(this.totalePagato==null){
			this.totalePagato = BigDecimal.ZERO;
		}
		this.totalePagato = this.totalePagato.add(value);
	}

	
	// ============================================================ SIAC-7220 ======================================================== //

	/**
	 * @return the diCuiImpegnatoAnno1UG
	 */
	public BigDecimal getDiCuiImpegnatoAnno1UG() {
		return diCuiImpegnatoAnno1UG;
	}
	
	/**
	 * @param diCuiImpegnatoAnno1UG the diCuiImpegnatoAnno1UG to set
	 */
	public void setDiCuiImpegnatoAnno1UG(BigDecimal diCuiImpegnatoAnno1UG) {
		this.diCuiImpegnatoAnno1UG = diCuiImpegnatoAnno1UG;
	}
	
	/**
	 * @return the diCuiImpegnatoAnno2UG
	 */
	public BigDecimal getDiCuiImpegnatoAnno2UG() {
		return diCuiImpegnatoAnno2UG;
	}
	
	/**
	 * @param diCuiImpegnatoAnno2UG the diCuiImpegnatoAnno2UG to set
	 */
	public void setDiCuiImpegnatoAnno2UG(BigDecimal diCuiImpegnatoAnno2UG) {
		this.diCuiImpegnatoAnno2UG = diCuiImpegnatoAnno2UG;
	}
	
	/**
	 * @return the diCuiImpegnatoAnno3UG
	 */
	public BigDecimal getDiCuiImpegnatoAnno3UG() {
		return diCuiImpegnatoAnno3UG;
	}
	
	/**
	 * @param diCuiImpegnatoAnno3UG the diCuiImpegnatoAnno3UG to set
	 */
	public void setDiCuiImpegnatoAnno3UG(BigDecimal diCuiImpegnatoAnno3UG) {
		this.diCuiImpegnatoAnno3UG = diCuiImpegnatoAnno3UG;
	}
	
	// ============================================================ SIAC-7220 ======================================================== //
	
}

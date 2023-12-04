/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * ImportiCapitolo entrata gestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiCapitoloEG extends ImportiCapitolo {

	private static final long serialVersionUID = -8684144787179523143L;

	@ImportoPersistente private BigDecimal stanziamentoAsset = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoCassaAsset = BigDecimal.ZERO;
	@ImportoPersistente private BigDecimal stanziamentoResAsset = BigDecimal.ZERO;
	//new 1.2     //default non caricato
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.totaleIncassato) private BigDecimal totaleIncassato = BigDecimal.ZERO;
	//new 1.2 //default non caricato
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaIncassare) private BigDecimal disponibilitaIncassare = BigDecimal.ZERO;
	
//	@Deprecated
//	@ImportoDerivato(value="fnc_siac_disponibilitaaccertareeg") private BigDecimal disponibilitaAccertare = BigDecimal.ZERO;	//new 1.2
	
	//new 1.7
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaAccertareAnno1)  private BigDecimal disponibilitaAccertareAnno1 = BigDecimal.ZERO;
	//new 1.7
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaAccertareAnno2)  private BigDecimal disponibilitaAccertareAnno2 = BigDecimal.ZERO;
	//new 1.7 
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaAccertareAnno3)  private BigDecimal disponibilitaAccertareAnno3 = BigDecimal.ZERO;
	
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

	public BigDecimal getTotaleIncassato() {
		return totaleIncassato;
	}

	public void setTotaleIncassato(BigDecimal totaleIncassato) {
		this.totaleIncassato = totaleIncassato;
	}	

	@Deprecated
	public BigDecimal getDisponibilitaAccertare() {
		return getDisponibilitaAccertareAnno1();
	}

	@Deprecated
	public void setDisponibilitaAccertare(BigDecimal disponibilitaAccertare) {
		//setDisponibilitaAccertareAnno1(disponibilitaAccertare);
	}

	public BigDecimal getDisponibilitaIncassare() {
		return disponibilitaIncassare;
	}

	public void setDisponibilitaIncassare(BigDecimal disponibilitaIncassare) {
		this.disponibilitaIncassare = disponibilitaIncassare;
	}

	public BigDecimal getDisponibilitaAccertareAnno1() {
		return disponibilitaAccertareAnno1;
	}

	public void setDisponibilitaAccertareAnno1(
			BigDecimal disponibilitaAccertareAnno1) {
		this.disponibilitaAccertareAnno1 = disponibilitaAccertareAnno1;
	}

	public BigDecimal getDisponibilitaAccertareAnno2() {
		return disponibilitaAccertareAnno2;
	}

	public void setDisponibilitaAccertareAnno2(
			BigDecimal disponibilitaAccertareAnno2) {
		this.disponibilitaAccertareAnno2 = disponibilitaAccertareAnno2;
	}

	public BigDecimal getDisponibilitaAccertareAnno3() {
		return disponibilitaAccertareAnno3;
	}

	public void setDisponibilitaAccertareAnno3(
			BigDecimal disponibilitaAccertareAnno3) {
		this.disponibilitaAccertareAnno3 = disponibilitaAccertareAnno3;
	}

	public void addStanziamentoAsset(BigDecimal importo) {
		if(importo == null){
			return;
		}
		if(this.stanziamentoAsset==null){
			this.stanziamentoAsset = BigDecimal.ZERO;
		}
		this.stanziamentoAsset = this.stanziamentoAsset.add(importo);
	}
	
	public void addStanziamentoCassaAsset(BigDecimal importo) {
		if(importo == null){
			return;
		}
		if(this.stanziamentoCassaAsset==null){
			this.stanziamentoCassaAsset = BigDecimal.ZERO;
		}
		this.stanziamentoCassaAsset = this.stanziamentoCassaAsset.add(importo);
	}
	
	public void addStanziamentoResAsset(BigDecimal importo) {
		if(importo == null){
			return;
		}
		if(this.stanziamentoResAsset==null){
			this.stanziamentoResAsset = BigDecimal.ZERO;
		}
		this.stanziamentoResAsset = this.stanziamentoResAsset.add(importo);
	}
	
	public void addTotaleIncassato(BigDecimal importo) {
		if(importo == null){
			return;
		}
		if(this.totaleIncassato==null){
			this.totaleIncassato = BigDecimal.ZERO;
		}
		this.totaleIncassato = this.totaleIncassato.add(importo);
	}
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * ImportiCapitolo entrata previsione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiCapitoloEP extends ImportiCapitolo {

	private static final long serialVersionUID = -8428013070346646116L;

//	@ImportoDerivato(value="fnc_siac_dicuiaccertatoep") private BigDecimal diCuiAccertato = BigDecimal.ZERO; //eliminato 20150408
	
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiAccertatoAnno1) private BigDecimal diCuiAccertatoAnno1 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiAccertatoAnno2) private BigDecimal diCuiAccertatoAnno2 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiAccertatoAnno3) private BigDecimal diCuiAccertatoAnno3 = BigDecimal.ZERO;
	
//	@ImportoDerivato(value="fnc_siac_dicuiaccertatoannoprecep") private BigDecimal diCuiAccertatoAnnoPrec = BigDecimal.ZERO; //eliminato 20150408
	//new 1.2 c'è nell'equivalente
	//private BigDecimal stanziamentoAnnoPrecDef = BigDecimal.ZERO;

	@Deprecated
	public BigDecimal getDiCuiAccertato() {
		return getDiCuiAccertatoAnno1();
	}

	@Deprecated
	public void setDiCuiAccertato(BigDecimal diCuiAccertato) {
//		setDiCuiAccertatoAnno1(diCuiAccertato);
	}

//	public BigDecimal getDiCuiAccertatoAnnoPrec() {
//		return diCuiAccertatoAnnoPrec;
//	}
//
//	public void setDiCuiAccertatoAnnoPrec(BigDecimal diCuiAccertatoAnnoPrec) {
//		this.diCuiAccertatoAnnoPrec = diCuiAccertatoAnnoPrec;
//	}	

//	public BigDecimal getStanziamentoAnnoPrecDef() {
//		return stanziamentoAnnoPrecDef;
//	}
//
//	public void setStanziamentoAnnoPrecDef(BigDecimal stanziamentoAnnoPrecDef) {
//		this.stanziamentoAnnoPrecDef = stanziamentoAnnoPrecDef;
//	}
	
	
	public void addDiCuiAccertato(BigDecimal daAggiungere) {
		addDiCuiAccertatoAnno1(daAggiungere);
	}

	public void addDiCuiAccertatoAnno1(BigDecimal daAggiungere) {
		if(daAggiungere == null){
			return;
		}
		if(this.diCuiAccertatoAnno1==null){
			this.diCuiAccertatoAnno1 = BigDecimal.ZERO;
		}
		this.diCuiAccertatoAnno1 = this.diCuiAccertatoAnno1.add(daAggiungere);
		
	}
	
	public void addDiCuiAccertatoAnno2(BigDecimal daAggiungere) {
		if(daAggiungere == null){
			return;
		}
		if(this.diCuiAccertatoAnno2==null){
			this.diCuiAccertatoAnno2 = BigDecimal.ZERO;
		}
		this.diCuiAccertatoAnno2 = this.diCuiAccertatoAnno2.add(daAggiungere);
		
	}

	public void addDiCuiAccertatoAnno3(BigDecimal daAggiungere) {
		if(daAggiungere == null){
			return;
		}
		if(this.diCuiAccertatoAnno3==null){
			this.diCuiAccertatoAnno3 = BigDecimal.ZERO;
		}
		this.diCuiAccertatoAnno3 = this.diCuiAccertatoAnno3.add(daAggiungere);
		
	}

//	public void addDiCuiAccertatoAnnoPrec(BigDecimal daAggiungere) {
//		if(daAggiungere == null){
//			return;
//		}
//		if(this.diCuiAccertatoAnnoPrec==null){
//			this.diCuiAccertatoAnnoPrec = BigDecimal.ZERO;
//		}
//		this.diCuiAccertatoAnnoPrec = this.diCuiAccertatoAnnoPrec.add(daAggiungere);
//	}


	/**
	 * @return the diCuiAccertatoAnno1
	 */
	public BigDecimal getDiCuiAccertatoAnno1() {
		return diCuiAccertatoAnno1;
	}

	/**
	 * @param diCuiAccertatoAnno1 the diCuiAccertatoAnno1 to set
	 */
	public void setDiCuiAccertatoAnno1(BigDecimal diCuiAccertatoAnno1) {
		this.diCuiAccertatoAnno1 = diCuiAccertatoAnno1;
	}

	/**
	 * @return the diCuiAccertatoAnno2
	 */
	public BigDecimal getDiCuiAccertatoAnno2() {
		return diCuiAccertatoAnno2;
	}

	/**
	 * @param diCuiAccertatoAnno2 the diCuiAccertatoAnno2 to set
	 */
	public void setDiCuiAccertatoAnno2(BigDecimal diCuiAccertatoAnno2) {
		this.diCuiAccertatoAnno2 = diCuiAccertatoAnno2;
	}

	/**
	 * @return the diCuiAccertatoAnno3
	 */
	public BigDecimal getDiCuiAccertatoAnno3() {
		return diCuiAccertatoAnno3;
	}

	/**
	 * @param diCuiAccertatoAnno3 the diCuiAccertatoAnno3 to set
	 */
	public void setDiCuiAccertatoAnno3(BigDecimal diCuiAccertatoAnno3) {
		this.diCuiAccertatoAnno3 = diCuiAccertatoAnno3;
	}

}

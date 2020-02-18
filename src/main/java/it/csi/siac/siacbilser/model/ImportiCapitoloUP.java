/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * ImportiCapitolo uscita previsione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiCapitoloUP extends ImportiCapitolo {

	private static final long serialVersionUID = -349756114473457504L;

	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno1) private BigDecimal diCuiImpegnatoAnno1 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno2) private BigDecimal diCuiImpegnatoAnno2 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno3) private BigDecimal diCuiImpegnatoAnno3 = BigDecimal.ZERO;
	
    @Deprecated
	public BigDecimal getDiCuiImpegnato() {
		return getDiCuiImpegnatoAnno1();
	}
	
	@Deprecated
	public void setDiCuiImpegnato(BigDecimal diCuiImpegnato) {
		//setDiCuiImpegnatoAnno1(diCuiImpegnato);
	}
	
	public BigDecimal getDisponibilitaImpegnare() {
		return getStanziamento().subtract(diCuiImpegnatoAnno1);
	}
	
	public void addDiCuiImpegnato (BigDecimal daAggiungere) {
		addDiCuiImpegnatoAnno1(daAggiungere);
	}
	
	
	public void addDiCuiImpegnatoAnno1 (BigDecimal daAggiungere) {
		if(daAggiungere == null){
			return;
		}
		if(this.diCuiImpegnatoAnno1==null){
			this.diCuiImpegnatoAnno1 = BigDecimal.ZERO;
		}
		this.diCuiImpegnatoAnno1 = this.diCuiImpegnatoAnno1.add(daAggiungere);
	}
	
	public void addDiCuiImpegnatoAnno2 (BigDecimal daAggiungere) {
		if(daAggiungere == null){
			return;
		}
		if(this.diCuiImpegnatoAnno2==null){
			this.diCuiImpegnatoAnno2 = BigDecimal.ZERO;
		}
		this.diCuiImpegnatoAnno2 = this.diCuiImpegnatoAnno2.add(daAggiungere);
	}
	
	public void addDiCuiImpegnatoAnno3 (BigDecimal daAggiungere) {
		if(daAggiungere == null){
			return;
		}
		if(this.diCuiImpegnatoAnno3==null){
			this.diCuiImpegnatoAnno3 = BigDecimal.ZERO;
		}
		this.diCuiImpegnatoAnno3 = this.diCuiImpegnatoAnno3.add(daAggiungere);
	}
	
	
//	public void addDiCuiImpegnatoAnnoPrec (BigDecimal daAggiungere) {
//	if(daAggiungere == null){
//		return;
//	}
//	if(this.diCuiImpegnatoAnnoPrec==null){
//		this.diCuiImpegnatoAnnoPrec = BigDecimal.ZERO;
//	}
//	this.diCuiImpegnatoAnnoPrec = this.diCuiImpegnatoAnnoPrec.add(daAggiungere);
//}


	/**
	 * @return the diCuiImpegnatoAnno1
	 */
	public BigDecimal getDiCuiImpegnatoAnno1() {
		return diCuiImpegnatoAnno1;
	}

	/**
	 * @param diCuiImpegnatoAnno1 the diCuiImpegnatoAnno1 to set
	 */
	public void setDiCuiImpegnatoAnno1(BigDecimal diCuiImpegnatoAnno1) {
		this.diCuiImpegnatoAnno1 = diCuiImpegnatoAnno1;
	}

	/**
	 * @return the diCuiImpegnatoAnno2
	 */
	public BigDecimal getDiCuiImpegnatoAnno2() {
		return diCuiImpegnatoAnno2;
	}

	/**
	 * @param diCuiImpegnatoAnno2 the diCuiImpegnatoAnno2 to set
	 */
	public void setDiCuiImpegnatoAnno2(BigDecimal diCuiImpegnatoAnno2) {
		this.diCuiImpegnatoAnno2 = diCuiImpegnatoAnno2;
	}

	/**
	 * @return the diCuiImpegnatoAnno3
	 */
	public BigDecimal getDiCuiImpegnatoAnno3() {
		return diCuiImpegnatoAnno3;
	}

	/**
	 * @param diCuiImpegnatoAnno3 the diCuiImpegnatoAnno3 to set
	 */
	public void setDiCuiImpegnatoAnno3(BigDecimal diCuiImpegnatoAnno3) {
		this.diCuiImpegnatoAnno3 = diCuiImpegnatoAnno3;
	}
	

	

}

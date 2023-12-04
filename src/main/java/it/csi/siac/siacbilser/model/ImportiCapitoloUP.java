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
	
	
	//SIAC-7349 - SR200 - Start - MR/GS 17/04/2020 - Importi derivati per l'impegnato anno prec
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnnoPrec) private BigDecimal diCuiImpegnatoAnnoPrec = BigDecimal.ZERO;
	//SIAC-7349 End
	//SIAC-7349 - SR200 - Start - MR/GS 17/04/2020 - Importi derivati per l'impegnato anno prec
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnniSucc) private BigDecimal diCuiImpegnatoAnniSucc = BigDecimal.ZERO;
	//SIAC-7349 End
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno1) private BigDecimal diCuiImpegnatoAnno1 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno2) private BigDecimal diCuiImpegnatoAnno2 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno3) private BigDecimal diCuiImpegnatoAnno3 = BigDecimal.ZERO;
	
	//SIAC-7349 - SR200 - Start - MR/GS 06/04/2020 - Importi derivati per la disponibilita ad impegnare dei capitoli
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaImpegnareUPAnno1) private BigDecimal disponibilitaImpegnareUPAnno1 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaImpegnareUPAnno2) private BigDecimal disponibilitaImpegnareUPAnno2 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.disponibilitaImpegnareUPAnno3) private BigDecimal disponibilitaImpegnareUPAnno3 = BigDecimal.ZERO;
    //SIAC-7349 - End
	
	//SIAC-7349 MR SR50.riciclo 21/05/2020 calcolo dell'impegnato per la tabella di gestione equivalente a quella di previsione
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.impegnatoEffettivoUPAnno1) private BigDecimal impegnatoEffettivoUPAnno1 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.impegnatoEffettivoUPAnno2) private BigDecimal impegnatoEffettivoUPAnno2 = BigDecimal.ZERO;
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.impegnatoEffettivoUPAnno3) private BigDecimal impegnatoEffettivoUPAnno3 = BigDecimal.ZERO;		
	//END SIAC-7349
	//SIAC-8469
	@ImportoDerivato(value=ImportoDerivatoFunctionEnum.impegnatoresiduoEffettivoUP) private BigDecimal residuoEffettivoFinaleUP = BigDecimal.ZERO;
		
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

	public BigDecimal getDiCuiImpegnatoAnnoPrec() {
		return diCuiImpegnatoAnnoPrec;
	}

	public void setDiCuiImpegnatoAnnoPrec(BigDecimal diCuiImpegnatoAnnoPrec) {
		this.diCuiImpegnatoAnnoPrec = diCuiImpegnatoAnnoPrec;
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

	public BigDecimal getDisponibilitaImpegnareUPAnno1() {
		return disponibilitaImpegnareUPAnno1;
	}

	public void setDisponibilitaImpegnareUPAnno1(BigDecimal disponibilitaImpegnareUPAnno1) {
		this.disponibilitaImpegnareUPAnno1 = disponibilitaImpegnareUPAnno1;
	}

	public BigDecimal getDisponibilitaImpegnareUPAnno2() {
		return disponibilitaImpegnareUPAnno2;
	}

	public void setDisponibilitaImpegnareUPAnno2(BigDecimal disponibilitaImpegnareUPAnno2) {
		this.disponibilitaImpegnareUPAnno2 = disponibilitaImpegnareUPAnno2;
	}

	public BigDecimal getDisponibilitaImpegnareUPAnno3() {
		return disponibilitaImpegnareUPAnno3;
	}

	public void setDisponibilitaImpegnareUPAnno3(BigDecimal disponibilitaImpegnareUPAnno3) {
		this.disponibilitaImpegnareUPAnno3 = disponibilitaImpegnareUPAnno3;
	}

	public BigDecimal getDiCuiImpegnatoAnniSucc() {
		return diCuiImpegnatoAnniSucc;
	}

	public void setDiCuiImpegnatoAnniSucc(BigDecimal diCuiImpegnatoAnniSucc) {
		this.diCuiImpegnatoAnniSucc = diCuiImpegnatoAnniSucc;
	}

	public BigDecimal getImpegnatoEffettivoUPAnno1() {
		return impegnatoEffettivoUPAnno1;
	}

	public void setImpegnatoEffettivoUPAnno1(BigDecimal impegnatoEffettivoUPAnno1) {
		this.impegnatoEffettivoUPAnno1 = impegnatoEffettivoUPAnno1;
	}

	public BigDecimal getImpegnatoEffettivoUPAnno2() {
		return impegnatoEffettivoUPAnno2;
	}

	public void setImpegnatoEffettivoUPAnno2(BigDecimal impegnatoEffettivoUPAnno2) {
		this.impegnatoEffettivoUPAnno2 = impegnatoEffettivoUPAnno2;
	}

	public BigDecimal getImpegnatoEffettivoUPAnno3() {
		return impegnatoEffettivoUPAnno3;
	}

	public void setImpegnatoEffettivoUPAnno3(BigDecimal impegnatoEffettivoUPAnno3) {
		this.impegnatoEffettivoUPAnno3 = impegnatoEffettivoUPAnno3;
	}

	public BigDecimal getResiduoEffettivoFinaleUP() {
		return residuoEffettivoFinaleUP;
	}

	public void setResiduoEffettivoFinaleUP(BigDecimal residuoEffettivoFinaleUP) {
		this.residuoEffettivoFinaleUP = residuoEffettivoFinaleUP;
	}

}

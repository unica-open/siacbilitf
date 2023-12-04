/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Enumera tutti fields della classe {@link ImportiCapitolo} e delle sue classi figlie.
 * 
 * @author Domenico
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum ImportiCapitoloEnum {
	
	//ImportiCapitolo
	impegnatoPlur(ImportoDerivatoFunctionEnum.impegnatoPlur),
	disponibilitaVariareAnno1(ImportoDerivatoFunctionEnum.disponibilitaVariareAnno1),
	disponibilitaVariareAnno2(ImportoDerivatoFunctionEnum.disponibilitaVariareAnno2),
	disponibilitaVariareAnno3(ImportoDerivatoFunctionEnum.disponibilitaVariareAnno3),
	disponibilitaVariareCassa(ImportoDerivatoFunctionEnum.disponibilitaVariareCassa),
	
	//ImportiCapitoloUG
	totalePagato(ImportoDerivatoFunctionEnum.totalePagato),
	totalePagatoSuResidui(ImportoDerivatoFunctionEnum.totalePagatoSuResidui),
	disponibilitaPagare(ImportoDerivatoFunctionEnum.disponibilitaPagare),
	disponibilitaImpegnareAnno1(ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno1),
	disponibilitaImpegnareAnno2(ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno2),
	disponibilitaImpegnareAnno3(ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno3),
	
	//ImportiCapitoloEG
	totaleIncassato(ImportoDerivatoFunctionEnum.totaleIncassato),
	disponibilitaIncassare(ImportoDerivatoFunctionEnum.disponibilitaIncassare),
	disponibilitaAccertareAnno1(ImportoDerivatoFunctionEnum.disponibilitaAccertareAnno1),
	disponibilitaAccertareAnno2(ImportoDerivatoFunctionEnum.disponibilitaAccertareAnno2),
	disponibilitaAccertareAnno3(ImportoDerivatoFunctionEnum.disponibilitaAccertareAnno3),
	
	//ImportiCapitoloUP
	//SIAC-7349 -Start - SR200 - MR/GS - Importi derivati per calcolo dicuiimpegnato anno prec
	diCuiImpegnatoAnnoPrec(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnnoPrec),
	diCuiImpegnatoUGAnnoPrec(ImportoDerivatoFunctionEnum.diCuiImpegnatoUGAnnoPrec),
	//SIAC-7349
	//SIAC-7349 -Start - SR200 - MR/GS - Importi derivati per calcolo dicuiimpegnato anni succ
	diCuiImpegnatoAnniSucc(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnniSucc),
	diCuiImpegnatoUGAnniSucc(ImportoDerivatoFunctionEnum.diCuiImpegnatoUGAnniSucc),
	//SIAC-7349
	diCuiImpegnatoAnno1(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno1),
	diCuiImpegnatoAnno2(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno2),
	diCuiImpegnatoAnno3(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno3),

	//SIAC-7349 -Start - SR200 - MR/GS - Importi derivati per calcolo Disponibilita impegnare cap UP
	disponibilitaImpegnareUPAnno1(ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno1),
	disponibilitaImpegnareUPAnno2(ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno2),
	disponibilitaImpegnareUPAnno3(ImportoDerivatoFunctionEnum.disponibilitaImpegnareAnno3),
	//SIAC-7349 End
	
	//SIAC-7220
	//ImportiCapitoloUG
	diCuiImpegnatoAnno1UG(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno1UG),
	diCuiImpegnatoAnno2UG(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno2UG),
	diCuiImpegnatoAnno3UG(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno3UG),
	//
	
	//SIAC-7349 MR SR50.riciclo 21/05/2020 calcolo dell'impegnato per la tabella di gestione equivalente a quella di previsione
	impegnatoEffettivoUGAnno1(ImportoDerivatoFunctionEnum.impegnatoEffettivoUGAnno1),
	impegnatoEffettivoUGAnno2(ImportoDerivatoFunctionEnum.impegnatoEffettivoUGAnno2),
	impegnatoEffettivoUGAnno3(ImportoDerivatoFunctionEnum.impegnatoEffettivoUGAnno3),
	//END SIAC-7349
	
	//SIAC-7349 MR SR50.riciclo 21/05/2020 calcolo dell'impegnato per la tabella di gestione equivalente a quella di previsione
	impegnatoEffettivoUPAnno1(ImportoDerivatoFunctionEnum.impegnatoEffettivoUPAnno1),
	impegnatoEffettivoUPAnno2(ImportoDerivatoFunctionEnum.impegnatoEffettivoUPAnno2),
	impegnatoEffettivoUPAnno3(ImportoDerivatoFunctionEnum.impegnatoEffettivoUPAnno3),
		//END SIAC-7349
	
	//ImportiCapitoloEP
	diCuiAccertatoAnno1(ImportoDerivatoFunctionEnum.diCuiAccertatoAnno1),
	diCuiAccertatoAnno2(ImportoDerivatoFunctionEnum.diCuiAccertatoAnno2),
	diCuiAccertatoAnno3(ImportoDerivatoFunctionEnum.diCuiAccertatoAnno3),
	//SIAC-8469
	residuoEffettivoInizialeUG(ImportoDerivatoFunctionEnum.impegnatoresiduoEffettivoInizialeUG),
	residuoEffettivoFinaleUG(ImportoDerivatoFunctionEnum.impegnatoresiduoEffettivoAttualeUG),
	residuoEffettivoInizialeUGAnnoPrec(ImportoDerivatoFunctionEnum.impegnatoresiduoEffettivoInizialeUGAnnoPrec),
	residuoEffettivoFinaleUGAnnoPrec(ImportoDerivatoFunctionEnum.impegnatoresiduoEffettivoAttualeUGAnnoPrec),
	//SIAC-8469
	residuoEffettivoFinaleUP(ImportoDerivatoFunctionEnum.impegnatoresiduoEffettivoUP),
	
	
	;
	
	private final ImportoDerivatoFunctionEnum importoDerivatoFunctionEnum;
	
	private ImportiCapitoloEnum(ImportoDerivatoFunctionEnum importoDerivatoFunctionEnum) {
		this.importoDerivatoFunctionEnum = importoDerivatoFunctionEnum;
	}

	/**
	 * @return the importoDerivatoFunctionEnum
	 */
	public ImportoDerivatoFunctionEnum getImportoDerivatoFunctionEnum() {
		return importoDerivatoFunctionEnum;
	}

}

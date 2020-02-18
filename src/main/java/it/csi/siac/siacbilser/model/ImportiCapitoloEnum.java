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
	diCuiImpegnatoAnno1(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno1),
	diCuiImpegnatoAnno2(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno2),
	diCuiImpegnatoAnno3(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno3),
	
	//SIAC-7220
	//ImportiCapitoloUG
	diCuiImpegnatoAnno1UG(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno1UG),
	diCuiImpegnatoAnno2UG(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno2UG),
	diCuiImpegnatoAnno3UG(ImportoDerivatoFunctionEnum.diCuiImpegnatoAnno3UG),
	//
	
	//ImportiCapitoloEP
	diCuiAccertatoAnno1(ImportoDerivatoFunctionEnum.diCuiAccertatoAnno1),
	diCuiAccertatoAnno2(ImportoDerivatoFunctionEnum.diCuiAccertatoAnno2),
	diCuiAccertatoAnno3(ImportoDerivatoFunctionEnum.diCuiAccertatoAnno3),
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

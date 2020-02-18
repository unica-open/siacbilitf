/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.model.CECDataDictionary;
import it.csi.siac.siaccecser.model.CassaEconomale;

/**
 * Enumera tutti fields della classe {@link CassaEconomale} che possano essere gestiti come importi derivati.
 * 
 * @author Domenico Lisi
 * @author Marchino Alessandro
 * @version 1.0.0 - 19/12/2016
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum ImportoDerivatoFunctionEnum {
	
	// CAPITOLO
	// ImportiCapitolo
	impegnatoPlur("fnc_siac_impegnatoplurannopiu3"),
	disponibilitaVariareAnno1("fnc_siac_disponibilitavariare_anno1"),
	disponibilitaVariareAnno2("fnc_siac_disponibilitavariare_anno2"),
	disponibilitaVariareAnno3("fnc_siac_disponibilitavariare_anno3"),
	disponibilitaVariareCassa("fnc_siac_disponibilitavariare_cassa"),
	
	//ImportiCapitoloUG
	totalePagato("fnc_siac_totalepagatoug"),
	disponibilitaPagare("fnc_siac_disponibilitapagareug"),
	disponibilitaImpegnareAnno1("fnc_siac_disponibilitaimpegnareug_anno1"),
	disponibilitaImpegnareAnno2("fnc_siac_disponibilitaimpegnareug_anno2"),
	disponibilitaImpegnareAnno3("fnc_siac_disponibilitaimpegnareug_anno3"),
	
	//ImportiCapitoloEG
	totaleIncassato("fnc_siac_totaleincassatoeg"),
	disponibilitaIncassare("fnc_siac_disponibilitaincassareeg"),
	disponibilitaAccertareAnno1("fnc_siac_disponibilitaaccertareeg_anno1"),
	disponibilitaAccertareAnno2("fnc_siac_disponibilitaaccertareeg_anno2"),
	disponibilitaAccertareAnno3("fnc_siac_disponibilitaaccertareeg_anno3"),
	
	//ImportiCapitoloUP
	diCuiImpegnatoAnno1("fnc_siac_dicuiimpegnatoup_anno1"),
	diCuiImpegnatoAnno2("fnc_siac_dicuiimpegnatoup_anno2"),
	diCuiImpegnatoAnno3("fnc_siac_dicuiimpegnatoup_anno3"),

	//SIAC-7220
	//ImportiCapitoloUG
	diCuiImpegnatoAnno1UG("fnc_siac_dicuiimpegnatoug_anno1"),
	diCuiImpegnatoAnno2UG("fnc_siac_dicuiimpegnatoug_anno2"),
	diCuiImpegnatoAnno3UG("fnc_siac_dicuiimpegnatoug_anno3"),
	//
	
	//ImportiCapitoloEP
	diCuiAccertatoAnno1("fnc_siac_dicuiaccertatoep_anno1"),
	diCuiAccertatoAnno2("fnc_siac_dicuiaccertatoep_anno2"),
	diCuiAccertatoAnno3("fnc_siac_dicuiaccertatoep_anno3"),
	
	// CASSA ECONOMALE
	disponibilitaCassaContanti("fnc_siac_cec_disponibilita_cassa_contanti_anno"),
	disponibilitaCassaContoCorrente("fnc_siac_cec_disponibilita_cassa_conto_anno"),
	;
	
	private final String functionName;
	
	private ImportoDerivatoFunctionEnum(String functionName) {
		this.functionName = functionName;
	}
	
	public String getFunctionName() {
		return functionName;
	}
	
}

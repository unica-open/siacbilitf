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
	//SIAC-8214, in realta' doveva essere messa da SIAC-6881 e SIAC-7349
	totalePagatoSuResidui("fnc_siac_totalepagatougresidui"),
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
	//SIAC-7349 - SR200 - Start - MR/GS 17/04/2020 - Importi derivato dicuiimpegnato anno precedente
	diCuiImpegnatoAnnoPrec("fnc_siac_dicuiimpegnatoup_annoprec"),
	diCuiImpegnatoUGAnnoPrec("fnc_siac_dicuiimpegnatoug_annoprec"),
	//SIAC-7349 End
	//SIAC-7349 - SR200 - Start - MR/GS 23/04/2020 - Importi derivato dicuiimpegnato anni successivi
	diCuiImpegnatoAnniSucc("fnc_siac_dicuiimpegnatoup_annisucc"),
	diCuiImpegnatoUGAnniSucc("fnc_siac_dicuiimpegnatoug_annisucc"),
	//SIAC-7349 End
	diCuiImpegnatoAnno1("fnc_siac_dicuiimpegnatoup_anno1"),
	diCuiImpegnatoAnno2("fnc_siac_dicuiimpegnatoup_anno2"),
	diCuiImpegnatoAnno3("fnc_siac_dicuiimpegnatoup_anno3"),
	

	//SIAC-7349 - SR200 - Start - MR/GS 06/04/2020 - Importi derivati per la disponibilita ad impegnare dei capitoli
	disponibilitaImpegnareUPAnno1("fnc_siac_disponibilitaimpegnareup_anno1"),
	disponibilitaImpegnareUPAnno2("fnc_siac_disponibilitaimpegnareup_anno2"),
	disponibilitaImpegnareUPAnno3("fnc_siac_disponibilitaimpegnareup_anno3"),
	//SIAC-7349 - End
	
	//SIAC-7349 MR SR50.riciclo 21/05/2020 calcolo dell'impegnato per la tabella di gestione equivalente a quella di previsione
	impegnatoEffettivoUGAnno1("fnc_siac_impegnatoeffettivoug_anno1"),
	impegnatoEffettivoUGAnno2("fnc_siac_impegnatoeffettivoug_anno2"),
	impegnatoEffettivoUGAnno3("fnc_siac_impegnatoeffettivoug_anno3"),
	//END SIAC-7349
	
	//SIAC-7349 MR SR50.riciclo 22/05/2020 calcolo dell'impegnato  di previsione
	impegnatoEffettivoUPAnno1("fnc_siac_impegnatoeffettivoup_anno1"),
	impegnatoEffettivoUPAnno2("fnc_siac_impegnatoeffettivoup_anno2"),
	impegnatoEffettivoUPAnno3("fnc_siac_impegnatoeffettivoup_anno3"),
	//END SIAC-7349
	
	
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
	
	
	//SIAC-7349 - START - SR90 - MR - 02/04/2020 Definizione del nome della function da richiamre per il calcolo della disponibilita impegnare CAPUG
	disponibilitaImpegnareAnnoComponente("fnc_siac_disponibilitaimpegnareugcomp_anno"),
	//SIAC-7349 - FINE

	//SIAC-7349 - START - SR200 -MR - 08/04/2020 Definizione del nome della function da richiamre per il calcolo dell'impegnato CAPUP
	impegnatoDefinitivoUPComponente("fnc_siac_impegnatodefinitivoup_comp"),
	//SIAC-7349 - FINE
	//SIAC-7349 - START - SR210 -MR - 14/04/2020 Definizione del nome della function da richiamre per il calcolo dell'impegnato CAPUG
	impegnatoDefinitivoUGComponente("fnc_siac_impegnatodefinitivoug_comp"),
	//SIAC-7349 - FINE
	//SIAC-7349 - START - SR210 -MR - 16/04/2020 Definizione del nome della function da richiamre per il calcolo della disp a variare CAPUG
	disponibilitaVariareAnnoComponente("fnc_siac_disponibilitavariareugcomp_anno"),
	//SIAC-7349 - FINE
	
	//SIAC-7349 - START - SR240 -MR - 16/04/2020 Definizione del nome della function da richiamre per il calcolo della disp a variare CAPUG
	disponibilitaVariareAnnoComponenteUP("fnc_siac_disponibilitavariareupcomp_anno"),
	//SIAC-7349 - FINE
	
	impegnatoNoStanzAnniSucc("fnc_siac_impegnatodefinitivoup_comp_annisucc_nostanz"),
	impegnatoNoStanzAnniSuccUG("fnc_siac_impegnatodefinitivoug_comp_annisucc_nostanz"),

	//SIAC-7349 GS 17/07/2020 Definizione della function da richiamare per componenti senza stanziamento nel triennio
	impegnatoNoStanzTriennio("fnc_siac_impegnatodefinitivoup_comp_triennio_nostanz"),
	impegnatoNoStanzTriennioUG("fnc_siac_impegnatodefinitivoug_comp_triennio_nostanz"),

	//SIAC-8469
	impegnatoresiduoEffettivoInizialeUG("fnc_siac_impegnatoresiduo_effettivo_iniziale_ug"),//"fnc_siac_residuo_effettivo_iniziale_ug"),
	impegnatoresiduoEffettivoAttualeUG("fnc_siac_impegnatoresiduo_effettivo_attuale_ug"),//"fnc_siac_residuo_effettivo_finale_ug"),
	impegnatoresiduoEffettivoInizialeUGAnnoPrec("fnc_siac_impegnatoresiduo_effettivo_iniziale_ug_annoprec"), //"fnc_siac_residuo_effettivo_iniziale_ug_annoprec"),
	impegnatoresiduoEffettivoAttualeUGAnnoPrec("fnc_siac_impegnatoresiduo_effettivo_attuale_ug_annoprec"), //"fnc_siac_residuo_effettivo_finale_ug_annoprec"),
	//SIAC-8469
	impegnatoresiduoEffettivoUP("fnc_siac_impegnatoresiduo_effettivo_up"),
	
	//SIAC-8838
	impegnatoUGEconb1("fnc_siac_dicuiimpegnatoug_econb_anno1"),
	impegnatoUGEconb2("fnc_siac_dicuiimpegnatoug_econb_anno2"),
	impegnatoUGEconb3("fnc_siac_dicuiimpegnatoug_econb_anno3"),
	
	;

	private final String functionName;
	
	private ImportoDerivatoFunctionEnum(String functionName) {
		this.functionName = functionName;
	}
	
	public String getFunctionName() {
		return functionName;
	}
	
}

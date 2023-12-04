/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.movimentogestione.ImpegnoCapitoloComposedModelDetail;
import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
* The Enum AccertamentoModelDetail.
* 
* @author Alessandro Marchino
*/
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum ImpegnoModelDetail implements ModelDetailEnum {
	
	AttoAmministrativo,
	CapitoloMinimal,
	ClasseSoggetto,
	DisponibilitaLiquidare,
	Importi,
	PianoDeiConti,
	Soggetto,
	Stato,
	
	SiopeTipoDebito,
	SiopeAssenzaMotivazione,
	CigCup,
	
	Capitolo, 
	Attributi,
	Subimpegni,
	Componente,
	TotaleMutuiAssociati,
	DettaglioImporti,
	ElencoDettagliPerBilancio,
	MutuiAssociati,
	;
	
	
	public static ImpegnoModelDetail[] Dettaglio = new ImpegnoModelDetail[] { 
		ImpegnoModelDetail.Stato,
		ImpegnoModelDetail.AttoAmministrativo, 
		ImpegnoModelDetail.Soggetto, 
		ImpegnoModelDetail.Attributi,
		ImpegnoModelDetail.Importi, 
		ImpegnoModelDetail.Subimpegni, 
		ImpegnoModelDetail.Componente,
		ImpegnoModelDetail.TotaleMutuiAssociati, 
		ImpegnoModelDetail.DettaglioImporti 
	};

	public static ImpegnoModelDetail[] DettaglioPerBilancio = new ImpegnoModelDetail[] { 
		ImpegnoModelDetail.Importi,
		ImpegnoModelDetail.DettaglioImporti 
	};

	public static ImpegnoCapitoloComposedModelDetail[] DettaglioImpegnoCapitolo = new ImpegnoCapitoloComposedModelDetail[] {
		new ImpegnoCapitoloComposedModelDetail(ImpegnoModelDetail.Capitolo,CapitoloUscitaGestioneModelDetail.Classificatori) 
	};
	
	public static ImpegnoModelDetail[] MutuiAssociatiImpegno = new ImpegnoModelDetail[] { 
		ImpegnoModelDetail.Importi,
		ImpegnoModelDetail.MutuiAssociati 
	};
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.movimentogestione.AccertamentoCapitoloComposedModelDetail;
import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
* The Enum AccertamentoModelDetail.
* 
* @author Alessandro Marchino
*/
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum AccertamentoModelDetail implements ModelDetailEnum {
	
	AttoAmministrativo,
	CapitoloMinimal,
	ClasseSoggetto,
	DisponibilitaIncassare,
	Importi,
	PianoDeiConti,
	Soggetto,
	Stato,
	Subaccertamenti,
	Capitolo,
	TotaleMutuiAssociati,
	DettaglioImporti,
	ElencoDettagliPerBilancio,
	MutuiAssociati,
	;
	
	public static AccertamentoModelDetail[] Dettaglio = new AccertamentoModelDetail[] {AccertamentoModelDetail.Stato, AccertamentoModelDetail.AttoAmministrativo, AccertamentoModelDetail.Soggetto, AccertamentoModelDetail.Importi, AccertamentoModelDetail.Subaccertamenti, AccertamentoModelDetail.TotaleMutuiAssociati, AccertamentoModelDetail.DettaglioImporti};
	public static AccertamentoModelDetail[] DettaglioPerBilancio = new AccertamentoModelDetail[] {AccertamentoModelDetail.Importi	, AccertamentoModelDetail.DettaglioImporti};
	public static AccertamentoCapitoloComposedModelDetail[] DettaglioAccertamentoCapitolo = new AccertamentoCapitoloComposedModelDetail[] {new AccertamentoCapitoloComposedModelDetail(AccertamentoModelDetail.Capitolo, CapitoloEntrataGestioneModelDetail.Classificatori)};
	public static AccertamentoModelDetail[] MutuiAssociatiAccertamento = new AccertamentoModelDetail[] {AccertamentoModelDetail.Importi	, AccertamentoModelDetail.MutuiAssociati};
	

}

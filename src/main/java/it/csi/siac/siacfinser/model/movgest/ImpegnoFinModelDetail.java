/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;
import it.csi.siac.siacfinser.model.FINDataDictionary;


/**
* The Enum AccertamentoModelDetail.
* 
* @author Alessandro Marchino
*/
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public enum ImpegnoFinModelDetail implements ModelDetailEnum {
	
	AttoAmministrativo,
	CapitoloMinimal,
	ClasseSoggetto,
	TipoMovimento,
	DisponibilitaLiquidare,
	DisponibilitaPagare,
	DisponibilitaFinanziare,
	DisponibilitaSubimpegnare,
	DisponibilitaImpegnoModifica,
	TotaleSubimpegni,
	SommaLiquidazioniDoc,
	FlagPrenotazione, 
	FlagCassaEconomale, 
	FlagSDF,
	FlagFrazionabile,
	FlagPrenotazioneLiquidabile,
	Cronoprogramma,	
	Importi,
	PianoDeiConti,
	Soggetto,
	Stato,	
	SiopeTipoDebito,
	SiopeAssenzaMotivazione,
	CigCup,
	VincoliImpegno,
	ComponenteBilancioImpegno,
	SAC,
	ImpegnoPrenotazioneOrigine,
	HasModificheAggiudicazione,
	AnnoPrenotazioneOrigine,
	AttoamministrativoAggiudicazione,
	AnnoImpegnoOrigine,
	NumeroImpegnoOrigine,
	TipoImpegno,
	ListaModificheMovimentoGestioneSpesa,
	DataEmissione,
	DataScadenza,
	DataModifica,
	CapitoloOrigine,
	FlagDaRiaccertamento,
	ImportoDaRiaccertare,
	ImportoMaxDaRiaccertare,
	ImportoModifiche,
	ResiduoDaMantenere,
	DaCancellareInsussistenza,
	DaCancellareInesigibilita,
	DifferitoN,
	DifferitoN1,
	DifferitoN2,
	DifferitoNP,
	NumeroTotaleModifcheMovimento,
	ParereFinanziario,
	flagAttivaGSA,
	//SIAC-7599
	DiquidatoAnnoSuccessivo,
	DocumentiNoLiqAnnoSuccessivo,
	DocumentiNoIncassatiAnnoSuccessivo,
	IncassatoAnnoSuccessivo,
	CollegatoALiquidazioni,
	Progetto,
	CollegatoAdOrdinativi,
	AttributoMovimentoGestione,
	//SIAC-8650
	Bilancio
	;

}

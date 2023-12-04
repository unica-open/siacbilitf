/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
* The Enum AccertamentoModelDetail.
* 
* @author Alessandro Marchino
*/
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum SubImpegnoModelDetail implements ModelDetailEnum {
	
	AttoAmministrativo,
	CapitoloMinimal,
	ClasseSoggetto,
	DisponibilitaLiquidare,
	Importi,
	Padre,
	PianoDeiConti,
	Soggetto,
	Stato,
	
	CigCup,
	SiopeTipoDebito,
	SiopeAssenzaMotivazione,
	;

}

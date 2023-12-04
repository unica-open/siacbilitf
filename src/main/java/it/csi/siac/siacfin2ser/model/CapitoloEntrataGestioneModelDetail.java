/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
 * The Enum CapitoloEntrataPrevisioneModelDetail
 * 
 * @author Domenico
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum CapitoloEntrataGestioneModelDetail implements ModelDetailEnum {
	
	// TODO: vedere se implementare
	//AnnoCreazioneCapitolo,
	AttoDiLegge,
	Attributi,
	Bilancio,
	CapitoloEquivalente,
	Categoria, 
	Classificatori,
	DataAnnullamento,
	Ente,
	ExCapitolo,
	Stato,
	Importi,
	// SIAC-7858: ottimizzazione
	TitoloTipologiaCategoriaSAC,
	//SIAC-8191
	AnnoCreazione,
	

}

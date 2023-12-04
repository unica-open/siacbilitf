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
 * @author Elisa Chiari
 * @version 1.0.0 - 11/11/2016
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum CapitoloEntrataPrevisioneModelDetail implements ModelDetailEnum {
	
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
	Importi, AnnoCreazione,
	// SIAC-7858: ottimizzazione per i classificatori
	TitoloTipologiaCategoriaSAC,
	
	
	// TODO: verificare se ne servano altri
}

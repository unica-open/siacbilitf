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
public enum CapitoloUscitaGestioneModelDetail implements ModelDetailEnum {
	
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
	//SIAC-8191
	AnnoCreazione,
	

}

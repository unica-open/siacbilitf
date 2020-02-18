/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;


/**
 * The Enum CapitoloEntrataPrevisioneModelDetail
 * 
 * @author Domenico
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum CapitoloUscitaPrevisioneModelDetail implements ModelDetail {
	
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
	

}

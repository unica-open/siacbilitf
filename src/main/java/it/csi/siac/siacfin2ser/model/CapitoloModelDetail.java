/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;


/**
 * The Enum CapitoloModelDetail
 * @author Marchino Alessandro
 * @version 1.0.0 - 14/10/2019
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum CapitoloModelDetail implements ModelDetail {
	
	AttoDiLegge,
	Bilancio,
	Categoria, 
	DataAnnullamento,
	Ente,
	ExCapitolo,
	Stato,
	;

}

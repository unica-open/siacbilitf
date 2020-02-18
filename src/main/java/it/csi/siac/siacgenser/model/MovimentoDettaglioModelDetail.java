/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;

/**
 * The Enum ContoModelDetail.
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum MovimentoDettaglioModelDetail implements ModelDetail {	
	
	Ambito,
	Segno,
	Conto,
	ContoModelDetail,
	Classif,
	Cespiti,
	MovimentoEPModelDetail,
	ImportoInventariato,
	;
	
	
	

}
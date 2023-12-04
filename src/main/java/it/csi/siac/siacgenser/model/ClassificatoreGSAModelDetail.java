/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;

/**
 * The Enum ContoModelDetail.
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum ClassificatoreGSAModelDetail implements ModelDetailEnum {	
	
	ClassificatoreGSAPadre,
	ClassificatoreGSAFigli,
	Ambito,
	Stato,
	;
	
	

}
/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoFamigliaCausale {
	
	ENTRATA,
	SPESA,
	PREDOC_ENTRATA,
	PREDOC_SPESA
	

}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum ModelloCausale {
	
	CAUSALE_770,
	PREDOCUMENTO_SPESA,
	PREDOCUMENTO_ENTRATA,
	ONERI,
	;
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * StatoOperativo dei vincoli del capitolo 
 * 
 * @author rmontuori
 * 
 */

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum StatoOperativo {

	VALIDO, ANNULLATO

}

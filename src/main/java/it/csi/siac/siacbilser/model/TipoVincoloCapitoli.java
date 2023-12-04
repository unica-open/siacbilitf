/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Domenico
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoVincoloCapitoli {

	PREVISIONE, GESTIONE
	

}

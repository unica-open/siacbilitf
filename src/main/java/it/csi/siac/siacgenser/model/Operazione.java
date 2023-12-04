/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Operazione 
 * 
 * @author Domenico
 *
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public interface Operazione {

	String name();
}

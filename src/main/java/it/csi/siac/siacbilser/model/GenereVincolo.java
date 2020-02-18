/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;

/**
 * GenereVincolo
 * 
 * @author Marchino Alessandro
 * @version 1.0.0 - 18/07/2017
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class GenereVincolo extends ClassificatoreGenerico {

	private static final long serialVersionUID = 6092275168542707104L;

	public GenereVincolo() {
		super();

	}

	public GenereVincolo(String codice, String descrizione) {
		super(codice, descrizione);
	}

}

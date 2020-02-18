/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;

/**
 * TipoVincolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TipoVincolo extends ClassificatoreGenerico {

	private static final long serialVersionUID = 6092275168542707104L;

	public TipoVincolo() {
		super();

	}

	public TipoVincolo(String codice, String descrizione) {
		super(codice, descrizione);
	}

}

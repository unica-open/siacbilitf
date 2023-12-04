/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TipoAmbito extends ClassificatoreGenerico {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2400460186726273434L;

	public TipoAmbito() {
		super();
	}

	public TipoAmbito(String codice, String descrizione) {
		super(codice, descrizione);
	}

	public TipoAmbito(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
	}

	
}

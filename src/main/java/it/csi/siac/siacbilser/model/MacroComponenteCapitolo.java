/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.ATTDataDictionary;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

@XmlType(namespace = ATTDataDictionary.NAMESPACE)
public class MacroComponenteCapitolo extends ClassificatoreGenerico {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2425301674957785946L;

	/**
	 * 
	 */
	public MacroComponenteCapitolo() {
		super();
	 
	}

	/**
	 * @param codice
	 * @param descrizione
	 */
	public MacroComponenteCapitolo(String codice, String descrizione) {
		super(codice, descrizione);
		 
	}

	/**
	 * @param tipo
	 * @param codice
	 */
	public MacroComponenteCapitolo(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
	 
	}
	
	

}

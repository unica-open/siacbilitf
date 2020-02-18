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
public class SottoComponenteCapitolo extends ClassificatoreGenerico {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2806303258725573257L;

	public SottoComponenteCapitolo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SottoComponenteCapitolo(String codice, String descrizione) {
		super(codice, descrizione);
	}

	public SottoComponenteCapitolo(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
	}
	
	

}

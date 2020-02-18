/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum OperazioneUtilizzoImporto implements Operazione{ 
	PROPOSTO("Proposto"),
	NON_MODIFICABILE("Non modificabile"),
	;
	
	private String descrizione;
	
	private OperazioneUtilizzoImporto(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

}
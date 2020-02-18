/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum OperazioneUtilizzoConto implements Operazione{ 
	PROPOSTO("Proposto"),
	OBBLIGATORIO("Obbligatorio"),
	;
	
	private String descrizione;
	
	private OperazioneUtilizzoConto(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

}
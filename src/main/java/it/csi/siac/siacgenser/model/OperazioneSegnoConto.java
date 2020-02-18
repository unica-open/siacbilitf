/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * The Enum OperazioneSegnoConto.
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum OperazioneSegnoConto implements Operazione { 
	DARE("Dare"),
	AVERE("Avere"),
	;
	
	private String descrizione;
	
	private OperazioneSegnoConto(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

}
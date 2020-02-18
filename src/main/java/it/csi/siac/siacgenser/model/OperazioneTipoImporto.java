/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum OperazioneTipoImporto implements Operazione{ 
	LORDO("Lordo"),
	IMPOSTA("Imposta"),
	IMPONIBILE("Imponibile");
	
	private String descrizione;
	
	private OperazioneTipoImporto(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
}
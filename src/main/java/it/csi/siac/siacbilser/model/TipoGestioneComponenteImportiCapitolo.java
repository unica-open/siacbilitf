/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoGestioneComponenteImportiCapitolo  {

	MANUALE("Manuale"),
	SOLO_AUTOMATICA("Solo automatica"),
	;

	private String descrizione;
	
	private TipoGestioneComponenteImportiCapitolo(String descrizione) {
		this.descrizione = descrizione;
	}

	public static TipoGestioneComponenteImportiCapitolo valueOf(Boolean soloAutomatica) {
		return Boolean.TRUE.equals(soloAutomatica) ? SOLO_AUTOMATICA : MANUALE;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}


}

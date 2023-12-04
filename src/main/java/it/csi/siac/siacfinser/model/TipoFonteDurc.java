/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public enum TipoFonteDurc {
	
	MANUALE('M'),
	AUTOMATICA('A'),
	;
	
	private Character codice;
	
	private TipoFonteDurc(char codice) {
		this.codice = Character.valueOf(codice);
	}

	public Character getCodice() {
		return codice;
	}
}
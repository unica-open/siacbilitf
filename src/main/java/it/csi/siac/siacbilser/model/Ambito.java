/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Ambito della contabilit&agrave; generale.
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum Ambito {
	
	/** Ambito Finanziario */
	AMBITO_FIN("FIN"),
	
	/** Ambito Cassa Economale */
	AMBITO_CEC("CEC"),
	
	/** Ambito Gestione Sanitaria Accentrata */
	AMBITO_GSA("GSA"),
	
	/** Ambito Inventario */
	AMBITO_INV("INV"),
	;
	
	private String suffix;
	
	private Ambito(String suffix) {
		this.suffix = suffix;
	}
	
	public String getSuffix() {
		return suffix;
	}
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Parametri per la ricerca del Mutuo per chiave
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaMutuoK implements Serializable {

	private static final long serialVersionUID = -5660144893013904715L;
	
	private String mutCode;

	public String getMutCode() {
		return mutCode;
	}

	public void setMutCode(String mutCode) {
		this.mutCode = mutCode;
	}
}

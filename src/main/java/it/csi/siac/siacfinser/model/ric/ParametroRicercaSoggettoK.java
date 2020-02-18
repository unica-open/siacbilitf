/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaSoggettoK implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String codice;
	private boolean includeModif =false;
	private String matricola;

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public boolean isIncludeModif() {
		return includeModif;
	}

	public void setIncludeModif(boolean includeModif) {
		this.includeModif = includeModif;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
}

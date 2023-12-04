/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ContoTesoreriaCodificaFin extends CodificaFin {


	private static final long serialVersionUID = -1089339321551299248L;

	
	private Boolean vincolato;


	public Boolean getVincolato() {
		return vincolato;
	}


	public void setVincolato(Boolean vincolato) {
		this.vincolato = vincolato;
	}
	
}

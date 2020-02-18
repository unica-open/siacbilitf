/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class Sospeso extends Entita {

	private static final long serialVersionUID = 8229963151254629507L;
	
	private Integer numeroSospeso;

	/**
	 * @return the numeroSospeso
	 */
	public Integer getNumeroSospeso() {
		return numeroSospeso;
	}

	/**
	 * @param numeroSospeso the numeroSospeso to set
	 */
	public void setNumeroSospeso(Integer numeroSospeso) {
		this.numeroSospeso = numeroSospeso;
	}
	
	
}
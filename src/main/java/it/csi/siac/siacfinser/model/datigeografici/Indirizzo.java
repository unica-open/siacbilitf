/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.datigeografici;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Indirizzo extends EntitaEnte{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4806907924476629127L;

	
	private String cap;
	private String denominazione;
	private String numeroCivico;
	private String sedime;
	
	
	
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getDenominazione() {
		return denominazione;
	}
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	public String getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String getSedime() {
		return sedime;
	}
	public void setSedime(String sedime) {
		this.sedime = sedime;
	}
	public String getStringCompare () {
		return sedime + denominazione + numeroCivico;
	}
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class InseriscePrimaNota extends BasePrimaNotaRequest {

	private boolean sovrascriviDefaultStatoOperativo = false;
	
	private boolean saltaOperazioniPreliminarisuRegistrazioni = false;

	/**
	 * @return the sovrascriviDefaultStatoOperativo
	 */
	@XmlTransient
	public boolean isSovrascriviDefaultStatoOperativo() {
		return sovrascriviDefaultStatoOperativo;
	}

	/**
	 * @param sovrascriviDefaultStatoOperativo the sovrascriviDefaultStatoOperativo to set
	 */
	public void setSovrascriviDefaultStatoOperativo(boolean sovrascriviDefaultStatoOperativo) {
		this.sovrascriviDefaultStatoOperativo = sovrascriviDefaultStatoOperativo;
	}

	/**
	 * @return the saltaOperazionisuRegistrazioni
	 */
	@XmlTransient
	public boolean isSaltaOperazioniPreliminarisuRegistrazioni() {
		return saltaOperazioniPreliminarisuRegistrazioni;
	}

	/**
	 * @param saltaOperazionisuRegistrazioni the saltaOperazionisuRegistrazioni to set
	 */
	public void setSaltaOperazioniPreliminarisuRegistrazioni(boolean saltaOperazionisuRegistrazioni) {
		this.saltaOperazioniPreliminarisuRegistrazioni = saltaOperazionisuRegistrazioni;
	}
	
	
}

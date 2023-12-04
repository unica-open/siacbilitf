/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class ControllaAggiornabilitaRichiestaEconomaleResponse extends ServiceResponse {
	
	private Boolean aggiornabile;

	/**
	 * @return the aggiornabile
	 */
	public Boolean getAggiornabile() {
		return aggiornabile;
	}

	/**
	 * @param aggiornabile the aggiornabile to set
	 */
	public void setAggiornabile(Boolean aggiornabile) {
		this.aggiornabile = aggiornabile;
	}
	
}

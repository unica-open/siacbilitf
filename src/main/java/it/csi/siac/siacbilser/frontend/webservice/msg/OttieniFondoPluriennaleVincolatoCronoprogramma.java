/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Cronoprogramma;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class OttieniFondoPluriennaleVincolatoCronoprogramma extends ServiceRequest {
	
	private Cronoprogramma cronoprogramma;
	private Bilancio bilancio;

	public Cronoprogramma getCronoprogramma() {
		return cronoprogramma;
	}

	/**
	 * Impostare l'id del cronoprogramma da cercare
	 * 
	 * @param cronoprogramma
	 */
	public void setCronoprogramma(Cronoprogramma cronoprogramma) {
		this.cronoprogramma = cronoprogramma;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 * Impostare al meno l'anno 
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	

}

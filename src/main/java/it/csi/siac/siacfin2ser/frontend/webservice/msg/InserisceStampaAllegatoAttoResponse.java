/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAttoStampa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceStampaAllegatoAttoResponse extends ServiceResponse {

	AllegatoAttoStampa allegatoAttoStampa;

	/**
	 * @return the allegatoAttoStampa
	 */
	public AllegatoAttoStampa getAllegatoAttoStampa() {
		return allegatoAttoStampa;
	}

	/**
	 * @param allegatoAttoStampa the allegatoAttoStampa to set
	 */
	public void setAllegatoAttoStampa(AllegatoAttoStampa allegatoAttoStampa) {
		this.allegatoAttoStampa = allegatoAttoStampa;
	}
}

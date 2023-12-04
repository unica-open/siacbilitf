/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.StampaIva;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaStampaIvaResponse extends ServiceResponse {
	
	private StampaIva stampaIva;

	/**
	 * @return the stampaIva
	 */
	public StampaIva getStampaIva() {
		return stampaIva;
	}

	/**
	 * @param stampaIva the stampaIva to set
	 */
	public void setStampaIva(StampaIva stampaIva) {
		this.stampaIva = stampaIva;
	}

	
	
}

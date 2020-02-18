/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class VerificaStampaRendicontoCassaResponse extends ServiceResponse {
	
	private boolean stampabile = false;

	/**
	 * @return the stampabile
	 */
	public boolean isStampabile() {
		return stampabile;
	}

	/**
	 * @param stampabile the stampabile to set
	 */
	public void setStampabile(boolean stampabile) {
		this.stampabile = stampabile;
	}

}

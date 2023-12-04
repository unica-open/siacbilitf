/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleEntrata;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceCausaleEntrata extends ServiceRequest {

	private CausaleEntrata causaleEntrata;

	/**
	 * @return the causaleEntrata
	 */
	public CausaleEntrata getCausaleEntrata() {
		return causaleEntrata;
	}

	/**
	 * @param causaleEntrata the causaleEntrata to set
	 */
	public void setCausaleEntrata(CausaleEntrata causaleEntrata) {
		this.causaleEntrata = causaleEntrata;
	}
	
	
	
}

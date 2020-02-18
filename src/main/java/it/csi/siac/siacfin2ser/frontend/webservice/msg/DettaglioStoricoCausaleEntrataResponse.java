/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleEntrata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class DettaglioStoricoCausaleEntrataResponse extends ServiceResponse {

	
	private List<CausaleEntrata> causaliEntrata = new ArrayList<CausaleEntrata>();

	/**
	 * @return the causaliSpesa
	 */
	public List<CausaleEntrata> getCausaliEntrata() {
		return causaliEntrata;
	}

	/**
	 * @param causaliSpesa the causaliSpesa to set
	 */
	public void setCausaliEntrata(List<CausaleEntrata> causaliEntrata) {
		this.causaliEntrata = causaliEntrata;
	}

	
	
	
}

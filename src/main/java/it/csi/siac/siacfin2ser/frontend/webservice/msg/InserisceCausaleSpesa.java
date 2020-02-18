/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleSpesa;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceCausaleSpesa extends ServiceRequest {

	private CausaleSpesa causaleSpesa;
	
	
	/**
	 * @return the causaleSpesa
	 */
	public CausaleSpesa getCausaleSpesa() {
		return causaleSpesa;
	}

	/**
	 * @param causaleSpesa the causaleSpesa to set
	 */
	public void setCausaleSpesa(CausaleSpesa causaleSpesa) {
		this.causaleSpesa = causaleSpesa;
	}

	
	
	
}

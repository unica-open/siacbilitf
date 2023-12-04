/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleSpesa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class LeggiCausaleSpesaResponse extends ServiceResponse {
	
	private List<CausaleSpesa> causaliSpesa = new ArrayList<CausaleSpesa>();

	/**
	 * @return the causaliSpesa
	 */
	public List<CausaleSpesa> getCausaliSpesa() {
		return causaliSpesa;
	}

	/**
	 * @param causaliSpesa the causaliSpesa to set
	 */
	public void setCausaliSpesa(List<CausaleSpesa> causaliSpesa) {
		this.causaliSpesa = causaliSpesa;
	}
	
	
}

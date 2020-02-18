/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ContoTesoreria;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class LeggiContiTesoreriaResponse extends ServiceResponse {
	
	private List<ContoTesoreria> contiTesoreria = new ArrayList<ContoTesoreria>();

	public List<ContoTesoreria> getContiTesoreria() {
		return contiTesoreria;
	}

	public void setContiTesoreria(List<ContoTesoreria> contiTesoreria) {
		this.contiTesoreria = contiTesoreria;
	}
	
}

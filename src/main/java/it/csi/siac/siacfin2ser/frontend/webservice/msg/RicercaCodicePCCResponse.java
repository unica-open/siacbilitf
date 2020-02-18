/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CodicePCC;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaCodicePCCResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaCodiciPcc")
	@XmlElement(name = "codicePCC")
	private List<CodicePCC> codiciPCC = new ArrayList<CodicePCC>();

	/**
	 * @return the codiciPCC
	 */
	@XmlTransient
	public List<CodicePCC> getCodiciPCC() {
		return codiciPCC;
	}

	/**
	 * @param codiciPCC the codiciPCC to set
	 */
	public void setCodiciPCC(List<CodicePCC> codiciPCC) {
		this.codiciPCC = codiciPCC != null ? codiciPCC : new ArrayList<CodicePCC>();
	}
	
}

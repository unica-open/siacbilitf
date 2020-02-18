/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CausaleEP;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaMinimaCausaleResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaCausali")
	@XmlElement(name = "causale")
	private List<CausaleEP> causali = new ArrayList<CausaleEP>();

	/**
	 * @return the causali
	 */
	@XmlTransient
	public List<CausaleEP> getCausali() {
		return causali;
	}

	/**
	 * @param causali the causali to set
	 */
	public void setCausali(List<CausaleEP> causali) {
		this.causali = causali;
	}
	
}

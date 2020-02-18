/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Evento;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaEventiPerTipoResponse extends ServiceResponse {

	private List<Evento> eventi = new ArrayList<Evento>();

	/**
	 * @return the eventi
	 */
	public List<Evento> getEventi() {
		return eventi;
	}

	/**
	 * @param eventi the eventi to set
	 */
	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi != null ? eventi : new ArrayList<Evento>();
	}
	
	
	
	
}

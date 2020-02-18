/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Conto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Elisa Chiari
 * @version 1.0.0 - 04/04/2017
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaContiConciliazionePerClasseResponse extends ServiceResponse {
	
	List<Conto> conti = new ArrayList<Conto>();
	
	/**
	 * @return the conti
	 */
	public List<Conto> getConti() {
		return conti;
	}

	/**
	 * @param conti the conti to set
	 */
	public void setConti(List<Conto> conti) {
		this.conti = conti;
	}
	
	
	
}

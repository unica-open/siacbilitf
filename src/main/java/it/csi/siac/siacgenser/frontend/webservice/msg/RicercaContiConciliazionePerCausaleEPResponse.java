/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Conto;

/**
 * @author Valentina
 * @version 1.0.0 - 02/11/2015
 * @deprecated usare RicercaContiConciliazionePerClasse
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
@Deprecated
public class RicercaContiConciliazionePerCausaleEPResponse extends ServiceResponse {
	
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

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Cronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * The Class RicercaCronoprogrammaResponse.
 * @author elisa
 * @version 1.0.0
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaCronoprogrammaResponse extends ServiceResponse {

	private List<Cronoprogramma> cronoprogramma = new ArrayList<Cronoprogramma>();

	/**
	 * @return the cronoprogramma
	 */
	public List<Cronoprogramma> getCronoprogramma() {
		return cronoprogramma;
	}

	/**
	 * @param cronoprogramma the cronoprogramma to set
	 */
	public void setCronoprogramma(List<Cronoprogramma> cronoprogramma) {
		this.cronoprogramma = cronoprogramma;
	}
	
	

}

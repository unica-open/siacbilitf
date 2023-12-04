/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDeiCronoprogrammiCollegatiAlProgetto extends ServiceRequest {

	private Progetto progetto;
	
	private Integer annoBilancioCronoprogrammi;

	/**
	 * @return the progetto
	 */
	public Progetto getProgetto() {
		return progetto;
	}

	/**
	 * @param progetto the progetto to set
	 */
	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}

	/**
	 * @return the annoBilancioCronoprogrammi
	 */
	public Integer getAnnoBilancioCronoprogrammi() {
		return annoBilancioCronoprogrammi;
	}

	/**
	 * @param annoBilancioCronoprogrammi the annoBilancioCronoprogrammi to set
	 */
	public void setAnnoBilancioCronoprogrammi(Integer annoBilancioCronoprogrammi) {
		this.annoBilancioCronoprogrammi = annoBilancioCronoprogrammi;
	}

}

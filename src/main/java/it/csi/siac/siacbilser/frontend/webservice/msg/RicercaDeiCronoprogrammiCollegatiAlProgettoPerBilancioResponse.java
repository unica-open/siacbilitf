/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Cronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risultato della ricerca dei cronoprogrammi associati al progetto e filtrati per bilancio di appartenenza
 * @author Marchino Alessandro
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancioResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaCronoprogrammi")
	@XmlElement(name = "cronoprogramma")
	private List<Cronoprogramma> cronoprogrami = new ArrayList<Cronoprogramma>();

	/**
	 * @return the cronoprogrammi
	 */
	@XmlTransient
	public List<Cronoprogramma> getCronoprogrami() {
		return cronoprogrami;
	}

	/**
	 * @param cronoprogrami the cronoprogrammi to set
	 */
	public void setCronoprogrami(List<Cronoprogramma> cronoprogrami) {
		this.cronoprogrami = cronoprogrami;
	}
	
}

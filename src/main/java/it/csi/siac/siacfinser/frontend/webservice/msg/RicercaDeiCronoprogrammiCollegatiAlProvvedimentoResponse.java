/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Cronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDeiCronoprogrammiCollegatiAlProvvedimentoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaCronoprogrammi")
	@XmlElement(name = "cronoprogramma")
	private List<Cronoprogramma> cronoprogrammi = new ArrayList<Cronoprogramma>();

	@XmlTransient
	public List<Cronoprogramma> getCronoprogrammi() {
		return cronoprogrammi;
	}

	public void setCronoprogrammi(List<Cronoprogramma> cronoprogrammi) {
		this.cronoprogrammi = cronoprogrammi;
	}
}

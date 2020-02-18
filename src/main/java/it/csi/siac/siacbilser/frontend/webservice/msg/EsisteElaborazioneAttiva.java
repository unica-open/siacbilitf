/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class EsisteElaborazioneAttiva extends ServiceRequest {
	
	private ElaborazioneWrapper[] elaborazioni;

	public ElaborazioneWrapper[] getElaborazioni() {
		return elaborazioni;
	}

	public void setElaborazioni(ElaborazioneWrapper... elaborazioni) {
		this.elaborazioni = elaborazioni;
	}

}

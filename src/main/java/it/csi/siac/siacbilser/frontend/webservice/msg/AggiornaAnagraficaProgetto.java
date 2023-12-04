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
public class AggiornaAnagraficaProgetto extends ServiceRequest {
	
	private Progetto progetto;
	private Boolean retrieveAggregateData = Boolean.FALSE;
	//SIAC-8900
	private Boolean byPassFaseBilancioProgetto= Boolean.FALSE;

	public Progetto getProgetto() {
		return progetto;
	}

	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}

	public Boolean getRetrieveAggregateData() {
		return retrieveAggregateData;
	}

	public void setRetrieveAggregateData(Boolean retrieveAggregateData) {
		this.retrieveAggregateData = retrieveAggregateData;
	} 
	
	//SIAC-8900
	public Boolean getByPassFaseBilancioProgetto() {
		return byPassFaseBilancioProgetto;
	}

	public void setByPassFaseBilancioProgetto(Boolean byPassFaseBilancioProgetto) {
		this.byPassFaseBilancioProgetto = byPassFaseBilancioProgetto;
	}

}

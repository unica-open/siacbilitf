/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.MutuoModelDetail;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.model.ProgettoModelDetail;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioProgetto extends ServiceRequest {

	private Integer chiaveProgetto;
	private ProgettoModelDetail[] progettoModelDetails;

	public Integer getChiaveProgetto() {
		return chiaveProgetto;
	}

	public void setChiaveProgetto(Integer chiaveProgetto) {
		this.chiaveProgetto = chiaveProgetto;
	}

	public ProgettoModelDetail[] getProgettoModelDetails() {
		return progettoModelDetails;
	}

	public void setProgettoModelDetails(ProgettoModelDetail[] progettoModelDetails) {
		this.progettoModelDetails = progettoModelDetails;
	}

	
}

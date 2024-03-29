/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacgenser.model.ProgettoModelDetail;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaProgettiAssociabiliMutuo extends ServiceRequest {

	private ParametriPaginazione parametriPaginazione;
	private ProgettoModelDetail[] progettoModelDetails;
	private Progetto progetto;
	

	
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	public ProgettoModelDetail[] getProgettoModelDetails() {
		return progettoModelDetails;
	}

	public void setProgettoModelDetails(ProgettoModelDetail[] progettoModelDetails) {
		this.progettoModelDetails = progettoModelDetails;
	}

	public Progetto getProgetto() {
		return progetto;
	}

	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}



}

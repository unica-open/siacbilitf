/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.model.AllegatoAttoStampa;

public class RicercaSinteticaStampaAllegatoAtto extends ServiceRequest {
	
	private Ente ente;
	private ParametriPaginazione parametriPaginazione;
	private AllegatoAttoStampa allegatoAttoStampa;
		
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
		
	}
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public AllegatoAttoStampa getAllegatoAttoStampa() {
		return allegatoAttoStampa;
	}
	public void setAllegatoAttoStampa(AllegatoAttoStampa allegatoAttoStampa) {
		this.allegatoAttoStampa = allegatoAttoStampa;
	}
		

}

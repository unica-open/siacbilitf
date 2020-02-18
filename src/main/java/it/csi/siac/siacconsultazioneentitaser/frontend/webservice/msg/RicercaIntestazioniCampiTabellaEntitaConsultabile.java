/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg;

import it.csi.siac.siacconsultazioneentitaser.model.EntitaConsultabile;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

public class RicercaIntestazioniCampiTabellaEntitaConsultabile extends ServiceRequest {

	private Ente ente;
	private Class<? extends EntitaConsultabile> entita;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public Class<? extends EntitaConsultabile> getEntita() {
		return entita;
	}
	public void setEntita(Class<? extends EntitaConsultabile> entita) {
		this.entita = entita;
	}

}

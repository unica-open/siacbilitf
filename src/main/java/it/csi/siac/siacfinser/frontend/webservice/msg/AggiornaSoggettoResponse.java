/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

public class AggiornaSoggettoResponse extends ServiceResponse {
	private Soggetto soggettoAggiornato;

	public Soggetto getSoggettoAggiornato() {
		return soggettoAggiornato;
	}

	public void setSoggettoAggiornato(Soggetto soggettoAggiornato) {
		this.soggettoAggiornato = soggettoAggiornato;
	}
	
}

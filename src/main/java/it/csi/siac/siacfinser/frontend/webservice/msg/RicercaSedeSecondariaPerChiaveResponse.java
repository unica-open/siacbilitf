/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

public class RicercaSedeSecondariaPerChiaveResponse extends ServiceResponse{
	
	private SedeSecondariaSoggetto sedeSecondariaSoggetto;

	//TODO
	// SEDE SOGGETTO IN MODIFICA ????
	
	public SedeSecondariaSoggetto getSedeSecondariaSoggetto() {
		return sedeSecondariaSoggetto;
	}

	public void setSedeSecondariaSoggetto(SedeSecondariaSoggetto sedeSecondariaSoggetto) {
		this.sedeSecondariaSoggetto = sedeSecondariaSoggetto;
	}	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import it.csi.siac.siacbilser.model.Cronoprogramma;
import it.csi.siac.siaccorser.model.ServiceRequest;

public class AggiornaAnagraficaCronoprogramma extends ServiceRequest {

	private Cronoprogramma cronoprogramma;
	
	public Cronoprogramma getCronoprogramma() {
		return cronoprogramma;
	}
	public void setCronoprogramma(Cronoprogramma cronoprogramma) {
		this.cronoprogramma = cronoprogramma;
	}	
	
}

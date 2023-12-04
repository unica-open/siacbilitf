/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.model.ContoTesoreria;

public class LeggiSottoContiVincolatiCapitoloResponse extends ServiceResponse {
	
	private ContoTesoreria contoTesoreria;

	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}

	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}
}

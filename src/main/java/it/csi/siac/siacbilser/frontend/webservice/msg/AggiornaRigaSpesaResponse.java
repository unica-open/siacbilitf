/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import it.csi.siac.siacbilser.model.DettaglioUscitaCronoprogramma;
import it.csi.siac.siaccorser.model.ServiceResponse;

public class AggiornaRigaSpesaResponse extends ServiceResponse {

	private DettaglioUscitaCronoprogramma dettaglioUscitaCronoprogramma;

	public DettaglioUscitaCronoprogramma getDettaglioUscitaCronoprogramma() {
		return dettaglioUscitaCronoprogramma;
	}

	public void setDettaglioUscitaCronoprogramma(DettaglioUscitaCronoprogramma dettaglioUscitaCronoprogramma) {
		this.dettaglioUscitaCronoprogramma = dettaglioUscitaCronoprogramma;
	}
}

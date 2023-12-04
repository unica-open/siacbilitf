/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DettaglioUscitaCronoprogramma;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CancellaRigaSpesa extends ServiceRequest {
	
	private DettaglioUscitaCronoprogramma dettaglioUscitaCronoprogramma;

	public DettaglioUscitaCronoprogramma getDettaglioUscitaCronoprogramma() {
		return dettaglioUscitaCronoprogramma;
	}

	public void setDettaglioUscitaCronoprogramma(DettaglioUscitaCronoprogramma dettaglioUscitaCronoprogramma) {
		this.dettaglioUscitaCronoprogramma = dettaglioUscitaCronoprogramma;
	}

}

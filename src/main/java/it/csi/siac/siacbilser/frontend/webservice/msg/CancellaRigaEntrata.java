/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DettaglioEntrataCronoprogramma;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CancellaRigaEntrata extends ServiceRequest {

	private DettaglioEntrataCronoprogramma dettaglioEntrataCronoprogramma;

	public DettaglioEntrataCronoprogramma getDettaglioEntrataCronoprogramma() {
		return dettaglioEntrataCronoprogramma;
	}

	public void setDettaglioEntrataCronoprogramma(DettaglioEntrataCronoprogramma dettaglioEntrataCronoprogramma) {
		this.dettaglioEntrataCronoprogramma = dettaglioEntrataCronoprogramma;
	}
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.saldo.VociContoCorrente;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiVociContoCorrenteResponse extends ServiceResponse {
	private VociContoCorrente vociContoCorrente;

	public VociContoCorrente getVociContoCorrente() {
		return vociContoCorrente;
	}

	public void setVociContoCorrente(VociContoCorrente vociContoCorrente) {
		this.vociContoCorrente = vociContoCorrente;
	}
}

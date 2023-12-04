/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CalcolaSaldoCassaDataResponse extends ServiceResponse {
	private BigDecimal saldoCassa;

	public BigDecimal getSaldoCassa() {
		return saldoCassa;
	}

	public void setSaldoCassa(BigDecimal saldoCassa) {
		this.saldoCassa = saldoCassa;
	}

}

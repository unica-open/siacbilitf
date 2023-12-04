/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class CalcolaImportoMovimentoCollegatoResponse extends ServiceResponse {

	private BigDecimal importo;

	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return this.importo;
	}

	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CollegaReversaliOrdinativoPagamento extends ServiceRequest {

	private Integer idOrdinativoPagamento;
	private Integer[] idOrdinativiIncasso;

	public Integer getIdOrdinativoPagamento() {
		return idOrdinativoPagamento;
	}

	public void setIdOrdinativoPagamento(Integer idOrdinativoPagamento) {
		this.idOrdinativoPagamento = idOrdinativoPagamento;
	}

	public Integer[] getIdOrdinativiIncasso() {
		return idOrdinativiIncasso;
	}

	public void setIdOrdinativiIncasso(Integer[] idOrdinativiIncasso) {
		this.idOrdinativiIncasso = idOrdinativiIncasso;
	}
}
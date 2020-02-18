/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceOrdinativoIncassoResponse extends ServiceResponse {
	
	private OrdinativoIncasso ordinativoIncassoInserito;

	public OrdinativoIncasso getOrdinativoIncassoInserito() {
		return ordinativoIncassoInserito;
	}

	public void setOrdinativoIncassoInserito(
			OrdinativoIncasso ordinativoIncassoInserito) {
		this.ordinativoIncassoInserito = ordinativoIncassoInserito;
	}
	
}

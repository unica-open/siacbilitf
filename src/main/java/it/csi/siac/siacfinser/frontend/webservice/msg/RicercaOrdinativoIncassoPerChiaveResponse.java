/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoIncasso;

/**
 * Risposta al metodo FIN.OrdinativoService.ricercaOrdinativoIncassoPerChiave()
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaOrdinativoIncassoPerChiaveResponse extends RicercaAttributiMovimentoGestioneResponse {

	private OrdinativoIncasso ordinativoIncasso;

	public OrdinativoIncasso getOrdinativoIncasso() {
		return ordinativoIncasso;
	}

	public void setOrdinativoIncasso(OrdinativoIncasso ordinativoIncasso) {
		this.ordinativoIncasso = ordinativoIncasso;
	} 	
}

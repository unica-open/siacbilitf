/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaAccertamentoK;

/**
 * Richiesta al metodo FIN.AccertamentoService.annullaAccertamento()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaAccertamento extends ServiceRequest {

	private RicercaAccertamentoK pRicercaAccertamentoK;

	public RicercaAccertamentoK getpRicercaAccertamentoK() {
		return pRicercaAccertamentoK;
	}

	public void setpRicercaAccertamentoK(
			RicercaAccertamentoK pRicercaAccertamentoK) {
		this.pRicercaAccertamentoK = pRicercaAccertamentoK;
	}

}

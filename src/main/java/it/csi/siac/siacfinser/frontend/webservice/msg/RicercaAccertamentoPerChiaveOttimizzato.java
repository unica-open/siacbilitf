/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaAccertamentoK;

/**
 * Richiesta al metodo FIN.ImpegnoService.ricercaImpegnoPerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAccertamentoPerChiaveOttimizzato extends RicercaAttributiMovimentoGestioneOttimizzato {

	private Ente ente;
	private RicercaAccertamentoK pRicercaAccertamentoK;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaAccertamentoK getpRicercaAccertamentoK() {
		return pRicercaAccertamentoK;
	}

	public void setpRicercaAccertamentoK(RicercaAccertamentoK pRicercaAccertamentoK) {
		this.pRicercaAccertamentoK = pRicercaAccertamentoK;
	}
}
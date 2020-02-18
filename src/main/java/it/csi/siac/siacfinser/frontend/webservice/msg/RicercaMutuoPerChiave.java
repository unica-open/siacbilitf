/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaMutuoK;

/**
 * Richiesta al metodo FIN.MutuoService.ricercaMutuoPerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaMutuoPerChiave extends RicercaAttributiMovimentoGestione {

	private Ente ente;
	private RicercaMutuoK pRicercaMutuoK;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaMutuoK getpRicercaMutuoK() {
		return pRicercaMutuoK;
	}

	public void setpRicercaMutuoK(RicercaMutuoK pRicercaMutuoK) {
		this.pRicercaMutuoK = pRicercaMutuoK;
	}
}
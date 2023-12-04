/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaImpegno;

/**
 * Richiesta al metodo FIN.ImpegnoService.ricercaImpegni()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaImpegni extends ServiceRequest {

	private RicercaImpegno pRicercaImpegno;
	private Ente ente;

	public RicercaImpegno getpRicercaImpegno() {
		return pRicercaImpegno;
	}

	public void setpRicercaImpegno(RicercaImpegno pRicercaImpegno) {
		this.pRicercaImpegno = pRicercaImpegno;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

}

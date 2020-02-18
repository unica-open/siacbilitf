/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaImpegnoK;

/**
 * Richiesta al metodo FIN.ImpegnoService.annullaImpegno()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaImpegno extends ServiceRequest {

	private RicercaImpegnoK pRicercaImpegnoK;

	public RicercaImpegnoK getpRicercaImpegnoK() {
		return pRicercaImpegnoK;
	}

	public void setpRicercaImpegnoK(RicercaImpegnoK pRicercaImpegnoK) {
		this.pRicercaImpegnoK = pRicercaImpegnoK;
	}

}

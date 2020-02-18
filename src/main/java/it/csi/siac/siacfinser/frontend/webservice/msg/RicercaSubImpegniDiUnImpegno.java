/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaImpegnoK;



@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSubImpegniDiUnImpegno extends RicercaAttributiMovimentoGestioneOttimizzato{

	
	private RicercaImpegnoK pRicercaImpegnoK;
	private Ente ente;
	
	
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public RicercaImpegnoK getpRicercaImpegnoK() {
		return pRicercaImpegnoK;
	}
	public void setpRicercaImpegnoK(RicercaImpegnoK pRicercaImpegnoK) {
		this.pRicercaImpegnoK = pRicercaImpegnoK;
	}
	
	
	
}

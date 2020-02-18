/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;


import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Richiesta al metodo FIN.MovimentoGestioneService.inserisceImpegni()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ModificaImportoImpegnoSuAnniSuccessivi extends ServiceRequest {
	
	private AggiornaImpegno aggiornaImpegnoPadre;
	private InserisceImpegni inserisciImpegniRequest;
	
	/**
	 * @return the aggiornaImpegnoPadre
	 */
	public AggiornaImpegno getAggiornaImpegnoPadre() {
		return aggiornaImpegnoPadre;
	}
	/**
	 * @param aggiornaImpegnoPadre the aggiornaImpegnoPadre to set
	 */
	public void setAggiornaImpegnoPadre(AggiornaImpegno aggiornaImpegnoPadre) {
		this.aggiornaImpegnoPadre = aggiornaImpegnoPadre;
	}
	/**
	 * @return the inserisciImpegniRequest
	 */
	public InserisceImpegni getInserisciImpegniRequest() {
		return inserisciImpegniRequest;
	}
	/**
	 * @param inserisciImpegniRequest the inserisciImpegniRequest to set
	 */
	public void setInserisciImpegniRequest(InserisceImpegni inserisciImpegniRequest) {
		this.inserisciImpegniRequest = inserisciImpegniRequest;
	}
	
}
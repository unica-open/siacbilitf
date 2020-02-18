/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaSpesa;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;


/**
 * Richiesta al metodo FIN.CartaContabileService.ricercaCartaContabilePerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaDocumentiCarta extends PaginazioneRequest {

	private Ente ente;
//	
	private RicercaQuotaSpesa ricercaQuotaSpesa;
//	
	private FiltriAggiuntiviRicercaDocumentiCarta filtriAggiuntivi; 
	
	public Ente getEnte() {
		return ente;
	}
//
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
//
	public RicercaQuotaSpesa getRicercaQuotaSpesa() {
		return ricercaQuotaSpesa;
	}

	public void setRicercaQuotaSpesa(RicercaQuotaSpesa ricercaQuotaSpesa) {
		this.ricercaQuotaSpesa = ricercaQuotaSpesa;
	}
	
	public FiltriAggiuntiviRicercaDocumentiCarta getFiltriAggiuntivi() {
		return filtriAggiuntivi;
	}
	public void setFiltriAggiuntivi(
			FiltriAggiuntiviRicercaDocumentiCarta filtriAggiuntivi) {
		this.filtriAggiuntivi = filtriAggiuntivi;
	}

}
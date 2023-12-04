/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.OrdinativoKey;

/**
 * 
 * Risposta per il metodo FIN.OrdinativoService.reintroitoOrdinativoPagamento()
 * 
 * @author claudio.picco
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ReintroitoOrdinativoPagamentoResponse extends ServiceResponse {

	
	private OrdinativoKey ordPagReintroitato;
	private Ente ente;
	
	private List<Errore> messaggi = new ArrayList<Errore>();
	
	public OrdinativoKey getOrdPagReintroitato() {
		return ordPagReintroitato;
	}

	public void setOrdPagReintroitato(OrdinativoKey ordPagReintroitato) {
		this.ordPagReintroitato = ordPagReintroitato;
	}

	public Ente getEnte() {
		return ente;
	}
	
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public List<Errore> getMessaggi() {
		return messaggi;
	}

	public void setMessaggi(List<Errore> messaggi) {
		this.messaggi = messaggi;
	}
	
}

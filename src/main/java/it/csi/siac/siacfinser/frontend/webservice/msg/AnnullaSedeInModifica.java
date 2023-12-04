/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.SedeSecondariaSoggetto;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Richiesta al metodo FIN.SoggettoService.annullaSedeInModifica()
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaSedeInModifica extends AbstractSoggettoServiceRequest {
	
	
	private Ente ente;
	private Soggetto soggetto;
	private SedeSecondariaSoggetto sedeDaAggiornare;

	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public Soggetto getSoggetto() {
		return soggetto;
	}
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	
	public SedeSecondariaSoggetto getSedeDaAggiornare() {
		return sedeDaAggiornare;
	}

	public void setSedeDaAggiornare(SedeSecondariaSoggetto sedeDaAggiornare) {
		this.sedeDaAggiornare = sedeDaAggiornare;
	}
	
	
}

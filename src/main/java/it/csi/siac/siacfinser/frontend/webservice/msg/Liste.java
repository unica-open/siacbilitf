/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.codifiche.TipiLista;



/**
 * Messaggio di request per il caricamento generico delle liste
 * 
 * 
 * 
 * @author luca.romanello
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class Liste extends ServiceRequest {
	
	private Bilancio bilancio;
	
	private Ente ente;
	private TipiLista[] tipi;

	public TipiLista[] getTipi() {
		return tipi;
	}

	public void setTipi(TipiLista[] tipi) {
		this.tipi = tipi;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
}

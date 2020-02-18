/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaProvvisorio;


/**
 * Consente di ricercare uno o piu' Provvisori di Cassa utilizzando diversi criteri di ricerca.
 * Restituisce una lista sintetica delle informazioni dei Provvisori di Cassa.
 *
 * @author fb
 *
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaProvvisoriDiCassa extends PaginazioneRequest {
	
	//Aggiunegere il richiedente
	
	private Ente ente;
	private Bilancio bilancio;
	private ParametroRicercaProvvisorio parametroRicercaProvvisorio;

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public ParametroRicercaProvvisorio getParametroRicercaProvvisorio() {
		return parametroRicercaProvvisorio;
	}

	public void setParametroRicercaProvvisorio(
			ParametroRicercaProvvisorio parametroRicercaProvvisorio) {
		this.parametroRicercaProvvisorio = parametroRicercaProvvisorio;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}
}

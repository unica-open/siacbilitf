/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;


/**
 * L'operazione esegue una ricerca di uno o piu' soggetti che rispettano le condizioni di UGUAGLIANZA con tutti i parametri non nulli di input.
   Il tipoLegame e' da valorizzare solo se si e' effettuata una ricerca con parametro di ricerca soggettoPrecedente o il soggettoSuccessore.
   Non si prendono in considerazione i tipi di legame che collegano un soggetto e le sue sedi.
 * @author andrea.colombo
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSediSecondarie extends ServiceRequest {
	
	private Ente ente;
	private Soggetto soggetto;
	
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
	
}

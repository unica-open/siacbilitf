/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Classe astratta che contiene i dati comuni di risposta per i servizi paginati
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public abstract class PaginazioneResponse extends ServiceResponse {
	private int numPagina, numRisultati;

	public int getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}

	public int getNumRisultati() {
		return numRisultati;
	}

	public void setNumRisultati(int numRisultati) {
		this.numRisultati = numRisultati;
	}
}

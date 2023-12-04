/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Classe astratta che contiene i dati comuni di request per i servizi paginati
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public abstract class PaginazioneRequest extends ServiceRequest {
	private int numPagina, numRisultatiPerPagina;

	public int getNumPagina() {
		return numPagina;
	}

	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}

	public int getNumRisultatiPerPagina() {
		return numRisultatiPerPagina;
	}

	public void setNumRisultatiPerPagina(int numRisultatiPerPagina) {
		this.numRisultatiPerPagina = numRisultatiPerPagina;
	}
}

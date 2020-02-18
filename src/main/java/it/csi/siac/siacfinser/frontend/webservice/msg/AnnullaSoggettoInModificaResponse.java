/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;


/**
 * Risposta al metodo FIN.SoggettoService.annullaSoggettoInModifica()
 * 
 * @author paolos
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaSoggettoInModificaResponse extends ServiceResponse {

	private Soggetto soggetto;

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
}

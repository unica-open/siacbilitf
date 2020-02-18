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
 * Risposta al metodo FIN.SoggettoService.aggiornaLegameSoggetti()
 * 
 * @author paolos
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaLegameSoggettiResponse extends ServiceResponse {

	private Soggetto soggettoCorrente;

	public Soggetto getSoggettoCorrente() {
		return soggettoCorrente;
	}
	public void setSoggettoCorrente(Soggetto soggettoCorrente) {
		this.soggettoCorrente = soggettoCorrente;
	}	
}

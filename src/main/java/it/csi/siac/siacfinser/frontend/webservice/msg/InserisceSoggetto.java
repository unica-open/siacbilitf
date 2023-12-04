/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Ignorare eventuale Soggetto.StatoOperativoAnagrafica  passato e impostarlo a 'VALIDO'.
   Impostare la dataValidita con quella passata o, se non valorizzata, con la data corrente.
   Il sistema inserisce in archivio un Soggetto con i dati passati dall'interfaccia chiamante 
   calcolando il progressivo CODICE calcolato come progressivo numerico successivo all'ultimo Codice inserito. 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceSoggetto extends AbstractSoggettoServiceRequest {
	
	
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

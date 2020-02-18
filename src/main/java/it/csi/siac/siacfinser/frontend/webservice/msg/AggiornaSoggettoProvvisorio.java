/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
/**
 * Permette l'aggiornamento di un soggetto inserito tramite utente decentrato.
 * @author andrea.colombo
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaSoggettoProvvisorio extends AggiornaSoggetto{
	
	public AggiornaSoggettoProvvisorio(){
		// Costruttore vuoto
	}
	
	public AggiornaSoggettoProvvisorio(AggiornaSoggetto is) {
		setEnte(is.getEnte());
		setSoggetto(is.getSoggetto());
		setRichiedente(is.getRichiedente());
		setDataOra(is.getDataOra());
		setAggiornaSoloSedi(is.isAggiornaSoloSedi());
	}

}

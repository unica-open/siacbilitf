/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaCartaContabile;


/**
 * 
 * L'operazione esegue una ricerca di uno o pi&ugrave; carte contabili che rispettano le condizioni con tutti i parametri non nulli di input.
 * @author andrea.colombo
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaCartaContabile extends PaginazioneRequest {
	
	private Ente ente;
	private ParametroRicercaCartaContabile parametroRicercaCartaContabile;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public ParametroRicercaCartaContabile getParametroRicercaCartaContabile() {
		return parametroRicercaCartaContabile;
	}

	public void setParametroRicercaCartaContabile(
			ParametroRicercaCartaContabile parametroRicercaCartaContabile) {
		this.parametroRicercaCartaContabile = parametroRicercaCartaContabile;
	}
}

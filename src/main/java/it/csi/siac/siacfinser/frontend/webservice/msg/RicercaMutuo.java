/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaMutuo;


/**
 * 
 * L'operazione esegue una ricerca di uno o piu' mutui che rispettano le condizioni di UGUAGLIANZA con tutti i parametri non nulli di input.
 * @author andrea.colombo
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaMutuo extends PaginazioneRequest {
	
	private Ente ente;
	private ParametroRicercaMutuo parametroRicercaMutuo;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public ParametroRicercaMutuo getParametroRicercaMutuo() {
		return parametroRicercaMutuo;
	}

	public void setParametroRicercaMutuo(
			ParametroRicercaMutuo parametroRicercaMutuo) {
		this.parametroRicercaMutuo = parametroRicercaMutuo;
	}

}

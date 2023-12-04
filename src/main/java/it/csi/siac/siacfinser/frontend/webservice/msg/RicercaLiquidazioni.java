/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.ParametroRicercaLiquidazione;

/**
 * 
 * L'operazione esegue una ricerca di uno o piu' liquidazione che rispettano le condizioni di UGUAGLIANZA 
 * con tutti i parametri non nulli di input.
 * @author ccivilla
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaLiquidazioni extends PaginazioneRequest {
	
	private Ente ente; 
	private ParametroRicercaLiquidazione parametroRicercaLiquidazione;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public ParametroRicercaLiquidazione getParametroRicercaLiquidazione() {
		return parametroRicercaLiquidazione;
	}
	public void setParametroRicercaLiquidazione(
			ParametroRicercaLiquidazione parametroRicercaLiquidazione) {
		this.parametroRicercaLiquidazione = parametroRicercaLiquidazione;
	}
	
	
}

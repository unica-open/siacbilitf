/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.msg.PaginazioneRequest;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Parametri per la ricerca delle Liquidazioni
 * 
 * @author ccivilla
 * 
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaLiquidazione extends PaginazioneRequest {
	
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

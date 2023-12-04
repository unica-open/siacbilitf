/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Avanzovincolo;

/**
 * Risposta al metodo FIN.AccertamentoService.ricercaAccertamenti()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAvanzovincoloResponse extends PaginazioneResponse {

	private List<Avanzovincolo> elencoAvanzovincolo = new ArrayList<Avanzovincolo>();

	public List<Avanzovincolo> getElencoAvanzovincolo() {
		return elencoAvanzovincolo;
	}

	public void setElencoAvanzovincolo(List<Avanzovincolo> elencoAvanzovincolo) {
		this.elencoAvanzovincolo = elencoAvanzovincolo;
	}
	
}

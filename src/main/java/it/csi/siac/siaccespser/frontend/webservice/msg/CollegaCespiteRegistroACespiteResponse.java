/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * @author antonino
 * @version 1.0.0 - 31-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class CollegaCespiteRegistroACespiteResponse extends ServiceResponse {
	
	private List<Cespite> listaScartati;
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	
	/**
	 * @return the listaScartati
	 */
	public List<Cespite> getListaScartati() {
		return listaScartati;
	}
	/**
	 * @param listaScartati the listaScartati to set
	 */
	public void setListaScartati(List<Cespite> listaScartati) {
		this.listaScartati = listaScartati;
	}
	/**
	 * @return the messaggi
	 */
	public List<Messaggio> getMessaggi() {
		return messaggi;
	}
	/**
	 * @param messaggi the messaggi to set
	 */
	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi;
	}
	
	/**
	 * Adds the messaggio.
	 *
	 * @param messaggio the messaggio
	 */
	public void addMessaggio(Messaggio messaggio) {
		if(messaggi == null) {
			setMessaggi(new ArrayList<Messaggio>());
		}
		messaggi.add(messaggio);
	}
	
}

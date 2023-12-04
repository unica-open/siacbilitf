/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import it.csi.siac.siaccorser.model.Informazione;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;

public class LeggiSottoContiVincolatiCapitoloBySubdocResponse extends ServiceResponse{
	
	private List<Informazione> informazioni = new ArrayList<Informazione>();
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	
	private List<Integer> listaIdsContoTesoreria;
	

	public List<Informazione> getInformazioni() {
		return informazioni != null? informazioni : new ArrayList<Informazione>();
	}

	public void setInformazioni(List<Informazione> informazioni) {
		this.informazioni = informazioni != null? informazioni : new ArrayList<Informazione>();
	}
	
	public void addInformazione(Informazione informazione) {
		getInformazioni().add(informazione);
	}
	
	public List<Integer> getListaIdsContoTesoreria() {
		return listaIdsContoTesoreria;
	}

	public void setListaIdsContoTesoreria(List<Integer> listaIdsContoTesoreria) {
		this.listaIdsContoTesoreria = listaIdsContoTesoreria;
	}
	
	public void addIdsContoTesoreria(List<Integer> uids) {
		if(getListaIdsContoTesoreria() == null) {
			setListaIdsContoTesoreria(new ArrayList<Integer>());
		}
		getListaIdsContoTesoreria().addAll(uids);
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
	
	public void addMessaggio(Messaggio messaggio) {
		messaggi.add(messaggio);
	}

	public void addMessaggi(List<Messaggio> messaggi) {
		this.messaggi.addAll(messaggi);
	}

}

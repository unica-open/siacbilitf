/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.azione;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.visibilita.Visibilita;
import it.csi.siac.siaccorser.model.ServiceResponse;


/**
 * The Class RicercaVisibilitaResponse.
 * @author interlogic
 * @version 1.0.0 - 10/05/2021
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVisibilitaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaVisibilita")
	@XmlElement(name = "visibilita")
	private List<Visibilita> listaVisibilita = new ArrayList<Visibilita>();

	/**
	 * @return the listaVisibilita
	 */
	@XmlTransient
	public List<Visibilita> getListaVisibilita() {
		return this.listaVisibilita;
	}

	/**
	 * @param listaVisibilita the listaVisibilita to set
	 */
	public void setListaVisibilita(List<Visibilita> listaVisibilita) {
		this.listaVisibilita = listaVisibilita;
	}
	
	/**
	 * Restituisce la lista come mappa chiave-valore
	 * @return la visibilit&agrave; come mappa
	 */
	public Map<String, Visibilita> asMap() {
		Map<String, Visibilita> res = new HashMap<String, Visibilita>();
		if(listaVisibilita == null) {
			return res;
		}
		for(Visibilita vis : listaVisibilita) {
			res.put(vis.getCampo(), vis);
		}
		return res;
	}

}

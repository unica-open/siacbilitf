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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * @author elisa
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class VerificaAnnullabilitaCategoriaCespitiResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "messaggi")
	@XmlElement(name = "messaggio")
	private List<Messaggio> listaMessaggio = new ArrayList<Messaggio>();

	/**
	 * @return the listaMessaggio
	 */
	@XmlTransient
	public List<Messaggio> getListaMessaggio() {
		return this.listaMessaggio;
	}

	/**
	 * @param listaMessaggio the listaMessaggio to set
	 */
	public void setListaMessaggio(List<Messaggio> listaMessaggio) {
		this.listaMessaggio = listaMessaggio;
	}
	
}

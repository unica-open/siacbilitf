/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Risposta per il metodo FIN.OrdinativoService.annullaOrdinativoIncasso()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaOrdinativoIncassoResponse extends ServiceResponse {
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();

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
		if(getMessaggi() == null) {
			setMessaggi(new ArrayList<Messaggio>());
		}
		getMessaggi().add(messaggio);
	}
}

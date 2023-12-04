/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.frontend.webservice.msg;
 

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.pagopa.model.RiconciliazioneDoc;
import it.csi.siac.pcc.frontend.webservice.PCCSvcDictionary;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;



@XmlType(namespace = PCCSvcDictionary.NAMESPACE)
public class RicercaRiconciliazioniDocResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaRiconciliazioniDoc")
	@XmlElement(name = "RiconciliazioneDoc")
	private ListaPaginata<RiconciliazioneDoc> riconciliazioniDoc = new ListaPaginataImpl<RiconciliazioneDoc>();
	

	
	/**
	 * @return the riconciliazioniDoc
	 */
	@XmlTransient
	public ListaPaginata<RiconciliazioneDoc> getRiconciliazioniDoc()
	{
		return riconciliazioniDoc;
	}

	/**
	 * @param riconciliazioniDoc the riconciliazioniDoc to set
	 */
	public void setRiconciliazioniDoc(ListaPaginata<RiconciliazioneDoc> riconciliazioniDoc)
	{
		this.riconciliazioniDoc = riconciliazioniDoc;
	}



	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	
	
	/**
	 * Adds the messaggio.
	 *
	 * @param messaggio the messaggio
	 */
	public void addMessaggio(Messaggio messaggio) {
		getMessaggi().add(messaggio);
	}
	
	/**
	 * Adds the messaggio.
	 *
	 * @param messaggio the messaggio
	 */
	public void addMessaggio(String codice, String descrizione) {
		addMessaggio(new Messaggio(codice,descrizione));
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
		this.messaggi = messaggi != null ? messaggi : new ArrayList<Messaggio>();
	}
	

	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<RiconciliazioneDoc>)riconciliazioniDoc).setTotaleElementi(totaleElementi);
	}	
	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<RiconciliazioneDoc>)riconciliazioniDoc).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<RiconciliazioneDoc>)riconciliazioniDoc).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<RiconciliazioneDoc>)riconciliazioniDoc).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<RiconciliazioneDoc>)riconciliazioniDoc).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<RiconciliazioneDoc>)riconciliazioniDoc).getPaginaCorrente();
	}
}

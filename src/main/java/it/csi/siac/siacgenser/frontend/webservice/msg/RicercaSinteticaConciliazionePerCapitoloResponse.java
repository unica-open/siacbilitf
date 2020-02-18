/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerCapitolo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Valentina
 * @version 1.0.0 - 28/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaConciliazionePerCapitoloResponse extends ServiceResponse {
	
	
	@XmlElementWrapper(name = "listaConciliazioni")	    
	@XmlElement(name = "conciliazionePerCapitolo")
	private ListaPaginata<ConciliazionePerCapitolo> conciliazioni = new ListaPaginataImpl<ConciliazionePerCapitolo>();

	
	@XmlTransient
	public ListaPaginata<ConciliazionePerCapitolo> getConciliazioni() {
		return conciliazioni;
	}
	
	public void setConciliazioni(ListaPaginata<ConciliazionePerCapitolo> conciliazioni) {
		this.conciliazioni = conciliazioni;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<ConciliazionePerCapitolo>)conciliazioni).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<ConciliazionePerCapitolo>)conciliazioni).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<ConciliazionePerCapitolo>)conciliazioni).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<ConciliazionePerCapitolo>)conciliazioni).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<ConciliazionePerCapitolo>)conciliazioni).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<ConciliazionePerCapitolo>)conciliazioni).getPaginaCorrente();
	}
	
}

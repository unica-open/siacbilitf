/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.PrimaNota;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaPrimaNotaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaPrimeNote")
	@XmlElement(name = "primaNota")
	private ListaPaginata<PrimaNota> primeNote = new ListaPaginataImpl<PrimaNota>();
	
	@XmlTransient
	public ListaPaginata<PrimaNota> getPrimeNote() {
		return primeNote;
	}
	public void setPrimeNote(ListaPaginata<PrimaNota> primeNote) {
		this.primeNote = primeNote;
	}

	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<PrimaNota>)primeNote).setTotaleElementi(totaleElementi);
	}	
	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<PrimaNota>)primeNote).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<PrimaNota>)primeNote).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<PrimaNota>)primeNote).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<PrimaNota>)primeNote).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<PrimaNota>)primeNote).getPaginaCorrente();
	}
	
}

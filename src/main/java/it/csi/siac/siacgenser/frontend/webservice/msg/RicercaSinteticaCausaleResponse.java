/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CausaleEP;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaCausaleResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaCausali")
	@XmlElement(name = "causale")
	private ListaPaginata<CausaleEP> causali = new ListaPaginataImpl<CausaleEP>();
	
	@XmlTransient
	public ListaPaginata<CausaleEP> getCausali() {
		return causali;
	}

	public void setCausali(ListaPaginata<CausaleEP> causale) {
		this.causali = causale;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<CausaleEP>)causali).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<CausaleEP>)causali).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<CausaleEP>)causali).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<CausaleEP>)causali).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<CausaleEP>)causali).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<CausaleEP>)causali).getPaginaCorrente();
	}
	
}

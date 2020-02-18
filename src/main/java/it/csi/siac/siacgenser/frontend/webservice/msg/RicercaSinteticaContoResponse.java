/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.Conto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaContoResponse extends ServiceResponse {
	@XmlElementWrapper(name = "listaConti")	    
	@XmlElement(name = "conto")
	private ListaPaginata<Conto> conti = new ListaPaginataImpl<Conto>();
	
	@XmlTransient
	public ListaPaginata<Conto> getConti() {
		return conti;
	}

	public void setConti(ListaPaginata<Conto> conti) {
		this.conti = conti;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<Conto>)conti).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<Conto>)conti).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<Conto>)conti).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<Conto>)conti).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<Conto>)conti).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<Conto>)conti).getPaginaCorrente();
	}

	
	
}

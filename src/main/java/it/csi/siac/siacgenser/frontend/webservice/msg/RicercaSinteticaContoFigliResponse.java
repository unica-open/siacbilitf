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
public class RicercaSinteticaContoFigliResponse extends ServiceResponse {
	private Conto contoPadre; 

	@XmlElementWrapper(name = "contiFiglio")	    
	@XmlElement(name = "conto")
	private ListaPaginata<Conto> contiFiglio = new ListaPaginataImpl<Conto>();
	
	/**
	 * @return the conto
	 */
	public Conto getContoPadre() {
		return contoPadre;
	}

	/**
	 * @param conto the conto to set
	 */
	public void setContoPadre(Conto conto) {
		this.contoPadre = conto;
	}

	@XmlTransient
	public ListaPaginata<Conto> getContiFiglio() {
		return contiFiglio;
	}

	public void setContiFiglio(ListaPaginata<Conto> conti) {
		this.contiFiglio = conti;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<Conto>)contiFiglio).setTotaleElementi(totaleElementi);
	}	

	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<Conto>)contiFiglio).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<Conto>)contiFiglio).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<Conto>)contiFiglio).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<Conto>)contiFiglio).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<Conto>)contiFiglio).getPaginaCorrente();
	}
	
	
}

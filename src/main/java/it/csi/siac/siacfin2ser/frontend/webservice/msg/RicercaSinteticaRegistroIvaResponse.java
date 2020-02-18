/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.RegistroIva;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaRegistroIvaResponse extends ServiceResponse {
	
	
	@XmlElementWrapper(name = "listaRegistroIva")	    
	@XmlElement(name = "registroIva")
	private ListaPaginata<RegistroIva> listaRegistroIva = new ListaPaginataImpl<RegistroIva>();

	@XmlTransient
	public ListaPaginata<RegistroIva> getListaRegistroIva() {
		return listaRegistroIva;
	}

	public void setListaRegistroIva(
			ListaPaginata<RegistroIva> listaRegistroIva) {
		this.listaRegistroIva = listaRegistroIva;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<RegistroIva>)listaRegistroIva).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<RegistroIva>)listaRegistroIva).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<RegistroIva>)listaRegistroIva).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<RegistroIva>)listaRegistroIva).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<RegistroIva>)listaRegistroIva).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<RegistroIva>)listaRegistroIva).getPaginaCorrente();
	}
	
	
	
	
}

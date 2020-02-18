/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaAllegatoAttoResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaAllegatiAtto")	    
	@XmlElement(name = "allegatoAtto")
	private ListaPaginata<AllegatoAtto> allegatiAtto = new ListaPaginataImpl<AllegatoAtto>();

	@XmlTransient
	public ListaPaginata<AllegatoAtto> getAllegatoAtto() {
		return allegatiAtto;
	}

	public void setAllegatiAtto(ListaPaginata<AllegatoAtto> listaAllegatoAtto) {
		this.allegatiAtto = listaAllegatoAtto;
	}	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<AllegatoAtto>)allegatiAtto).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<AllegatoAtto>)allegatiAtto).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<AllegatoAtto>)allegatiAtto).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<AllegatoAtto>)allegatiAtto).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<AllegatoAtto>)allegatiAtto).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<AllegatoAtto>)allegatiAtto).getPaginaCorrente();
	}

	
}

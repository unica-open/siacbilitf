/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaElencoResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "elenchiDocumentiAllegato")	    
	@XmlElement(name = "elencoDocumentiAllegato")
	private ListaPaginata<ElencoDocumentiAllegato> elenchiDocumentiAllegato = new ListaPaginataImpl<ElencoDocumentiAllegato>();

	@XmlTransient
	public ListaPaginata<ElencoDocumentiAllegato> getElenchiDocumentiAllegato() {
		return elenchiDocumentiAllegato;
	}

	public void setElenchiDocumentiAllegato(ListaPaginata<ElencoDocumentiAllegato> listaElencoDocumentiAllegato) {
		this.elenchiDocumentiAllegato = listaElencoDocumentiAllegato;
	}	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).getPaginaCorrente();
	}
	



}

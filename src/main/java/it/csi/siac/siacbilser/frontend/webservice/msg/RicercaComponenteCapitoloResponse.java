/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;
 
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoComponenteImportiCapitolo;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaComponenteCapitoloResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaComponenteCapitolo")	    
	@XmlElement(name = "componenteCapitolo")
	private ListaPaginata<TipoComponenteImportiCapitolo> componenteCapitolo = new ListaPaginataImpl<TipoComponenteImportiCapitolo>();

	@XmlTransient
	public ListaPaginata<TipoComponenteImportiCapitolo> getComponenteCapitolo() {
		return componenteCapitolo;
	}

	public void setComponenteCapitolo(ListaPaginata<TipoComponenteImportiCapitolo> listaComponenteCapitolo) {
		this.componenteCapitolo = listaComponenteCapitolo;
	}	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<TipoComponenteImportiCapitolo>)componenteCapitolo).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<TipoComponenteImportiCapitolo>)componenteCapitolo).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<TipoComponenteImportiCapitolo>)componenteCapitolo).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<TipoComponenteImportiCapitolo>)componenteCapitolo).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<TipoComponenteImportiCapitolo>)componenteCapitolo).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<TipoComponenteImportiCapitolo>)componenteCapitolo).getPaginaCorrente();
	}

	
}

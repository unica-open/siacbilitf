/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoOperazioneCassa;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoOperazioneDiCassaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaTipiOperazione")	    
	@XmlElement(name = "tipoOperazione")
	private ListaPaginata<TipoOperazioneCassa> tipiOperazione = new ListaPaginataImpl<TipoOperazioneCassa>();

	
	@XmlTransient
	public ListaPaginata<TipoOperazioneCassa> getTipiOperazione() {
		return tipiOperazione;
	}

	public void setTipiOperazione(ListaPaginata<TipoOperazioneCassa> tipiOperazione) {
		this.tipiOperazione = tipiOperazione;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<TipoOperazioneCassa>)tipiOperazione).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<TipoOperazioneCassa>)tipiOperazione).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<TipoOperazioneCassa>)tipiOperazione).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<TipoOperazioneCassa>)tipiOperazione).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<TipoOperazioneCassa>)tipiOperazione).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<TipoOperazioneCassa>)tipiOperazione).getPaginaCorrente();
	}
	
}

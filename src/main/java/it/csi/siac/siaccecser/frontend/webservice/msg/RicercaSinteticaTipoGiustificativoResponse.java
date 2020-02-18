/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoGiustificativo;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoGiustificativoResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaTipiGiustificativo")	    
	@XmlElement(name = "tipoGiustificativo")
	private ListaPaginata<TipoGiustificativo> tipiGiustificativo = new ListaPaginataImpl<TipoGiustificativo>();

	
	@XmlTransient
	public ListaPaginata<TipoGiustificativo> getTipiGiustificativo() {
		return tipiGiustificativo;
	}

	public void setTipiGiustificativo(
			ListaPaginata<TipoGiustificativo> tipiGiustificativo) {
		this.tipiGiustificativo = tipiGiustificativo;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<TipoGiustificativo>)tipiGiustificativo).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<TipoGiustificativo>)tipiGiustificativo).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<TipoGiustificativo>)tipiGiustificativo).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<TipoGiustificativo>)tipiGiustificativo).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<TipoGiustificativo>)tipiGiustificativo).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<TipoGiustificativo>)tipiGiustificativo).getPaginaCorrente();
	}
}

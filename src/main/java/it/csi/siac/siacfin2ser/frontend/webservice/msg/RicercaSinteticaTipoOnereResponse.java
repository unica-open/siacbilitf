/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoOnere;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoOnereResponse extends ServiceResponse {
	
	
	@XmlElementWrapper(name = "listaTipiOnere")
	@XmlElement(name = "tipoOnere")
	private ListaPaginata<TipoOnere> listaTipoOnere = new ListaPaginataImpl<TipoOnere>();

	
	@XmlTransient
	public ListaPaginata<TipoOnere> getListaTipoOnere() {
		return listaTipoOnere;
	}
	
	public void setListaTipoOnere(ListaPaginata<TipoOnere> listaTipoOnere) {
		this.listaTipoOnere = listaTipoOnere;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<TipoOnere>)listaTipoOnere).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<TipoOnere>)listaTipoOnere).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<TipoOnere>)listaTipoOnere).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<TipoOnere>)listaTipoOnere).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<TipoOnere>)listaTipoOnere).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<TipoOnere>)listaTipoOnere).getPaginaCorrente();
	}
	
	
}

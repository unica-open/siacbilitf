/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleSpesa;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaCausaleSpesaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaCausaliSpesa")   
	@XmlElement(name = "causaleSpesa")
	private ListaPaginata<CausaleSpesa> causaliSpesa = new ListaPaginataImpl<CausaleSpesa>();

	@XmlTransient
	public ListaPaginata<CausaleSpesa> getCausaliSpesa() {
		return causaliSpesa;
	}

	public void setCausaliSpesa( ListaPaginata<CausaleSpesa> listaCausaleSpesa) {
		this.causaliSpesa = listaCausaleSpesa;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<CausaleSpesa>)causaliSpesa).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<CausaleSpesa>)causaliSpesa).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<CausaleSpesa>)causaliSpesa).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<CausaleSpesa>)causaliSpesa).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<CausaleSpesa>)causaliSpesa).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<CausaleSpesa>)causaliSpesa).getPaginaCorrente();
	}
	
}

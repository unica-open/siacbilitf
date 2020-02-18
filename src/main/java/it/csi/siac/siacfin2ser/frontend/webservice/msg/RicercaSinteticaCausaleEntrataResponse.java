/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleEntrata;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaCausaleEntrataResponse extends ServiceResponse {
	


	@XmlElementWrapper(name = "listaCausaliEntrata")   
	@XmlElement(name = "causaleEntrata")
	private ListaPaginata<CausaleEntrata> causaliEntrata = new ListaPaginataImpl<CausaleEntrata>();

	@XmlTransient
	public ListaPaginata<CausaleEntrata> getCausaliEntrata() {
		return causaliEntrata;
	}

	public void setCausaliEntrata( ListaPaginata<CausaleEntrata> listaCausaleEntrata) {
		this.causaliEntrata = listaCausaleEntrata;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<CausaleEntrata>)causaliEntrata).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<CausaleEntrata>)causaliEntrata).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<CausaleEntrata>)causaliEntrata).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<CausaleEntrata>)causaliEntrata).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<CausaleEntrata>)causaliEntrata).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<CausaleEntrata>)causaliEntrata).getPaginaCorrente();
	}
	


}

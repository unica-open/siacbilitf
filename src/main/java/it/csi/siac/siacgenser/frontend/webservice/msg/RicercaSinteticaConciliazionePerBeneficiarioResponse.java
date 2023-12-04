/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ConciliazionePerBeneficiario;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Valentina
 * @version 1.0.0 - 28/10/2015
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaConciliazionePerBeneficiarioResponse extends ServiceResponse {
	
	
	@XmlElementWrapper(name = "listaConciliazioni")	    
	@XmlElement(name = "conciliazionePerbeneficiario")
	private ListaPaginata<ConciliazionePerBeneficiario> conciliazioni = new ListaPaginataImpl<ConciliazionePerBeneficiario>();

	
	@XmlTransient
	public ListaPaginata<ConciliazionePerBeneficiario> getConciliazioni() {
		return conciliazioni;
	}
	
	public void setConciliazioni(ListaPaginata<ConciliazionePerBeneficiario> conciliazioni) {
		this.conciliazioni = conciliazioni;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<ConciliazionePerBeneficiario>)conciliazioni).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<ConciliazionePerBeneficiario>)conciliazioni).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<ConciliazionePerBeneficiario>)conciliazioni).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<ConciliazionePerBeneficiario>)conciliazioni).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<ConciliazionePerBeneficiario>)conciliazioni).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<ConciliazionePerBeneficiario>)conciliazioni).getPaginaCorrente();
	}
	
}

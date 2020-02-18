/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaSinteticaRegistrazioneMovFinResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaRegistrazioniMovFin")
	@XmlElement(name = "registrazioneMovFin")
	private ListaPaginata<RegistrazioneMovFin> registrazioniMovFin = new ListaPaginataImpl<RegistrazioneMovFin>();
	
	
	@XmlTransient
	public ListaPaginata<RegistrazioneMovFin> getRegistrazioniMovFin() {
		return registrazioniMovFin;
	}
	public void setRegistrazioniMovFin(
			ListaPaginata<RegistrazioneMovFin> registrazioniMovFin) {
		this.registrazioniMovFin = registrazioniMovFin;
	}
	

	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<RegistrazioneMovFin>)registrazioniMovFin).setTotaleElementi(totaleElementi);
	}	
	
	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<RegistrazioneMovFin>)registrazioniMovFin).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<RegistrazioneMovFin>)registrazioniMovFin).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<RegistrazioneMovFin>)registrazioniMovFin).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<RegistrazioneMovFin>)registrazioniMovFin).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<RegistrazioneMovFin>)registrazioniMovFin).getPaginaCorrente();
	}
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.OperazioneCassa;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaOperazioneDiCassaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaOperazioniCassa")
	@XmlElement(name = "operazioneCassa")
	private ListaPaginata<OperazioneCassa> operazioniCassa = new ListaPaginataImpl<OperazioneCassa>();

	
	@XmlTransient
	public ListaPaginata<OperazioneCassa> getOperazioniCassa() {
		return operazioniCassa;
	}

	public void setOperazioniCassa(ListaPaginata<OperazioneCassa> operazioniCassa) {
		this.operazioniCassa = operazioniCassa;
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<OperazioneCassa>)operazioniCassa).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<OperazioneCassa>)operazioniCassa).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<OperazioneCassa>)operazioniCassa).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<OperazioneCassa>)operazioniCassa).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<OperazioneCassa>)operazioniCassa).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<OperazioneCassa>)operazioniCassa).getPaginaCorrente();
	}
}

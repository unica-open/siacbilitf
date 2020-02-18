/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.sirfelser.frontend.webservice.FELSvcDictionary;
import it.csi.siac.sirfelser.model.FatturaFEL;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FELSvcDictionary.NAMESPACE)
public class RicercaSinteticaFatturaElettronicaResponse extends ServiceResponse {
	
	
	@XmlElementWrapper(name = "listaFattureElettroniche")	    
	@XmlElement(name = "fatturaElettronica")
	private ListaPaginata<FatturaFEL> fattureFEL = new ListaPaginataImpl<FatturaFEL>();

	@XmlTransient
	public ListaPaginata<FatturaFEL> getFattureFEL() {
		return fattureFEL;
	}
	public void setFattureFEL(ListaPaginata<FatturaFEL> fattureFEL) {
		this.fattureFEL = fattureFEL;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<FatturaFEL>)fattureFEL).setTotaleElementi(totaleElementi);
	}	

	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<FatturaFEL>)fattureFEL).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<FatturaFEL>)fattureFEL).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<FatturaFEL>)fattureFEL).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<FatturaFEL>)fattureFEL).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<FatturaFEL>)fattureFEL).getPaginaCorrente();
	}

	

}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.AttoDiLegge;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Response del servizio di ricerca atto di legge
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaAttoDiLeggeResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaAttiDiLegge")
	@XmlElement(name = "attoDiLegge")
	private ListaPaginata<AttoDiLegge> attiTrovati = new ListaPaginataImpl<AttoDiLegge>();

	/**
	 * @return the attiTrovati
	 */
	@XmlTransient
	public ListaPaginata<AttoDiLegge> getAttiTrovati() {
		return attiTrovati;
	}

	/**
	 * @param attiTrovati the attiTrovati to set
	 */
	public void setAttiTrovati(ListaPaginata<AttoDiLegge> attiTrovati) {
		this.attiTrovati = attiTrovati;
	}

	/**
	 * @param totaleElementi the totaleElementi to set
	 */
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<AttoDiLegge>)attiTrovati).setTotaleElementi(totaleElementi);
	}

	/**
	 * @param totalePagine the totalePagine to set
	 */
	public void setTotalePagine(int totalePagine){
		((ListaPaginataImpl<AttoDiLegge>)attiTrovati).setTotalePagine(totalePagine);
	}

	/**
	 * @param paginaCorrente the paginaCorrente to set
	 */
	public void setPaginaCorrente(int paginaCorrente){
		((ListaPaginataImpl<AttoDiLegge>)attiTrovati).setPaginaCorrente(paginaCorrente);
	}
	
	/**
	 * @return the totaleElementi
	 */
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<AttoDiLegge>)attiTrovati).getTotaleElementi();
	}
	
	/**
	 * @return the totalePagine
	 */
	public int getTotalePagine(){
		return ((ListaPaginataImpl<AttoDiLegge>)attiTrovati).getTotalePagine();
	}
	
	/**
	 * @return the paginaCorrente
	 */
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<AttoDiLegge>)attiTrovati).getPaginaCorrente();
	}

}

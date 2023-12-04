/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAttoStampa;


@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaStampaAllegatoAttoResponse extends ServiceResponse {

	
	
	private ListaPaginata<AllegatoAttoStampa> listaAllegatoAttoStampa = new ListaPaginataImpl<AllegatoAttoStampa>();

 /* Gestisce la paginazione */  	
	
	/**
	 * @return the listaAllegatoAttoStampa
	 */
	public ListaPaginata<AllegatoAttoStampa> getListaAllegatoAttoStampa() {
		return listaAllegatoAttoStampa;
	}

	/**
	 * @param listaAllegatoAttoStampa the listaAllegatoAttoStampa to set
	 */
	public void setListaAllegatoAttoStampa(ListaPaginata<AllegatoAttoStampa> listaAllegatoAttoStampa) {
		this.listaAllegatoAttoStampa = listaAllegatoAttoStampa;
	}

	/**
	 * @param totaleElementi
	 */
	public void setTotaleElementi(int totaleElementi){

		((ListaPaginataImpl<AllegatoAttoStampa>)listaAllegatoAttoStampa ).setTotaleElementi(totaleElementi);
	}	

	/**
	 * @param totaleElementi
	 */
	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<AllegatoAttoStampa>)listaAllegatoAttoStampa ).setTotalePagine(totaleElementi);
	}	

	/**
	 * @param totaleElementi
	 */
	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<AllegatoAttoStampa>)listaAllegatoAttoStampa ).setPaginaCorrente(totaleElementi);
	}
	
	/**
	 * @return totaleElementi
	 */
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<AllegatoAttoStampa>)listaAllegatoAttoStampa ).getTotaleElementi();
	}
	
	/**
	 * @return the totalePagine
	 */
	public int getTotalePagine(){
		return ((ListaPaginataImpl<AllegatoAttoStampa>)listaAllegatoAttoStampa ).getTotalePagine();
	}
	
	/**
	 * @return the paginaCorrente
	 */
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<AllegatoAttoStampa>)listaAllegatoAttoStampa ).getPaginaCorrente();
	}
}

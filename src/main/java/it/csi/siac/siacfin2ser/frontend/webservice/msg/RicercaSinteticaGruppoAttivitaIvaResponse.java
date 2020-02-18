/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.GruppoAttivitaIva;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaGruppoAttivitaIvaResponse extends ServiceResponse {
	
	private Bilancio bilancio;
	
	@XmlElementWrapper(name = "listaGruppoAttivitaIva")	    
	@XmlElement(name = "gruppoAttivitaIva")
	private ListaPaginata<GruppoAttivitaIva> listaGruppoAttivitaIva = new ListaPaginataImpl<GruppoAttivitaIva>();
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	@XmlTransient
	public ListaPaginata<GruppoAttivitaIva> getListaGruppoAttivitaIva() {
		return listaGruppoAttivitaIva;
	}

	public void setListaGruppoAttivitaIva(
			ListaPaginata<GruppoAttivitaIva> listaGruppoAttivitaIva) {
		this.listaGruppoAttivitaIva = listaGruppoAttivitaIva;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<GruppoAttivitaIva>)listaGruppoAttivitaIva).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<GruppoAttivitaIva>)listaGruppoAttivitaIva).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<GruppoAttivitaIva>)listaGruppoAttivitaIva).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<GruppoAttivitaIva>)listaGruppoAttivitaIva).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<GruppoAttivitaIva>)listaGruppoAttivitaIva).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<GruppoAttivitaIva>)listaGruppoAttivitaIva).getPaginaCorrente();
	}
	
	
	
	
}

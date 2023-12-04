/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.StampeCassaFile;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaStampeCassaEconomaleResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaStampeCassa")	    
	@XmlElement(name = "stampaCassa")
	private ListaPaginata<StampeCassaFile> listaStampe = new ListaPaginataImpl<StampeCassaFile>();

	
	/**
	 * @return the listaStampe
	 */
	@XmlTransient
	public ListaPaginata<StampeCassaFile> getListaStampe() {
		return listaStampe;
	}

	/**
	 * @param listaStampe the listaStampe to set
	 */
	public void setListaStampe(ListaPaginata<StampeCassaFile> listaStampe) {
		this.listaStampe = listaStampe;
	}

	/**
	 * Sets the totale elementi.
	 *
	 * @param totaleElementi the new totale elementi
	 */
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<StampeCassaFile>)listaStampe).setTotaleElementi(totaleElementi);
	}	

	/**
	 * Sets the totale pagine.
	 *
	 * @param totaleElementi the new totale pagine
	 */
	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<StampeCassaFile>)listaStampe).setTotalePagine(totaleElementi);
	}	

	/**
	 * Sets the pagina corrente.
	 *
	 * @param totaleElementi the new pagina corrente
	 */
	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<StampeCassaFile>)listaStampe).setPaginaCorrente(totaleElementi);
	}
	
	/**
	 * Gets the totale elementi.
	 *
	 * @return the totale elementi
	 */
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<StampeCassaFile>)listaStampe).getTotaleElementi();
	}
	
	/**
	 * Gets the totale pagine.
	 *
	 * @return the totale pagine
	 */
	public int getTotalePagine(){
		return ((ListaPaginataImpl<StampeCassaFile>)listaStampe).getTotalePagine();
	}
	
	/**
	 * Gets the pagina corrente.
	 *
	 * @return the pagina corrente
	 */
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<StampeCassaFile>)listaStampe).getPaginaCorrente();
	}
	
}

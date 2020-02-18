/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.StampaIva;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class RicercaSinteticaStampaIvaResponse.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaStampaIvaResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaStampeIva")	    
	@XmlElement(name = "stampaIva")
	private ListaPaginata<StampaIva> stampeIva = new ListaPaginataImpl<StampaIva>();

	
	/**
	 * Gets the stampe iva.
	 *
	 * @return the stampeIva
	 */
	@XmlTransient
	public ListaPaginata<StampaIva> getStampeIva() {
		return stampeIva;
	}

	/**
	 * Sets the stampe iva.
	 *
	 * @param stampeIva the stampeIva to set
	 */
	public void setStampeIva(ListaPaginata<StampaIva> stampeIva) {
		this.stampeIva = stampeIva;
	}

	
	/**
	 * Sets the totale elementi.
	 *
	 * @param totaleElementi the new totale elementi
	 */
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<StampaIva>)stampeIva).setTotaleElementi(totaleElementi);
	}	

	/**
	 * Sets the totale pagine.
	 *
	 * @param totaleElementi the new totale pagine
	 */
	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<StampaIva>)stampeIva).setTotalePagine(totaleElementi);
	}	

	/**
	 * Sets the pagina corrente.
	 *
	 * @param totaleElementi the new pagina corrente
	 */
	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<StampaIva>)stampeIva).setPaginaCorrente(totaleElementi);
	}
	
	/**
	 * Gets the totale elementi.
	 *
	 * @return the totale elementi
	 */
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<StampaIva>)stampeIva).getTotaleElementi();
	}
	
	/**
	 * Gets the totale pagine.
	 *
	 * @return the totale pagine
	 */
	public int getTotalePagine(){
		return ((ListaPaginataImpl<StampaIva>)stampeIva).getTotalePagine();
	}
	
	/**
	 * Gets the pagina corrente.
	 *
	 * @return the pagina corrente
	 */
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<StampaIva>)stampeIva).getPaginaCorrente();
	}
	
}

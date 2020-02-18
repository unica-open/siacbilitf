/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Classe base di response per la ricerca sintetica 
 * 
 * @author Marchino Alessandro
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class RicercaSinteticaBaseResponse<O> extends ServiceResponse {
	
	/**
	 * Restituisce la lista come lista paginata per la gestione dei campi ulteriori.
	 * 
	 * @return la lista paginata
	 */
	protected abstract ListaPaginataImpl<O> getAsListaPaginata();

	/**
	 * @param totaleElementi the totale elementi to set
	 */
	public void setTotaleElementi(int totaleElementi){
		getAsListaPaginata().setTotaleElementi(totaleElementi);
	}

	/**
	 * @param totalePagine the totale pagine to set
	 */
	public void setTotalePagine(int totalePagine){
		getAsListaPaginata().setTotalePagine(totalePagine);
	}

	/**
	 * @param paginaCorrente the pagina corrente to set
	 */
	public void setPaginaCorrente(int paginaCorrente){
		getAsListaPaginata().setPaginaCorrente(paginaCorrente);
	}
	
	/**
	 * @return the totale elementi
	 */
	public int getTotaleElementi(){
		return getAsListaPaginata().getTotaleElementi();
	}
	
	/**
	 * @return the totale pagine
	 */
	public int getTotalePagine(){
		return getAsListaPaginata().getTotalePagine();
	}
	
	/**
	 * @return the pagina corrente
	 */
	public int getPaginaCorrente(){
		return getAsListaPaginata().getPaginaCorrente();
	}

}

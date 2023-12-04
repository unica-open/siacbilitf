/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DettaglioVariazioneCodificaCapitolo;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo BIL.CapitoloService.ricercaStoricoVariazioniCodificheCapitoloResponse()
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaStoricoVariazioniCodificheCapitoloResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaDatiStoricoVariazioneCodificheCapitolo")	    
	@XmlElement(name = "datiStoricoVariazioneCodificheCapitolo")
	private ListaPaginata<DettaglioVariazioneCodificaCapitolo> datiStoricoVariazioniCodificheCapitolo = new ListaPaginataImpl<DettaglioVariazioneCodificaCapitolo>();

	/**
	 * @return the variazioniCodificheCapitolo
	 */
	@XmlTransient
	public ListaPaginata<DettaglioVariazioneCodificaCapitolo> getDatiStoricoVariazioniCodificheCapitolo() {
		return datiStoricoVariazioniCodificheCapitolo;
	}

	/**
	 * @param variazioniCodificheCapitolo the variazioniCodificheCapitolo to set
	 */
	public void setDatiStoricoVariazioniCodificheCapitolo(ListaPaginata<DettaglioVariazioneCodificaCapitolo> variazioniCodificheCapitolo) {
		this.datiStoricoVariazioniCodificheCapitolo = variazioniCodificheCapitolo;
	}
	
	public void setTotalePagine(int totalePagine){
		((ListaPaginataImpl<DettaglioVariazioneCodificaCapitolo>)datiStoricoVariazioniCodificheCapitolo).setTotalePagine(totalePagine);
	}	

	public void setPaginaCorrente(int paginaCorrente){
		((ListaPaginataImpl<DettaglioVariazioneCodificaCapitolo>)datiStoricoVariazioniCodificheCapitolo).setPaginaCorrente(paginaCorrente);
	}
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<DettaglioVariazioneCodificaCapitolo>)datiStoricoVariazioniCodificheCapitolo).setTotaleElementi(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<DettaglioVariazioneCodificaCapitolo>)datiStoricoVariazioniCodificheCapitolo).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<DettaglioVariazioneCodificaCapitolo>)datiStoricoVariazioniCodificheCapitolo).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<DettaglioVariazioneCodificaCapitolo>)datiStoricoVariazioniCodificheCapitolo).getPaginaCorrente();
	}
	


}

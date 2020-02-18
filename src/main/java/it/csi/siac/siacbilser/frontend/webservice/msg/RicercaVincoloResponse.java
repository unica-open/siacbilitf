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
import it.csi.siac.siacbilser.model.VincoloCapitoli;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo
 * BIL.VincoloCapitoloService.ricercaVincoloCapitoloPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVincoloResponse extends ServiceResponse {

//	private List<VincoloCapitoli> vincoloCapitoli = new ArrayList<VincoloCapitoli>();
//
//	public List<VincoloCapitoli> getVincoloCapitoli() {
//		return vincoloCapitoli;
//	}
//
//	public void setVincoloCapitoli(List<VincoloCapitoli> vincoloCapitoli) {
//		this.vincoloCapitoli = vincoloCapitoli;
//	}
//	
	@XmlElementWrapper(name = "listaVincoli")	    
	@XmlElement(name = "vincolo")
	private ListaPaginata<VincoloCapitoli> vincoloCapitoli = new ListaPaginataImpl<VincoloCapitoli>();



	@XmlTransient
	public ListaPaginata<VincoloCapitoli> getVincoloCapitoli() {
		return vincoloCapitoli;
	}

	public void setVincoloCapitoli(
			ListaPaginata<VincoloCapitoli> vincoloCapitoli) {
		this.vincoloCapitoli = vincoloCapitoli;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<VincoloCapitoli>)vincoloCapitoli).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<VincoloCapitoli>)vincoloCapitoli).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<VincoloCapitoli>)vincoloCapitoli).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<VincoloCapitoli>)vincoloCapitoli).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<VincoloCapitoli>)vincoloCapitoli).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<VincoloCapitoli>)vincoloCapitoli).getPaginaCorrente();
	}
	
	
}

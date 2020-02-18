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
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.ImportiCapitoloEP;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaSinteticaCapitoloEntrataPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloEntrataPrevisioneResponse extends
		ServiceResponse {

	private Bilancio bilancio;
	
	@XmlElementWrapper(name = "listaCapitoli")	    
	@XmlElement(name = "capitolo")
	private ListaPaginata<CapitoloEntrataPrevisione> capitoli = new ListaPaginataImpl<CapitoloEntrataPrevisione>();

	private ImportiCapitoloEP totaleImporti;
	
	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	@XmlTransient
	public ListaPaginata<CapitoloEntrataPrevisione> getCapitoli() {
		return capitoli;
	}

	public void setCapitoli(
			ListaPaginata<CapitoloEntrataPrevisione> capitoloEntrataPrev) {
		this.capitoli = capitoloEntrataPrev;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<CapitoloEntrataPrevisione>)capitoli).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<CapitoloEntrataPrevisione>)capitoli).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<CapitoloEntrataPrevisione>)capitoli).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<CapitoloEntrataPrevisione>)capitoli).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<CapitoloEntrataPrevisione>)capitoli).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<CapitoloEntrataPrevisione>)capitoli).getPaginaCorrente();
	}

	/**
	 * @return the totaleImporti
	 */
	public ImportiCapitoloEP getTotaleImporti() {
		return totaleImporti;
	}

	/**
	 * @param totaleImporti the totaleImporti to set
	 */
	public void setTotaleImporti(ImportiCapitoloEP totaleImporti) {
		this.totaleImporti = totaleImporti;
	}
	

}

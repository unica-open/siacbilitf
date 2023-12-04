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
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.ImportiCapitoloEG;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo
 * BIL.CapitoloEntrataGestioneService.ricercaSinteticaCapitoloEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloEntrataGestioneResponse extends
		ServiceResponse {

	private Bilancio bilancio;
	
	@XmlElementWrapper(name = "listaCapitoli")	    
	@XmlElement(name = "capitolo")
	private ListaPaginata<CapitoloEntrataGestione> capitoli = new ListaPaginataImpl<CapitoloEntrataGestione>();

	private ImportiCapitoloEG totaleImporti;
	
	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	@XmlTransient
	public ListaPaginata<CapitoloEntrataGestione> getCapitoli() {
		return capitoli;
	}

	public void setCapitoli(
			ListaPaginata<CapitoloEntrataGestione> capitoloEntrataGest) {
		this.capitoli = capitoloEntrataGest;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<CapitoloEntrataGestione>)capitoli).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<CapitoloEntrataGestione>)capitoli).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<CapitoloEntrataGestione>)capitoli).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<CapitoloEntrataGestione>)capitoli).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<CapitoloEntrataGestione>)capitoli).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<CapitoloEntrataGestione>)capitoli).getPaginaCorrente();
	}

	/**
	 * @return the totaleImporti
	 */
	public ImportiCapitoloEG getTotaleImporti() {
		return totaleImporti;
	}

	/**
	 * @param totaleImporti the totaleImporti to set
	 */
	public void setTotaleImporti(ImportiCapitoloEG totaleImporti) {
		this.totaleImporti = totaleImporti;
	}

	
}

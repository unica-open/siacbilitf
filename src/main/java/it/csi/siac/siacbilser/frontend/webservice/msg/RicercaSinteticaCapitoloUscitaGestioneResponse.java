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
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.ImportiCapitoloUG;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaSinteticaCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloUscitaGestioneResponse extends
		ServiceResponse {

	private Bilancio bilancio;
	
	@XmlElementWrapper(name = "listaCapitoli")	    
	@XmlElement(name = "capitolo")
	private ListaPaginata<CapitoloUscitaGestione> capitoli = new ListaPaginataImpl<CapitoloUscitaGestione>();

	private ImportiCapitoloUG totaleImporti;
	
	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	@XmlTransient
	public ListaPaginata<CapitoloUscitaGestione> getCapitoli() {
		return capitoli;
	}

	public void setCapitoli(
			ListaPaginata<CapitoloUscitaGestione> listaCapitoloUscitaGestione) {
		this.capitoli = listaCapitoloUscitaGestione;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<CapitoloUscitaGestione>)capitoli).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<CapitoloUscitaGestione>)capitoli).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<CapitoloUscitaGestione>)capitoli).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<CapitoloUscitaGestione>)capitoli).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<CapitoloUscitaGestione>)capitoli).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<CapitoloUscitaGestione>)capitoli).getPaginaCorrente();
	}

	/**
	 * @return the totaleImporti
	 */
	public ImportiCapitoloUG getTotaleImporti() {
		return totaleImporti;
	}

	/**
	 * @param totaleImporti the totaleImporti to set
	 */
	public void setTotaleImporti(ImportiCapitoloUG totaleImporti) {
		this.totaleImporti = totaleImporti;
	}

}

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
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.model.ImportiCapitoloUP;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaSinteticaCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaMassivaCapitoloUscitaPrevisioneResponse extends ServiceResponse {

	private Bilancio bilancio;

	@XmlElementWrapper(name = "listaCapitoli")	    
	@XmlElement(name = "capitolo")
	private ListaPaginata<CapitoloUscitaPrevisione> capitoli = new ListaPaginataImpl<CapitoloUscitaPrevisione>();

	private int paginaRemote = 0;
	private int posizionePaginaRemote = 0;
	
	private ImportiCapitoloUP totaleImporti;

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public void setCapitoli(ListaPaginata<CapitoloUscitaPrevisione> listaCapitoloUscitaPrevisione) {
		this.capitoli = listaCapitoloUscitaPrevisione;
	}

	@XmlTransient
	public ListaPaginata<CapitoloUscitaPrevisione> getCapitoli() {
		return capitoli;
	}

	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<CapitoloUscitaPrevisione>)capitoli).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<CapitoloUscitaPrevisione>)capitoli).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<CapitoloUscitaPrevisione>)capitoli).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<CapitoloUscitaPrevisione>)capitoli).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<CapitoloUscitaPrevisione>)capitoli).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<CapitoloUscitaPrevisione>)capitoli).getPaginaCorrente();
	}

	public int getPaginaRemote() {
		return paginaRemote;
	}

	public void setPaginaRemote(int paginaRemote) {
		this.paginaRemote = paginaRemote;
	}

	public int getPosizionePaginaRemote() {
		return posizionePaginaRemote;
	}

	public void setPosizionePaginaRemote(int posizionePaginaRemote) {
		this.posizionePaginaRemote = posizionePaginaRemote;
	}

	/**
	 * @return the totaleImporti
	 */
	public ImportiCapitoloUP getTotaleImporti() {
		return totaleImporti;
	}

	/**
	 * @param totaleImporti the totaleImporti to set
	 */
	public void setTotaleImporti(ImportiCapitoloUP totaleImporti) {
		this.totaleImporti = totaleImporti;
	}

	
}

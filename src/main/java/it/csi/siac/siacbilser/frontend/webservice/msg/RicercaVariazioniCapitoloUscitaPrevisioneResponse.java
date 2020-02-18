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
import it.csi.siac.siacbilser.model.VariazioneCodificaCapitolo;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Risposta al metodo BIL.CapitoloUscitaPrevisioneService.ricercaVariazioniCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioniCapitoloUscitaPrevisioneResponse extends ServiceResponse {
	
	@XmlElementWrapper(name="listaVariazioniImporti")
	@XmlElement(name="variazioneImporti")
	private ListaPaginata<VariazioneImportoCapitolo> listaVariazioniImporti = new ListaPaginataImpl<VariazioneImportoCapitolo>();
	@XmlElementWrapper(name="listaVariazioniCodifiche")
	@XmlElement(name="variazioneCodifiche")
	private ListaPaginata<VariazioneCodificaCapitolo> listaVariazioniCodifiche = new ListaPaginataImpl<VariazioneCodificaCapitolo>();
	
	// ListaPaginata<VariazioneImportoCapitolo>
	public void setListaVariazioniImporti( ListaPaginata<VariazioneImportoCapitolo> listaVariazioniImporti) {
		this.listaVariazioniImporti = listaVariazioniImporti;
	}

	@XmlTransient
	public ListaPaginata<VariazioneImportoCapitolo> getListaVariazioniImporti() {
		return listaVariazioniImporti;
	}
	
	public void setTotaleElementiVariazioneImportoCapitolo(int totaleElementi){
		((ListaPaginataImpl<VariazioneImportoCapitolo>)listaVariazioniImporti).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagineVariazioneImportoCapitolo(int totaleElementi){
		((ListaPaginataImpl<VariazioneImportoCapitolo>)listaVariazioniImporti).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrenteVariazioneImportoCapitolo(int totaleElementi){
		((ListaPaginataImpl<VariazioneImportoCapitolo>)listaVariazioniImporti).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementiVariazioneImportoCapitolo(){
		return ((ListaPaginataImpl<VariazioneImportoCapitolo>)listaVariazioniImporti).getTotaleElementi();
	}
	
	public int getTotalePagineVariazioneImportoCapitolo(){
		return ((ListaPaginataImpl<VariazioneImportoCapitolo>)listaVariazioniImporti).getTotalePagine();
	}
	
	public int getPaginaCorrenteVariazioneImportoCapitolo(){
		return ((ListaPaginataImpl<VariazioneImportoCapitolo>)listaVariazioniImporti).getPaginaCorrente();
	}
	
	// ListaPaginata<VariazioneCodificaCapitolo>
	public void setListaVariazioniCodifiche(ListaPaginata<VariazioneCodificaCapitolo> listaVariazioniCodifiche) {
		this.listaVariazioniCodifiche = listaVariazioniCodifiche;
	}

	@XmlTransient
	public ListaPaginata<VariazioneCodificaCapitolo> getListaVariazioniCodifiche() {
		return listaVariazioniCodifiche;
	}
	
	public void setTotaleElementiVariazioniCodifiche(int totaleElementi){
		((ListaPaginataImpl<VariazioneCodificaCapitolo>)listaVariazioniCodifiche).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagineVariazioniCodifiche(int totaleElementi){
		((ListaPaginataImpl<VariazioneCodificaCapitolo>)listaVariazioniCodifiche).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrenteVariazioniCodifiche(int totaleElementi){
		((ListaPaginataImpl<VariazioneCodificaCapitolo>)listaVariazioniCodifiche).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementiVariazioniCodifiche(){
		return ((ListaPaginataImpl<VariazioneCodificaCapitolo>)listaVariazioniCodifiche).getTotaleElementi();
	}
	
	public int getTotalePagineVariazioniCodifiche(){
		return ((ListaPaginataImpl<VariazioneCodificaCapitolo>)listaVariazioniCodifiche).getTotalePagine();
	}
	
	public int getPaginaCorrenteVariazioniCodifiche(){
		return ((ListaPaginataImpl<VariazioneCodificaCapitolo>)listaVariazioniCodifiche).getPaginaCorrente();
	}

}

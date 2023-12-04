/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaElencoDaEmettereResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "elenchiDocumentiAllegato")	    
	@XmlElement(name = "elencoDocumentiAllegato")
	private ListaPaginata<ElencoDocumentiAllegato> elenchiDocumentiAllegato = new ListaPaginataImpl<ElencoDocumentiAllegato>();
	
	private BigDecimal totaleDaPagare;
	private BigDecimal totaleDaIncassare;
	private BigDecimal totaleEntrateCollegate;
	private BigDecimal totaleSpeseCollegate;

	@XmlTransient
	public ListaPaginata<ElencoDocumentiAllegato> getElenchiDocumentiAllegato() {
		return elenchiDocumentiAllegato;
	}

	public void setElenchiDocumentiAllegato(ListaPaginata<ElencoDocumentiAllegato> listaElencoDocumentiAllegato) {
		this.elenchiDocumentiAllegato = listaElencoDocumentiAllegato;
	}	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<ElencoDocumentiAllegato>)elenchiDocumentiAllegato).getPaginaCorrente();
	}

	/**
	 * @return the totaleDaPagare
	 */
	public BigDecimal getTotaleDaPagare() {
		return totaleDaPagare;
	}

	/**
	 * @param totaleDaPagare the totaleDaPagare to set
	 */
	public void setTotaleDaPagare(BigDecimal totaleDaPagare) {
		this.totaleDaPagare = totaleDaPagare;
	}

	/**
	 * @return the totaleDaIncassare
	 */
	public BigDecimal getTotaleDaIncassare() {
		return totaleDaIncassare;
	}

	/**
	 * @param totaleDaIncassare the totaleDaIncassare to set
	 */
	public void setTotaleDaIncassare(BigDecimal totaleDaIncassare) {
		this.totaleDaIncassare = totaleDaIncassare;
	}

	/**
	 * @return the totaleEntrateCollegate
	 */
	public BigDecimal getTotaleEntrateCollegate() {
		return totaleEntrateCollegate;
	}

	/**
	 * @param totaleEntrateCollegate the totaleEntrateCollegate to set
	 */
	public void setTotaleEntrateCollegate(BigDecimal totaleEntrateCollegate) {
		this.totaleEntrateCollegate = totaleEntrateCollegate;
	}

	/**
	 * @return the totaleSpeseCollegate
	 */
	public BigDecimal getTotaleSpeseCollegate() {
		return totaleSpeseCollegate;
	}

	/**
	 * @param totaleSpeseCollegate the totaleSpeseCollegate to set
	 */
	public void setTotaleSpeseCollegate(BigDecimal totaleSpeseCollegate) {
		this.totaleSpeseCollegate = totaleSpeseCollegate;
	}
	



}

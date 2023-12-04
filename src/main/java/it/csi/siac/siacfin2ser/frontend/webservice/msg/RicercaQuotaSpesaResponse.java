/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;


@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaQuotaSpesaResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaSubdocumentiSpesa")	    
	@XmlElement(name = "subdocumentoSpesa")
	private ListaPaginata<SubdocumentoSpesa> listaSubdocumenti = new ListaPaginataImpl<SubdocumentoSpesa>();
	
	private BigDecimal totaleImporti = BigDecimal.ZERO;

	@XmlTransient
	public ListaPaginata<SubdocumentoSpesa> getListaSubdocumenti() {
		return listaSubdocumenti;
	}

	public void setListaSubdocumenti(ListaPaginata<SubdocumentoSpesa> listaSubdocumenti) {
		this.listaSubdocumenti = listaSubdocumenti;
	}

	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoSpesa>)listaSubdocumenti).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoSpesa>)listaSubdocumenti).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<SubdocumentoSpesa>)listaSubdocumenti).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<SubdocumentoSpesa>)listaSubdocumenti).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<SubdocumentoSpesa>)listaSubdocumenti).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<SubdocumentoSpesa>)listaSubdocumenti).getPaginaCorrente();
	}

	/**
	 * @return the totaleImporti
	 */
	public BigDecimal getTotaleImporti() {
		return totaleImporti;
	}

	/**
	 * @param totaleImporti the totaleImporti to set
	 */
	public void setTotaleImporti(BigDecimal totaleImporti) {
		this.totaleImporti = totaleImporti != null ? totaleImporti : BigDecimal.ZERO;
	}

}

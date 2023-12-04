/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.Subdocumento;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;


public class BaseRicercaQuoteDaAssociareResponse extends ServiceResponse {
	
	@XmlElementWrapper(name = "listaSubdocumenti")
	@XmlElements({
		@XmlElement(name="subdocumentoSpesa", type= SubdocumentoSpesa.class),
		@XmlElement(name = "subdocumentoEntrata", type= SubdocumentoEntrata.class)
	})
	private ListaPaginata<Subdocumento<?,?>> listaSubdocumenti = new ListaPaginataImpl<Subdocumento<?,?>>();
	
	private BigDecimal totaleImporti = BigDecimal.ZERO;

	@XmlTransient
	public ListaPaginata<Subdocumento<?,?>> getListaSubdocumenti() {
		return listaSubdocumenti;
	}
	
	public void setListaSubdocumenti(
			ListaPaginata<Subdocumento<?,?>> listaSubdocumenti) {
		this.listaSubdocumenti = listaSubdocumenti;
	}

	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<Subdocumento<?,?>>)listaSubdocumenti).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<Subdocumento<?,?>>)listaSubdocumenti).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<Subdocumento<?,?>>)listaSubdocumenti).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<Subdocumento<?,?>>)listaSubdocumenti).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<Subdocumento<?,?>>)listaSubdocumenti).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<Subdocumento<?,?>>)listaSubdocumenti).getPaginaCorrente();
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

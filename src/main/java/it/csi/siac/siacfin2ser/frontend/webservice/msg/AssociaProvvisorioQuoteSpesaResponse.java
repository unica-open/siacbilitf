/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaProvvisorioQuoteSpesaResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaSubdocumentiSpesa")	    
	@XmlElement(name = "subdocumentoSpesa")
	private List<SubdocumentoSpesa> listaQuote = new ArrayList<SubdocumentoSpesa>();
	
	// SIAC-6060
	private BigDecimal importoDaRegolarizzare;

	/**
	 * @return the listaQuote
	 */
	@XmlTransient
	public List<SubdocumentoSpesa> getListaQuote() {
		return listaQuote;
	}
	/**
	 * @param listaQuote the listaQuote to set
	 */
	public void setListaQuote(List<SubdocumentoSpesa> listaQuote) {
		this.listaQuote = listaQuote;
	}
	/**
	 * 
	 * @param subdocumentoSpesa
	 */
	public void addQuota(SubdocumentoSpesa subdocumentoSpesa) {		
		this.listaQuote.add(subdocumentoSpesa);
	}
	/**
	 * @return the importoDaRegolarizzare
	 */
	public BigDecimal getImportoDaRegolarizzare() {
		return this.importoDaRegolarizzare;
	}
	/**
	 * @param importoDaRegolarizzare the importoDaRegolarizzare to set
	 */
	public void setImportoDaRegolarizzare(BigDecimal importoDaRegolarizzare) {
		this.importoDaRegolarizzare = importoDaRegolarizzare;
	}
	
}

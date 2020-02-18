/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaProvvisorioQuoteEntrataResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaSubdocumentiEntrata")
	@XmlElement(name = "subdocumentoEntrata")
	private List<SubdocumentoEntrata> listaQuote = new ArrayList<SubdocumentoEntrata>();

	// SIAC-6077
	private BigDecimal importoDaRegolarizzare;
	
	/**
	 * @return the listaQuote
	 */
	@XmlTransient
	public List<SubdocumentoEntrata> getListaQuote() {
		return listaQuote;
	}
	/**
	 * @param listaQuote the listaQuote to set
	 */
	public void setListaQuote(List<SubdocumentoEntrata> listaQuote) {
		this.listaQuote = listaQuote;
	}
	/**
	 * 
	 * @param subdocumentoEntrata
	 */
	public void addQuota(SubdocumentoEntrata subdocumentoEntrata) {		
		this.listaQuote.add(subdocumentoEntrata);
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

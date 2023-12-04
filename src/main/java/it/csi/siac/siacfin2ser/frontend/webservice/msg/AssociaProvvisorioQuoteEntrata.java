/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaProvvisorioQuoteEntrata extends ServiceRequest {

	private ProvvisorioDiCassa provvisorioDiCassa;
	private List<SubdocumentoEntrata> listaQuote = new ArrayList<SubdocumentoEntrata>();
	/**
	 * @return the provvisorioDiCassa
	 */
	public ProvvisorioDiCassa getProvvisorioDiCassa() {
		return provvisorioDiCassa;
	}
	/**
	 * @param provvisorioDiCassa the provvisorioDiCassa to set
	 */
	public void setProvvisorioDiCassa(ProvvisorioDiCassa provvisorioDiCassa) {
		this.provvisorioDiCassa = provvisorioDiCassa;
	}
	/**
	 * @return the listaQuote
	 */
	public List<SubdocumentoEntrata> getListaQuote() {
		return listaQuote;
	}
	/**
	 * @param listaQuote the listaQuote to set
	 */
	public void setListaQuote(List<SubdocumentoEntrata> listaQuote) {
		this.listaQuote = listaQuote;
	}
	
	
}

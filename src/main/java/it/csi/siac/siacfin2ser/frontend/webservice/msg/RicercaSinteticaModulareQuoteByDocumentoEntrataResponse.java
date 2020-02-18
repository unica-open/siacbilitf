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

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareQuoteByDocumentoEntrataResponse extends RicercaSinteticaBaseResponse<SubdocumentoEntrata> {

	@XmlElementWrapper(name = "subdocumentiEntrata")
	@XmlElement(name = "subdocumentoEntrata")
	private ListaPaginata<SubdocumentoEntrata> subdocumentiEntrata = new ListaPaginataImpl<SubdocumentoEntrata>();
	private BigDecimal totale = BigDecimal.ZERO;
	
	/**
	 * @return the subdocumentiEntrata
	 */
	@XmlTransient
	public ListaPaginata<SubdocumentoEntrata> getSubdocumentiEntrata() {
		return subdocumentiEntrata;
	}

	/**
	 * @param subdocumentiEntrata the subdocumentiEntrata to set
	 */
	public void setSubdocumentiEntrata(ListaPaginata<SubdocumentoEntrata> subdocumentiEntrata) {
		this.subdocumentiEntrata = subdocumentiEntrata;
	}

	/**
	 * @return the totale
	 */
	public BigDecimal getTotale() {
		return totale;
	}

	/**
	 * @param totale the totale to set
	 */
	public void setTotale(BigDecimal totale) {
		this.totale = totale;
	}

	@Override
	protected ListaPaginataImpl<SubdocumentoEntrata> getAsListaPaginata() {
		return (ListaPaginataImpl<SubdocumentoEntrata>) subdocumentiEntrata;
	}

}

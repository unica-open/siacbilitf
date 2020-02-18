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
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareQuoteByDocumentoSpesaResponse extends RicercaSinteticaBaseResponse<SubdocumentoSpesa> {

	@XmlElementWrapper(name = "subdocumentiSpesa")
	@XmlElement(name = "subdocumentoSpesa")
	private ListaPaginata<SubdocumentoSpesa> subdocumentiSpesa = new ListaPaginataImpl<SubdocumentoSpesa>();
	private BigDecimal totale = BigDecimal.ZERO;
	
	/**
	 * @return the subdocumentiSpesa
	 */
	@XmlTransient
	public ListaPaginata<SubdocumentoSpesa> getSubdocumentiSpesa() {
		return subdocumentiSpesa;
	}

	/**
	 * @param subdocumentiSpesa the subdocumentiSpesa to set
	 */
	public void setSubdocumentiSpesa(ListaPaginata<SubdocumentoSpesa> subdocumentiSpesa) {
		this.subdocumentiSpesa = subdocumentiSpesa;
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
	protected ListaPaginataImpl<SubdocumentoSpesa> getAsListaPaginata() {
		return (ListaPaginataImpl<SubdocumentoSpesa>) subdocumentiSpesa;
	}

}

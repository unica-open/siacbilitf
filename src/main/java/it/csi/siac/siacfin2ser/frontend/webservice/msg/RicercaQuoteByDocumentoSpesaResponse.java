/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaQuoteByDocumentoSpesaResponse extends ServiceResponse {

	private List<SubdocumentoSpesa> subdocumentiSpesa = new ArrayList<SubdocumentoSpesa>();

	/**
	 * @return the subdocumentiSpesa
	 */
	public List<SubdocumentoSpesa> getSubdocumentiSpesa() {
		return subdocumentiSpesa;
	}

	/**
	 * @param subdocumentiSpesa the subdocumentiSpesa to set
	 */
	public void setSubdocumentiSpesa(List<SubdocumentoSpesa> subdocumentoSpesa) {
		this.subdocumentiSpesa = subdocumentoSpesa;
	}

	
	
	
	
}

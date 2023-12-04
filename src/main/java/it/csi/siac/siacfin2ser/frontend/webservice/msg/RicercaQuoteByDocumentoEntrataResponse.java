/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaQuoteByDocumentoEntrataResponse extends ServiceResponse {

	private List<SubdocumentoEntrata> subdocumentiEntrata = new ArrayList<SubdocumentoEntrata>();

	/**
	 * @return the subdocumentiEntrata
	 */
	public List<SubdocumentoEntrata> getSubdocumentiEntrata() {
		return subdocumentiEntrata;
	}

	/**
	 * @param subdocumentiEntrata the subdocumentiEntrata to set
	 */
	public void setSubdocumentiEntrata(List<SubdocumentoEntrata> subdocumentoEntrata) {
		this.subdocumentiEntrata = subdocumentoEntrata;
	}

	
	
	
	
}

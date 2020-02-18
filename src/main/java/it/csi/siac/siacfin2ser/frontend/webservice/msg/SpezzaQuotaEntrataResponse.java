/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class SpezzaQuotaEntrataResponse extends ServiceResponse {
	
	private SubdocumentoEntrata subdocumentoEntrataAttuale;
	private SubdocumentoEntrata subdocumentoEntrataNuovo;
	/**
	 * @return the subdocumentoEntrataAttuale
	 */
	public SubdocumentoEntrata getSubdocumentoEntrataAttuale() {
		return subdocumentoEntrataAttuale;
	}
	/**
	 * @param subdocumentoEntrataAttuale the subdocumentoEntrataAttuale to set
	 */
	public void setSubdocumentoEntrataAttuale(SubdocumentoEntrata subdocumentoEntrataAttuale) {
		this.subdocumentoEntrataAttuale = subdocumentoEntrataAttuale;
	}
	/**
	 * @return the subdocumentoEntrataNuovo
	 */
	public SubdocumentoEntrata getSubdocumentoEntrataNuovo() {
		return subdocumentoEntrataNuovo;
	}
	/**
	 * @param subdocumentoEntrataNuovo the subdocumentoEntrataNuovo to set
	 */
	public void setSubdocumentoEntrataNuovo(SubdocumentoEntrata subdocumentoEntrataNuovo) {
		this.subdocumentoEntrataNuovo = subdocumentoEntrataNuovo;
	}
	
}

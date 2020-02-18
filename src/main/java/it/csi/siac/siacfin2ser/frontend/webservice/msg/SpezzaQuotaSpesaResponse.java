/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class SpezzaQuotaSpesaResponse extends ServiceResponse {
	
	private SubdocumentoSpesa subdocumentoSpesaAttuale;
	private SubdocumentoSpesa subdocumentoSpesaNuovo;
	/**
	 * @return the subdocumentoSpesaAttuale
	 */
	public SubdocumentoSpesa getSubdocumentoSpesaAttuale() {
		return subdocumentoSpesaAttuale;
	}
	/**
	 * @param subdocumentoSpesaAttuale the subdocumentoSpesaAttuale to set
	 */
	public void setSubdocumentoSpesaAttuale(SubdocumentoSpesa subdocumentoSpesaAttuale) {
		this.subdocumentoSpesaAttuale = subdocumentoSpesaAttuale;
	}
	/**
	 * @return the subdocumentoSpesaNuovo
	 */
	public SubdocumentoSpesa getSubdocumentoSpesaNuovo() {
		return subdocumentoSpesaNuovo;
	}
	/**
	 * @param subdocumentoSpesaNuovo the subdocumentoSpesaNuovo to set
	 */
	public void setSubdocumentoSpesaNuovo(SubdocumentoSpesa subdocumentoSpesaNuovo) {
		this.subdocumentoSpesaNuovo = subdocumentoSpesaNuovo;
	}
	
}

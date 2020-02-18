/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrataModelDetail;


@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareQuoteByDocumentoEntrata extends RicercaSinteticaBaseRequest {
	
	private DocumentoEntrata documentoEntrata;
	private Boolean rilevanteIva;
	private SubdocumentoEntrataModelDetail[] subdocumentoEntrataModelDetails;

	/**
	 * @return the documentoEntrata
	 */
	public DocumentoEntrata getDocumentoEntrata() {
		return documentoEntrata;
	}

	/**
	 * @param documentoEntrata the documentoEntrata to set
	 */
	public void setDocumentoEntrata(DocumentoEntrata documentoEntrata) {
		this.documentoEntrata = documentoEntrata;
	}

	/**
	 * @return the rilevanteIva
	 */
	public Boolean getRilevanteIva() {
		return rilevanteIva;
	}

	/**
	 * @param rilevanteIva the rilevanteIva to set
	 */
	public void setRilevanteIva(Boolean rilevanteIva) {
		this.rilevanteIva = rilevanteIva;
	}

	/**
	 * @return the subdocumentoEntrataModelDetails
	 */
	public SubdocumentoEntrataModelDetail[] getSubdocumentoEntrataModelDetails() {
		return subdocumentoEntrataModelDetails;
	}

	/**
	 * @param subdocumentoEntrataModelDetails the subdocumentoEntrataModelDetails to set
	 */
	public void setSubdocumentoEntrataModelDetails(SubdocumentoEntrataModelDetail... subdocumentoEntrataModelDetails) {
		this.subdocumentoEntrataModelDetails = subdocumentoEntrataModelDetails;
	}

}

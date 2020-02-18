/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.DocumentoEntrataModelDetail;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrataModelDetail;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaModulareDocumentoEntrata extends ServiceRequest {

	private DocumentoEntrata documentoEntrata;
	private DocumentoEntrataModelDetail[] documentoEntrataModelDetails;
	private SubdocumentoEntrataModelDetail[] subdocumentoEntrataModelDetails;
	

	/**
	 * @return the documentoEntrata
	 */
	public DocumentoEntrata getDocumentoEntrata() {
		return documentoEntrata;
	}

	/**
	 * Impostare semplicemente l'uid del documento entrata.
	 *
	 * @param documentoEntrata the documentoEntrata to set
	 */
	public void setDocumentoEntrata(DocumentoEntrata documentoEntrata) {
		this.documentoEntrata = documentoEntrata;
	}

	/**
	 * @return the documentoEntrataModelDetails
	 */
	public DocumentoEntrataModelDetail[] getDocumentoEntrataModelDetails() {
		return documentoEntrataModelDetails;
	}

	/**
	 * @param documentoEntrataModelDetails the documentoEntrataModelDetails to set
	 */
	public void setDocumentoEntrataModelDetails(DocumentoEntrataModelDetail... documentoEntrataModelDetails) {
		this.documentoEntrataModelDetails = documentoEntrataModelDetails;
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

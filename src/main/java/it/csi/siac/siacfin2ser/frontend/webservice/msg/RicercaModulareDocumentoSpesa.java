/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.DocumentoSpesaModelDetail;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesaModelDetail;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaModulareDocumentoSpesa extends ServiceRequest {
	
	private DocumentoSpesa documentoSpesa;
	private DocumentoSpesaModelDetail[] documentoSpesaModelDetails;
	private SubdocumentoSpesaModelDetail[] subdocumentoSpesaModelDetails;
	

	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}

	/**
	 * Impostare semplicemente l'uid del documento spesa.
	 * 
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
	}

	public DocumentoSpesaModelDetail[] getDocumentoSpesaModelDetails() {
		return this.documentoSpesaModelDetails;
	}

	/**
	 * @param documentoSpesaModelDetails the documentoSpesaModelDetails to set
	 */
	public void setDocumentoSpesaModelDetails(DocumentoSpesaModelDetail... documentoSpesaModelDetails) {
		this.documentoSpesaModelDetails = documentoSpesaModelDetails;
	}

	/**
	 * @return the subdocumentoSpesaModelDetails
	 */
	public SubdocumentoSpesaModelDetail[] getSubdocumentoSpesaModelDetails() {
		return subdocumentoSpesaModelDetails;
	}

	/**
	 * @param subdocumentoSpesaModelDetails the subdocumentoSpesaModelDetails to set
	 */
	public void setSubdocumentoSpesaModelDetails(SubdocumentoSpesaModelDetail... subdocumentoSpesaModelDetails) {
		this.subdocumentoSpesaModelDetails = subdocumentoSpesaModelDetails;
	}
	
	
	
	

}

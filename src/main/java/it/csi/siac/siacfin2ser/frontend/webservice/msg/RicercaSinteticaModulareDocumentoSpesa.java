/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesaModelDetail;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareDocumentoSpesa extends RicercaSinteticaDocumentoSpesa {
	
	private DocumentoSpesaModelDetail[] documentoSpesaModelDetails;

	/**
	 * @return the documentoSpesaModelDetails
	 */
	public DocumentoSpesaModelDetail[] getDocumentoSpesaModelDetails() {
		return documentoSpesaModelDetails;
	}

	/**
	 * @param documentoSpesaModelDetails the documentoSpesaModelDetails to set
	 */
	public void setDocumentoSpesaModelDetails(DocumentoSpesaModelDetail... documentoSpesaModelDetails) {
		this.documentoSpesaModelDetails = documentoSpesaModelDetails;
	}

	
	
}

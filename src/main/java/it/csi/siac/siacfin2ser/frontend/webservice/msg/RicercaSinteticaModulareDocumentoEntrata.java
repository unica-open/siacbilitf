/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrataModelDetail;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareDocumentoEntrata extends RicercaSinteticaDocumentoEntrata {
	
	private DocumentoEntrataModelDetail[] documentoEntrataModelDetails;

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

	
	
}


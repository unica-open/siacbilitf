/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceNotaCreditoEntrataResponse extends ServiceResponse {

	private DocumentoEntrata documentoEntrata;

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
	
}

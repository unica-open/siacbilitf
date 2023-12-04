/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class EmettiFatturaFelEntrata extends ServiceRequest {

	private DocumentoEntrata documentoEntrata;

	public DocumentoEntrata getDocumentoEntrata() {
		return documentoEntrata;
	}

	public void setDocumentoEntrata(DocumentoEntrata documentoEntrata) {
		this.documentoEntrata = documentoEntrata;
	}

}

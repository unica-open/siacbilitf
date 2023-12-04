/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.StatoOperativoDocumento;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaPuntualeDocumentoEntrata extends ServiceRequest {

	private DocumentoEntrata documentoEntrata;
	
	private StatoOperativoDocumento statoOperativoDocumentoDaEscludere;
	
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
	 * @return the statoOperativoDocumentoDaEscludere
	 */
	public StatoOperativoDocumento getStatoOperativoDocumentoDaEscludere() {
		return statoOperativoDocumentoDaEscludere;
	}
	/**
	 * @param statoOperativoDocumentoDaEscludere the statoOperativoDocumentoDaEscludere to set
	 */
	public void setStatoOperativoDocumentoDaEscludere(StatoOperativoDocumento statoOperativoDocumentoDaEscludere) {
		this.statoOperativoDocumentoDaEscludere = statoOperativoDocumentoDaEscludere;
	}
}

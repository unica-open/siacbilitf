/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.StatoOperativoDocumento;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaPuntualeDocumentoSpesa extends ServiceRequest {
	
	private DocumentoSpesa documentoSpesa;
	
	private StatoOperativoDocumento statoOperativoDocumentoDaEscludere;
	
	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}
	/**
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
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

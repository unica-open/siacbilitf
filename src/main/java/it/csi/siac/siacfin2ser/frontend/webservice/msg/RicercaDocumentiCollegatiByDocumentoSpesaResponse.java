/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaDocumentiCollegatiByDocumentoSpesaResponse extends ServiceResponse {
	
	private DocumentoSpesa documentoSpesa;
	
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
	
	public List<DocumentoEntrata> getDocumentiEntrataFiglio() {
		return documentoSpesa.getListaDocumentiEntrataFiglio();
	}
	
	public List<DocumentoEntrata> getDocumentiEntrataPadre() {
		return documentoSpesa.getListaDocumentiEntrataPadre();
	}
	
	public List<DocumentoSpesa> getDocumentiSpesaFiglio() {
		return documentoSpesa.getListaDocumentiSpesaFiglio();
	}
	
	public List<DocumentoSpesa> getDocumentiSpesaPadre() {
		return documentoSpesa.getListaDocumentiSpesaPadre();
	}
	
}

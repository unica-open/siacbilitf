/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesaModelDetail;


@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaModulareQuoteByDocumentoSpesa extends RicercaSinteticaBaseRequest {
	
	private DocumentoSpesa documentoSpesa;
	private Boolean rilevanteIva;
	private SubdocumentoSpesaModelDetail[] subdocumentoSpesaModelDetails;

	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}

	/**
	 * Impostare solo l'uid del documento di spesa.
	 * 
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
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

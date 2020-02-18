/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.Documento;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaRelazioneDocumentiResponse extends ServiceResponse {

	private Documento<?, ?> docFiglio;
	private Documento<?, ?> docPadre;
	/**
	 * @return the docFiglio
	 */
	public Documento<?, ?> getDocFiglio() {
		return docFiglio;
	}
	/**
	 * @param docFiglio the docFiglio to set
	 */
	public void setDocFiglio(Documento<?, ?> docFiglio) {
		this.docFiglio = docFiglio;
	}
	/**
	 * @return the docPadre
	 */
	public Documento<?, ?> getDocPadre() {
		return docPadre;
	}
	/**
	 * @param docPadre the docPadre to set
	 */
	public void setDocPadre(Documento<?, ?> docPadre) {
		this.docPadre = docPadre;
	}
	
	
	
	
	
}

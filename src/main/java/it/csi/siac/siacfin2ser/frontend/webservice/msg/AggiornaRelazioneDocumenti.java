/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.Documento;
import it.csi.siac.siacfin2ser.model.TipoRelazione;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaRelazioneDocumenti extends ServiceRequest {
	
	private Documento<?, ?> docFiglio;
	private Documento<?, ?> docPadre;
	private TipoRelazione tipoRelazione;
	private Bilancio bilancio;
	
	
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
	/**
	 * @return the tipoRelazione
	 */
	public TipoRelazione getTipoRelazione() {
		return tipoRelazione;
	}
	/**
	 * @param tipoRelazione the tipoRelazione to set
	 */
	public void setTipoRelazione(TipoRelazione tipoRelazione) {
		this.tipoRelazione = tipoRelazione;
	}
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	
	

}

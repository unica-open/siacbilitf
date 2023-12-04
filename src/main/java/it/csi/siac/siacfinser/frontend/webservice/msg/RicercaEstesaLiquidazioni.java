/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * 
 * L'operazione esegue una ricerca di uno o pi&ugrave; liquidazione che rispettano le condizioni di UGUAGLIANZA con tutti i parametri non nulli di input.
 * @author ccivilla
 *
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaEstesaLiquidazioni extends PaginazioneRequest {
	
	private Ente ente; 
	private Integer annoEsercizio;
	private AttoAmministrativo atto;
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	/**
	 * @return the atto
	 */
	public AttoAmministrativo getAtto() {
		return atto;
	}
	/**
	 * @param atto the atto to set
	 */
	public void setAtto(AttoAmministrativo atto) {
		this.atto = atto;
	}

}

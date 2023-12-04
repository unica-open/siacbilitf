/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.ConsultazioneEntitaSvcDictionary;
import it.csi.siac.siacconsultazioneentitaser.model.EntitaConsultabile;
import it.csi.siac.siacconsultazioneentitaser.model.TipoEntitaConsultabile;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Classe di request per la ricerca di una entit&agrave consultabile (non appartenente all'insieme delle entit&agrave selezionabili di partenza)
 * @author Elisa Chiari
 * @version 1.0.0 - 08/03/2016 
 * */
@XmlType(namespace = ConsultazioneEntitaSvcDictionary.NAMESPACE)
public class RicercaFigliEntitaConsultabile extends ServiceRequest {

	private Ente ente;
	// SIAC-5152
	private Integer annoEsercizio;
	// SIAC-6193
	@XmlElementWrapper(name = "listaParametriGenerici")
	@XmlElement(name = "parametroGenerico")
	private List<Object> listaParametriGenerici = new ArrayList<Object>();
	private boolean requestImporto;
	
	private EntitaConsultabile entitaPadre;
	private TipoEntitaConsultabile entitaDaCercare;
	
	private ParametriPaginazione parametriPaginazione;

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
	 * @return the listaParametriGenerici
	 */
	@XmlTransient
	public List<Object> getListaParametriGenerici() {
		return this.listaParametriGenerici;
	}
	/**
	 * @param listaParametriGenerici the listaParametriGenerici to set
	 */
	public void setListaParametriGenerici(List<Object> listaParametriGenerici) {
		this.listaParametriGenerici = listaParametriGenerici;
	}
	/**
	 * @return the requestImporto
	 */
	public boolean isRequestImporto() {
		return this.requestImporto;
	}
	/**
	 * @param requestImporto the requestImporto to set
	 */
	public void setRequestImporto(boolean requestImporto) {
		this.requestImporto = requestImporto;
	}
	/**
	 * @return the entitaPadre
	 */
	public EntitaConsultabile getEntitaPadre() {
		return entitaPadre;
	}
	/**
	 * @param entitaPadre the entitaPadre to set
	 */
	public void setEntitaPadre(EntitaConsultabile entitaPadre) {
		this.entitaPadre = entitaPadre;
	}
	/**
	 * @return the entitaDaCercare
	 */
	public TipoEntitaConsultabile getEntitaDaCercare() {
		return entitaDaCercare;
	}
	/**
	 * @param entitaDaCercare the entitaDaCercare to set
	 */
	public void setEntitaDaCercare(TipoEntitaConsultabile entitaDaCercare) {
		this.entitaDaCercare = entitaDaCercare;
	}
	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}
	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

}

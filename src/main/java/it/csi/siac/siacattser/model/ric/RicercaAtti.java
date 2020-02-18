/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Wrapper della ricerca degli atti
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaAtti implements Serializable {

	private static final long serialVersionUID = 7220535676345920225L;

	// AttoAmministrativo
	private Integer annoAtto;
	private Integer numeroAtto;
	private String oggetto;
	private String statoOperativo;
	private String note;
	private TipoAtto tipoAtto;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	private Integer uid;
	private boolean conDocumentoAssociato = false;

	// SIAC-6929
	private Boolean bloccoRagioneria;
	private String provenienza;
	private Boolean inseritoManualmente;

	/**
	 * @return the annoAtto
	 */
	public Integer getAnnoAtto() {
		return annoAtto;
	}

	/**
	 * @param annoAtto
	 *            the annoAtto to set
	 */
	public void setAnnoAtto(Integer annoAtto) {
		this.annoAtto = annoAtto;
	}

	/**
	 * @return the numeroAtto
	 */
	public Integer getNumeroAtto() {
		return numeroAtto;
	}

	/**
	 * @param numeroAtto
	 *            the numeroAtto to set
	 */
	public void setNumeroAtto(Integer numeroAtto) {
		this.numeroAtto = numeroAtto;
	}

	/**
	 * @return the oggetto
	 */
	public String getOggetto() {
		return oggetto;
	}

	/**
	 * @param oggetto
	 *            the oggetto to set
	 */
	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	/**
	 * @return the statoOperativo
	 */
	public String getStatoOperativo() {
		return statoOperativo;
	}

	/**
	 * @param statoOperativo
	 *            the statoOperativo to set
	 */
	public void setStatoOperativo(String statoOperativo) {
		this.statoOperativo = statoOperativo;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the tipoAtto
	 */
	public TipoAtto getTipoAtto() {
		return tipoAtto;
	}

	/**
	 * @param tipoAtto
	 *            the tipoAtto to set
	 */
	public void setTipoAtto(TipoAtto tipoAtto) {
		this.tipoAtto = tipoAtto;
	}

	/**
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}

	/**
	 * @param strutturaAmministrativoContabile
	 *            the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}

	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	/**
	 * @return the conDocumentoAssociato
	 */
	public boolean isConDocumentoAssociato() {
		return conDocumentoAssociato;
	}

	/**
	 * @param conDocumentoAssociato
	 *            the conDocumentoAssociato to set
	 */
	public void setConDocumentoAssociato(boolean conDocumentoAssociato) {
		this.conDocumentoAssociato = conDocumentoAssociato;
	}
	
	
	//SIAC - 6929
	public Boolean getBloccoRagioneria() {
		return bloccoRagioneria;
	}

	public void setBloccoRagioneria(Boolean bloccoRagioneria) {
		this.bloccoRagioneria = bloccoRagioneria;
	}

	public Boolean getInseritoManualmente() {
		return inseritoManualmente;
	}

	public void setInseritoManualmente(Boolean inseritoManualmente) {
		this.inseritoManualmente = inseritoManualmente;
	}

	public String getProvenienza() {
		return provenienza;
	}

	public void setProvenienza(String provenienza) {
		this.provenienza = provenienza;
	}
	//
	
	
	

}

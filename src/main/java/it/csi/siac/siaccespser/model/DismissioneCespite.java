/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacgenser.model.CausaleEP;
import it.csi.siac.siacgenser.model.Evento;

/**
 * Cespiti
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class DismissioneCespite extends EntitaEnteExt  {
	
	/** Per la serializzazione */
	private static final long serialVersionUID = -2903531842888582625L;
	
	private String descrizione;
	private Integer annoElenco;
	private Integer numeroElenco;
	private Date dataCessazione;
	private String descrizioneStatoCessazione;
		
	private Evento evento;
	private CausaleEP causaleEP;
	private AttoAmministrativo attoAmministrativo;
	
	private Long numeroCespitiCollegati;
	
	private StatoDismissioneCespite statoDismissioneCespite;
	

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the annoElenco
	 */
	public Integer getAnnoElenco() {
		return annoElenco;
	}
	/**
	 * @param annoElenco the annoElenco to set
	 */
	public void setAnnoElenco(Integer annoElenco) {
		this.annoElenco = annoElenco;
	}
	/**
	 * @return the numeroElenco
	 */
	public Integer getNumeroElenco() {
		return numeroElenco;
	}
	/**
	 * @param numeroElenco the numeroElenco to set
	 */
	public void setNumeroElenco(Integer numeroElenco) {
		this.numeroElenco = numeroElenco;
	}
	/**
	 * @return the dataCessazione
	 */
	public Date getDataCessazione() {
		return dataCessazione;
	}
	/**
	 * @param dataCessazione the dataCessazione to set
	 */
	public void setDataCessazione(Date dataCessazione) {
		this.dataCessazione = dataCessazione;
	}
	/**
	 * @return the descrizioneStatoCessazione
	 */
	public String getDescrizioneStatoCessazione() {
		return descrizioneStatoCessazione;
	}
	/**
	 * @param descrizioneStatoCessazione the descrizioneStatoCessazione to set
	 */
	public void setDescrizioneStatoCessazione(String descrizioneStatoCessazione) {
		this.descrizioneStatoCessazione = descrizioneStatoCessazione;
	}
	/**
	 * @return the evento
	 */
	public Evento getEvento() {
		return evento;
	}
	/**
	 * @param evento the evento to set
	 */
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	/**
	 * @return the causaleEp
	 */
	public CausaleEP getCausaleEP() {
		return causaleEP;
	}
	/**
	 * @param causaleEp the causaleEp to set
	 */
	public void setCausaleEP(CausaleEP causaleEp) {
		this.causaleEP = causaleEp;
	}
	/**
	 * @return the attoAmm
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}
	/**
	 * @param attoAmministrativo the attoAmm to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	
	/**
	 * @return the numeroCespitiCollegati
	 */
	public Long getNumeroCespitiCollegati() {
		return numeroCespitiCollegati;
	}
	/**
	 * @param numeroCespitiCollegati the numeroCespitiCollegati to set
	 */
	public void setNumeroCespitiCollegati(Long numeroCespitiCollegati) {
		this.numeroCespitiCollegati = numeroCespitiCollegati;
	}
	
	/**
	 * @return the statoDismissioneCespite
	 */
	public StatoDismissioneCespite getStatoDismissioneCespite() {
		return statoDismissioneCespite;
	}
	/**
	 * @param statoDismissioneCespite the statoDismissioneCespite to set
	 */
	public void setStatoDismissioneCespite(StatoDismissioneCespite statoDismissioneCespite) {
		this.statoDismissioneCespite = statoDismissioneCespite;
	}
	
	
	
	
	
	

}
/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;
import it.csi.siac.siacfin2ser.model.AllegatoAttoModelDetail;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.StatoOperativoAllegatoAtto;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaAllegatoAtto extends ServiceRequest {
	
	private AllegatoAtto allegatoAtto;
	
	private Date dataScadenzaDa;
	private Date dataScadenzaA;
	
	private ElencoDocumentiAllegato elencoDocumentiAllegato;
	
	private ParametriPaginazione parametriPaginazione;
	
	// CR-4276
	private Boolean flagRitenute;
	// SIAC-5021
	@XmlElementWrapper(name="modelDetails")
	@XmlElement(name="modelDetail")
	private AllegatoAttoModelDetail[] allegatoAttoModelDetails;
	
	// SIAC-5021
	private Soggetto soggetto;
	private Impegno  impegno;
	private SubImpegno  subImpegno;
	//SIAC-XXXX
	private List<StatoOperativoAllegatoAtto> statiOperativiFiltri;
	// SIAC-5660
	private List<AttoAmministrativo> listaAttoAmministrativo = new ArrayList<AttoAmministrativo>();
	// SIAC-6166
	private Bilancio bilancio;

	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}

	/**
	 * @return the dataScadenzaDa
	 */
	public Date getDataScadenzaDa() {
		return dataScadenzaDa;
	}

	/**
	 * @param dataScadenzaDa the dataScadenzaDa to set
	 */
	public void setDataScadenzaDa(Date dataScadenzaDa) {
		this.dataScadenzaDa = dataScadenzaDa;
	}

	/**
	 * @return the dataScadenzaA
	 */
	public Date getDataScadenzaA() {
		return dataScadenzaA;
	}

	/**
	 * @param dataScadenzaA the dataScadenzaA to set
	 */
	public void setDataScadenzaA(Date dataScadenzaA) {
		this.dataScadenzaA = dataScadenzaA;
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

	/**
	 * @return the elencoDocumentiAllegato
	 */
	public ElencoDocumentiAllegato getElencoDocumentiAllegato() {
		return elencoDocumentiAllegato;
	}

	/**
	 * @param elencoDocumentiAllegato the elencoDocumentiAllegato to set
	 */
	public void setElencoDocumentiAllegato(ElencoDocumentiAllegato elencoDocumentiAllegato) {
		this.elencoDocumentiAllegato = elencoDocumentiAllegato;
	}

	/**
	 * @return the flagRitenute
	 */
	public Boolean getFlagRitenute() {
		return flagRitenute;
	}

	/**
	 * @param flagRitenute the flagRitenute to set
	 */
	public void setFlagRitenute(Boolean flagRitenute) {
		this.flagRitenute = flagRitenute;
	}

	/**
	 * @return the allegatoAttoModelDetails
	 */
	@XmlTransient
	public AllegatoAttoModelDetail[] getAllegatoAttoModelDetails() {
		return allegatoAttoModelDetails;
	}

	/**
	 * @param allegatoAttoModelDetails the allegatoAttoModelDetails to set
	 */
	public void setAllegatoAttoModelDetails(AllegatoAttoModelDetail... allegatoAttoModelDetails) {
		this.allegatoAttoModelDetails = allegatoAttoModelDetails;
	}

	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}

	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	/**
	 * @return the impegno
	 */
	public Impegno getImpegno() {
		return impegno;
	}

	/**
	 * @param impegno the impegno to set
	 */
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	/**
	 * @return the subImpegno
	 */
	public SubImpegno getSubImpegno() {
		return subImpegno;
	}

	/**
	 * @param subImpegno the subImpegno to set
	 */
	public void setSubImpegno(SubImpegno subImpegno) {
		this.subImpegno = subImpegno;
	}

	/**
	 * @return the statiOperativiFiltri
	 */
	public List<StatoOperativoAllegatoAtto> getStatiOperativiFiltri() {
		return statiOperativiFiltri;
	}

	/**
	 * @param statiOperativiFiltri the statiOperativiFiltri to set
	 */
	public void setStatiOperativiFiltri(List<StatoOperativoAllegatoAtto> statiOperativiFiltri) {
		this.statiOperativiFiltri = statiOperativiFiltri;
	}

	/**
	 * @return the listaAttoAmministrativo
	 */
	public List<AttoAmministrativo> getListaAttoAmministrativo() {
		return this.listaAttoAmministrativo;
	}

	/**
	 * @param listaAttoAmministrativo the listaAttoAmministrativo to set
	 */
	public void setListaAttoAmministrativo(List<AttoAmministrativo> listaAttoAmministrativo) {
		this.listaAttoAmministrativo = listaAttoAmministrativo;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return this.bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
}

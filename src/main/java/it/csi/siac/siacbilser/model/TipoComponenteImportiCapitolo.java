/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TipoComponenteImportiCapitolo extends Entita {
	
	private static final long serialVersionUID = -7447194479811282544L;

	private MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo;
	private SottotipoComponenteImportiCapitolo sottotipoComponenteImportiCapitolo;

	private String codice;
	private String descrizione;
	private Integer anno;
	private StatoTipoComponenteImportiCapitolo statoTipoComponenteImportiCapitolo;
	
	private AmbitoComponenteImportiCapitolo ambitoComponenteImportiCapitolo;
	
	private FonteFinanziariaComponenteImportiCapitolo fonteFinanziariaComponenteImportiCapitolo;
	private MomentoComponenteImportiCapitolo momentoComponenteImportiCapitolo;
	private PropostaDefaultComponenteImportiCapitolo propostaDefaultComponenteImportiCapitolo;
	private TipoGestioneComponenteImportiCapitolo tipoGestioneComponenteImportiCapitolo;

	@XmlElementWrapper(name = "listaDettaglioComponenteImportiCapitolo")
	@XmlElement(name = "dettaglioComponenteImportiCapitolo")
	private List<DettaglioComponenteImportiCapitolo> listaDettaglioComponenteImportiCapitolo = new ArrayList<DettaglioComponenteImportiCapitolo>();
	
	private Boolean collegatoACapitoli;
	
	/**
	 * @return the macrotipoComponenteImportiCapitolo
	 */
	public MacrotipoComponenteImportiCapitolo getMacrotipoComponenteImportiCapitolo() {
		return macrotipoComponenteImportiCapitolo;
	}
	/**
	 * @param macrotipoComponenteImportiCapitolo the macrotipoComponenteImportiCapitolo to set
	 */
	public void setMacrotipoComponenteImportiCapitolo(
			MacrotipoComponenteImportiCapitolo macrotipoComponenteImportiCapitolo) {
		this.macrotipoComponenteImportiCapitolo = macrotipoComponenteImportiCapitolo;
	}
	/**
	 * @return the sottotipoComponenteImportiCapitolo
	 */
	public SottotipoComponenteImportiCapitolo getSottotipoComponenteImportiCapitolo() {
		return sottotipoComponenteImportiCapitolo;
	}
	/**
	 * @param sottotipoComponenteImportiCapitolo the sottotipoComponenteImportiCapitolo to set
	 */
	public void setSottotipoComponenteImportiCapitolo(
			SottotipoComponenteImportiCapitolo sottotipoComponenteImportiCapitolo) {
		this.sottotipoComponenteImportiCapitolo = sottotipoComponenteImportiCapitolo;
	}
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
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
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	/**
	 * @return the statoTipoComponenteImportiCapitolo
	 */
	public StatoTipoComponenteImportiCapitolo getStatoTipoComponenteImportiCapitolo() {
		return this.statoTipoComponenteImportiCapitolo;
	}
	/**
	 * @param statoTipoComponenteImportiCapitolo the statoTipoComponenteImportiCapitolo to set
	 */
	public void setStatoTipoComponenteImportiCapitolo(StatoTipoComponenteImportiCapitolo statoComponenteImportiCapitolo) {
		this.statoTipoComponenteImportiCapitolo = statoComponenteImportiCapitolo;
	}
	/**
	 * @return the ambitoComponenteImportiCapitolo
	 */
	public AmbitoComponenteImportiCapitolo getAmbitoComponenteImportiCapitolo() {
		return ambitoComponenteImportiCapitolo;
	}
	/**
	 * @param ambitoComponenteImportiCapitolo the ambitoComponenteImportiCapitolo to set
	 */
	public void setAmbitoComponenteImportiCapitolo(AmbitoComponenteImportiCapitolo ambitoComponenteImportiCapitolo) {
		this.ambitoComponenteImportiCapitolo = ambitoComponenteImportiCapitolo;
	}
	/**
	 * @return the fonteFinanziariaComponenteImportiCapitolo
	 */
	public FonteFinanziariaComponenteImportiCapitolo getFonteFinanziariaComponenteImportiCapitolo() {
		return fonteFinanziariaComponenteImportiCapitolo;
	}
	/**
	 * @param fonteFinanziariaComponenteImportiCapitolo the fonteFinanziariaComponenteImportiCapitolo to set
	 */
	public void setFonteFinanziariaComponenteImportiCapitolo(
			FonteFinanziariaComponenteImportiCapitolo fonteFinanziariaComponenteImportiCapitolo) {
		this.fonteFinanziariaComponenteImportiCapitolo = fonteFinanziariaComponenteImportiCapitolo;
	}
	/**
	 * @return the momentoComponenteImportiCapitolo
	 */
	public MomentoComponenteImportiCapitolo getMomentoComponenteImportiCapitolo() {
		return momentoComponenteImportiCapitolo;
	}
	/**
	 * @param momentoComponenteImportiCapitolo the momentoComponenteImportiCapitolo to set
	 */
	public void setMomentoComponenteImportiCapitolo(MomentoComponenteImportiCapitolo momentoComponenteImportiCapitolo) {
		this.momentoComponenteImportiCapitolo = momentoComponenteImportiCapitolo;
	}
	/**
	 * @return the propostaDefaultComponenteImportiCapitolo
	 */
	public PropostaDefaultComponenteImportiCapitolo getPropostaDefaultComponenteImportiCapitolo() {
		return propostaDefaultComponenteImportiCapitolo;
	}
	/**
	 * @param propostaDefaultComponenteImportiCapitolo the propostaDefaultComponenteImportiCapitolo to set
	 */
	public void setPropostaDefaultComponenteImportiCapitolo(
			PropostaDefaultComponenteImportiCapitolo propostaDefaultComponenteImportiCapitolo) {
		this.propostaDefaultComponenteImportiCapitolo = propostaDefaultComponenteImportiCapitolo;
	}
	/**
	 * @return the tipoGestioneComponenteImportiCapitolo
	 */
	public TipoGestioneComponenteImportiCapitolo getTipoGestioneComponenteImportiCapitolo() {
		return tipoGestioneComponenteImportiCapitolo;
	}
	/**
	 * @param tipoGestioneComponenteImportiCapitolo the tipoGestioneComponenteImportiCapitolo to set
	 */
	public void setTipoGestioneComponenteImportiCapitolo(
			TipoGestioneComponenteImportiCapitolo tipoGestioneComponenteImportiCapitolo) {
		this.tipoGestioneComponenteImportiCapitolo = tipoGestioneComponenteImportiCapitolo;
	}

	/**
	 * @return the listaDettaglioComponenteImportiCapitolo
	 */
	@XmlTransient
	public List<DettaglioComponenteImportiCapitolo> getListaDettaglioComponenteImportiCapitolo() {
		return this.listaDettaglioComponenteImportiCapitolo;
	}
	/**
	 * @param listaDettaglioComponenteImportiCapitolo the listaDettaglioComponenteImportiCapitolo to set
	 */
	public void setListaDettaglioComponenteImportiCapitolo(List<DettaglioComponenteImportiCapitolo> listaDettaglioComponenteImportiCapitolo) {
		this.listaDettaglioComponenteImportiCapitolo = listaDettaglioComponenteImportiCapitolo != null ? listaDettaglioComponenteImportiCapitolo : new ArrayList<DettaglioComponenteImportiCapitolo>();
	}
	/**
	 * @return the collegatoACapitoli
	 */
	public Boolean getCollegatoACapitoli() {
		return collegatoACapitoli;
	}
	/**
	 * @param collegatoACapitoli the collegatoACapitoli to set
	 */
	public void setCollegatoACapitoli(Boolean collegatoACapitoli) {
		this.collegatoACapitoli = collegatoACapitoli;
	}

}

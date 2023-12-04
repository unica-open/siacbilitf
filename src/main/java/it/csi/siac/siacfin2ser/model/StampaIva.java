/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siaccorser.model.file.File;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class StampaIva extends EntitaEnte {
	
	private static final long serialVersionUID = 8648463331636166154L;
	
	private Integer annoEsercizio;
	private String codice;
	private String descrizione;
	
	//

	private List<File> files = new ArrayList<File>();
	
	private List<RegistroIva> listaRegistroIva = new ArrayList<RegistroIva>();
	//stampaStato
	private TipoStampa tipoStampa;
	//stampaTipo
	private TipoStampaIva tipoStampaIva;
	private Periodo periodo;
	
	//siacTStampaValore
	private Boolean flagIncassati;
	private Boolean flagPagati;
	private Boolean flagStampaProvvisorio = Boolean.FALSE;
	private Boolean flagStampaDefinitivo = Boolean.FALSE;
	
	private Integer ultimaPaginaStampaDefinitiva;
	private Integer ultimaPaginaStampaProvvisoria;
	
	private Date ultimaDataProtocolloDefinitiva;
	private Date ultimaDataProtocolloProvvisoria;
	
	private Integer ultimoNumProtocolloDefinitivo;
	private Integer ultimoNumProtocolloProvvisorio;

	
	/**
	 * @return the flagStampaDefinitiva
	 */
	public TipoStampa getTipoStampa() {
		return tipoStampa;
	}
	/**
	 * @param flagStampaDefinitiva the flagStampaDefinitiva to set
	 */
	public void setTipoStampa(TipoStampa tipoStampa) {
		this.tipoStampa = tipoStampa;
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
	 * @return the listaRegistroIva
	 */
	public List<RegistroIva> getListaRegistroIva() {
		return listaRegistroIva;
	}
	/**
	 * @param listaRegistroIva the listaRegistroIva to set
	 */
	public void setListaRegistroIva(List<RegistroIva> listaRegistroIva) {
		this.listaRegistroIva = listaRegistroIva;
	}
	/**
	 * @return the tipoStampaIva
	 */
	public TipoStampaIva getTipoStampaIva() {
		return tipoStampaIva;
	}
	/**
	 * @param tipoStampaIva the tipoStampaIva to set
	 */
	public void setTipoStampaIva(TipoStampaIva tipoStampaIva) {
		this.tipoStampaIva = tipoStampaIva;
	}
	
	/**
	 * @return the flagStampaProvvisorio
	 */
	public Boolean getFlagStampaProvvisorio() {
		return flagStampaProvvisorio;
	}
	/**
	 * @param flagStampaProvvisorio the flagStampaProvvisorio to set
	 */
	public void setFlagStampaProvvisorio(Boolean flagStampaProvvisorio) {
		this.flagStampaProvvisorio = flagStampaProvvisorio;
	}
	/**
	 * @return the flagStampaDefinitivo
	 */
	public Boolean getFlagStampaDefinitivo() {
		return flagStampaDefinitivo;
	}
	/**
	 * @param flagStampaDefinitivo the flagStampaDefinitivo to set
	 */
	public void setFlagStampaDefinitivo(Boolean flagStampaDefinitivo) {
		this.flagStampaDefinitivo = flagStampaDefinitivo;
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
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
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
	 * @return the periodo
	 */
	@XmlJavaTypeAdapter(Periodo.PeriodoAdapter.class)
	public Periodo getPeriodo() {
		return periodo;
	}
	/**
	 * @return the flagIncassati
	 */
	public Boolean getFlagIncassati() {
		return flagIncassati;
	}
	/**
	 * @param flagIncassati the flagIncassati to set
	 */
	public void setFlagIncassati(Boolean flagIncassati) {
		this.flagIncassati = flagIncassati;
	}
	/**
	 * @return the flagPagati
	 */
	public Boolean getFlagPagati() {
		return flagPagati;
	}
	/**
	 * @param flagPagati the flagPagati to set
	 */
	public void setFlagPagati(Boolean flagPagati) {
		this.flagPagati = flagPagati;
	}
	
	
	/**
	 * @return the files
	 */
	public List<File> getFiles() {
		return files;
	}
	/**
	 * @param files the files to set
	 */
	public void setFiles(List<File> files) {
		this.files = files;
	}
	/**
	 * @return the ultimaPaginaStampaDefinitiva
	 */
	public Integer getUltimaPaginaStampaDefinitiva() {
		return ultimaPaginaStampaDefinitiva;
	}
	/**
	 * @param ultimaPaginaStampaDefinitiva the ultimaPaginaStampaDefinitiva to set
	 */
	public void setUltimaPaginaStampaDefinitiva(Integer ultimaPaginaStampaDefinitiva) {
		this.ultimaPaginaStampaDefinitiva = ultimaPaginaStampaDefinitiva;
	}
	/**
	 * @return the ultimaPaginaStampaProvvisoria
	 */
	public Integer getUltimaPaginaStampaProvvisoria() {
		return ultimaPaginaStampaProvvisoria;
	}
	/**
	 * @param ultimaPaginaStampaProvvisoria the ultimaPaginaStampaProvvisoria to set
	 */
	public void setUltimaPaginaStampaProvvisoria(
			Integer ultimaPaginaStampaProvvisoria) {
		this.ultimaPaginaStampaProvvisoria = ultimaPaginaStampaProvvisoria;
	}
	/**
	 * @return the ultimaDataProtocolloDefinitiva
	 */
	public Date getUltimaDataProtocolloDefinitiva() {
		return ultimaDataProtocolloDefinitiva;
	}
	/**
	 * @param ultimaDataProtocolloDefinitiva the ultimaDataProtocolloDefinitiva to set
	 */
	public void setUltimaDataProtocolloDefinitiva(
			Date ultimaDataProtocolloDefinitiva) {
		this.ultimaDataProtocolloDefinitiva = ultimaDataProtocolloDefinitiva;
	}
	/**
	 * @return the ultimaDataProtocolloProvvisoria
	 */
	public Date getUltimaDataProtocolloProvvisoria() {
		return ultimaDataProtocolloProvvisoria;
	}
	/**
	 * @param ultimaDataProtocolloProvvisoria the ultimaDataProtocolloProvvisoria to set
	 */
	public void setUltimaDataProtocolloProvvisoria(
			Date ultimaDataProtocolloProvvisoria) {
		this.ultimaDataProtocolloProvvisoria = ultimaDataProtocolloProvvisoria;
	}
	/**
	 * @return the ultimoNumProtocolloDefinitivo
	 */
	public Integer getUltimoNumProtocolloDefinitivo() {
		return ultimoNumProtocolloDefinitivo;
	}
	/**
	 * @param ultimoNumProtocolloDefinitivo the ultimoNumProtocolloDefinitivo to set
	 */
	public void setUltimoNumProtocolloDefinitivo(
			Integer ultimoNumProtocolloDefinitivo) {
		this.ultimoNumProtocolloDefinitivo = ultimoNumProtocolloDefinitivo;
	}
	/**
	 * @return the ultimoNumProtocolloProvvisorio
	 */
	public Integer getUltimoNumProtocolloProvvisorio() {
		return ultimoNumProtocolloProvvisorio;
	}
	/**
	 * @param ultimoNumProtocolloProvvisorio the ultimoNumProtocolloProvvisorio to set
	 */
	public void setUltimoNumProtocolloProvvisorio(
			Integer ultimoNumProtocolloProvvisorio) {
		this.ultimoNumProtocolloProvvisorio = ultimoNumProtocolloProvvisorio;
	}
	
	/**
	 * @return the dataCreazioneStampaIva
	 */
	public Date getDataCreazioneStampaIva() {
		return getDataCreazione();
	}
	
	/**
	 * @param dataCreazione the dataCreazione to set
	 */
	public void setDataCreazioneStampaIva(Date dataCreazione) {
		setDataCreazione(dataCreazione);
	}
	
}

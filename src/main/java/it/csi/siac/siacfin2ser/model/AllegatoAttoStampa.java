/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siaccorser.model.file.File;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class AllegatoAttoStampa extends EntitaEnte {

	private static final long serialVersionUID = 878689427914043996L;
	
	private AllegatoAtto allegatoAtto;
	// AllegatoAtto
	private TipoStampaAllegatoAtto tipoStampa;
	//attualmente non gestito l'annullamento
	private StatoOperativoStampaAllegatoAtto statoOperativoStampa = StatoOperativoStampaAllegatoAtto.VALIDO;
	private Integer annoEsercizio;
	private List<File> files = new ArrayList<File>();
	private String codice;
	private String descrizione;
	private Integer versioneInvioFirma;
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
	 * @return the tipoStampa
	 */
	public TipoStampaAllegatoAtto getTipoStampa() {
		return tipoStampa;
	}
	/**
	 * @param tipoStampa the tipoStampa to set
	 */
	public void setTipoStampa(TipoStampaAllegatoAtto tipoStampa) {
		this.tipoStampa = tipoStampa;
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
		this.files = files != null ? files : new ArrayList<File>();
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
	 * @return the versioneInvioFirma
	 */
	public Integer getVersioneInvioFirma() {
		return versioneInvioFirma;
	}
	/**
	 * @param versioneInvioFirma the versioneInvioFirma to set
	 */
	public void setVersioneInvioFirma(Integer versioneInvioFirma) {
		this.versioneInvioFirma = versioneInvioFirma;
	}
	/**
	 * @return the statoOperativo
	 */
	public StatoOperativoStampaAllegatoAtto getStatoOperativoStampa() {
		return statoOperativoStampa;
	}
	/**
	 * @param statoOperativoStampa the statoOperativoStampa to set
	 */
	public void setStatoOperativoStampa(StatoOperativoStampaAllegatoAtto statoOperativoStampa) {
		this.statoOperativoStampa = statoOperativoStampa;
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
	/**
	 * @return the dataCreazioneStampa
	 */
	public Date getDataCreazioneStampa(){
		return this.getDataCreazione();
	}
	/**
	 * @return the dataCreazioneStampa
	 */
	public void setDataCreazioneStampa(Date dataCreazioneStampa){
		this.setDataCreazione(dataCreazioneStampa);
	}
}

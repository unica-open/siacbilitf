/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;

/**
 * Provvedimento
 * 
 * @author alagna
 * 
 */
@XmlType(namespace = ATTDataDictionary.NAMESPACE)
public class AttoAmministrativo extends Entita {

	/** Per la serializzazione */
	private static final long serialVersionUID = 6606403856107570689L;

	private int anno;
	private int numero;
	private TipoAtto tipoAtto;

	private String note;
	private String oggetto;
	private String statoOperativo;

	private StrutturaAmministrativoContabile strutturaAmmContabile;
	private Ente ente;
	
	private AllegatoAtto allegatoAtto;
	
	// SIAC-4285
	private Boolean parereRegolaritaContabile;

	// SIAC-6929
	private Boolean bloccoRagioneria;
	private String provenienza;
	private Boolean inseritoManualmente;
	
	private Date dataCreazioneAttoAmministrativo;

	/**
	 * @return the anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the tipoAtto
	 */
	public TipoAtto getTipoAtto() {
		return tipoAtto;
	}

	/**
	 * @param tipoAtto the tipoAtto to set
	 */
	public void setTipoAtto(TipoAtto tipoAtto) {
		this.tipoAtto = tipoAtto;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the oggetto
	 */
	public String getOggetto() {
		return oggetto;
	}

	/**
	 * @param oggetto the oggetto to set
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
	 * @param statoOperativo the statoOperativo to set
	 */
	public void setStatoOperativo(String statoOperativo) {
		this.statoOperativo = statoOperativo;
	}
	
	/**
	 * @return the statoOperativoAtti
	 */
	public StatoOperativoAtti getStatoOperativoAtti() {
		return StatoOperativoAtti.fromString(statoOperativo);
	}
	
	/**
	 * @param statoOperativo the statoOperativo to set
	 */
	public void setStatoOperativo(StatoOperativoAtti statoOperativo) {
		this.statoOperativo = statoOperativo.name();
	}

	/**
	 * @return the strutturaAmmContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmmContabile() {
		return strutturaAmmContabile;
	}

	/**
	 * @param strutturaAmmContabile the strutturaAmmContabile to set
	 */
	public void setStrutturaAmmContabile(StrutturaAmministrativoContabile strutturaAmmContabile) {
		this.strutturaAmmContabile = strutturaAmmContabile;
	}

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
	 * @return the parereRegolaritaContabile
	 */
	public Boolean getParereRegolaritaContabile() {
		return parereRegolaritaContabile;
	}

	/**
	 * @param parereRegolaritaContabile the parereRegolaritaContabile to set
	 */
	public void setParereRegolaritaContabile(Boolean parereRegolaritaContabile) {
		this.parereRegolaritaContabile = parereRegolaritaContabile;
	}

	public Boolean getBloccoRagioneria() {
		return bloccoRagioneria;
	}

	public void setBloccoRagioneria(Boolean bloccoRagioneria) {
		this.bloccoRagioneria = bloccoRagioneria;
	}

	public String getProvenienza() {
		return provenienza;
	}


	public void setProvenienza(String provenienza) {
		this.provenienza = provenienza;
	}

	public Boolean getInseritoManualmente() {
		return inseritoManualmente;
	}

	public void setInseritoManualmente(Boolean inseritoManualmente) {
		this.inseritoManualmente = inseritoManualmente;
	}


	@XmlSchemaType(name="dateTime")
	public Date getDataCreazioneAttoAmministrativo() {
		return dataCreazioneAttoAmministrativo;
	}

	public void setDataCreazioneAttoAmministrativo(Date dataCreazioneAttoAmministrativo) {
		this.dataCreazioneAttoAmministrativo = dataCreazioneAttoAmministrativo;
	}

}

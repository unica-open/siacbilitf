/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/*
 * 
 */
package it.csi.siac.siacbilser.model;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * VariazioneDiBilancio
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VariazioneDiBilancio extends Entita {

	
	private static final long serialVersionUID = 2169432503422264011L;
	
	private Ente ente;
	private Bilancio bilancio;	
	private String descrizione;
	private String note;
	private Date data;
	private Integer numero;
	//(SiacDVariazioneStatoEnum)
	private StatoOperativoVariazioneDiBilancio statoOperativoVariazioneDiBilancio;
	//(SiacDVariazioneTipoEnum)
	private TipoVariazione tipoVariazione;
	
	//SIAC-6884
	private Date dataAperturaProposta;
	private Date dataChiusuraProposta;
	private Boolean flagGiunta;
	private Boolean flagConsiglio;
	private StrutturaAmministrativoContabile direzioneProponente;

	public Boolean getFlagGiunta() {
		return flagGiunta;
	}

	public void setFlagGiunta(Boolean flagGiunta) {
		this.flagGiunta = flagGiunta;
	}

	public Boolean getFlagConsiglio() {
		return flagConsiglio;
	}

	public void setFlagConsiglio(Boolean flagConsiglio) {
		this.flagConsiglio = flagConsiglio;
	}
	
	public Date getDataChiusuraProposta() {
		return dataChiusuraProposta;
	}

	public void setDataChiusuraProposta(Date dataChiusuraProposta) {
		this.dataChiusuraProposta = dataChiusuraProposta;
	}
	
	public boolean isDecentrata(){
		//SIAC-6884 - la variazione si considera decentrata se è presente la data di apertura
		return dataAperturaProposta != null;
	}
	
	public StrutturaAmministrativoContabile getDirezioneProponente() {
		return direzioneProponente;
	}

	public void setDirezioneProponente(StrutturaAmministrativoContabile direzioneProponente) {
		this.direzioneProponente = direzioneProponente;
	}

	public Date getDataAperturaProposta() {
		return dataAperturaProposta;
	}

	public void setDataAperturaProposta(Date dataAperturaProposta) {
		this.dataAperturaProposta = dataAperturaProposta;
	}

	/**
	 * Gets the ente.
	 *
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * Sets the ente.
	 *
	 * @param ente the new ente
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * Gets the bilancio.
	 *
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * Sets the bilancio.
	 *
	 * @param bilancio the new bilancio
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * Gets the descrizione.
	 *
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * Sets the descrizione.
	 *
	 * @param descrizione the new descrizione
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * Gets the note.
	 *
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * Sets the note.
	 *
	 * @param note the new note
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the new numero
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(Date data) {
		this.data = data;
	}
	
	/**
	 * Gets the stato operativo variazione di bilancio.
	 *
	 * @return the stato operativo variazione di bilancio
	 */
	public StatoOperativoVariazioneDiBilancio getStatoOperativoVariazioneDiBilancio() {
		return statoOperativoVariazioneDiBilancio;
	}

	/**
	 * Sets the stato operativo variazione di bilancio.
	 *
	 * @param statoOperativoVariazioneDiBilancio the new stato operativo variazione di bilancio
	 */
	public void setStatoOperativoVariazioneDiBilancio(StatoOperativoVariazioneDiBilancio statoOperativoVariazioneDiBilancio) {
		this.statoOperativoVariazioneDiBilancio = statoOperativoVariazioneDiBilancio;
	}

	/**
	 * Gets the tipo variazione.
	 *
	 * @return the tipo variazione
	 */
	public TipoVariazione getTipoVariazione() {
		return tipoVariazione;
	}

	/**
	 * Sets the tipo variazione.
	 *
	 * @param tipoVariazione the new tipo variazione
	 */
	public void setTipoVariazione(TipoVariazione tipoVariazione) {
		this.tipoVariazione = tipoVariazione;
	}
	
}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class DatiAnagraficiPreDocumento extends EntitaEnteExt  {
	
	private static final long serialVersionUID = -4526289395817055733L;	
	
	private String codiceFiscale;
	private String partitaIva;
	private String ragioneSociale;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String comuneNascita;
	private String nazioneNascita;
	private String sesso;
	private String indirizzo;
	private String comuneIndirizzo;
	private String nazioneIndirizzo;
	private String indirizzoEmail;
	private String numTelefono;
	
	
	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	/**
	 * @param codiceFiscale the codiceFiscale to set
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	/**
	 * @return the partitaIva
	 */
	public String getPartitaIva() {
		return partitaIva;
	}
	/**
	 * @param partitaIva the partitaIva to set
	 */
	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}
	/**
	 * @return the ragioneSociale
	 */
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	/**
	 * @param ragioneSociale the ragioneSociale to set
	 */
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * @return the dataNascita
	 */
	public Date getDataNascita() {
		return dataNascita;
	}
	/**
	 * @param dataNascita the dataNascita to set
	 */
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	/**
	 * @return the comuneNascita
	 */
	public String getComuneNascita() {
		return comuneNascita;
	}
	/**
	 * @param comuneNascita the comuneNascita to set
	 */
	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}
	/**
	 * @return the nazioneNascita
	 */
	public String getNazioneNascita() {
		return nazioneNascita;
	}
	/**
	 * @param nazioneNascita the nazioneNascita to set
	 */
	public void setNazioneNascita(String nazioneNascita) {
		this.nazioneNascita = nazioneNascita;
	}
	/**
	 * @return the sesso
	 */
	public String getSesso() {
		return sesso;
	}
	/**
	 * @param sesso the sesso to set
	 */
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	/**
	 * @return the indirizzo
	 */
	public String getIndirizzo() {
		return indirizzo;
	}
	/**
	 * @param indirizzo the indirizzo to set
	 */
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	/**
	 * @return the comuneIndirizzo
	 */
	public String getComuneIndirizzo() {
		return comuneIndirizzo;
	}
	/**
	 * @param comuneIndirizzo the comuneIndirizzo to set
	 */
	public void setComuneIndirizzo(String comuneIndirizzo) {
		this.comuneIndirizzo = comuneIndirizzo;
	}
	/**
	 * @return the nazioneIndirizzo
	 */
	public String getNazioneIndirizzo() {
		return nazioneIndirizzo;
	}
	/**
	 * @param nazioneIndirizzo the nazioneIndirizzo to set
	 */
	public void setNazioneIndirizzo(String nazioneIndirizzo) {
		this.nazioneIndirizzo = nazioneIndirizzo;
	}
	/**
	 * @return the indirizzoEmail
	 */
	public String getIndirizzoEmail() {
		return indirizzoEmail;
	}
	/**
	 * @param indirizzoEmail the indirizzoEmail to set
	 */
	public void setIndirizzoEmail(String indirizzoEmail) {
		this.indirizzoEmail = indirizzoEmail;
	}
	/**
	 * @return the numTelefono
	 */
	public String getNumTelefono() {
		return numTelefono;
	}
	/**
	 * @param numTelefono the numTelefono to set
	 */
	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
	
	
	
}

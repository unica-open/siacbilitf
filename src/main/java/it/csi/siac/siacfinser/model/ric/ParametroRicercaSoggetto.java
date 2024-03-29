/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Tutti i campi presenti in ParametroRicercaSoggetto non sono obbligatori.
 * 
 * In caso di chiamata da utilizzatore esterno il valore includeModif deve
 * essere uguale a false. Se non settato a false comunque viene istanziato di
 * default a false
 * 
 * @author andrea.colombo
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaSoggetto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5383257096891000012L;

	private String codiceSoggetto;
	private String partitaIva;
	private String codiceFiscale;
	private String codiceFiscaleEstero;
	private String denominazione;
	private String classe;
	private String titoloNaturaGiuridica;
	private String formaGiuridica;
	private String sesso;
	private String comuneNascita;
	private String idStatoSoggetto;
	private String codiceStatoSoggetto;
	private String idNazione;
//	SIAC-6565-CR1215
	private String emailPec;
	//private String codDescrizione;
	private String codDestinatario;

	private String codiceSoggettoPrecedente;
	private String codiceSoggettoSuccessore;

	private boolean includeModif = false;

	// jira-1628 ricerca anche per matricola
	private String matricola;

	public String getCodiceSoggetto() {
		return codiceSoggetto;
	}

	public void setCodiceSoggetto(String codiceSoggetto) {
		this.codiceSoggetto = codiceSoggetto;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}

	public String getTitoloNaturaGiuridica() {
		return titoloNaturaGiuridica;
	}

	public void setTitoloNaturaGiuridica(String titoloNaturaGiuridica) {
		this.titoloNaturaGiuridica = titoloNaturaGiuridica;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getComuneNascita() {
		return comuneNascita;
	}

	public void setComuneNascita(String comuneNascita) {
		this.comuneNascita = comuneNascita;
	}

	public String getCodiceSoggettoPrecedente() {
		return codiceSoggettoPrecedente;
	}

	public void setCodiceSoggettoPrecedente(String codiceSoggettoPrecedente) {
		this.codiceSoggettoPrecedente = codiceSoggettoPrecedente;
	}

	public String getCodiceSoggettoSuccessore() {
		return codiceSoggettoSuccessore;
	}

	public void setCodiceSoggettoSuccessore(String codiceSoggettoSuccessore) {
		this.codiceSoggettoSuccessore = codiceSoggettoSuccessore;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getIdStatoSoggetto() {
		return idStatoSoggetto;
	}

	public void setIdStatoSoggetto(String idStatoSoggetto) {
		this.idStatoSoggetto = idStatoSoggetto;
	}

	public String getFormaGiuridica() {
		return formaGiuridica;
	}

	public void setFormaGiuridica(String naturaGiuridica) {
		this.formaGiuridica = naturaGiuridica;
	}

	public String getIdNazione() {
		return idNazione;
	}

	public void setIdNazione(String idNazione) {
		this.idNazione = idNazione;
	}

	public boolean isIncludeModif() {
		return includeModif;
	}

	public void setIncludeModif(boolean includeModif) {
		this.includeModif = includeModif;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getCodiceFiscaleEstero() {
		return codiceFiscaleEstero;
	}

	public void setCodiceFiscaleEstero(String codiceFiscaleEstero) {
		this.codiceFiscaleEstero = codiceFiscaleEstero;
	}

	public String getEmailPec() {
		return emailPec;
	}

	public void setEmailPec(String emailPec) {
		this.emailPec = emailPec;
	}

	public String getCodDestinatario() {
		return codDestinatario;
	}

	public void setCodDestinatario(String codDestinatario) {
		this.codDestinatario = codDestinatario;
	}

	public String getCodiceStatoSoggetto() {
		return codiceStatoSoggetto;
	}

	public void setCodiceStatoSoggetto(String codiceStatoSoggetto) {
		this.codiceStatoSoggetto = codiceStatoSoggetto;
	}

}

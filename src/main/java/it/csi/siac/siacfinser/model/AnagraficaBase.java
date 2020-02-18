/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

/**
 * AnagraficaBase
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public abstract class AnagraficaBase extends Entita {

	private static final long serialVersionUID = 1104301579369482515L;
	private long codice;
	private String indirizzoEmail;
	private String indirizzoPECertificata;
	private String numeroFax;
	private String numeroTelefonoAlternativo;
	private String numeroTelefonoPrincipale;
	private String ragioneSociale;
	private String sitoWeb;

	public long getCodice() {
		return codice;
	}

	public void setCodice(long codice) {
		this.codice = codice;
	}

	public String getIndirizzoEmail() {
		return indirizzoEmail;
	}

	public void setIndirizzoEmail(String indirizzoEmail) {
		this.indirizzoEmail = indirizzoEmail;
	}

	public String getIndirizzoPECertificata() {
		return indirizzoPECertificata;
	}

	public void setIndirizzoPECertificata(String indirizzoPECertificata) {
		this.indirizzoPECertificata = indirizzoPECertificata;
	}

	public String getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(String numeroFax) {
		this.numeroFax = numeroFax;
	}

	public String getNumeroTelefonoAlternativo() {
		return numeroTelefonoAlternativo;
	}

	public void setNumeroTelefonoAlternativo(String numeroTelefonoAlternativo) {
		this.numeroTelefonoAlternativo = numeroTelefonoAlternativo;
	}

	public String getNumeroTelefonoPrincipale() {
		return numeroTelefonoPrincipale;
	}

	public void setNumeroTelefonoPrincipale(String numeroTelefonoPrincipale) {
		this.numeroTelefonoPrincipale = numeroTelefonoPrincipale;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getSitoWeb() {
		return sitoWeb;
	}

	public void setSitoWeb(String sitoWeb) {
		this.sitoWeb = sitoWeb;
	}

}

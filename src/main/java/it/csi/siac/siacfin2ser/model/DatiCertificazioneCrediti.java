/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * Dati Certificazione Crediti.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class DatiCertificazioneCrediti extends EntitaEnte {
	
	private static final long serialVersionUID = 3023836614494572223L;
	
	//siac_r_subdoc_attr
	private String annotazione;
	private String noteCertificazione;
	private String numeroCertificazione;
	private Date dataCertificazione;
	private Boolean flagCertificazione;
	
	/**
	 * @return the annotazione
	 */
	public String getAnnotazione() {
		return annotazione;
	}
	/**
	 * @param annotazione the annotazione to set
	 */
	public void setAnnotazione(String annotazione) {
		this.annotazione = annotazione;
	}
	/**
	 * @return the noteCertificazione
	 */
	public String getNoteCertificazione() {
		return noteCertificazione;
	}
	/**
	 * @param noteCertificazione the noteCertificazione to set
	 */
	public void setNoteCertificazione(String noteCertificazione) {
		this.noteCertificazione = noteCertificazione;
	}
	/**
	 * @return the numeroCertificazione
	 */
	public String getNumeroCertificazione() {
		return numeroCertificazione;
	}
	/**
	 * @param numeroCertificazione the numeroCertificazione to set
	 */
	public void setNumeroCertificazione(String numeroCertificazione) {
		this.numeroCertificazione = numeroCertificazione;
	}
	/**
	 * @return the dataCertificazione
	 */
	public Date getDataCertificazione() {
		return dataCertificazione;
	}
	/**
	 * @param dataCertificazione the dataCertificazione to set
	 */
	public void setDataCertificazione(Date dataCertificazione) {
		this.dataCertificazione = dataCertificazione;
	}
	/**
	 * @return the flagCertificazione
	 */
	public Boolean getFlagCertificazione() {
		return flagCertificazione;
	}
	/**
	 * @param flagCertificazione the flagCertificazione to set
	 */
	public void setFlagCertificazione(Boolean flagCertificazione) {
		this.flagCertificazione = flagCertificazione;
	}

}

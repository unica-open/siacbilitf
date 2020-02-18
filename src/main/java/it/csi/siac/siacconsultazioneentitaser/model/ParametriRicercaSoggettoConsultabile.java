/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Classe di request per la sintetica del soggetto consultabile
 * @author Elisa Chiari
 *
 */
@XmlType(namespace = ConsultazioneEntitaDataDictionary.NAMESPACE)
public class ParametriRicercaSoggettoConsultabile extends ParametriRicercaEntitaConsultabile {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5946493896970502134L;
	
	private String codiceSoggetto;
	private String denominazione;
	private String codiceFiscale;
	private String partitaIVA;
	/**
	 * @return the codiceSoggetto
	 */
	public String getCodiceSoggetto() {
		return codiceSoggetto;
	}
	/**
	 * @param codiceSoggetto the codiceSoggetto to set
	 */
	public void setCodiceSoggetto(String codiceSoggetto) {
		this.codiceSoggetto = codiceSoggetto;
	}
	/**
	 * @return the denominazione
	 */
	public String getDenominazione() {
		return denominazione;
	}
	/**
	 * @param denominazione the denominazione to set
	 */
	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
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
	 * @return the partitaIVA
	 */
	public String getPartitaIVA() {
		return partitaIVA;
	}
	/**
	 * @param partitaIVA the partitaIVA to set
	 */
	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}
	

	
	
}

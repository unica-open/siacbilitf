/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

/**
 * @author 552
 * @version 1.0
 * @created 06-mar-2015 16.27.55
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class VariabiliStampa extends Entita {

	/** per serializzazione */
	private static final long serialVersionUID = -7594549882972172359L;
	
	private String intestazioneDirezione;
	private String intestazioneSettore;
	private String intestazioneUfficio;
	private String intestazioneCitta;
	private CassaEconomale cassaEconomale;
	private StampaRendiconto stampaRendiconto;
	private StampaGiornale stampaGiornale;

	/**
	 * @return the intestazioneDirezione
	 */
	public String getIntestazioneDirezione() {
		return intestazioneDirezione;
	}

	/**
	 * @param intestazioneDirezione the intestazioneDirezione to set
	 */
	public void setIntestazioneDirezione(String intestazioneDirezione) {
		this.intestazioneDirezione = intestazioneDirezione;
	}

	/**
	 * @return the intestazioneSettore
	 */
	public String getIntestazioneSettore() {
		return intestazioneSettore;
	}

	/**
	 * @param intestazioneSettore the intestazioneSettore to set
	 */
	public void setIntestazioneSettore(String intestazioneSettore) {
		this.intestazioneSettore = intestazioneSettore;
	}

	/**
	 * @return the intestazioneUfficio
	 */
	public String getIntestazioneUfficio() {
		return intestazioneUfficio;
	}

	/**
	 * @param intestazioneUfficio the intestazioneUfficio to set
	 */
	public void setIntestazioneUfficio(String intestazioneUfficio) {
		this.intestazioneUfficio = intestazioneUfficio;
	}

	/**
	 * @return the intestazioneCitta
	 */
	public String getIntestazioneCitta() {
		return intestazioneCitta;
	}

	/**
	 * @param intestazioneCitta the intestazioneCitta to set
	 */
	public void setIntestazioneCitta(String intestazioneCitta) {
		this.intestazioneCitta = intestazioneCitta;
	}

	/**
	 * @return the cassaEconomale
	 */
	public CassaEconomale getCassaEconomale() {
		return cassaEconomale;
	}

	/**
	 * @param cassaEconomale the cassaEconomale to set
	 */
	public void setCassaEconomale(CassaEconomale cassaEconomale) {
		this.cassaEconomale = cassaEconomale;
	}

	/**
	 * @return the stampaRendiconto
	 */
	public StampaRendiconto getStampaRendiconto() {
		return stampaRendiconto;
	}

	/**
	 * @param stampaRendiconto the stampaRendiconto to set
	 */
	public void setStampaRendiconto(StampaRendiconto stampaRendiconto) {
		this.stampaRendiconto = stampaRendiconto;
	}

	/**
	 * @return the stampaGiornale
	 */
	public StampaGiornale getStampaGiornale() {
		return stampaGiornale;
	}

	/**
	 * @param stampaGiornale the stampaGiornale to set
	 */
	public void setStampaGiornale(StampaGiornale stampaGiornale) {
		this.stampaGiornale = stampaGiornale;
	}

}
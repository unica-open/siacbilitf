/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.CassaEconomale;
import it.csi.siac.siaccecser.model.TipoStampa;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class VerificaStampaRendicontoCassa extends ServiceRequest {
	
	private CassaEconomale cassaEconomale;
	private Date periodoDaRendicontareDataInizio;
	private Date periodoDaRendicontareDataFine;
	
	// BOZZA/DEFINITIVA
	private TipoStampa tipoStampa;
	private Bilancio bilancio;
	
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
	 * @return the periodoDaRendicontareDataInizio
	 */
	public Date getPeriodoDaRendicontareDataInizio() {
		return periodoDaRendicontareDataInizio;
	}

	/**
	 * @param periodoDaRendicontareDataInizio the periodoDaRendicontareDataInizio to set
	 */
	public void setPeriodoDaRendicontareDataInizio(Date periodoDaRendicontareDataInizio) {
		this.periodoDaRendicontareDataInizio = periodoDaRendicontareDataInizio;
	}

	/**
	 * @return the periodoDaRendicontareDataFine
	 */
	public Date getPeriodoDaRendicontareDataFine() {
		return periodoDaRendicontareDataFine;
	}

	/**
	 * @param periodoDaRendicontareDataFine the periodoDaRendicontareDataFine to set
	 */
	public void setPeriodoDaRendicontareDataFine(Date periodoDaRendicontareDataFine) {
		this.periodoDaRendicontareDataFine = periodoDaRendicontareDataFine;
	}

	/**
	 * @return the tipoStampa
	 */
	public TipoStampa getTipoStampa() {
		return tipoStampa;
	}

	/**
	 * @param tipoStampa the tipoStampa to set
	 */
	public void setTipoStampa(TipoStampa tipoStampa) {
		this.tipoStampa = tipoStampa;
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

}

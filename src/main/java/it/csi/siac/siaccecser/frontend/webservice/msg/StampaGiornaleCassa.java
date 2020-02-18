/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.CassaEconomale;
import it.csi.siac.siaccecser.model.TipoStampa;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ReportServiceRequest;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class StampaGiornaleCassa  extends ReportServiceRequest{

	private CassaEconomale cassaEconomale;
	//input data da elaborare
	private Date dataStampaGiornale;
	//BOZZA/DEFINITIVA
	private TipoStampa tipoStampa;
	private Bilancio bilancio;
	
	private Boolean proseguiCEC_INF_0017 = Boolean.FALSE;
	
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
	 * @return the dataStampaGiornale
	 */
	public Date getDataStampaGiornale() {
		return dataStampaGiornale;
	}

	/**
	 * @param dataStampaGiornale the dataStampaGiornale to set
	 */
	public void setDataStampaGiornale(Date dataStampaGiornale) {
		this.dataStampaGiornale = dataStampaGiornale;
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

	/**
	 * @return the proseguiCEC_INF_0017
	 */
	public Boolean getProseguiCEC_INF_0017() {
		return proseguiCEC_INF_0017;
	}

	/**
	 * @param proseguiCEC_INF_0017 the proseguiCEC_INF_0017 to set
	 */
	public void setProseguiCEC_INF_0017(Boolean proseguiCEC_INF_0017) {
		this.proseguiCEC_INF_0017 = proseguiCEC_INF_0017 != null ? proseguiCEC_INF_0017 : Boolean.FALSE;
	}

	
	
	
}

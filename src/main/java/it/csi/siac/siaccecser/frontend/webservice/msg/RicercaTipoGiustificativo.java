/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.CassaEconomale;
import it.csi.siac.siaccecser.model.TipologiaGiustificativo;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaTipoGiustificativo extends ServiceRequest {
	
	private TipologiaGiustificativo tipologiaGiustificativo;
	private CassaEconomale cassaEconomale;

	/**
	 * @return the tipologiaGiustificativo
	 */
	public TipologiaGiustificativo getTipologiaGiustificativo() {
		return tipologiaGiustificativo;
	}

	/**
	 * @param tipologiaGiustificativo the tipologiaGiustificativo to set
	 */
	public void setTipologiaGiustificativo(TipologiaGiustificativo tipologiaGiustificativo) {
		this.tipologiaGiustificativo = tipologiaGiustificativo;
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
	
}

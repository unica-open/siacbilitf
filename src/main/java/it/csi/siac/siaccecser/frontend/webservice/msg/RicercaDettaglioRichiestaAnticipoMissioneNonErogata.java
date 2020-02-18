/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.CassaEconomale;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaDettaglioRichiestaAnticipoMissioneNonErogata extends ServiceRequest {

	private CassaEconomale cassaEconomale;
	private String idMissioneEsterna;

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
	 * @return the idMissioneEsterna
	 */
	public String getIdMissioneEsterna() {
		return idMissioneEsterna;
	}

	/**
	 * @param idMissioneEsterna the idMissioneEsterna to set
	 */
	public void setIdMissioneEsterna(String idMissioneEsterna) {
		this.idMissioneEsterna = idMissioneEsterna;
	}

}

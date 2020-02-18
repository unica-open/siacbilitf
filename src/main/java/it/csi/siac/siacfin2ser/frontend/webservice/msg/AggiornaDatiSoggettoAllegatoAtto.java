/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DatiSoggettoAllegato;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaDatiSoggettoAllegatoAtto extends ServiceRequest {
	
	private DatiSoggettoAllegato datiSoggettoAllegato;

	/**
	 * @return the datiSoggettoAllegato
	 */
	public DatiSoggettoAllegato getDatiSoggettoAllegato() {
		return datiSoggettoAllegato;
	}

	/**
	 * @param datiSoggettoAllegato the datiSoggettoAllegato to set
	 */
	public void setDatiSoggettoAllegato(DatiSoggettoAllegato datiSoggettoAllegato) {
		this.datiSoggettoAllegato = datiSoggettoAllegato;
	}
	
	
	
}

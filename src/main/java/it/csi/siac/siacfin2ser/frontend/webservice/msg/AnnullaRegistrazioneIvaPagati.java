/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.Ordinativo;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AnnullaRegistrazioneIvaPagati extends ServiceRequest {
	
	private Ordinativo ordinativo;

	/**
	 * @return the ordinativo
	 */
	public Ordinativo getOrdinativo() {
		return ordinativo;
	}

	/**
	 * @param ordinativo the ordinativo to set
	 */
	public void setOrdinativo(Ordinativo ordinativo) {
		this.ordinativo = ordinativo;
	}
	
}

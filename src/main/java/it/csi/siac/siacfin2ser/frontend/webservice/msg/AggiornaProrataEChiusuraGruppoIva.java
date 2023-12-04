/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ProRataEChiusuraGruppoIva;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaProrataEChiusuraGruppoIva extends ServiceRequest {
	
	private ProRataEChiusuraGruppoIva proRataEChiusuraGruppoIva ;

	/**
	 * @return the proRataEChiusuraGruppoIva
	 */
	public ProRataEChiusuraGruppoIva getProRataEChiusuraGruppoIva() {
		return proRataEChiusuraGruppoIva;
	}

	/**
	 * @param proRataEChiusuraGruppoIva the proRataEChiusuraGruppoIva to set
	 */
	public void setProRataEChiusuraGruppoIva(
			ProRataEChiusuraGruppoIva proRataEChiusuraGruppoIva) {
		this.proRataEChiusuraGruppoIva = proRataEChiusuraGruppoIva;
	}
	
	
	
	
	
	

}

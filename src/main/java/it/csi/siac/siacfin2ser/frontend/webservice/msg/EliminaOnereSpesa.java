/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DettaglioOnere;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EliminaOnereSpesa extends ServiceRequest {

	private DettaglioOnere dettaglioOnere;

	/**
	 * @return the dettaglioOnere
	 */
	public DettaglioOnere getDettaglioOnere() {
		return dettaglioOnere;
	}

	/**
	 * @param dettaglioOnere the dettaglioOnere to set
	 */
	public void setDettaglioOnere(DettaglioOnere dettaglioOnere) {
		this.dettaglioOnere = dettaglioOnere;
	}
	
	
	
	
}

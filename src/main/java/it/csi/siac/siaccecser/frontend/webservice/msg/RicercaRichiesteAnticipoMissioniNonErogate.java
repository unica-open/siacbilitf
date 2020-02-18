/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaRichiesteAnticipoMissioniNonErogate extends ServiceRequest {
	
	//di default non carico i giustificativi.
	private boolean caricaDettaglioGiustificativi = false;

	/**
	 * @return the caricaDettaglioGiustificativi
	 */
	public boolean isCaricaDettaglioGiustificativi() {
		return caricaDettaglioGiustificativi;
	}

	/**
	 * Impostare a true se si vuole caricare il dettalgio dei giustificativi associati alle richieste.
	 * @param caricaDettaglioGiustificativi the caricaDettaglioGiustificativi to set
	 */
	public void setCaricaDettaglioGiustificativi(boolean caricaDettaglioGiustificativi) {
		this.caricaDettaglioGiustificativi = caricaDettaglioGiustificativi;
	}
	
	

}

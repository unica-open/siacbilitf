/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * @author Pro Logic
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioAnagraficaVariazioneBilancio extends ServiceRequest {
	
	private int uidVariazione;

	/**
	 * @return the uidVariazione
	 */
	public int getUidVariazione() {
		return uidVariazione;
	}

	public void setUidVariazione(int uidVariazione) {
		this.uidVariazione = uidVariazione;
	}
		

}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.azione;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.Azione;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaAzionePerChiave extends ServiceRequest {
	
	private Azione azione;

	/**
	 * @return the azione
	 */
	public Azione getAzione() {
		return azione;
	}

	/**
	 * @param azione the azione to set
	 */
	public void setAzione(Azione azione) {
		this.azione = azione;
	}

}

/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.StornoUEB;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;


/** @deprecated da eliminare con le UEB */
@Deprecated
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceStornoUEB extends ServiceRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	
	private StornoUEB stornoUEB;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public StornoUEB getStornoUEB() {
		return stornoUEB;
	}

	public void setStornoUEB(StornoUEB stornoUEB) {
		this.stornoUEB = stornoUEB;
	}

	
	

}

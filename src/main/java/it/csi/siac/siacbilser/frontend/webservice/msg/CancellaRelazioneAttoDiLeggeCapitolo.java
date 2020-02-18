/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacbilser.model.AttoDiLeggeCapitolo;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class CancellaRelazioneAttoDiLeggeCapitolo extends ServiceRequest {
	
	private Ente ente;
	
	private AttoDiLeggeCapitolo attoDiLeggeCapitolo;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public AttoDiLeggeCapitolo getAttoDiLeggeCapitolo() {
		return attoDiLeggeCapitolo;
	}

	public void setAttoDiLeggeCapitolo(AttoDiLeggeCapitolo attoDiLeggeCapitolo) {
		this.attoDiLeggeCapitolo = attoDiLeggeCapitolo;
	}
	
}

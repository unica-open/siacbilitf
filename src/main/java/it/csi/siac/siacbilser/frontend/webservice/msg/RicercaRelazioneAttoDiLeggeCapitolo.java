/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaAttiDiLeggeCapitolo;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaRelazioneAttoDiLeggeCapitolo extends ServiceRequest {
	
	private Ente ente;
	
	private RicercaAttiDiLeggeCapitolo ricercaAttiDiLeggeCapitolo;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaAttiDiLeggeCapitolo getRicercaAttiDiLeggeCapitolo() {
		return ricercaAttiDiLeggeCapitolo;
	}

	public void setRicercaAttiDiLeggeCapitolo(
			RicercaAttiDiLeggeCapitolo ricercaAttiDiLeggeCapitolo) {
		this.ricercaAttiDiLeggeCapitolo = ricercaAttiDiLeggeCapitolo;
	}
}

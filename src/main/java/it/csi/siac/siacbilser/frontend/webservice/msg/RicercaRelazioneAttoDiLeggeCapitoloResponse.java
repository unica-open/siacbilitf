/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.AttoDiLegge;
import it.csi.siac.siacbilser.model.AttoDiLeggeCapitolo;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaRelazioneAttoDiLeggeCapitoloResponse extends ServiceResponse {
	
	private Ente ente;
	
	private List<AttoDiLeggeCapitolo> elencoAttiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
	
	private AttoDiLegge attoDiLegge;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public List<AttoDiLeggeCapitolo> getElencoAttiLeggeCapitolo() {
		return elencoAttiLeggeCapitolo;
	}

	public void setElencoAttiLeggeCapitolo(List<AttoDiLeggeCapitolo> elencoAttiLeggeCapitolo) {
		this.elencoAttiLeggeCapitolo = elencoAttiLeggeCapitolo != null ? elencoAttiLeggeCapitolo : new ArrayList<AttoDiLeggeCapitolo>();
	}

	public AttoDiLegge getAttoDiLegge() {
		return attoDiLegge;
	}

	public void setAttoDiLegge(AttoDiLegge attoDiLegge) {
		this.attoDiLegge = attoDiLegge;
	}
}

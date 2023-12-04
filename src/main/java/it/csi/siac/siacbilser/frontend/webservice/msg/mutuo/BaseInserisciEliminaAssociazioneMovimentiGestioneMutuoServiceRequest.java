/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class BaseInserisciEliminaAssociazioneMovimentiGestioneMutuoServiceRequest extends BaseMutuoServiceRequest {
	private List<Integer> elencoIdMovimentiGestione;

	public List<Integer> getElencoIdMovimentiGestione() {
		return elencoIdMovimentiGestione;
	}

	public void setElencoIdMovimentiGestione(List<Integer> elencoIdMovimentiGestione) {
		this.elencoIdMovimentiGestione = elencoIdMovimentiGestione;
	}
}

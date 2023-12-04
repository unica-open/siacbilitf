/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class BaseInserisciEliminaAssociazioneProgettiMutuoServiceRequest extends BaseMutuoServiceRequest {
	private List<Integer> elencoIdProgetti;

	public List<Integer> getElencoIdProgetti() {
		return elencoIdProgetti;
	}

	public void setElencoIdProgetti(List<Integer> elencoIdProgetti) {
		this.elencoIdProgetti = elencoIdProgetti;
	}

}

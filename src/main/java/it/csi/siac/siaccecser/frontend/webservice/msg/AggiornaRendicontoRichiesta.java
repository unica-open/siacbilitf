/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.RendicontoRichiesta;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class AggiornaRendicontoRichiesta extends ServiceRequest {
	
	private RendicontoRichiesta rendicontoRichiesta;

	public RendicontoRichiesta getRendicontoRichiesta() {
		return rendicontoRichiesta;
	}

	public void setRendicontoRichiesta(RendicontoRichiesta rendicontoRichiesta) {
		this.rendicontoRichiesta = rendicontoRichiesta;
	}

	

}

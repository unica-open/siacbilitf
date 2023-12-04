/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.StatoMutuo;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaPianoAmmortamentoMutuo extends BaseMutuoServiceRequest {
	private StatoMutuo statoMutuo;

	public StatoMutuo getStatoMutuo() {
		return statoMutuo;
	}

	public void setStatoMutuo(StatoMutuo statoMutuo) {
		this.statoMutuo = statoMutuo;
	}
	
}

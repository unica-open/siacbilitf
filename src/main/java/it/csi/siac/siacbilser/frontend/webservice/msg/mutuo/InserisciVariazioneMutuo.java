/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.VariazioneMutuo;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisciVariazioneMutuo extends BaseMutuoServiceRequest {
	private VariazioneMutuo variazioneMutuo;

	public VariazioneMutuo getVariazioneMutuo() {
		return variazioneMutuo;
	}

	public void setVariazioneMutuo(VariazioneMutuo variazioneMutuo) {
		this.variazioneMutuo = variazioneMutuo;
	}
	
}

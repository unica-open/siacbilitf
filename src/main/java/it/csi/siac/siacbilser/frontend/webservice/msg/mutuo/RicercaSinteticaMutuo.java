/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.MutuoModelDetail;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaMutuo extends BaseRicercaMutuoServiceRequest {
	
	private ParametriPaginazione parametriPaginazione;

	public RicercaSinteticaMutuo() {
		super();
		setMutuoModelDetails(MutuoModelDetail.Sintetico);
	}

	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

}
